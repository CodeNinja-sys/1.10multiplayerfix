/*
 * Decompiled with CFR 0.150.
 */
public class agx
extends cjn {
    private final cjn b;
    protected String a = "Video Settings";
    private final cmx c;
    private awm d;
    private static final oi[] e = new oi[]{oi.l, oi.f, oi.m, oi.i, oi.h, oi.g, oi.n, oi.I, oi.d, oi.k, oi.o, oi.v, oi.w, oi.D, oi.x, oi.G};

    public agx(cjn cjn2, cmx cmx2) {
        this.b = cjn2;
        this.c = cmx2;
    }

    @Override
    public void cH_() {
        this.a = bf.a("options.videoTitle", new Object[0]);
        this.y.clear();
        this.y.add(new cwv(200, this.w / 2 - 100, this.x - 27, bf.a("gui.done", new Object[0])));
        if (cjg.P) {
            this.d = new ii(this.u, this.w, this.x, 32, this.x - 32, 25, e);
        } else {
            oi[] arroi = new oi[e.length - 1];
            int n2 = 0;
            for (oi oi2 : e) {
                if (oi2 == oi.x) break;
                arroi[n2] = oi2;
                ++n2;
            }
            this.d = new ii(this.u, this.w, this.x, 32, this.x - 32, 25, arroi);
        }
    }

    @Override
    public void p_() {
        super.p_();
        this.d.i();
    }

    @Override
    protected void a(cwv cwv2) {
        if (!cwv2.k) {
            return;
        }
        if (cwv2.j == 200) {
            this.u.u.b();
            this.u.a(this.b);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        int n5 = this.c.aC;
        super.a(n2, n3, n4);
        this.d.b(n2, n3, n4);
        if (this.c.aC != n5) {
            cnt cnt2 = new cnt(this.u);
            int n6 = cnt2.a();
            int n7 = cnt2.b();
            this.a(this.u, n6, n7);
        }
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        int n5 = this.c.aC;
        super.b(n2, n3, n4);
        this.d.c(n2, n3, n4);
        if (this.c.aC != n5) {
            cnt cnt2 = new cnt(this.u);
            int n6 = cnt2.a();
            int n7 = cnt2.b();
            this.a(this.u, n6, n7);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.aH_();
        this.d.a(n2, n3, f2);
        this.a(this.B, this.a, this.w / 2, 5, 0xFFFFFF);
        super.a(n2, n3, f2);
    }
}

