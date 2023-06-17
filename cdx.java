/*
 * Decompiled with CFR 0.150.
 */
public class cdx
extends ck {
    private final cqw a;
    private bdl b;
    private final iu c;
    private final float d;
    private int e;

    public cdx(cqw cqw2, float f2) {
        this.a = cqw2;
        this.c = cqw2.aQ;
        this.d = f2;
        this.a(2);
    }

    @Override
    public boolean b() {
        this.b = this.c.a((cpk)this.a, (double)this.d);
        if (this.b == null) {
            return false;
        }
        return this.a(this.b);
    }

    @Override
    public boolean a() {
        if (!this.b.bj()) {
            return false;
        }
        if (this.a.l(this.b) > (double)(this.d * this.d)) {
            return false;
        }
        return this.e > 0 && this.a(this.b);
    }

    @Override
    public void c() {
        this.a.e(true);
        this.e = 40 + this.a.aW().nextInt(40);
    }

    @Override
    public void d() {
        this.a.e(false);
        this.b = null;
    }

    @Override
    public void e() {
        this.a.am().a(this.b.aU, this.b.aV + (double)this.b.A(), this.b.aW, 10.0f, this.a.aw());
        --this.e;
    }

    private boolean a(bdl bdl2) {
        for (bqp bqp2 : bqp.values()) {
            bhl bhl2 = bdl2.c(bqp2);
            if (bhl2 == null) continue;
            if (this.a.B() && bhl2.a() == hp.be) {
                return true;
            }
            if (!this.a.a(bhl2)) continue;
            return true;
        }
        return false;
    }
}

