/*
 * Decompiled with CFR 0.150.
 */
public class clj
extends apq {
    private final tb a;

    public clj(tb tb2, tb tb3) {
        int n2;
        int n3;
        this.a = tb3;
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 3; ++n2) {
                this.b(new ux(tb3, n2 + n3 * 3, 62 + n2 * 18, 17 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.b(new ux(tb2, n2 + n3 * 9 + 9, 8 + n2 * 18, 84 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 9; ++n3) {
            this.b(new ux(tb2, n3, 8 + n3 * 18, 142));
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
            if (n2 < 9 ? !this.a(bhl3, 9, 45, true) : !this.a(bhl3, 0, 9, false)) {
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

