/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.e;

import java.io.Serializable;
import java.nio.FloatBuffer;
import org.lwjgl.util.e.a;
import org.lwjgl.util.e.l;

public class c
extends a
implements Serializable {
    private static final long j = 1L;
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;

    public c() {
        this.a();
    }

    public c a(c c2) {
        return org.lwjgl.util.e.c.a(c2, this);
    }

    public static c a(c c2, c c3) {
        if (c3 == null) {
            c3 = new c();
        }
        c3.a = c2.a;
        c3.d = c2.d;
        c3.g = c2.g;
        c3.b = c2.b;
        c3.e = c2.e;
        c3.h = c2.h;
        c3.c = c2.c;
        c3.f = c2.f;
        c3.i = c2.i;
        return c3;
    }

    public a a(FloatBuffer floatBuffer) {
        this.a = floatBuffer.get();
        this.b = floatBuffer.get();
        this.c = floatBuffer.get();
        this.d = floatBuffer.get();
        this.e = floatBuffer.get();
        this.f = floatBuffer.get();
        this.g = floatBuffer.get();
        this.h = floatBuffer.get();
        this.i = floatBuffer.get();
        return this;
    }

    public a b(FloatBuffer floatBuffer) {
        this.a = floatBuffer.get();
        this.d = floatBuffer.get();
        this.g = floatBuffer.get();
        this.b = floatBuffer.get();
        this.e = floatBuffer.get();
        this.h = floatBuffer.get();
        this.c = floatBuffer.get();
        this.f = floatBuffer.get();
        this.i = floatBuffer.get();
        return this;
    }

    public a c(FloatBuffer floatBuffer) {
        floatBuffer.put(this.a);
        floatBuffer.put(this.b);
        floatBuffer.put(this.c);
        floatBuffer.put(this.d);
        floatBuffer.put(this.e);
        floatBuffer.put(this.f);
        floatBuffer.put(this.g);
        floatBuffer.put(this.h);
        floatBuffer.put(this.i);
        return this;
    }

    public a d(FloatBuffer floatBuffer) {
        floatBuffer.put(this.a);
        floatBuffer.put(this.d);
        floatBuffer.put(this.g);
        floatBuffer.put(this.b);
        floatBuffer.put(this.e);
        floatBuffer.put(this.h);
        floatBuffer.put(this.c);
        floatBuffer.put(this.f);
        floatBuffer.put(this.i);
        return this;
    }

    public static c a(c c2, c c3, c c4) {
        if (c4 == null) {
            c4 = new c();
        }
        c4.a = c2.a + c3.a;
        c4.b = c2.b + c3.b;
        c4.c = c2.c + c3.c;
        c4.d = c2.d + c3.d;
        c4.e = c2.e + c3.e;
        c4.f = c2.f + c3.f;
        c4.g = c2.g + c3.g;
        c4.h = c2.h + c3.h;
        c4.i = c2.i + c3.i;
        return c4;
    }

    public static c b(c c2, c c3, c c4) {
        if (c4 == null) {
            c4 = new c();
        }
        c4.a = c2.a - c3.a;
        c4.b = c2.b - c3.b;
        c4.c = c2.c - c3.c;
        c4.d = c2.d - c3.d;
        c4.e = c2.e - c3.e;
        c4.f = c2.f - c3.f;
        c4.g = c2.g - c3.g;
        c4.h = c2.h - c3.h;
        c4.i = c2.i - c3.i;
        return c4;
    }

    public static c c(c c2, c c3, c c4) {
        if (c4 == null) {
            c4 = new c();
        }
        float f2 = c2.a * c3.a + c2.d * c3.b + c2.g * c3.c;
        float f3 = c2.b * c3.a + c2.e * c3.b + c2.h * c3.c;
        float f4 = c2.c * c3.a + c2.f * c3.b + c2.i * c3.c;
        float f5 = c2.a * c3.d + c2.d * c3.e + c2.g * c3.f;
        float f6 = c2.b * c3.d + c2.e * c3.e + c2.h * c3.f;
        float f7 = c2.c * c3.d + c2.f * c3.e + c2.i * c3.f;
        float f8 = c2.a * c3.g + c2.d * c3.h + c2.g * c3.i;
        float f9 = c2.b * c3.g + c2.e * c3.h + c2.h * c3.i;
        float f10 = c2.c * c3.g + c2.f * c3.h + c2.i * c3.i;
        c4.a = f2;
        c4.b = f3;
        c4.c = f4;
        c4.d = f5;
        c4.e = f6;
        c4.f = f7;
        c4.g = f8;
        c4.h = f9;
        c4.i = f10;
        return c4;
    }

    public static l a(c c2, l l2, l l3) {
        if (l3 == null) {
            l3 = new l();
        }
        float f2 = c2.a * l2.a + c2.d * l2.b + c2.g * l2.c;
        float f3 = c2.b * l2.a + c2.e * l2.b + c2.h * l2.c;
        float f4 = c2.c * l2.a + c2.f * l2.b + c2.i * l2.c;
        l3.a = f2;
        l3.b = f3;
        l3.c = f4;
        return l3;
    }

    public a d() {
        return org.lwjgl.util.e.c.b(this, this);
    }

    public c b(c c2) {
        return org.lwjgl.util.e.c.b(this, c2);
    }

    public static c b(c c2, c c3) {
        if (c3 == null) {
            c3 = new c();
        }
        float f2 = c2.a;
        float f3 = c2.d;
        float f4 = c2.g;
        float f5 = c2.b;
        float f6 = c2.e;
        float f7 = c2.h;
        float f8 = c2.c;
        float f9 = c2.f;
        float f10 = c2.i;
        c3.a = f2;
        c3.b = f3;
        c3.c = f4;
        c3.d = f5;
        c3.e = f6;
        c3.f = f7;
        c3.g = f8;
        c3.h = f9;
        c3.i = f10;
        return c3;
    }

    public float f() {
        float f2 = this.a * (this.e * this.i - this.f * this.h) + this.b * (this.f * this.g - this.d * this.i) + this.c * (this.d * this.h - this.e * this.g);
        return f2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a).append(' ').append(this.d).append(' ').append(this.g).append(' ').append('\n');
        stringBuilder.append(this.b).append(' ').append(this.e).append(' ').append(this.h).append(' ').append('\n');
        stringBuilder.append(this.c).append(' ').append(this.f).append(' ').append(this.i).append(' ').append('\n');
        return stringBuilder.toString();
    }

    public a b() {
        return org.lwjgl.util.e.c.c(this, this);
    }

    public static c c(c c2, c c3) {
        float f2 = c2.f();
        if (f2 != 0.0f) {
            if (c3 == null) {
                c3 = new c();
            }
            float f3 = 1.0f / f2;
            float f4 = c2.e * c2.i - c2.f * c2.h;
            float f5 = -c2.d * c2.i + c2.f * c2.g;
            float f6 = c2.d * c2.h - c2.e * c2.g;
            float f7 = -c2.b * c2.i + c2.c * c2.h;
            float f8 = c2.a * c2.i - c2.c * c2.g;
            float f9 = -c2.a * c2.h + c2.b * c2.g;
            float f10 = c2.b * c2.f - c2.c * c2.e;
            float f11 = -c2.a * c2.f + c2.c * c2.d;
            float f12 = c2.a * c2.e - c2.b * c2.d;
            c3.a = f4 * f3;
            c3.e = f8 * f3;
            c3.i = f12 * f3;
            c3.b = f7 * f3;
            c3.d = f5 * f3;
            c3.g = f6 * f3;
            c3.c = f10 * f3;
            c3.f = f11 * f3;
            c3.h = f9 * f3;
            return c3;
        }
        return null;
    }

    public a c() {
        return this.c(this);
    }

    public c c(c c2) {
        return org.lwjgl.util.e.c.d(this, c2);
    }

    public static c d(c c2, c c3) {
        if (c3 == null) {
            c3 = new c();
        }
        c3.a = -c2.a;
        c3.b = -c2.c;
        c3.c = -c2.b;
        c3.d = -c2.d;
        c3.e = -c2.f;
        c3.f = -c2.e;
        c3.g = -c2.g;
        c3.h = -c2.i;
        c3.i = -c2.h;
        return c3;
    }

    public a a() {
        return org.lwjgl.util.e.c.d(this);
    }

    public static c d(c c2) {
        c2.a = 1.0f;
        c2.b = 0.0f;
        c2.c = 0.0f;
        c2.d = 0.0f;
        c2.e = 1.0f;
        c2.f = 0.0f;
        c2.g = 0.0f;
        c2.h = 0.0f;
        c2.i = 1.0f;
        return c2;
    }

    public a e() {
        return org.lwjgl.util.e.c.e(this);
    }

    public static c e(c c2) {
        c2.a = 0.0f;
        c2.b = 0.0f;
        c2.c = 0.0f;
        c2.d = 0.0f;
        c2.e = 0.0f;
        c2.f = 0.0f;
        c2.g = 0.0f;
        c2.h = 0.0f;
        c2.i = 0.0f;
        return c2;
    }
}

