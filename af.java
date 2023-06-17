/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.util.Set;

public class af
extends ck {
    private final cfl a;
    private final double b;
    private double c;
    private double d;
    private double e;
    private double f;
    private double g;
    private bdl h;
    private int i;
    private boolean j;
    private final Set k;
    private final boolean l;

    public af(cfl cfl2, double d2, azg azg2, boolean bl2) {
        this(cfl2, d2, bl2, aad.a(azg2));
    }

    public af(cfl cfl2, double d2, boolean bl2, Set set) {
        this.a = cfl2;
        this.b = d2;
        this.k = set;
        this.l = bl2;
        this.a(3);
        if (!(cfl2.ap() instanceof vp)) {
            throw new IllegalArgumentException("Unsupported mob type for TemptGoal");
        }
    }

    @Override
    public boolean b() {
        if (this.i > 0) {
            --this.i;
            return false;
        }
        this.h = this.a.aQ.a((cpk)this.a, 10.0);
        if (this.h == null) {
            return false;
        }
        return this.a(this.h.bt()) || this.a(this.h.bu());
    }

    protected boolean a(bhl bhl2) {
        if (bhl2 == null) {
            return false;
        }
        return this.k.contains(bhl2.a());
    }

    @Override
    public boolean a() {
        if (this.l) {
            if (this.a.l(this.h) < 36.0) {
                if (this.h.i(this.c, this.d, this.e) > 0.010000000000000002) {
                    return false;
                }
                if (Math.abs((double)this.h.bb - this.f) > 5.0 || Math.abs((double)this.h.ba - this.g) > 5.0) {
                    return false;
                }
            } else {
                this.c = this.h.aU;
                this.d = this.h.aV;
                this.e = this.h.aW;
            }
            this.f = this.h.bb;
            this.g = this.h.ba;
        }
        return this.b();
    }

    @Override
    public void c() {
        this.c = this.h.aU;
        this.d = this.h.aV;
        this.e = this.h.aW;
        this.j = true;
    }

    @Override
    public void d() {
        this.h = null;
        this.a.ap().n();
        this.i = 100;
        this.j = false;
    }

    @Override
    public void e() {
        this.a.am().a(this.h, (float)(this.a.ax() + 20), (float)this.a.aw());
        if (this.a.l(this.h) < 6.25) {
            this.a.ap().n();
        } else {
            this.a.ap().a(this.h, this.b);
        }
    }

    public boolean f() {
        return this.j;
    }
}

