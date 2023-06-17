/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.e.a;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.q.f.a.d;
import net.minecraft.q.k;
import net.minecraft.u.aj;
import net.minecraft.u.b.b;
import net.minecraft.u.bw;
import net.minecraft.u.cd;
import net.minecraft.u.cf;
import net.minecraft.w.f;
import net.minecraft.w.n;

public abstract class af {
    private int a = 20;
    private final List b = ov.a();
    private cf c = new cf();
    private double d;
    private double e;
    private int f = 200;
    private int g = 800;
    private int h = 4;
    private n i;
    private int j = 6;
    private int k = 16;
    private int l = 4;

    private String g() {
        return this.c.b().l("id");
    }

    public void a(String string) {
        this.c.b().a("id", string);
    }

    private boolean h() {
        b b2 = this.b();
        return this.a().a((double)b2.cy_() + 0.5, (double)b2.k() + 0.5, (double)b2.l() + 0.5, (double)this.k);
    }

    public void c() {
        if (!this.h()) {
            this.e = this.d;
        } else {
            b b2 = this.b();
            if (this.a().C) {
                double d2 = (float)b2.cy_() + this.a().p.nextFloat();
                double d3 = (float)b2.k() + this.a().p.nextFloat();
                double d4 = (float)b2.l() + this.a().p.nextFloat();
                this.a().a(aj.l, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
                this.a().a(aj.A, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
                if (this.a > 0) {
                    --this.a;
                }
                this.e = this.d;
                this.d = (this.d + (double)(1000.0f / ((float)this.a + 200.0f))) % 360.0;
            } else {
                if (this.a == -1) {
                    this.i();
                }
                if (this.a > 0) {
                    --this.a;
                    return;
                }
                boolean bl2 = false;
                for (int i2 = 0; i2 < this.h; ++i2) {
                    double d5;
                    double d6;
                    int n2;
                    double d7;
                    e e2 = this.c.b();
                    q q2 = e2.c("Pos", 6);
                    k k2 = this.a();
                    n n3 = net.minecraft.q.f.a.d.a(e2, k2, d7 = (n2 = q2.e()) >= 1 ? q2.e(0) : (double)b2.cy_() + (k2.p.nextDouble() - k2.p.nextDouble()) * (double)this.l + 0.5, d6 = n2 >= 2 ? q2.e(1) : (double)(b2.k() + k2.p.nextInt(3) - 1), d5 = n2 >= 3 ? q2.e(2) : (double)b2.l() + (k2.p.nextDouble() - k2.p.nextDouble()) * (double)this.l + 0.5, false);
                    if (n3 == null) {
                        return;
                    }
                    int n4 = k2.a(n3.getClass(), new net.minecraft.u.b.a(b2.cy_(), b2.k(), b2.l(), b2.cy_() + 1, b2.k() + 1, b2.l() + 1).b(this.l)).size();
                    if (n4 >= this.j) {
                        this.i();
                        return;
                    }
                    f f2 = n3 instanceof f ? (f)n3 : null;
                    n3.b(n3.aU, n3.aV, n3.aW, k2.p.nextFloat() * 360.0f, 0.0f);
                    if (f2 != null && (!f2.aq() || !f2.ar())) continue;
                    if (this.c.b().f() == 1 && this.c.b().b("id", 8) && n3 instanceof f) {
                        ((f)n3).a(k2.C(new b(n3)), null);
                    }
                    net.minecraft.q.f.a.d.a(n3, k2);
                    k2.b(2004, b2, 0);
                    if (f2 != null) {
                        f2.ag();
                    }
                    bl2 = true;
                }
                if (bl2) {
                    this.i();
                }
            }
        }
    }

    private void i() {
        if (this.g <= this.f) {
            this.a = this.f;
        } else {
            int n2 = this.g - this.f;
            this.a = this.f + this.a().p.nextInt(n2);
        }
        if (!this.b.isEmpty()) {
            this.a((cf)cd.a(this.a().p, this.b));
        }
        this.a(1);
    }

    public void a(e e2) {
        a a2;
        this.a = e2.g("Delay");
        this.b.clear();
        if (e2.b("SpawnPotentials", 9)) {
            a2 = e2.c("SpawnPotentials", 10);
            for (int i2 = 0; i2 < ((q)a2).e(); ++i2) {
                this.b.add(new cf(((q)a2).b(i2)));
            }
        }
        if (!((e)(a2 = e2.o("SpawnData"))).b("id", 8)) {
            ((e)a2).a("id", "Pig");
        }
        this.a(new cf(1, (e)a2));
        if (e2.b("MinSpawnDelay", 99)) {
            this.f = e2.g("MinSpawnDelay");
            this.g = e2.g("MaxSpawnDelay");
            this.h = e2.g("SpawnCount");
        }
        if (e2.b("MaxNearbyEntities", 99)) {
            this.j = e2.g("MaxNearbyEntities");
            this.k = e2.g("RequiredPlayerRange");
        }
        if (e2.b("SpawnRange", 99)) {
            this.l = e2.g("SpawnRange");
        }
        if (this.a() != null) {
            this.i = null;
        }
    }

    public e b(e e2) {
        String string = this.g();
        if (bw.b(string)) {
            return e2;
        }
        e2.a("Delay", (short)this.a);
        e2.a("MinSpawnDelay", (short)this.f);
        e2.a("MaxSpawnDelay", (short)this.g);
        e2.a("SpawnCount", (short)this.h);
        e2.a("MaxNearbyEntities", (short)this.j);
        e2.a("RequiredPlayerRange", (short)this.k);
        e2.a("SpawnRange", (short)this.l);
        e2.a("SpawnData", this.c.b().g());
        q q2 = new q();
        if (this.b.isEmpty()) {
            q2.a(this.c.a());
        } else {
            for (cf cf2 : this.b) {
                q2.a(cf2.a());
            }
        }
        e2.a("SpawnPotentials", q2);
        return e2;
    }

    public n d() {
        if (this.i == null) {
            this.i = net.minecraft.q.f.a.d.a(this.c.b(), this.a(), false);
            if (this.c.b().f() == 1 && this.c.b().b("id", 8) && this.i instanceof f) {
                ((f)this.i).a(this.a().C(new b(this.i)), null);
            }
        }
        return this.i;
    }

    public boolean b(int n2) {
        if (n2 == 1 && this.a().C) {
            this.a = this.f;
            return true;
        }
        return false;
    }

    public void a(cf cf2) {
        this.c = cf2;
    }

    public abstract void a(int var1);

    public abstract k a();

    public abstract b b();

    public double e() {
        return this.d;
    }

    public double f() {
        return this.e;
    }
}

