/*
 * Decompiled with CFR 0.150.
 */
package com.b.a;

public class a {
    private static final int f = 256;
    private static final int[] g = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 0x1FFFFF, 0x3FFFFF, 0x7FFFFF, 0xFFFFFF, 0x1FFFFFF, 0x3FFFFFF, 0x7FFFFFF, 0xFFFFFFF, 0x1FFFFFFF, 0x3FFFFFFF, Integer.MAX_VALUE, -1};
    int a = 0;
    byte[] b = null;
    int c = 0;
    int d = 0;
    int e = 0;

    public void a() {
        this.b = new byte[256];
        this.a = 0;
        this.b[0] = 0;
        this.e = 256;
    }

    public void a(byte[] arrby) {
        for (int i2 = 0; i2 < arrby.length && arrby[i2] != 0; ++i2) {
            this.a(arrby[i2], 8);
        }
    }

    public void a(byte[] arrby, int n2) {
        int n3 = 0;
        while (n2-- != 0) {
            arrby[n3++] = (byte)this.c(8);
        }
    }

    void b() {
        this.a = 0;
        this.b[0] = 0;
        this.d = 0;
        this.c = 0;
    }

    public void c() {
        this.b = null;
    }

    public void b(byte[] arrby, int n2) {
        this.a(arrby, 0, n2);
    }

    public void a(byte[] arrby, int n2, int n3) {
        this.a = n2;
        this.b = arrby;
        this.d = 0;
        this.c = 0;
        this.e = n3;
    }

    public void a(int n2, int n3) {
        if (this.d + 4 >= this.e) {
            byte[] arrby = new byte[this.e + 256];
            System.arraycopy(this.b, 0, arrby, 0, this.e);
            this.b = arrby;
            this.e += 256;
        }
        n2 &= g[n3];
        int n4 = this.a;
        this.b[n4] = (byte)(this.b[n4] | (byte)(n2 << this.c));
        if ((n3 += this.c) >= 8) {
            this.b[this.a + 1] = (byte)(n2 >>> 8 - this.c);
            if (n3 >= 16) {
                this.b[this.a + 2] = (byte)(n2 >>> 16 - this.c);
                if (n3 >= 24) {
                    this.b[this.a + 3] = (byte)(n2 >>> 24 - this.c);
                    if (n3 >= 32) {
                        this.b[this.a + 4] = this.c > 0 ? (byte)(n2 >>> 32 - this.c) : (byte)0;
                    }
                }
            }
        }
        this.d += n3 / 8;
        this.a += n3 / 8;
        this.c = n3 & 7;
    }

    public int a(int n2) {
        int n3 = g[n2];
        if (this.d + 4 >= this.e && this.d + ((n2 += this.c) - 1) / 8 >= this.e) {
            return -1;
        }
        int n4 = (this.b[this.a] & 0xFF) >>> this.c;
        if (n2 > 8) {
            n4 |= (this.b[this.a + 1] & 0xFF) << 8 - this.c;
            if (n2 > 16) {
                n4 |= (this.b[this.a + 2] & 0xFF) << 16 - this.c;
                if (n2 > 24) {
                    n4 |= (this.b[this.a + 3] & 0xFF) << 24 - this.c;
                    if (n2 > 32 && this.c != 0) {
                        n4 |= (this.b[this.a + 4] & 0xFF) << 32 - this.c;
                    }
                }
            }
        }
        return n3 & n4;
    }

    public int d() {
        if (this.d >= this.e) {
            return -1;
        }
        return this.b[this.a] >> this.c & 1;
    }

    public void b(int n2) {
        this.a += (n2 += this.c) / 8;
        this.d += n2 / 8;
        this.c = n2 & 7;
    }

    public void e() {
        ++this.c;
        if (this.c > 7) {
            this.c = 0;
            ++this.a;
            ++this.d;
        }
    }

    public int c(int n2) {
        int n3;
        int n4 = g[n2];
        n2 += this.c;
        if (this.d + 4 >= this.e) {
            n3 = -1;
            if (this.d + (n2 - 1) / 8 >= this.e) {
                this.a += n2 / 8;
                this.d += n2 / 8;
                this.c = n2 & 7;
                return n3;
            }
        }
        n3 = (this.b[this.a] & 0xFF) >>> this.c;
        if (n2 > 8) {
            n3 |= (this.b[this.a + 1] & 0xFF) << 8 - this.c;
            if (n2 > 16) {
                n3 |= (this.b[this.a + 2] & 0xFF) << 16 - this.c;
                if (n2 > 24) {
                    n3 |= (this.b[this.a + 3] & 0xFF) << 24 - this.c;
                    if (n2 > 32 && this.c != 0) {
                        n3 |= (this.b[this.a + 4] & 0xFF) << 32 - this.c;
                    }
                }
            }
        }
        this.a += n2 / 8;
        this.d += n2 / 8;
        this.c = n2 & 7;
        return n3 &= n4;
    }

    public int d(int n2) {
        int n3;
        int n4 = 32 - n2;
        n2 += this.c;
        if (this.d + 4 >= this.e) {
            n3 = -1;
            if (this.d * 8 + n2 > this.e * 8) {
                this.a += n2 / 8;
                this.d += n2 / 8;
                this.c = n2 & 7;
                return n3;
            }
        }
        n3 = (this.b[this.a] & 0xFF) << 24 + this.c;
        if (n2 > 8) {
            n3 |= (this.b[this.a + 1] & 0xFF) << 16 + this.c;
            if (n2 > 16) {
                n3 |= (this.b[this.a + 2] & 0xFF) << 8 + this.c;
                if (n2 > 24) {
                    n3 |= (this.b[this.a + 3] & 0xFF) << this.c;
                    if (n2 > 32 && this.c != 0) {
                        n3 |= (this.b[this.a + 4] & 0xFF) >> 8 - this.c;
                    }
                }
            }
        }
        n3 = n3 >>> (n4 >> 1) >>> (n4 + 1 >> 1);
        this.a += n2 / 8;
        this.d += n2 / 8;
        this.c = n2 & 7;
        return n3;
    }

    public int f() {
        if (this.d >= this.e) {
            int n2 = -1;
            ++this.c;
            if (this.c > 7) {
                this.c = 0;
                ++this.a;
                ++this.d;
            }
            return n2;
        }
        int n3 = this.b[this.a] >> this.c & 1;
        ++this.c;
        if (this.c > 7) {
            this.c = 0;
            ++this.a;
            ++this.d;
        }
        return n3;
    }

    public int g() {
        return this.d + (this.c + 7) / 8;
    }

    public int h() {
        return this.d * 8 + this.c;
    }

    public byte[] i() {
        return this.b;
    }

    public static int e(int n2) {
        int n3 = 0;
        while (n2 > 0) {
            ++n3;
            n2 >>>= 1;
        }
        return n3;
    }

    public static void a(String string) {
        System.err.println(string);
        System.exit(1);
    }
}

