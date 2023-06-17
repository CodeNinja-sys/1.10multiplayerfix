/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.h;

import net.minecraft.a.w;
import net.minecraft.client.f.z;
import net.minecraft.client.g.a.c;
import net.minecraft.client.g.a.t;
import net.minecraft.client.g.e;
import net.minecraft.client.g.h;
import net.minecraft.client.r;
import net.minecraft.q.am;
import net.minecraft.q.k;
import net.minecraft.u.bp;
import net.minecraft.u.bw;
import net.minecraft.w.a.b;
import net.minecraft.w.b.a.i;
import net.minecraft.w.d;

public abstract class a
extends b {
    private net.minecraft.client.l.r d;
    public float a;
    public float b;
    public float c;

    public a(k k2, com.c.a.e e2) {
        super(k2, e2);
    }

    @Override
    public boolean a() {
        net.minecraft.client.l.r r2 = net.minecraft.client.r.z().v().a(this.ac().a());
        return r2 != null && r2.b() == net.minecraft.q.am.e;
    }

    @Override
    public boolean c() {
        net.minecraft.client.l.r r2 = net.minecraft.client.r.z().v().a(this.ac().a());
        return r2 != null && r2.b() == net.minecraft.q.am.c;
    }

    public boolean d() {
        return this.e() != null;
    }

    protected net.minecraft.client.l.r e() {
        if (this.d == null) {
            this.d = net.minecraft.client.r.z().v().a(this.cM());
        }
        return this.d;
    }

    public boolean f() {
        net.minecraft.client.l.r r2 = this.e();
        return r2 != null && r2.d();
    }

    public bp g() {
        net.minecraft.client.l.r r2 = this.e();
        return r2 == null ? net.minecraft.client.f.z.a(this.cM()) : r2.f();
    }

    public bp h() {
        net.minecraft.client.l.r r2 = this.e();
        return r2 == null ? null : r2.g();
    }

    public boolean i() {
        return this.e() != null;
    }

    public bp j() {
        net.minecraft.client.l.r r2 = this.e();
        return r2 == null ? null : r2.h();
    }

    public static h a(bp bp2, String string) {
        c c2 = net.minecraft.client.r.z().N();
        t t2 = c2.b(bp2);
        if (t2 == null) {
            t2 = new h(null, String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", net.minecraft.u.bw.a(string)), net.minecraft.client.f.z.a(net.minecraft.client.h.a.d(string)), new e());
            c2.a(bp2, t2);
        }
        return (h)t2;
    }

    public static bp a(String string) {
        return new bp("skins/" + net.minecraft.u.bw.a(string));
    }

    public String k() {
        net.minecraft.client.l.r r2 = this.e();
        return r2 == null ? net.minecraft.client.f.z.b(this.cM()) : r2.e();
    }

    public float l() {
        float f2 = 1.0f;
        if (this.J.b) {
            f2 *= 1.1f;
        }
        i i2 = this.a(net.minecraft.w.d.d);
        f2 = (float)((double)f2 * ((i2.f() / (double)this.J.b() + 1.0) / 2.0));
        if (this.J.b() == 0.0f || Float.isNaN(f2) || Float.isInfinite(f2)) {
            f2 = 1.0f;
        }
        if (this.B() && this.bR() != null && this.bR().a() == net.minecraft.a.w.f) {
            int n2 = this.bT();
            float f3 = (float)n2 / 20.0f;
            f3 = f3 > 1.0f ? 1.0f : (f3 *= f3);
            f2 *= 1.0f - f3 * 0.15f;
        }
        return f2;
    }
}

