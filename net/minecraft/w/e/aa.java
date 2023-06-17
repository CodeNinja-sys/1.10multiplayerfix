/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.i.h;
import net.minecraft.q.a.a.j;
import net.minecraft.u.a.a;
import net.minecraft.u.aj;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.b.ap;
import net.minecraft.w.b.az;
import net.minecraft.w.b.ba;
import net.minecraft.w.b.bh;
import net.minecraft.w.b.n;
import net.minecraft.w.b.y;
import net.minecraft.w.d;
import net.minecraft.w.e.ar;
import net.minecraft.w.e.k;
import net.minecraft.w.f;
import net.minecraft.w.l;
import net.minecraft.w.t;
import net.minecraft.x.a.g;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;

public class aa
extends k {
    private float a = 0.5f;
    private int b;
    private static final g c = net.minecraft.x.a.o.a(aa.class, net.minecraft.x.a.q.a);

    public aa(net.minecraft.q.k k2) {
        super(k2);
        this.a(h.g, -1.0f);
        this.a(h.f, 8.0f);
        this.a(h.i, 0.0f);
        this.a(h.j, 0.0f);
        this.bD = true;
        this.k = 10;
    }

    public static void a(a a2) {
        f.a(a2, "Blaze");
    }

    @Override
    protected void cA_() {
        this.o.a(4, new ar(this));
        this.o.a(5, new n(this, 1.0));
        this.o.a(7, new az(this, 1.0));
        this.o.a(8, new ap(this, b.class, 8.0f));
        this.o.a(8, new bh(this));
        this.p.a(1, new ba((t)this, true, new Class[0]));
        this.p.a(2, new y((t)this, b.class, true));
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(d.e).a(6.0);
        this.a(d.d).a(0.23f);
        this.a(d.b).a(48.0);
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(c, (byte)0);
    }

    @Override
    protected bv j() {
        return net.minecraft.a.f.B;
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.E;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.D;
    }

    @Override
    public int m(float f2) {
        return 0xF000F0;
    }

    @Override
    public float n(float f2) {
        return 1.0f;
    }

    @Override
    public void n() {
        if (!this.be && this.aY < 0.0) {
            this.aY *= 0.6;
        }
        if (this.aQ.C) {
            if (this.bx.nextInt(24) == 0 && !this.ch()) {
                this.aQ.a(this.aU + 0.5, this.aV + 0.5, this.aW + 0.5, net.minecraft.a.f.C, this.S(), 1.0f + this.bx.nextFloat(), this.bx.nextFloat() * 0.7f + 0.3f, false);
            }
            for (int i2 = 0; i2 < 2; ++i2) {
                this.aQ.a(net.minecraft.u.aj.m, this.aU + (this.bx.nextDouble() - 0.5) * (double)this.bl, this.aV + this.bx.nextDouble() * (double)this.bm, this.aW + (this.bx.nextDouble() - 0.5) * (double)this.bl, 0.0, 0.0, 0.0, new int[0]);
            }
        }
        super.n();
    }

    @Override
    protected void e() {
        l l2;
        if (this.cl()) {
            this.a(net.minecraft.u.n.g, 1.0f);
        }
        --this.b;
        if (this.b <= 0) {
            this.b = 100;
            this.a = 0.5f + (float)this.bx.nextGaussian() * 3.0f;
        }
        if ((l2 = this.W()) != null && l2.aV + (double)l2.ce_() > this.aV + (double)this.ce_() + (double)this.a) {
            this.aY += ((double)0.3f - this.aY) * (double)0.3f;
            this.bO = true;
        }
        super.e();
    }

    @Override
    public void c(float f2, float f3) {
    }

    @Override
    public boolean cy() {
        return this.c();
    }

    @Override
    protected bp ai() {
        return net.minecraft.q.a.a.j.p;
    }

    public boolean c() {
        return ((Byte)this.bE.a(c) & 1) != 0;
    }

    public void a(boolean bl2) {
        byte by2 = (Byte)this.bE.a(c);
        by2 = bl2 ? (byte)(by2 | 1) : (byte)(by2 & 0xFFFFFFFE);
        this.bE.b(c, by2);
    }

    @Override
    protected boolean cB_() {
        return true;
    }
}

