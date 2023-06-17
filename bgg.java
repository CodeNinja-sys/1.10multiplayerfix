/*
 * Decompiled with CFR 0.150.
 */
public class bgg
extends apq {
    private static final dfm[] d = new dfm[]{dfm.f, dfm.e, dfm.d, dfm.c};
    public yo a = new yo(this, 2, 2);
    public tb b = new cad();
    public boolean c;
    private final bdl e;

    public bgg(cps cps2, boolean bl2, bdl bdl2) {
        int n2;
        this.c = bl2;
        this.e = bdl2;
        this.b(new aul(cps2.e, this.a, this.b, 0, 154, 28));
        for (n2 = 0; n2 < 2; ++n2) {
            for (int i2 = 0; i2 < 2; ++i2) {
                this.b(new ux(this.a, i2 + n2 * 2, 98 + i2 * 18, 18 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 4; ++n2) {
            dfm dfm2 = d[n2];
            this.b(new py(this, cps2, 36 + (3 - n2), 8, 8 + n2 * 18, dfm2));
        }
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i3 = 0; i3 < 9; ++i3) {
                this.b(new ux(cps2, i3 + (n2 + 1) * 9, 8 + i3 * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.b(new ux(cps2, n2, 8 + n2 * 18, 142));
        }
        this.b(new caw(this, cps2, 40, 77, 62));
        this.a(this.a);
    }

    @Override
    public void a(tb tb2) {
        this.b.a(0, gx.a().a(this.a, this.e.aQ));
    }

    @Override
    public void a(bdl bdl2) {
        super.a(bdl2);
        for (int i2 = 0; i2 < 4; ++i2) {
            bhl bhl2 = this.a.b(i2);
            if (bhl2 == null) continue;
            bdl2.a(bhl2, false);
        }
        this.b.a(0, null);
    }

    @Override
    public boolean b(bdl bdl2) {
        return true;
    }

    @Override
    public bhl b(bdl bdl2, int n2) {
        bhl bhl2 = null;
        ux ux2 = (ux)this.g.get(n2);
        if (ux2 != null && ux2.b()) {
            int n3;
            bhl bhl3 = ux2.a();
            bhl2 = bhl3.j();
            dfm dfm2 = xy.c(bhl2);
            if (n2 == 0) {
                if (!this.a(bhl3, 9, 45, true)) {
                    return null;
                }
                ux2.a(bhl3, bhl2);
            } else if (n2 >= 1 && n2 < 5 ? !this.a(bhl3, 9, 45, false) : (n2 >= 5 && n2 < 9 ? !this.a(bhl3, 9, 45, false) : (dfm2.a() == dfd.b && !((ux)this.g.get(8 - dfm2.b())).b() ? !this.a(bhl3, n3 = 8 - dfm2.b(), n3 + 1, false) : (dfm2 == dfm.b && !((ux)this.g.get(45)).b() ? !this.a(bhl3, 45, 46, false) : (n2 >= 9 && n2 < 36 ? !this.a(bhl3, 36, 45, false) : (n2 >= 36 && n2 < 45 ? !this.a(bhl3, 9, 36, false) : !this.a(bhl3, 9, 45, false))))))) {
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

