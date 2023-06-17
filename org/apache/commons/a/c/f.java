/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c;

import org.apache.commons.a.c.e;

abstract class f {
    protected final char[] a;
    protected int b = 0;
    final /* synthetic */ e c;

    public f(e e2, char[] arrc) {
        this.c = e2;
        this.a = arrc;
        this.b = arrc.length;
    }

    public f(e e2, int n2) {
        this.c = e2;
        this.a = new char[n2];
        this.b = 0;
    }

    protected abstract char[] a(int var1, int var2);

    public int a() {
        return this.b;
    }

    public String toString() {
        return new String(this.a(0, this.b));
    }
}

