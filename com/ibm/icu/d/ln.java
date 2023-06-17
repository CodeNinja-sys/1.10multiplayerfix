/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.lf;
import java.util.Iterator;
import java.util.TreeSet;

class ln
implements Iterator {
    private int[] a;
    private int b;
    private int c;
    private int d;
    private int e;
    private TreeSet f;
    private Iterator g;
    private char[] h;

    ln(lf lf2) {
        this.b = lf.m(lf2) - 1;
        if (this.c >= this.b) {
            this.g = lf2.i.iterator();
            this.a = null;
        } else {
            this.f = lf2.i;
            this.a = lf.n(lf2);
            this.d = this.a[this.c++];
            this.e = this.a[this.c++];
        }
    }

    public boolean hasNext() {
        return this.a != null || this.g.hasNext();
    }

    public String a() {
        if (this.a == null) {
            return (String)this.g.next();
        }
        int n2 = this.d++;
        if (this.d >= this.e) {
            if (this.c >= this.b) {
                this.g = this.f.iterator();
                this.a = null;
            } else {
                this.d = this.a[this.c++];
                this.e = this.a[this.c++];
            }
        }
        if (n2 <= 65535) {
            return String.valueOf((char)n2);
        }
        if (this.h == null) {
            this.h = new char[2];
        }
        int n3 = n2 - 65536;
        this.h[0] = (char)((n3 >>> 10) + 55296);
        this.h[1] = (char)((n3 & 0x3FF) + 56320);
        return String.valueOf(this.h);
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

