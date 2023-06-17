/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.a;

import net.minecraft.x.a.m;

public class g {
    private final int a;
    private final m b;

    public g(int n2, m m2) {
        this.a = n2;
        this.b = m2;
    }

    public int a() {
        return this.a;
    }

    public m b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            g g2 = (g)object;
            return this.a == g2.a;
        }
        return false;
    }

    public int hashCode() {
        return this.a;
    }
}

