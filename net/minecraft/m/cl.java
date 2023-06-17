/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.a.f;
import net.minecraft.m.at;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.r.o;
import net.minecraft.u.a;
import net.minecraft.u.ab;
import net.minecraft.u.ah;
import net.minecraft.u.bp;
import net.minecraft.u.bu;
import net.minecraft.v.d;
import net.minecraft.w.a.b;
import net.minecraft.w.l;

public class cl
extends cg {
    public cl() {
        this.e(64);
        this.d(1);
        this.a(d.i);
        this.a(new bp("cast"), new at(this));
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public a a(cu cu2, k k2, b b2, ah ah2) {
        if (b2.P != null) {
            int n2 = b2.P.a();
            cu2.a(n2, (l)b2);
            b2.a(ah2);
        } else {
            k2.a(null, b2.aU, b2.aV, b2.aW, net.minecraft.a.f.H, bu.g, 0.5f, 0.4f / (h.nextFloat() * 0.4f + 0.8f));
            if (!k2.C) {
                k2.a(new net.minecraft.w.c.a(k2, b2));
            }
            b2.a(ah2);
            b2.a(o.b(this));
        }
        return new a(ab.a, cu2);
    }

    @Override
    public boolean g(cu cu2) {
        return super.g(cu2);
    }

    @Override
    public int cx_() {
        return 1;
    }
}

