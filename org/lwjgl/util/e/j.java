/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.e;

import java.io.Serializable;
import java.nio.FloatBuffer;
import org.lwjgl.util.e.f;

public abstract class j
implements Serializable,
f {
    protected j() {
    }

    public final float h() {
        return (float)Math.sqrt(this.b());
    }

    public abstract float b();

    public abstract j a(FloatBuffer var1);

    public abstract j c();

    public final j i() {
        float f2 = this.h();
        if (f2 != 0.0f) {
            float f3 = 1.0f / f2;
            return this.a(f3);
        }
        throw new IllegalStateException("Zero length vector");
    }

    public abstract j b(FloatBuffer var1);

    public abstract j a(float var1);
}

