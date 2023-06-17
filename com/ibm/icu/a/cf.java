/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

public class cf {
    private final String a;

    public cf(String string) {
        this.a = string;
    }

    public final String i() {
        return this.a;
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.c();
    }

    public String e() {
        return "/" + this.d();
    }

    public boolean h() {
        return false;
    }

    public boolean a(String string) {
        return this.c().equals(string);
    }
}

