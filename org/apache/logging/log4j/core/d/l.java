/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.d;

import java.lang.reflect.Array;

public class l {
    private final Object[] a;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private final Class e;

    public l(Class class_, int n2) {
        if (n2 < 1) {
            throw new IllegalArgumentException("The maxSize argument (" + n2 + ") is not a positive integer.");
        }
        this.a = this.a(class_, n2);
        this.e = class_;
    }

    private Object[] a(Class class_, int n2) {
        return (Object[])Array.newInstance(class_, n2);
    }

    public synchronized void a(Object object) {
        this.a[this.c] = object;
        if (++this.c == this.a.length) {
            this.c = 0;
        }
        if (this.d < this.a.length) {
            ++this.d;
        } else if (++this.b == this.a.length) {
            this.b = 0;
        }
    }

    public synchronized Object[] a() {
        Object[] arrobject = this.a(this.e, this.d);
        int n2 = 0;
        while (this.d > 0) {
            --this.d;
            arrobject[n2++] = this.a[this.b];
            this.a[this.b] = null;
            if (++this.b != this.a.length) continue;
            this.b = 0;
        }
        return arrobject;
    }

    public boolean b() {
        return 0 == this.d;
    }
}

