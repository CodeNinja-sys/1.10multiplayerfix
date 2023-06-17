/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

public enum i {
    a,
    b,
    c,
    d;


    public boolean a() {
        return this != a;
    }

    public boolean b() {
        return this.ordinal() >= 2;
    }

    public boolean c() {
        return (this.ordinal() & 1) != 0;
    }
}

