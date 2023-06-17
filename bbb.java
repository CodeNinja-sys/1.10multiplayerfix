/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.dg;
import com.a.a.d.ov;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class bbb
extends cjn
implements awn {
    private static final d c = org.apache.logging.log4j.c.c();
    protected cjn a;
    protected String b = "Select world";
    private String d;
    private cwv e;
    private cwv f;
    private cwv g;
    private cwv h;
    private vg i;

    public bbb(cjn cjn2) {
        this.a = cjn2;
    }

    @Override
    public void cH_() {
        this.b = bf.a("selectWorld.title", new Object[0]);
        this.i = new vg(this, this.u, this.w, this.x, 32, this.x - 64, 36);
        this.f();
    }

    @Override
    public void p_() {
        super.p_();
        this.i.i();
    }

    public void f() {
        this.f = this.b(new cwv(1, this.w / 2 - 154, this.x - 52, 150, 20, bf.a("selectWorld.select", new Object[0])));
        this.b(new cwv(3, this.w / 2 + 4, this.x - 52, 150, 20, bf.a("selectWorld.create", new Object[0])));
        this.g = this.b(new cwv(4, this.w / 2 - 154, this.x - 28, 72, 20, bf.a("selectWorld.edit", new Object[0])));
        this.e = this.b(new cwv(2, this.w / 2 - 76, this.x - 28, 72, 20, bf.a("selectWorld.delete", new Object[0])));
        this.h = this.b(new cwv(5, this.w / 2 + 4, this.x - 28, 72, 20, bf.a("selectWorld.recreate", new Object[0])));
        this.b(new cwv(0, this.w / 2 + 82, this.x - 28, 72, 20, bf.a("gui.cancel", new Object[0])));
        this.f.k = false;
        this.e.k = false;
        this.g.k = false;
        this.h.k = false;
    }

    @Override
    protected void a(cwv cwv2) {
        if (!cwv2.k) {
            return;
        }
        coq coq2 = this.i.m();
        if (cwv2.j == 2) {
            if (coq2 != null) {
                coq2.b();
            }
        } else if (cwv2.j == 1) {
            if (coq2 != null) {
                coq2.a();
            }
        } else if (cwv2.j == 3) {
            this.u.a(new clo(this));
        } else if (cwv2.j == 4) {
            if (coq2 != null) {
                coq2.c();
            }
        } else if (cwv2.j == 0) {
            this.u.a(this.a);
        } else if (cwv2.j == 5 && coq2 != null) {
            coq2.d();
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.d = null;
        this.i.a(n2, n3, f2);
        this.a(this.B, this.b, this.w / 2, 20, 0xFFFFFF);
        super.a(n2, n3, f2);
        if (this.d != null) {
            this.a(ov.a(dg.a("\n").a(this.d)), n2, n3);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.i.b(n2, n3, n4);
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        super.b(n2, n3, n4);
        this.i.c(n2, n3, n4);
    }

    public void a(String string) {
        this.d = string;
    }

    public void a(coq coq2) {
        boolean bl2;
        this.f.k = bl2 = coq2 != null;
        this.e.k = bl2;
        this.g.k = bl2;
        this.h.k = bl2;
    }
}

