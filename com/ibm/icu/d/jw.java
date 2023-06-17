/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import java.text.ParseException;

public class jw
extends ParseException {
    static final long a = 7160264827701651255L;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    public static final int l = 10;
    public static final int m = 11;
    private int o;
    private int p;
    private StringBuffer q = new StringBuffer();
    private StringBuffer r = new StringBuffer();
    private static final int s = 16;

    public jw(String string, int n2) {
        super(string, -1);
        this.o = n2;
        this.p = 0;
    }

    public jw(String string, int n2, String string2, int n3) {
        super(string, -1);
        this.o = n2;
        this.c(string2, n3);
        this.p = 0;
    }

    public jw(String string, int n2, String string2, int n3, int n4) {
        super(string, -1);
        this.o = n2;
        this.c(string2, n3);
        this.p = n4;
    }

    public boolean equals(Object object) {
        if (!(object instanceof jw)) {
            return false;
        }
        return ((jw)object).o == this.o;
    }

    public int hashCode() {
        assert (false) : "hashCode not designed";
        return 42;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.getMessage());
        stringBuilder.append(". line:  ");
        stringBuilder.append(this.p);
        stringBuilder.append(". preContext:  ");
        stringBuilder.append(this.q);
        stringBuilder.append(". postContext: ");
        stringBuilder.append(this.r);
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    private void a(String string, int n2) {
        this.a(string.toCharArray(), n2);
    }

    private void a(char[] arrc, int n2) {
        int n3 = n2 <= 16 ? 0 : n2 - 15;
        int n4 = n3 <= 16 ? n3 : 16;
        this.q.append(arrc, n3, n4);
    }

    private void b(String string, int n2) {
        this.b(string.toCharArray(), n2);
    }

    private void b(char[] arrc, int n2) {
        int n3 = n2;
        int n4 = arrc.length - n3;
        this.r.append(arrc, n3, n4);
    }

    private void c(String string, int n2) {
        this.a(string, n2);
        this.b(string, n2);
    }

    public int a() {
        return this.o;
    }
}

