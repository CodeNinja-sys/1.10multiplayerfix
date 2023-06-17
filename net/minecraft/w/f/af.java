/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import net.minecraft.e.e;
import net.minecraft.q.k;
import net.minecraft.u.aj;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.x.a.g;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;

public class af
extends n {
    private static final g a = o.a(af.class, q.b);
    private l b;
    private int c = 80;

    public af(k k2) {
        super(k2);
        this.aN = true;
        this.d(0.98f, 0.98f);
    }

    public af(k k2, double d2, double d3, double d4, l l2) {
        this(k2);
        this.e(d2, d3, d4);
        float f2 = (float)(Math.random() * (Math.PI * 2));
        this.aX = -((float)Math.sin(f2)) * 0.02f;
        this.aY = 0.2f;
        this.aZ = -((float)Math.cos(f2)) * 0.02f;
        this.b(80);
        this.aR = d2;
        this.aS = d3;
        this.aT = d4;
        this.b = l2;
    }

    @Override
    protected void cb_() {
        this.bE.a(a, 80);
    }

    @Override
    protected boolean au() {
        return false;
    }

    @Override
    public boolean cg_() {
        return !this.bk;
    }

    @Override
    public void cE_() {
        this.aR = this.aU;
        this.aS = this.aV;
        this.aT = this.aW;
        if (!this.ci()) {
            this.aY -= (double)0.04f;
        }
        this.b(this.aX, this.aY, this.aZ);
        this.aX *= (double)0.98f;
        this.aY *= (double)0.98f;
        this.aZ *= (double)0.98f;
        if (this.be) {
            this.aX *= (double)0.7f;
            this.aZ *= (double)0.7f;
            this.aY *= -0.5;
        }
        --this.c;
        if (this.c <= 0) {
            this.aa();
            if (!this.aQ.C) {
                this.g();
            }
        } else {
            this.cn();
            this.aQ.a(aj.l, this.aU, this.aV + 0.5, this.aW, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    private void g() {
        float f2 = 4.0f;
        this.aQ.a(this, this.aU, this.aV + (double)(this.bm / 16.0f), this.aW, 4.0f, true);
    }

    @Override
    protected void a(e e2) {
        e2.a("Fuse", (short)this.f());
    }

    @Override
    protected void b(e e2) {
        this.b(e2.g("Fuse"));
    }

    public l a() {
        return this.b;
    }

    @Override
    public float ce_() {
        return 0.0f;
    }

    public void b(int n2) {
        this.bE.b(a, n2);
        this.c = n2;
    }

    @Override
    public void a(g g2) {
        if (a.equals(g2)) {
            this.c = this.c();
        }
    }

    public int c() {
        return (Integer)this.bE.a(a);
    }

    public int f() {
        return this.c;
    }
}

