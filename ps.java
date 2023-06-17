/*
 * Decompiled with CFR 0.150.
 */
public class ps
extends axg {
    public abd a;

    public ps() {
        this(0, 0, 32, 32);
    }

    public ps(int n2, int n3, int n4, int n5) {
        this.p = n4;
        this.q = n5;
        this.a = new abd(this, n2, n3);
        this.a.a(-3.0f, -6.0f, -3.0f, 6, 8, 6, 0.0f);
        this.a.a(0.0f, 0.0f, 0.0f);
    }

    @Override
    public void a(cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, cpk2);
        this.a.a(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, cpk cpk2) {
        super.a(f2, f3, f4, f5, f6, f7, cpk2);
        this.a.g = f5 * ((float)Math.PI / 180);
        this.a.f = f6 * ((float)Math.PI / 180);
    }
}

