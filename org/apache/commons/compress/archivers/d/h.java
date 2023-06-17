/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.d;

import org.apache.commons.compress.archivers.d.d;

class h {
    private d a;
    private int b;
    private int c;
    private int d;
    private int e;
    private final byte[] f = new byte[512];

    h() {
    }

    public d a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    void a(int n2) {
        this.c = n2;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public int b(int n2) {
        return this.f[n2];
    }

    static /* synthetic */ d a(h h2, d d2) {
        h2.a = d2;
        return h2.a;
    }

    static /* synthetic */ int a(h h2, int n2) {
        h2.b = n2;
        return h2.b;
    }

    static /* synthetic */ int b(h h2, int n2) {
        h2.c = n2;
        return h2.c;
    }

    static /* synthetic */ int c(h h2, int n2) {
        h2.d = n2;
        return h2.d;
    }

    static /* synthetic */ int d(h h2, int n2) {
        h2.e = n2;
        return h2.e;
    }

    static /* synthetic */ int a(h h2) {
        return h2.d;
    }

    static /* synthetic */ int b(h h2) {
        return h2.e++;
    }

    static /* synthetic */ byte[] c(h h2) {
        return h2.f;
    }
}

