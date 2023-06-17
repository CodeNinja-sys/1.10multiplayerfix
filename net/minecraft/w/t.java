/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import java.util.UUID;
import net.minecraft.i.a;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.w.b.a.h;
import net.minecraft.w.b.bm;
import net.minecraft.w.b.n;
import net.minecraft.w.f;
import net.minecraft.w.h.ai;

public abstract class t
extends f {
    public static final UUID s = UUID.fromString("E199AD21-BA8A-4C53-8D13-6182D5C69D3A");
    public static final h t = new h(s, "Fleeing speed bonus", 2.0, 2).a(false);
    private b a = net.minecraft.u.b.b.c;
    private float b = -1.0f;
    private final bm c = new n(this, 1.0);
    private boolean d;
    private float e = net.minecraft.i.h.g.a();

    public t(k k2) {
        super(k2);
    }

    public float a(b b2) {
        return 0.0f;
    }

    @Override
    public boolean aq() {
        if (super.aq()) {
            b b2 = new b(this.aU, this.cT().b, this.aW);
            if (this.a(b2) >= 0.0f) {
                return true;
            }
        }
        return false;
    }

    public boolean aX() {
        return !this.n.l();
    }

    public boolean di() {
        return this.f(new b(this));
    }

    public boolean f(b b2) {
        return this.b == -1.0f ? true : this.a.i(b2) < (double)(this.b * this.b);
    }

    public void a(b b2, int n2) {
        this.a = b2;
        this.b = n2;
    }

    public b dj() {
        return this.a;
    }

    public float dk() {
        return this.b;
    }

    public void dl() {
        this.b = -1.0f;
    }

    public boolean dm() {
        return this.b != -1.0f;
    }

    @Override
    protected void aN() {
        super.aN();
        if (this.aO() && this.aQ() != null && this.aQ().aQ == this.aQ) {
            net.minecraft.w.n n2 = this.aQ();
            this.a(new b((int)n2.aU, (int)n2.aV, (int)n2.aW), 5);
            float f2 = this.m(n2);
            if (this instanceof ai && ((ai)this).E()) {
                if (f2 > 10.0f) {
                    this.a(true, true);
                }
                return;
            }
            if (!this.d) {
                this.o.a(2, this.c);
                if (this.N() instanceof a) {
                    this.e = this.a(net.minecraft.i.h.g);
                    this.a(net.minecraft.i.h.g, 0.0f);
                }
                this.d = true;
            }
            this.p(f2);
            if (f2 > 4.0f) {
                this.N().a(n2, 1.0);
            }
            if (f2 > 6.0f) {
                double d2 = (n2.aU - this.aU) / (double)f2;
                double d3 = (n2.aV - this.aV) / (double)f2;
                double d4 = (n2.aW - this.aW) / (double)f2;
                this.aX += d2 * Math.abs(d2) * 0.4;
                this.aY += d3 * Math.abs(d3) * 0.4;
                this.aZ += d4 * Math.abs(d4) * 0.4;
            }
            if (f2 > 10.0f) {
                this.a(true, true);
            }
        } else if (!this.aO() && this.d) {
            this.d = false;
            this.o.a(this.c);
            if (this.N() instanceof a) {
                this.a(net.minecraft.i.h.g, this.e);
            }
            this.dl();
        }
    }

    protected void p(float f2) {
    }
}

