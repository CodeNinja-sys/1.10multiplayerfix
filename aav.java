/*
 * Decompiled with CFR 0.150.
 */
public class aav
extends ck {
    private final hx a;
    private cwp b;
    private int c;

    public aav(hx hx2) {
        this.a = hx2;
        this.a(3);
    }

    @Override
    public boolean b() {
        if (!this.a.aQ.h()) {
            return false;
        }
        if (this.a.aW().nextInt(8000) != 0) {
            return false;
        }
        this.b = (cwp)this.a.aQ.a(cwp.class, this.a.cD().b(6.0, 2.0, 6.0), (cpk)this.a);
        return this.b != null;
    }

    @Override
    public boolean a() {
        return this.c > 0;
    }

    @Override
    public void c() {
        this.c = 400;
        this.a.a(true);
    }

    @Override
    public void d() {
        this.a.a(false);
        this.b = null;
    }

    @Override
    public void e() {
        this.a.am().a(this.b, 30.0f, 30.0f);
        --this.c;
    }
}

