/*
 * Decompiled with CFR 0.150.
 */
public class bol
extends apq {
    private final tb a;
    private final ux b;
    private int c;
    private int d;

    public bol(cps cps2, tb tb2) {
        int n2;
        this.a = tb2;
        this.b(new cfd(cps2.e, tb2, 0, 56, 51));
        this.b(new cfd(cps2.e, tb2, 1, 79, 58));
        this.b(new cfd(cps2.e, tb2, 2, 102, 51));
        this.b = this.b(new bto(tb2, 3, 79, 17));
        this.b(new cgr(tb2, 4, 17, 17));
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.b(new ux(cps2, i2 + n2 * 9 + 9, 8 + i2 * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.b(new ux(cps2, n2, 8 + n2 * 18, 142));
        }
    }

    @Override
    public void b(cpx cpx2) {
        super.b(cpx2);
        cpx2.a((apq)this, this.a);
    }

    @Override
    public void a() {
        super.a();
        for (int i2 = 0; i2 < this.i.size(); ++i2) {
            cpx cpx2 = (cpx)this.i.get(i2);
            if (this.c != this.a.c(0)) {
                cpx2.a((apq)this, 0, this.a.c(0));
            }
            if (this.d == this.a.c(1)) continue;
            cpx2.a((apq)this, 1, this.a.c(1));
        }
        this.c = this.a.c(0);
        this.d = this.a.c(1);
    }

    @Override
    public void a(int n2, int n3) {
        this.a.b(n2, n3);
    }

    @Override
    public boolean b(bdl bdl2) {
        return this.a.a(bdl2);
    }

    @Override
    public bhl b(bdl bdl2, int n2) {
        bhl bhl2 = null;
        ux ux2 = (ux)this.g.get(n2);
        if (ux2 != null && ux2.b()) {
            bhl bhl3 = ux2.a();
            bhl2 = bhl3.j();
            if (n2 >= 0 && n2 <= 2 || n2 == 3 || n2 == 4) {
                if (!this.a(bhl3, 5, 41, true)) {
                    return null;
                }
                ux2.a(bhl3, bhl2);
            } else if (!this.b.b() && this.b.a(bhl3) ? !this.a(bhl3, 3, 4, false) : (cfd.e(bhl2) ? !this.a(bhl3, 0, 3, false) : (cgr.e(bhl2) ? !this.a(bhl3, 4, 5, false) : (n2 >= 5 && n2 < 32 ? !this.a(bhl3, 32, 41, false) : (n2 >= 32 && n2 < 41 ? !this.a(bhl3, 5, 32, false) : !this.a(bhl3, 5, 41, false)))))) {
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
}

