/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.dg;
import com.a.a.d.ov;
import java.util.List;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.a.g;

public class cuz
extends cjn
implements awn {
    private static final d a = org.apache.logging.log4j.c.c();
    private final lq b = new lq();
    private final cjn c;
    private bmr d;
    private my e;
    private cwv f;
    private cwv g;
    private cwv h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private String m;
    private cyq r;
    private vu s;
    private ach t;
    private boolean C;

    public cuz(cjn cjn2) {
        this.c = cjn2;
    }

    @Override
    public void cH_() {
        org.lwjgl.a.g.a(true);
        this.y.clear();
        if (this.C) {
            this.d.a(this.w, this.x, 32, this.x - 64);
        } else {
            this.C = true;
            this.e = new my(this.u);
            this.e.a();
            this.s = new vu();
            try {
                this.t = new ach(this.s);
                this.t.start();
            }
            catch (Exception exception) {
                a.f("Unable to start LAN server detection: {}", exception.getMessage());
            }
            this.d = new bmr(this, this.u, this.w, this.x, 32, this.x - 64, 36);
            this.d.a(this.e);
        }
        this.f();
    }

    @Override
    public void p_() {
        super.p_();
        this.d.i();
    }

    public void f() {
        this.f = this.b(new cwv(7, this.w / 2 - 154, this.x - 28, 70, 20, bf.a("selectServer.edit", new Object[0])));
        this.h = this.b(new cwv(2, this.w / 2 - 74, this.x - 28, 70, 20, bf.a("selectServer.delete", new Object[0])));
        this.g = this.b(new cwv(1, this.w / 2 - 154, this.x - 52, 100, 20, bf.a("selectServer.select", new Object[0])));
        this.y.add(new cwv(4, this.w / 2 - 50, this.x - 52, 100, 20, bf.a("selectServer.direct", new Object[0])));
        this.y.add(new cwv(3, this.w / 2 + 4 + 50, this.x - 52, 100, 20, bf.a("selectServer.add", new Object[0])));
        this.y.add(new cwv(8, this.w / 2 + 4, this.x - 28, 70, 20, bf.a("selectServer.refresh", new Object[0])));
        this.y.add(new cwv(0, this.w / 2 + 4 + 76, this.x - 28, 75, 20, bf.a("gui.cancel", new Object[0])));
        this.b(this.d.l());
    }

    @Override
    public void d() {
        super.d();
        if (this.s.a()) {
            List list = this.s.c();
            this.s.b();
            this.d.a(list);
        }
        this.b.a();
    }

    @Override
    public void aG_() {
        org.lwjgl.a.g.a(false);
        if (this.t != null) {
            this.t.interrupt();
            this.t = null;
        }
        this.b.b();
    }

    @Override
    protected void a(cwv cwv2) {
        ye ye2;
        if (!cwv2.k) {
            return;
        }
        ye ye3 = ye2 = this.d.l() < 0 ? null : this.d.c(this.d.l());
        if (cwv2.j == 2 && ye2 instanceof aun) {
            String string = ((aun)ye2).a().a;
            if (string != null) {
                this.i = true;
                String string2 = bf.a("selectServer.deleteQuestion", new Object[0]);
                String string3 = "'" + string + "' " + bf.a("selectServer.deleteWarning", new Object[0]);
                String string4 = bf.a("selectServer.deleteButton", new Object[0]);
                String string5 = bf.a("gui.cancel", new Object[0]);
                ayi ayi2 = new ayi(this, string2, string3, string4, string5, this.d.l());
                this.u.a(ayi2);
            }
        } else if (cwv2.j == 1) {
            this.h();
        } else if (cwv2.j == 4) {
            this.l = true;
            this.r = new cyq(bf.a("selectServer.defaultName", new Object[0]), "", false);
            this.u.a(new cyu(this, this.r));
        } else if (cwv2.j == 3) {
            this.j = true;
            this.r = new cyq(bf.a("selectServer.defaultName", new Object[0]), "", false);
            this.u.a(new rd(this, this.r));
        } else if (cwv2.j == 7 && ye2 instanceof aun) {
            this.k = true;
            cyq cyq2 = ((aun)ye2).a();
            this.r = new cyq(cyq2.a, cyq2.b, false);
            this.r.a(cyq2);
            this.u.a(new rd(this, this.r));
        } else if (cwv2.j == 0) {
            this.u.a(this.c);
        } else if (cwv2.j == 8) {
            this.q();
        }
    }

    private void q() {
        this.u.a(new cuz(this.c));
    }

    @Override
    public void a(boolean bl2, int n2) {
        ye ye2;
        ye ye3 = ye2 = this.d.l() < 0 ? null : this.d.c(this.d.l());
        if (this.i) {
            this.i = false;
            if (bl2 && ye2 instanceof aun) {
                this.e.b(this.d.l());
                this.e.b();
                this.d.b(-1);
                this.d.a(this.e);
            }
            this.u.a(this);
        } else if (this.l) {
            this.l = false;
            if (bl2) {
                this.a(this.r);
            } else {
                this.u.a(this);
            }
        } else if (this.j) {
            this.j = false;
            if (bl2) {
                this.e.a(this.r);
                this.e.b();
                this.d.b(-1);
                this.d.a(this.e);
            }
            this.u.a(this);
        } else if (this.k) {
            this.k = false;
            if (bl2 && ye2 instanceof aun) {
                cyq cyq2 = ((aun)ye2).a();
                cyq2.a = this.r.a;
                cyq2.b = this.r.b;
                cyq2.a(this.r);
                this.e.b();
                this.d.a(this.e);
            }
            this.u.a(this);
        }
    }

    @Override
    protected void a(char c2, int n2) {
        ye ye2;
        int n3 = this.d.l();
        ye ye3 = ye2 = n3 < 0 ? null : this.d.c(n3);
        if (n2 == 63) {
            this.q();
            return;
        }
        if (n3 >= 0) {
            if (n2 == 200) {
                if (cuz.o()) {
                    if (n3 > 0 && ye2 instanceof aun) {
                        this.e.a(n3, n3 - 1);
                        this.b(this.d.l() - 1);
                        this.d.e(-this.d.k());
                        this.d.a(this.e);
                    }
                } else if (n3 > 0) {
                    this.b(this.d.l() - 1);
                    this.d.e(-this.d.k());
                    if (this.d.c(this.d.l()) instanceof ayl) {
                        if (this.d.l() > 0) {
                            this.b(this.d.a() - 1);
                            this.d.e(-this.d.k());
                        } else {
                            this.b(-1);
                        }
                    }
                } else {
                    this.b(-1);
                }
            } else if (n2 == 208) {
                if (cuz.o()) {
                    if (n3 < this.e.c() - 1) {
                        this.e.a(n3, n3 + 1);
                        this.b(n3 + 1);
                        this.d.e(this.d.k());
                        this.d.a(this.e);
                    }
                } else if (n3 < this.d.a()) {
                    this.b(this.d.l() + 1);
                    this.d.e(this.d.k());
                    if (this.d.c(this.d.l()) instanceof ayl) {
                        if (this.d.l() < this.d.a() - 1) {
                            this.b(this.d.a() + 1);
                            this.d.e(this.d.k());
                        } else {
                            this.b(-1);
                        }
                    }
                } else {
                    this.b(-1);
                }
            } else if (n2 == 28 || n2 == 156) {
                this.a((cwv)this.y.get(2));
            } else {
                super.a(c2, n2);
            }
        } else {
            super.a(c2, n2);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m = null;
        this.aH_();
        this.d.a(n2, n3, f2);
        this.a(this.B, bf.a("multiplayer.title", new Object[0]), this.w / 2, 20, 0xFFFFFF);
        super.a(n2, n3, f2);
        if (this.m != null) {
            this.a(ov.a(dg.a("\n").a(this.m)), n2, n3);
        }
    }

    public void h() {
        ye ye2;
        ye ye3 = ye2 = this.d.l() < 0 ? null : this.d.c(this.d.l());
        if (ye2 instanceof aun) {
            this.a(((aun)ye2).a());
        } else if (ye2 instanceof alr) {
            mg mg2 = ((alr)ye2).a();
            this.a(new cyq(mg2.a(), mg2.b(), true));
        }
    }

    private void a(cyq cyq2) {
        this.u.a(new bqn(this, this.u, cyq2));
    }

    public void b(int n2) {
        this.d.b(n2);
        ye ye2 = n2 < 0 ? null : this.d.c(n2);
        this.g.k = false;
        this.f.k = false;
        this.h.k = false;
        if (ye2 != null && !(ye2 instanceof ayl)) {
            this.g.k = true;
            if (ye2 instanceof aun) {
                this.f.k = true;
                this.h.k = true;
            }
        }
    }

    public lq i() {
        return this.b;
    }

    public void a(String string) {
        this.m = string;
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.d.b(n2, n3, n4);
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        super.b(n2, n3, n4);
        this.d.c(n2, n3, n4);
    }

    public my j() {
        return this.e;
    }

    public boolean a(aun aun2, int n2) {
        return n2 > 0;
    }

    public boolean b(aun aun2, int n2) {
        return n2 < this.e.c() - 1;
    }

    public void a(aun aun2, int n2, boolean bl2) {
        int n3 = bl2 ? 0 : n2 - 1;
        this.e.a(n2, n3);
        if (this.d.l() == n2) {
            this.b(n3);
        }
        this.d.a(this.e);
    }

    public void b(aun aun2, int n2, boolean bl2) {
        int n3 = bl2 ? this.e.c() - 1 : n2 + 1;
        this.e.a(n2, n3);
        if (this.d.l() == n2) {
            this.b(n3);
        }
        this.d.a(this.e);
    }
}

