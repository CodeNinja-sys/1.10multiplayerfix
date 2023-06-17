/*
 * Decompiled with CFR 0.150.
 */
class bps
extends ck {
    private final akr a;

    public bps(akr akr2) {
        this.a = akr2;
        this.a(5);
        ((vp)akr2.ap()).c(true);
    }

    @Override
    public boolean b() {
        return this.a.V_() || this.a.cj();
    }

    @Override
    public void e() {
        if (this.a.aW().nextFloat() < 0.8f) {
            this.a.ao().a();
        }
        ((all)this.a.an()).a(1.2);
    }
}

