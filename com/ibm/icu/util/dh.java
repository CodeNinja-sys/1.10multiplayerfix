/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.cc;

public class dh
extends cc {
    private String h;
    private static dh[] i = new dh[7];
    private static int j = 0;
    public static dh a = new dh("second");
    public static dh b = new dh("minute");
    public static dh c = new dh("hour");
    public static dh d = new dh("day");
    public static dh e = new dh("week");
    public static dh f = new dh("month");
    public static dh g = new dh("year");

    private dh(String string) {
        this.h = string;
        dh.i[dh.j++] = this;
    }

    public static dh[] a() {
        return (dh[])i.clone();
    }

    public String toString() {
        return this.h;
    }
}

