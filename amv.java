/*
 * Decompiled with CFR 0.150.
 */
public class amv
extends ck {
    private final xy a;
    private final cyt b;
    private bga c;
    private int d = -1;
    private final double e;
    private int f;
    private final int g;
    private final int h;
    private final float i;
    private final float j;

    public amv(cyt cyt2, double d2, int n2, float f2) {
        this(cyt2, d2, n2, n2, f2);
    }

    public amv(cyt cyt2, double d2, int n2, int n3, float f2) {
        if (!(cyt2 instanceof bga)) {
            throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
        }
        this.b = cyt2;
        this.a = (xy)((Object)cyt2);
        this.e = d2;
        this.g = n2;
        this.h = n3;
        this.i = f2;
        this.j = f2 * f2;
        this.a(3);
    }

    @Override
    public boolean b() {
        bga bga2 = this.a.ar();
        if (bga2 == null) {
            return false;
        }
        this.c = bga2;
        return true;
    }

    @Override
    public boolean a() {
        return this.b() || !this.a.ap().m();
    }

    @Override
    public void d() {
        this.c = null;
        this.f = 0;
        this.d = -1;
    }

    @Override
    public void e() {
        double d2 = this.a.i(this.c.aU, this.c.cD().b, this.c.aW);
        boolean bl2 = this.a.aq().a(this.c);
        this.f = bl2 ? ++this.f : 0;
        if (d2 > (double)this.j || this.f < 20) {
            this.a.ap().a(this.c, this.e);
        } else {
            this.a.ap().n();
        }
        this.a.am().a(this.c, 30.0f, 30.0f);
        if (--this.d == 0) {
            float f2;
            if (d2 > (double)this.j || !bl2) {
                return;
            }
            float f3 = f2 = cmk.a(d2) / this.i;
            f3 = cmk.a(f3, 0.1f, 1.0f);
            this.b.a(this.c, f3);
            this.d = cmk.d(f2 * (float)(this.h - this.g) + (float)this.g);
        } else if (this.d < 0) {
            float f4 = cmk.a(d2) / this.i;
            this.d = cmk.d(f4 * (float)(this.h - this.g) + (float)this.g);
        }
    }
}

