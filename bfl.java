/*
 * Decompiled with CFR 0.150.
 */
public class bfl
extends apq {
    private final tb a;
    private final it b;

    public bfl(tb tb2, tb tb3, it it2, bdl bdl2) {
        int n2;
        int n3;
        this.a = tb3;
        this.b = it2;
        int n4 = 3;
        tb3.b(bdl2);
        int n5 = -18;
        this.b(new cgf(this, tb3, 0, 8, 18));
        this.b(new aeo(this, tb3, 1, 8, 36, it2));
        if (it2.I()) {
            for (n3 = 0; n3 < 3; ++n3) {
                for (n2 = 0; n2 < 5; ++n2) {
                    this.b(new ux(tb3, 2 + n2 + n3 * 5, 80 + n2 * 18, 18 + n3 * 18));
                }
            }
        }
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.b(new ux(tb2, n2 + n3 * 9 + 9, 8 + n2 * 18, 102 + n3 * 18 + -18));
            }
        }
        for (n3 = 0; n3 < 9; ++n3) {
            this.b(new ux(tb2, n3, 8 + n3 * 18, 142));
        }
    }

    @Override
    public boolean b(bdl bdl2) {
        return this.a.a(bdl2) && this.b.bj() && this.b.k(bdl2) < 8.0f;
    }

    @Override
    public bhl b(bdl bdl2, int n2) {
        bhl bhl2 = null;
        ux ux2 = (ux)this.g.get(n2);
        if (ux2 != null && ux2.b()) {
            bhl bhl3 = ux2.a();
            bhl2 = bhl3.j();
            if (n2 < this.a.aI_() ? !this.a(bhl3, this.a.aI_(), this.g.size(), true) : (this.a(1).a(bhl3) && !this.a(1).b() ? !this.a(bhl3, 1, 2, false) : (this.a(0).a(bhl3) ? !this.a(bhl3, 0, 1, false) : this.a.aI_() <= 2 || !this.a(bhl3, 2, this.a.aI_(), false)))) {
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

