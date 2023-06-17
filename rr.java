/*
 * Decompiled with CFR 0.150.
 */
public class rr
extends buc {
    private static final bpx[] b = new bpx[]{new bpx("textures/entity/boat/boat_oak.png"), new bpx("textures/entity/boat/boat_spruce.png"), new bpx("textures/entity/boat/boat_birch.png"), new bpx("textures/entity/boat/boat_jungle.png"), new bpx("textures/entity/boat/boat_acacia.png"), new bpx("textures/entity/boat/boat_darkoak.png")};
    protected axg a = new qu();

    public rr(bid bid2) {
        super(bid2);
        this.h = 0.5f;
    }

    public void a(cor cor2, double d2, double d3, double d4, float f2, float f3) {
        cja.D();
        this.a(d2, d3, d4);
        this.a(cor2, f2, f3);
        this.e(cor2);
        if (this.j) {
            cja.g();
            cja.e(this.d(cor2));
        }
        this.a.a(cor2, f3, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        if (this.j) {
            cja.m();
            cja.h();
        }
        cja.E();
        super.a((cpk)cor2, d2, d3, d4, f2, f3);
    }

    public void a(cor cor2, float f2, float f3) {
        cja.b(180.0f - f2, 0.0f, 1.0f, 0.0f);
        float f4 = (float)cor2.C() - f3;
        float f5 = cor2.B() - f3;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f4 > 0.0f) {
            cja.b(cmk.a(f4) * f4 * f5 / 10.0f * (float)cor2.E(), 1.0f, 0.0f, 0.0f);
        }
        cja.b(-1.0f, -1.0f, 1.0f);
    }

    public void a(double d2, double d3, double d4) {
        cja.c((float)d2, (float)d3 + 0.375f, (float)d4);
    }

    protected bpx a(cor cor2) {
        return b[cor2.H().ordinal()];
    }

    @Override
    public boolean r_() {
        return true;
    }

    public void b(cor cor2, double d2, double d3, double d4, float f2, float f3) {
        cja.D();
        this.a(d2, d3, d4);
        this.a(cor2, f2, f3);
        this.e(cor2);
        ((dgq)((Object)this.a)).b(cor2, f3, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        cja.E();
    }
}

