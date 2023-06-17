/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.a.f;
import net.minecraft.f.ap;
import net.minecraft.f.e;
import net.minecraft.g.a;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.r.o;
import net.minecraft.u.ac;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.aj;
import net.minecraft.u.bu;
import net.minecraft.u.bv;
import net.minecraft.v.d;

public class cz
extends a {
    private static final List a = ov.a(f.dP, f.dN, f.dS, f.dQ, f.dO);

    public cz() {
        super(h.d);
        this.a(d.d);
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        boolean bl2 = k2.x(b3);
        ap ap2 = k2.q(b3);
        if (ap2 instanceof e) {
            e e2 = (e)ap2;
            if (e2.b != bl2) {
                if (bl2) {
                    e2.a(k2, b3);
                }
                e2.b = bl2;
            }
        }
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        if (k2.C) {
            return true;
        }
        ap ap2 = k2.q(b2);
        if (ap2 instanceof e) {
            e e2 = (e)ap2;
            e2.a();
            e2.a(k2, b2);
            b4.a(o.U);
        }
        return true;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, net.minecraft.w.a.b b3) {
        ap ap2;
        if (!k2.C && (ap2 = k2.q(b2)) instanceof e) {
            ((e)ap2).a(k2, b2);
            b3.a(o.T);
        }
    }

    @Override
    public ap a(k k2, int n2) {
        return new e();
    }

    private bv b(int n2) {
        if (n2 < 0 || n2 >= a.size()) {
            n2 = 0;
        }
        return (bv)a.get(n2);
    }

    @Override
    public boolean a(b b2, k k2, net.minecraft.u.b.b b3, int n2, int n3) {
        float f2 = (float)Math.pow(2.0, (double)(n3 - 12) / 12.0);
        k2.a(null, b3, this.b(n2), bu.c, 3.0f, f2);
        k2.a(aj.x, (double)b3.cy_() + 0.5, (double)b3.k() + 1.2, (double)b3.l() + 0.5, (double)n3 / 24.0, 0.0, 0.0, new int[0]);
        return true;
    }

    @Override
    public ac a(b b2) {
        return ac.d;
    }
}

