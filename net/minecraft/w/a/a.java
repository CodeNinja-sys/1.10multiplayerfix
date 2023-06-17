/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.a;

import java.util.Arrays;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.e.u;
import net.minecraft.h.v;
import net.minecraft.h.y;
import net.minecraft.k.i;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.dn;
import net.minecraft.u.bo;
import net.minecraft.u.d.k;
import net.minecraft.w.a.b;
import net.minecraft.w.a.c;
import net.minecraft.w.l;

public class a
implements y {
    public final cu[] a = new cu[36];
    public final cu[] b = new cu[4];
    public final cu[] c = new cu[1];
    private final cu[][] g = new cu[][]{this.a, this.b, this.c};
    public int d;
    public b e;
    private cu h;
    public boolean f;

    public a(b b2) {
        this.e = b2;
    }

    public cu a() {
        return net.minecraft.w.a.a.e(this.d) ? this.a[this.d] : null;
    }

    public static int c() {
        return 9;
    }

    private boolean a(cu cu2, cu cu3) {
        return cu2 != null && this.b(cu2, cu3) && cu2.c() && cu2.b < cu2.b() && cu2.b < this.g();
    }

    private boolean b(cu cu2, cu cu3) {
        return cu2.a() == cu3.a() && (!cu2.e() || cu2.h() == cu3.h()) && cu.a(cu2, cu3);
    }

    public int d() {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (this.a[i2] != null) continue;
            return i2;
        }
        return -1;
    }

    public void a(cu cu2) {
        int n2 = this.b(cu2);
        if (net.minecraft.w.a.a.e(n2)) {
            this.d = n2;
        } else if (n2 == -1) {
            int n3;
            this.d = this.f();
            if (this.a[this.d] != null && (n3 = this.d()) != -1) {
                this.a[n3] = this.a[this.d];
            }
            this.a[this.d] = cu2;
        } else {
            this.d(n2);
        }
    }

    public void d(int n2) {
        this.d = this.f();
        cu cu2 = this.a[this.d];
        this.a[this.d] = this.a[n2];
        this.a[n2] = cu2;
    }

    public static boolean e(int n2) {
        return n2 >= 0 && n2 < 9;
    }

    public int b(cu cu2) {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (this.a[i2] == null || !this.b(cu2, this.a[i2])) continue;
            return i2;
        }
        return -1;
    }

    public int f() {
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

    public int a(cg cg2, int n2, int n3, e e2) {
        int n4;
        int n5 = 0;
        for (n4 = 0; n4 < this.e(); ++n4) {
            cu cu2 = this.a(n4);
            if (cu2 == null || cg2 != null && cu2.a() != cg2 || n2 > -1 && cu2.h() != n2 || e2 != null && !u.a(e2, cu2.o(), true)) continue;
            int n6 = n3 <= 0 ? cu2.b : Math.min(n3 - n5, cu2.b);
            n5 += n6;
            if (n3 == 0) continue;
            cu2.b -= n6;
            if (cu2.b == 0) {
                this.a(n4, null);
            }
            if (n3 <= 0 || n5 < n3) continue;
            return n5;
        }
        if (this.h != null) {
            if (cg2 != null && this.h.a() != cg2) {
                return n5;
            }
            if (n2 > -1 && this.h.h() != n2) {
                return n5;
            }
            if (e2 != null && !u.a(e2, this.h.o(), true)) {
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

    private int g(cu cu2) {
        cg cg2 = cu2.a();
        int n2 = cu2.b;
        int n3 = this.h(cu2);
        if (n3 == -1) {
            n3 = this.d();
        }
        if (n3 == -1) {
            return n2;
        }
        cu cu3 = this.a(n3);
        if (cu3 == null) {
            cu3 = new cu(cg2, 0, cu2.h());
            if (cu2.n()) {
                cu3.d(cu2.o().g());
            }
            this.a(n3, cu3);
        }
        int n4 = n2;
        if (n2 > cu3.b() - cu3.b) {
            n4 = cu3.b() - cu3.b;
        }
        if (n4 > this.g() - cu3.b) {
            n4 = this.g() - cu3.b;
        }
        if (n4 == 0) {
            return n2;
        }
        cu3.b += n4;
        cu3.c = 5;
        return n2 -= n4;
    }

    private int h(cu cu2) {
        if (this.a(this.a(this.d), cu2)) {
            return this.d;
        }
        if (this.a(this.a(40), cu2)) {
            return 40;
        }
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (!this.a(this.a[i2], cu2)) continue;
            return i2;
        }
        return -1;
    }

    public void h() {
        cu[][] arrcu = this.g;
        int n2 = this.g.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            cu[] arrcu2 = arrcu[i2];
            for (int i3 = 0; i3 < arrcu2.length; ++i3) {
                if (arrcu2[i3] == null) continue;
                arrcu2[i3].a(this.e.aQ, this.e, i3, this.d == i3);
            }
        }
    }

    public boolean c(cu cu2) {
        if (cu2 != null && cu2.b != 0 && cu2.a() != null) {
            int n2;
            block10: {
                block8: {
                    block9: {
                        if (!cu2.f()) break block8;
                        n2 = this.d();
                        if (n2 < 0) break block9;
                        this.a[n2] = cu.c(cu2);
                        this.a[n2].c = 5;
                        cu2.b = 0;
                        return true;
                    }
                    if (this.e.J.d) {
                        cu2.b = 0;
                        return true;
                    }
                    return false;
                }
                try {
                    do {
                        n2 = cu2.b;
                        cu2.b = this.g(cu2);
                    } while (cu2.b > 0 && cu2.b < n2);
                    if (cu2.b != n2 || !this.e.J.d) break block10;
                    cu2.b = 0;
                    return true;
                }
                catch (Throwable throwable) {
                    net.minecraft.k.a a2 = net.minecraft.k.a.a(throwable, "Adding item to inventory");
                    i i2 = a2.a("Item being added");
                    i2.a("Item ID", cg.a(cu2.a()));
                    i2.a("Item data", cu2.h());
                    i2.a("Item name", new c(this, cu2));
                    throw new bo(a2);
                }
            }
            return cu2.b < n2;
        }
        return false;
    }

    @Override
    public cu a(int n2, int n3) {
        cu[] arrcu = null;
        cu[][] arrcu2 = this.g;
        int n4 = this.g.length;
        for (int i2 = 0; i2 < n4; ++i2) {
            cu[] arrcu3 = arrcu2[i2];
            if (n2 < arrcu3.length) {
                arrcu = arrcu3;
                break;
            }
            n2 -= arrcu3.length;
        }
        return arrcu != null && arrcu[n2] != null ? v.a(arrcu, n2, n3) : null;
    }

    public void d(cu cu2) {
        cu[][] arrcu = this.g;
        int n2 = this.g.length;
        block0: for (int i2 = 0; i2 < n2; ++i2) {
            cu[] arrcu2 = arrcu[i2];
            for (int i3 = 0; i3 < arrcu2.length; ++i3) {
                if (arrcu2[i3] != cu2) continue;
                arrcu2[i3] = null;
                continue block0;
            }
        }
    }

    @Override
    public cu b(int n2) {
        cu[] arrcu;
        cu[] arrcu2 = null;
        cu[][] arrcu3 = this.g;
        int n3 = this.g.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            arrcu = arrcu3[i2];
            if (n2 < arrcu.length) {
                arrcu2 = arrcu;
                break;
            }
            n2 -= arrcu.length;
        }
        if (arrcu2 != null && arrcu2[n2] != null) {
            arrcu = arrcu2[n2];
            arrcu2[n2] = null;
            return arrcu;
        }
        return null;
    }

    @Override
    public void a(int n2, cu cu2) {
        cu[] arrcu = null;
        cu[][] arrcu2 = this.g;
        int n3 = this.g.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            cu[] arrcu3 = arrcu2[i2];
            if (n2 < arrcu3.length) {
                arrcu = arrcu3;
                break;
            }
            n2 -= arrcu3.length;
        }
        if (arrcu != null) {
            arrcu[n2] = cu2;
        }
    }

    public float a(net.minecraft.g.c.b b2) {
        float f2 = 1.0f;
        if (this.a[this.d] != null) {
            f2 *= this.a[this.d].a(b2);
        }
        return f2;
    }

    public q a(q q2) {
        e e2;
        int n2;
        for (n2 = 0; n2 < this.a.length; ++n2) {
            if (this.a[n2] == null) continue;
            e2 = new e();
            e2.a("Slot", (byte)n2);
            this.a[n2].b(e2);
            q2.a(e2);
        }
        for (n2 = 0; n2 < this.b.length; ++n2) {
            if (this.b[n2] == null) continue;
            e2 = new e();
            e2.a("Slot", (byte)(n2 + 100));
            this.b[n2].b(e2);
            q2.a(e2);
        }
        for (n2 = 0; n2 < this.c.length; ++n2) {
            if (this.c[n2] == null) continue;
            e2 = new e();
            e2.a("Slot", (byte)(n2 + 150));
            this.c[n2].b(e2);
            q2.a(e2);
        }
        return q2;
    }

    public void b(q q2) {
        Arrays.fill(this.a, null);
        Arrays.fill(this.b, null);
        Arrays.fill(this.c, null);
        for (int i2 = 0; i2 < q2.e(); ++i2) {
            e e2 = q2.b(i2);
            int n2 = e2.f("Slot") & 0xFF;
            cu cu2 = cu.a(e2);
            if (cu2 == null) continue;
            if (n2 >= 0 && n2 < this.a.length) {
                this.a[n2] = cu2;
                continue;
            }
            if (n2 >= 100 && n2 < this.b.length + 100) {
                this.b[n2 - 100] = cu2;
                continue;
            }
            if (n2 < 150 || n2 >= this.c.length + 150) continue;
            this.c[n2 - 150] = cu2;
        }
    }

    @Override
    public int e() {
        return this.a.length + this.b.length + this.c.length;
    }

    @Override
    public cu a(int n2) {
        cu[] arrcu = null;
        cu[][] arrcu2 = this.g;
        int n3 = this.g.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            cu[] arrcu3 = arrcu2[i2];
            if (n2 < arrcu3.length) {
                arrcu = arrcu3;
                break;
            }
            n2 -= arrcu3.length;
        }
        return arrcu == null ? null : arrcu[n2];
    }

    @Override
    public String X() {
        return "container.inventory";
    }

    @Override
    public boolean bO_() {
        return false;
    }

    @Override
    public net.minecraft.u.d.a aK() {
        return this.bO_() ? new k(this.X()) : new net.minecraft.u.d.l(this.X(), new Object[0]);
    }

    @Override
    public int g() {
        return 64;
    }

    public boolean b(net.minecraft.g.c.b b2) {
        if (b2.d().k()) {
            return true;
        }
        cu cu2 = this.a(this.d);
        return cu2 != null ? cu2.b(b2) : false;
    }

    public cu g(int n2) {
        return this.b[n2];
    }

    public void a(float f2) {
        if ((f2 /= 4.0f) < 1.0f) {
            f2 = 1.0f;
        }
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            if (this.b[i2] == null || !(this.b[i2].a() instanceof dn)) continue;
            this.b[i2].a((int)f2, (l)this.e);
            if (this.b[i2].b != 0) continue;
            this.b[i2] = null;
        }
    }

    public void k() {
        cu[][] arrcu = this.g;
        int n2 = this.g.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            cu[] arrcu2 = arrcu[i2];
            for (int i3 = 0; i3 < arrcu2.length; ++i3) {
                if (arrcu2[i3] == null) continue;
                this.e.a(arrcu2[i3], true, false);
                arrcu2[i3] = null;
            }
        }
    }

    @Override
    public void C() {
        this.f = true;
    }

    public void e(cu cu2) {
        this.h = cu2;
    }

    public cu l() {
        return this.h;
    }

    @Override
    public boolean a_(b b2) {
        return this.e.bk ? false : b2.n(this.e) <= 64.0;
    }

    public boolean f(cu cu2) {
        cu[][] arrcu = this.g;
        int n2 = this.g.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            cu[] arrcu2;
            cu[] arrcu3 = arrcu2 = arrcu[i2];
            int n3 = arrcu2.length;
            for (int i3 = 0; i3 < n3; ++i3) {
                cu cu3 = arrcu3[i3];
                if (cu3 == null || !cu3.a(cu2)) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public void b(b b2) {
    }

    @Override
    public void c(b b2) {
    }

    @Override
    public boolean b(int n2, cu cu2) {
        return true;
    }

    public void a(a a2) {
        for (int i2 = 0; i2 < this.e(); ++i2) {
            this.a(i2, a2.a(i2));
        }
        this.d = a2.d;
    }

    @Override
    public int c(int n2) {
        return 0;
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public int i() {
        return 0;
    }

    @Override
    public void j() {
        cu[][] arrcu = this.g;
        int n2 = this.g.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            cu[] arrcu2 = arrcu[i2];
            for (int i3 = 0; i3 < arrcu2.length; ++i3) {
                arrcu2[i3] = null;
            }
        }
    }
}

