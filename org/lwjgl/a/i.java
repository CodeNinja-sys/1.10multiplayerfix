/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.a;

import org.lwjgl.a.h;

final class i {
    private int a;
    private int b;
    private boolean c;
    private long d;
    private boolean e;

    private i() {
    }

    private void a() {
        this.a = 0;
        this.b = 0;
        this.c = false;
        this.e = false;
    }

    /* synthetic */ i(h h2) {
        this();
    }

    static /* synthetic */ void a(i i2) {
        i2.a();
    }

    static /* synthetic */ boolean b(i i2) {
        return i2.e;
    }

    static /* synthetic */ int a(i i2, int n2) {
        i2.b = n2;
        return i2.b;
    }

    static /* synthetic */ boolean a(i i2, boolean bl2) {
        i2.c = bl2;
        return i2.c;
    }

    static /* synthetic */ int b(i i2, int n2) {
        i2.a = n2;
        return i2.a;
    }

    static /* synthetic */ long a(i i2, long l2) {
        i2.d = l2;
        return i2.d;
    }

    static /* synthetic */ boolean b(i i2, boolean bl2) {
        i2.e = bl2;
        return i2.e;
    }

    static /* synthetic */ int c(i i2) {
        return i2.a;
    }

    static /* synthetic */ int d(i i2) {
        return i2.b;
    }

    static /* synthetic */ boolean e(i i2) {
        return i2.c;
    }

    static /* synthetic */ long f(i i2) {
        return i2.d;
    }
}

