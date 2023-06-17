/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a;

import net.minecraft.q.a.a.m;
import net.minecraft.q.v;
import net.minecraft.w.a.b;
import net.minecraft.w.n;

public class r {
    private final v a;
    private float b;
    private n c;
    private b d;
    private net.minecraft.u.n e;

    public r(v v2) {
        this.a = v2;
    }

    public r a(float f2) {
        this.b = f2;
        return this;
    }

    public r a(n n2) {
        this.c = n2;
        return this;
    }

    public r a(b b2) {
        this.d = b2;
        return this;
    }

    public r a(net.minecraft.u.n n2) {
        this.e = n2;
        return this;
    }

    public m a() {
        return new m(this.b, this.a, this.a.W(), this.c, this.d, this.e);
    }
}

