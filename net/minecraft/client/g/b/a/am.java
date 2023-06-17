/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import net.minecraft.client.g.b.a.y;
import net.minecraft.u.bp;

public class am {
    private final bp a;
    private final y b;
    private final boolean c;
    private final int d;

    public am(bp bp2, y y2, boolean bl2, int n2) {
        this.a = bp2;
        this.b = y2;
        this.c = bl2;
        this.d = n2;
    }

    public bp a() {
        return this.a;
    }

    public y b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public String toString() {
        return "Variant{modelLocation=" + this.a + ", rotation=" + (Object)((Object)this.b) + ", uvLock=" + this.c + ", weight=" + this.d + '}';
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof am)) {
            return false;
        }
        am am2 = (am)object;
        return this.a.equals(am2.a) && this.b == am2.b && this.c == am2.c && this.d == am2.d;
    }

    public int hashCode() {
        int n2 = this.a.hashCode();
        n2 = 31 * n2 + this.b.hashCode();
        n2 = 31 * n2 + Boolean.valueOf(this.c).hashCode();
        n2 = 31 * n2 + this.d;
        return n2;
    }
}

