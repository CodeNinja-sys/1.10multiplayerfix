/*
 * Decompiled with CFR 0.150.
 */
public class anx
implements bcl {
    private final iu a;
    private final cmz b;

    public anx(iu iu2, cmz cmz2) {
        this.a = iu2;
        this.b = cmz2;
    }

    @Override
    public iu a() {
        return this.a;
    }

    @Override
    public double b() {
        return (double)this.b.a() + 0.5;
    }

    @Override
    public double c() {
        return (double)this.b.b() + 0.5;
    }

    @Override
    public double d() {
        return (double)this.b.c() + 0.5;
    }

    @Override
    public cmz e() {
        return this.b;
    }

    @Override
    public dbk f() {
        return this.a.n(this.b);
    }

    @Override
    public bql g() {
        return this.a.q(this.b);
    }
}

