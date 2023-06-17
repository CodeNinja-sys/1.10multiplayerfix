/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class chr
extends mn {
    @Override
    public String a() {
        return "execute";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.execute.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        Object object;
        if (arrstring.length < 5) {
            throw new ben("commands.execute.usage", new Object[0]);
        }
        cpk cpk2 = chr.a(a2, ala2, arrstring[0], cpk.class);
        double d2 = chr.b(cpk2.aU, arrstring[1], false);
        double d3 = chr.b(cpk2.aV, arrstring[2], false);
        double d4 = chr.b(cpk2.aW, arrstring[3], false);
        cmz cmz2 = new cmz(d2, d3, d4);
        int n2 = 4;
        if ("detect".equals(arrstring[4]) && arrstring.length > 10) {
            object = cpk2.m_();
            double d5 = chr.b(d2, arrstring[5], false);
            double d6 = chr.b(d3, arrstring[6], false);
            double d7 = chr.b(d4, arrstring[7], false);
            bfa bfa2 = chr.b(ala2, arrstring[8]);
            int n3 = chr.a(arrstring[9], -1, 15);
            cmz cmz3 = new cmz(d5, d6, d7);
            if (!((iu)object).d(cmz3)) {
                throw new kx("commands.execute.failed", "detect", cpk2.i_());
            }
            dbk dbk2 = ((iu)object).n(cmz3);
            if (dbk2.t() != bfa2 || n3 >= 0 && dbk2.t().e(dbk2) != n3) {
                throw new kx("commands.execute.failed", "detect", cpk2.i_());
            }
            n2 = 10;
        }
        object = chr.b(arrstring, n2);
        dea dea2 = new dea(this, cpk2, ala2, cmz2, d2, d3, d4, a2);
        m m2 = a2.N();
        try {
            int n4 = m2.a(dea2, (String)object);
            if (n4 < 1) {
                throw new kx("commands.execute.allInvocationsFailed", object);
            }
        }
        catch (Throwable throwable) {
            throw new kx("commands.execute.failed", object, cpk2.i_());
        }
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return chr.a(arrstring, a2.J());
        }
        if (arrstring.length > 1 && arrstring.length <= 4) {
            return chr.a(arrstring, 1, cmz2);
        }
        if (arrstring.length > 5 && arrstring.length <= 8 && "detect".equals(arrstring[4])) {
            return chr.a(arrstring, 5, cmz2);
        }
        if (arrstring.length == 9 && "detect".equals(arrstring[4])) {
            return chr.a(arrstring, bfa.v.c());
        }
        return Collections.emptyList();
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}

