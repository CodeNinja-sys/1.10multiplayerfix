/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

class e {
    private final int a;
    private final byte[] b;
    private int c;
    private int d;

    e(int n2) {
        this.a = n2;
        this.b = new byte[n2];
    }

    public boolean a() {
        return this.c != this.d;
    }

    public void a(int n2) {
        this.b[this.d] = (byte)n2;
        this.d = (this.d + 1) % this.a;
    }

    public int b() {
        if (this.a()) {
            byte by2 = this.b[this.c];
            this.c = (this.c + 1) % this.a;
            return by2 & 0xFF;
        }
        return -1;
    }

    public void a(int n2, int n3) {
        int n4 = this.d - n2;
        int n5 = n4 + n3;
        for (int i2 = n4; i2 < n5; ++i2) {
            this.b[this.d] = this.b[(i2 + this.a) % this.a];
            this.d = (this.d + 1) % this.a;
        }
    }
}

