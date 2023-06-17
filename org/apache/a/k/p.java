/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.k;

import java.io.Serializable;
import org.apache.a.ak;
import org.apache.a.an;
import org.apache.a.k.k;
import org.apache.a.o.a;

public class p
implements Serializable,
Cloneable,
an {
    private static final long a = -2443303766890459269L;
    private final ak b;
    private final int c;
    private final String d;

    public p(ak ak2, int n2, String string) {
        this.b = (ak)org.apache.a.o.a.a(ak2, "Version");
        this.c = org.apache.a.o.a.b(n2, "Status code");
        this.d = string;
    }

    public int b() {
        return this.c;
    }

    public ak a() {
        return this.b;
    }

    public String c() {
        return this.d;
    }

    public String toString() {
        return k.b.a(null, this).toString();
    }

    public Object clone() {
        return super.clone();
    }
}

