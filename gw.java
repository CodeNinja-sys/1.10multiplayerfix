/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class gw
extends cpk {
    private static final bcz a = bwm.a(gw.class, cbf.c);
    private static final bcz b = bwm.a(gw.class, cbf.b);
    private static final bcz c = bwm.a(gw.class, cbf.h);
    private static final bcz d = bwm.a(gw.class, cbf.b);
    private static final bcz e = bwm.a(gw.class, cbf.b);
    private static final bcz f = bwm.a(gw.class, cbf.b);
    private hy g = im.a;
    private final List h = ov.a();
    private final Map i = sz.c();
    private int j = 600;
    private int k = 20;
    private int l = 20;
    private boolean m;
    private int n;
    private float o;
    private float p;
    private bga q;
    private UUID r;

    public gw(iu iu2) {
        super(iu2);
        this.bv = true;
        this.bD = true;
        this.c(3.0f);
    }

    public gw(iu iu2, double d2, double d3, double d4) {
        this(iu2);
        this.d(d2, d3, d4);
    }

    @Override
    protected void a() {
        this.bY().a(b, 0);
        this.bY().a(a, Float.valueOf(0.5f));
        this.bY().a(c, false);
        this.bY().a(d, lz.p.c());
        this.bY().a(e, 0);
        this.bY().a(f, 0);
    }

    public void c(float f2) {
        double d2 = this.aU;
        double d3 = this.aV;
        double d4 = this.aW;
        this.a_(f2 * 2.0f, 0.5f);
        this.d(d2, d3, d4);
        if (!this.aQ.C) {
            this.bY().b(a, Float.valueOf(f2));
        }
    }

    public float f() {
        return ((Float)this.bY().a(a)).floatValue();
    }

    public void a(hy hy2) {
        this.g = hy2;
        if (!this.m) {
            if (hy2 == im.a && this.h.isEmpty()) {
                this.bY().b(b, 0);
            } else {
                this.bY().b(b, anl.a(anl.a(hy2, (Collection)this.h)));
            }
        }
    }

    public void a(cko cko2) {
        this.h.add(cko2);
        if (!this.m) {
            this.bY().b(b, anl.a(anl.a(this.g, (Collection)this.h)));
        }
    }

    public int h() {
        return (Integer)this.bY().a(b);
    }

    public void c(int n2) {
        this.m = true;
        this.bY().b(b, n2);
    }

    public lz j() {
        return lz.a((Integer)this.bY().a(d));
    }

    public void a(lz lz2) {
        this.bY().b(d, lz2.c());
    }

    public int k() {
        return (Integer)this.bY().a(e);
    }

    public void d(int n2) {
        this.bY().b(e, n2);
    }

    public int n() {
        return (Integer)this.bY().a(f);
    }

    public void e(int n2) {
        this.bY().b(f, n2);
    }

    protected void a(boolean bl2) {
        this.bY().b(c, bl2);
    }

    public boolean p() {
        return (Boolean)this.bY().a(c);
    }

    public int q() {
        return this.j;
    }

    public void f(int n2) {
        this.j = n2;
    }

    @Override
    public void bb_() {
        block25: {
            boolean bl2;
            float f2;
            boolean bl3;
            block23: {
                int[] arrn;
                lz lz2;
                block24: {
                    super.bb_();
                    bl3 = this.p();
                    f2 = this.f();
                    if (!this.aQ.C) break block23;
                    lz2 = this.j();
                    arrn = new int[lz2.d()];
                    if (arrn.length > 0) {
                        arrn[0] = this.k();
                    }
                    if (arrn.length > 1) {
                        arrn[1] = this.n();
                    }
                    if (!bl3) break block24;
                    if (!this.bx.nextBoolean()) break block25;
                    for (int i2 = 0; i2 < 2; ++i2) {
                        float f3 = this.bx.nextFloat() * ((float)Math.PI * 2);
                        float f4 = cmk.c(this.bx.nextFloat()) * 0.2f;
                        float f5 = cmk.b(f3) * f4;
                        float f6 = cmk.a(f3) * f4;
                        if (lz2 == lz.p) {
                            int n2 = this.bx.nextBoolean() ? 0xFFFFFF : this.h();
                            int n3 = n2 >> 16 & 0xFF;
                            int n4 = n2 >> 8 & 0xFF;
                            int n5 = n2 & 0xFF;
                            this.aQ.a(lz.p, this.aU + (double)f5, this.aV, this.aW + (double)f6, (double)((float)n3 / 255.0f), (double)((float)n4 / 255.0f), (double)((float)n5 / 255.0f), new int[0]);
                            continue;
                        }
                        this.aQ.a(lz2, this.aU + (double)f5, this.aV, this.aW + (double)f6, 0.0, 0.0, 0.0, arrn);
                    }
                    break block25;
                }
                float f7 = (float)Math.PI * f2 * f2;
                int n6 = 0;
                while ((float)n6 < f7) {
                    float f8 = this.bx.nextFloat() * ((float)Math.PI * 2);
                    float f9 = cmk.c(this.bx.nextFloat()) * f2;
                    float f10 = cmk.b(f8) * f9;
                    float f11 = cmk.a(f8) * f9;
                    if (lz2 == lz.p) {
                        int n7 = this.h();
                        int n8 = n7 >> 16 & 0xFF;
                        int n9 = n7 >> 8 & 0xFF;
                        int n10 = n7 & 0xFF;
                        this.aQ.a(lz.p, this.aU + (double)f10, this.aV, this.aW + (double)f11, (double)((float)n8 / 255.0f), (double)((float)n9 / 255.0f), (double)((float)n10 / 255.0f), new int[0]);
                    } else {
                        this.aQ.a(lz2, this.aU + (double)f10, this.aV, this.aW + (double)f11, (0.5 - this.bx.nextDouble()) * 0.15, (double)0.01f, (0.5 - this.bx.nextDouble()) * 0.15, arrn);
                    }
                    ++n6;
                }
                break block25;
            }
            if (this.by >= this.k + this.j) {
                this.ak_();
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
                    this.ak_();
                    return;
                }
                this.c(f2);
            }
            if (this.by % 5 == 0) {
                Object object;
                Object object2 = this.i.entrySet().iterator();
                while (object2.hasNext()) {
                    object = object2.next();
                    if (this.by < (Integer)object.getValue()) continue;
                    object2.remove();
                }
                object2 = ov.a();
                for (Object object3 : this.g.a()) {
                    object2.add(new cko(((cko)object3).a(), ((cko)object3).b() / 4, ((cko)object3).c(), ((cko)object3).d(), ((cko)object3).e()));
                }
                object2.addAll(this.h);
                if (object2.isEmpty()) {
                    this.i.clear();
                } else {
                    object = this.aQ.a(bga.class, this.cD());
                    if (!object.isEmpty()) {
                        Object object3;
                        object3 = object.iterator();
                        while (object3.hasNext()) {
                            double d2;
                            double d3;
                            double d4;
                            bga bga2 = (bga)object3.next();
                            if (this.i.containsKey(bga2) || !bga2.I_() || !((d4 = (d3 = bga2.aU - this.aU) * d3 + (d2 = bga2.aW - this.aW) * d2) <= (double)(f2 * f2))) continue;
                            this.i.put(bga2, this.by + this.l);
                            Iterator iterator = object2.iterator();
                            while (iterator.hasNext()) {
                                cko cko2 = (cko)iterator.next();
                                if (cko2.a().a()) {
                                    cko2.a().a(this, this.r(), bga2, cko2.c(), 0.5);
                                    continue;
                                }
                                bga2.b(new cko(cko2));
                            }
                            if (this.o != 0.0f) {
                                if ((f2 += this.o) < 0.5f) {
                                    this.ak_();
                                    return;
                                }
                                this.c(f2);
                            }
                            if (this.n == 0) continue;
                            this.j += this.n;
                            if (this.j > 0) continue;
                            this.ak_();
                            return;
                        }
                    }
                }
            }
        }
    }

    public void d(float f2) {
        this.o = f2;
    }

    public void e(float f2) {
        this.p = f2;
    }

    public void g(int n2) {
        this.k = n2;
    }

    public void a(bga bga2) {
        this.q = bga2;
        this.r = bga2 == null ? null : bga2.cx();
    }

    public bga r() {
        cpk cpk2;
        if (this.q == null && this.r != null && this.aQ instanceof alj && (cpk2 = ((alj)this.aQ).b(this.r)) instanceof bga) {
            this.q = (bga)cpk2;
        }
        return this.q;
    }

    @Override
    protected void b(bvp bvp2) {
        Object object;
        this.by = bvp2.h("Age");
        this.j = bvp2.h("Duration");
        this.k = bvp2.h("WaitTime");
        this.l = bvp2.h("ReapplicationDelay");
        this.n = bvp2.h("DurationOnUse");
        this.o = bvp2.j("RadiusOnUse");
        this.p = bvp2.j("RadiusPerTick");
        this.c(bvp2.j("Radius"));
        this.r = bvp2.a("OwnerUUID");
        if (bvp2.b("Particle", 8) && (object = lz.a(bvp2.l("Particle"))) != null) {
            this.a((lz)((Object)object));
            this.d(bvp2.h("ParticleParam1"));
            this.e(bvp2.h("ParticleParam2"));
        }
        if (bvp2.b("Color", 99)) {
            this.c(bvp2.h("Color"));
        }
        if (bvp2.b("Potion", 8)) {
            this.a(anl.c(bvp2));
        }
        if (bvp2.b("Effects", 9)) {
            object = bvp2.c("Effects", 10);
            this.h.clear();
            for (int i2 = 0; i2 < ((bmh)object).b(); ++i2) {
                cko cko2 = cko.b(((bmh)object).b(i2));
                if (cko2 == null) continue;
                this.a(cko2);
            }
        }
    }

    @Override
    protected void a(bvp bvp2) {
        bvp2.a("Age", this.by);
        bvp2.a("Duration", this.j);
        bvp2.a("WaitTime", this.k);
        bvp2.a("ReapplicationDelay", this.l);
        bvp2.a("DurationOnUse", this.n);
        bvp2.a("RadiusOnUse", this.o);
        bvp2.a("RadiusPerTick", this.p);
        bvp2.a("Radius", this.f());
        bvp2.a("Particle", this.j().b());
        bvp2.a("ParticleParam1", this.k());
        bvp2.a("ParticleParam2", this.n());
        if (this.r != null) {
            bvp2.a("OwnerUUID", this.r);
        }
        if (this.m) {
            bvp2.a("Color", this.h());
        }
        if (this.g != im.a && this.g != null) {
            bvp2.a("Potion", ((bpx)hy.a.b(this.g)).toString());
        }
        if (!this.h.isEmpty()) {
            bmh bmh2 = new bmh();
            for (cko cko2 : this.h) {
                bmh2.a(cko2.a(new bvp()));
            }
            bvp2.a("Effects", bmh2);
        }
    }

    @Override
    public void a(bcz bcz2) {
        if (a.equals(bcz2)) {
            this.c(this.f());
        }
        super.a(bcz2);
    }

    @Override
    public bez P_() {
        return bez.d;
    }
}

