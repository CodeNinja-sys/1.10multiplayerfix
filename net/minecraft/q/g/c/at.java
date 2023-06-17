/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import a.a.a.a.b.as;
import a.a.a.a.b.bl;
import java.util.List;
import java.util.Random;
import net.minecraft.e.a;
import net.minecraft.k.i;
import net.minecraft.q.f.e;
import net.minecraft.q.g.c.cj;
import net.minecraft.q.g.c.cr;
import net.minecraft.q.g.c.ct;
import net.minecraft.q.g.c.da;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.j;
import net.minecraft.q.g.c.l;
import net.minecraft.q.g.c.r;
import net.minecraft.q.g.u;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.u.b.m;
import net.minecraft.u.b.t;
import net.minecraft.u.bo;

public abstract class at
extends u {
    private cr a;
    protected as c = new bl(1024);

    public abstract String a();

    @Override
    protected final synchronized void a(k k2, int n2, int n3, int n4, int n5, e e2) {
        this.a(k2);
        if (!this.c.b(m.a(n2, n3))) {
            this.f.nextInt();
            try {
                if (this.a(n2, n3)) {
                    j j2 = this.b(n2, n3);
                    this.c.a(m.a(n2, n3), j2);
                    if (j2.d()) {
                        this.a(n2, n3, j2);
                    }
                }
            }
            catch (Throwable throwable) {
                net.minecraft.k.a a2 = net.minecraft.k.a.a(throwable, "Exception preparing structure feature");
                i i2 = a2.a("Feature being prepared");
                i2.a("Is feature chunk", new l(this, n2, n3));
                i2.a("Chunk location", String.format("%d,%d", n2, n3));
                i2.a("Chunk pos hash", new ct(this, n2, n3));
                i2.a("Structure type", new cj(this));
                throw new bo(a2);
            }
        }
    }

    public synchronized boolean a(k k2, Random random, m m2) {
        this.a(k2);
        int n2 = (m2.a << 4) + 8;
        int n3 = (m2.b << 4) + 8;
        boolean bl2 = false;
        for (j j2 : this.c.c()) {
            if (!j2.d() || !j2.a(m2) || !j2.a().a(n2, n3, n2 + 15, n3 + 15)) continue;
            j2.a(k2, random, new dc(n2, n3, n2 + 15, n3 + 15));
            j2.b(m2);
            bl2 = true;
            this.a(j2.e(), j2.f(), j2);
        }
        return bl2;
    }

    public boolean b(b b2) {
        this.a(this.g);
        return this.c(b2) != null;
    }

    protected j c(b b2) {
        for (j j2 : this.c.c()) {
            if (!j2.d() || !j2.a().a(b2)) continue;
            for (r r2 : j2.b()) {
                if (!r2.f().a(b2)) continue;
                return j2;
            }
        }
        return null;
    }

    public boolean b(k k2, b b2) {
        this.a(k2);
        for (j j2 : this.c.c()) {
            if (!j2.d() || !j2.a().a(b2)) continue;
            return true;
        }
        return false;
    }

    public b a(k k2, b b2) {
        Object object;
        Object object2;
        double d2;
        Object object32;
        this.g = k2;
        this.a(k2);
        this.f.setSeed(k2.A());
        long l2 = this.f.nextLong();
        long l3 = this.f.nextLong();
        long l4 = (long)(b2.cy_() >> 4) * l2;
        long l5 = (long)(b2.l() >> 4) * l3;
        this.f.setSeed(l4 ^ l5 ^ k2.A());
        this.a(k2, b2.cy_() >> 4, b2.l() >> 4, 0, 0, null);
        double d3 = Double.MAX_VALUE;
        Object object4 = null;
        for (Object object32 : this.c.c()) {
            if (!((j)object32).d() || !((d2 = ((t)(object2 = ((r)(object = (r)((j)object32).b().get(0))).h())).i(b2)) < d3)) continue;
            d3 = d2;
            object4 = object2;
        }
        if (object4 != null) {
            return object4;
        }
        object32 = this.b();
        if (object32 != null) {
            Object object5 = null;
            object2 = object32.iterator();
            while (object2.hasNext()) {
                object = (b)object2.next();
                d2 = ((t)object).i(b2);
                if (!(d2 < d3)) continue;
                d3 = d2;
                object5 = object;
            }
            return object5;
        }
        return null;
    }

    protected List b() {
        return null;
    }

    protected void a(k k2) {
        if (this.a == null) {
            this.a = (cr)k2.a(cr.class, this.a());
            if (this.a == null) {
                this.a = new cr(this.a());
                k2.a(this.a(), this.a);
            } else {
                net.minecraft.e.e e2 = this.a.a();
                for (String string : e2.e()) {
                    net.minecraft.e.e e3;
                    a a2 = e2.c(string);
                    if (a2.a() != 10 || !(e3 = (net.minecraft.e.e)a2).e("ChunkX") || !e3.e("ChunkZ")) continue;
                    int n2 = e3.h("ChunkX");
                    int n3 = e3.h("ChunkZ");
                    j j2 = da.a(e3, k2);
                    if (j2 == null) continue;
                    this.c.a(m.a(n2, n3), j2);
                }
            }
        }
    }

    private void a(int n2, int n3, j j2) {
        this.a.a(j2.a(n2, n3), n2, n3);
        this.a.d();
    }

    protected abstract boolean a(int var1, int var2);

    protected abstract j b(int var1, int var2);
}

