/*
 * Decompiled with CFR 0.150.
 */
public class bzv
extends ck {
    private final xy a;
    private double b;
    private double c;
    private int d;

    public bzv(xy xy2) {
        this.a = xy2;
        this.a(3);
    }

    @Override
    public boolean b() {
        return this.a.aW().nextFloat() < 0.02f;
    }

    @Override
    public boolean a() {
        return this.d >= 0;
    }

    @Override
    public void c() {
        double d2 = Math.PI * 2 * this.a.aW().nextDouble();
        this.b = Math.cos(d2);
        this.c = Math.sin(d2);
        this.d = 20 + this.a.aW().nextInt(20);
    }

    @Override
    public void e() {
        --this.d;
        this.a.am().a(this.a.aU + this.b, this.a.aV + (double)this.a.A(), this.a.aW + this.c, this.a.ax(), this.a.aw());
    }
}

