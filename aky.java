/*
 * Decompiled with CFR 0.150.
 */
public class aky
implements czo {
    private final ard a;
    private final axg b = new cie(0);

    public aky(ard ard2) {
        this.a = ard2;
    }

    public void a(akr akr2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (akr2.ct()) {
            return;
        }
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.y();
        cja.l();
        cja.a(bjt.l, afi.j);
        this.b.a(this.a.c());
        this.b.a(akr2, f2, f3, f5, f6, f7, f8);
        cja.k();
        cja.z();
    }

    @Override
    public boolean a() {
        return true;
    }
}

