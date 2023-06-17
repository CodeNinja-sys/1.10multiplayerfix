/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class awj
extends mn {
    @Override
    public String a() {
        return "give";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.give.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        boolean bl2;
        if (arrstring.length < 2) {
            throw new ben("commands.give.usage", new Object[0]);
        }
        czt czt2 = awj.a(a2, ala2, arrstring[0]);
        azg azg2 = awj.a(ala2, arrstring[1]);
        int n2 = arrstring.length >= 3 ? awj.a(arrstring[2], 1, 64) : 1;
        int n3 = arrstring.length >= 4 ? awj.a(arrstring[3]) : 0;
        bhl bhl2 = new bhl(azg2, n2, n3);
        if (arrstring.length >= 5) {
            String string = awj.a(ala2, arrstring, 4).i();
            try {
                bhl2.d(bdg.a(string));
            }
            catch (aoo aoo2) {
                throw new kx("commands.give.tagError", aoo2.getMessage());
            }
        }
        if (bl2 = czt2.n.c(bhl2)) {
            czt2.aQ.a(null, czt2.aU, czt2.aV, czt2.aW, dah.da, csg.h, 0.2f, ((czt2.aW().nextFloat() - czt2.aW().nextFloat()) * 0.7f + 1.0f) * 2.0f);
            czt2.o.a();
        }
        if (!bl2 || bhl2.b > 0) {
            ala2.a(bnw.d, n2 - bhl2.b);
            er er2 = czt2.a(bhl2, false);
            if (er2 != null) {
                er2.m();
                er2.a(czt2.i_());
            }
        } else {
            bhl2.b = 1;
            ala2.a(bnw.d, n2);
            er er3 = czt2.a(bhl2, false);
            if (er3 != null) {
                er3.q();
            }
        }
        awj.a(ala2, (fh)this, "commands.give.success", bhl2.B(), n2, czt2.i_());
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return awj.a(arrstring, a2.J());
        }
        if (arrstring.length == 2) {
            return awj.a(arrstring, azg.g.c());
        }
        return Collections.emptyList();
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}

