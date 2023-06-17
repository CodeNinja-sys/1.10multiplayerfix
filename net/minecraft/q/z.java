/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import net.minecraft.q.l;
import net.minecraft.u.b.n;

public class z {
    private final l a;
    private final float b;

    public z(l l2, long l3, long l4, float f2) {
        this.a = l2;
        this.b = this.a(l2, l3, l4, f2);
    }

    public float a() {
        return this.b;
    }

    public boolean b() {
        return this.b >= (float)l.d.ordinal();
    }

    public float c() {
        return this.b < 2.0f ? 0.0f : (this.b > 4.0f ? 1.0f : (this.b - 2.0f) / 2.0f);
    }

    private float a(l l2, long l3, long l4, float f2) {
        if (l2 == l.a) {
            return 0.0f;
        }
        boolean bl2 = l2 == l.d;
        float f3 = 0.75f;
        float f4 = n.a(((float)l3 + -72000.0f) / 1440000.0f, 0.0f, 1.0f) * 0.25f;
        f3 += f4;
        float f5 = 0.0f;
        f5 += n.a((float)l4 / 3600000.0f, 0.0f, 1.0f) * (bl2 ? 1.0f : 0.75f);
        f5 += n.a(f2 * 0.25f, 0.0f, f4);
        if (l2 == l.b) {
            f5 *= 0.5f;
        }
        return (float)l2.a() * (f3 += f5);
    }
}

