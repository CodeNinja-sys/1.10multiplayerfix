/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class akh
extends cjv {
    private bqk b;
    private boolean c;

    public akh() {
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("tf", this.c);
        bvp2.a("D", this.b.c());
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.c = bvp2.p("tf");
        this.b = bqk.b(bvp2.h("D"));
    }

    public akh(int n2, Random random, awx awx2, bqk bqk2, cfn cfn2) {
        super(n2, cfn2);
        this.b = bqk2;
        this.l = awx2;
        this.c = awx2.d() > 3;
    }

    public static awx a(List list, Random random, int n2, int n3, int n4, bqk bqk2) {
        awx awx2 = new awx(n2, n3, n4, n2, n3 + 2, n4);
        if (random.nextInt(4) == 0) {
            awx2.e += 4;
        }
        switch (bqk2) {
            default: {
                awx2.a = n2 - 1;
                awx2.d = n2 + 3;
                awx2.c = n4 - 4;
                break;
            }
            case d: {
                awx2.a = n2 - 1;
                awx2.d = n2 + 3;
                awx2.f = n4 + 3 + 1;
                break;
            }
            case e: {
                awx2.a = n2 - 4;
                awx2.c = n4 - 1;
                awx2.f = n4 + 3;
                break;
            }
            case f: {
                awx2.d = n2 + 3 + 1;
                awx2.c = n4 - 1;
                awx2.f = n4 + 3;
            }
        }
        if (pc.a(list, awx2) != null) {
            return null;
        }
        return awx2;
    }

    @Override
    public void a(pc pc2, List list, Random random) {
        int n2 = this.c();
        switch (this.b) {
            default: {
                awc.a(pc2, list, random, this.l.a + 1, this.l.b, this.l.c - 1, bqk.c, n2);
                awc.a(pc2, list, random, this.l.a - 1, this.l.b, this.l.c + 1, bqk.e, n2);
                awc.a(pc2, list, random, this.l.d + 1, this.l.b, this.l.c + 1, bqk.f, n2);
                break;
            }
            case d: {
                awc.a(pc2, list, random, this.l.a + 1, this.l.b, this.l.f + 1, bqk.d, n2);
                awc.a(pc2, list, random, this.l.a - 1, this.l.b, this.l.c + 1, bqk.e, n2);
                awc.a(pc2, list, random, this.l.d + 1, this.l.b, this.l.c + 1, bqk.f, n2);
                break;
            }
            case e: {
                awc.a(pc2, list, random, this.l.a + 1, this.l.b, this.l.c - 1, bqk.c, n2);
                awc.a(pc2, list, random, this.l.a + 1, this.l.b, this.l.f + 1, bqk.d, n2);
                awc.a(pc2, list, random, this.l.a - 1, this.l.b, this.l.c + 1, bqk.e, n2);
                break;
            }
            case f: {
                awc.a(pc2, list, random, this.l.a + 1, this.l.b, this.l.c - 1, bqk.c, n2);
                awc.a(pc2, list, random, this.l.a + 1, this.l.b, this.l.f + 1, bqk.d, n2);
                awc.a(pc2, list, random, this.l.d + 1, this.l.b, this.l.c + 1, bqk.f, n2);
            }
        }
        if (this.c) {
            if (random.nextBoolean()) {
                awc.a(pc2, list, random, this.l.a + 1, this.l.b + 3 + 1, this.l.c - 1, bqk.c, n2);
            }
            if (random.nextBoolean()) {
                awc.a(pc2, list, random, this.l.a - 1, this.l.b + 3 + 1, this.l.c + 1, bqk.e, n2);
            }
            if (random.nextBoolean()) {
                awc.a(pc2, list, random, this.l.d + 1, this.l.b + 3 + 1, this.l.c + 1, bqk.f, n2);
            }
            if (random.nextBoolean()) {
                awc.a(pc2, list, random, this.l.a + 1, this.l.b + 3 + 1, this.l.f + 1, bqk.d, n2);
            }
        }
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        if (this.a(iu2, awx2)) {
            return false;
        }
        dbk dbk2 = this.f();
        if (this.c) {
            this.a(iu2, awx2, this.l.a + 1, this.l.b, this.l.c, this.l.d - 1, this.l.b + 3 - 1, this.l.f, blg.a.s(), blg.a.s(), false);
            this.a(iu2, awx2, this.l.a, this.l.b, this.l.c + 1, this.l.d, this.l.b + 3 - 1, this.l.f - 1, blg.a.s(), blg.a.s(), false);
            this.a(iu2, awx2, this.l.a + 1, this.l.e - 2, this.l.c, this.l.d - 1, this.l.e, this.l.f, blg.a.s(), blg.a.s(), false);
            this.a(iu2, awx2, this.l.a, this.l.e - 2, this.l.c + 1, this.l.d, this.l.e, this.l.f - 1, blg.a.s(), blg.a.s(), false);
            this.a(iu2, awx2, this.l.a + 1, this.l.b + 3, this.l.c + 1, this.l.d - 1, this.l.b + 3, this.l.f - 1, blg.a.s(), blg.a.s(), false);
        } else {
            this.a(iu2, awx2, this.l.a + 1, this.l.b, this.l.c, this.l.d - 1, this.l.e, this.l.f, blg.a.s(), blg.a.s(), false);
            this.a(iu2, awx2, this.l.a, this.l.b, this.l.c + 1, this.l.d, this.l.e, this.l.f - 1, blg.a.s(), blg.a.s(), false);
        }
        this.b(iu2, awx2, this.l.a + 1, this.l.b, this.l.c + 1, this.l.e);
        this.b(iu2, awx2, this.l.a + 1, this.l.b, this.l.f - 1, this.l.e);
        this.b(iu2, awx2, this.l.d - 1, this.l.b, this.l.c + 1, this.l.e);
        this.b(iu2, awx2, this.l.d - 1, this.l.b, this.l.f - 1, this.l.e);
        for (int i2 = this.l.a; i2 <= this.l.d; ++i2) {
            for (int i3 = this.l.c; i3 <= this.l.f; ++i3) {
                if (this.a(iu2, i2, this.l.b - 1, i3, awx2).a() != ahk.a || this.b(iu2, i2, this.l.b - 1, i3, awx2) >= 8) continue;
                this.a(iu2, dbk2, i2, this.l.b - 1, i3, awx2);
            }
        }
        return true;
    }

    private void b(iu iu2, awx awx2, int n2, int n3, int n4, int n5) {
        if (this.a(iu2, n2, n5 + 1, n4, awx2).a() != ahk.a) {
            this.a(iu2, awx2, n2, n3, n4, n2, n5, n4, this.f(), blg.a.s(), false);
        }
    }
}

