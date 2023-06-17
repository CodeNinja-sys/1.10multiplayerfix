/*
 * Decompiled with CFR 0.150.
 */
public class rg
extends cef {
    public rg(iu iu2) {
        super(iu2);
    }

    public rg(iu iu2, double d2, double d3, double d4) {
        super(iu2, d2, d3, d4);
    }

    public static void a(cgy cgy2) {
        cef.b(cgy2, "MinecartRideable");
    }

    @Override
    public boolean a(bdl bdl2, bhl bhl2, bqp bqp2) {
        if (bdl2.ar_()) {
            return false;
        }
        if (this.cq()) {
            return true;
        }
        if (!this.aQ.C) {
            bdl2.m(this);
        }
        return true;
    }

    @Override
    public void a(int n2, int n3, int n4, boolean bl2) {
        if (bl2) {
            if (this.cq()) {
                this.cl();
            }
            if (this.C() == 0) {
                this.e(-this.E());
                this.d(10);
                this.c(50.0f);
                this.bz();
            }
        }
    }

    @Override
    public cta bd_() {
        return cta.a;
    }
}

