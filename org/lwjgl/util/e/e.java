/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.e;

import java.nio.FloatBuffer;
import org.lwjgl.util.e.c;
import org.lwjgl.util.e.d;
import org.lwjgl.util.e.i;
import org.lwjgl.util.e.j;
import org.lwjgl.util.e.m;

public class e
extends j
implements i {
    private static final long e = 1L;
    public float a;
    public float b;
    public float c;
    public float d;

    public e() {
        this.a();
    }

    public e(i i2) {
        this.a(i2);
    }

    public e(float f2, float f3, float f4, float f5) {
        this.a(f2, f3, f4, f5);
    }

    public void a(float f2, float f3) {
        this.a = f2;
        this.b = f3;
    }

    public void a(float f2, float f3, float f4) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
    }

    public void a(float f2, float f3, float f4, float f5) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
    }

    public e a(i i2) {
        this.a = i2.d();
        this.b = i2.e();
        this.c = i2.f();
        this.d = i2.g();
        return this;
    }

    public e a() {
        return org.lwjgl.util.e.e.a(this);
    }

    public static e a(e e2) {
        e2.a = 0.0f;
        e2.b = 0.0f;
        e2.c = 0.0f;
        e2.d = 1.0f;
        return e2;
    }

    public float b() {
        return this.a * this.a + this.b * this.b + this.c * this.c + this.d * this.d;
    }

    public static e a(e e2, e e3) {
        float f2 = 1.0f / e2.h();
        if (e3 == null) {
            e3 = new e();
        }
        e3.a(e2.a * f2, e2.b * f2, e2.c * f2, e2.d * f2);
        return e3;
    }

    public e b(e e2) {
        return org.lwjgl.util.e.e.a(this, e2);
    }

    public static float b(e e2, e e3) {
        return e2.a * e3.a + e2.b * e3.b + e2.c * e3.c + e2.d * e3.d;
    }

    public e c(e e2) {
        return org.lwjgl.util.e.e.c(this, e2);
    }

    public static e c(e e2, e e3) {
        if (e3 == null) {
            e3 = new e();
        }
        e3.a = -e2.a;
        e3.b = -e2.b;
        e3.c = -e2.c;
        e3.d = e2.d;
        return e3;
    }

    public j c() {
        return org.lwjgl.util.e.e.c(this, this);
    }

    public j a(FloatBuffer floatBuffer) {
        this.a = floatBuffer.get();
        this.b = floatBuffer.get();
        this.c = floatBuffer.get();
        this.d = floatBuffer.get();
        return this;
    }

    public j a(float f2) {
        return org.lwjgl.util.e.e.a(f2, this, this);
    }

    public static e a(float f2, e e2, e e3) {
        if (e3 == null) {
            e3 = new e();
        }
        e3.a = e2.a * f2;
        e3.b = e2.b * f2;
        e3.c = e2.c * f2;
        e3.d = e2.d * f2;
        return e3;
    }

    public j b(FloatBuffer floatBuffer) {
        floatBuffer.put(this.a);
        floatBuffer.put(this.b);
        floatBuffer.put(this.c);
        floatBuffer.put(this.d);
        return this;
    }

    public final float d() {
        return this.a;
    }

    public final float e() {
        return this.b;
    }

    public final void b(float f2) {
        this.a = f2;
    }

    public final void c(float f2) {
        this.b = f2;
    }

    public void d(float f2) {
        this.c = f2;
    }

    public float f() {
        return this.c;
    }

    public void e(float f2) {
        this.d = f2;
    }

    public float g() {
        return this.d;
    }

    public String toString() {
        return "Quaternion: " + this.a + " " + this.b + " " + this.c + " " + this.d;
    }

    public static e a(e e2, e e3, e e4) {
        if (e4 == null) {
            e4 = new e();
        }
        e4.a(e2.a * e3.d + e2.d * e3.a + e2.b * e3.c - e2.c * e3.b, e2.b * e3.d + e2.d * e3.b + e2.c * e3.a - e2.a * e3.c, e2.c * e3.d + e2.d * e3.c + e2.a * e3.b - e2.b * e3.a, e2.d * e3.d - e2.a * e3.a - e2.b * e3.b - e2.c * e3.c);
        return e4;
    }

    public static e b(e e2, e e3, e e4) {
        float f2 = e3.b();
        float f3 = f2 = (double)f2 == 0.0 ? f2 : 1.0f / f2;
        if (e4 == null) {
            e4 = new e();
        }
        e4.a((e2.a * e3.d - e2.d * e3.a - e2.b * e3.c + e2.c * e3.b) * f2, (e2.b * e3.d - e2.d * e3.b - e2.c * e3.a + e2.a * e3.c) * f2, (e2.c * e3.d - e2.d * e3.c - e2.a * e3.b + e2.b * e3.a) * f2, (e2.d * e3.d + e2.a * e3.a + e2.b * e3.b + e2.c * e3.c) * f2);
        return e4;
    }

    public final void a(m m2) {
        this.a = m2.a;
        this.b = m2.b;
        this.c = m2.c;
        float f2 = (float)Math.sqrt(this.a * this.a + this.b * this.b + this.c * this.c);
        float f3 = (float)(Math.sin(0.5 * (double)m2.d) / (double)f2);
        this.a *= f3;
        this.b *= f3;
        this.c *= f3;
        this.d = (float)Math.cos(0.5 * (double)m2.d);
    }

    public final e a(d d2) {
        return org.lwjgl.util.e.e.a(d2, this);
    }

    public static e a(d d2, e e2) {
        return e2.a(d2.a, d2.b, d2.c, d2.e, d2.f, d2.g, d2.i, d2.j, d2.k);
    }

    public final e a(c c2) {
        return org.lwjgl.util.e.e.a(c2, this);
    }

    public static e a(c c2, e e2) {
        return e2.a(c2.a, c2.b, c2.c, c2.d, c2.e, c2.f, c2.g, c2.h, c2.i);
    }

    private e a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        float f11 = f2 + f6 + f10;
        if ((double)f11 >= 0.0) {
            float f12 = (float)Math.sqrt((double)f11 + 1.0);
            this.d = f12 * 0.5f;
            f12 = 0.5f / f12;
            this.a = (f9 - f7) * f12;
            this.b = (f4 - f8) * f12;
            this.c = (f5 - f3) * f12;
        } else {
            float f13 = Math.max(Math.max(f2, f6), f10);
            if (f13 == f2) {
                float f14 = (float)Math.sqrt((double)(f2 - (f6 + f10)) + 1.0);
                this.a = f14 * 0.5f;
                f14 = 0.5f / f14;
                this.b = (f3 + f5) * f14;
                this.c = (f8 + f4) * f14;
                this.d = (f9 - f7) * f14;
            } else if (f13 == f6) {
                float f15 = (float)Math.sqrt((double)(f6 - (f10 + f2)) + 1.0);
                this.b = f15 * 0.5f;
                f15 = 0.5f / f15;
                this.c = (f7 + f9) * f15;
                this.a = (f3 + f5) * f15;
                this.d = (f4 - f8) * f15;
            } else {
                float f16 = (float)Math.sqrt((double)(f10 - (f2 + f6)) + 1.0);
                this.c = f16 * 0.5f;
                f16 = 0.5f / f16;
                this.a = (f8 + f4) * f16;
                this.b = (f7 + f9) * f16;
                this.d = (f5 - f3) * f16;
            }
        }
        return this;
    }
}

