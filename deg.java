/*
 * Decompiled with CFR 0.150.
 */
public abstract class deg
implements ajd {
    protected final brd a;

    public deg(brd brd2) {
        this.a = brd2;
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public void e() {
    }

    @Override
    public void a() {
    }

    @Override
    public void a(abi abi2, cmz cmz2, ahy ahy2, bdl bdl2) {
    }

    @Override
    public void b() {
    }

    @Override
    public void i() {
    }

    @Override
    public float f() {
        return 0.6f;
    }

    @Override
    public amj c() {
        return null;
    }

    @Override
    public float a(ckm ckm2, ahy ahy2, float f2) {
        return f2;
    }

    @Override
    public float g() {
        float f2 = cmk.a(this.a.aX * this.a.aX + this.a.aZ * this.a.aZ) + 1.0f;
        float f3 = Math.min(f2, 40.0f);
        return 0.7f / f3 / f2;
    }
}

