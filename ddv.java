/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class ddv
extends azg {
    public ddv() {
        this.k = 1;
        this.a(zm.j);
        this.e(336);
        this.a(new bpx("blocking"), new cyc(this));
        crh.c.a(this, uh.b);
    }

    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        return super.a(bhl2, bdl2, iu2, cmz2, bqp2, bqk2, f2, f3, f4);
    }

    @Override
    public String c(bhl bhl2) {
        if (bhl2.a("BlockEntityTag", false) != null) {
            String string = "item.shield.";
            dck dck2 = oj.d(bhl2);
            string = string + dck2.d() + ".name";
            return caf.a(string);
        }
        return caf.a("item.shield.name");
    }

    @Override
    public void a(bhl bhl2, bdl bdl2, List list, boolean bl2) {
        oj.a(bhl2, list);
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        bhl bhl2 = new bhl(azg2, 1, 0);
        list.add(bhl2);
    }

    @Override
    public zm b() {
        return zm.j;
    }

    @Override
    public cga d_(bhl bhl2) {
        return cga.d;
    }

    @Override
    public int e_(bhl bhl2) {
        return 72000;
    }

    @Override
    public wx a(bhl bhl2, iu iu2, bdl bdl2, bqp bqp2) {
        bdl2.b(bqp2);
        return new wx(cey.a, bhl2);
    }

    @Override
    public boolean a(bhl bhl2, bhl bhl3) {
        if (bhl3.a() == azg.a(blg.f)) {
            return true;
        }
        return super.a(bhl2, bhl3);
    }
}

