/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.a.f;
import net.minecraft.d.j;
import net.minecraft.m.av;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.r.o;
import net.minecraft.u.a;
import net.minecraft.u.ab;
import net.minecraft.u.ah;
import net.minecraft.u.bu;
import net.minecraft.v.d;
import net.minecraft.w.a.b;
import net.minecraft.w.l;

public class cb
extends cg {
    public final int a;
    private final int b;
    private final float c;
    private final boolean d;
    private boolean l;
    private j m;
    private float n;

    public cb(int n2, float f2, boolean bl2) {
        this.a = 32;
        this.b = n2;
        this.d = bl2;
        this.c = f2;
        this.a(net.minecraft.v.d.h);
    }

    public cb(int n2, boolean bl2) {
        this(n2, 0.6f, bl2);
    }

    @Override
    public cu a(cu cu2, k k2, l l2) {
        --cu2.b;
        if (l2 instanceof b) {
            b b2 = (b)l2;
            b2.ap().a(this, cu2);
            k2.a(null, b2.aU, b2.aV, b2.aW, net.minecraft.a.f.ek, bu.h, 0.5f, k2.p.nextFloat() * 0.1f + 0.9f);
            this.a(cu2, k2, b2);
            b2.a(o.b(this));
        }
        return cu2;
    }

    protected void a(cu cu2, k k2, b b2) {
        if (!k2.C && this.m != null && k2.p.nextFloat() < this.n) {
            b2.c(new j(this.m));
        }
    }

    @Override
    public int c(cu cu2) {
        return 32;
    }

    @Override
    public av b(cu cu2) {
        return av.b;
    }

    @Override
    public a a(cu cu2, k k2, b b2, ah ah2) {
        if (b2.c(this.l)) {
            b2.b(ah2);
            return new a(ab.a, cu2);
        }
        return new a(ab.c, cu2);
    }

    public int h(cu cu2) {
        return this.b;
    }

    public float i(cu cu2) {
        return this.c;
    }

    public boolean e() {
        return this.d;
    }

    public cb a(j j2, float f2) {
        this.m = j2;
        this.n = f2;
        return this;
    }

    public cb g() {
        this.l = true;
        return this;
    }
}

