/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import org.apache.commons.compress.archivers.h.ab;
import org.apache.commons.compress.archivers.h.ah;

final class ai {
    private final ab a;
    private long b = 0L;
    private long c = 0L;
    private long d = 0L;
    private boolean e = false;
    private boolean f;

    private ai(ab ab2) {
        this.a = ab2;
    }

    static /* synthetic */ boolean a(ai ai2) {
        return ai2.f;
    }

    static /* synthetic */ ab b(ai ai2) {
        return ai2.a;
    }

    static /* synthetic */ long c(ai ai2) {
        return ai2.c;
    }

    static /* synthetic */ long d(ai ai2) {
        return ai2.d;
    }

    static /* synthetic */ long e(ai ai2) {
        return ai2.b;
    }

    static /* synthetic */ boolean f(ai ai2) {
        return ai2.e;
    }

    /* synthetic */ ai(ab ab2, ah ah2) {
        this(ab2);
    }

    static /* synthetic */ boolean a(ai ai2, boolean bl2) {
        ai2.f = bl2;
        return ai2.f;
    }

    static /* synthetic */ long a(ai ai2, long l2) {
        return ai2.d += l2;
    }

    static /* synthetic */ long b(ai ai2, long l2) {
        ai2.b = l2;
        return ai2.b;
    }

    static /* synthetic */ long c(ai ai2, long l2) {
        ai2.c = l2;
        return ai2.c;
    }

    static /* synthetic */ boolean b(ai ai2, boolean bl2) {
        ai2.e = bl2;
        return ai2.e;
    }
}

