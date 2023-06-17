/*
 * Decompiled with CFR 0.150.
 */
public class cjd
extends bds {
    protected float h;
    protected long i;

    public cjd(dgy dgy2) {
        super(dgy2.a(), dgy2.c(), dgy2.e(), dgy2.f());
        this.h = dgy2.d();
        this.b = dgy2.d();
        this.i = bxy.K();
        this.a(dgy2.g());
        this.b(dgy2.h());
        this.c(dgy2.i());
    }

    @Override
    public void a(float f2) {
        this.b = this.c();
        this.h = f2;
        this.i = bxy.K();
    }

    @Override
    public float c() {
        long l2 = bxy.K() - this.i;
        float f2 = cmk.a((float)l2 / 100.0f, 0.0f, 1.0f);
        return this.b + (this.h - this.b) * f2;
    }

    public void a(dgy dgy2) {
        switch (dgy2.b()) {
            case d: {
                this.a(dgy2.c());
                break;
            }
            case c: {
                this.a(dgy2.d());
                break;
            }
            case e: {
                this.a(dgy2.e());
                this.a(dgy2.f());
                break;
            }
            case f: {
                this.a(dgy2.g());
                this.b(dgy2.h());
            }
        }
    }
}

