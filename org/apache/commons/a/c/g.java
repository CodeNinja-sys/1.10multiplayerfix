/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c;

import org.apache.commons.a.c.e;
import org.apache.commons.a.c.f;

class g
extends f {
    final /* synthetic */ e d;

    public g(e e2, char[] arrc) {
        this.d = e2;
        super(e2, arrc);
    }

    public void a(char c2) {
        ++this.b;
        this.a[this.c()] = c2;
    }

    @Override
    protected char[] a(int n2, int n3) {
        char[] arrc = new char[n3];
        System.arraycopy(this.a, this.a.length - this.b + n2, arrc, 0, n3);
        return arrc;
    }

    public char b() {
        return this.a[this.c()];
    }

    protected int c() {
        return this.a.length - this.b;
    }

    public char d() {
        char c2 = this.b();
        --this.b;
        return c2;
    }
}

