/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.client.k.av;
import net.minecraft.client.k.c;
import net.minecraft.client.k.l;
import net.minecraft.u.bp;

class r
extends av {
    public int a;
    final /* synthetic */ c b;

    public r(c c2) {
        this.b = c2;
        super(c2.n, c2.p, c2.q, 80, c2.q - 32, 38);
        this.a = -1;
    }

    @Override
    protected int a() {
        return net.minecraft.client.k.c.f().size();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
        this.a = n2;
        this.b.e();
        net.minecraft.client.k.c.a(this.b).a(((l)net.minecraft.client.k.c.f().get((int)net.minecraft.client.k.c.b((c)this.b).a)).c.toString());
    }

    @Override
    protected boolean a(int n2) {
        return n2 == this.a;
    }

    @Override
    protected void d() {
    }

    private void a(int n2, int n3, bp bp2) {
        int n4 = n2 + 5;
        this.b.a(n4 - 1, n4 + 32, n3 - 1, -2039584);
        this.b.a(n4 - 1, n4 + 32, n3 + 32, -6250336);
        this.b.b(n4 - 1, n3 - 1, n3 + 32, -2039584);
        this.b.b(n4 + 32, n3 - 1, n3 + 32, -6250336);
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.c.N().a(bp2);
        int n5 = 32;
        int n6 = 32;
        ci ci2 = ci.a();
        g g2 = ci2.c();
        g2.a(7, net.minecraft.client.g.d.b.g);
        g2.b((double)(n4 + 0), (double)(n3 + 32), 0.0).a(0.0, 1.0).d();
        g2.b((double)(n4 + 32), (double)(n3 + 32), 0.0).a(1.0, 1.0).d();
        g2.b((double)(n4 + 32), (double)(n3 + 0), 0.0).a(1.0, 0.0).d();
        g2.b((double)(n4 + 0), (double)(n3 + 0), 0.0).a(0.0, 0.0).d();
        ci2.b();
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        l l2 = (l)net.minecraft.client.k.c.f().get(n2);
        this.a(n3, n4, l2.b);
        this.b.u.a(l2.a, n3 + 32 + 10, n4 + 14, 0xFFFFFF);
    }
}

