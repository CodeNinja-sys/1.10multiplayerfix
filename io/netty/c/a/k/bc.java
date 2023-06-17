/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.c.a.k.ba;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

final class bc {
    private final byte a;
    private boolean b;
    private boolean c;
    private boolean d;
    private final AtomicInteger e;
    private final AtomicInteger f;
    private int g;
    private final Queue h = new ConcurrentLinkedQueue();

    bc(byte by2, boolean bl2, boolean bl3, int n2, int n3) {
        this.a = by2;
        this.b = bl2;
        this.c = bl3;
        this.e = new AtomicInteger(n2);
        this.f = new AtomicInteger(n3);
    }

    byte a() {
        return this.a;
    }

    boolean b() {
        return this.b;
    }

    void c() {
        this.b = true;
    }

    boolean d() {
        return this.c;
    }

    void e() {
        this.c = true;
    }

    boolean f() {
        return this.d;
    }

    void g() {
        this.d = true;
    }

    int h() {
        return this.e.get();
    }

    int a(int n2) {
        return this.e.addAndGet(n2);
    }

    int b(int n2) {
        return this.f.addAndGet(n2);
    }

    int i() {
        return this.g;
    }

    void c(int n2) {
        this.g = n2;
    }

    boolean a(ba ba2) {
        return this.h.offer(ba2);
    }

    ba j() {
        return (ba)this.h.peek();
    }

    ba k() {
        return (ba)this.h.poll();
    }

    void a(Throwable throwable) {
        ba ba2;
        while ((ba2 = (ba)this.h.poll()) != null) {
            ba2.a(throwable);
        }
    }
}

