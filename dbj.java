/*
 * Decompiled with CFR 0.150.
 */
public class dbj
implements aho {
    private final int a;
    private final int b;
    private final bhl[] c;
    private final bhl d;
    private boolean e;

    public dbj(int n2, int n3, bhl[] arrbhl, bhl bhl2) {
        this.a = n2;
        this.b = n3;
        this.c = arrbhl;
        this.d = bhl2;
    }

    @Override
    public bhl b() {
        return this.d;
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

    @Override
    public boolean a(yo yo2, iu iu2) {
        for (int i2 = 0; i2 <= 3 - this.a; ++i2) {
            for (int i3 = 0; i3 <= 3 - this.b; ++i3) {
                if (this.a(yo2, i2, i3, true)) {
                    return true;
                }
                if (!this.a(yo2, i2, i3, false)) continue;
                return true;
            }
        }
        return false;
    }

    private boolean a(yo yo2, int n2, int n3, boolean bl2) {
        for (int i2 = 0; i2 < 3; ++i2) {
            for (int i3 = 0; i3 < 3; ++i3) {
                bhl bhl2;
                int n4 = i2 - n2;
                int n5 = i3 - n3;
                bhl bhl3 = null;
                if (n4 >= 0 && n5 >= 0 && n4 < this.a && n5 < this.b) {
                    bhl3 = bl2 ? this.c[this.a - n4 - 1 + n5 * this.a] : this.c[n4 + n5 * this.a];
                }
                if ((bhl2 = yo2.c(i2, i3)) == null && bhl3 == null) continue;
                if (bhl2 == null && bhl3 != null || bhl2 != null && bhl3 == null) {
                    return false;
                }
                if (bhl3.a() != bhl2.a()) {
                    return false;
                }
                if (bhl3.h() == 32767 || bhl3.h() == bhl2.h()) continue;
                return false;
            }
        }
        return true;
    }

    @Override
    public bhl a(yo yo2) {
        bhl bhl2 = this.b().j();
        if (this.e) {
            for (int i2 = 0; i2 < yo2.aI_(); ++i2) {
                bhl bhl3 = yo2.a(i2);
                if (bhl3 == null || !bhl3.n()) continue;
                bhl2.d(bhl3.o().d());
            }
        }
        return bhl2;
    }

    @Override
    public int a() {
        return this.a * this.b;
    }
}

