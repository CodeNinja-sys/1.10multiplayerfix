/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.a;

import java.io.InputStream;

class a {
    private final String e;
    private final org.apache.commons.compress.archivers.a f;
    private final InputStream g;
    private final boolean h;
    private final int i;
    static final int a = 1;
    static final int b = 2;
    static final int c = 3;
    static final int d = 4;

    a(String string, int n2) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.e = string;
        this.i = n2;
        this.g = null;
        this.f = null;
        this.h = true;
    }

    a(org.apache.commons.compress.archivers.a a2, InputStream inputStream, boolean bl2) {
        if (a2 == null || inputStream == null) {
            throw new NullPointerException();
        }
        this.f = a2;
        this.g = inputStream;
        this.i = 2;
        this.e = null;
        this.h = bl2;
    }

    org.apache.commons.compress.archivers.a a() {
        return this.f;
    }

    InputStream b() {
        return this.g;
    }

    String c() {
        return this.e;
    }

    int d() {
        return this.i;
    }

    boolean e() {
        return this.h;
    }
}

