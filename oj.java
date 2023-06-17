/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class oj
extends ge {
    public oj() {
        super(blg.cK);
        this.k = 16;
        this.a(zm.c);
        this.a(true);
        this.e(0);
    }

    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        dbk dbk2 = iu2.n(cmz2);
        boolean bl2 = dbk2.t().a_((bnj)iu2, cmz2);
        if (bqk2 == bqk.a || !dbk2.a().a() && !bl2 || bl2 && bqk2 != bqk.b) {
            return cey.c;
        }
        if (!bdl2.a(cmz2 = cmz2.c(bqk2), bqk2, bhl2) || !blg.cK.a(iu2, cmz2)) {
            return cey.c;
        }
        if (iu2.C) {
            return cey.a;
        }
        cmz cmz3 = cmz2 = bl2 ? cmz2.h() : cmz2;
        if (bqk2 == bqk.b) {
            int n2 = cmk.c((double)((bdl2.ba + 180.0f) * 16.0f / 360.0f) + 0.5) & 0xF;
            iu2.a(cmz2, blg.cK.s().a(ayr.a, Integer.valueOf(n2)), 3);
        } else {
            iu2.a(cmz2, blg.cL.s().a(bqz.a, (Comparable)((Object)bqk2)), 3);
        }
        --bhl2.b;
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof cwd) {
            ((cwd)bql2).a(bhl2);
        }
        return cey.a;
    }

    @Override
    public String c(bhl bhl2) {
        String string = "item.banner.";
        dck dck2 = oj.d(bhl2);
        string = string + dck2.d() + ".name";
        return caf.a(string);
    }

    public static void a(bhl bhl2, List list) {
        bvp bvp2 = bhl2.a("BlockEntityTag", false);
        if (bvp2 == null || !bvp2.e("Patterns")) {
            return;
        }
        bmh bmh2 = bvp2.c("Patterns", 10);
        for (int i2 = 0; i2 < bmh2.b() && i2 < 6; ++i2) {
            bvp bvp3 = bmh2.b(i2);
            dck dck2 = dck.a(bvp3.h("Color"));
            auv auv2 = auv.a(bvp3.l("Pattern"));
            if (auv2 == null) continue;
            list.add(caf.a("item.banner." + auv2.a() + "." + dck2.d()));
        }
    }

    @Override
    public void a(bhl bhl2, bdl bdl2, List list, boolean bl2) {
        oj.a(bhl2, list);
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        for (dck dck2 : dck.values()) {
            bvp bvp2 = new bvp();
            cwd.a(bvp2, dck2.c(), null);
            bvp bvp3 = new bvp();
            bvp3.a("BlockEntityTag", bvp2);
            bhl bhl2 = new bhl(azg2, 1, dck2.c());
            bhl2.d(bvp3);
            list.add(bhl2);
        }
    }

    @Override
    public zm b() {
        return zm.c;
    }

    public static dck d(bhl bhl2) {
        bvp bvp2 = bhl2.a("BlockEntityTag", false);
        dck dck2 = bvp2 != null && bvp2.e("Base") ? dck.a(bvp2.h("Base")) : dck.a(bhl2.h());
        return dck2;
    }
}

