/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.u.b.s;

public class as {
    public s a;
    public float b;
    public float c;

    public as(float f2, float f3, float f4, float f5, float f6) {
        this(new s(f2, f3, f4), f5, f6);
    }

    public as a(float f2, float f3) {
        return new as(this, f2, f3);
    }

    public as(as as2, float f2, float f3) {
        this.a = as2.a;
        this.b = f2;
        this.c = f3;
    }

    public as(s s2, float f2, float f3) {
        this.a = s2;
        this.b = f2;
        this.c = f3;
    }
}

