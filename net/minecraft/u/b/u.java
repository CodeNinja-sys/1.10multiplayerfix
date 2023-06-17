/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.b;

public class u {
    private byte a;
    private byte b;
    private byte c;
    private byte d;

    public u(byte by2, byte by3, byte by4, byte by5) {
        this.a = by2;
        this.b = by3;
        this.c = by4;
        this.d = by5;
    }

    public u(u u2) {
        this.a = u2.a;
        this.b = u2.b;
        this.c = u2.c;
        this.d = u2.d;
    }

    public byte a() {
        return this.a;
    }

    public byte b() {
        return this.b;
    }

    public byte c() {
        return this.c;
    }

    public byte d() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof u)) {
            return false;
        }
        u u2 = (u)object;
        return this.a != u2.a ? false : (this.d != u2.d ? false : (this.b != u2.b ? false : this.c == u2.c));
    }

    public int hashCode() {
        int n2 = this.a;
        n2 = 31 * n2 + this.b;
        n2 = 31 * n2 + this.c;
        n2 = 31 * n2 + this.d;
        return n2;
    }
}

