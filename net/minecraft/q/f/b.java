/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.f;

public class b {
    private final byte[] a;

    public b() {
        this.a = new byte[2048];
    }

    public b(byte[] arrby) {
        this.a = arrby;
        if (arrby.length != 2048) {
            throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + arrby.length);
        }
    }

    public int a(int n2, int n3, int n4) {
        return this.a(this.b(n2, n3, n4));
    }

    public void a(int n2, int n3, int n4, int n5) {
        this.a(this.b(n2, n3, n4), n5);
    }

    private int b(int n2, int n3, int n4) {
        return n3 << 8 | n4 << 4 | n2;
    }

    public int a(int n2) {
        int n3 = this.c(n2);
        return this.b(n2) ? this.a[n3] & 0xF : this.a[n3] >> 4 & 0xF;
    }

    public void a(int n2, int n3) {
        int n4 = this.c(n2);
        this.a[n4] = this.b(n2) ? (byte)(this.a[n4] & 0xF0 | n3 & 0xF) : (byte)(this.a[n4] & 0xF | (n3 & 0xF) << 4);
    }

    private boolean b(int n2) {
        return (n2 & 1) == 0;
    }

    private int c(int n2) {
        return n2 >> 1;
    }

    public byte[] a() {
        return this.a;
    }
}

