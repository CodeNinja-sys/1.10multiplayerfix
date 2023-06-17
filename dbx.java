/*
 * Decompiled with CFR 0.150.
 */
public class dbx
extends apq {
    private final fc a;
    private final avq b;
    private final iu c;

    public dbx(cps cps2, fc fc2, iu iu2) {
        int n2;
        this.a = fc2;
        this.c = iu2;
        this.b = new avq(cps2.e, fc2);
        this.b(new ux(this.b, 0, 36, 53));
        this.b(new ux(this.b, 1, 62, 53));
        this.b(new chm(cps2.e, fc2, this.b, 2, 120, 53));
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.b(new ux(cps2, i2 + n2 * 9 + 9, 8 + i2 * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.b(new ux(cps2, n2, 8 + n2 * 18, 142));
        }
    }

    public avq b() {
        return this.b;
    }

    @Override
    public void b(cpx cpx2) {
        super.b(cpx2);
    }

    @Override
    public void a() {
        super.a();
    }

    @Override
    public void a(tb tb2) {
        this.b.h();
        super.a(tb2);
    }

    public void d(int n2) {
        this.b.d(n2);
    }

    @Override
    public void a(int n2, int n3) {
    }

    @Override
    public boolean b(bdl bdl2) {
        return this.a.b() == bdl2;
    }

    @Override
    public bhl b(bdl bdl2, int n2) {
        bhl bhl2 = null;
        ux ux2 = (ux)this.g.get(n2);
        if (ux2 != null && ux2.b()) {
            bhl bhl3 = ux2.a();
            bhl2 = bhl3.j();
            if (n2 == 2) {
                if (!this.a(bhl3, 3, 39, true)) {
                    return null;
                }
                ux2.a(bhl3, bhl2);
            } else if (n2 == 0 || n2 == 1 ? !this.a(bhl3, 3, 39, false) : (n2 >= 3 && n2 < 30 ? !this.a(bhl3, 30, 39, false) : n2 >= 30 && n2 < 39 && !this.a(bhl3, 3, 30, false))) {
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
    public void a(bdl bdl2) {
        super.a(bdl2);
        this.a.a((bdl)null);
        super.a(bdl2);
        if (this.c.C) {
            return;
        }
        bhl bhl2 = this.b.b(0);
        if (bhl2 != null) {
            bdl2.a(bhl2, false);
        }
        if ((bhl2 = this.b.b(1)) != null) {
            bdl2.a(bhl2, false);
        }
    }
}

