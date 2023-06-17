/*
 * Decompiled with CFR 0.150.
 */
import java.util.Set;

public class aqf
implements ds {
    private double a;
    private double b;
    private double c;
    private float d;
    private float e;
    private Set f;
    private int g;

    public aqf() {
    }

    public aqf(double d2, double d3, double d4, float f2, float f3, Set set, int n2) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = f2;
        this.e = f3;
        this.f = set;
        this.g = n2;
    }

    @Override
    public void a(si si2) {
        this.a = si2.P();
        this.b = si2.P();
        this.c = si2.P();
        this.d = si2.O();
        this.e = si2.O();
        this.f = bgf.a(si2.F());
        this.g = si2.e();
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.a(this.b);
        si2.a(this.c);
        si2.a(this.d);
        si2.a(this.e);
        si2.B(bgf.a(this.f));
        si2.d(this.g);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public double a() {
        return this.a;
    }

    public double b() {
        return this.b;
    }

    public double c() {
        return this.c;
    }

    public float d() {
        return this.d;
    }

    public float e() {
        return this.e;
    }

    public int f() {
        return this.g;
    }

    public Set g() {
        return this.f;
    }
}

