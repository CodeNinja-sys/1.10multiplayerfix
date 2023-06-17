/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import com.a.a.d.aad;
import java.util.Set;
import net.minecraft.i.a;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.w.a.b;
import net.minecraft.w.b.bm;
import net.minecraft.w.n;
import net.minecraft.w.t;

public class e
extends bm {
    private final t a;
    private final double b;
    private double c;
    private double d;
    private double e;
    private double f;
    private double g;
    private b h;
    private int i;
    private boolean j;
    private final Set k;
    private final boolean l;

    public e(t t2, double d2, cg cg2, boolean bl2) {
        this(t2, d2, bl2, aad.a(cg2));
    }

    public e(t t2, double d2, boolean bl2, Set set) {
        this.a = t2;
        this.b = d2;
        this.k = set;
        this.l = bl2;
        this.b(3);
        if (!(t2.N() instanceof a)) {
            throw new IllegalArgumentException("Unsupported mob type for TemptGoal");
        }
    }

    @Override
    public boolean e() {
        if (this.i > 0) {
            --this.i;
            return false;
        }
        this.h = this.a.aQ.a((n)this.a, 10.0);
        return this.h == null ? false : this.a(this.h.bC()) || this.a(this.h.bD());
    }

    protected boolean a(cu cu2) {
        return cu2 == null ? false : this.k.contains(cu2.a());
    }

    @Override
    public boolean a() {
        if (this.l) {
            if (this.a.n(this.h) < 36.0) {
                if (this.h.h(this.c, this.d, this.e) > 0.010000000000000002) {
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
        return this.e();
    }

    @Override
    public void b() {
        this.c = this.h.aU;
        this.d = this.h.aV;
        this.e = this.h.aW;
        this.j = true;
    }

    @Override
    public void c() {
        this.h = null;
        this.a.N().m();
        this.i = 100;
        this.j = false;
    }

    @Override
    public void d() {
        this.a.I().a(this.h, (float)(this.a.ap() + 20), (float)this.a.ao());
        if (this.a.n(this.h) < 6.25) {
            this.a.N().m();
        } else {
            this.a.N().a(this.h, this.b);
        }
    }

    public boolean f() {
        return this.j;
    }
}

