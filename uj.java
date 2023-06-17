/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.aa;
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class uj
extends mn {
    private static final d a = c.c();

    @Override
    public String a() {
        return "title";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.title.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        cbg cbg2;
        if (arrstring.length < 2) {
            throw new ben("commands.title.usage", new Object[0]);
        }
        if (arrstring.length < 3) {
            if ("title".equals(arrstring[1]) || "subtitle".equals(arrstring[1])) {
                throw new ben("commands.title.usage.title", new Object[0]);
            }
            if ("times".equals(arrstring[1])) {
                throw new ben("commands.title.usage.times", new Object[0]);
            }
        }
        czt czt2 = uj.a(a2, ala2, arrstring[0]);
        hg hg2 = hg.a(arrstring[1]);
        if (hg2 == hg.d || hg2 == hg.e) {
            if (arrstring.length != 2) {
                throw new ben("commands.title.usage", new Object[0]);
            }
            cha cha2 = new cha(hg2, null);
            czt2.a.a(cha2);
            uj.a(ala2, (fh)this, "commands.title.success", new Object[0]);
            return;
        }
        if (hg2 == hg.c) {
            if (arrstring.length != 5) {
                throw new ben("commands.title.usage", new Object[0]);
            }
            int n2 = uj.a(arrstring[2]);
            int n3 = uj.a(arrstring[3]);
            int n4 = uj.a(arrstring[4]);
            cha cha3 = new cha(n2, n3, n4);
            czt2.a.a(cha3);
            uj.a(ala2, (fh)this, "commands.title.success", new Object[0]);
            return;
        }
        if (arrstring.length < 3) {
            throw new ben("commands.title.usage", new Object[0]);
        }
        String string = uj.b(arrstring, 2);
        try {
            cbg2 = zf.a(string);
        }
        catch (aa aa2) {
            throw uj.a(aa2);
        }
        cha cha4 = new cha(hg2, apa.a(ala2, cbg2, czt2));
        czt2.a.a(cha4);
        uj.a(ala2, (fh)this, "commands.title.success", new Object[0]);
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return uj.a(arrstring, a2.J());
        }
        if (arrstring.length == 2) {
            return uj.a(arrstring, hg.a());
        }
        return Collections.emptyList();
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}

