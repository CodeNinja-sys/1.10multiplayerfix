/*
 * Decompiled with CFR 0.150.
 */
public class cgs
extends ck {
    ddh a;
    bga b;

    public cgs(ddh ddh2) {
        this.a = ddh2;
        this.a(1);
    }

    @Override
    public boolean b() {
        bga bga2 = this.a.ar();
        return this.a.aL() > 0 || bga2 != null && this.a.l(bga2) < 9.0;
    }

    @Override
    public void c() {
        this.a.ap().n();
        this.b = this.a.ar();
    }

    @Override
    public void d() {
        this.b = null;
    }

    @Override
    public void e() {
        if (this.b == null) {
            this.a.d(-1);
            return;
        }
        if (this.a.l(this.b) > 49.0) {
            this.a.d(-1);
            return;
        }
        if (!this.a.aq().a(this.b)) {
            this.a.d(-1);
            return;
        }
        this.a.d(1);
    }
}

