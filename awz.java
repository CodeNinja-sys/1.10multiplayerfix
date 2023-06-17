/*
 * Decompiled with CFR 0.150.
 */
public class awz
extends cut {
    boolean a;
    int b;

    public awz(xy xy2, boolean bl2) {
        super(xy2);
        this.c = xy2;
        this.a = bl2;
    }

    @Override
    public boolean a() {
        return this.a && this.b > 0 && super.a();
    }

    @Override
    public void c() {
        this.b = 20;
        this.e.a(this.c.aQ, this.d, true);
    }

    @Override
    public void d() {
        if (this.a) {
            this.e.a(this.c.aQ, this.d, false);
        }
    }

    @Override
    public void e() {
        --this.b;
        super.e();
    }
}

