/*
 * Decompiled with CFR 0.150.
 */
public class fd
extends apq {
    public yo a = new yo(this, 3, 3);
    public tb b = new cad();
    private final iu c;
    private final cmz d;

    public fd(cps cps2, iu iu2, cmz cmz2) {
        int n2;
        int n3;
        this.c = iu2;
        this.d = cmz2;
        this.b(new aul(cps2.e, this.a, this.b, 0, 124, 35));
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 3; ++n2) {
                this.b(new ux(this.a, n2 + n3 * 3, 30 + n2 * 18, 17 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.b(new ux(cps2, n2 + n3 * 9 + 9, 8 + n2 * 18, 84 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 9; ++n3) {
            this.b(new ux(cps2, n3, 8 + n3 * 18, 142));
        }
        this.a(this.a);
    }

    @Override
    public void a(tb tb2) {
        this.b.a(0, gx.a().a(this.a, this.c));
    }

    @Override
    public void a(bdl bdl2) {
        super.a(bdl2);
        if (this.c.C) {
            return;
        }
        for (int i2 = 0; i2 < 9; ++i2) {
            bhl bhl2 = this.a.b(i2);
            if (bhl2 == null) continue;
            bdl2.a(bhl2, false);
        }
    }

    @Override
    public boolean b(bdl bdl2) {
        if (this.c.n(this.d).t() != blg.ai) {
            return false;
        }
        return !(bdl2.i((double)this.d.a() + 0.5, (double)this.d.b() + 0.5, (double)this.d.c() + 0.5) > 64.0);
    }

    @Override
    public bhl b(bdl bdl2, int n2) {
        bhl bhl2 = null;
        ux ux2 = (ux)this.g.get(n2);
        if (ux2 != null && ux2.b()) {
            bhl bhl3 = ux2.a();
            bhl2 = bhl3.j();
            if (n2 == 0) {
                if (!this.a(bhl3, 10, 46, true)) {
                    return null;
                }
                ux2.a(bhl3, bhl2);
            } else if (n2 >= 10 && n2 < 37 ? !this.a(bhl3, 37, 46, false) : (n2 >= 37 && n2 < 46 ? !this.a(bhl3, 10, 37, false) : !this.a(bhl3, 10, 46, false))) {
                return null;
            }
            if (bhl3.b == 0) {
                ux2.b(null);
            } else {
                ux2.c();
            }
            if (bhl3.b == bhl2.b) {
                return null;
            }
            ux2.a(bdl2, bhl3);
        }
        return bhl2;
    }

    @Override
    public boolean a(bhl bhl2, ux ux2) {
        return ux2.c != this.b && super.a(bhl2, ux2);
    }
}

