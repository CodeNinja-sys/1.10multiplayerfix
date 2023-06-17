/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.g.cn;
import net.minecraft.u.b.b;

public class bs {
    private final b a;
    private final cn b;
    private final int c;
    private final int d;

    public bs(b b2, cn cn2, int n2, int n3) {
        this.a = b2;
        this.c = n2;
        this.d = n3;
        this.b = cn2;
    }

    public b a() {
        return this.a;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public cn d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (!(object instanceof bs)) {
            return false;
        }
        bs bs2 = (bs)object;
        return this.a.equals(bs2.a) && this.c == bs2.c && this.d == bs2.d && this.b == bs2.b;
    }

    public String toString() {
        return "TE(" + this.a + ")," + this.c + "," + this.d + "," + this.b;
    }
}

