/*
 * Decompiled with CFR 0.150.
 */
import java.util.Map;
import java.util.Random;
import net.minecraft.c.a;

public class bnu
extends agu {
    private static final bpx e = new bpx("igloo/igloo_top");
    private static final bpx f = new bpx("igloo/igloo_middle");
    private static final bpx g = new bpx("igloo/igloo_bottom");

    public bnu() {
    }

    public bnu(Random random, int n2, int n3) {
        super(random, n2, 64, n3, 7, 5, 8);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        if (!this.a(iu2, awx2, -1)) {
            return false;
        }
        awx awx3 = this.b();
        cmz cmz2 = new cmz(awx3.a, awx3.b, awx3.c);
        ih[] arrih = ih.values();
        a a2 = iu2.f();
        bzz bzz2 = iu2.D().g();
        cwl cwl2 = new cwl().a(arrih[random.nextInt(arrih.length)]).a(blg.dj).a(awx3);
        ed ed2 = bzz2.a(a2, e);
        ed2.a(iu2, cmz2, cwl2);
        if (random.nextDouble() < 0.5) {
            Object object;
            ed ed3 = bzz2.a(a2, f);
            ed ed4 = bzz2.a(a2, g);
            int n2 = random.nextInt(8) + 4;
            for (int i2 = 0; i2 < n2; ++i2) {
                object = ed2.a(cwl2, new cmz(3, -1 - i2 * 3, 5), cwl2, new cmz(1, 2, 1));
                ed3.a(iu2, cmz2.g((cjx)object), cwl2);
            }
            cmz cmz3 = cmz2.g(ed2.a(cwl2, new cmz(3, -1 - n2 * 3, 5), cwl2, new cmz(3, 5, 7)));
            ed4.a(iu2, cmz3, cwl2);
            object = ed4.a(cmz3, cwl2);
            for (Map.Entry entry : object.entrySet()) {
                if (!"chest".equals(entry.getValue())) continue;
                cmz cmz4 = (cmz)entry.getKey();
                iu2.a(cmz4, blg.a.s(), 3);
                bql bql2 = iu2.q(cmz4.h());
                if (!(bql2 instanceof bdm)) continue;
                ((bdm)bql2).a(bvm.n, random.nextLong());
            }
        } else {
            cmz cmz5 = ed.a(cwl2, new cmz(3, 0, 5));
            iu2.a(cmz2.g(cmz5), blg.aJ.s(), 3);
        }
        return true;
    }
}

