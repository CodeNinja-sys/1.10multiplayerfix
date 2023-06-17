/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.q.g.a.a;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.u.b.g;
import net.minecraft.u.b.n;
import net.minecraft.u.b.t;
import net.minecraft.w.f.ad;

public class p
extends aj {
    private boolean a;
    private a b;
    private b c;

    public void a(a a2) {
        this.b = a2;
    }

    public void a(boolean bl2) {
        this.a = bl2;
    }

    @Override
    public boolean a(k k2, Random random, b b2) {
        Object object2;
        if (this.b == null) {
            throw new IllegalStateException("Decoration requires priming with a spike");
        }
        int n2 = this.b.c();
        for (Object object2 : net.minecraft.u.b.b.b(new b(b2.cy_() - n2, 0, b2.l() - n2), new b(b2.cy_() + n2, this.b.d() + 10, b2.l() + n2))) {
            if (((t)object2).e((double)b2.cy_(), (double)((g)object2).k(), (double)b2.l()) <= (double)(n2 * n2 + 1) && ((g)object2).k() < this.b.d()) {
                this.a(k2, (b)object2, net.minecraft.a.p.Z.v());
                continue;
            }
            if (((g)object2).k() <= 65) continue;
            this.a(k2, (b)object2, net.minecraft.a.p.a.v());
        }
        if (this.b.e()) {
            for (int i2 = -2; i2 <= 2; ++i2) {
                for (int i3 = -2; i3 <= 2; ++i3) {
                    if (n.a(i2) == 2 || n.a(i3) == 2) {
                        this.a(k2, new b(b2.cy_() + i2, this.b.d(), b2.l() + i3), net.minecraft.a.p.bi.v());
                        this.a(k2, new b(b2.cy_() + i2, this.b.d() + 1, b2.l() + i3), net.minecraft.a.p.bi.v());
                        this.a(k2, new b(b2.cy_() + i2, this.b.d() + 2, b2.l() + i3), net.minecraft.a.p.bi.v());
                    }
                    this.a(k2, new b(b2.cy_() + i2, this.b.d() + 3, b2.l() + i3), net.minecraft.a.p.bi.v());
                }
            }
        }
        object2 = new ad(k2);
        ((ad)object2).a(this.c);
        ((net.minecraft.w.n)object2).p(this.a);
        ((net.minecraft.w.n)object2).b((float)b2.cy_() + 0.5f, this.b.d() + 1, (float)b2.l() + 0.5f, random.nextFloat() * 360.0f, 0.0f);
        k2.a((net.minecraft.w.n)object2);
        this.a(k2, new b(b2.cy_(), this.b.d(), b2.l()), net.minecraft.a.p.h.v());
        return true;
    }

    public void a(b b2) {
        this.c = b2;
    }
}

