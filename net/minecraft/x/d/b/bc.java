/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.q.f.k;
import net.minecraft.u.b.m;
import net.minecraft.x.d.a;
import net.minecraft.x.d.b.at;
import net.minecraft.x.p;

public class bc
implements p {
    private m a;
    private at[] b;

    public bc() {
    }

    public bc(int n2, short[] arrs, k k2) {
        this.a = new m(k2.b, k2.c);
        this.b = new at[n2];
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            this.b[i2] = new at(this, arrs[i2], k2);
        }
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = new m(a2.K(), a2.K());
        this.b = new at[a2.e()];
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            this.b[i2] = new at(this, a2.G(), (b)cn.w.a(a2.e()));
        }
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.E(this.a.a);
        a2.E(this.a.b);
        a2.d(this.b.length);
        at[] arrat = this.b;
        int n2 = this.b.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            at at2 = arrat[i2];
            a2.C(at2.b());
            a2.d(cn.w.a(at2.c()));
        }
    }

    public void a(a a2) {
        a2.a(this);
    }

    public at[] a() {
        return this.b;
    }

    static /* synthetic */ m a(bc bc2) {
        return bc2.a;
    }
}

