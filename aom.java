/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class aom
extends mn {
    @Override
    public String a() {
        return "testforblocks";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.compare.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length < 9) {
            throw new ben("commands.compare.usage", new Object[0]);
        }
        ala2.a(bnw.b, 0);
        cmz cmz2 = aom.a(ala2, arrstring, 0, false);
        cmz cmz3 = aom.a(ala2, arrstring, 3, false);
        cmz cmz4 = aom.a(ala2, arrstring, 6, false);
        awx awx2 = new awx(cmz2, cmz3);
        awx awx3 = new awx(cmz4, cmz4.g(awx2.b()));
        int n2 = awx2.c() * awx2.d() * awx2.e();
        if (n2 > 524288) {
            throw new kx("commands.compare.tooManyBlocks", n2, 524288);
        }
        if (awx2.b < 0 || awx2.e >= 256 || awx3.b < 0 || awx3.e >= 256) {
            throw new kx("commands.compare.outOfWorld", new Object[0]);
        }
        iu iu2 = ala2.m_();
        if (!iu2.a(awx2) || !iu2.a(awx3)) {
            throw new kx("commands.compare.outOfWorld", new Object[0]);
        }
        boolean bl2 = false;
        if (arrstring.length > 9 && "masked".equals(arrstring[9])) {
            bl2 = true;
        }
        n2 = 0;
        cmz cmz5 = new cmz(awx3.a - awx2.a, awx3.b - awx2.b, awx3.c - awx2.c);
        pj pj2 = new pj();
        pj pj3 = new pj();
        for (int i2 = awx2.c; i2 <= awx2.f; ++i2) {
            for (int i3 = awx2.b; i3 <= awx2.e; ++i3) {
                for (int i4 = awx2.a; i4 <= awx2.d; ++i4) {
                    pj2.a(i4, i3, i2);
                    pj3.a(i4 + cmz5.a(), i3 + cmz5.b(), i2 + cmz5.c());
                    boolean bl3 = false;
                    dbk dbk2 = iu2.n(pj2);
                    if (bl2 && dbk2.t() == blg.a) continue;
                    if (dbk2 == iu2.n(pj3)) {
                        bql bql2 = iu2.q(pj2);
                        bql bql3 = iu2.q(pj3);
                        if (bql2 != null && bql3 != null) {
                            bvp bvp2 = bql2.b(new bvp());
                            bvp2.q("x");
                            bvp2.q("y");
                            bvp2.q("z");
                            bvp bvp3 = bql3.b(new bvp());
                            bvp3.q("x");
                            bvp3.q("y");
                            bvp3.q("z");
                            if (!bvp2.equals(bvp3)) {
                                bl3 = true;
                            }
                        } else if (bql2 != null) {
                            bl3 = true;
                        }
                    } else {
                        bl3 = true;
                    }
                    ++n2;
                    if (!bl3) continue;
                    throw new kx("commands.compare.failed", new Object[0]);
                }
            }
        }
        ala2.a(bnw.b, n2);
        aom.a(ala2, (fh)this, "commands.compare.success", n2);
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length > 0 && arrstring.length <= 3) {
            return aom.a(arrstring, 0, cmz2);
        }
        if (arrstring.length > 3 && arrstring.length <= 6) {
            return aom.a(arrstring, 3, cmz2);
        }
        if (arrstring.length > 6 && arrstring.length <= 9) {
            return aom.a(arrstring, 6, cmz2);
        }
        if (arrstring.length == 10) {
            return aom.a(arrstring, "masked", "all");
        }
        return Collections.emptyList();
    }
}

