/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.c;

import net.minecraft.client.c.k;
import net.minecraft.client.c.x;
import net.minecraft.u.b.b;
import net.minecraft.u.bp;
import net.minecraft.u.bu;
import net.minecraft.u.bv;

public class e
extends k {
    public e(bv bv2, bu bu2, float f2, float f3, b b2) {
        this(bv2, bu2, f2, f3, (float)b2.cy_() + 0.5f, (float)b2.k() + 0.5f, (float)b2.l() + 0.5f);
    }

    public static e a(bv bv2, float f2) {
        return new e(bv2, bu.a, 0.25f, f2, false, 0, x.a, 0.0f, 0.0f, 0.0f);
    }

    public static e a(bv bv2) {
        return new e(bv2, bu.b, 1.0f, 1.0f, false, 0, x.a, 0.0f, 0.0f, 0.0f);
    }

    public static e a(bv bv2, float f2, float f3, float f4) {
        return new e(bv2, bu.c, 4.0f, 1.0f, false, 0, x.b, f2, f3, f4);
    }

    public e(bv bv2, bu bu2, float f2, float f3, float f4, float f5, float f6) {
        this(bv2, bu2, f2, f3, false, 0, x.b, f4, f5, f6);
    }

    private e(bv bv2, bu bu2, float f2, float f3, boolean bl2, int n2, x x2, float f4, float f5, float f6) {
        this(bv2.a(), bu2, f2, f3, bl2, n2, x2, f4, f5, f6);
    }

    public e(bp bp2, bu bu2, float f2, float f3, boolean bl2, int n2, x x2, float f4, float f5, float f6) {
        super(bp2, bu2);
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = f5;
        this.i = f6;
        this.j = bl2;
        this.k = n2;
        this.l = x2;
    }
}

