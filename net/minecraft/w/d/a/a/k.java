/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.d.a.a;

import net.minecraft.u.b.n;
import net.minecraft.u.b.s;
import net.minecraft.w.d.a;
import net.minecraft.w.d.a.a.e;
import net.minecraft.w.d.b;
import net.minecraft.w.f.ad;

public abstract class k
implements e {
    protected final a a;

    public k(a a2) {
        this.a = a2;
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
    }

    @Override
    public void a(ad ad2, net.minecraft.u.b.b b2, net.minecraft.u.n n2, net.minecraft.w.a.b b3) {
    }

    @Override
    public void e() {
    }

    @Override
    public void i() {
    }

    @Override
    public float c() {
        return 0.6f;
    }

    @Override
    public s f() {
        return null;
    }

    @Override
    public float a(b b2, net.minecraft.u.n n2, float f2) {
        return f2;
    }

    @Override
    public float d() {
        float f2 = n.a(this.a.aX * this.a.aX + this.a.aZ * this.a.aZ) + 1.0f;
        float f3 = Math.min(f2, 40.0f);
        return 0.7f / f3 / f2;
    }
}

