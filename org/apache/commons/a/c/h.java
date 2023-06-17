/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c;

import org.apache.commons.a.c.e;
import org.apache.commons.a.c.f;

class h
extends f {
    final /* synthetic */ e d;

    public h(e e2, int n2) {
        this.d = e2;
        super(e2, n2);
    }

    public void a(char c2) {
        this.a[this.b] = c2;
        ++this.b;
    }

    @Override
    protected char[] a(int n2, int n3) {
        char[] arrc = new char[n3];
        System.arraycopy(this.a, n2, arrc, 0, n3);
        return arrc;
    }
}

