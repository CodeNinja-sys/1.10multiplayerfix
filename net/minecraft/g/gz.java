/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.a.w;
import net.minecraft.f.ap;
import net.minecraft.g.a;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.dr;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ac;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.bv;
import net.minecraft.v.d;
import net.minecraft.w.f.ae;

public class gz
extends a {
    public static final c a = c.b("has_record");

    public static void a(net.minecraft.u.a.a a2) {
        a2.a(net.minecraft.u.a.c.d, (net.minecraft.u.a.e)new net.minecraft.u.a.b.d("RecordPlayer", new String[]{"RecordItem"}));
    }

    protected gz() {
        super(h.d, e.l);
        this.z(this.O.b().a(a, Boolean.valueOf(false)));
        this.a(d.c);
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        if (((Boolean)b3.a(a)).booleanValue()) {
            this.e(k2, b2, b3);
            b3 = b3.a(a, Boolean.valueOf(false));
            k2.a(b2, b3, 2);
            return true;
        }
        return false;
    }

    public void a(k k2, net.minecraft.u.b.b b2, b b3, cu cu2) {
        ap ap2;
        if (!k2.C && (ap2 = k2.q(b2)) instanceof dr) {
            ((dr)ap2).a(cu2.j());
            k2.a(b2, b3.a(a, Boolean.valueOf(true)), 2);
        }
    }

    private void e(k k2, net.minecraft.u.b.b b2, b b3) {
        dr dr2;
        cu cu2;
        ap ap2;
        if (!k2.C && (ap2 = k2.q(b2)) instanceof dr && (cu2 = (dr2 = (dr)ap2).g()) != null) {
            k2.b(1010, b2, 0);
            k2.a(b2, (bv)null);
            dr2.a((cu)null);
            float f2 = 0.7f;
            double d2 = (double)(k2.p.nextFloat() * 0.7f) + (double)0.15f;
            double d3 = (double)(k2.p.nextFloat() * 0.7f) + 0.06000000238418579 + 0.6;
            double d4 = (double)(k2.p.nextFloat() * 0.7f) + (double)0.15f;
            cu cu3 = cu2.j();
            ae ae2 = new ae(k2, (double)b2.cy_() + d2, (double)b2.k() + d3, (double)b2.l() + d4, cu3);
            ae2.l();
            k2.a(ae2);
        }
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3) {
        this.e(k2, b2, b3);
        super.a(k2, b2, b3);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, float f2, int n2) {
        if (!k2.C) {
            super.a(k2, b2, b3, f2, 0);
        }
    }

    @Override
    public ap a(k k2, int n2) {
        return new dr();
    }

    @Override
    public boolean c(b b2) {
        return true;
    }

    @Override
    public int b(b b2, k k2, net.minecraft.u.b.b b3) {
        cu cu2;
        ap ap2 = k2.q(b3);
        if (ap2 instanceof dr && (cu2 = ((dr)ap2).g()) != null) {
            return cg.a(cu2.a()) + 1 - cg.a(net.minecraft.a.w.cA);
        }
        return 0;
    }

    @Override
    public ac a(b b2) {
        return ac.d;
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, Boolean.valueOf(n2 > 0));
    }

    @Override
    public int b(b b2) {
        return (Boolean)b2.a(a) != false ? 1 : 0;
    }

    @Override
    protected i a() {
        return new i(this, a);
    }
}

