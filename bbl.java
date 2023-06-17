/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import net.minecraft.c.a;

public class bbl
extends mn {
    @Override
    public String a() {
        return "teleport";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.teleport.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length < 4) {
            throw new ben("commands.teleport.usage", new Object[0]);
        }
        cpk cpk2 = bbl.b(a2, ala2, arrstring[0]);
        if (cpk2.aQ == null) {
            return;
        }
        int n2 = 4096;
        amj amj2 = ala2.l_();
        int n3 = 1;
        gg gg2 = bbl.a(amj2.b, arrstring[n3++], true);
        gg gg3 = bbl.a(amj2.c, arrstring[n3++], -4096, 4096, false);
        gg gg4 = bbl.a(amj2.d, arrstring[n3++], true);
        cpk cpk3 = ala2.n_() == null ? cpk2 : ala2.n_();
        gg gg5 = bbl.a(arrstring.length > n3 ? (double)cpk3.ba : (double)cpk2.ba, arrstring.length > n3 ? arrstring[n3] : "~", false);
        gg gg6 = bbl.a(arrstring.length > ++n3 ? (double)cpk3.bb : (double)cpk2.bb, arrstring.length > n3 ? arrstring[n3] : "~", false);
        bbl.a(cpk2, gg2, gg3, gg4, gg5, gg6);
        bbl.a(ala2, (fh)this, "commands.teleport.success.coordinates", cpk2.i_(), gg2.a(), gg3.a(), gg4.a());
    }

    private static void a(cpk cpk2, gg gg2, gg gg3, gg gg4, gg gg5, gg gg6) {
        if (cpk2 instanceof czt) {
            EnumSet<bgf> enumSet = EnumSet.noneOf(bgf.class);
            float f2 = (float)gg5.b();
            if (gg5.c()) {
                enumSet.add(bgf.d);
            } else {
                f2 = cmk.g(f2);
            }
            float f3 = (float)gg6.b();
            if (gg6.c()) {
                enumSet.add(bgf.e);
            } else {
                f3 = cmk.g(f3);
            }
            cpk2.s_();
            ((czt)cpk2).a.a(gg2.a(), gg3.a(), gg4.a(), f2, f3, enumSet);
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
        if (arrstring.length == 1) {
            return bbl.a(arrstring, a2.J());
        }
        if (arrstring.length > 1 && arrstring.length <= 4) {
            return bbl.a(arrstring, 1, cmz2);
        }
        return Collections.emptyList();
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}

