/*
 * Decompiled with CFR 0.150.
 */
public class bzc
extends axg {
    private final abd a;
    private final abd b = new abd(this, "glass");
    private abd c;

    public bzc(float f2, boolean bl2) {
        this.b.a(0, 0).a(-4.0f, -4.0f, -4.0f, 8, 8, 8);
        this.a = new abd(this, "cube");
        this.a.a(32, 0).a(-4.0f, -4.0f, -4.0f, 8, 8, 8);
        if (bl2) {
            this.c = new abd(this, "base");
            this.c.a(0, 16).a(-6.0f, 0.0f, -6.0f, 12, 4, 12);
        }
    }

    @Override
    public void a(cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        cja.D();
        cja.b(2.0f, 2.0f, 2.0f);
        cja.c(0.0f, -0.5f, 0.0f);
        if (this.c != null) {
            this.c.a(f7);
        }
        cja.b(f3, 0.0f, 1.0f, 0.0f);
        cja.c(0.0f, 0.8f + f4, 0.0f);
        cja.b(60.0f, 0.7071f, 0.0f, 0.7071f);
        this.b.a(f7);
        float f8 = 0.875f;
        cja.b(0.875f, 0.875f, 0.875f);
        cja.b(60.0f, 0.7071f, 0.0f, 0.7071f);
        cja.b(f3, 0.0f, 1.0f, 0.0f);
        this.b.a(f7);
        cja.b(0.875f, 0.875f, 0.875f);
        cja.b(60.0f, 0.7071f, 0.0f, 0.7071f);
        cja.b(f3, 0.0f, 1.0f, 0.0f);
        this.a.a(f7);
        cja.E();
    }
}

