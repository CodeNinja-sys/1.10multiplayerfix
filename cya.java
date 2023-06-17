/*
 * Decompiled with CFR 0.150.
 */
import org.apache.commons.c.ao;

public class cya
implements ds {
    private bi a;
    private csg b;
    private int c;
    private int d;
    private int e;
    private float f;
    private float g;

    public cya() {
    }

    public cya(bi bi2, csg csg2, double d2, double d3, double d4, float f2, float f3) {
        ao.a((Object)bi2, "sound", new Object[0]);
        this.a = bi2;
        this.b = csg2;
        this.c = (int)(d2 * 8.0);
        this.d = (int)(d3 * 8.0);
        this.e = (int)(d4 * 8.0);
        this.f = f2;
        this.g = f3;
    }

    @Override
    public void a(si si2) {
        this.a = (bi)bi.a.a(si2.e());
        this.b = (csg)si2.a(csg.class);
        this.c = si2.K();
        this.d = si2.K();
        this.e = si2.K();
        this.f = si2.O();
        this.g = si2.O();
    }

    @Override
    public void b(si si2) {
        si2.d(bi.a.a(this.a));
        si2.a(this.b);
        si2.E(this.c);
        si2.E(this.d);
        si2.E(this.e);
        si2.a(this.f);
        si2.a(this.g);
    }

    public bi a() {
        return this.a;
    }

    public csg b() {
        return this.b;
    }

    public double c() {
        return (float)this.c / 8.0f;
    }

    public double d() {
        return (float)this.d / 8.0f;
    }

    public double e() {
        return (float)this.e / 8.0f;
    }

    public float f() {
        return this.f;
    }

    public float g() {
        return this.g;
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }
}

