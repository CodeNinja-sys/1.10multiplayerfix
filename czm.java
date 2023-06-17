/*
 * Decompiled with CFR 0.150.
 */
public class czm
implements aho {
    @Override
    public boolean a(yo yo2, iu iu2) {
        int n2 = 0;
        bhl bhl2 = null;
        for (int i2 = 0; i2 < yo2.aI_(); ++i2) {
            bhl bhl3 = yo2.a(i2);
            if (bhl3 == null) continue;
            if (bhl3.a() == hp.bX) {
                if (bhl2 != null) {
                    return false;
                }
                bhl2 = bhl3;
                continue;
            }
            if (bhl3.a() == hp.bW) {
                ++n2;
                continue;
            }
            return false;
        }
        return bhl2 != null && n2 > 0;
    }

    @Override
    public bhl a(yo yo2) {
        int n2 = 0;
        bhl bhl2 = null;
        for (int i2 = 0; i2 < yo2.aI_(); ++i2) {
            bhl bhl3 = yo2.a(i2);
            if (bhl3 == null) continue;
            if (bhl3.a() == hp.bX) {
                if (bhl2 != null) {
                    return null;
                }
                bhl2 = bhl3;
                continue;
            }
            if (bhl3.a() == hp.bW) {
                ++n2;
                continue;
            }
            return null;
        }
        if (bhl2 == null || n2 < 1 || daa.h(bhl2) >= 2) {
            return null;
        }
        bhl bhl4 = new bhl(hp.bX, n2);
        bhl4.d(bhl2.o().d());
        bhl4.o().a("generation", daa.h(bhl2) + 1);
        if (bhl2.s()) {
            bhl4.a(bhl2.q());
        }
        return bhl4;
    }

    @Override
    public int a() {
        return 9;
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
            if (bhl2 == null || !(bhl2.a() instanceof daa)) continue;
            arrbhl[i2] = bhl2.j();
            arrbhl[i2].b = 1;
            break;
        }
        return arrbhl;
    }
}

