/*
 * Decompiled with CFR 0.150.
 */
public class dae
extends cjn {
    private final clo a;
    private bnv b = bnv.e();
    private String c;
    private String d;
    private String e;
    private ie f;
    private cwv g;
    private cwv h;
    private cwv i;

    public dae(clo clo2, String string) {
        this.a = clo2;
        this.a(string);
    }

    public String f() {
        return this.b.toString();
    }

    public void a(String string) {
        this.b = bnv.a(string);
    }

    @Override
    public void cH_() {
        this.y.clear();
        this.c = bf.a("createWorld.customize.flat.title", new Object[0]);
        this.d = bf.a("createWorld.customize.flat.tile", new Object[0]);
        this.e = bf.a("createWorld.customize.flat.height", new Object[0]);
        this.f = new ie(this);
        this.g = this.b(new cwv(2, this.w / 2 - 154, this.x - 52, 100, 20, bf.a("createWorld.customize.flat.addLayer", new Object[0]) + " (NYI)"));
        this.h = this.b(new cwv(3, this.w / 2 - 50, this.x - 52, 100, 20, bf.a("createWorld.customize.flat.editLayer", new Object[0]) + " (NYI)"));
        this.i = this.b(new cwv(4, this.w / 2 - 155, this.x - 52, 150, 20, bf.a("createWorld.customize.flat.removeLayer", new Object[0])));
        this.y.add(new cwv(0, this.w / 2 - 155, this.x - 28, 150, 20, bf.a("gui.done", new Object[0])));
        this.y.add(new cwv(5, this.w / 2 + 5, this.x - 52, 150, 20, bf.a("createWorld.customize.presets", new Object[0])));
        this.y.add(new cwv(1, this.w / 2 + 5, this.x - 28, 150, 20, bf.a("gui.cancel", new Object[0])));
        this.g.l = false;
        this.h.l = false;
        this.b.d();
        this.h();
    }

    @Override
    public void p_() {
        super.p_();
        this.f.i();
    }

    @Override
    protected void a(cwv cwv2) {
        int n2 = this.b.c().size() - this.f.a - 1;
        if (cwv2.j == 1) {
            this.u.a(this.a);
        } else if (cwv2.j == 0) {
            this.a.a = this.f();
            this.u.a(this.a);
        } else if (cwv2.j == 5) {
            this.u.a(new x(this));
        } else if (cwv2.j == 4 && this.i()) {
            this.b.c().remove(n2);
            this.f.a = Math.min(this.f.a, this.b.c().size() - 1);
        }
        this.b.d();
        this.h();
    }

    public void h() {
        boolean bl2;
        this.i.k = bl2 = this.i();
        this.h.k = bl2;
        this.h.k = false;
        this.g.k = false;
    }

    private boolean i() {
        return this.f.a > -1 && this.f.a < this.b.c().size();
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.aH_();
        this.f.a(n2, n3, f2);
        this.a(this.B, this.c, this.w / 2, 8, 0xFFFFFF);
        int n4 = this.w / 2 - 92 - 16;
        this.b(this.B, this.d, n4, 32, 0xFFFFFF);
        this.b(this.B, this.e, n4 + 2 + 213 - this.B.a(this.e), 32, 0xFFFFFF);
        super.a(n2, n3, f2);
    }

    static /* synthetic */ float a(dae dae2) {
        return dae2.q;
    }

    static /* synthetic */ float b(dae dae2) {
        return dae2.q;
    }

    static /* synthetic */ float c(dae dae2) {
        return dae2.q;
    }

    static /* synthetic */ float d(dae dae2) {
        return dae2.q;
    }

    static /* synthetic */ bnv e(dae dae2) {
        return dae2.b;
    }
}

