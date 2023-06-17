/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.gc;
import com.ibm.icu.a.ge;
import java.io.DataInputStream;
import java.io.InputStream;

public class t
extends gc {
    private char u;
    private char[] v;

    public t(InputStream inputStream, ge ge2) {
        super(inputStream, ge2);
        if (!this.e()) {
            throw new IllegalArgumentException("Data given does not belong to a char trie.");
        }
    }

    public t(int n2, int n3, ge ge2) {
        super(new char[2080], 512, ge2);
        int n4;
        int n5 = 256;
        int n6 = 256;
        if (n3 != n2) {
            n6 += 32;
        }
        this.v = new char[n6];
        this.n = n6;
        this.u = (char)n2;
        for (n4 = 0; n4 < n5; ++n4) {
            this.v[n4] = (char)n2;
        }
        if (n3 != n2) {
            char c2 = (char)(n5 >> 2);
            int n7 = 1760;
            for (n4 = 1728; n4 < n7; ++n4) {
                this.k[n4] = c2;
            }
            n7 = n5 + 32;
            for (n4 = n5; n4 < n7; ++n4) {
                this.v[n4] = (char)n3;
            }
        }
    }

    public final char a(int n2) {
        if (0 <= n2 && n2 < 55296) {
            int n3 = (this.k[n2 >> 5] << 2) + (n2 & 0x1F);
            return this.v[n3];
        }
        int n4 = this.c(n2);
        return n4 >= 0 ? this.v[n4] : this.u;
    }

    public final char a(char c2) {
        return this.v[this.e(c2)];
    }

    public final char b(char c2) {
        return this.v[this.d(c2)];
    }

    public final char a(char c2, char c3) {
        int n2 = this.b(c2, c3);
        if (n2 > 0) {
            return this.v[n2];
        }
        return this.u;
    }

    public final char a(int n2, char c2) {
        if (this.l == null) {
            throw new NullPointerException("The field DataManipulate in this Trie is null");
        }
        int n3 = this.l.a(n2);
        if (n3 > 0) {
            return this.v[this.b(n3, (char)(c2 & 0x3FF))];
        }
        return this.u;
    }

    public final char c(char c2) {
        return this.v[32 + this.m + c2];
    }

    public boolean equals(Object object) {
        boolean bl2 = super.equals(object);
        if (bl2 && object instanceof t) {
            t t2 = (t)object;
            return this.u == t2.u;
        }
        return false;
    }

    public int hashCode() {
        assert (false) : "hashCode not designed";
        return 42;
    }

    protected final void a(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        int n2 = this.m + this.n;
        this.k = new char[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.k[i2] = dataInputStream.readChar();
        }
        this.v = this.k;
        this.u = this.v[this.m];
    }

    protected final int b(char c2, char c3) {
        if (this.l == null) {
            throw new NullPointerException("The field DataManipulate in this Trie is null");
        }
        int n2 = this.l.a(this.a(c2));
        if (n2 > 0) {
            return this.b(n2, (char)(c3 & 0x3FF));
        }
        return -1;
    }

    protected final int b(int n2) {
        return this.v[n2];
    }

    protected final int a() {
        return this.u;
    }
}

