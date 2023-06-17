/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

class ix {
    private final long[] a;
    private int b;
    private static final long c = 10000000L;
    private static final float d = 0.9f;

    public ix(int n2) {
        this.a = new long[n2];
        this.b = 0;
    }

    public void a(long l2) {
        while (this.b < this.a.length) {
            this.a[this.b++] = l2;
        }
    }

    public void b(long l2) {
        this.a[this.b++ % this.a.length] = l2;
        this.b %= this.a.length;
    }

    public long a() {
        long l2 = 0L;
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            l2 += this.a[i2];
        }
        return l2 / (long)this.a.length;
    }

    public void b() {
        if (this.a() > 10000000L) {
            int n2 = 0;
            while (n2 < this.a.length) {
                int n3 = n2++;
                this.a[n3] = (long)((float)this.a[n3] * 0.9f);
            }
        }
    }
}

