/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.io.InputStream;
import java.util.zip.CRC32;
import org.apache.commons.compress.archivers.h.ab;
import org.apache.commons.compress.archivers.h.ad;

final class af {
    private final ab a = new ab();
    private boolean b;
    private boolean c;
    private long d;
    private long e;
    private final CRC32 f = new CRC32();
    private InputStream g;

    private af() {
    }

    /* synthetic */ af(ad ad2) {
        this();
    }

    static /* synthetic */ ab a(af af2) {
        return af2.a;
    }

    static /* synthetic */ boolean a(af af2, boolean bl2) {
        af2.b = bl2;
        return af2.b;
    }

    static /* synthetic */ boolean b(af af2) {
        return af2.b;
    }

    static /* synthetic */ InputStream a(af af2, InputStream inputStream) {
        af2.g = inputStream;
        return af2.g;
    }

    static /* synthetic */ boolean b(af af2, boolean bl2) {
        af2.c = bl2;
        return af2.c;
    }

    static /* synthetic */ InputStream c(af af2) {
        return af2.g;
    }

    static /* synthetic */ CRC32 d(af af2) {
        return af2.f;
    }

    static /* synthetic */ long e(af af2) {
        return af2.d;
    }

    static /* synthetic */ long a(af af2, long l2) {
        return af2.e += l2;
    }

    static /* synthetic */ long b(af af2, long l2) {
        return af2.d += l2;
    }

    static /* synthetic */ long f(af af2) {
        return af2.e;
    }

    static /* synthetic */ boolean g(af af2) {
        return af2.c;
    }

    static /* synthetic */ long h(af af2) {
        return af2.e++;
    }
}

