/*
 * Decompiled with CFR 0.150.
 */
public class aw
extends dbj {
    public aw() {
        super(3, 3, new bhl[]{new bhl(hp.aR), new bhl(hp.aR), new bhl(hp.aR), new bhl(hp.aR), new bhl(hp.bk, 0, 32767), new bhl(hp.aR), new bhl(hp.aR), new bhl(hp.aR), new bhl(hp.aR)}, new bhl(hp.cf, 0, 0));
    }

    @Override
    public boolean a(yo yo2, iu iu2) {
        if (!super.a(yo2, iu2)) {
            return false;
        }
        bhl bhl2 = null;
        for (int i2 = 0; i2 < yo2.aI_() && bhl2 == null; ++i2) {
            bhl bhl3 = yo2.a(i2);
            if (bhl3 == null || bhl3.a() != hp.bk) continue;
            bhl2 = bhl3;
        }
        if (bhl2 == null) {
            return false;
        }
        aph aph2 = hp.bk.a(bhl2, iu2);
        if (aph2 == null) {
            return false;
        }
        return aph2.f < 4;
    }

    @Override
    public bhl a(yo yo2) {
        bhl bhl2 = null;
        for (int i2 = 0; i2 < yo2.aI_() && bhl2 == null; ++i2) {
            bhl bhl3 = yo2.a(i2);
            if (bhl3 == null || bhl3.a() != hp.bk) continue;
            bhl2 = bhl3;
        }
        bhl2 = bhl2.j();
        bhl2.b = 1;
        if (bhl2.o() == null) {
            bhl2.d(new bvp());
        }
        bhl2.o().a("map_scale_direction", 1);
        return bhl2;
    }
}

