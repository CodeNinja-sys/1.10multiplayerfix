/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.c;

import java.io.IOException;

public class ab
extends IOException {
    private static final long a = 1L;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    public ab(String string, String string2, String string3, String string4) {
        this(string, null, null, string2, string3, string4);
    }

    public ab(String string, String string2, String string3, String string4, String string5, String string6) {
        super(string);
        this.e = string2;
        this.f = string3;
        this.b = string4;
        this.c = string5;
        this.d = string6;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.f;
    }
}

