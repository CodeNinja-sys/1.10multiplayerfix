/*
 * Decompiled with CFR 0.150.
 */
public class bxd
extends bpl {
    private final abd b = new abd(this, 32, 0);

    public bxd() {
        super(0, 0, 64, 64);
        this.b.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.25f);
        this.b.a(0.0f, 0.0f, 0.0f);
    }

    @Override
    public void a(cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        super.a(cpk2, f2, f3, f4, f5, f6, f7);
        this.b.a(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, cpk cpk2) {
        super.a(f2, f3, f4, f5, f6, f7, cpk2);
        this.b.g = this.a.g;
        this.b.f = this.a.f;
    }
}

