/*
 * Decompiled with CFR 0.150.
 */
public class cer
extends byf {
    @Override
    public void c() {
        this.c = new cvi(cff.j);
        this.d = true;
        this.e = true;
    }

    @Override
    public amj b(float f2, float f3) {
        return new amj(0.2f, 0.03f, 0.03f);
    }

    @Override
    protected void b() {
        float f2 = 0.1f;
        for (int i2 = 0; i2 <= 15; ++i2) {
            float f3 = 1.0f - (float)i2 / 15.0f;
            this.f[i2] = (1.0f - f3) / (f3 * 3.0f + 1.0f) * 0.9f + 0.1f;
        }
    }

    @Override
    public tv d() {
        return new agc(this.b, this.b.E().q(), this.b.y());
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean b(int n2, int n3) {
        return false;
    }

    @Override
    public float a(long l2, float f2) {
        return 0.5f;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public boolean c(int n2, int n3) {
        return true;
    }

    @Override
    public ajw p() {
        return new cis(this);
    }

    @Override
    public cyy a() {
        return cyy.b;
    }
}

