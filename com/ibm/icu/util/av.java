/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import java.io.Serializable;

public class av
implements Serializable {
    private static final long h = 2183055795738051443L;
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private static final String[] p = new String[]{"", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    private static final String[] q = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public av(int n2, int n3, int n4, int n5) {
        this.i = 0;
        this.j = n2;
        this.k = n3;
        this.o = n4;
        this.n = n5;
        this.l = 0;
        this.m = 0;
    }

    public av(int n2, int n3, int n4, int n5, int n6) {
        this.i = 1;
        this.j = n2;
        this.m = n3;
        this.l = n4;
        this.o = n5;
        this.n = n6;
        this.k = 0;
    }

    public av(int n2, int n3, int n4, boolean bl2, int n5, int n6) {
        this.i = bl2 ? 2 : 3;
        this.j = n2;
        this.k = n3;
        this.l = n4;
        this.o = n5;
        this.n = n6;
        this.m = 0;
    }

    public int a() {
        return this.i;
    }

    public int b() {
        return this.j;
    }

    public int c() {
        return this.k;
    }

    public int d() {
        return this.l;
    }

    public int e() {
        return this.m;
    }

    public int f() {
        return this.n;
    }

    public int g() {
        return this.o;
    }

    public String toString() {
        String string = null;
        String string2 = null;
        switch (this.i) {
            case 0: {
                string = Integer.toString(this.k);
                break;
            }
            case 1: {
                string = Integer.toString(this.m) + p[this.l];
                break;
            }
            case 2: {
                string = p[this.l] + ">=" + Integer.toString(this.k);
                break;
            }
            case 3: {
                string = p[this.l] + "<=" + Integer.toString(this.k);
            }
        }
        switch (this.n) {
            case 0: {
                string2 = "WALL";
                break;
            }
            case 1: {
                string2 = "STD";
                break;
            }
            case 2: {
                string2 = "UTC";
            }
        }
        int n2 = this.o;
        int n3 = n2 % 1000;
        int n4 = (n2 /= 1000) % 60;
        int n5 = (n2 /= 60) % 60;
        int n6 = n2 / 60;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("month=");
        stringBuilder.append(q[this.j]);
        stringBuilder.append(", date=");
        stringBuilder.append(string);
        stringBuilder.append(", time=");
        stringBuilder.append(n6);
        stringBuilder.append(":");
        stringBuilder.append(n5 / 10);
        stringBuilder.append(n5 % 10);
        stringBuilder.append(":");
        stringBuilder.append(n4 / 10);
        stringBuilder.append(n4 % 10);
        stringBuilder.append(".");
        stringBuilder.append(n3 / 100);
        stringBuilder.append(n3 / 10 % 10);
        stringBuilder.append(n3 % 10);
        stringBuilder.append("(");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

