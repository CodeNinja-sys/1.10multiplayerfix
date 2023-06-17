/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class bhv
extends bis {
    private int a;

    public bhv() {
    }

    public bhv(int n2, Random random, awx awx2, bqk bqk2) {
        super(n2);
        this.a(bqk2);
        this.l = awx2;
        this.a = random.nextInt();
    }

    public static bhv a(List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, -1, -3, 0, 5, 10, 8, bqk2);
        if (!bhv.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new bhv(n5, random, awx2, bqk2);
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.a = bvp2.h("Seed");
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Seed", this.a);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        int n2;
        int n3;
        int n4;
        Random random2 = new Random(this.a);
        for (n4 = 0; n4 <= 4; ++n4) {
            for (n3 = 3; n3 <= 4; ++n3) {
                n2 = random2.nextInt(8);
                this.a(iu2, awx2, n4, n3, 0, n4, n3, n2, blg.by.s(), blg.by.s(), false);
            }
        }
        n4 = random2.nextInt(8);
        this.a(iu2, awx2, 0, 5, 0, 0, 5, n4, blg.by.s(), blg.by.s(), false);
        n4 = random2.nextInt(8);
        this.a(iu2, awx2, 4, 5, 0, 4, 5, n4, blg.by.s(), blg.by.s(), false);
        for (n4 = 0; n4 <= 4; ++n4) {
            n3 = random2.nextInt(5);
            this.a(iu2, awx2, n4, 2, 0, n4, 2, n3, blg.by.s(), blg.by.s(), false);
        }
        for (n4 = 0; n4 <= 4; ++n4) {
            for (n3 = 0; n3 <= 1; ++n3) {
                n2 = random2.nextInt(3);
                this.a(iu2, awx2, n4, n3, 0, n4, n3, n2, blg.by.s(), blg.by.s(), false);
            }
        }
        return true;
    }
}

