/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.jd;

public final class ag
implements Cloneable {
    public static final int a = 65536;
    private static final int c = 7;
    private static final int d = 128;
    private static final int e = 9;
    private static final int f = 512;
    private static final int g = 127;
    private byte[] h;
    private char[] i;
    private int[] j;
    private boolean k;
    byte b;

    public ag() {
        this(0);
    }

    public ag(byte by2) {
        int n2;
        this.h = new byte[65536];
        this.i = new char[512];
        this.j = new int[512];
        for (n2 = 0; n2 < 65536; ++n2) {
            this.h[n2] = by2;
        }
        for (n2 = 0; n2 < 512; ++n2) {
            this.i[n2] = (char)(n2 << 7);
            this.j[n2] = 0;
        }
        this.k = false;
        this.b = by2;
    }

    public ag(char[] arrc, byte[] arrby) {
        if (arrc.length != 512) {
            throw new IllegalArgumentException("Index out of bounds.");
        }
        for (int i2 = 0; i2 < 512; ++i2) {
            char c2 = arrc[i2];
            if (c2 >= '\u0000' && c2 < arrby.length + 128) continue;
            throw new IllegalArgumentException("Index out of bounds.");
        }
        this.i = arrc;
        this.h = arrby;
        this.k = true;
    }

    public ag(String string, String string2) {
        this(jd.c(string), jd.d(string2));
    }

    public byte a(char c2) {
        return this.h[(this.i[c2 >> 7] & 0xFFFF) + (c2 & 0x7F)];
    }

    public void a(char c2, byte by2) {
        if (this.k) {
            this.d();
        }
        this.h[c2] = by2;
        this.a(c2 >> 7, (int)by2);
    }

    public void a(char n2, char c2, byte by2) {
        if (this.k) {
            this.d();
        }
        for (int i2 = n2; i2 <= c2; ++i2) {
            this.h[i2] = by2;
            this.a(i2 >> 7, (int)by2);
        }
    }

    public void a() {
        this.a(false);
    }

    public void a(boolean bl2) {
        if (!this.k) {
            int n2 = 0;
            int n3 = 0;
            int n4 = 65535;
            int n5 = 0;
            while (n5 < this.i.length) {
                this.i[n5] = 65535;
                boolean bl3 = this.a(n5);
                if (!bl3 && n4 != 65535) {
                    this.i[n5] = n4;
                } else {
                    int n6 = 0;
                    int n7 = 0;
                    n7 = 0;
                    while (n7 < n2) {
                        if (this.j[n5] == this.j[n7] && ag.a(this.h, n3, this.h, n6, 128)) {
                            this.i[n5] = (char)n6;
                            break;
                        }
                        ++n7;
                        n6 += 128;
                    }
                    if (this.i[n5] == '\uffff') {
                        System.arraycopy(this.h, n3, this.h, n6, 128);
                        this.i[n5] = (char)n6;
                        this.j[n7] = this.j[n5];
                        ++n2;
                        if (!bl3) {
                            n4 = (char)n6;
                        }
                    }
                }
                ++n5;
                n3 += 128;
            }
            n5 = n2 * 128;
            byte[] arrby = new byte[n5];
            System.arraycopy(this.h, 0, arrby, 0, n5);
            this.h = arrby;
            this.k = true;
            this.j = null;
        }
    }

    static final boolean a(byte[] arrby, int n2, byte[] arrby2, int n3, int n4) {
        int n5 = n2 + n4;
        int n6 = n3 - n2;
        for (int i2 = n2; i2 < n5; ++i2) {
            if (arrby[i2] == arrby2[i2 + n6]) continue;
            return false;
        }
        return true;
    }

    private final void a(int n2, int n3) {
        this.j[n2] = this.j[n2] + (n3 << 1) | 1;
    }

    private final boolean a(int n2) {
        return this.j[n2] != 0;
    }

    public char[] b() {
        return this.i;
    }

    public byte[] c() {
        return this.h;
    }

    public Object clone() {
        try {
            ag ag2 = (ag)super.clone();
            ag2.h = (byte[])this.h.clone();
            ag2.i = (char[])this.i.clone();
            if (this.j != null) {
                ag2.j = (int[])this.j.clone();
            }
            return ag2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException();
        }
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        ag ag2 = (ag)object;
        for (int i2 = 0; i2 < 65536; ++i2) {
            if (this.a((char)i2) == ag2.a((char)i2)) continue;
            return false;
        }
        return true;
    }

    public int hashCode() {
        int n2 = 0;
        int n3 = Math.min(3, this.h.length / 16);
        for (int i2 = 0; i2 < this.h.length; i2 += n3) {
            n2 = n2 * 37 + this.h[i2];
        }
        return n2;
    }

    private void d() {
        if (this.k) {
            int n2;
            this.j = new int[512];
            byte[] arrby = new byte[65536];
            for (n2 = 0; n2 < 65536; ++n2) {
                byte by2;
                arrby[n2] = by2 = this.a((char)n2);
                this.a(n2 >> 7, (int)by2);
            }
            for (n2 = 0; n2 < 512; ++n2) {
                this.i[n2] = (char)(n2 << 7);
            }
            this.h = null;
            this.h = arrby;
            this.k = false;
        }
    }
}

