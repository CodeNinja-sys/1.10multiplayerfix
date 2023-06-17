/*
 * Decompiled with CFR 0.150.
 */
public class fg
extends ck {
    private final cwp a;

    public fg(cwp cwp2) {
        this.a = cwp2;
        this.a(5);
    }

    @Override
    public boolean b() {
        if (!this.a.bj()) {
            return false;
        }
        if (this.a.V_()) {
            return false;
        }
        if (!this.a.be) {
            return false;
        }
        if (this.a.bi) {
            return false;
        }
        bdl bdl2 = this.a.b();
        if (bdl2 == null) {
            return false;
        }
        if (this.a.l(bdl2) > 16.0) {
            return false;
        }
        return bdl2.p instanceof apq;
    }

    @Override
    public void c() {
        this.a.ap().n();
    }

    @Override
    public void d() {
        this.a.a((bdl)null);
    }
}

