/*
 * Decompiled with CFR 0.150.
 */
public class chx
extends ck {
    protected xy a;
    protected cpk b;
    protected float c;
    private int e;
    private final float f;
    protected Class d;

    public chx(xy xy2, Class class_, float f2) {
        this.a = xy2;
        this.d = class_;
        this.c = f2;
        this.f = 0.02f;
        this.a(2);
    }

    public chx(xy xy2, Class class_, float f2, float f3) {
        this.a = xy2;
        this.d = class_;
        this.c = f2;
        this.f = f3;
        this.a(2);
    }

    @Override
    public boolean b() {
        if (this.a.aW().nextFloat() >= this.f) {
            return false;
        }
        if (this.a.ar() != null) {
            this.b = this.a.ar();
        }
        this.b = this.d == bdl.class ? this.a.aQ.a((cpk)this.a, (double)this.c) : this.a.aQ.a(this.d, this.a.cD().b((double)this.c, 3.0, this.c), (cpk)this.a);
        return this.b != null;
    }

    @Override
    public boolean a() {
        if (!this.b.bj()) {
            return false;
        }
        if (this.a.l(this.b) > (double)(this.c * this.c)) {
            return false;
        }
        return this.e > 0;
    }

    @Override
    public void c() {
        this.e = 40 + this.a.aW().nextInt(40);
    }

    @Override
    public void d() {
        this.b = null;
    }

    @Override
    public void e() {
        this.a.am().a(this.b.aU, this.b.aV + (double)this.b.A(), this.b.aW, this.a.ax(), this.a.aw());
        --this.e;
    }
}

