/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.gc;
import com.ibm.icu.a.ge;
import com.ibm.icu.d.kx;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class cl
extends gc {
    private int u;
    private int[] v;

    public cl(InputStream inputStream, ge ge2) {
        super(inputStream, ge2);
        if (!this.d()) {
            throw new IllegalArgumentException("Data given does not belong to a int trie.");
        }
    }

    public cl(int n2, int n3, ge ge2) {
        super(new char[2080], 512, ge2);
        int n4;
        int n5 = 256;
        int n6 = 256;
        if (n3 != n2) {
            n6 += 32;
        }
        this.v = new int[n6];
        this.n = n6;
        this.u = n2;
        for (n4 = 0; n4 < n5; ++n4) {
            this.v[n4] = n2;
        }
        if (n3 != n2) {
            char c2 = (char)(n5 >> 2);
            int n7 = 1760;
            for (n4 = 1728; n4 < n7; ++n4) {
                this.k[n4] = c2;
            }
            n7 = n5 + 32;
            for (n4 = n5; n4 < n7; ++n4) {
                this.v[n4] = n3;
            }
        }
    }

    public final int a(int n2) {
        if (0 <= n2 && n2 < 55296) {
            int n3 = (this.k[n2 >> 5] << 2) + (n2 & 0x1F);
            return this.v[n3];
        }
        int n4 = this.c(n2);
        return n4 >= 0 ? this.v[n4] : this.u;
    }

    public final int a(char c2) {
        return this.v[this.e(c2)];
    }

    public final int b(char c2) {
        return this.v[this.d(c2)];
    }

    public final int a(char c2, char c3) {
        if (!kx.c(c2) || !kx.b(c3)) {
            throw new IllegalArgumentException("Argument characters do not form a supplementary character");
        }
        int n2 = this.b(c2, c3);
        if (n2 > 0) {
            return this.v[n2];
        }
        return this.u;
    }

    public final int a(int n2, char c2) {
        if (this.l == null) {
            throw new NullPointerException("The field DataManipulate in this Trie is null");
        }
        int n3 = this.l.a(n2);
        if (n3 > 0) {
            return this.v[this.b(n3, (char)(c2 & 0x3FF))];
        }
        return this.u;
    }

    public final int c(char c2) {
        return this.v[32 + c2];
    }

    public boolean equals(Object object) {
        boolean bl2 = super.equals(object);
        if (bl2 && object instanceof cl) {
            cl cl2 = (cl)object;
            return this.u == cl2.u && Arrays.equals(this.v, cl2.v);
        }
        return false;
    }

    public int hashCode() {
        assert (false) : "hashCode not designed";
        return 42;
    }

    protected final void a(InputStream inputStream) {
        super.a(inputStream);
        this.v = new int[this.n];
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        for (int i2 = 0; i2 < this.n; ++i2) {
            this.v[i2] = dataInputStream.readInt();
        }
        this.u = this.v[0];
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

    cl(char[] arrc, int[] arrn, int n2, int n3, ge ge2) {
        super(arrc, n3, ge2);
        this.v = arrn;
        this.n = this.v.length;
        this.u = n2;
    }
}

