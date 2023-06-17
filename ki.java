/*
 * Decompiled with CFR 0.150.
 */
public class ki
implements czo {
    private static final bpx a = new bpx("textures/entity/creeper/creeper_armor.png");
    private final arp b;
    private final bkv c = new bkv(2.0f);

    public ki(arp arp2) {
        this.b = arp2;
    }

    public void a(ddh ddh2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (!ddh2.T()) {
            return;
        }
        boolean bl2 = ddh2.ct();
        cja.a(!bl2);
        this.b.a(a);
        cja.l(5890);
        cja.C();
        float f9 = (float)ddh2.by + f4;
        cja.c(f9 * 0.01f, f9 * 0.01f, 0.0f);
        cja.l(5888);
        cja.l();
        float f10 = 0.5f;
        cja.c(0.5f, 0.5f, 0.5f, 1.0f);
        cja.f();
        cja.a(bjt.e, afi.e);
        this.c.a(this.b.c());
        this.c.a(ddh2, f2, f3, f5, f6, f7, f8);
        cja.l(5890);
        cja.C();
        cja.l(5888);
        cja.e();
        cja.k();
        cja.a(bl2);
    }

    @Override
    public boolean a() {
        return false;
    }
}

