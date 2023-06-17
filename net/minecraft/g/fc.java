/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.f.ap;
import net.minecraft.g.a;
import net.minecraft.g.a.h;
import net.minecraft.g.b.g;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.fk;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.au;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ac;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.v.d;

public class fc
extends a {
    public static final g a = g.a("power", 0, 15);
    protected static final net.minecraft.u.b.a b = new net.minecraft.u.b.a(0.0, 0.0, 0.0, 1.0, 0.375, 1.0);
    private final boolean c;

    public fc(boolean bl2) {
        super(h.d);
        this.c = bl2;
        this.z(this.O.b().a(a, Integer.valueOf(0)));
        this.a(d.d);
        this.c(0.2f);
        this.a(fk.a);
        this.b("daylightDetector");
    }

    @Override
    public net.minecraft.u.b.a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return b;
    }

    @Override
    public int b(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return (Integer)b2.a(a);
    }

    public void c(k k2, net.minecraft.u.b.b b2) {
        if (!k2.q.n()) {
            b b3 = k2.n(b2);
            int n2 = k2.b(au.a, b2) - k2.S();
            float f2 = k2.d(1.0f);
            if (this.c) {
                n2 = 15 - n2;
            }
            if (n2 > 0 && !this.c) {
                float f3 = f2 < (float)Math.PI ? 0.0f : (float)Math.PI * 2;
                f2 += (f3 - f2) * 0.2f;
                n2 = Math.round((float)n2 * net.minecraft.u.b.n.b(f2));
            }
            n2 = net.minecraft.u.b.n.a(n2, 0, 15);
            if ((Integer)b3.a(a) != n2) {
                k2.a(b2, b3.a(a, Integer.valueOf(n2)), 3);
            }
        }
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        if (b4.ar()) {
            if (k2.C) {
                return true;
            }
            if (this.c) {
                k2.a(b2, p.cl.v().a(a, (Integer)b3.a(a)), 4);
                p.cl.c(k2, b2);
            } else {
                k2.a(b2, p.cm.v().a(a, (Integer)b3.a(a)), 4);
                p.cm.c(k2, b2);
            }
            return true;
        }
        return super.a(k2, b2, b3, b4, ah2, cu2, ad2, f2, f3, f4);
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return cg.a(p.cl);
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(p.cl);
    }

    @Override
    public boolean e(b b2) {
        return false;
    }

    @Override
    public boolean d(b b2) {
        return false;
    }

    @Override
    public ac a(b b2) {
        return ac.d;
    }

    @Override
    public boolean f(b b2) {
        return true;
    }

    @Override
    public ap a(k k2, int n2) {
        return new net.minecraft.f.ah();
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, Integer.valueOf(n2));
    }

    @Override
    public int b(b b2) {
        return (Integer)b2.a(a);
    }

    @Override
    protected i a() {
        return new i(this, a);
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        if (!this.c) {
            super.a(cg2, d2, list);
        }
    }
}

