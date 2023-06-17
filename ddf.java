/*
 * Decompiled with CFR 0.150.
 */
import io.netty.b.bi;
import org.lwjgl.a.g;

public class ddf
extends cjn
implements ddy {
    private cld a;
    private cld b;
    private final jf c;
    private cwv d;
    private cwv e;
    private cwv f;
    private cwv g;
    private cwv h;
    private cwv i;
    private boolean j;
    private cjt k = cjt.c;
    private ahg l;
    private boolean m;
    private boolean r;

    public ddf(jf jf2) {
        this.c = jf2;
    }

    @Override
    public void d() {
        this.a.a();
    }

    @Override
    public void cH_() {
        cxh cxh2 = this.c.d();
        org.lwjgl.a.g.a(true);
        this.y.clear();
        this.d = this.b(new cwv(0, this.w / 2 - 4 - 150, this.x / 4 + 120 + 12, 150, 20, bf.a("gui.done", new Object[0])));
        this.e = this.b(new cwv(1, this.w / 2 + 4, this.x / 4 + 120 + 12, 150, 20, bf.a("gui.cancel", new Object[0])));
        this.f = this.b(new cwv(4, this.w / 2 + 150 - 20, 135, 20, 20, "O"));
        this.g = this.b(new cwv(5, this.w / 2 - 50 - 100 - 4, 165, 100, 20, bf.a("advMode.mode.sequence", new Object[0])));
        this.h = this.b(new cwv(6, this.w / 2 - 50, 165, 100, 20, bf.a("advMode.mode.unconditional", new Object[0])));
        this.i = this.b(new cwv(7, this.w / 2 + 50 + 4, 165, 100, 20, bf.a("advMode.mode.redstoneTriggered", new Object[0])));
        this.a = new cld(2, this.B, this.w / 2 - 150, 50, 300, 20);
        this.a.f(32500);
        this.a.b(true);
        this.b = new cld(3, this.B, this.w / 2 - 150, 135, 276, 20);
        this.b.f(32500);
        this.b.c(false);
        this.b.a("-");
        this.d.k = false;
        this.f.k = false;
        this.g.k = false;
        this.h.k = false;
        this.i.k = false;
        this.l = new bev(this, this.a, true, cxh2);
    }

    public void f() {
        cxh cxh2 = this.c.d();
        this.a.a(cxh2.l());
        this.j = cxh2.m();
        this.k = this.c.k();
        this.m = this.c.l();
        this.r = this.c.h();
        this.h();
        this.i();
        this.q();
        this.r();
        this.d.k = true;
        this.f.k = true;
        this.g.k = true;
        this.h.k = true;
        this.i.k = true;
    }

    @Override
    public void aG_() {
        org.lwjgl.a.g.a(false);
    }

    @Override
    protected void a(cwv cwv2) {
        if (!cwv2.k) {
            return;
        }
        cxh cxh2 = this.c.d();
        if (cwv2.j == 1) {
            cxh2.a(this.j);
            this.u.a((cjn)null);
        } else if (cwv2.j == 0) {
            si si2 = new si(bi.a());
            cxh2.a(si2);
            si2.a(this.a.b());
            si2.a(cxh2.m());
            si2.a(this.k.name());
            si2.a(this.m);
            si2.a(this.r);
            this.u.x().a(new pm("MC|AutoCmd", si2));
            if (!cxh2.m()) {
                cxh2.b((cbg)null);
            }
            this.u.a((cjn)null);
        } else if (cwv2.j == 4) {
            cxh2.a(!cxh2.m());
            this.h();
        } else if (cwv2.j == 5) {
            this.j();
            this.i();
        } else if (cwv2.j == 6) {
            this.m = !this.m;
            this.q();
        } else if (cwv2.j == 7) {
            this.r = !this.r;
            this.r();
        }
    }

    @Override
    protected void a(char c2, int n2) {
        this.l.d();
        if (n2 == 15) {
            this.l.a();
        } else {
            this.l.c();
        }
        this.a.a(c2, n2);
        this.b.a(c2, n2);
        if (n2 == 28 || n2 == 156) {
            this.a(this.d);
        } else if (n2 == 1) {
            this.a(this.e);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.a.a(n2, n3, n4);
        this.b.a(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.aH_();
        this.a(this.B, bf.a("advMode.setCommand", new Object[0]), this.w / 2, 20, 0xFFFFFF);
        this.b(this.B, bf.a("advMode.command", new Object[0]), this.w / 2 - 150, 37, 0xA0A0A0);
        this.a.g();
        int n4 = 75;
        int n5 = 0;
        this.b(this.B, bf.a("advMode.nearestPlayer", new Object[0]), this.w / 2 - 150, n4 + n5++ * this.B.a, 0xA0A0A0);
        this.b(this.B, bf.a("advMode.randomPlayer", new Object[0]), this.w / 2 - 150, n4 + n5++ * this.B.a, 0xA0A0A0);
        this.b(this.B, bf.a("advMode.allPlayers", new Object[0]), this.w / 2 - 150, n4 + n5++ * this.B.a, 0xA0A0A0);
        this.b(this.B, bf.a("advMode.allEntities", new Object[0]), this.w / 2 - 150, n4 + n5++ * this.B.a, 0xA0A0A0);
        this.b(this.B, "", this.w / 2 - 150, n4 + n5++ * this.B.a, 0xA0A0A0);
        if (!this.b.b().isEmpty()) {
            this.b(this.B, bf.a("advMode.previousOutput", new Object[0]), this.w / 2 - 150, n4 += n5 * this.B.a + 1, 0xA0A0A0);
            this.b.g();
        }
        super.a(n2, n3, f2);
    }

    private void h() {
        cxh cxh2 = this.c.d();
        if (cxh2.m()) {
            this.f.i = "O";
            if (cxh2.k() != null) {
                this.b.a(cxh2.k().i());
            }
        } else {
            this.f.i = "X";
            this.b.a("-");
        }
    }

    private void i() {
        switch (this.k) {
            case a: {
                this.g.i = bf.a("advMode.mode.sequence", new Object[0]);
                break;
            }
            case b: {
                this.g.i = bf.a("advMode.mode.auto", new Object[0]);
                break;
            }
            case c: {
                this.g.i = bf.a("advMode.mode.redstone", new Object[0]);
            }
        }
    }

    private void j() {
        switch (this.k) {
            case a: {
                this.k = cjt.b;
                break;
            }
            case b: {
                this.k = cjt.c;
                break;
            }
            case c: {
                this.k = cjt.a;
            }
        }
    }

    private void q() {
        this.h.i = this.m ? bf.a("advMode.mode.conditional", new Object[0]) : bf.a("advMode.mode.unconditional", new Object[0]);
    }

    private void r() {
        this.i.i = this.r ? bf.a("advMode.mode.autoexec.bat", new Object[0]) : bf.a("advMode.mode.redstoneTriggered", new Object[0]);
    }

    @Override
    public void a(String ... arrstring) {
        this.l.a(arrstring);
    }
}

