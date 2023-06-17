/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.b;

import com.ibm.icu.a.hc;
import com.ibm.icu.a.hk;
import com.ibm.icu.d.kx;

class n
implements hc {
    protected String a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;

    n(String string) {
        this.a = string;
        this.c = string.length();
        this.b = 0;
        this.e = 0;
        this.d = 0;
        this.f = 0;
    }

    public void b(int n2) {
        this.c = 0 <= n2 && n2 <= this.a.length() ? n2 : this.a.length();
    }

    public void b() {
        this.d = this.e = this.c;
    }

    public int c() {
        this.d = this.e;
        if (this.e < this.c) {
            char c2;
            int n2;
            if ((55296 <= (n2 = this.a.charAt(this.e++)) || n2 <= 57343) && n2 <= 56319 && this.e < this.c && '\udc00' <= (c2 = this.a.charAt(this.e)) && c2 <= '\udfff') {
                ++this.e;
                n2 = hk.a((char)n2, c2);
            }
            return n2;
        }
        return -1;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public void a(int n2) {
        if (n2 > 0) {
            this.f = 1;
            this.b = this.e;
        } else if (n2 < 0) {
            this.f = -1;
            this.b = this.d;
        } else {
            this.f = 0;
            this.b = 0;
        }
    }

    public int a() {
        if (this.f > 0 && this.b < this.a.length()) {
            int n2 = kx.a(this.a, this.b);
            this.b += kx.a(n2);
            return n2;
        }
        if (this.f < 0 && this.b > 0) {
            int n3 = kx.a(this.a, this.b - 1);
            this.b -= kx.a(n3);
            return n3;
        }
        return -1;
    }
}

