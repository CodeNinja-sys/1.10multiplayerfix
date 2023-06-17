/*
 * Decompiled with CFR 0.150.
 */
public class cjy
implements czo {
    private static final bpx a = new bpx("textures/entity/sheep/sheep_fur.png");
    private final axr b;
    private final dbl c = new dbl();

    public cjy(axr axr2) {
        this.b = axr2;
    }

    public void a(ne ne2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (ne2.B() || ne2.ct()) {
            return;
        }
        this.b.a(a);
        if (ne2.j_() && "jeb_".equals(ne2.cA())) {
            int n2 = 25;
            int n3 = ne2.by / 25 + ne2.bW();
            int n4 = dck.values().length;
            int n5 = n3 % n4;
            int n6 = (n3 + 1) % n4;
            float f9 = ((float)(ne2.by % 25) + f4) / 25.0f;
            float[] arrf = ne.a(dck.b(n5));
            float[] arrf2 = ne.a(dck.b(n6));
            cja.d(arrf[0] * (1.0f - f9) + arrf2[0] * f9, arrf[1] * (1.0f - f9) + arrf2[1] * f9, arrf[2] * (1.0f - f9) + arrf2[2] * f9);
        } else {
            float[] arrf = ne.a(ne2.x());
            cja.d(arrf[0], arrf[1], arrf[2]);
        }
        this.c.a(this.b.c());
        this.c.a(ne2, f2, f3, f4);
        this.c.a(ne2, f2, f3, f5, f6, f7, f8);
    }

    @Override
    public boolean a() {
        return true;
    }
}

