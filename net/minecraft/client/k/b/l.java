/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.b;

import com.a.a.d.aad;
import java.util.Set;
import net.minecraft.client.g.a.d;
import net.minecraft.client.g.a.f;
import net.minecraft.client.g.am;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bd;
import net.minecraft.client.k.cc;
import net.minecraft.client.r;
import net.minecraft.h.ae;
import net.minecraft.h.aq;
import net.minecraft.m.cu;
import net.minecraft.u.b.n;
import net.minecraft.u.bp;
import net.minecraft.u.d.o;
import net.minecraft.w.a.a;
import org.lwjgl.a.g;

public abstract class l
extends cc {
    public static final bp b = new bp("textures/gui/container/inventory.png");
    protected int c = 176;
    protected int d = 166;
    public aq e;
    protected int f;
    protected int g;
    private net.minecraft.h.r a;
    private net.minecraft.h.r j;
    private boolean k;
    private cu l;
    private int m;
    private int v;
    private net.minecraft.h.r w;
    private long x;
    private cu C;
    private net.minecraft.h.r D;
    private long E;
    protected final Set h = aad.a();
    protected boolean i;
    private int F;
    private int G;
    private boolean H;
    private int I;
    private long J;
    private net.minecraft.h.r K;
    private int L;
    private boolean M;
    private cu N;

    public l(aq aq2) {
        this.e = aq2;
        this.H = true;
    }

    @Override
    public void ct_() {
        super.ct_();
        this.n.j.s = this.e;
        this.f = (this.p - this.c) / 2;
        this.g = (this.q - this.d) / 2;
    }

    @Override
    public void a(int n2, int n3, float f2) {
        int n4;
        int n5;
        Object object;
        this.m();
        int n6 = this.f;
        int n7 = this.g;
        this.a(f2, n2, n3);
        bd.B();
        am.a();
        bd.f();
        bd.i();
        super.a(n2, n3, f2);
        am.c();
        bd.D();
        bd.c((float)n6, (float)n7, 0.0f);
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        bd.A();
        this.a = null;
        int n8 = 240;
        int n9 = 240;
        ay.a(ay.r, 240.0f, 240.0f);
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        for (int i2 = 0; i2 < this.e.e.size(); ++i2) {
            object = (net.minecraft.h.r)this.e.e.get(i2);
            this.a((net.minecraft.h.r)object);
            if (!this.a((net.minecraft.h.r)object, n2, n3) || !((net.minecraft.h.r)object).f()) continue;
            this.a = object;
            bd.f();
            bd.i();
            n5 = ((net.minecraft.h.r)object).d;
            n4 = ((net.minecraft.h.r)object).e;
            bd.a(true, true, true, false);
            this.b(n5, n4, n5 + 16, n4 + 16, -2130706433, -2130706433);
            bd.a(true, true, true, true);
            bd.e();
            bd.j();
        }
        am.a();
        this.b(n2, n3);
        am.c();
        a a2 = this.n.j.q;
        Object object2 = object = this.l == null ? a2.l() : this.l;
        if (object != null) {
            n5 = 8;
            n4 = this.l == null ? 8 : 16;
            String string = null;
            if (this.l != null && this.k) {
                object = ((cu)object).j();
                ((cu)object).b = net.minecraft.u.b.n.f((float)((cu)object).b / 2.0f);
            } else if (this.i && this.h.size() > 1) {
                object = ((cu)object).j();
                ((cu)object).b = this.I;
                if (((cu)object).b == 0) {
                    string = (Object)((Object)net.minecraft.u.d.o.o) + "0";
                }
            }
            this.a((cu)object, n2 - n6 - 8, n3 - n7 - n4, string);
        }
        if (this.C != null) {
            float f3 = (float)(net.minecraft.client.r.I() - this.x) / 100.0f;
            if (f3 >= 1.0f) {
                f3 = 1.0f;
                this.C = null;
            }
            n4 = this.w.d - this.m;
            int n10 = this.w.e - this.v;
            int n11 = this.m + (int)((float)n4 * f3);
            int n12 = this.v + (int)((float)n10 * f3);
            this.a(this.C, n11, n12, null);
        }
        bd.E();
        if (a2.l() == null && this.a != null && this.a.c()) {
            cu cu2 = this.a.b();
            this.a(cu2, n2, n3);
        }
        bd.e();
        bd.j();
        am.b();
    }

    private void a(cu cu2, int n2, int n3, String string) {
        bd.c(0.0f, 0.0f, 32.0f);
        this.B = 200.0f;
        this.o.a = 200.0f;
        this.o.b(cu2, n2, n3);
        this.o.a(this.u, cu2, n2, n3 - (this.l == null ? 0 : 8), string);
        this.B = 0.0f;
        this.o.a = 0.0f;
    }

    protected void b(int n2, int n3) {
    }

    protected abstract void a(float var1, int var2, int var3);

    private void a(net.minecraft.h.r r2) {
        String string;
        int n2 = r2.d;
        int n3 = r2.e;
        cu cu2 = r2.b();
        boolean bl2 = false;
        boolean bl3 = r2 == this.j && this.l != null && !this.k;
        cu cu3 = this.n.j.q.l();
        String string2 = null;
        if (r2 == this.j && this.l != null && this.k && cu2 != null) {
            cu2 = cu2.j();
            cu2.b /= 2;
        } else if (this.i && this.h.contains(r2) && cu3 != null) {
            if (this.h.size() == 1) {
                return;
            }
            if (aq.a(r2, cu3, true) && this.e.b(r2)) {
                cu2 = cu3.j();
                bl2 = true;
                aq.a(this.h, this.F, cu2, r2.b() == null ? 0 : r2.b().b);
                if (cu2.b > cu2.b()) {
                    string2 = "" + (Object)((Object)net.minecraft.u.d.o.o) + cu2.b();
                    cu2.b = cu2.b();
                }
                if (cu2.b > r2.e(cu2)) {
                    string2 = "" + (Object)((Object)net.minecraft.u.d.o.o) + r2.e(cu2);
                    cu2.b = r2.e(cu2);
                }
            } else {
                this.h.remove(r2);
                this.f();
            }
        }
        this.B = 100.0f;
        this.o.a = 100.0f;
        if (cu2 == null && r2.f() && (string = r2.e()) != null) {
            d d2 = this.n.R().a(string);
            bd.f();
            this.n.N().a(net.minecraft.client.g.a.f.b);
            this.a(n2, n3, d2, 16, 16);
            bd.e();
            bl3 = true;
        }
        if (!bl3) {
            if (bl2) {
                net.minecraft.client.k.b.l.a(n2, n3, n2 + 16, n3 + 16, -2130706433);
            }
            bd.j();
            this.o.a(this.n.j, cu2, n2, n3);
            this.o.a(this.u, cu2, n2, n3, string2);
        }
        this.o.a = 0.0f;
        this.B = 0.0f;
    }

    private void f() {
        cu cu2 = this.n.j.q.l();
        if (cu2 != null && this.i) {
            this.I = cu2.b;
            for (net.minecraft.h.r r2 : this.h) {
                cu cu3 = cu2.j();
                int n2 = r2.b() == null ? 0 : r2.b().b;
                aq.a(this.h, this.F, cu3, n2);
                if (cu3.b > cu3.b()) {
                    cu3.b = cu3.b();
                }
                if (cu3.b > r2.e(cu3)) {
                    cu3.b = r2.e(cu3);
                }
                this.I -= cu3.b - n2;
            }
        }
    }

    private net.minecraft.h.r c(int n2, int n3) {
        for (int i2 = 0; i2 < this.e.e.size(); ++i2) {
            net.minecraft.h.r r2 = (net.minecraft.h.r)this.e.e.get(i2);
            if (!this.a(r2, n2, n3)) continue;
            return r2;
        }
        return null;
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        boolean bl2 = n4 == this.n.w.ae.j() + 100;
        net.minecraft.h.r r2 = this.c(n2, n3);
        long l2 = net.minecraft.client.r.I();
        this.M = this.K == r2 && l2 - this.J < 250L && this.L == n4;
        this.H = false;
        if (n4 == 0 || n4 == 1 || bl2) {
            int n5 = this.f;
            int n6 = this.g;
            boolean bl3 = n2 < n5 || n3 < n6 || n2 >= n5 + this.c || n3 >= n6 + this.d;
            int n7 = -1;
            if (r2 != null) {
                n7 = r2.c;
            }
            if (bl3) {
                n7 = -999;
            }
            if (this.n.w.A && bl3 && this.n.j.q.l() == null) {
                this.n.a((cc)null);
                return;
            }
            if (n7 != -1) {
                if (this.n.w.A) {
                    if (r2 != null && r2.c()) {
                        this.j = r2;
                        this.l = null;
                        this.k = n4 == 1;
                    } else {
                        this.j = null;
                    }
                } else if (!this.i) {
                    if (this.n.j.q.l() == null) {
                        if (n4 == this.n.w.ae.j() + 100) {
                            this.a(r2, n7, n4, ae.d);
                        } else {
                            boolean bl4 = n7 != -999 && (org.lwjgl.a.g.a(42) || org.lwjgl.a.g.a(54));
                            ae ae2 = ae.a;
                            if (bl4) {
                                this.N = r2 != null && r2.c() ? r2.b() : null;
                                ae2 = ae.b;
                            } else if (n7 == -999) {
                                ae2 = ae.e;
                            }
                            this.a(r2, n7, n4, ae2);
                        }
                        this.H = true;
                    } else {
                        this.i = true;
                        this.G = n4;
                        this.h.clear();
                        if (n4 == 0) {
                            this.F = 0;
                        } else if (n4 == 1) {
                            this.F = 1;
                        } else if (n4 == this.n.w.ae.j() + 100) {
                            this.F = 2;
                        }
                    }
                }
            }
        }
        this.K = r2;
        this.J = l2;
        this.L = n4;
    }

    @Override
    protected void a(int n2, int n3, int n4, long l2) {
        net.minecraft.h.r r2 = this.c(n2, n3);
        cu cu2 = this.n.j.q.l();
        if (this.j != null && this.n.w.A) {
            if (n4 == 0 || n4 == 1) {
                if (this.l == null) {
                    if (r2 != this.j && this.j.b() != null) {
                        this.l = this.j.b().j();
                    }
                } else if (this.l.b > 1 && r2 != null && aq.a(r2, this.l, false)) {
                    long l3 = net.minecraft.client.r.I();
                    if (this.D == r2) {
                        if (l3 - this.E > 500L) {
                            this.a(this.j, this.j.c, 0, ae.a);
                            this.a(r2, r2.c, 1, ae.a);
                            this.a(this.j, this.j.c, 0, ae.a);
                            this.E = l3 + 750L;
                            --this.l.b;
                        }
                    } else {
                        this.D = r2;
                        this.E = l3;
                    }
                }
            }
        } else if (this.i && r2 != null && cu2 != null && cu2.b > this.h.size() && aq.a(r2, cu2, true) && r2.a(cu2) && this.e.b(r2)) {
            this.h.add(r2);
            this.f();
        }
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        net.minecraft.h.r r2 = this.c(n2, n3);
        int n5 = this.f;
        int n6 = this.g;
        boolean bl2 = n2 < n5 || n3 < n6 || n2 >= n5 + this.c || n3 >= n6 + this.d;
        int n7 = -1;
        if (r2 != null) {
            n7 = r2.c;
        }
        if (bl2) {
            n7 = -999;
        }
        if (this.M && r2 != null && n4 == 0 && this.e.a(null, r2)) {
            if (net.minecraft.client.k.b.l.o()) {
                if (r2 != null && r2.b != null && this.N != null) {
                    for (net.minecraft.h.r r3 : this.e.e) {
                        if (r3 == null || !r3.a(this.n.j) || !r3.c() || r3.b != r2.b || !aq.a(r3, this.N, true)) continue;
                        this.a(r3, r3.c, n4, ae.b);
                    }
                }
            } else {
                this.a(r2, n7, n4, ae.g);
            }
            this.M = false;
            this.J = 0L;
        } else {
            if (this.i && this.G != n4) {
                this.i = false;
                this.h.clear();
                this.H = true;
                return;
            }
            if (this.H) {
                this.H = false;
                return;
            }
            if (this.j != null && this.n.w.A) {
                if (n4 == 0 || n4 == 1) {
                    if (this.l == null && r2 != this.j) {
                        this.l = this.j.b();
                    }
                    boolean bl3 = aq.a(r2, this.l, false);
                    if (n7 != -1 && this.l != null && bl3) {
                        this.a(this.j, this.j.c, n4, ae.a);
                        this.a(r2, n7, 0, ae.a);
                        if (this.n.j.q.l() != null) {
                            this.a(this.j, this.j.c, n4, ae.a);
                            this.m = n2 - n5;
                            this.v = n3 - n6;
                            this.w = this.j;
                            this.C = this.l;
                            this.x = net.minecraft.client.r.I();
                        } else {
                            this.C = null;
                        }
                    } else if (this.l != null) {
                        this.m = n2 - n5;
                        this.v = n3 - n6;
                        this.w = this.j;
                        this.C = this.l;
                        this.x = net.minecraft.client.r.I();
                    }
                    this.l = null;
                    this.j = null;
                }
            } else if (this.i && !this.h.isEmpty()) {
                this.a(null, -999, aq.b(0, this.F), ae.f);
                for (net.minecraft.h.r r4 : this.h) {
                    this.a(r4, r4.c, aq.b(1, this.F), ae.f);
                }
                this.a(null, -999, aq.b(2, this.F), ae.f);
            } else if (this.n.j.q.l() != null) {
                if (n4 == this.n.w.ae.j() + 100) {
                    this.a(r2, n7, n4, ae.d);
                } else {
                    boolean bl4;
                    boolean bl5 = bl4 = n7 != -999 && (org.lwjgl.a.g.a(42) || org.lwjgl.a.g.a(54));
                    if (bl4) {
                        this.N = r2 != null && r2.c() ? r2.b() : null;
                    }
                    this.a(r2, n7, n4, bl4 ? ae.b : ae.a);
                }
            }
        }
        if (this.n.j.q.l() == null) {
            this.J = 0L;
        }
        this.i = false;
    }

    private boolean a(net.minecraft.h.r r2, int n2, int n3) {
        return this.a(r2.d, r2.e, 16, 16, n2, n3);
    }

    protected boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = this.f;
        int n9 = this.g;
        return (n6 -= n8) >= n2 - 1 && n6 < n2 + n4 + 1 && (n7 -= n9) >= n3 - 1 && n7 < n3 + n5 + 1;
    }

    protected void a(net.minecraft.h.r r2, int n2, int n3, ae ae2) {
        if (r2 != null) {
            n2 = r2.c;
        }
        this.n.d.a(this.e.f, n2, n3, ae2, this.n.j);
    }

    @Override
    protected void a(char c2, int n2) {
        if (n2 == 1 || n2 == this.n.w.Z.j()) {
            this.n.j.r();
        }
        this.a(n2);
        if (this.a != null && this.a.c()) {
            if (n2 == this.n.w.ae.j()) {
                this.a(this.a, this.a.c, 0, ae.d);
            } else if (n2 == this.n.w.ab.j()) {
                this.a(this.a, this.a.c, net.minecraft.client.k.b.l.n() ? 1 : 0, ae.e);
            }
        }
    }

    protected boolean a(int n2) {
        if (this.n.j.q.l() == null && this.a != null) {
            for (int i2 = 0; i2 < 9; ++i2) {
                if (n2 != this.n.w.an[i2].j()) continue;
                this.a(this.a, this.a.c, i2, ae.c);
                return true;
            }
        }
        return false;
    }

    @Override
    public void cs_() {
        if (this.n.j != null) {
            this.e.b(this.n.j);
        }
    }

    @Override
    public boolean cq_() {
        return false;
    }

    @Override
    public void bY_() {
        super.bY_();
        if (!this.n.j.br() || this.n.j.bk) {
            this.n.j.r();
        }
    }
}

