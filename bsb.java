/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class bsb
extends mn {
    @Override
    public String a() {
        return "testforblock";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.testforblock.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        int n2;
        bfa bfa2;
        Object object;
        iu iu2;
        if (arrstring.length < 4) {
            throw new ben("commands.testforblock.usage", new Object[0]);
        }
        ala2.a(bnw.b, 0);
        cmz cmz2 = bsb.a(ala2, arrstring, 0, false);
        bfa bfa3 = bfa.a(arrstring[3]);
        if (bfa3 == null) {
            throw new cml("commands.setblock.notFound", arrstring[3]);
        }
        int n3 = -1;
        if (arrstring.length >= 5) {
            n3 = bsb.a(arrstring[4], -1, 15);
        }
        if (!(iu2 = ala2.m_()).d(cmz2)) {
            throw new kx("commands.testforblock.outOfWorld", new Object[0]);
        }
        bvp bvp2 = new bvp();
        boolean bl2 = false;
        if (arrstring.length >= 6 && bfa3.l()) {
            object = bsb.a(ala2, arrstring, 5).i();
            try {
                bvp2 = bdg.a((String)object);
                bl2 = true;
            }
            catch (aoo aoo2) {
                throw new kx("commands.setblock.tagError", aoo2.getMessage());
            }
        }
        if ((bfa2 = (object = iu2.n(cmz2)).t()) != bfa3) {
            throw new kx("commands.testforblock.failed.tile", cmz2.a(), cmz2.b(), cmz2.c(), bfa2.az_(), bfa3.az_());
        }
        if (n3 > -1 && (n2 = object.t().e((dbk)object)) != n3) {
            throw new kx("commands.testforblock.failed.data", cmz2.a(), cmz2.b(), cmz2.c(), n2, n3);
        }
        if (bl2) {
            bql bql2 = iu2.q(cmz2);
            if (bql2 == null) {
                throw new kx("commands.testforblock.failed.tileEntity", cmz2.a(), cmz2.b(), cmz2.c());
            }
            bvp bvp3 = bql2.b(new bvp());
            if (!ayj.a(bvp2, bvp3, true)) {
                throw new kx("commands.testforblock.failed.nbt", cmz2.a(), cmz2.b(), cmz2.c());
            }
        }
        ala2.a(bnw.b, 1);
        bsb.a(ala2, (fh)this, "commands.testforblock.success", cmz2.a(), cmz2.b(), cmz2.c());
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length > 0 && arrstring.length <= 3) {
            return bsb.a(arrstring, 0, cmz2);
        }
        if (arrstring.length == 4) {
            return bsb.a(arrstring, bfa.v.c());
        }
        return Collections.emptyList();
    }
}

