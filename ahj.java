/*
 * Decompiled with CFR 0.150.
 */
public class ahj
extends cjn {
    private static final oi[] a = new oi[]{oi.p, oi.q, oi.r, oi.s, oi.t, oi.z, oi.B, oi.C, oi.A, oi.F};
    private final cjn b;
    private final cmx c;
    private String d;

    public ahj(cjn cjn2, cmx cmx2) {
        this.b = cjn2;
        this.c = cmx2;
    }

    @Override
    public void cH_() {
        this.d = bf.a("options.chat.title", new Object[0]);
        int n2 = 0;
        for (oi oi2 : a) {
            if (oi2.a()) {
                this.y.add(new jq(oi2.c(), this.w / 2 - 155 + n2 % 2 * 160, this.x / 6 + 24 * (n2 >> 1), oi2));
            } else {
                this.y.add(new bcy(oi2.c(), this.w / 2 - 155 + n2 % 2 * 160, this.x / 6 + 24 * (n2 >> 1), oi2, this.c.c(oi2)));
            }
            ++n2;
        }
        this.y.add(new cwv(200, this.w / 2 - 100, this.x / 6 + 120, bf.a("gui.done", new Object[0])));
    }

    @Override
    protected void a(cwv cwv2) {
        if (!cwv2.k) {
            return;
        }
        if (cwv2.j < 100 && cwv2 instanceof bcy) {
            this.c.a(((bcy)cwv2).a(), 1);
            cwv2.i = this.c.c(oi.a(cwv2.j));
        }
        if (cwv2.j == 200) {
            this.u.u.b();
            this.u.a(this.b);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.aH_();
        this.a(this.B, this.d, this.w / 2, 20, 0xFFFFFF);
        super.a(n2, n3, f2);
    }
}

