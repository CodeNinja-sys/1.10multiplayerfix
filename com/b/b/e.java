/*
 * Decompiled with CFR 0.150.
 */
package com.b.b;

import com.b.a.a;
import com.b.a.b;

public class e {
    private static byte[] e = "vorbis".getBytes();
    private static byte[] f = "Xiphophorus libVorbis I 20000508".getBytes();
    private static final int g = -130;
    public byte[][] a;
    public int[] b;
    public int c;
    public byte[] d;

    public void a() {
        this.a = null;
        this.c = 0;
        this.d = null;
    }

    public void a(String string) {
        this.a(string.getBytes());
    }

    private void a(byte[] arrby) {
        byte[][] arrarrby = new byte[this.c + 2][];
        if (this.a != null) {
            System.arraycopy(this.a, 0, arrarrby, 0, this.c);
        }
        this.a = arrarrby;
        int[] arrn = new int[this.c + 2];
        if (this.b != null) {
            System.arraycopy(this.b, 0, arrn, 0, this.c);
        }
        this.b = arrn;
        byte[] arrby2 = new byte[arrby.length + 1];
        System.arraycopy(arrby, 0, arrby2, 0, arrby.length);
        this.a[this.c] = arrby2;
        this.b[this.c] = arrby.length;
        ++this.c;
        this.a[this.c] = null;
    }

    public void a(String string, String string2) {
        if (string2 == null) {
            string2 = "";
        }
        this.a(string + "=" + string2);
    }

    static boolean a(byte[] arrby, byte[] arrby2, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by2 = arrby[i2];
            byte by3 = arrby2[i2];
            if (90 >= by2 && by2 >= 65) {
                by2 = (byte)(by2 - 65 + 97);
            }
            if (90 >= by3 && by3 >= 65) {
                by3 = (byte)(by3 - 65 + 97);
            }
            if (by2 == by3) continue;
            return false;
        }
        return true;
    }

    public String b(String string) {
        return this.a(string, 0);
    }

    public String a(String string, int n2) {
        int n3 = this.a(string.getBytes(), n2);
        if (n3 == -1) {
            return null;
        }
        byte[] arrby = this.a[n3];
        for (int i2 = 0; i2 < this.b[n3]; ++i2) {
            if (arrby[i2] != 61) continue;
            return new String(arrby, i2 + 1, this.b[n3] - (i2 + 1));
        }
        return null;
    }

    private int a(byte[] arrby, int n2) {
        int n3 = 0;
        int n4 = 0;
        int n5 = arrby.length + 1;
        byte[] arrby2 = new byte[n5];
        System.arraycopy(arrby, 0, arrby2, 0, arrby.length);
        arrby2[arrby.length] = 61;
        for (n3 = 0; n3 < this.c; ++n3) {
            if (!com.b.b.e.a(this.a[n3], arrby2, n5)) continue;
            if (n2 == n4) {
                return n3;
            }
            ++n4;
        }
        return -1;
    }

    int a(a a2) {
        int n2 = a2.c(32);
        if (n2 < 0) {
            this.b();
            return -1;
        }
        this.d = new byte[n2 + 1];
        a2.a(this.d, n2);
        this.c = a2.c(32);
        if (this.c < 0) {
            this.b();
            return -1;
        }
        this.a = new byte[this.c + 1][];
        this.b = new int[this.c + 1];
        for (int i2 = 0; i2 < this.c; ++i2) {
            int n3 = a2.c(32);
            if (n3 < 0) {
                this.b();
                return -1;
            }
            this.b[i2] = n3;
            this.a[i2] = new byte[n3 + 1];
            a2.a(this.a[i2], n3);
        }
        if (a2.c(1) != 1) {
            this.b();
            return -1;
        }
        return 0;
    }

    int b(a a2) {
        a2.a(3, 8);
        a2.a(e);
        a2.a(f.length, 32);
        a2.a(f);
        a2.a(this.c, 32);
        if (this.c != 0) {
            for (int i2 = 0; i2 < this.c; ++i2) {
                if (this.a[i2] != null) {
                    a2.a(this.b[i2], 32);
                    a2.a(this.a[i2]);
                    continue;
                }
                a2.a(0, 32);
            }
        }
        a2.a(1, 1);
        return 0;
    }

    public int a(b b2) {
        a a2 = new a();
        a2.a();
        if (this.b(a2) != 0) {
            return -130;
        }
        b2.a = new byte[a2.g()];
        b2.b = 0;
        b2.c = a2.g();
        System.arraycopy(a2.i(), 0, b2.a, 0, b2.c);
        b2.d = 0;
        b2.e = 0;
        b2.f = 0L;
        return 0;
    }

    void b() {
        for (int i2 = 0; i2 < this.c; ++i2) {
            this.a[i2] = null;
        }
        this.a = null;
        this.d = null;
    }

    public String c() {
        return new String(this.d, 0, this.d.length - 1);
    }

    public String a(int n2) {
        if (this.c <= n2) {
            return null;
        }
        return new String(this.a[n2], 0, this.a[n2].length - 1);
    }

    public String toString() {
        String string = "Vendor: " + new String(this.d, 0, this.d.length - 1);
        for (int i2 = 0; i2 < this.c; ++i2) {
            string = string + "\nComment: " + new String(this.a[i2], 0, this.a[i2].length - 1);
        }
        string = string + "\n";
        return string;
    }
}

