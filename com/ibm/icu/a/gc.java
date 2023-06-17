/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ge;
import com.ibm.icu.a.gf;
import com.ibm.icu.d.kx;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

public abstract class gc {
    protected static final int b = 320;
    protected static final int c = 5;
    protected static final int d = 2;
    protected static final int e = 32;
    protected static final int f = 31;
    protected static final int g = 5;
    protected static final int h = 32;
    protected static final int i = 2048;
    protected static final int j = 1023;
    protected char[] k;
    protected ge l;
    protected int m;
    protected int n;
    protected static final int o = 16;
    protected static final int p = 512;
    protected static final int q = 1416784229;
    private static final int a = 15;
    protected static final int r = 4;
    protected static final int s = 256;
    private boolean u;
    private int v;

    public final boolean b() {
        return this.u;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof gc)) {
            return false;
        }
        gc gc2 = (gc)object;
        return this.u == gc2.u && this.v == gc2.v && this.n == gc2.n && Arrays.equals(this.k, gc2.k);
    }

    public int hashCode() {
        assert (false) : "hashCode not designed";
        return 42;
    }

    public int c() {
        int n2 = 16;
        n2 += this.m << 1;
        if (this.e()) {
            n2 += this.n << 1;
        } else if (this.d()) {
            n2 += this.n << 2;
        }
        return n2;
    }

    protected gc(InputStream inputStream, ge ge2) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        int n2 = dataInputStream.readInt();
        this.v = dataInputStream.readInt();
        if (!this.a(n2)) {
            throw new IllegalArgumentException("ICU data file error: Trie header authentication failed, please check if you have the most updated ICU data file");
        }
        this.l = ge2 != null ? ge2 : new gf(null);
        this.u = (this.v & 0x200) != 0;
        this.m = dataInputStream.readInt();
        this.n = dataInputStream.readInt();
        this.a(inputStream);
    }

    protected gc(char[] arrc, int n2, ge ge2) {
        this.v = n2;
        this.l = ge2 != null ? ge2 : new gf(null);
        this.u = (this.v & 0x200) != 0;
        this.k = arrc;
        this.m = this.k.length;
    }

    protected abstract int b(char var1, char var2);

    protected abstract int b(int var1);

    protected abstract int a();

    protected final int b(int n2, char c2) {
        return (this.k[n2 + (c2 >> 5)] << 2) + (c2 & 0x1F);
    }

    protected final int d(char c2) {
        return c2 >= '\ud800' && c2 <= '\udbff' ? this.b(320, c2) : this.b(0, c2);
    }

    protected final int e(char c2) {
        return this.b(0, c2);
    }

    protected final int c(int n2) {
        if (n2 < 0) {
            return -1;
        }
        if (n2 < 55296) {
            return this.b(0, (char)n2);
        }
        if (n2 < 65536) {
            return this.d((char)n2);
        }
        if (n2 <= 0x10FFFF) {
            return this.b(kx.b(n2), (char)(n2 & 0x3FF));
        }
        return -1;
    }

    protected void a(InputStream inputStream) {
        this.k = new char[this.m];
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        for (int i2 = 0; i2 < this.m; ++i2) {
            this.k[i2] = dataInputStream.readChar();
        }
    }

    protected final boolean d() {
        return (this.v & 0x100) != 0;
    }

    protected final boolean e() {
        return (this.v & 0x100) == 0;
    }

    private final boolean a(int n2) {
        if (n2 != 1416784229) {
            return false;
        }
        return (this.v & 0xF) == 5 && (this.v >> 4 & 0xF) == 2;
    }
}

