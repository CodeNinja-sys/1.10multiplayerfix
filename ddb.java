/*
 * Decompiled with CFR 0.150.
 */
class ddb
extends ahx {
    final /* synthetic */ cmg a;

    public ddb(cmg cmg2) {
        this.a = cmg2;
        super((cfl)cmg2, false, new Class[0]);
    }

    @Override
    public void c() {
        super.c();
        if (this.a.R_()) {
            this.f();
            this.d();
        }
    }

    @Override
    protected void a(cfl cfl2, bga bga2) {
        if (cfl2 instanceof cmg && !((cmg)cfl2).R_()) {
            super.a(cfl2, bga2);
        }
    }
}

