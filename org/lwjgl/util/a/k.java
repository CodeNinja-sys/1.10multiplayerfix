/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.a;

import org.lwjgl.opengl.GL11;

public class k {
    protected int a = 100012;
    protected int b = 100020;
    protected boolean c = false;
    protected int d = 100000;

    protected void a(float f2, float f3, float f4) {
        float f5 = (float)Math.sqrt(f2 * f2 + f3 * f3 + f4 * f4);
        if (f5 > 1.0E-5f) {
            f2 /= f5;
            f3 /= f5;
            f4 /= f5;
        }
        GL11.b(f2, f3, f4);
    }

    public void a(int n2) {
        this.a = n2;
    }

    public void b(int n2) {
        this.d = n2;
    }

    public void c(int n2) {
        this.b = n2;
    }

    public void a(boolean bl2) {
        this.c = bl2;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }

    protected void a(float f2, float f3) {
        if (this.c) {
            GL11.f(f2, f3);
        }
    }

    protected float a(float f2) {
        return (float)Math.sin(f2);
    }

    protected float b(float f2) {
        return (float)Math.cos(f2);
    }
}

