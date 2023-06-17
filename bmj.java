/*
 * Decompiled with CFR 0.150.
 */
public class bmj
extends apq {
    private final tb a;
    private final dft b;

    public bmj(tb tb2, tb tb3) {
        int n2;
        this.a = tb3;
        this.b = new dft(this, tb3, 0, 136, 110);
        this.b(this.b);
        int n3 = 36;
        int n4 = 137;
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.b(new ux(tb2, i2 + n2 * 9 + 9, 36 + i2 * 18, 137 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.b(new ux(tb2, n2, 36 + n2 * 18, 195));
        }
    }

    @Override
    public void b(cpx cpx2) {
        super.b(cpx2);
        cpx2.a((apq)this, this.a);
    }

    @Override
    public void a(int n2, int n3) {
        this.a.b(n2, n3);
    }

    public tb b() {
        return this.a;
    }

    @Override
    public void a(bdl bdl2) {
        super.a(bdl2);
        if (bdl2 == null || bdl2.aQ.C) {
            return;
        }
        bhl bhl2 = this.b.a(this.b.d());
        if (bhl2 != null) {
            bdl2.a(bhl2, false);
        }
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
            if (n2 == 0) {
                if (!this.a(bhl3, 1, 37, true)) {
                    return null;
                }
                ux2.a(bhl3, bhl2);
            } else if (!this.b.b() && this.b.a(bhl3) && bhl3.b == 1 ? !this.a(bhl3, 0, 1, false) : (n2 >= 1 && n2 < 28 ? !this.a(bhl3, 28, 37, false) : (n2 >= 28 && n2 < 37 ? !this.a(bhl3, 1, 28, false) : !this.a(bhl3, 1, 37, false)))) {
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

