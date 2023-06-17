/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class brp
extends mn {
    @Override
    public String a() {
        return "clear";
    }

    @Override
    public String a(ala ala2) {
        return "commands.clear.usage";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        czt czt2 = arrstring.length == 0 ? brp.b(ala2) : brp.a(a2, ala2, arrstring[0]);
        azg azg2 = arrstring.length >= 2 ? brp.a(ala2, arrstring[1]) : null;
        int n2 = arrstring.length >= 3 ? brp.a(arrstring[2], -1) : -1;
        int n3 = arrstring.length >= 4 ? brp.a(arrstring[3], -1) : -1;
        bvp bvp2 = null;
        if (arrstring.length >= 5) {
            try {
                bvp2 = bdg.a(brp.b(arrstring, 4));
            }
            catch (aoo aoo2) {
                throw new kx("commands.clear.tagError", aoo2.getMessage());
            }
        }
        if (arrstring.length >= 2 && azg2 == null) {
            throw new kx("commands.clear.failure", czt2.i_());
        }
        int n4 = czt2.n.a(azg2, n2, n3, bvp2);
        czt2.o.a();
        if (!czt2.G.d) {
            czt2.bO();
        }
        ala2.a(bnw.d, n4);
        if (n4 == 0) {
            throw new kx("commands.clear.failure", czt2.i_());
        }
        if (n3 == 0) {
            ala2.a(new du("commands.clear.testing", czt2.i_(), n4));
        } else {
            brp.a(ala2, (fh)this, "commands.clear.success", czt2.i_(), n4);
        }
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return brp.a(arrstring, a2.J());
        }
        if (arrstring.length == 2) {
            return brp.a(arrstring, azg.g.c());
        }
        return Collections.emptyList();
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}

