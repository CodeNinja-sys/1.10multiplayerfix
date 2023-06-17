/*
 * Decompiled with CFR 0.150.
 */
public class ayw
implements czo {
    private static final bpx a = new bpx("textures/entity/wolf/wolf_collar.png");
    private final bad b;

    public ayw(bad bad2) {
        this.b = bad2;
    }

    public void a(cqw cqw2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (!cqw2.B() || cqw2.ct()) {
            return;
        }
        this.b.a(a);
        dck dck2 = dck.b(cqw2.aR().b());
        float[] arrf = ne.a(dck2);
        cja.d(arrf[0], arrf[1], arrf[2]);
        this.b.c().a(cqw2, f2, f3, f5, f6, f7, f8);
    }

    @Override
    public boolean a() {
        return true;
    }
}

