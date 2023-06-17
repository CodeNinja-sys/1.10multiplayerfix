/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.ay;
import com.sun.jna.bd;
import java.util.Date;

public class ea
extends bd {
    public int a;
    public int b;
    private static final long c = 11644473600000L;

    public ea(Date date) {
        long l2 = ea.a(date);
        this.b = (int)(l2 >> 32 & 0xFFFFFFFFL);
        this.a = (int)(l2 & 0xFFFFFFFFL);
    }

    public ea() {
    }

    public ea(ay ay2) {
        super(ay2);
        this.j();
    }

    public static Date a(int n2, int n3) {
        long l2 = (long)n2 << 32 | (long)n3 & 0xFFFFFFFFL;
        long l3 = l2 / 10000L;
        long l4 = l3 - 11644473600000L;
        return new Date(l4);
    }

    public static long a(Date date) {
        long l2 = date.getTime();
        long l3 = l2 + 11644473600000L;
        return l3 * 1000L * 10L;
    }

    public Date s() {
        return ea.a(this.b, this.a);
    }

    public long t() {
        return this.s().getTime();
    }

    public String toString() {
        return super.toString() + ": " + this.s().toString();
    }
}

