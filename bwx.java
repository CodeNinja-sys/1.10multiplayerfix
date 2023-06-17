/*
 * Decompiled with CFR 0.150.
 */
class bwx
extends ck {
    private final bym a;
    private int b;

    public bwx(bym bym2) {
        this.a = bym2;
        this.a(3);
    }

    @Override
    public boolean b() {
        bga bga2 = this.a.ar();
        return bga2 != null && bga2.bj();
    }

    @Override
    public boolean a() {
        return super.a() && (this.a.aM() || this.a.l(this.a.ar()) > 9.0);
    }

    @Override
    public void c() {
        this.b = -10;
        this.a.ap().n();
        this.a.am().a(this.a.ar(), 90.0f, 90.0f);
        this.a.bO = true;
    }

    @Override
    public void d() {
        bym.a(this.a, 0);
        this.a.b((bga)null);
        bym.a(this.a).f();
    }

    @Override
    public void e() {
        bga bga2 = this.a.ar();
        this.a.ap().n();
        this.a.am().a(bga2, 90.0f, 90.0f);
        if (!this.a.j(bga2)) {
            this.a.b((bga)null);
            return;
        }
        ++this.b;
        if (this.b == 0) {
            bym.a(this.a, this.a.ar().bW());
            this.a.aQ.a((cpk)this.a, (byte)21);
        } else if (this.b >= this.a.aL()) {
            float f2 = 1.0f;
            if (this.a.aQ.Q() == ct.d) {
                f2 += 2.0f;
            }
            if (this.a.aM()) {
                f2 += 2.0f;
            }
            bga2.a(ahy.b(this.a, this.a), f2);
            bga2.a(ahy.b(this.a), (float)this.a.a(cgz.e).e());
            this.a.b((bga)null);
        }
        super.e();
    }
}

