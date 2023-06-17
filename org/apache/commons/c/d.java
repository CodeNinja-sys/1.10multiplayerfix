/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

public class d {
    private final int a;
    private final int b;

    public d(int n2) {
        this.a = n2;
        int n3 = 0;
        int n4 = n2;
        if (n4 != 0) {
            while ((n4 & 1) == 0) {
                ++n3;
                n4 >>= 1;
            }
        }
        this.b = n3;
    }

    public int a(int n2) {
        return this.b(n2) >> this.b;
    }

    public short a(short s2) {
        return (short)this.a((int)s2);
    }

    public int b(int n2) {
        return n2 & this.a;
    }

    public short b(short s2) {
        return (short)this.b((int)s2);
    }

    public boolean c(int n2) {
        return (n2 & this.a) != 0;
    }

    public boolean d(int n2) {
        return (n2 & this.a) == this.a;
    }

    public int a(int n2, int n3) {
        return n2 & ~this.a | n3 << this.b & this.a;
    }

    public short a(short s2, short s3) {
        return (short)this.a((int)s2, (int)s3);
    }

    public int e(int n2) {
        return n2 & ~this.a;
    }

    public short c(short s2) {
        return (short)this.e(s2);
    }

    public byte a(byte by2) {
        return (byte)this.e(by2);
    }

    public int f(int n2) {
        return n2 | this.a;
    }

    public short d(short s2) {
        return (short)this.f(s2);
    }

    public byte b(byte by2) {
        return (byte)this.f(by2);
    }

    public int a(int n2, boolean bl2) {
        return bl2 ? this.f(n2) : this.e(n2);
    }

    public short a(short s2, boolean bl2) {
        return bl2 ? this.d(s2) : this.c(s2);
    }

    public byte a(byte by2, boolean bl2) {
        return bl2 ? this.b(by2) : this.a(by2);
    }
}

