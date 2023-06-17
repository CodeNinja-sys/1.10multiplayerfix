/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import com.a.a.d.sz;
import java.util.Map;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.cn;
import net.minecraft.h.af;
import net.minecraft.m.a.g;
import net.minecraft.m.cd;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.a.a.j;
import net.minecraft.q.k;
import net.minecraft.q.z;
import net.minecraft.u.a.a;
import net.minecraft.u.b.n;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.ac;
import net.minecraft.w.ah;
import net.minecraft.w.b.ap;
import net.minecraft.w.b.av;
import net.minecraft.w.b.az;
import net.minecraft.w.b.bc;
import net.minecraft.w.b.bh;
import net.minecraft.w.b.bn;
import net.minecraft.w.b.e;
import net.minecraft.w.d;
import net.minecraft.w.f;
import net.minecraft.w.f.ae;
import net.minecraft.w.h.aa;
import net.minecraft.w.h.y;
import net.minecraft.w.l;
import net.minecraft.w.t;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;

public class ad
extends y {
    private static final net.minecraft.x.a.g b = net.minecraft.x.a.o.a(ad.class, net.minecraft.x.a.q.a);
    private final af c = new af(new aa(this), 2, 1);
    private static final Map d = sz.a(cd.class);
    private int e;
    private bn f;

    static {
        d.put(cd.a, new float[]{1.0f, 1.0f, 1.0f});
        d.put(cd.b, new float[]{0.85f, 0.5f, 0.2f});
        d.put(cd.c, new float[]{0.7f, 0.3f, 0.85f});
        d.put(cd.d, new float[]{0.4f, 0.6f, 0.85f});
        d.put(cd.e, new float[]{0.9f, 0.9f, 0.2f});
        d.put(cd.f, new float[]{0.5f, 0.8f, 0.1f});
        d.put(cd.g, new float[]{0.95f, 0.5f, 0.65f});
        d.put(cd.h, new float[]{0.3f, 0.3f, 0.3f});
        d.put(cd.i, new float[]{0.6f, 0.6f, 0.6f});
        d.put(cd.j, new float[]{0.3f, 0.5f, 0.6f});
        d.put(cd.k, new float[]{0.5f, 0.25f, 0.7f});
        d.put(cd.l, new float[]{0.2f, 0.3f, 0.7f});
        d.put(cd.m, new float[]{0.4f, 0.3f, 0.2f});
        d.put(cd.n, new float[]{0.4f, 0.5f, 0.2f});
        d.put(cd.o, new float[]{0.6f, 0.2f, 0.2f});
        d.put(cd.p, new float[]{0.1f, 0.1f, 0.1f});
    }

    public static float[] a(cd cd2) {
        return (float[])d.get(cd2);
    }

    public ad(k k2) {
        super(k2);
        this.d(0.9f, 1.3f);
        this.c.a(0, new cu(net.minecraft.a.w.bd));
        this.c.a(1, new cu(net.minecraft.a.w.bd));
    }

    @Override
    protected void cA_() {
        this.f = new bn(this);
        this.o.a(0, new av(this));
        this.o.a(1, new net.minecraft.w.b.ah(this, 1.25));
        this.o.a(2, new net.minecraft.w.b.k(this, 1.0));
        this.o.a(3, new e((t)this, 1.1, net.minecraft.a.w.Q, false));
        this.o.a(4, new bc(this, 1.1));
        this.o.a(5, this.f);
        this.o.a(6, new az(this, 1.0));
        this.o.a(7, new ap(this, b.class, 6.0f));
        this.o.a(8, new bh(this));
    }

    @Override
    protected void e() {
        this.e = this.f.f();
        super.e();
    }

    @Override
    public void n() {
        if (this.aQ.C) {
            this.e = Math.max(0, this.e - 1);
        }
        super.n();
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(net.minecraft.w.d.a).a(8.0);
        this.a(net.minecraft.w.d.d).a(0.23f);
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(b, (byte)0);
    }

    @Override
    protected bp ai() {
        if (this.q()) {
            return net.minecraft.q.a.a.j.M;
        }
        switch (this.p()) {
            default: {
                return net.minecraft.q.a.a.j.N;
            }
            case b: {
                return net.minecraft.q.a.a.j.O;
            }
            case c: {
                return net.minecraft.q.a.a.j.P;
            }
            case d: {
                return net.minecraft.q.a.a.j.Q;
            }
            case e: {
                return net.minecraft.q.a.a.j.R;
            }
            case f: {
                return net.minecraft.q.a.a.j.S;
            }
            case g: {
                return net.minecraft.q.a.a.j.T;
            }
            case h: {
                return net.minecraft.q.a.a.j.U;
            }
            case i: {
                return net.minecraft.q.a.a.j.V;
            }
            case j: {
                return net.minecraft.q.a.a.j.W;
            }
            case k: {
                return net.minecraft.q.a.a.j.X;
            }
            case l: {
                return net.minecraft.q.a.a.j.Y;
            }
            case m: {
                return net.minecraft.q.a.a.j.Z;
            }
            case n: {
                return net.minecraft.q.a.a.j.aa;
            }
            case o: {
                return net.minecraft.q.a.a.j.ab;
            }
            case p: 
        }
        return net.minecraft.q.a.a.j.ac;
    }

    @Override
    public void a(byte by2) {
        if (by2 == 10) {
            this.e = 40;
        } else {
            super.a(by2);
        }
    }

    public float q(float f2) {
        return this.e <= 0 ? 0.0f : (this.e >= 4 && this.e <= 36 ? 1.0f : (this.e < 4 ? ((float)this.e - f2) / 4.0f : -((float)(this.e - 40) - f2) / 4.0f));
    }

    public float s(float f2) {
        if (this.e > 4 && this.e <= 36) {
            float f3 = ((float)(this.e - 4) - f2) / 32.0f;
            return 0.62831855f + 0.2199115f * net.minecraft.u.b.n.a(f3 * 28.7f);
        }
        return this.e > 0 ? 0.62831855f : this.bb * ((float)Math.PI / 180);
    }

    @Override
    public boolean a(b b2, net.minecraft.u.ah ah2, cu cu2) {
        if (cu2 != null && cu2.a() == net.minecraft.a.w.bl && !this.q() && !this.ba()) {
            if (!this.aQ.C) {
                this.a(true);
                int n2 = 1 + this.bx.nextInt(3);
                for (int i2 = 0; i2 < n2; ++i2) {
                    ae ae2 = this.a(new cu(cg.a(net.minecraft.a.p.L), 1, this.p().b()), 1.0f);
                    ae2.aY += (double)(this.bx.nextFloat() * 0.05f);
                    ae2.aX += (double)((this.bx.nextFloat() - this.bx.nextFloat()) * 0.1f);
                    ae2.aZ += (double)((this.bx.nextFloat() - this.bx.nextFloat()) * 0.1f);
                }
            }
            cu2.a(1, (l)b2);
            this.a(net.minecraft.a.f.fa, 1.0f, 1.0f);
        }
        return super.a(b2, ah2, cu2);
    }

    public static void a(a a2) {
        net.minecraft.w.f.a(a2, "Sheep");
    }

    @Override
    public void a(net.minecraft.e.e e2) {
        super.a(e2);
        e2.a("Sheared", this.q());
        e2.a("Color", (byte)this.p().b());
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        super.b(e2);
        this.a(e2.p("Sheared"));
        this.b(cd.b(e2.f("Color")));
    }

    @Override
    protected bv j() {
        return net.minecraft.a.f.eX;
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.eZ;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.eY;
    }

    @Override
    protected void a(net.minecraft.u.b.b b2, cn cn2) {
        this.a(net.minecraft.a.f.fb, 0.15f, 1.0f);
    }

    public cd p() {
        return cd.b((Byte)this.bE.a(b) & 0xF);
    }

    public void b(cd cd2) {
        byte by2 = (Byte)this.bE.a(b);
        this.bE.b(b, (byte)(by2 & 0xF0 | cd2.b() & 0xF));
    }

    public boolean q() {
        return ((Byte)this.bE.a(b) & 0x10) != 0;
    }

    public void a(boolean bl2) {
        byte by2 = (Byte)this.bE.a(b);
        if (bl2) {
            this.bE.b(b, (byte)(by2 | 0x10));
        } else {
            this.bE.b(b, (byte)(by2 & 0xFFFFFFEF));
        }
    }

    public static cd a(Random random) {
        int n2 = random.nextInt(100);
        return n2 < 5 ? cd.p : (n2 < 10 ? cd.h : (n2 < 15 ? cd.i : (n2 < 18 ? cd.m : (random.nextInt(500) == 0 ? cd.g : cd.a))));
    }

    public ad a(ah ah2) {
        ad ad2 = (ad)ah2;
        ad ad3 = new ad(this.aQ);
        ad3.b(this.a(this, ad2));
        return ad3;
    }

    @Override
    public void Z() {
        this.a(false);
        if (this.ba()) {
            this.c(60);
        }
    }

    @Override
    public ac a(z z2, ac ac2) {
        ac2 = super.a(z2, ac2);
        this.b(net.minecraft.w.h.ad.a(this.aQ.p));
        return ac2;
    }

    private cd a(y y2, y y3) {
        int n2 = ((ad)y2).p().c();
        int n3 = ((ad)y3).p().c();
        this.c.a(0).b(n2);
        this.c.a(1).b(n3);
        cu cu2 = net.minecraft.m.a.g.a().a(this.c, ((ad)y2).aQ);
        int n4 = cu2 != null && cu2.a() == net.minecraft.a.w.bd ? cu2.h() : (this.aQ.p.nextBoolean() ? n2 : n3);
        return cd.a(n4);
    }

    @Override
    public float ce_() {
        return 0.95f * this.bm;
    }

    @Override
    public /* synthetic */ ah b(ah ah2) {
        return this.a(ah2);
    }
}

