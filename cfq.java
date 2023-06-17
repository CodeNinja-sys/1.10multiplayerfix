/*
 * Decompiled with CFR 0.150.
 */
public class cfq
extends apq {
    private final tb a;

    public cfq(cps cps2, tb tb2, bdl bdl2) {
        int n2;
        this.a = tb2;
        tb2.b(bdl2);
        int n3 = 51;
        for (n2 = 0; n2 < tb2.aI_(); ++n2) {
            this.b(new ux(tb2, n2, 44 + n2 * 18, 20));
        }
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.b(new ux(cps2, i2 + n2 * 9 + 9, 8 + i2 * 18, n2 * 18 + 51));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.b(new ux(cps2, n2, 8 + n2 * 18, 109));
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
            if (n2 < this.a.aI_() ? !this.a(bhl3, this.a.aI_(), this.g.size(), true) : !this.a(bhl3, 0, this.a.aI_(), false)) {
                return null;
            }
            if (bhl3.b == 0) {
                ux2.b(null);
            } else {
                ux2.c();
            }
        }
        return bhl2;
    }

    @Override
    public void a(bdl bdl2) {
        super.a(bdl2);
        this.a.c(bdl2);
    }
}

