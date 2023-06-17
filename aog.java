/*
 * Decompiled with CFR 0.150.
 */
public class aog
implements czo {
    private static final bpx a = new bpx("textures/entity/elytra.png");
    private final kn b;
    private final aal c = new aal();

    public aog(kn kn2) {
        this.b = kn2;
    }

    public void a(ciy ciy2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        bhl bhl2 = ciy2.a(dfm.e);
        if (bhl2 == null || bhl2.a() != hp.cR) {
            return;
        }
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.l();
        if (ciy2.bS() && ciy2.bT() != null) {
            this.b.a(ciy2.bT());
        } else if (ciy2.bN() && ciy2.bR() != null && ciy2.a(bzk.a)) {
            this.b.a(ciy2.bR());
        } else {
            this.b.a(a);
        }
        cja.D();
        cja.c(0.0f, 0.0f, 0.125f);
        this.c.a(f2, f3, f5, f6, f7, f8, ciy2);
        this.c.a(ciy2, f2, f3, f5, f6, f7, f8);
        if (bhl2.w()) {
            ayh.a(this.b, ciy2, this.c, f2, f3, f4, f5, f6, f7, f8);
        }
        cja.E();
    }

    @Override
    public boolean a() {
        return false;
    }
}

