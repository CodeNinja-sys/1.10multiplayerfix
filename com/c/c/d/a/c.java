/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.d.a.b;
import java.text.SimpleDateFormat;
import java.util.Date;

class c
implements Comparable {
    long a;
    long b;
    long c;
    int d;

    private c(long l2, long l3, long l4) {
        this.a = l2;
        this.b = l3;
        this.c = l4;
    }

    public int a(c c2) {
        return (int)(this.b - c2.b);
    }

    public int a() {
        String string = new SimpleDateFormat("HH").format(new Date(this.b));
        return Integer.parseInt(string);
    }

    public int b() {
        String string = new SimpleDateFormat("mm").format(new Date(this.b));
        return Integer.parseInt(string);
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((c)object);
    }

    /* synthetic */ c(long l2, long l3, long l4, b b2) {
        this(l2, l3, l4);
    }
}

