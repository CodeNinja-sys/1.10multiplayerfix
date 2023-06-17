/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import java.util.Random;
import net.minecraft.e.q;
import net.minecraft.h.a;
import net.minecraft.h.aq;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.q.a.a.g;
import net.minecraft.q.a.a.i;
import net.minecraft.q.a.a.r;
import net.minecraft.q.al;
import net.minecraft.q.an;
import net.minecraft.q.k;
import net.minecraft.u.a.b.e;
import net.minecraft.u.a.c;
import net.minecraft.u.ah;
import net.minecraft.u.bp;
import net.minecraft.w.a.b;
import net.minecraft.w.f.f;
import net.minecraft.w.n;

public abstract class v
extends f
implements g,
al {
    private cu[] a = new cu[36];
    private boolean b = true;
    private bp c;
    private long d;

    public v(k k2) {
        super(k2);
    }

    public v(k k2, double d2, double d3, double d4) {
        super(k2, d2, d3, d4);
    }

    @Override
    public void a(net.minecraft.u.n n2) {
        super.a(n2);
        if (this.aQ.G().b("doEntityDrops")) {
            net.minecraft.h.a.a(this.aQ, this, (y)this);
        }
    }

    @Override
    public cu a(int n2) {
        this.e((b)null);
        return this.a[n2];
    }

    @Override
    public cu a(int n2, int n3) {
        this.e((b)null);
        return net.minecraft.h.v.a(this.a, n2, n3);
    }

    @Override
    public cu b(int n2) {
        this.e((b)null);
        if (this.a[n2] != null) {
            cu cu2 = this.a[n2];
            this.a[n2] = null;
            return cu2;
        }
        return null;
    }

    @Override
    public void a(int n2, cu cu2) {
        this.e((b)null);
        this.a[n2] = cu2;
        if (cu2 != null && cu2.b > this.g()) {
            cu2.b = this.g();
        }
    }

    @Override
    public void C() {
    }

    @Override
    public boolean a_(b b2) {
        return this.bk ? false : b2.n(this) <= 64.0;
    }

    @Override
    public void b(b b2) {
    }

    @Override
    public void c(b b2) {
    }

    @Override
    public boolean b(int n2, cu cu2) {
        return true;
    }

    @Override
    public int g() {
        return 64;
    }

    @Override
    public n h_(int n2) {
        this.b = false;
        return super.h_(n2);
    }

    @Override
    public void aa() {
        if (this.b) {
            net.minecraft.h.a.a(this.aQ, this, (y)this);
        }
        super.aa();
    }

    @Override
    public void j(boolean bl2) {
        this.b = bl2;
    }

    public static void b(net.minecraft.u.a.a a2, String string) {
        f.a(a2, string);
        a2.a(net.minecraft.u.a.c.e, (net.minecraft.u.a.e)new e(string, new String[]{"Items"}));
    }

    @Override
    protected void a(net.minecraft.e.e e2) {
        super.a(e2);
        if (this.c != null) {
            e2.a("LootTable", this.c.toString());
            if (this.d != 0L) {
                e2.a("LootTableSeed", this.d);
            }
        } else {
            q q2 = new q();
            for (int i2 = 0; i2 < this.a.length; ++i2) {
                if (this.a[i2] == null) continue;
                net.minecraft.e.e e3 = new net.minecraft.e.e();
                e3.a("Slot", (byte)i2);
                this.a[i2].b(e3);
                q2.a(e3);
            }
            e2.a("Items", q2);
        }
    }

    @Override
    protected void b(net.minecraft.e.e e2) {
        super.b(e2);
        this.a = new cu[this.e()];
        if (e2.b("LootTable", 8)) {
            this.c = new bp(e2.l("LootTable"));
            this.d = e2.i("LootTableSeed");
        } else {
            q q2 = e2.c("Items", 10);
            for (int i2 = 0; i2 < q2.e(); ++i2) {
                net.minecraft.e.e e3 = q2.b(i2);
                int n2 = e3.f("Slot") & 0xFF;
                if (n2 < 0 || n2 >= this.a.length) continue;
                this.a[n2] = cu.a(e3);
            }
        }
    }

    @Override
    public boolean a(b b2, cu cu2, ah ah2) {
        if (!this.aQ.C) {
            b2.a(this);
        }
        return true;
    }

    @Override
    protected void s() {
        float f2 = 0.98f;
        if (this.c == null) {
            int n2 = 15 - aq.b(this);
            f2 += (float)n2 * 0.001f;
        }
        this.aX *= (double)f2;
        this.aY *= 0.0;
        this.aZ *= (double)f2;
    }

    @Override
    public int c(int n2) {
        return 0;
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public int i() {
        return 0;
    }

    @Override
    public boolean q() {
        return false;
    }

    @Override
    public void a(an an2) {
    }

    @Override
    public an r() {
        return an.a;
    }

    public void e(b b2) {
        if (this.c != null) {
            i i2 = this.aQ.W().a(this.c);
            this.c = null;
            Random random = this.d == 0L ? new Random() : new Random(this.d);
            r r2 = new r((net.minecraft.q.v)this.aQ);
            if (b2 != null) {
                r2.a(b2.aM());
            }
            i2.a(this, random, r2.a());
        }
    }

    @Override
    public void j() {
        this.e((b)null);
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = null;
        }
    }

    public void a(bp bp2, long l2) {
        this.c = bp2;
        this.d = l2;
    }

    @Override
    public bp b() {
        return this.c;
    }
}

