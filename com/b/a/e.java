/*
 * Decompiled with CFR 0.150.
 */
package com.b.a;

import com.b.a.c;

public class e {
    public byte[] a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    private c h = new c();
    private byte[] i = new byte[4];

    public int a() {
        this.a = null;
        return 0;
    }

    public int a(int n2) {
        if (this.d != 0) {
            this.c -= this.d;
            if (this.c > 0) {
                System.arraycopy(this.a, this.d, this.a, 0, this.c);
            }
            this.d = 0;
        }
        if (n2 > this.b - this.c) {
            int n3 = n2 + this.c + 4096;
            if (this.a != null) {
                byte[] arrby = new byte[n3];
                System.arraycopy(this.a, 0, arrby, 0, this.a.length);
                this.a = arrby;
            } else {
                this.a = new byte[n3];
            }
            this.b = n3;
        }
        return this.c;
    }

    public int b(int n2) {
        if (this.c + n2 > this.b) {
            return -1;
        }
        this.c += n2;
        return 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int a(c c2) {
        int n2 = this.d;
        int n3 = this.c - this.d;
        if (this.f == 0) {
            if (n3 < 27) {
                return 0;
            }
            if (this.a[n2] != 79 || this.a[n2 + 1] != 103 || this.a[n2 + 2] != 103 || this.a[n2 + 3] != 83) {
                this.f = 0;
                this.g = 0;
                int n4 = 0;
                for (int i2 = 0; i2 < n3 - 1; ++i2) {
                    if (this.a[n2 + 1 + i2] != 79) continue;
                    n4 = n2 + 1 + i2;
                    break;
                }
                if (n4 == 0) {
                    n4 = this.c;
                }
                this.d = n4;
                return -(n4 - n2);
            }
            int n5 = (this.a[n2 + 26] & 0xFF) + 27;
            if (n3 < n5) {
                return 0;
            }
            for (int i3 = 0; i3 < (this.a[n2 + 26] & 0xFF); ++i3) {
                this.g += this.a[n2 + 27 + i3] & 0xFF;
            }
            this.f = n5;
        }
        if (this.g + this.f > n3) {
            return 0;
        }
        byte[] arrby = this.i;
        synchronized (this.i) {
            System.arraycopy(this.a, n2 + 22, this.i, 0, 4);
            this.a[n2 + 22] = 0;
            this.a[n2 + 23] = 0;
            this.a[n2 + 24] = 0;
            this.a[n2 + 25] = 0;
            c c3 = this.h;
            c3.a = this.a;
            c3.b = n2;
            c3.c = this.f;
            c3.d = this.a;
            c3.e = n2 + this.f;
            c3.f = this.g;
            c3.h();
            if (this.i[0] != this.a[n2 + 22] || this.i[1] != this.a[n2 + 23] || this.i[2] != this.a[n2 + 24] || this.i[3] != this.a[n2 + 25]) {
                System.arraycopy(this.i, 0, this.a, n2 + 22, 4);
                this.f = 0;
                this.g = 0;
                int n6 = 0;
                for (int i4 = 0; i4 < n3 - 1; ++i4) {
                    if (this.a[n2 + 1 + i4] != 79) continue;
                    n6 = n2 + 1 + i4;
                    break;
                }
                if (n6 == 0) {
                    n6 = this.c;
                }
                this.d = n6;
                // ** MonitorExit[var5_9] (shouldn't be in output)
                return -(n6 - n2);
            }
            // ** MonitorExit[var5_9] (shouldn't be in output)
            n2 = this.d;
            if (c2 != null) {
                c2.a = this.a;
                c2.b = n2;
                c2.c = this.f;
                c2.d = this.a;
                c2.e = n2 + this.f;
                c2.f = this.g;
            }
            this.e = 0;
            n3 = this.f + this.g;
            this.d += n3;
            this.f = 0;
            this.g = 0;
            return n3;
        }
    }

    public int b(c c2) {
        do {
            int n2;
            if ((n2 = this.a(c2)) > 0) {
                return 1;
            }
            if (n2 != 0) continue;
            return 0;
        } while (this.e != 0);
        this.e = 1;
        return -1;
    }

    public int b() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        return 0;
    }

    public void c() {
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.c;
    }
}

