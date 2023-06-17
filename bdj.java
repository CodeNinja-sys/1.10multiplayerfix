/*
 * Decompiled with CFR 0.150.
 */
public class bdj
implements ye {
    private final cke b;
    private final String c;
    private final cwv d;
    private final cwv e;
    final /* synthetic */ nu a;

    private bdj(nu nu2, cke cke2) {
        this.a = nu2;
        this.b = cke2;
        this.c = bf.a(cke2.h(), new Object[0]);
        this.d = new cwv(0, 0, 0, 75, 20, bf.a(cke2.h(), new Object[0]));
        this.e = new cwv(0, 0, 0, 50, 20, bf.a("controls.reset", new Object[0]));
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        boolean bl3 = nu.b((nu)this.a).b == this.b;
        nu.a((nu)this.a).k.a(this.c, n3 + 90 - nu.c(this.a), n4 + n6 / 2 - nu.a((nu)this.a).k.a / 2, 0xFFFFFF);
        this.e.g = n3 + 190;
        this.e.h = n4;
        this.e.k = this.b.j() != this.b.i();
        this.e.c(nu.a(this.a), n7, n8);
        this.d.g = n3 + 105;
        this.d.h = n4;
        this.d.i = cmx.a(this.b.j());
        boolean bl4 = false;
        if (this.b.j() != 0) {
            for (cke cke2 : nu.a((nu)this.a).u.ao) {
                if (cke2 == this.b || cke2.j() != this.b.j()) continue;
                bl4 = true;
                break;
            }
        }
        if (bl3) {
            this.d.i = (Object)((Object)aug.p) + "> " + (Object)((Object)aug.o) + this.d.i + (Object)((Object)aug.p) + " <";
        } else if (bl4) {
            this.d.i = (Object)((Object)aug.m) + this.d.i;
        }
        this.d.c(nu.a(this.a), n7, n8);
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (this.d.b(nu.a(this.a), n3, n4)) {
            nu.b((nu)this.a).b = this.b;
            return true;
        }
        if (this.e.b(nu.a(this.a), n3, n4)) {
            nu.a((nu)this.a).u.a(this.b, this.b.i());
            cke.c();
            return true;
        }
        return false;
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.d.a(n3, n4);
        this.e.a(n3, n4);
    }

    @Override
    public void a(int n2, int n3, int n4) {
    }

    /* synthetic */ bdj(nu nu2, cke cke2, bcg bcg2) {
        this(nu2, cke2);
    }
}

