/*
 * Decompiled with CFR 0.150.
 */
public abstract class cni
extends ck {
    protected final cfl c;
    protected boolean d;
    private final boolean a;
    private int b;
    private int g;
    private int h;
    protected bga e;
    protected int f = 60;

    public cni(cfl cfl2, boolean bl2) {
        this(cfl2, bl2, false);
    }

    public cni(cfl cfl2, boolean bl2, boolean bl3) {
        this.c = cfl2;
        this.d = bl2;
        this.a = bl3;
    }

    @Override
    public boolean a() {
        bga bga2 = this.c.ar();
        if (bga2 == null) {
            bga2 = this.e;
        }
        if (bga2 == null) {
            return false;
        }
        if (!bga2.bj()) {
            return false;
        }
        ccw ccw2 = this.c.as_();
        ccw ccw3 = bga2.as_();
        if (ccw2 != null && ccw3 == ccw2) {
            return false;
        }
        double d2 = this.aK_();
        if (this.c.l(bga2) > d2 * d2) {
            return false;
        }
        if (this.d) {
            if (this.c.aq().a(bga2)) {
                this.h = 0;
            } else if (++this.h > this.f) {
                return false;
            }
        }
        if (bga2 instanceof bdl && ((bdl)bga2).G.a) {
            return false;
        }
        this.c.b(bga2);
        return true;
    }

    protected double aK_() {
        cp cp2 = this.c.a(cgz.b);
        return cp2 == null ? 16.0 : cp2.e();
    }

    @Override
    public void c() {
        this.b = 0;
        this.g = 0;
        this.h = 0;
    }

    @Override
    public void d() {
        this.c.b((bga)null);
        this.e = null;
    }

    public static boolean a(xy xy2, bga bga2, boolean bl2, boolean bl3) {
        if (bga2 == null) {
            return false;
        }
        if (bga2 == xy2) {
            return false;
        }
        if (!bga2.bj()) {
            return false;
        }
        if (!xy2.a(bga2.getClass())) {
            return false;
        }
        if (xy2.d((cpk)bga2)) {
            return false;
        }
        if (xy2 instanceof uf && ((uf)((Object)xy2)).D() != null) {
            if (bga2 instanceof uf && ((uf)((Object)xy2)).D().equals(bga2.cx())) {
                return false;
            }
            if (bga2 == ((uf)((Object)xy2)).H()) {
                return false;
            }
        } else if (bga2 instanceof bdl && !bl2 && ((bdl)bga2).G.a) {
            return false;
        }
        return !bl3 || xy2.aq().a(bga2);
    }

    protected boolean a(bga bga2, boolean bl2) {
        if (!cni.a(this.c, bga2, bl2, this.d)) {
            return false;
        }
        if (!this.c.d(new cmz(bga2))) {
            return false;
        }
        if (this.a) {
            if (--this.g <= 0) {
                this.b = 0;
            }
            if (this.b == 0) {
                int n2 = this.b = this.a(bga2) ? 1 : 2;
            }
            if (this.b == 2) {
                return false;
            }
        }
        return true;
    }

    private boolean a(bga bga2) {
        int n2;
        this.g = 10 + this.c.aW().nextInt(5);
        dbn dbn2 = this.c.ap().a(bga2);
        if (dbn2 == null) {
            return false;
        }
        aqn aqn2 = dbn2.c();
        if (aqn2 == null) {
            return false;
        }
        int n3 = aqn2.a - cmk.c(bga2.aU);
        return (double)(n3 * n3 + (n2 = aqn2.c - cmk.c(bga2.aW)) * n2) <= 2.25;
    }
}

