/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

public final class c
implements Comparable {
    public double a;
    public double b;
    public String c;

    public c(String string, double d2, double d3) {
        this.c = string;
        this.a = d2;
        this.b = d3;
    }

    public int a(c c2) {
        return c2.a < this.a ? -1 : (c2.a > this.a ? 1 : c2.c.compareTo(this.c));
    }

    public int a() {
        return (this.c.hashCode() & 0xAAAAAA) + 0x444444;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((c)object);
    }
}

