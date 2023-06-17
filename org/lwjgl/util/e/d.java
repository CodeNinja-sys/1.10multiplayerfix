/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.e;

import java.io.Serializable;
import java.nio.FloatBuffer;
import org.lwjgl.util.e.a;
import org.lwjgl.util.e.k;
import org.lwjgl.util.e.l;
import org.lwjgl.util.e.m;

public class d
extends a
implements Serializable {
    private static final long q = 1L;
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;

    public d() {
        this.a();
    }

    public d(d d2) {
        this.c(d2);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a).append(' ').append(this.e).append(' ').append(this.i).append(' ').append(this.m).append('\n');
        stringBuilder.append(this.b).append(' ').append(this.f).append(' ').append(this.j).append(' ').append(this.n).append('\n');
        stringBuilder.append(this.c).append(' ').append(this.g).append(' ').append(this.k).append(' ').append(this.o).append('\n');
        stringBuilder.append(this.d).append(' ').append(this.h).append(' ').append(this.l).append(' ').append(this.p).append('\n');
        return stringBuilder.toString();
    }

    public a a() {
        return org.lwjgl.util.e.d.a(this);
    }

    public static d a(d d2) {
        d2.a = 1.0f;
        d2.b = 0.0f;
        d2.c = 0.0f;
        d2.d = 0.0f;
        d2.e = 0.0f;
        d2.f = 1.0f;
        d2.g = 0.0f;
        d2.h = 0.0f;
        d2.i = 0.0f;
        d2.j = 0.0f;
        d2.k = 1.0f;
        d2.l = 0.0f;
        d2.m = 0.0f;
        d2.n = 0.0f;
        d2.o = 0.0f;
        d2.p = 1.0f;
        return d2;
    }

    public a e() {
        return org.lwjgl.util.e.d.b(this);
    }

    public static d b(d d2) {
        d2.a = 0.0f;
        d2.b = 0.0f;
        d2.c = 0.0f;
        d2.d = 0.0f;
        d2.e = 0.0f;
        d2.f = 0.0f;
        d2.g = 0.0f;
        d2.h = 0.0f;
        d2.i = 0.0f;
        d2.j = 0.0f;
        d2.k = 0.0f;
        d2.l = 0.0f;
        d2.m = 0.0f;
        d2.n = 0.0f;
        d2.o = 0.0f;
        d2.p = 0.0f;
        return d2;
    }

    public d c(d d2) {
        return org.lwjgl.util.e.d.a(d2, this);
    }

    public static d a(d d2, d d3) {
        if (d3 == null) {
            d3 = new d();
        }
        d3.a = d2.a;
        d3.b = d2.b;
        d3.c = d2.c;
        d3.d = d2.d;
        d3.e = d2.e;
        d3.f = d2.f;
        d3.g = d2.g;
        d3.h = d2.h;
        d3.i = d2.i;
        d3.j = d2.j;
        d3.k = d2.k;
        d3.l = d2.l;
        d3.m = d2.m;
        d3.n = d2.n;
        d3.o = d2.o;
        d3.p = d2.p;
        return d3;
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
        this.j = floatBuffer.get();
        this.k = floatBuffer.get();
        this.l = floatBuffer.get();
        this.m = floatBuffer.get();
        this.n = floatBuffer.get();
        this.o = floatBuffer.get();
        this.p = floatBuffer.get();
        return this;
    }

    public a b(FloatBuffer floatBuffer) {
        this.a = floatBuffer.get();
        this.e = floatBuffer.get();
        this.i = floatBuffer.get();
        this.m = floatBuffer.get();
        this.b = floatBuffer.get();
        this.f = floatBuffer.get();
        this.j = floatBuffer.get();
        this.n = floatBuffer.get();
        this.c = floatBuffer.get();
        this.g = floatBuffer.get();
        this.k = floatBuffer.get();
        this.o = floatBuffer.get();
        this.d = floatBuffer.get();
        this.h = floatBuffer.get();
        this.l = floatBuffer.get();
        this.p = floatBuffer.get();
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
        floatBuffer.put(this.j);
        floatBuffer.put(this.k);
        floatBuffer.put(this.l);
        floatBuffer.put(this.m);
        floatBuffer.put(this.n);
        floatBuffer.put(this.o);
        floatBuffer.put(this.p);
        return this;
    }

    public a d(FloatBuffer floatBuffer) {
        floatBuffer.put(this.a);
        floatBuffer.put(this.e);
        floatBuffer.put(this.i);
        floatBuffer.put(this.m);
        floatBuffer.put(this.b);
        floatBuffer.put(this.f);
        floatBuffer.put(this.j);
        floatBuffer.put(this.n);
        floatBuffer.put(this.c);
        floatBuffer.put(this.g);
        floatBuffer.put(this.k);
        floatBuffer.put(this.o);
        floatBuffer.put(this.d);
        floatBuffer.put(this.h);
        floatBuffer.put(this.l);
        floatBuffer.put(this.p);
        return this;
    }

    public a e(FloatBuffer floatBuffer) {
        floatBuffer.put(this.a);
        floatBuffer.put(this.b);
        floatBuffer.put(this.c);
        floatBuffer.put(this.e);
        floatBuffer.put(this.f);
        floatBuffer.put(this.g);
        floatBuffer.put(this.i);
        floatBuffer.put(this.j);
        floatBuffer.put(this.k);
        return this;
    }

    public static d a(d d2, d d3, d d4) {
        if (d4 == null) {
            d4 = new d();
        }
        d4.a = d2.a + d3.a;
        d4.b = d2.b + d3.b;
        d4.c = d2.c + d3.c;
        d4.d = d2.d + d3.d;
        d4.e = d2.e + d3.e;
        d4.f = d2.f + d3.f;
        d4.g = d2.g + d3.g;
        d4.h = d2.h + d3.h;
        d4.i = d2.i + d3.i;
        d4.j = d2.j + d3.j;
        d4.k = d2.k + d3.k;
        d4.l = d2.l + d3.l;
        d4.m = d2.m + d3.m;
        d4.n = d2.n + d3.n;
        d4.o = d2.o + d3.o;
        d4.p = d2.p + d3.p;
        return d4;
    }

    public static d b(d d2, d d3, d d4) {
        if (d4 == null) {
            d4 = new d();
        }
        d4.a = d2.a - d3.a;
        d4.b = d2.b - d3.b;
        d4.c = d2.c - d3.c;
        d4.d = d2.d - d3.d;
        d4.e = d2.e - d3.e;
        d4.f = d2.f - d3.f;
        d4.g = d2.g - d3.g;
        d4.h = d2.h - d3.h;
        d4.i = d2.i - d3.i;
        d4.j = d2.j - d3.j;
        d4.k = d2.k - d3.k;
        d4.l = d2.l - d3.l;
        d4.m = d2.m - d3.m;
        d4.n = d2.n - d3.n;
        d4.o = d2.o - d3.o;
        d4.p = d2.p - d3.p;
        return d4;
    }

    public static d c(d d2, d d3, d d4) {
        if (d4 == null) {
            d4 = new d();
        }
        float f2 = d2.a * d3.a + d2.e * d3.b + d2.i * d3.c + d2.m * d3.d;
        float f3 = d2.b * d3.a + d2.f * d3.b + d2.j * d3.c + d2.n * d3.d;
        float f4 = d2.c * d3.a + d2.g * d3.b + d2.k * d3.c + d2.o * d3.d;
        float f5 = d2.d * d3.a + d2.h * d3.b + d2.l * d3.c + d2.p * d3.d;
        float f6 = d2.a * d3.e + d2.e * d3.f + d2.i * d3.g + d2.m * d3.h;
        float f7 = d2.b * d3.e + d2.f * d3.f + d2.j * d3.g + d2.n * d3.h;
        float f8 = d2.c * d3.e + d2.g * d3.f + d2.k * d3.g + d2.o * d3.h;
        float f9 = d2.d * d3.e + d2.h * d3.f + d2.l * d3.g + d2.p * d3.h;
        float f10 = d2.a * d3.i + d2.e * d3.j + d2.i * d3.k + d2.m * d3.l;
        float f11 = d2.b * d3.i + d2.f * d3.j + d2.j * d3.k + d2.n * d3.l;
        float f12 = d2.c * d3.i + d2.g * d3.j + d2.k * d3.k + d2.o * d3.l;
        float f13 = d2.d * d3.i + d2.h * d3.j + d2.l * d3.k + d2.p * d3.l;
        float f14 = d2.a * d3.m + d2.e * d3.n + d2.i * d3.o + d2.m * d3.p;
        float f15 = d2.b * d3.m + d2.f * d3.n + d2.j * d3.o + d2.n * d3.p;
        float f16 = d2.c * d3.m + d2.g * d3.n + d2.k * d3.o + d2.o * d3.p;
        float f17 = d2.d * d3.m + d2.h * d3.n + d2.l * d3.o + d2.p * d3.p;
        d4.a = f2;
        d4.b = f3;
        d4.c = f4;
        d4.d = f5;
        d4.e = f6;
        d4.f = f7;
        d4.g = f8;
        d4.h = f9;
        d4.i = f10;
        d4.j = f11;
        d4.k = f12;
        d4.l = f13;
        d4.m = f14;
        d4.n = f15;
        d4.o = f16;
        d4.p = f17;
        return d4;
    }

    public static m a(d d2, m m2, m m3) {
        if (m3 == null) {
            m3 = new m();
        }
        float f2 = d2.a * m2.a + d2.e * m2.b + d2.i * m2.c + d2.m * m2.d;
        float f3 = d2.b * m2.a + d2.f * m2.b + d2.j * m2.c + d2.n * m2.d;
        float f4 = d2.c * m2.a + d2.g * m2.b + d2.k * m2.c + d2.o * m2.d;
        float f5 = d2.d * m2.a + d2.h * m2.b + d2.l * m2.c + d2.p * m2.d;
        m3.a = f2;
        m3.b = f3;
        m3.c = f4;
        m3.d = f5;
        return m3;
    }

    public a d() {
        return this.d(this);
    }

    public d a(k k2) {
        return this.a(k2, this);
    }

    public d a(l l2) {
        return this.a(l2, this);
    }

    public d b(l l2) {
        return org.lwjgl.util.e.d.a(l2, this, this);
    }

    public static d a(l l2, d d2, d d3) {
        if (d3 == null) {
            d3 = new d();
        }
        d3.a = d2.a * l2.a;
        d3.b = d2.b * l2.a;
        d3.c = d2.c * l2.a;
        d3.d = d2.d * l2.a;
        d3.e = d2.e * l2.b;
        d3.f = d2.f * l2.b;
        d3.g = d2.g * l2.b;
        d3.h = d2.h * l2.b;
        d3.i = d2.i * l2.c;
        d3.j = d2.j * l2.c;
        d3.k = d2.k * l2.c;
        d3.l = d2.l * l2.c;
        return d3;
    }

    public d a(float f2, l l2) {
        return this.a(f2, l2, this);
    }

    public d a(float f2, l l2, d d2) {
        return org.lwjgl.util.e.d.a(f2, l2, this, d2);
    }

    public static d a(float f2, l l2, d d2, d d3) {
        if (d3 == null) {
            d3 = new d();
        }
        float f3 = (float)Math.cos(f2);
        float f4 = (float)Math.sin(f2);
        float f5 = 1.0f - f3;
        float f6 = l2.a * l2.b;
        float f7 = l2.b * l2.c;
        float f8 = l2.a * l2.c;
        float f9 = l2.a * f4;
        float f10 = l2.b * f4;
        float f11 = l2.c * f4;
        float f12 = l2.a * l2.a * f5 + f3;
        float f13 = f6 * f5 + f11;
        float f14 = f8 * f5 - f10;
        float f15 = f6 * f5 - f11;
        float f16 = l2.b * l2.b * f5 + f3;
        float f17 = f7 * f5 + f9;
        float f18 = f8 * f5 + f10;
        float f19 = f7 * f5 - f9;
        float f20 = l2.c * l2.c * f5 + f3;
        float f21 = d2.a * f12 + d2.e * f13 + d2.i * f14;
        float f22 = d2.b * f12 + d2.f * f13 + d2.j * f14;
        float f23 = d2.c * f12 + d2.g * f13 + d2.k * f14;
        float f24 = d2.d * f12 + d2.h * f13 + d2.l * f14;
        float f25 = d2.a * f15 + d2.e * f16 + d2.i * f17;
        float f26 = d2.b * f15 + d2.f * f16 + d2.j * f17;
        float f27 = d2.c * f15 + d2.g * f16 + d2.k * f17;
        float f28 = d2.d * f15 + d2.h * f16 + d2.l * f17;
        d3.i = d2.a * f18 + d2.e * f19 + d2.i * f20;
        d3.j = d2.b * f18 + d2.f * f19 + d2.j * f20;
        d3.k = d2.c * f18 + d2.g * f19 + d2.k * f20;
        d3.l = d2.d * f18 + d2.h * f19 + d2.l * f20;
        d3.a = f21;
        d3.b = f22;
        d3.c = f23;
        d3.d = f24;
        d3.e = f25;
        d3.f = f26;
        d3.g = f27;
        d3.h = f28;
        return d3;
    }

    public d a(l l2, d d2) {
        return org.lwjgl.util.e.d.b(l2, this, d2);
    }

    public static d b(l l2, d d2, d d3) {
        if (d3 == null) {
            d3 = new d();
        }
        d3.m += d2.a * l2.a + d2.e * l2.b + d2.i * l2.c;
        d3.n += d2.b * l2.a + d2.f * l2.b + d2.j * l2.c;
        d3.o += d2.c * l2.a + d2.g * l2.b + d2.k * l2.c;
        d3.p += d2.d * l2.a + d2.h * l2.b + d2.l * l2.c;
        return d3;
    }

    public d a(k k2, d d2) {
        return org.lwjgl.util.e.d.a(k2, this, d2);
    }

    public static d a(k k2, d d2, d d3) {
        if (d3 == null) {
            d3 = new d();
        }
        d3.m += d2.a * k2.a + d2.e * k2.b;
        d3.n += d2.b * k2.a + d2.f * k2.b;
        d3.o += d2.c * k2.a + d2.g * k2.b;
        d3.p += d2.d * k2.a + d2.h * k2.b;
        return d3;
    }

    public d d(d d2) {
        return org.lwjgl.util.e.d.b(this, d2);
    }

    public static d b(d d2, d d3) {
        if (d3 == null) {
            d3 = new d();
        }
        float f2 = d2.a;
        float f3 = d2.e;
        float f4 = d2.i;
        float f5 = d2.m;
        float f6 = d2.b;
        float f7 = d2.f;
        float f8 = d2.j;
        float f9 = d2.n;
        float f10 = d2.c;
        float f11 = d2.g;
        float f12 = d2.k;
        float f13 = d2.o;
        float f14 = d2.d;
        float f15 = d2.h;
        float f16 = d2.l;
        float f17 = d2.p;
        d3.a = f2;
        d3.b = f3;
        d3.c = f4;
        d3.d = f5;
        d3.e = f6;
        d3.f = f7;
        d3.g = f8;
        d3.h = f9;
        d3.i = f10;
        d3.j = f11;
        d3.k = f12;
        d3.l = f13;
        d3.m = f14;
        d3.n = f15;
        d3.o = f16;
        d3.p = f17;
        return d3;
    }

    public float f() {
        float f2 = this.a * (this.f * this.k * this.p + this.g * this.l * this.n + this.h * this.j * this.o - this.h * this.k * this.n - this.f * this.l * this.o - this.g * this.j * this.p);
        f2 -= this.b * (this.e * this.k * this.p + this.g * this.l * this.m + this.h * this.i * this.o - this.h * this.k * this.m - this.e * this.l * this.o - this.g * this.i * this.p);
        f2 += this.c * (this.e * this.j * this.p + this.f * this.l * this.m + this.h * this.i * this.n - this.h * this.j * this.m - this.e * this.l * this.n - this.f * this.i * this.p);
        return f2 -= this.d * (this.e * this.j * this.o + this.f * this.k * this.m + this.g * this.i * this.n - this.g * this.j * this.m - this.e * this.k * this.n - this.f * this.i * this.o);
    }

    private static float a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        return f2 * (f6 * f10 - f7 * f9) + f3 * (f7 * f8 - f5 * f10) + f4 * (f5 * f9 - f6 * f8);
    }

    public a b() {
        return org.lwjgl.util.e.d.c(this, this);
    }

    public static d c(d d2, d d3) {
        float f2 = d2.f();
        if (f2 != 0.0f) {
            if (d3 == null) {
                d3 = new d();
            }
            float f3 = 1.0f / f2;
            float f4 = org.lwjgl.util.e.d.a(d2.f, d2.g, d2.h, d2.j, d2.k, d2.l, d2.n, d2.o, d2.p);
            float f5 = -org.lwjgl.util.e.d.a(d2.e, d2.g, d2.h, d2.i, d2.k, d2.l, d2.m, d2.o, d2.p);
            float f6 = org.lwjgl.util.e.d.a(d2.e, d2.f, d2.h, d2.i, d2.j, d2.l, d2.m, d2.n, d2.p);
            float f7 = -org.lwjgl.util.e.d.a(d2.e, d2.f, d2.g, d2.i, d2.j, d2.k, d2.m, d2.n, d2.o);
            float f8 = -org.lwjgl.util.e.d.a(d2.b, d2.c, d2.d, d2.j, d2.k, d2.l, d2.n, d2.o, d2.p);
            float f9 = org.lwjgl.util.e.d.a(d2.a, d2.c, d2.d, d2.i, d2.k, d2.l, d2.m, d2.o, d2.p);
            float f10 = -org.lwjgl.util.e.d.a(d2.a, d2.b, d2.d, d2.i, d2.j, d2.l, d2.m, d2.n, d2.p);
            float f11 = org.lwjgl.util.e.d.a(d2.a, d2.b, d2.c, d2.i, d2.j, d2.k, d2.m, d2.n, d2.o);
            float f12 = org.lwjgl.util.e.d.a(d2.b, d2.c, d2.d, d2.f, d2.g, d2.h, d2.n, d2.o, d2.p);
            float f13 = -org.lwjgl.util.e.d.a(d2.a, d2.c, d2.d, d2.e, d2.g, d2.h, d2.m, d2.o, d2.p);
            float f14 = org.lwjgl.util.e.d.a(d2.a, d2.b, d2.d, d2.e, d2.f, d2.h, d2.m, d2.n, d2.p);
            float f15 = -org.lwjgl.util.e.d.a(d2.a, d2.b, d2.c, d2.e, d2.f, d2.g, d2.m, d2.n, d2.o);
            float f16 = -org.lwjgl.util.e.d.a(d2.b, d2.c, d2.d, d2.f, d2.g, d2.h, d2.j, d2.k, d2.l);
            float f17 = org.lwjgl.util.e.d.a(d2.a, d2.c, d2.d, d2.e, d2.g, d2.h, d2.i, d2.k, d2.l);
            float f18 = -org.lwjgl.util.e.d.a(d2.a, d2.b, d2.d, d2.e, d2.f, d2.h, d2.i, d2.j, d2.l);
            float f19 = org.lwjgl.util.e.d.a(d2.a, d2.b, d2.c, d2.e, d2.f, d2.g, d2.i, d2.j, d2.k);
            d3.a = f4 * f3;
            d3.f = f9 * f3;
            d3.k = f14 * f3;
            d3.p = f19 * f3;
            d3.b = f8 * f3;
            d3.e = f5 * f3;
            d3.i = f6 * f3;
            d3.c = f12 * f3;
            d3.g = f13 * f3;
            d3.j = f10 * f3;
            d3.d = f16 * f3;
            d3.m = f7 * f3;
            d3.h = f17 * f3;
            d3.n = f11 * f3;
            d3.o = f15 * f3;
            d3.l = f18 * f3;
            return d3;
        }
        return null;
    }

    public a c() {
        return this.e(this);
    }

    public d e(d d2) {
        return org.lwjgl.util.e.d.d(this, d2);
    }

    public static d d(d d2, d d3) {
        if (d3 == null) {
            d3 = new d();
        }
        d3.a = -d2.a;
        d3.b = -d2.b;
        d3.c = -d2.c;
        d3.d = -d2.d;
        d3.e = -d2.e;
        d3.f = -d2.f;
        d3.g = -d2.g;
        d3.h = -d2.h;
        d3.i = -d2.i;
        d3.j = -d2.j;
        d3.k = -d2.k;
        d3.l = -d2.l;
        d3.m = -d2.m;
        d3.n = -d2.n;
        d3.o = -d2.o;
        d3.p = -d2.p;
        return d3;
    }
}

