/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.e;

import java.io.Serializable;
import java.nio.FloatBuffer;
import org.lwjgl.util.e.a;
import org.lwjgl.util.e.k;

public class b
extends a
implements Serializable {
    private static final long e = 1L;
    public float a;
    public float b;
    public float c;
    public float d;

    public b() {
        this.a();
    }

    public b(b b2) {
        this.a(b2);
    }

    public b a(b b2) {
        return org.lwjgl.util.e.b.a(b2, this);
    }

    public static b a(b b2, b b3) {
        if (b3 == null) {
            b3 = new b();
        }
        b3.a = b2.a;
        b3.b = b2.b;
        b3.c = b2.c;
        b3.d = b2.d;
        return b3;
    }

    public a a(FloatBuffer floatBuffer) {
        this.a = floatBuffer.get();
        this.b = floatBuffer.get();
        this.c = floatBuffer.get();
        this.d = floatBuffer.get();
        return this;
    }

    public a b(FloatBuffer floatBuffer) {
        this.a = floatBuffer.get();
        this.c = floatBuffer.get();
        this.b = floatBuffer.get();
        this.d = floatBuffer.get();
        return this;
    }

    public a c(FloatBuffer floatBuffer) {
        floatBuffer.put(this.a);
        floatBuffer.put(this.b);
        floatBuffer.put(this.c);
        floatBuffer.put(this.d);
        return this;
    }

    public a d(FloatBuffer floatBuffer) {
        floatBuffer.put(this.a);
        floatBuffer.put(this.c);
        floatBuffer.put(this.b);
        floatBuffer.put(this.d);
        return this;
    }

    public static b a(b b2, b b3, b b4) {
        if (b4 == null) {
            b4 = new b();
        }
        b4.a = b2.a + b3.a;
        b4.b = b2.b + b3.b;
        b4.c = b2.c + b3.c;
        b4.d = b2.d + b3.d;
        return b4;
    }

    public static b b(b b2, b b3, b b4) {
        if (b4 == null) {
            b4 = new b();
        }
        b4.a = b2.a - b3.a;
        b4.b = b2.b - b3.b;
        b4.c = b2.c - b3.c;
        b4.d = b2.d - b3.d;
        return b4;
    }

    public static b c(b b2, b b3, b b4) {
        if (b4 == null) {
            b4 = new b();
        }
        float f2 = b2.a * b3.a + b2.c * b3.b;
        float f3 = b2.b * b3.a + b2.d * b3.b;
        float f4 = b2.a * b3.c + b2.c * b3.d;
        float f5 = b2.b * b3.c + b2.d * b3.d;
        b4.a = f2;
        b4.b = f3;
        b4.c = f4;
        b4.d = f5;
        return b4;
    }

    public static k a(b b2, k k2, k k3) {
        if (k3 == null) {
            k3 = new k();
        }
        float f2 = b2.a * k2.a + b2.c * k2.b;
        float f3 = b2.b * k2.a + b2.d * k2.b;
        k3.a = f2;
        k3.b = f3;
        return k3;
    }

    public a d() {
        return this.b(this);
    }

    public b b(b b2) {
        return org.lwjgl.util.e.b.b(this, b2);
    }

    public static b b(b b2, b b3) {
        if (b3 == null) {
            b3 = new b();
        }
        float f2 = b2.c;
        float f3 = b2.b;
        b3.b = f2;
        b3.c = f3;
        return b3;
    }

    public a b() {
        return org.lwjgl.util.e.b.c(this, this);
    }

    public static b c(b b2, b b3) {
        float f2 = b2.f();
        if (f2 != 0.0f) {
            if (b3 == null) {
                b3 = new b();
            }
            float f3 = 1.0f / f2;
            float f4 = b2.d * f3;
            float f5 = -b2.b * f3;
            float f6 = b2.a * f3;
            float f7 = -b2.c * f3;
            b3.a = f4;
            b3.b = f5;
            b3.c = f7;
            b3.d = f6;
            return b3;
        }
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a).append(' ').append(this.c).append(' ').append('\n');
        stringBuilder.append(this.b).append(' ').append(this.d).append(' ').append('\n');
        return stringBuilder.toString();
    }

    public a c() {
        return this.c(this);
    }

    public b c(b b2) {
        return org.lwjgl.util.e.b.d(this, b2);
    }

    public static b d(b b2, b b3) {
        if (b3 == null) {
            b3 = new b();
        }
        b3.a = -b2.a;
        b3.b = -b2.b;
        b3.c = -b2.c;
        b3.d = -b2.d;
        return b3;
    }

    public a a() {
        return org.lwjgl.util.e.b.d(this);
    }

    public static b d(b b2) {
        b2.a = 1.0f;
        b2.b = 0.0f;
        b2.c = 0.0f;
        b2.d = 1.0f;
        return b2;
    }

    public a e() {
        return org.lwjgl.util.e.b.e(this);
    }

    public static b e(b b2) {
        b2.a = 0.0f;
        b2.b = 0.0f;
        b2.c = 0.0f;
        b2.d = 0.0f;
        return b2;
    }

    public float f() {
        return this.a * this.d - this.b * this.c;
    }
}

