/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.f.ab;
import net.minecraft.f.ap;
import net.minecraft.f.r;
import net.minecraft.g.a;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ac;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.w.l;

public class fy
extends a {
    public static final net.minecraft.g.b.e a = net.minecraft.g.b.e.a("mode", r.class);

    public fy() {
        super(h.f, e.x);
        this.z(this.O.b());
    }

    @Override
    public ap a(k k2, int n2) {
        return new ab();
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        ap ap2 = k2.q(b2);
        return ap2 instanceof ab ? ((ab)ap2).a(b4) : false;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, l l2, cu cu2) {
        ap ap2;
        if (!k2.C && (ap2 = k2.q(b2)) instanceof ab) {
            ab ab2 = (ab)ap2;
            ab2.a(l2);
        }
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return super.c(k2, b2, b3);
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public ac a(b b2) {
        return ac.d;
    }

    @Override
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        return this.v().a(a, (Comparable)((Object)r.d));
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)r.a(n2)));
    }

    @Override
    public int b(b b2) {
        return ((r)((Object)b2.a(a))).b();
    }

    @Override
    protected i a() {
        return new i(this, a);
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        ap ap2;
        if (!k2.C && (ap2 = k2.q(b3)) instanceof ab) {
            ab ab2 = (ab)ap2;
            boolean bl2 = k2.x(b3);
            boolean bl3 = ab2.x();
            if (bl2 && !bl3) {
                ab2.d(true);
                this.a(ab2);
            } else if (!bl2 && bl3) {
                ab2.d(false);
            }
        }
    }

    private void a(ab ab2) {
        switch (ab2.n()) {
            case a: {
                ab2.b(false);
                break;
            }
            case b: {
                ab2.c(false);
                break;
            }
            case c: {
                ab2.v();
            }
        }
    }
}

