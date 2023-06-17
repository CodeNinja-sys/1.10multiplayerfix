/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.e;

import java.io.Serializable;
import java.nio.FloatBuffer;
import org.lwjgl.util.e.g;
import org.lwjgl.util.e.j;
import org.lwjgl.util.e.n;

public class k
extends j
implements Serializable,
g,
n {
    private static final long c = 1L;
    public float a;
    public float b;

    public k() {
    }

    public k(g g2) {
        this.a(g2);
    }

    public k(float f2, float f3) {
        this.a(f2, f3);
    }

    public void a(float f2, float f3) {
        this.a = f2;
        this.b = f3;
    }

    public k a(g g2) {
        this.a = g2.d();
        this.b = g2.e();
        return this;
    }

    public float b() {
        return this.a * this.a + this.b * this.b;
    }

    public k b(float f2, float f3) {
        this.a += f2;
        this.b += f3;
        return this;
    }

    public j c() {
        this.a = -this.a;
        this.b = -this.b;
        return this;
    }

    public k a(k k2) {
        if (k2 == null) {
            k2 = new k();
        }
        k2.a = -this.a;
        k2.b = -this.b;
        return k2;
    }

    public k b(k k2) {
        float f2 = this.h();
        if (k2 == null) {
            k2 = new k(this.a / f2, this.b / f2);
        } else {
            k2.a(this.a / f2, this.b / f2);
        }
        return k2;
    }

    public static float a(k k2, k k3) {
        return k2.a * k3.a + k2.b * k3.b;
    }

    public static float b(k k2, k k3) {
        float f2 = k.a(k2, k3) / (k2.h() * k3.h());
        if (f2 < -1.0f) {
            f2 = -1.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return (float)Math.acos(f2);
    }

    public static k a(k k2, k k3, k k4) {
        if (k4 == null) {
            return new k(k2.a + k3.a, k2.b + k3.b);
        }
        k4.a(k2.a + k3.a, k2.b + k3.b);
        return k4;
    }

    public static k b(k k2, k k3, k k4) {
        if (k4 == null) {
            return new k(k2.a - k3.a, k2.b - k3.b);
        }
        k4.a(k2.a - k3.a, k2.b - k3.b);
        return k4;
    }

    public j b(FloatBuffer floatBuffer) {
        floatBuffer.put(this.a);
        floatBuffer.put(this.b);
        return this;
    }

    public j a(FloatBuffer floatBuffer) {
        this.a = floatBuffer.get();
        this.b = floatBuffer.get();
        return this;
    }

    public j a(float f2) {
        this.a *= f2;
        this.b *= f2;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append("Vector2f[");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
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
        k k2 = (k)object;
        return this.a == k2.a && this.b == k2.b;
    }
}

