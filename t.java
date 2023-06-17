/*
 * Decompiled with CFR 0.150.
 */
public class t
implements czo {
    private static final bpx a = new bpx("textures/entity/skeleton/stray_overlay.png");
    private final wq b;
    private aed c;

    public t(wq wq2) {
        this.b = wq2;
        this.c = new aed(0.25f, true);
    }

    public void a(azy azy2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (azy2.Z() != aoy.c) {
            return;
        }
        this.c.a(this.b.c());
        this.c.a(azy2, f2, f3, f4);
        this.b.a(a);
        this.c.a(azy2, f2, f3, f5, f6, f7, f8);
    }

    @Override
    public boolean a() {
        return true;
    }
}

