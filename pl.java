/*
 * Decompiled with CFR 0.150.
 */
class pl
implements aho {
    private pl() {
    }

    @Override
    public boolean a(yo yo2, iu iu2) {
        bhl bhl2 = null;
        bhl bhl3 = null;
        for (int i2 = 0; i2 < yo2.aI_(); ++i2) {
            boolean bl2;
            bhl bhl4 = yo2.a(i2);
            if (bhl4 == null) continue;
            if (bhl4.a() != hp.cO) {
                return false;
            }
            if (bhl2 != null && bhl3 != null) {
                return false;
            }
            int n2 = cwd.b(bhl4);
            boolean bl3 = bl2 = cwd.c(bhl4) > 0;
            if (bhl2 != null) {
                if (bl2) {
                    return false;
                }
                if (n2 != cwd.b(bhl2)) {
                    return false;
                }
                bhl3 = bhl4;
                continue;
            }
            if (bhl3 != null) {
                if (!bl2) {
                    return false;
                }
                if (n2 != cwd.b(bhl3)) {
                    return false;
                }
                bhl2 = bhl4;
                continue;
            }
            if (bl2) {
                bhl2 = bhl4;
                continue;
            }
            bhl3 = bhl4;
        }
        return bhl2 != null && bhl3 != null;
    }

    @Override
    public bhl a(yo yo2) {
        for (int i2 = 0; i2 < yo2.aI_(); ++i2) {
            bhl bhl2 = yo2.a(i2);
            if (bhl2 == null || cwd.c(bhl2) <= 0) continue;
            bhl bhl3 = bhl2.j();
            bhl3.b = 1;
            return bhl3;
        }
        return null;
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public bhl b() {
        return null;
    }

    @Override
    public bhl[] b(yo yo2) {
        bhl[] arrbhl = new bhl[yo2.aI_()];
        for (int i2 = 0; i2 < arrbhl.length; ++i2) {
            bhl bhl2 = yo2.a(i2);
            if (bhl2 == null) continue;
            if (bhl2.a().q()) {
                arrbhl[i2] = new bhl(bhl2.a().p());
                continue;
            }
            if (!bhl2.n() || cwd.c(bhl2) <= 0) continue;
            arrbhl[i2] = bhl2.j();
            arrbhl[i2].b = 1;
        }
        return arrbhl;
    }

    /* synthetic */ pl(apc apc2) {
        this();
    }
}

