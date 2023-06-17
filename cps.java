/*
 * Decompiled with CFR 0.150.
 */
import java.util.Arrays;

public class cps
implements tb {
    public final bhl[] a = new bhl[36];
    public final bhl[] b = new bhl[4];
    public final bhl[] c = new bhl[1];
    private final bhl[][] g = new bhl[][]{this.a, this.b, this.c};
    public int d;
    public bdl e;
    private bhl h;
    public boolean f;

    public cps(bdl bdl2) {
        this.e = bdl2;
    }

    public bhl h() {
        if (cps.e(this.d)) {
            return this.a[this.d];
        }
        return null;
    }

    public static int i() {
        return 9;
    }

    private boolean a(bhl bhl2, bhl bhl3) {
        return bhl2 != null && this.b(bhl2, bhl3) && bhl2.c() && bhl2.b < bhl2.b() && bhl2.b < this.d();
    }

    private boolean b(bhl bhl2, bhl bhl3) {
        return bhl2.a() == bhl3.a() && (!bhl2.e() || bhl2.h() == bhl3.h()) && bhl.a(bhl2, bhl3);
    }

    public int j() {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (this.a[i2] != null) continue;
            return i2;
        }
        return -1;
    }

    public void a(bhl bhl2) {
        int n2 = this.b(bhl2);
        if (cps.e(n2)) {
            this.d = n2;
            return;
        }
        if (n2 == -1) {
            int n3;
            this.d = this.k();
            if (this.a[this.d] != null && (n3 = this.j()) != -1) {
                this.a[n3] = this.a[this.d];
            }
            this.a[this.d] = bhl2;
        } else {
            this.d(n2);
        }
    }

    public void d(int n2) {
        this.d = this.k();
        bhl bhl2 = this.a[this.d];
        this.a[this.d] = this.a[n2];
        this.a[n2] = bhl2;
    }

    public static boolean e(int n2) {
        return n2 >= 0 && n2 < 9;
    }

    public int b(bhl bhl2) {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (this.a[i2] == null || !this.b(bhl2, this.a[i2])) continue;
            return i2;
        }
        return -1;
    }

    public int k() {
        int n2;
        int n3;
        for (n3 = 0; n3 < 9; ++n3) {
            n2 = (this.d + n3) % 9;
            if (this.a[n2] != null) continue;
            return n2;
        }
        for (n3 = 0; n3 < 9; ++n3) {
            n2 = (this.d + n3) % 9;
            if (this.a[n2].w()) continue;
            return n2;
        }
        return this.d;
    }

    public void f(int n2) {
        if (n2 > 0) {
            n2 = 1;
        }
        if (n2 < 0) {
            n2 = -1;
        }
        this.d -= n2;
        while (this.d < 0) {
            this.d += 9;
        }
        while (this.d >= 9) {
            this.d -= 9;
        }
    }

    public int a(azg azg2, int n2, int n3, bvp bvp2) {
        int n4;
        int n5 = 0;
        for (n4 = 0; n4 < this.aI_(); ++n4) {
            bhl bhl2 = this.a(n4);
            if (bhl2 == null || azg2 != null && bhl2.a() != azg2 || n2 > -1 && bhl2.h() != n2 || bvp2 != null && !ayj.a(bvp2, bhl2.o(), true)) continue;
            int n6 = n3 <= 0 ? bhl2.b : Math.min(n3 - n5, bhl2.b);
            n5 += n6;
            if (n3 == 0) continue;
            bhl2.b -= n6;
            if (bhl2.b == 0) {
                this.a(n4, null);
            }
            if (n3 <= 0 || n5 < n3) continue;
            return n5;
        }
        if (this.h != null) {
            if (azg2 != null && this.h.a() != azg2) {
                return n5;
            }
            if (n2 > -1 && this.h.h() != n2) {
                return n5;
            }
            if (bvp2 != null && !ayj.a(bvp2, this.h.o(), true)) {
                return n5;
            }
            n4 = n3 <= 0 ? this.h.b : Math.min(n3 - n5, this.h.b);
            n5 += n4;
            if (n3 != 0) {
                this.h.b -= n4;
                if (this.h.b == 0) {
                    this.h = null;
                }
                if (n3 > 0 && n5 >= n3) {
                    return n5;
                }
            }
        }
        return n5;
    }

    private int g(bhl bhl2) {
        int n2;
        azg azg2 = bhl2.a();
        int n3 = bhl2.b;
        int n4 = this.h(bhl2);
        if (n4 == -1) {
            n4 = this.j();
        }
        if (n4 == -1) {
            return n3;
        }
        bhl bhl3 = this.a(n4);
        if (bhl3 == null) {
            bhl3 = new bhl(azg2, 0, bhl2.h());
            if (bhl2.n()) {
                bhl3.d(bhl2.o().d());
            }
            this.a(n4, bhl3);
        }
        if ((n2 = n3) > bhl3.b() - bhl3.b) {
            n2 = bhl3.b() - bhl3.b;
        }
        if (n2 > this.d() - bhl3.b) {
            n2 = this.d() - bhl3.b;
        }
        if (n2 == 0) {
            return n3;
        }
        bhl3.b += n2;
        bhl3.c = 5;
        return n3 -= n2;
    }

    private int h(bhl bhl2) {
        if (this.a(this.a(this.d), bhl2)) {
            return this.d;
        }
        if (this.a(this.a(40), bhl2)) {
            return 40;
        }
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (!this.a(this.a[i2], bhl2)) continue;
            return i2;
        }
        return -1;
    }

    public void l() {
        for (bhl[] arrbhl : this.g) {
            for (int i2 = 0; i2 < arrbhl.length; ++i2) {
                if (arrbhl[i2] == null) continue;
                arrbhl[i2].a(this.e.aQ, this.e, i2, this.d == i2);
            }
        }
    }

    public boolean c(bhl bhl2) {
        if (bhl2 == null || bhl2.b == 0 || bhl2.a() == null) {
            return false;
        }
        try {
            if (!bhl2.f()) {
                int n2;
                do {
                    n2 = bhl2.b;
                    bhl2.b = this.g(bhl2);
                } while (bhl2.b > 0 && bhl2.b < n2);
                if (bhl2.b == n2 && this.e.G.d) {
                    bhl2.b = 0;
                    return true;
                }
                return bhl2.b < n2;
            }
            int n3 = this.j();
            if (n3 >= 0) {
                this.a[n3] = bhl.c(bhl2);
                this.a[n3].c = 5;
                bhl2.b = 0;
                return true;
            }
            if (this.e.G.d) {
                bhl2.b = 0;
                return true;
            }
            return false;
        }
        catch (Throwable throwable) {
            cet cet2 = cet.a(throwable, "Adding item to inventory");
            sx sx2 = cet2.a("Item being added");
            sx2.a("Item ID", azg.a(bhl2.a()));
            sx2.a("Item data", bhl2.h());
            sx2.a("Item name", new vy(this, bhl2));
            throw new oz(cet2);
        }
    }

    @Override
    public bhl a(int n2, int n3) {
        bhl[] arrbhl = null;
        for (bhl[] arrbhl2 : this.g) {
            if (n2 < arrbhl2.length) {
                arrbhl = arrbhl2;
                break;
            }
            n2 -= arrbhl2.length;
        }
        if (arrbhl != null && arrbhl[n2] != null) {
            return cjk.a(arrbhl, n2, n3);
        }
        return null;
    }

    public void d(bhl bhl2) {
        block0: for (bhl[] arrbhl : this.g) {
            for (int i2 = 0; i2 < arrbhl.length; ++i2) {
                if (arrbhl[i2] != bhl2) continue;
                arrbhl[i2] = null;
                continue block0;
            }
        }
    }

    @Override
    public bhl b(int n2) {
        bhl[] arrbhl = null;
        for (bhl[] arrbhl2 : this.g) {
            if (n2 < arrbhl2.length) {
                arrbhl = arrbhl2;
                break;
            }
            n2 -= arrbhl2.length;
        }
        if (arrbhl != null && arrbhl[n2] != null) {
            bhl[][] arrbhl3 = arrbhl[n2];
            arrbhl[n2] = null;
            return arrbhl3;
        }
        return null;
    }

    @Override
    public void a(int n2, bhl bhl2) {
        bhl[] arrbhl = null;
        for (bhl[] arrbhl2 : this.g) {
            if (n2 < arrbhl2.length) {
                arrbhl = arrbhl2;
                break;
            }
            n2 -= arrbhl2.length;
        }
        if (arrbhl != null) {
            arrbhl[n2] = bhl2;
        }
    }

    public float a(dbk dbk2) {
        float f2 = 1.0f;
        if (this.a[this.d] != null) {
            f2 *= this.a[this.d].a(dbk2);
        }
        return f2;
    }

    public bmh a(bmh bmh2) {
        bvp bvp2;
        int n2;
        for (n2 = 0; n2 < this.a.length; ++n2) {
            if (this.a[n2] == null) continue;
            bvp2 = new bvp();
            bvp2.a("Slot", (byte)n2);
            this.a[n2].b(bvp2);
            bmh2.a(bvp2);
        }
        for (n2 = 0; n2 < this.b.length; ++n2) {
            if (this.b[n2] == null) continue;
            bvp2 = new bvp();
            bvp2.a("Slot", (byte)(n2 + 100));
            this.b[n2].b(bvp2);
            bmh2.a(bvp2);
        }
        for (n2 = 0; n2 < this.c.length; ++n2) {
            if (this.c[n2] == null) continue;
            bvp2 = new bvp();
            bvp2.a("Slot", (byte)(n2 + 150));
            this.c[n2].b(bvp2);
            bmh2.a(bvp2);
        }
        return bmh2;
    }

    public void b(bmh bmh2) {
        Arrays.fill(this.a, null);
        Arrays.fill(this.b, null);
        Arrays.fill(this.c, null);
        for (int i2 = 0; i2 < bmh2.b(); ++i2) {
            bvp bvp2 = bmh2.b(i2);
            int n2 = bvp2.f("Slot") & 0xFF;
            bhl bhl2 = bhl.a(bvp2);
            if (bhl2 == null) continue;
            if (n2 >= 0 && n2 < this.a.length) {
                this.a[n2] = bhl2;
                continue;
            }
            if (n2 >= 100 && n2 < this.b.length + 100) {
                this.b[n2 - 100] = bhl2;
                continue;
            }
            if (n2 < 150 || n2 >= this.c.length + 150) continue;
            this.c[n2 - 150] = bhl2;
        }
    }

    @Override
    public int aI_() {
        return this.a.length + this.b.length + this.c.length;
    }

    @Override
    public bhl a(int n2) {
        bhl[] arrbhl = null;
        for (bhl[] arrbhl2 : this.g) {
            if (n2 < arrbhl2.length) {
                arrbhl = arrbhl2;
                break;
            }
            n2 -= arrbhl2.length;
        }
        return arrbhl == null ? null : arrbhl[n2];
    }

    @Override
    public String i_() {
        return "container.inventory";
    }

    @Override
    public boolean j_() {
        return false;
    }

    @Override
    public cbg v() {
        if (this.j_()) {
            return new aym(this.i_());
        }
        return new du(this.i_(), new Object[0]);
    }

    @Override
    public int d() {
        return 64;
    }

    public boolean b(dbk dbk2) {
        if (dbk2.a().k()) {
            return true;
        }
        bhl bhl2 = this.a(this.d);
        if (bhl2 != null) {
            return bhl2.b(dbk2);
        }
        return false;
    }

    public bhl g(int n2) {
        return this.b[n2];
    }

    public void a(float f2) {
        if ((f2 /= 4.0f) < 1.0f) {
            f2 = 1.0f;
        }
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            if (this.b[i2] == null || !(this.b[i2].a() instanceof uh)) continue;
            this.b[i2].a((int)f2, (bga)this.e);
            if (this.b[i2].b != 0) continue;
            this.b[i2] = null;
        }
    }

    public void m() {
        for (bhl[] arrbhl : this.g) {
            for (int i2 = 0; i2 < arrbhl.length; ++i2) {
                if (arrbhl[i2] == null) continue;
                this.e.a(arrbhl[i2], true, false);
                arrbhl[i2] = null;
            }
        }
    }

    @Override
    public void c_() {
        this.f = true;
    }

    public void e(bhl bhl2) {
        this.h = bhl2;
    }

    public bhl n() {
        return this.h;
    }

    @Override
    public boolean a(bdl bdl2) {
        if (this.e.bk) {
            return false;
        }
        return !(bdl2.l(this.e) > 64.0);
    }

    public boolean f(bhl bhl2) {
        bhl[][] arrbhl = this.g;
        int n2 = arrbhl.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            bhl[] arrbhl2;
            for (bhl bhl3 : arrbhl2 = arrbhl[i2]) {
                if (bhl3 == null || !bhl3.a(bhl2)) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public void b(bdl bdl2) {
    }

    @Override
    public void c(bdl bdl2) {
    }

    @Override
    public boolean b(int n2, bhl bhl2) {
        return true;
    }

    public void a(cps cps2) {
        for (int i2 = 0; i2 < this.aI_(); ++i2) {
            this.a(i2, cps2.a(i2));
        }
        this.d = cps2.d;
    }

    @Override
    public int c(int n2) {
        return 0;
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public int f() {
        return 0;
    }

    @Override
    public void g() {
        for (bhl[] arrbhl : this.g) {
            for (int i2 = 0; i2 < arrbhl.length; ++i2) {
                arrbhl[i2] = null;
            }
        }
    }
}

