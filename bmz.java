/*
 * Decompiled with CFR 0.150.
 */
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.a.g;
import org.lwjgl.a.j;

public class bmz
extends cjn
implements ddy {
    private static final d b = org.apache.logging.log4j.c.c();
    private String c = "";
    private int d = -1;
    private ahg e;
    protected cld a;
    private String f = "";

    public bmz() {
    }

    public bmz(String string) {
        this.f = string;
    }

    @Override
    public void cH_() {
        g.a(true);
        this.d = this.u.r.c().c().size();
        this.a = new cld(0, this.B, 4, this.x - 12, this.w - 4, 12);
        this.a.f(100);
        this.a.a(false);
        this.a.b(true);
        this.a.a(this.f);
        this.a.d(false);
        this.e = new dag(this.a);
    }

    @Override
    public void aG_() {
        g.a(false);
        this.u.r.c().d();
    }

    @Override
    public void d() {
        this.a.a();
    }

    @Override
    protected void a(char c2, int n2) {
        this.e.d();
        if (n2 == 15) {
            this.e.a();
        } else {
            this.e.c();
        }
        if (n2 == 1) {
            this.u.a((cjn)null);
        } else if (n2 == 28 || n2 == 156) {
            String string = this.a.b().trim();
            if (!string.isEmpty()) {
                this.e(string);
            }
            this.u.a((cjn)null);
        } else if (n2 == 200) {
            this.b(-1);
        } else if (n2 == 208) {
            this.b(1);
        } else if (n2 == 201) {
            this.u.r.c().b(this.u.r.c().i() - 1);
        } else if (n2 == 209) {
            this.u.r.c().b(-this.u.r.c().i() + 1);
        } else {
            this.a.a(c2, n2);
        }
    }

    @Override
    public void p_() {
        super.p_();
        int n2 = j.o();
        if (n2 != 0) {
            if (n2 > 1) {
                n2 = 1;
            }
            if (n2 < -1) {
                n2 = -1;
            }
            if (!bmz.o()) {
                n2 *= 7;
            }
            this.u.r.c().b(n2);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        cbg cbg2;
        if (n4 == 0 && (cbg2 = this.u.r.c().a(j.q(), j.r())) != null && this.a(cbg2)) {
            return;
        }
        this.a.a(n2, n3, n4);
        super.a(n2, n3, n4);
    }

    @Override
    protected void a(String string, boolean bl2) {
        if (bl2) {
            this.a.a(string);
        } else {
            this.a.b(string);
        }
    }

    public void b(int n2) {
        int n3 = this.d + n2;
        int n4 = this.u.r.c().c().size();
        if ((n3 = cmk.a(n3, 0, n4)) == this.d) {
            return;
        }
        if (n3 == n4) {
            this.d = n4;
            this.a.a(this.c);
            return;
        }
        if (this.d == n4) {
            this.c = this.a.b();
        }
        this.a.a((String)this.u.r.c().c().get(n3));
        this.d = n3;
    }

    @Override
    public void a(int n2, int n3, float f2) {
        bmz.a(2, this.x - 14, this.w - 2, this.x - 2, Integer.MIN_VALUE);
        this.a.g();
        cbg cbg2 = this.u.r.c().a(j.q(), j.r());
        if (cbg2 != null && cbg2.h().i() != null) {
            this.a(cbg2, n2, n3);
        }
        super.a(n2, n3, f2);
    }

    @Override
    public boolean q_() {
        return false;
    }

    @Override
    public void a(String ... arrstring) {
        this.e.a(arrstring);
    }
}

