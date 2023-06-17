/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class o
extends mn {
    @Override
    public String a() {
        return "spawnpoint";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.spawnpoint.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        cmz cmz2;
        if (arrstring.length > 1 && arrstring.length < 4) {
            throw new ben("commands.spawnpoint.usage", new Object[0]);
        }
        czt czt2 = arrstring.length > 0 ? o.a(a2, ala2, arrstring[0]) : o.b(ala2);
        cmz cmz3 = cmz2 = arrstring.length > 3 ? o.a(ala2, arrstring, 1, true) : czt2.k_();
        if (czt2.aQ != null) {
            czt2.a(cmz2, true);
            o.a(ala2, (fh)this, "commands.spawnpoint.success", czt2.i_(), cmz2.a(), cmz2.b(), cmz2.c());
        }
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return o.a(arrstring, a2.J());
        }
        if (arrstring.length > 1 && arrstring.length <= 4) {
            return o.a(arrstring, 1, cmz2);
        }
        return Collections.emptyList();
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}

