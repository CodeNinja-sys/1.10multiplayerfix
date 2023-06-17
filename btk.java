/*
 * Decompiled with CFR 0.150.
 */
public class btk
extends cjn {
    private static final oi[] d = new oi[]{oi.a, oi.b, oi.y, oi.M};
    private final cjn e;
    protected String a = "Controls";
    private final cmx f;
    public cke b;
    public long c;
    private nu g;
    private cwv h;

    public btk(cjn cjn2, cmx cmx2) {
        this.e = cjn2;
        this.f = cmx2;
    }

    @Override
    public void cH_() {
        this.g = new nu(this, this.u);
        this.y.add(new cwv(200, this.w / 2 - 155, this.x - 29, 150, 20, bf.a("gui.done", new Object[0])));
        this.h = this.b(new cwv(201, this.w / 2 - 155 + 160, this.x - 29, 150, 20, bf.a("controls.resetAll", new Object[0])));
        this.a = bf.a("controls.title", new Object[0]);
        int n2 = 0;
        for (oi oi2 : d) {
            if (oi2.a()) {
                this.y.add(new jq(oi2.c(), this.w / 2 - 155 + n2 % 2 * 160, 18 + 24 * (n2 >> 1), oi2));
            } else {
                this.y.add(new bcy(oi2.c(), this.w / 2 - 155 + n2 % 2 * 160, 18 + 24 * (n2 >> 1), oi2, this.f.c(oi2)));
            }
            ++n2;
        }
    }

    @Override
    public void p_() {
        super.p_();
        this.g.i();
    }

    @Override
    protected void a(cwv cwv2) {
        if (cwv2.j == 200) {
            this.u.a(this.e);
        } else if (cwv2.j == 201) {
            for (cke cke2 : this.u.u.ao) {
                cke2.b(cke2.i());
            }
            cke.c();
        } else if (cwv2.j < 100 && cwv2 instanceof bcy) {
            this.f.a(((bcy)cwv2).a(), 1);
            cwv2.i = this.f.c(oi.a(cwv2.j));
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        if (this.b != null) {
            this.f.a(this.b, -100 + n4);
            this.b = null;
            cke.c();
        } else if (n4 != 0 || !this.g.b(n2, n3, n4)) {
            super.a(n2, n3, n4);
        }
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        if (n4 != 0 || !this.g.c(n2, n3, n4)) {
            super.b(n2, n3, n4);
        }
    }

    @Override
    protected void a(char c2, int n2) {
        if (this.b != null) {
            if (n2 == 1) {
                this.f.a(this.b, 0);
            } else if (n2 != 0) {
                this.f.a(this.b, n2);
            } else if (c2 > '\u0000') {
                this.f.a(this.b, c2 + 256);
            }
            this.b = null;
            this.c = bxy.K();
            cke.c();
        } else {
            super.a(c2, n2);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.aH_();
        this.g.a(n2, n3, f2);
        this.a(this.B, this.a, this.w / 2, 8, 0xFFFFFF);
        boolean bl2 = false;
        for (cke cke2 : this.f.ao) {
            if (cke2.j() == cke2.i()) continue;
            bl2 = true;
            break;
        }
        this.h.k = bl2;
        super.a(n2, n3, f2);
    }
}

