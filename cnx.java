/*
 * Decompiled with CFR 0.150.
 */
public class cnx
extends apq {
    private final tb a;
    private final int b;

    public cnx(tb tb2, tb tb3, bdl bdl2) {
        int n2;
        int n3;
        this.a = tb3;
        this.b = tb3.aI_() / 9;
        tb3.b(bdl2);
        int n4 = (this.b - 4) * 18;
        for (n3 = 0; n3 < this.b; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.b(new ux(tb3, n2 + n3 * 9, 8 + n2 * 18, 18 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.b(new ux(tb2, n2 + n3 * 9 + 9, 8 + n2 * 18, 103 + n3 * 18 + n4));
            }
        }
        for (n3 = 0; n3 < 9; ++n3) {
            this.b(new ux(tb2, n3, 8 + n3 * 18, 161 + n4));
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
            if (n2 < this.b * 9 ? !this.a(bhl3, this.b * 9, this.g.size(), true) : !this.a(bhl3, 0, this.b * 9, false)) {
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

    public tb b() {
        return this.a;
    }
}

