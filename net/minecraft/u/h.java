/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.u.b.n;

public class h {
    public static float a(float f2, float f3, float f4) {
        float f5 = 2.0f + f4 / 4.0f;
        float f6 = n.a(f3 - f2 / f5, f3 * 0.2f, 20.0f);
        return f2 * (1.0f - f6 / 25.0f);
    }

    public static float a(float f2, float f3) {
        float f4 = n.a(f3, 0.0f, 20.0f);
        return f2 * (1.0f - f4 / 25.0f);
    }
}

