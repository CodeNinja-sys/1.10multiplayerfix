/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.minecraft.a.o;
import net.minecraft.d.j;
import net.minecraft.d.m;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.g.a.b;
import net.minecraft.q.k;
import net.minecraft.q.v;
import net.minecraft.u.aj;
import net.minecraft.u.bp;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.x.a.g;

public class a
extends n {
    private static final g a = net.minecraft.x.a.o.a(a.class, net.minecraft.x.a.q.c);
    private static final g b = net.minecraft.x.a.o.a(a.class, net.minecraft.x.a.q.b);
    private static final g c = net.minecraft.x.a.o.a(a.class, net.minecraft.x.a.q.h);
    private static final g d = net.minecraft.x.a.o.a(a.class, net.minecraft.x.a.q.b);
    private static final g e = net.minecraft.x.a.o.a(a.class, net.minecraft.x.a.q.b);
    private static final g f = net.minecraft.x.a.o.a(a.class, net.minecraft.x.a.q.b);
    private net.minecraft.d.b g = net.minecraft.a.o.a;
    private final List h = ov.a();
    private final Map i = sz.c();
    private int j = 600;
    private int k = 20;
    private int l = 20;
    private boolean m;
    private int n;
    private float o;
    private float p;
    private l q;
    private UUID r;

    public a(k k2) {
        super(k2);
        this.bv = true;
        this.bD = true;
        this.a(3.0f);
    }

    public a(k k2, double d2, double d3, double d4) {
        this(k2);
        this.e(d2, d3, d4);
    }

    @Override
    protected void cb_() {
        this.cc().a(b, 0);
        this.cc().a(a, Float.valueOf(0.5f));
        this.cc().a(c, false);
        this.cc().a(d, aj.p.c());
        this.cc().a(e, 0);
        this.cc().a(f, 0);
    }

    public void a(float f2) {
        double d2 = this.aU;
        double d3 = this.aV;
        double d4 = this.aW;
        this.d(f2 * 2.0f, 0.5f);
        this.e(d2, d3, d4);
        if (!this.aQ.C) {
            this.cc().b(a, Float.valueOf(f2));
        }
    }

    public float a() {
        return ((Float)this.cc().a(a)).floatValue();
    }

    public void a(net.minecraft.d.b b2) {
        this.g = b2;
        if (!this.m) {
            if (b2 == net.minecraft.a.o.a && this.h.isEmpty()) {
                this.cc().b(b, 0);
            } else {
                this.cc().b(b, net.minecraft.d.m.a(net.minecraft.d.m.a(b2, (Collection)this.h)));
            }
        }
    }

    public void a(j j2) {
        this.h.add(j2);
        if (!this.m) {
            this.cc().b(b, net.minecraft.d.m.a(net.minecraft.d.m.a(this.g, (Collection)this.h)));
        }
    }

    public int c() {
        return (Integer)this.cc().a(b);
    }

    public void a(int n2) {
        this.m = true;
        this.cc().b(b, n2);
    }

    public aj d() {
        return aj.a((Integer)this.cc().a(d));
    }

    public void a(aj aj2) {
        this.cc().b(d, aj2.c());
    }

    public int e() {
        return (Integer)this.cc().a(e);
    }

    public void b(int n2) {
        this.cc().b(e, n2);
    }

    public int f() {
        return (Integer)this.cc().a(f);
    }

    public void c(int n2) {
        this.cc().b(f, n2);
    }

    protected void a(boolean bl2) {
        this.cc().b(c, bl2);
    }

    public boolean g() {
        return (Boolean)this.cc().a(c);
    }

    public int i() {
        return this.j;
    }

    public void d(int n2) {
        this.j = n2;
    }

    @Override
    public void cE_() {
        block25: {
            boolean bl2;
            float f2;
            boolean bl3;
            block23: {
                int[] arrn;
                aj aj2;
                block24: {
                    super.cE_();
                    bl3 = this.g();
                    f2 = this.a();
                    if (!this.aQ.C) break block23;
                    aj2 = this.d();
                    arrn = new int[aj2.d()];
                    if (arrn.length > 0) {
                        arrn[0] = this.e();
                    }
                    if (arrn.length > 1) {
                        arrn[1] = this.f();
                    }
                    if (!bl3) break block24;
                    if (!this.bx.nextBoolean()) break block25;
                    for (int i2 = 0; i2 < 2; ++i2) {
                        float f3 = this.bx.nextFloat() * ((float)Math.PI * 2);
                        float f4 = net.minecraft.u.b.n.c(this.bx.nextFloat()) * 0.2f;
                        float f5 = net.minecraft.u.b.n.b(f3) * f4;
                        float f6 = net.minecraft.u.b.n.a(f3) * f4;
                        if (aj2 == aj.p) {
                            int n2 = this.bx.nextBoolean() ? 0xFFFFFF : this.c();
                            int n3 = n2 >> 16 & 0xFF;
                            int n4 = n2 >> 8 & 0xFF;
                            int n5 = n2 & 0xFF;
                            this.aQ.a(aj.p, this.aU + (double)f5, this.aV, this.aW + (double)f6, (double)((float)n3 / 255.0f), (double)((float)n4 / 255.0f), (double)((float)n5 / 255.0f), new int[0]);
                            continue;
                        }
                        this.aQ.a(aj2, this.aU + (double)f5, this.aV, this.aW + (double)f6, 0.0, 0.0, 0.0, arrn);
                    }
                    break block25;
                }
                float f7 = (float)Math.PI * f2 * f2;
                int n6 = 0;
                while ((float)n6 < f7) {
                    float f8 = this.bx.nextFloat() * ((float)Math.PI * 2);
                    float f9 = net.minecraft.u.b.n.c(this.bx.nextFloat()) * f2;
                    float f10 = net.minecraft.u.b.n.b(f8) * f9;
                    float f11 = net.minecraft.u.b.n.a(f8) * f9;
                    if (aj2 == aj.p) {
                        int n7 = this.c();
                        int n8 = n7 >> 16 & 0xFF;
                        int n9 = n7 >> 8 & 0xFF;
                        int n10 = n7 & 0xFF;
                        this.aQ.a(aj.p, this.aU + (double)f10, this.aV, this.aW + (double)f11, (double)((float)n8 / 255.0f), (double)((float)n9 / 255.0f), (double)((float)n10 / 255.0f), new int[0]);
                    } else {
                        this.aQ.a(aj2, this.aU + (double)f10, this.aV, this.aW + (double)f11, (0.5 - this.bx.nextDouble()) * 0.15, (double)0.01f, (0.5 - this.bx.nextDouble()) * 0.15, arrn);
                    }
                    ++n6;
                }
                break block25;
            }
            if (this.by >= this.k + this.j) {
                this.aa();
                return;
            }
            boolean bl4 = bl2 = this.by < this.k;
            if (bl3 != bl2) {
                this.a(bl2);
            }
            if (bl2) {
                return;
            }
            if (this.p != 0.0f) {
                if ((f2 += this.p) < 0.5f) {
                    this.aa();
                    return;
                }
                this.a(f2);
            }
            if (this.by % 5 == 0) {
                Map.Entry entry;
                Iterator iterator = this.i.entrySet().iterator();
                while (iterator.hasNext()) {
                    entry = iterator.next();
                    if (this.by < (Integer)entry.getValue()) continue;
                    iterator.remove();
                }
                entry = ov.a();
                for (Object object : this.g.a()) {
                    entry.add(new j(((j)object).a(), ((j)object).b() / 4, ((j)object).c(), ((j)object).d(), ((j)object).e()));
                }
                entry.addAll(this.h);
                if (entry.isEmpty()) {
                    this.i.clear();
                } else {
                    Object object;
                    object = this.aQ.a(l.class, this.cT());
                    if (!object.isEmpty()) {
                        Iterator iterator2 = object.iterator();
                        while (iterator2.hasNext()) {
                            double d2;
                            double d3;
                            double d4;
                            l l2 = (l)iterator2.next();
                            if (this.i.containsKey(l2) || !l2.bY() || !((d4 = (d3 = l2.aU - this.aU) * d3 + (d2 = l2.aW - this.aW) * d2) <= (double)(f2 * f2))) continue;
                            this.i.put(l2, this.by + this.l);
                            Iterator iterator3 = entry.iterator();
                            while (iterator3.hasNext()) {
                                j j2 = (j)iterator3.next();
                                if (j2.a().a()) {
                                    j2.a().a(this, this.j(), l2, j2.c(), 0.5);
                                    continue;
                                }
                                l2.c(new j(j2));
                            }
                            if (this.o != 0.0f) {
                                if ((f2 += this.o) < 0.5f) {
                                    this.aa();
                                    return;
                                }
                                this.a(f2);
                            }
                            if (this.n == 0) continue;
                            this.j += this.n;
                            if (this.j > 0) continue;
                            this.aa();
                            return;
                        }
                    }
                }
            }
        }
    }

    public void b(float f2) {
        this.o = f2;
    }

    public void c(float f2) {
        this.p = f2;
    }

    public void e(int n2) {
        this.k = n2;
    }

    public void a(l l2) {
        this.q = l2;
        this.r = l2 == null ? null : l2.cM();
    }

    public l j() {
        n n2;
        if (this.q == null && this.r != null && this.aQ instanceof v && (n2 = ((v)this.aQ).b(this.r)) instanceof l) {
            this.q = (l)n2;
        }
        return this.q;
    }

    @Override
    protected void b(e e2) {
        Object object;
        this.by = e2.h("Age");
        this.j = e2.h("Duration");
        this.k = e2.h("WaitTime");
        this.l = e2.h("ReapplicationDelay");
        this.n = e2.h("DurationOnUse");
        this.o = e2.j("RadiusOnUse");
        this.p = e2.j("RadiusPerTick");
        this.a(e2.j("Radius"));
        this.r = e2.a("OwnerUUID");
        if (e2.b("Particle", 8) && (object = aj.a(e2.l("Particle"))) != null) {
            this.a((aj)((Object)object));
            this.b(e2.h("ParticleParam1"));
            this.c(e2.h("ParticleParam2"));
        }
        if (e2.b("Color", 99)) {
            this.a(e2.h("Color"));
        }
        if (e2.b("Potion", 8)) {
            this.a(net.minecraft.d.m.c(e2));
        }
        if (e2.b("Effects", 9)) {
            object = e2.c("Effects", 10);
            this.h.clear();
            for (int i2 = 0; i2 < ((q)object).e(); ++i2) {
                j j2 = net.minecraft.d.j.b(((q)object).b(i2));
                if (j2 == null) continue;
                this.a(j2);
            }
        }
    }

    @Override
    protected void a(e e2) {
        e2.a("Age", this.by);
        e2.a("Duration", this.j);
        e2.a("WaitTime", this.k);
        e2.a("ReapplicationDelay", this.l);
        e2.a("DurationOnUse", this.n);
        e2.a("RadiusOnUse", this.o);
        e2.a("RadiusPerTick", this.p);
        e2.a("Radius", this.a());
        e2.a("Particle", this.d().b());
        e2.a("ParticleParam1", this.e());
        e2.a("ParticleParam2", this.f());
        if (this.r != null) {
            e2.a("OwnerUUID", this.r);
        }
        if (this.m) {
            e2.a("Color", this.c());
        }
        if (this.g != net.minecraft.a.o.a && this.g != null) {
            e2.a("Potion", ((bp)net.minecraft.d.b.a.b(this.g)).toString());
        }
        if (!this.h.isEmpty()) {
            q q2 = new q();
            for (j j2 : this.h) {
                q2.a(j2.a(new e()));
            }
            e2.a("Effects", q2);
        }
    }

    @Override
    public void a(g g2) {
        if (a.equals(g2)) {
            this.a(this.a());
        }
        super.a(g2);
    }

    @Override
    public b cm_() {
        return net.minecraft.g.a.b.d;
    }
}

