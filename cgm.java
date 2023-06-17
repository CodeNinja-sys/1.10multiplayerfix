/*
 * Decompiled with CFR 0.150.
 */
public class cgm
extends buc {
    private static final bpx a = new bpx("textures/entity/lead_knot.png");
    private final ps b = new ps();

    public cgm(bid bid2) {
        super(bid2);
    }

    public void a(ahe ahe2, double d2, double d3, double d4, float f2, float f3) {
        cja.D();
        cja.q();
        cja.c((float)d2, (float)d3, (float)d4);
        float f4 = 0.0625f;
        cja.A();
        cja.b(-1.0f, -1.0f, 1.0f);
        cja.d();
        this.e(ahe2);
        if (this.j) {
            cja.g();
            cja.e(this.d(ahe2));
        }
        this.b.a(ahe2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        if (this.j) {
            cja.m();
            cja.h();
        }
        cja.E();
        super.a((cpk)ahe2, d2, d3, d4, f2, f3);
    }

    protected bpx a(ahe ahe2) {
        return a;
    }
}

