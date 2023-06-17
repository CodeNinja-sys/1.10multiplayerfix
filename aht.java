/*
 * Decompiled with CFR 0.150.
 */
import io.netty.b.bi;
import org.lwjgl.a.g;

public class aht
extends cjn
implements ddy {
    private cld a;
    private cld b;
    private final cxh c;
    private cwv d;
    private cwv e;
    private cwv f;
    private boolean g;
    private ahg h;

    public aht(cxh cxh2) {
        this.c = cxh2;
    }

    @Override
    public void d() {
        this.a.a();
    }

    @Override
    public void cH_() {
        org.lwjgl.a.g.a(true);
        this.y.clear();
        this.d = this.b(new cwv(0, this.w / 2 - 4 - 150, this.x / 4 + 120 + 12, 150, 20, bf.a("gui.done", new Object[0])));
        this.e = this.b(new cwv(1, this.w / 2 + 4, this.x / 4 + 120 + 12, 150, 20, bf.a("gui.cancel", new Object[0])));
        this.f = this.b(new cwv(4, this.w / 2 + 150 - 20, 150, 20, 20, "O"));
        this.a = new cld(2, this.B, this.w / 2 - 150, 50, 300, 20);
        this.a.f(32500);
        this.a.b(true);
        this.a.a(this.c.l());
        this.b = new cld(3, this.B, this.w / 2 - 150, 150, 276, 20);
        this.b.f(32500);
        this.b.c(false);
        this.b.a("-");
        this.g = this.c.m();
        this.f();
        this.d.k = !this.a.b().trim().isEmpty();
        this.h = new bbp(this, this.a, true);
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
        if (cwv2.j == 1) {
            this.c.a(this.g);
            this.u.a((cjn)null);
        } else if (cwv2.j == 0) {
            si si2 = new si(bi.a());
            si2.B(this.c.i());
            this.c.a(si2);
            si2.a(this.a.b());
            si2.a(this.c.m());
            this.u.x().a(new pm("MC|AdvCmd", si2));
            if (!this.c.m()) {
                this.c.b((cbg)null);
            }
            this.u.a((cjn)null);
        } else if (cwv2.j == 4) {
            this.c.a(!this.c.m());
            this.f();
        }
    }

    @Override
    protected void a(char c2, int n2) {
        this.h.d();
        if (n2 == 15) {
            this.h.a();
        } else {
            this.h.c();
        }
        this.a.a(c2, n2);
        this.b.a(c2, n2);
        boolean bl2 = this.d.k = !this.a.b().trim().isEmpty();
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
            this.b(this.B, bf.a("advMode.previousOutput", new Object[0]), this.w / 2 - 150, n4 += n5 * this.B.a + 16, 0xA0A0A0);
            this.b.g();
        }
        super.a(n2, n3, f2);
    }

    private void f() {
        if (this.c.m()) {
            this.f.i = "O";
            if (this.c.k() != null) {
                this.b.a(this.c.k().i());
            }
        } else {
            this.f.i = "X";
            this.b.a("-");
        }
    }

    @Override
    public void a(String ... arrstring) {
        this.h.a(arrstring);
    }

    static /* synthetic */ cxh a(aht aht2) {
        return aht2.c;
    }
}

