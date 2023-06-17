/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

abstract class agu
extends pc {
    protected int a;
    protected int b;
    protected int c;
    protected int d = -1;

    public agu() {
    }

    protected agu(Random random, int n2, int n3, int n4, int n5, int n6, int n7) {
        super(0);
        this.a = n5;
        this.b = n6;
        this.c = n7;
        this.a(afj.a.a(random));
        this.l = this.e().l() == ctv.c ? new awx(n2, n3, n4, n2 + n5 - 1, n3 + n6 - 1, n4 + n7 - 1) : new awx(n2, n3, n4, n2 + n7 - 1, n3 + n6 - 1, n4 + n5 - 1);
    }

    @Override
    protected void a(bvp bvp2) {
        bvp2.a("Width", this.a);
        bvp2.a("Height", this.b);
        bvp2.a("Depth", this.c);
        bvp2.a("HPos", this.d);
    }

    @Override
    protected void b(bvp bvp2) {
        this.a = bvp2.h("Width");
        this.b = bvp2.h("Height");
        this.c = bvp2.h("Depth");
        this.d = bvp2.h("HPos");
    }

    protected boolean a(iu iu2, awx awx2, int n2) {
        if (this.d >= 0) {
            return true;
        }
        int n3 = 0;
        int n4 = 0;
        pj pj2 = new pj();
        for (int i2 = this.l.c; i2 <= this.l.f; ++i2) {
            for (int i3 = this.l.a; i3 <= this.l.d; ++i3) {
                pj2.a(i3, 64, i2);
                if (!awx2.a(pj2)) continue;
                n3 += Math.max(iu2.p(pj2).b(), iu2.q.j());
                ++n4;
            }
        }
        if (n4 == 0) {
            return false;
        }
        this.d = n3 / n4;
        this.l.a(0, this.d - this.l.b + n2, 0);
        return true;
    }
}

