/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import net.minecraft.g.cn;
import net.minecraft.u.b.b;

public class as
implements Comparable {
    private static long d;
    private final cn e;
    public final b a;
    public long b;
    public int c;
    private final long f = d++;

    public as(b b2, cn cn2) {
        this.a = b2;
        this.e = cn2;
    }

    public boolean equals(Object object) {
        if (!(object instanceof as)) {
            return false;
        }
        as as2 = (as)object;
        return this.a.equals(as2.a) && cn.a(this.e, as2.e);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public as a(long l2) {
        this.b = l2;
        return this;
    }

    public void a(int n2) {
        this.c = n2;
    }

    public int a(as as2) {
        return this.b < as2.b ? -1 : (this.b > as2.b ? 1 : (this.c != as2.c ? this.c - as2.c : (this.f < as2.f ? -1 : (this.f > as2.f ? 1 : 0))));
    }

    public String toString() {
        return String.valueOf(cn.c(this.e)) + ": " + this.a + ", " + this.b + ", " + this.c + ", " + this.f;
    }

    public cn a() {
        return this.e;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((as)object);
    }
}

