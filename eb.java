/*
 * Decompiled with CFR 0.150.
 */
public class eb
implements czo {
    private static final bpx a = new bpx("textures/entity/pig/pig_saddle.png");
    private final aev b;
    private final cru c = new cru(0.5f);

    public eb(aev aev2) {
        this.b = aev2;
    }

    public void a(cna cna2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (!cna2.T()) {
            return;
        }
        this.b.a(a);
        this.c.a(this.b.c());
        this.c.a(cna2, f2, f3, f5, f6, f7, f8);
    }

    @Override
    public boolean a() {
        return false;
    }
}

