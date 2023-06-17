/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util;

import org.lwjgl.ab;

public class m {
    private static long a = ab.d();
    private static final int b = 50;
    private static int c;
    private static long d;
    private long e;
    private long f;
    private boolean g;

    public m() {
        this.d();
        this.e();
    }

    public float a() {
        if (!this.g) {
            this.f = d - this.e;
        }
        return (float)((double)this.f / (double)a);
    }

    public boolean b() {
        return this.g;
    }

    public void c() {
        this.g = true;
    }

    public void d() {
        this.a(0.0f);
    }

    public void e() {
        this.g = false;
        this.e = d - this.f;
    }

    public void a(float f2) {
        long l2 = (long)((double)f2 * (double)a);
        this.e = d - l2;
        this.f = l2;
    }

    public static void f() {
        d = ab.e();
        if (++c > 50) {
            c = 0;
            a = ab.d();
        }
    }

    public String toString() {
        return "Timer[Time=" + this.a() + ", Paused=" + this.g + "]";
    }

    static {
        m.f();
    }
}

