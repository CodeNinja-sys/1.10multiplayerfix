/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.e;
import com.ibm.icu.util.f;
import com.ibm.icu.util.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class h
implements Iterator {
    private byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private g g;
    private ArrayList h = new ArrayList();

    private h(byte[] arrby, int n2, int n3, int n4) {
        this.a = arrby;
        this.b = this.c = n2;
        this.d = this.e = n3;
        this.f = n4;
        this.g = new g(this.f != 0 ? this.f : 32, null);
        int n5 = this.d;
        if (n5 >= 0) {
            if (this.f > 0 && ++n5 > this.f) {
                n5 = this.f;
            }
            com.ibm.icu.util.g.a(this.g, this.a, this.b, n5);
            this.b += n5;
            this.d -= n5;
        }
    }

    public h a() {
        this.b = this.c;
        this.d = this.e;
        int n2 = this.d + 1;
        if (this.f > 0 && n2 > this.f) {
            n2 = this.f;
        }
        com.ibm.icu.util.g.a(this.g, n2);
        this.b += n2;
        this.d -= n2;
        this.h.clear();
        return this;
    }

    public boolean hasNext() {
        return this.b >= 0 || !this.h.isEmpty();
    }

    public g b() {
        int n2 = this.b;
        if (n2 < 0) {
            if (this.h.isEmpty()) {
                throw new NoSuchElementException();
            }
            long l2 = (Long)this.h.remove(this.h.size() - 1);
            int n3 = (int)l2;
            n2 = (int)(l2 >> 32);
            com.ibm.icu.util.g.a(this.g, n3 & 0xFFFF);
            if ((n3 >>>= 16) > 1) {
                if ((n2 = this.a(n2, n3)) < 0) {
                    return this.g;
                }
            } else {
                com.ibm.icu.util.g.a(this.g, this.a[n2++]);
            }
        }
        if (this.d >= 0) {
            return this.c();
        }
        while (true) {
            int n4;
            int n5;
            if ((n5 = this.a[n2++] & 0xFF) >= 32) {
                n4 = (n5 & 1) != 0 ? 1 : 0;
                this.g.a = com.ibm.icu.util.e.c(this.a, n2, n5 >> 1);
                this.b = n4 != 0 || this.f > 0 && com.ibm.icu.util.g.a(this.g) == this.f ? -1 : com.ibm.icu.util.e.a(n2, n5);
                return this.g;
            }
            if (this.f > 0 && com.ibm.icu.util.g.a(this.g) == this.f) {
                return this.c();
            }
            if (n5 < 16) {
                if (n5 == 0) {
                    n5 = this.a[n2++] & 0xFF;
                }
                if ((n2 = this.a(n2, n5 + 1)) >= 0) continue;
                return this.g;
            }
            n4 = n5 - 16 + 1;
            if (this.f > 0 && com.ibm.icu.util.g.a(this.g) + n4 > this.f) {
                com.ibm.icu.util.g.a(this.g, this.a, n2, this.f - com.ibm.icu.util.g.a(this.g));
                return this.c();
            }
            com.ibm.icu.util.g.a(this.g, this.a, n2, n4);
            n2 += n4;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    private g c() {
        this.b = -1;
        this.g.a = -1;
        return this.g;
    }

    private int a(int n2, int n3) {
        int n4;
        while (n3 > 5) {
            this.h.add((long)com.ibm.icu.util.e.a(this.a, ++n2) << 32 | (long)(n3 - (n3 >> 1) << 16) | (long)com.ibm.icu.util.g.a(this.g));
            n3 >>= 1;
            n2 = com.ibm.icu.util.e.b(this.a, n2);
        }
        byte by2 = this.a[n2++];
        boolean bl2 = ((n4 = this.a[n2++] & 0xFF) & 1) != 0;
        int n5 = com.ibm.icu.util.e.c(this.a, n2, n4 >> 1);
        n2 = com.ibm.icu.util.e.a(n2, n4);
        this.h.add((long)n2 << 32 | (long)(n3 - 1 << 16) | (long)com.ibm.icu.util.g.a(this.g));
        com.ibm.icu.util.g.a(this.g, by2);
        if (bl2) {
            this.b = -1;
            this.g.a = n5;
            return -1;
        }
        return n2 + n5;
    }

    public /* synthetic */ Object next() {
        return this.b();
    }

    /* synthetic */ h(byte[] arrby, int n2, int n3, int n4, f f2) {
        this(arrby, n2, n3, n4);
    }
}

