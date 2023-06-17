/*
 * Decompiled with CFR 0.150.
 */
class bua
implements aho {
    private bua() {
    }

    @Override
    public boolean a(yo yo2, iu iu2) {
        bhl bhl2 = null;
        bhl bhl3 = null;
        for (int i2 = 0; i2 < yo2.aI_(); ++i2) {
            bhl bhl4 = yo2.a(i2);
            if (bhl4 == null) continue;
            if (bhl4.a() == hp.cO) {
                if (bhl3 != null) {
                    return false;
                }
                bhl3 = bhl4;
                continue;
            }
            if (bhl4.a() == hp.cQ) {
                if (bhl2 != null) {
                    return false;
                }
                if (bhl4.a("BlockEntityTag", false) != null) {
                    return false;
                }
                bhl2 = bhl4;
                continue;
            }
            return false;
        }
        return bhl2 != null && bhl3 != null;
    }

    @Override
    public bhl a(yo yo2) {
        dck dck2;
        Object object;
        bhl bhl2 = null;
        for (int i2 = 0; i2 < yo2.aI_(); ++i2) {
            object = yo2.a(i2);
            if (object == null || ((bhl)object).a() != hp.cO) continue;
            bhl2 = object;
        }
        bhl bhl3 = new bhl(hp.cQ, 1, 0);
        if (bhl2.n()) {
            object = bhl2.o().d();
            dck2 = dck.a(cwd.b(bhl2));
        } else {
            object = new bvp();
            dck2 = dck.a(bhl2.g());
        }
        bhl3.d((bvp)object);
        cwd.a(bhl3, dck2);
        return bhl3;
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
            if (bhl2 == null || !bhl2.a().q()) continue;
            arrbhl[i2] = new bhl(bhl2.a().p());
        }
        return arrbhl;
    }

    /* synthetic */ bua(czr czr2) {
        this();
    }
}

