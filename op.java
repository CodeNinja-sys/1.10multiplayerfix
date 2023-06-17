/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.aa;
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class op
extends mn {
    @Override
    public String a() {
        return "tellraw";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.tellraw.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length < 2) {
            throw new ben("commands.tellraw.usage", new Object[0]);
        }
        czt czt2 = op.a(a2, ala2, arrstring[0]);
        String string = op.b(arrstring, 1);
        try {
            cbg cbg2 = zf.a(string);
            ((cpk)czt2).a(apa.a(ala2, cbg2, czt2));
        }
        catch (aa aa2) {
            throw op.a(aa2);
        }
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return op.a(arrstring, a2.J());
        }
        return Collections.emptyList();
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}

