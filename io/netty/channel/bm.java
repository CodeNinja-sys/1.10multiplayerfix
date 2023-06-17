/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.b.bi;
import io.netty.channel.bk;
import io.netty.channel.bn;
import io.netty.channel.bw;
import io.netty.util.p;
import io.netty.util.t;
import io.netty.util.x;
import java.nio.ByteBuffer;

final class bm {
    private static final p k = new bn();
    private final t l;
    bm a;
    Object b;
    ByteBuffer[] c;
    ByteBuffer d;
    bw e;
    long f;
    long g;
    int h;
    int i = -1;
    boolean j;

    private bm(t t2) {
        this.l = t2;
    }

    static bm a(Object object, int n2, long l2, bw bw2) {
        bm bm2 = (bm)k.a();
        bm2.b = object;
        bm2.h = n2;
        bm2.g = l2;
        bm2.e = bw2;
        return bm2;
    }

    int a() {
        if (!this.j) {
            this.j = true;
            int n2 = this.h;
            x.c(this.b);
            this.b = bi.c;
            this.h = 0;
            this.g = 0L;
            this.f = 0L;
            this.c = null;
            this.d = null;
            return n2;
        }
        return 0;
    }

    void b() {
        this.a = null;
        this.c = null;
        this.d = null;
        this.b = null;
        this.e = null;
        this.f = 0L;
        this.g = 0L;
        this.h = 0;
        this.i = -1;
        this.j = false;
        k.a(this, this.l);
    }

    bm c() {
        bm bm2 = this.a;
        this.b();
        return bm2;
    }

    /* synthetic */ bm(t t2, bk bk2) {
        this(t2);
    }
}

