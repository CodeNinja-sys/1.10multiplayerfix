/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.e;

import java.io.Serializable;
import java.nio.FloatBuffer;
import org.lwjgl.util.e.h;
import org.lwjgl.util.e.j;
import org.lwjgl.util.e.o;

public class l
extends j
implements Serializable,
h,
o {
    private static final long d = 1L;
    public float a;
    public float b;
    public float c;

    public l() {
    }

    public l(h h2) {
        this.a(h2);
    }

    public l(float f2, float f3, float f4) {
        this.a(f2, f3, f4);
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

    public l a(h h2) {
        this.a = h2.d();
        this.b = h2.e();
        this.c = h2.f();
        return this;
    }

    public float b() {
        return this.a * this.a + this.b * this.b + this.c * this.c;
    }

    public l b(float f2, float f3, float f4) {
        this.a += f2;
        this.b += f3;
        this.c += f4;
        return this;
    }

    public static l a(l l2, l l3, l l4) {
        if (l4 == null) {
            return new l(l2.a + l3.a, l2.b + l3.b, l2.c + l3.c);
        }
        l4.a(l2.a + l3.a, l2.b + l3.b, l2.c + l3.c);
        return l4;
    }

    public static l b(l l2, l l3, l l4) {
        if (l4 == null) {
            return new l(l2.a - l3.a, l2.b - l3.b, l2.c - l3.c);
        }
        l4.a(l2.a - l3.a, l2.b - l3.b, l2.c - l3.c);
        return l4;
    }

    public static l c(l l2, l l3, l l4) {
        if (l4 == null) {
            l4 = new l();
        }
        l4.a(l2.b * l3.c - l2.c * l3.b, l3.a * l2.c - l3.c * l2.a, l2.a * l3.b - l2.b * l3.a);
        return l4;
    }

    public j c() {
        this.a = -this.a;
        this.b = -this.b;
        this.c = -this.c;
        return this;
    }

    public l a(l l2) {
        if (l2 == null) {
            l2 = new l();
        }
        l2.a = -this.a;
        l2.b = -this.b;
        l2.c = -this.c;
        return l2;
    }

    public l b(l l2) {
        float f2 = this.h();
        if (l2 == null) {
            l2 = new l(this.a / f2, this.b / f2, this.c / f2);
        } else {
            l2.a(this.a / f2, this.b / f2, this.c / f2);
        }
        return l2;
    }

    public static float a(l l2, l l3) {
        return l2.a * l3.a + l2.b * l3.b + l2.c * l3.c;
    }

    public static float b(l l2, l l3) {
        float f2 = l.a(l2, l3) / (l2.h() * l3.h());
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
        return this;
    }

    public j a(float f2) {
        this.a *= f2;
        this.b *= f2;
        this.c *= f2;
        return this;
    }

    public j b(FloatBuffer floatBuffer) {
        floatBuffer.put(this.a);
        floatBuffer.put(this.b);
        floatBuffer.put(this.c);
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append("Vector3f[");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append(", ");
        stringBuilder.append(this.c);
        stringBuilder.append(']');
        return stringBuilder.toString();
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
        l l2 = (l)object;
        return this.a == l2.a && this.b == l2.b && this.c == l2.c;
    }
}

