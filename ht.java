/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class ht
extends mn {
    @Override
    public String a() {
        return "setblock";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.setblock.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        bql bql2;
        dbk dbk2;
        Object object;
        iu iu2;
        if (arrstring.length < 4) {
            throw new ben("commands.setblock.usage", new Object[0]);
        }
        ala2.a(bnw.b, 0);
        cmz cmz2 = ht.a(ala2, arrstring, 0, false);
        bfa bfa2 = mn.b(ala2, arrstring[3]);
        int n2 = 0;
        if (arrstring.length >= 5) {
            n2 = ht.a(arrstring[4], 0, 15);
        }
        if (!(iu2 = ala2.m_()).d(cmz2)) {
            throw new kx("commands.setblock.outOfWorld", new Object[0]);
        }
        bvp bvp2 = new bvp();
        boolean bl2 = false;
        if (arrstring.length >= 7 && bfa2.l()) {
            object = ht.a(ala2, arrstring, 6).i();
            try {
                bvp2 = bdg.a((String)object);
                bl2 = true;
            }
            catch (aoo aoo2) {
                throw new kx("commands.setblock.tagError", aoo2.getMessage());
            }
        }
        if (arrstring.length >= 6) {
            if ("destroy".equals(arrstring[5])) {
                iu2.b(cmz2, true);
                if (bfa2 == blg.a) {
                    ht.a(ala2, (fh)this, "commands.setblock.success", new Object[0]);
                    return;
                }
            } else if ("keep".equals(arrstring[5]) && !iu2.c(cmz2)) {
                throw new kx("commands.setblock.noChange", new Object[0]);
            }
        }
        if ((object = iu2.q(cmz2)) != null) {
            if (object instanceof tb) {
                ((tb)object).g();
            }
            iu2.a(cmz2, blg.a.s(), bfa2 == blg.a ? 2 : 4);
        }
        if (!iu2.a(cmz2, dbk2 = bfa2.a(n2), 2)) {
            throw new kx("commands.setblock.noChange", new Object[0]);
        }
        if (bl2 && (bql2 = iu2.q(cmz2)) != null) {
            bvp2.a("x", cmz2.a());
            bvp2.a("y", cmz2.b());
            bvp2.a("z", cmz2.c());
            bql2.a(bvp2);
        }
        iu2.a(cmz2, dbk2.t());
        ala2.a(bnw.b, 1);
        ht.a(ala2, (fh)this, "commands.setblock.success", new Object[0]);
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length > 0 && arrstring.length <= 3) {
            return ht.a(arrstring, 0, cmz2);
        }
        if (arrstring.length == 4) {
            return ht.a(arrstring, bfa.v.c());
        }
        if (arrstring.length == 6) {
            return ht.a(arrstring, "replace", "destroy", "keep");
        }
        return Collections.emptyList();
    }
}

