/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.c;

import net.minecraft.client.c.h;
import net.minecraft.client.c.l;
import net.minecraft.client.c.u;
import net.minecraft.client.c.x;
import net.minecraft.client.c.z;
import net.minecraft.u.bp;
import net.minecraft.u.bu;
import net.minecraft.u.bv;

public abstract class k
implements z {
    protected l b;
    private u a;
    protected bu c;
    protected bp d;
    protected float e = 1.0f;
    protected float f = 1.0f;
    protected float g;
    protected float h;
    protected float i;
    protected boolean j;
    protected int k;
    protected x l = x.b;

    protected k(bv bv2, bu bu2) {
        this(bv2.a(), bu2);
    }

    protected k(bp bp2, bu bu2) {
        this.d = bp2;
        this.c = bu2;
    }

    @Override
    public bp c() {
        return this.d;
    }

    @Override
    public u a(h h2) {
        this.a = h2.a(this.d);
        this.b = this.a == null ? net.minecraft.client.c.h.a : this.a.a();
        return this.a;
    }

    @Override
    public l d() {
        return this.b;
    }

    @Override
    public bu e() {
        return this.c;
    }

    @Override
    public boolean f() {
        return this.j;
    }

    @Override
    public int g() {
        return this.k;
    }

    @Override
    public float h() {
        return this.e * this.b.c();
    }

    @Override
    public float i() {
        return this.f * this.b.d();
    }

    @Override
    public float j() {
        return this.g;
    }

    @Override
    public float k() {
        return this.h;
    }

    @Override
    public float l() {
        return this.i;
    }

    @Override
    public x m() {
        return this.l;
    }
}

