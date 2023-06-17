/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

public enum fr {
    a("regionFormat", "({0})"),
    b("fallbackFormat", "{1} ({0})");

    String c;
    String d;

    /*
     * WARNING - void declaration
     */
    private fr() {
        void var4_2;
        void var3_1;
        this.c = var3_1;
        this.d = var4_2;
    }

    String a() {
        return this.c;
    }

    String b() {
        return this.d;
    }
}

