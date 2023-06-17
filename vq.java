/*
 * Decompiled with CFR 0.150.
 */
public class vq
extends ck {
    private final cfl a;
    private double b;
    private double c;
    private double d;
    private final double e;
    private int f;
    private boolean g;

    public vq(cfl cfl2, double d2) {
        this(cfl2, d2, 120);
    }

    public vq(cfl cfl2, double d2, int n2) {
        this.a = cfl2;
        this.e = d2;
        this.f = n2;
        this.a(1);
    }

    @Override
    public boolean b() {
        amj amj2;
        if (!this.g) {
            if (this.a.bb() >= 100) {
                return false;
            }
            if (this.a.aW().nextInt(this.f) != 0) {
                return false;
            }
        }
        if ((amj2 = ble.a(this.a, 10, 7)) == null) {
            return false;
        }
        this.b = amj2.b;
        this.c = amj2.c;
        this.d = amj2.d;
        this.g = false;
        return true;
    }

    @Override
    public boolean a() {
        return !this.a.ap().m();
    }

    @Override
    public void c() {
        this.a.ap().a(this.b, this.c, this.d, this.e);
    }

    public void f() {
        this.g = true;
    }

    public void b(int n2) {
        this.f = n2;
    }
}

