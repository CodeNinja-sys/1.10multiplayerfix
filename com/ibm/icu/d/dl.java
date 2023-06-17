/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.dd;

public class dl {
    private final String a;
    private final int b;

    public dl(String string) {
        this(string, false);
    }

    public dl(String string, boolean bl2) {
        this.b = dd.a(string, bl2);
        if (this.b < 0) {
            throw new IllegalArgumentException("Illegal datetime field:\t" + string);
        }
        this.a = string;
    }

    public int a() {
        return dd.k()[this.b][1];
    }

    public static String a(int n2) {
        try {
            return dd.l()[n2];
        }
        catch (Exception exception) {
            return String.valueOf(n2);
        }
    }

    public boolean b() {
        return dd.k()[this.b][2] > 0;
    }

    private int c() {
        return this.b;
    }

    public String toString() {
        return this.a;
    }

    static /* synthetic */ int a(dl dl2) {
        return dl2.c();
    }
}

