/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;

public class das
implements aho {
    private bhl a;

    @Override
    public boolean a(yo yo2, iu iu2) {
        Object object;
        this.a = null;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        for (int i2 = 0; i2 < yo2.aI_(); ++i2) {
            object = yo2.a(i2);
            if (object == null) continue;
            if (((bhl)object).a() == hp.J) {
                ++n3;
                continue;
            }
            if (((bhl)object).a() == hp.cm) {
                ++n5;
                continue;
            }
            if (((bhl)object).a() == hp.bd) {
                ++n4;
                continue;
            }
            if (((bhl)object).a() == hp.aR) {
                ++n2;
                continue;
            }
            if (((bhl)object).a() == hp.ba) {
                ++n6;
                continue;
            }
            if (((bhl)object).a() == hp.k) {
                ++n6;
                continue;
            }
            if (((bhl)object).a() == hp.bV) {
                ++n7;
                continue;
            }
            if (((bhl)object).a() == hp.I) {
                ++n7;
                continue;
            }
            if (((bhl)object).a() == hp.bE) {
                ++n7;
                continue;
            }
            if (((bhl)object).a() == hp.ch) {
                ++n7;
                continue;
            }
            return false;
        }
        n6 += n4 + n7;
        if (n3 > 3 || n2 > 1) {
            return false;
        }
        if (n3 >= 1 && n2 == 1 && n6 == 0) {
            this.a = new bhl(hp.cl, 3);
            if (n5 > 0) {
                bvp bvp2 = new bvp();
                object = new bvp();
                bmh bmh2 = new bmh();
                for (int i3 = 0; i3 < yo2.aI_(); ++i3) {
                    bhl bhl2 = yo2.a(i3);
                    if (bhl2 == null || bhl2.a() != hp.cm || !bhl2.n() || !bhl2.o().b("Explosion", 10)) continue;
                    bmh2.a(bhl2.o().o("Explosion"));
                }
                ((bvp)object).a("Explosions", bmh2);
                ((bvp)object).a("Flight", (byte)n3);
                bvp2.a("Fireworks", (azt)object);
                this.a.d(bvp2);
            }
            return true;
        }
        if (n3 == 1 && n2 == 0 && n5 == 0 && n4 > 0 && n7 <= 1) {
            this.a = new bhl(hp.cm);
            bvp bvp3 = new bvp();
            object = new bvp();
            int n8 = 0;
            ArrayList arrayList = ov.a();
            for (int i4 = 0; i4 < yo2.aI_(); ++i4) {
                bhl bhl3 = yo2.a(i4);
                if (bhl3 == null) continue;
                if (bhl3.a() == hp.bd) {
                    arrayList.add(hr.a[bhl3.h() & 0xF]);
                    continue;
                }
                if (bhl3.a() == hp.ba) {
                    ((bvp)object).a("Flicker", true);
                    continue;
                }
                if (bhl3.a() == hp.k) {
                    ((bvp)object).a("Trail", true);
                    continue;
                }
                if (bhl3.a() == hp.bV) {
                    n8 = 1;
                    continue;
                }
                if (bhl3.a() == hp.I) {
                    n8 = 4;
                    continue;
                }
                if (bhl3.a() == hp.bE) {
                    n8 = 2;
                    continue;
                }
                if (bhl3.a() != hp.ch) continue;
                n8 = 3;
            }
            int[] arrn = new int[arrayList.size()];
            for (int i5 = 0; i5 < arrn.length; ++i5) {
                arrn[i5] = (Integer)arrayList.get(i5);
            }
            ((bvp)object).a("Colors", arrn);
            ((bvp)object).a("Type", (byte)n8);
            bvp3.a("Explosion", (azt)object);
            this.a.d(bvp3);
            return true;
        }
        if (n3 == 0 && n2 == 0 && n5 == 1 && n4 > 0 && n4 == n6) {
            bvp bvp4;
            ArrayList arrayList = ov.a();
            for (int i6 = 0; i6 < yo2.aI_(); ++i6) {
                bhl bhl4 = yo2.a(i6);
                if (bhl4 == null) continue;
                if (bhl4.a() == hp.bd) {
                    arrayList.add(hr.a[bhl4.h() & 0xF]);
                    continue;
                }
                if (bhl4.a() != hp.cm) continue;
                this.a = bhl4.j();
                this.a.b = 1;
            }
            int[] arrn = new int[arrayList.size()];
            for (int i7 = 0; i7 < arrn.length; ++i7) {
                arrn[i7] = (Integer)arrayList.get(i7);
            }
            if (this.a != null && this.a.n()) {
                bvp4 = this.a.o().o("Explosion");
                if (bvp4 == null) {
                    return false;
                }
            } else {
                return false;
            }
            bvp4.a("FadeColors", arrn);
            return true;
        }
        return false;
    }

    @Override
    public bhl a(yo yo2) {
        return this.a.j();
    }

    @Override
    public int a() {
        return 10;
    }

    @Override
    public bhl b() {
        return this.a;
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
}

