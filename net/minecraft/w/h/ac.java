/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import net.minecraft.q.a.a.j;
import net.minecraft.q.k;
import net.minecraft.u.a.a;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.d;
import net.minecraft.w.f;
import net.minecraft.w.h.af;
import net.minecraft.w.h.c;
import net.minecraft.w.n;

public class ac
extends c {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    private float i;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;

    public ac(k k2) {
        super(k2);
        this.d(0.8f, 0.8f);
        this.bx.setSeed(1 + this.ca());
        this.s = 1.0f / (this.bx.nextFloat() + 1.0f) * 0.2f;
    }

    public static void a(a a2) {
        net.minecraft.w.f.a(a2, "Squid");
    }

    @Override
    protected void cA_() {
        this.o.a(0, new af(this));
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(net.minecraft.w.d.a).a(10.0);
    }

    @Override
    public float ce_() {
        return this.bm * 0.5f;
    }

    @Override
    protected bv j() {
        return net.minecraft.a.f.gi;
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.gk;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.gj;
    }

    @Override
    protected float bE() {
        return 0.4f;
    }

    @Override
    protected boolean au() {
        return false;
    }

    @Override
    protected bp ai() {
        return net.minecraft.q.a.a.j.ah;
    }

    @Override
    public boolean cm() {
        return super.cm();
    }

    @Override
    public void n() {
        super.n();
        this.b = this.a;
        this.d = this.c;
        this.f = this.e;
        this.h = this.g;
        this.e += this.s;
        if ((double)this.e > Math.PI * 2) {
            if (this.aQ.C) {
                this.e = (float)Math.PI * 2;
            } else {
                this.e = (float)((double)this.e - Math.PI * 2);
                if (this.bx.nextInt(10) == 0) {
                    this.s = 1.0f / (this.bx.nextFloat() + 1.0f) * 0.2f;
                }
                this.aQ.a((n)this, (byte)19);
            }
        }
        if (this.bA) {
            float f2;
            if (this.e < (float)Math.PI) {
                f2 = this.e / (float)Math.PI;
                this.g = net.minecraft.u.b.n.a(f2 * f2 * (float)Math.PI) * (float)Math.PI * 0.25f;
                if ((double)f2 > 0.75) {
                    this.i = 1.0f;
                    this.t = 1.0f;
                } else {
                    this.t *= 0.8f;
                }
            } else {
                this.g = 0.0f;
                this.i *= 0.9f;
                this.t *= 0.99f;
            }
            if (!this.aQ.C) {
                this.aX = this.u * this.i;
                this.aY = this.v * this.i;
                this.aZ = this.w * this.i;
            }
            f2 = net.minecraft.u.b.n.a(this.aX * this.aX + this.aZ * this.aZ);
            this.ak += (-((float)net.minecraft.u.b.n.b(this.aX, this.aZ)) * 57.295776f - this.ak) * 0.1f;
            this.ba = this.ak;
            this.c = (float)((double)this.c + Math.PI * (double)this.t * 1.5);
            this.a += (-((float)net.minecraft.u.b.n.b((double)f2, this.aY)) * 57.295776f - this.a) * 0.1f;
        } else {
            this.g = net.minecraft.u.b.n.e(net.minecraft.u.b.n.a(this.e)) * (float)Math.PI * 0.25f;
            if (!this.aQ.C) {
                this.aX = 0.0;
                this.aZ = 0.0;
                if (this.b(net.minecraft.a.c.y)) {
                    this.aY += 0.05 * (double)(this.c(net.minecraft.a.c.y).c() + 1) - this.aY;
                } else if (!this.ci()) {
                    this.aY -= 0.08;
                }
                this.aY *= (double)0.98f;
            }
            this.a = (float)((double)this.a + (double)(-90.0f - this.a) * 0.02);
        }
    }

    @Override
    public void b(float f2, float f3) {
        this.b(this.aX, this.aY, this.aZ);
    }

    @Override
    public boolean aq() {
        return this.aV > 45.0 && this.aV < (double)this.aQ.x() && super.aq();
    }

    @Override
    public void a(byte by2) {
        if (by2 == 19) {
            this.e = 0.0f;
        } else {
            super.a(by2);
        }
    }

    public void b(float f2, float f3, float f4) {
        this.u = f2;
        this.v = f3;
        this.w = f4;
    }

    public boolean c() {
        return this.u != 0.0f || this.v != 0.0f || this.w != 0.0f;
    }

    static /* synthetic */ boolean a(ac ac2) {
        return ac2.bA;
    }
}

