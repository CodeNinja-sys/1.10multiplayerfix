/*
 * Decompiled with CFR 0.150.
 */
class ke
extends ck {
    private final akr a;
    private int b;

    public ke(akr akr2) {
        this.a = akr2;
        this.a(2);
    }

    @Override
    public boolean b() {
        bga bga2 = this.a.ar();
        if (bga2 == null) {
            return false;
        }
        if (!bga2.bj()) {
            return false;
        }
        return !(bga2 instanceof bdl) || !((bdl)bga2).G.a;
    }

    @Override
    public void c() {
        this.b = 300;
        super.c();
    }

    @Override
    public boolean a() {
        bga bga2 = this.a.ar();
        if (bga2 == null) {
            return false;
        }
        if (!bga2.bj()) {
            return false;
        }
        if (bga2 instanceof bdl && ((bdl)bga2).G.a) {
            return false;
        }
        return --this.b > 0;
    }

    @Override
    public void e() {
        this.a.a(this.a.ar(), 10.0f, 10.0f);
        ((all)this.a.an()).a(this.a.ba, this.a.T());
    }
}

