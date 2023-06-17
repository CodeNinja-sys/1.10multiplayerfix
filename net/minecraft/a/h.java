/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.a;

import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.t.c;
import net.minecraft.t.f;
import net.minecraft.w.f.p;
import net.minecraft.w.s;

class h
extends f {
    h() {
    }

    @Override
    protected s a(k k2, c c2, cu cu2) {
        return new p(k2, c2.b(), c2.c(), c2.d());
    }

    @Override
    protected float a() {
        return super.a() * 0.5f;
    }

    @Override
    protected float b() {
        return super.b() * 1.25f;
    }
}

