/*
 * Decompiled with CFR 0.150.
 */
public class car
extends cjn {
    protected cjn a;
    private aoz b;
    private final cmx c;
    private final vm d;
    private bcy e;
    private bcy f;

    public car(cjn cjn2, cmx cmx2, vm vm2) {
        this.a = cjn2;
        this.c = cmx2;
        this.d = vm2;
    }

    @Override
    public void cH_() {
        this.e = (bcy)this.b(new bcy(100, this.w / 2 - 155, this.x - 38, oi.E, this.c.c(oi.E)));
        this.f = (bcy)this.b(new bcy(6, this.w / 2 - 155 + 160, this.x - 38, bf.a("gui.done", new Object[0])));
        this.b = new aoz(this, this.u);
        this.b.d(7, 8);
    }

    @Override
    public void p_() {
        super.p_();
        this.b.i();
    }

    @Override
    protected void a(cwv cwv2) {
        if (!cwv2.k) {
            return;
        }
        switch (cwv2.j) {
            case 100: {
                if (!(cwv2 instanceof bcy)) break;
                this.c.a(((bcy)cwv2).a(), 1);
                cwv2.i = this.c.c(oi.E);
                cnt cnt2 = new cnt(this.u);
                int n2 = cnt2.a();
                int n3 = cnt2.b();
                this.a(this.u, n2, n3);
                break;
            }
            case 5: {
                break;
            }
            case 6: {
                this.u.a(this.a);
                break;
            }
            default: {
                this.b.a(cwv2);
            }
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.b.a(n2, n3, f2);
        this.a(this.B, bf.a("options.language", new Object[0]), this.w / 2, 16, 0xFFFFFF);
        this.a(this.B, "(" + bf.a("options.languageWarning", new Object[0]) + ")", this.w / 2, this.x - 56, 0x808080);
        super.a(n2, n3, f2);
    }

    static /* synthetic */ vm a(car car2) {
        return car2.d;
    }

    static /* synthetic */ cmx b(car car2) {
        return car2.c;
    }

    static /* synthetic */ bcy c(car car2) {
        return car2.f;
    }

    static /* synthetic */ bcy d(car car2) {
        return car2.e;
    }
}

