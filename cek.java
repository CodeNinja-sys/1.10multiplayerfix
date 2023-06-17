/*
 * Decompiled with CFR 0.150.
 */
public class cek
extends cut {
    private int a;
    private int b = -1;

    public cek(xy xy2) {
        super(xy2);
    }

    @Override
    public boolean b() {
        if (!super.b()) {
            return false;
        }
        if (!this.c.aQ.F().b("mobGriefing")) {
            return false;
        }
        return !xt.d(this.c.aQ, this.d);
    }

    @Override
    public void c() {
        super.c();
        this.a = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a() {
        double d2 = this.c.e(this.d);
        if (this.a > 240) return false;
        if (xt.d(this.c.aQ, this.d)) return false;
        if (!(d2 < 4.0)) return false;
        return true;
    }

    @Override
    public void d() {
        super.d();
        this.c.aQ.c(this.c.bW(), this.d, -1);
    }

    @Override
    public void e() {
        super.e();
        if (this.c.aW().nextInt(20) == 0) {
            this.c.aQ.b(1019, this.d, 0);
        }
        ++this.a;
        int n2 = (int)((float)this.a / 240.0f * 10.0f);
        if (n2 != this.b) {
            this.c.aQ.c(this.c.bW(), this.d, n2);
            this.b = n2;
        }
        if (this.a == 240 && this.c.aQ.Q() == ct.d) {
            this.c.aQ.f(this.d);
            this.c.aQ.b(1021, this.d, 0);
            this.c.aQ.b(2001, this.d, bfa.c(this.e));
        }
    }
}

