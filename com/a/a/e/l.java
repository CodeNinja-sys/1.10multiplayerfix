/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.e;

import com.a.a.b.cl;
import com.a.a.e.g;
import com.a.a.e.j;
import com.a.a.e.m;
import java.util.HashMap;
import java.util.Map;

public final class l {
    private final Map a = new HashMap();
    private char b = '\u0000';
    private char c = (char)65535;
    private String d = null;

    private l() {
    }

    public l a(char c2, char c3) {
        this.b = c2;
        this.c = c3;
        return this;
    }

    public l a(String string) {
        this.d = string;
        return this;
    }

    public l a(char c2, String string) {
        cl.a(string);
        this.a.put(Character.valueOf(c2), string);
        return this;
    }

    public g a() {
        return new m(this, this.a, this.b, this.c);
    }

    /* synthetic */ l(j j2) {
        this();
    }

    static /* synthetic */ String a(l l2) {
        return l2.d;
    }
}

