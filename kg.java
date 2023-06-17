/*
 * Decompiled with CFR 0.150.
 */
public class kg
extends bcf {
    private static final bpx a = new bpx("textures/entity/witch.png");

    public kg(bid bid2) {
        super(bid2, new czk(0.0f), 0.5f);
        this.a(new vi(this));
    }

    public void a(byl byl2, double d2, double d3, double d4, float f2, float f3) {
        ((czk)this.c).g = byl2.bt() != null;
        super.a(byl2, d2, d3, d4, f2, f3);
    }

    protected bpx a(byl byl2) {
        return a;
    }

    @Override
    public void a() {
        cja.c(0.0f, 0.1875f, 0.0f);
    }

    protected void a(byl byl2, float f2) {
        float f3 = 0.9375f;
        cja.b(0.9375f, 0.9375f, 0.9375f);
    }
}

