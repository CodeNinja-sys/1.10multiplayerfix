/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.gg;
import com.ibm.icu.a.gl;
import com.ibm.icu.a.go;
import java.util.Iterator;
import java.util.NoSuchElementException;

class gm
implements Iterator {
    private go b;
    private gl c = new gl();
    private int d;
    private int e;
    private boolean f = true;
    private boolean g = true;
    final /* synthetic */ gg a;

    gm(gg gg2, go go2) {
        this.a = gg2;
        this.b = go2;
        this.d = 0;
        this.e = 0x110000;
        this.g = true;
    }

    gm(gg gg2, char c2, go go2) {
        this.a = gg2;
        if (c2 < '\ud800' || c2 > '\udbff') {
            throw new IllegalArgumentException("Bad lead surrogate value.");
        }
        this.b = go2;
        this.d = c2 - 55232 << 10;
        this.e = this.d + 1024;
        this.g = false;
    }

    public gl a() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        if (this.d >= this.e) {
            this.f = false;
            this.d = 55296;
        }
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        if (this.f) {
            n3 = this.a.a(this.d);
            n4 = this.b.a(n3);
            n2 = this.a.a(this.d, this.e, n3);
            while (n2 < this.e - 1 && this.b.a(n3 = this.a.a(n2 + 1)) == n4) {
                n2 = this.a.a(n2 + 1, this.e, n3);
            }
        } else {
            n3 = this.a.a((char)this.d);
            n4 = this.b.a(n3);
            n2 = this.a((char)this.d);
            while (n2 < 56319 && this.b.a(n3 = this.a.a((char)(n2 + 1))) == n4) {
                n2 = this.a((char)(n2 + 1));
            }
        }
        this.c.a = this.d;
        this.c.b = n2;
        this.c.c = n4;
        this.c.d = !this.f;
        this.d = n2 + 1;
        return this.c;
    }

    public boolean hasNext() {
        return this.f && (this.g || this.d < this.e) || this.d < 56320;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    private int a(char c2) {
        int n2;
        if (c2 >= '\udbff') {
            return 56319;
        }
        int n3 = this.a.a(c2);
        for (n2 = c2 + '\u0001'; n2 <= 56319 && this.a.a((char)n2) == n3; ++n2) {
        }
        return n2 - 1;
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

