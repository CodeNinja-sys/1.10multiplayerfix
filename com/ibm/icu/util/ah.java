/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.jd;

public final class ah
implements Cloneable {
    public static final int a = 65536;
    public static final int b = 5;
    static final int c = 32;
    static final int d = 11;
    static final int e = 2048;
    static final int f = 31;
    private char[] h;
    private char[] i;
    private int[] j;
    private boolean k;
    char g;

    public ah() {
        this('\u0000');
    }

    public ah(char c2) {
        int n2;
        this.h = new char[65536];
        this.i = new char[2048];
        this.j = new int[2048];
        for (n2 = 0; n2 < 65536; ++n2) {
            this.h[n2] = c2;
        }
        for (n2 = 0; n2 < 2048; ++n2) {
            this.i[n2] = (char)(n2 << 5);
            this.j[n2] = 0;
        }
        this.k = false;
        this.g = c2;
    }

    public ah(char[] arrc, char[] arrc2) {
        if (arrc.length != 2048) {
            throw new IllegalArgumentException("Index out of bounds.");
        }
        for (int i2 = 0; i2 < 2048; ++i2) {
            char c2 = arrc[i2];
            if (c2 >= '\u0000' && c2 < arrc2.length + 32) continue;
            throw new IllegalArgumentException("Index out of bounds.");
        }
        this.i = arrc;
        this.h = arrc2;
        this.k = true;
    }

    public ah(String string, String string2) {
        this(jd.c(string), jd.c(string2));
    }

    public char a(char c2) {
        int n2 = (this.i[c2 >> 5] & 0xFFFF) + (c2 & 0x1F);
        return n2 >= this.h.length ? this.g : this.h[n2];
    }

    public void a(char c2, char c3) {
        if (this.k) {
            this.d();
        }
        this.h[c2] = c3;
        this.a(c2 >> 5, (int)c3);
    }

    public void a(char n2, char c2, char c3) {
        if (this.k) {
            this.d();
        }
        for (int i2 = n2; i2 <= c2; ++i2) {
            this.h[i2] = c3;
            this.a(i2 >> 5, (int)c3);
        }
    }

    public void a() {
        this.a(true);
    }

    public void a(boolean bl2) {
        if (!this.k) {
            int n2 = 0;
            int n3 = 65535;
            int n4 = 0;
            char[] arrc = bl2 ? new char[65536] : this.h;
            int n5 = 0;
            while (n5 < this.i.length) {
                this.i[n5] = 65535;
                boolean bl3 = this.a(n5);
                if (!bl3 && n3 != 65535) {
                    this.i[n5] = n3;
                } else {
                    int n6 = 0;
                    int n7 = 0;
                    while (n7 < n5) {
                        if (this.j[n5] == this.j[n7] && ah.a(this.h, n2, this.h, n6, 32)) {
                            this.i[n5] = this.i[n7];
                        }
                        ++n7;
                        n6 += 32;
                    }
                    if (this.i[n5] == '\uffff') {
                        n7 = bl2 ? this.a(n2, arrc, n4) : n4;
                        int n8 = n7 + 32;
                        if (n8 > n4) {
                            for (int i2 = n4; i2 < n8; ++i2) {
                                arrc[i2] = this.h[n2 + i2 - n7];
                            }
                            n4 = n8;
                        }
                        this.i[n5] = (char)n7;
                        if (!bl3) {
                            n3 = (char)n6;
                        }
                    }
                }
                ++n5;
                n2 += 32;
            }
            char[] arrc2 = new char[n4];
            System.arraycopy(arrc, 0, arrc2, 0, n4);
            this.h = arrc2;
            this.k = true;
            this.j = null;
        }
    }

    private int a(int n2, char[] arrc, int n3) {
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = 32;
            if (i2 + 32 > n3) {
                n4 = n3 - i2;
            }
            if (!ah.a(this.h, n2, arrc, i2, n4)) continue;
            return i2;
        }
        return n3;
    }

    static final boolean a(char[] arrc, int n2, char[] arrc2, int n3, int n4) {
        int n5 = n2 + n4;
        int n6 = n3 - n2;
        for (int i2 = n2; i2 < n5; ++i2) {
            if (arrc[i2] == arrc2[i2 + n6]) continue;
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

    public char[] c() {
        return this.h;
    }

    public Object clone() {
        try {
            ah ah2 = (ah)super.clone();
            ah2.h = (char[])this.h.clone();
            ah2.i = (char[])this.i.clone();
            if (this.j != null) {
                ah2.j = (int[])this.j.clone();
            }
            return ah2;
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
        ah ah2 = (ah)object;
        for (int i2 = 0; i2 < 65536; ++i2) {
            if (this.a((char)i2) == ah2.a((char)i2)) continue;
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
            this.j = new int[2048];
            char[] arrc = new char[65536];
            for (n2 = 0; n2 < 65536; ++n2) {
                arrc[n2] = this.a((char)n2);
            }
            for (n2 = 0; n2 < 2048; ++n2) {
                this.i[n2] = (char)(n2 << 5);
            }
            this.h = null;
            this.h = arrc;
            this.k = false;
        }
    }
}

