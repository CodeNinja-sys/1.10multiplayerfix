/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import net.minecraft.c.a;

public class bim
extends mn {
    @Override
    public String a() {
        return "tp";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.tp.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        cpk cpk2;
        if (arrstring.length < 1) {
            throw new ben("commands.tp.usage", new Object[0]);
        }
        int n2 = 0;
        if (arrstring.length == 2 || arrstring.length == 4 || arrstring.length == 6) {
            cpk2 = bim.b(a2, ala2, arrstring[0]);
            n2 = 1;
        } else {
            cpk2 = bim.b(ala2);
        }
        if (arrstring.length == 1 || arrstring.length == 2) {
            cpk cpk3 = bim.b(a2, ala2, arrstring[arrstring.length - 1]);
            if (cpk3.aQ != cpk2.aQ) {
                throw new kx("commands.tp.notSameDimension", new Object[0]);
            }
            cpk2.s_();
            if (cpk2 instanceof czt) {
                ((czt)cpk2).a.a(cpk3.aU, cpk3.aV, cpk3.aW, cpk3.ba, cpk3.bb);
            } else {
                cpk2.a_(cpk3.aU, cpk3.aV, cpk3.aW, cpk3.ba, cpk3.bb);
            }
            bim.a(ala2, (fh)this, "commands.tp.success", cpk2.i_(), cpk3.i_());
            return;
        }
        if (arrstring.length < n2 + 3) {
            throw new ben("commands.tp.usage", new Object[0]);
        }
        if (cpk2.aQ == null) {
            return;
        }
        int n3 = n2;
        int n4 = 4096;
        gg gg2 = bim.a(cpk2.aU, arrstring[n3++], true);
        gg gg3 = bim.a(cpk2.aV, arrstring[n3++], -4096, 4096, false);
        gg gg4 = bim.a(cpk2.aW, arrstring[n3++], true);
        gg gg5 = bim.a(cpk2.ba, arrstring.length > n3 ? arrstring[n3++] : "~", false);
        gg gg6 = bim.a(cpk2.bb, arrstring.length > n3 ? arrstring[n3] : "~", false);
        bim.a(cpk2, gg2, gg3, gg4, gg5, gg6);
        bim.a(ala2, (fh)this, "commands.tp.success.coordinates", cpk2.i_(), gg2.a(), gg3.a(), gg4.a());
    }

    private static void a(cpk cpk2, gg gg2, gg gg3, gg gg4, gg gg5, gg gg6) {
        if (cpk2 instanceof czt) {
            EnumSet<bgf> enumSet = EnumSet.noneOf(bgf.class);
            if (gg2.c()) {
                enumSet.add(bgf.a);
            }
            if (gg3.c()) {
                enumSet.add(bgf.b);
            }
            if (gg4.c()) {
                enumSet.add(bgf.c);
            }
            if (gg6.c()) {
                enumSet.add(bgf.e);
            }
            if (gg5.c()) {
                enumSet.add(bgf.d);
            }
            float f2 = (float)gg5.b();
            if (!gg5.c()) {
                f2 = cmk.g(f2);
            }
            float f3 = (float)gg6.b();
            if (!gg6.c()) {
                f3 = cmk.g(f3);
            }
            cpk2.s_();
            ((czt)cpk2).a.a(gg2.b(), gg3.b(), gg4.b(), f2, f3, enumSet);
            cpk2.n(f2);
        } else {
            float f4 = (float)cmk.g(gg5.a());
            float f5 = (float)cmk.g(gg6.a());
            f5 = cmk.a(f5, -90.0f, 90.0f);
            cpk2.a_(gg2.a(), gg3.a(), gg4.a(), f4, f5);
            cpk2.n(f4);
        }
        if (!(cpk2 instanceof bga) || !((bga)cpk2).bL()) {
            cpk2.aY = 0.0;
            cpk2.be = true;
        }
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1 || arrstring.length == 2) {
            return bim.a(arrstring, a2.J());
        }
        return Collections.emptyList();
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}

