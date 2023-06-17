/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.util.Set;
import org.lwjgl.a.g;

public abstract class ab
extends cjn {
    public static final bpx a = new bpx("textures/gui/container/inventory.png");
    protected int b = 176;
    protected int c = 166;
    public apq d;
    protected int e;
    protected int f;
    private ux i;
    private ux j;
    private boolean k;
    private bhl l;
    private int m;
    private int r;
    private ux s;
    private long t;
    private bhl C;
    private ux D;
    private long E;
    protected final Set g = aad.a();
    protected boolean h;
    private int F;
    private int G;
    private boolean H;
    private int I;
    private long J;
    private ux K;
    private int L;
    private boolean M;
    private bhl N;

    public ab(apq apq2) {
        this.d = apq2;
        this.H = true;
    }

    @Override
    public void cH_() {
        super.cH_();
        this.u.h.p = this.d;
        this.e = (this.w - this.b) / 2;
        this.f = (this.x - this.c) / 2;
    }

    @Override
    public void a(int n2, int n3, float f2) {
        int n4;
        int n5;
        Object object;
        this.aH_();
        int n6 = this.e;
        int n7 = this.f;
        this.a(f2, n2, n3);
        cja.B();
        bjr.a();
        cja.f();
        cja.i();
        super.a(n2, n3, f2);
        bjr.c();
        cja.D();
        cja.c((float)n6, (float)n7, 0.0f);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.A();
        this.i = null;
        int n8 = 240;
        int n9 = 240;
        cjg.a(cjg.r, 240.0f, 240.0f);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        for (int i2 = 0; i2 < this.d.g.size(); ++i2) {
            object = (ux)this.d.g.get(i2);
            this.a((ux)object);
            if (!this.a((ux)object, n2, n3) || !((ux)object).f()) continue;
            this.i = object;
            cja.f();
            cja.i();
            n5 = ((ux)object).e;
            n4 = ((ux)object).f;
            cja.a(true, true, true, false);
            this.b(n5, n4, n5 + 16, n4 + 16, -2130706433, -2130706433);
            cja.a(true, true, true, true);
            cja.e();
            cja.j();
        }
        bjr.a();
        this.a(n2, n3);
        bjr.c();
        cps cps2 = this.u.h.n;
        Object object2 = object = this.l == null ? cps2.n() : this.l;
        if (object != null) {
            n5 = 8;
            n4 = this.l == null ? 8 : 16;
            String string = null;
            if (this.l != null && this.k) {
                object = ((bhl)object).j();
                ((bhl)object).b = cmk.f((float)((bhl)object).b / 2.0f);
            } else if (this.h && this.g.size() > 1) {
                object = ((bhl)object).j();
                ((bhl)object).b = this.I;
                if (((bhl)object).b == 0) {
                    string = "" + (Object)((Object)aug.o) + "0";
                }
            }
            this.a((bhl)object, n2 - n6 - 8, n3 - n7 - n4, string);
        }
        if (this.C != null) {
            float f3 = (float)(bxy.K() - this.t) / 100.0f;
            if (f3 >= 1.0f) {
                f3 = 1.0f;
                this.C = null;
            }
            n4 = this.s.e - this.m;
            int n10 = this.s.f - this.r;
            int n11 = this.m + (int)((float)n4 * f3);
            int n12 = this.r + (int)((float)n10 * f3);
            this.a(this.C, n11, n12, null);
        }
        cja.E();
        if (cps2.n() == null && this.i != null && this.i.b()) {
            bhl bhl2 = this.i.a();
            this.a(bhl2, n2, n3);
        }
        cja.e();
        cja.j();
        bjr.b();
    }

    private void a(bhl bhl2, int n2, int n3, String string) {
        cja.c(0.0f, 0.0f, 32.0f);
        this.q = 200.0f;
        this.v.a = 200.0f;
        this.v.b(bhl2, n2, n3);
        this.v.a(this.B, bhl2, n2, n3 - (this.l == null ? 0 : 8), string);
        this.q = 0.0f;
        this.v.a = 0.0f;
    }

    protected void a(int n2, int n3) {
    }

    protected abstract void a(float var1, int var2, int var3);

    private void a(ux ux2) {
        String string;
        int n2 = ux2.e;
        int n3 = ux2.f;
        bhl bhl2 = ux2.a();
        boolean bl2 = false;
        boolean bl3 = ux2 == this.j && this.l != null && !this.k;
        bhl bhl3 = this.u.h.n.n();
        String string2 = null;
        if (ux2 == this.j && this.l != null && this.k && bhl2 != null) {
            bhl2 = bhl2.j();
            bhl2.b /= 2;
        } else if (this.h && this.g.contains(ux2) && bhl3 != null) {
            if (this.g.size() == 1) {
                return;
            }
            if (apq.a(ux2, bhl3, true) && this.d.a(ux2)) {
                bhl2 = bhl3.j();
                bl2 = true;
                apq.a(this.g, this.F, bhl2, ux2.a() == null ? 0 : ux2.a().b);
                if (bhl2.b > bhl2.b()) {
                    string2 = (Object)((Object)aug.o) + "" + bhl2.b();
                    bhl2.b = bhl2.b();
                }
                if (bhl2.b > ux2.c(bhl2)) {
                    string2 = (Object)((Object)aug.o) + "" + ux2.c(bhl2);
                    bhl2.b = ux2.c(bhl2);
                }
            } else {
                this.g.remove(ux2);
                this.f();
            }
        }
        this.q = 100.0f;
        this.v.a = 100.0f;
        if (bhl2 == null && ux2.f() && (string = ux2.e()) != null) {
            ars ars2 = this.u.T().a(string);
            cja.f();
            this.u.P().a(dam.g);
            this.a(n2, n3, ars2, 16, 16);
            cja.e();
            bl3 = true;
        }
        if (!bl3) {
            if (bl2) {
                ab.a(n2, n3, n2 + 16, n3 + 16, -2130706433);
            }
            cja.j();
            this.v.a(this.u.h, bhl2, n2, n3);
            this.v.a(this.B, bhl2, n2, n3, string2);
        }
        this.v.a = 0.0f;
        this.q = 0.0f;
    }

    private void f() {
        bhl bhl2 = this.u.h.n.n();
        if (bhl2 == null || !this.h) {
            return;
        }
        this.I = bhl2.b;
        for (ux ux2 : this.g) {
            bhl bhl3 = bhl2.j();
            int n2 = ux2.a() == null ? 0 : ux2.a().b;
            apq.a(this.g, this.F, bhl3, n2);
            if (bhl3.b > bhl3.b()) {
                bhl3.b = bhl3.b();
            }
            if (bhl3.b > ux2.c(bhl3)) {
                bhl3.b = ux2.c(bhl3);
            }
            this.I -= bhl3.b - n2;
        }
    }

    private ux c(int n2, int n3) {
        for (int i2 = 0; i2 < this.d.g.size(); ++i2) {
            ux ux2 = (ux)this.d.g.get(i2);
            if (!this.a(ux2, n2, n3)) continue;
            return ux2;
        }
        return null;
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        boolean bl2 = n4 == this.u.u.ae.j() + 100;
        ux ux2 = this.c(n2, n3);
        long l2 = bxy.K();
        this.M = this.K == ux2 && l2 - this.J < 250L && this.L == n4;
        this.H = false;
        if (n4 == 0 || n4 == 1 || bl2) {
            int n5 = this.e;
            int n6 = this.f;
            boolean bl3 = n2 < n5 || n3 < n6 || n2 >= n5 + this.b || n3 >= n6 + this.c;
            int n7 = -1;
            if (ux2 != null) {
                n7 = ux2.d;
            }
            if (bl3) {
                n7 = -999;
            }
            if (this.u.u.A && bl3 && this.u.h.n.n() == null) {
                this.u.a((cjn)null);
                return;
            }
            if (n7 != -1) {
                if (this.u.u.A) {
                    if (ux2 != null && ux2.b()) {
                        this.j = ux2;
                        this.l = null;
                        this.k = n4 == 1;
                    } else {
                        this.j = null;
                    }
                } else if (!this.h) {
                    if (this.u.h.n.n() == null) {
                        if (n4 == this.u.u.ae.j() + 100) {
                            this.a(ux2, n7, n4, aao.d);
                        } else {
                            boolean bl4 = n7 != -999 && (org.lwjgl.a.g.a(42) || org.lwjgl.a.g.a(54));
                            aao aao2 = aao.a;
                            if (bl4) {
                                this.N = ux2 != null && ux2.b() ? ux2.a() : null;
                                aao2 = aao.b;
                            } else if (n7 == -999) {
                                aao2 = aao.e;
                            }
                            this.a(ux2, n7, n4, aao2);
                        }
                        this.H = true;
                    } else {
                        this.h = true;
                        this.G = n4;
                        this.g.clear();
                        if (n4 == 0) {
                            this.F = 0;
                        } else if (n4 == 1) {
                            this.F = 1;
                        } else if (n4 == this.u.u.ae.j() + 100) {
                            this.F = 2;
                        }
                    }
                }
            }
        }
        this.K = ux2;
        this.J = l2;
        this.L = n4;
    }

    @Override
    protected void a(int n2, int n3, int n4, long l2) {
        ux ux2 = this.c(n2, n3);
        bhl bhl2 = this.u.h.n.n();
        if (this.j != null && this.u.u.A) {
            if (n4 == 0 || n4 == 1) {
                if (this.l == null) {
                    if (ux2 != this.j && this.j.a() != null) {
                        this.l = this.j.a().j();
                    }
                } else if (this.l.b > 1 && ux2 != null && apq.a(ux2, this.l, false)) {
                    long l3 = bxy.K();
                    if (this.D == ux2) {
                        if (l3 - this.E > 500L) {
                            this.a(this.j, this.j.d, 0, aao.a);
                            this.a(ux2, ux2.d, 1, aao.a);
                            this.a(this.j, this.j.d, 0, aao.a);
                            this.E = l3 + 750L;
                            --this.l.b;
                        }
                    } else {
                        this.D = ux2;
                        this.E = l3;
                    }
                }
            }
        } else if (this.h && ux2 != null && bhl2 != null && bhl2.b > this.g.size() && apq.a(ux2, bhl2, true) && ux2.a(bhl2) && this.d.a(ux2)) {
            this.g.add(ux2);
            this.f();
        }
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        ux ux2 = this.c(n2, n3);
        int n5 = this.e;
        int n6 = this.f;
        boolean bl2 = n2 < n5 || n3 < n6 || n2 >= n5 + this.b || n3 >= n6 + this.c;
        int n7 = -1;
        if (ux2 != null) {
            n7 = ux2.d;
        }
        if (bl2) {
            n7 = -999;
        }
        if (this.M && ux2 != null && n4 == 0 && this.d.a(null, ux2)) {
            if (ab.o()) {
                if (ux2 != null && ux2.c != null && this.N != null) {
                    for (ux ux3 : this.d.g) {
                        if (ux3 == null || !ux3.a(this.u.h) || !ux3.b() || ux3.c != ux2.c || !apq.a(ux3, this.N, true)) continue;
                        this.a(ux3, ux3.d, n4, aao.b);
                    }
                }
            } else {
                this.a(ux2, n7, n4, aao.g);
            }
            this.M = false;
            this.J = 0L;
        } else {
            if (this.h && this.G != n4) {
                this.h = false;
                this.g.clear();
                this.H = true;
                return;
            }
            if (this.H) {
                this.H = false;
                return;
            }
            if (this.j != null && this.u.u.A) {
                if (n4 == 0 || n4 == 1) {
                    if (this.l == null && ux2 != this.j) {
                        this.l = this.j.a();
                    }
                    boolean bl3 = apq.a(ux2, this.l, false);
                    if (n7 != -1 && this.l != null && bl3) {
                        this.a(this.j, this.j.d, n4, aao.a);
                        this.a(ux2, n7, 0, aao.a);
                        if (this.u.h.n.n() != null) {
                            this.a(this.j, this.j.d, n4, aao.a);
                            this.m = n2 - n5;
                            this.r = n3 - n6;
                            this.s = this.j;
                            this.C = this.l;
                            this.t = bxy.K();
                        } else {
                            this.C = null;
                        }
                    } else if (this.l != null) {
                        this.m = n2 - n5;
                        this.r = n3 - n6;
                        this.s = this.j;
                        this.C = this.l;
                        this.t = bxy.K();
                    }
                    this.l = null;
                    this.j = null;
                }
            } else if (this.h && !this.g.isEmpty()) {
                this.a(null, -999, apq.b(0, this.F), aao.f);
                for (ux ux4 : this.g) {
                    this.a(ux4, ux4.d, apq.b(1, this.F), aao.f);
                }
                this.a(null, -999, apq.b(2, this.F), aao.f);
            } else if (this.u.h.n.n() != null) {
                if (n4 == this.u.u.ae.j() + 100) {
                    this.a(ux2, n7, n4, aao.d);
                } else {
                    boolean bl4;
                    boolean bl5 = bl4 = n7 != -999 && (org.lwjgl.a.g.a(42) || org.lwjgl.a.g.a(54));
                    if (bl4) {
                        this.N = ux2 != null && ux2.b() ? ux2.a() : null;
                    }
                    this.a(ux2, n7, n4, bl4 ? aao.b : aao.a);
                }
            }
        }
        if (this.u.h.n.n() == null) {
            this.J = 0L;
        }
        this.h = false;
    }

    private boolean a(ux ux2, int n2, int n3) {
        return this.a(ux2.e, ux2.f, 16, 16, n2, n3);
    }

    protected boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = this.e;
        int n9 = this.f;
        return (n6 -= n8) >= n2 - 1 && n6 < n2 + n4 + 1 && (n7 -= n9) >= n3 - 1 && n7 < n3 + n5 + 1;
    }

    protected void a(ux ux2, int n2, int n3, aao aao2) {
        if (ux2 != null) {
            n2 = ux2.d;
        }
        this.u.c.a(this.d.h, n2, n3, aao2, this.u.h);
    }

    @Override
    protected void a(char c2, int n2) {
        if (n2 == 1 || n2 == this.u.u.Z.j()) {
            this.u.h.q();
        }
        this.a(n2);
        if (this.i != null && this.i.b()) {
            if (n2 == this.u.u.ae.j()) {
                this.a(this.i, this.i.d, 0, aao.d);
            } else if (n2 == this.u.u.ab.j()) {
                this.a(this.i, this.i.d, ab.n() ? 1 : 0, aao.e);
            }
        }
    }

    protected boolean a(int n2) {
        if (this.u.h.n.n() == null && this.i != null) {
            for (int i2 = 0; i2 < 9; ++i2) {
                if (n2 != this.u.u.an[i2].j()) continue;
                this.a(this.i, this.i.d, i2, aao.c);
                return true;
            }
        }
        return false;
    }

    @Override
    public void aG_() {
        if (this.u.h == null) {
            return;
        }
        this.d.a(this.u.h);
    }

    @Override
    public boolean q_() {
        return false;
    }

    @Override
    public void d() {
        super.d();
        if (!this.u.h.bj() || this.u.h.bk) {
            this.u.h.q();
        }
    }
}

