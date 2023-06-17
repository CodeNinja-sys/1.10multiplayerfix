/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.e;

import java.io.Serializable;
import java.nio.FloatBuffer;
import org.lwjgl.util.e.i;
import org.lwjgl.util.e.j;
import org.lwjgl.util.e.p;

public class m
extends j
implements Serializable,
i,
p {
    private static final long e = 1L;
    public float a;
    public float b;
    public float c;
    public float d;

    public m() {
    }

    public m(i i2) {
        this.a(i2);
    }

    public m(float f2, float f3, float f4, float f5) {
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

    public m a(i i2) {
        this.a = i2.d();
        this.b = i2.e();
        this.c = i2.f();
        this.d = i2.g();
        return this;
    }

    public float b() {
        return this.a * this.a + this.b * this.b + this.c * this.c + this.d * this.d;
    }

    public m b(float f2, float f3, float f4, float f5) {
        this.a += f2;
        this.b += f3;
        this.c += f4;
        this.d += f5;
        return this;
    }

    public static m a(m m2, m m3, m m4) {
        if (m4 == null) {
            return new m(m2.a + m3.a, m2.b + m3.b, m2.c + m3.c, m2.d + m3.d);
        }
        m4.a(m2.a + m3.a, m2.b + m3.b, m2.c + m3.c, m2.d + m3.d);
        return m4;
    }

    public static m b(m m2, m m3, m m4) {
        if (m4 == null) {
            return new m(m2.a - m3.a, m2.b - m3.b, m2.c - m3.c, m2.d - m3.d);
        }
        m4.a(m2.a - m3.a, m2.b - m3.b, m2.c - m3.c, m2.d - m3.d);
        return m4;
    }

    public j c() {
        this.a = -this.a;
        this.b = -this.b;
        this.c = -this.c;
        this.d = -this.d;
        return this;
    }

    public m a(m m2) {
        if (m2 == null) {
            m2 = new m();
        }
        m2.a = -this.a;
        m2.b = -this.b;
        m2.c = -this.c;
        m2.d = -this.d;
        return m2;
    }

    public m b(m m2) {
        float f2 = this.h();
        if (m2 == null) {
            m2 = new m(this.a / f2, this.b / f2, this.c / f2, this.d / f2);
        } else {
            m2.a(this.a / f2, this.b / f2, this.c / f2, this.d / f2);
        }
        return m2;
    }

    public static float a(m m2, m m3) {
        return m2.a * m3.a + m2.b * m3.b + m2.c * m3.c + m2.d * m3.d;
    }

    public static float b(m m2, m m3) {
        float f2 = m.a(m2, m3) / (m2.h() * m3.h());
        if (f2 < -1.0f) {
            f2 = -1.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return (float)Math.acos(f2);
    }

    public j a(FloatBuffer floatBuffer) {
        this.a = floatBuffer.get();
        this.b = floatBuffer.get();
        this.c = floatBuffer.get();
        this.d = floatBuffer.get();
        return this;
    }

    public j a(float f2) {
        this.a *= f2;
        this.b *= f2;
        this.c *= f2;
        this.d *= f2;
        return this;
    }

    public j b(FloatBuffer floatBuffer) {
        floatBuffer.put(this.a);
        floatBuffer.put(this.b);
        floatBuffer.put(this.c);
        floatBuffer.put(this.d);
        return this;
    }

    public String toString() {
        return "Vector4f: " + this.a + " " + this.b + " " + this.c + " " + this.d;
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

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        m m2 = (m)object;
        return this.a == m2.a && this.b == m2.b && this.c == m2.c && this.d == m2.d;
    }
}

