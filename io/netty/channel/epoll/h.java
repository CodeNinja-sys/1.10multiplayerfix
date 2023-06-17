/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.epoll;

import io.netty.channel.a;
import io.netty.channel.ct;
import io.netty.channel.dj;
import io.netty.channel.epoll.Native;
import io.netty.channel.epoll.c;
import io.netty.util.a.d;
import io.netty.util.c.b.g;
import io.netty.util.c.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

final class h
extends dj {
    private static final g d = io.netty.util.c.b.h.a(h.class);
    private static final AtomicIntegerFieldUpdater e;
    private final int f;
    private final int g;
    private final d h = new io.netty.util.a.a();
    private final long[] i;
    private int j;
    private boolean k;
    private volatile int l;
    private volatile int m = 50;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    h(ct ct2, ThreadFactory threadFactory, int n2) {
        super(ct2, threadFactory, false);
        this.i = new long[n2];
        boolean bl2 = false;
        int n3 = -1;
        int n4 = -1;
        try {
            this.f = n3 = Native.epollCreate();
            this.g = n4 = Native.eventFd();
            Native.epollCtlAdd(n3, n4, 1, 0);
            bl2 = true;
        }
        finally {
            if (!bl2) {
                if (n3 != -1) {
                    try {
                        Native.close(n3);
                    }
                    catch (Exception exception) {}
                }
                if (n4 != -1) {
                    try {
                        Native.close(n4);
                    }
                    catch (Exception exception) {}
                }
            }
        }
    }

    private int j() {
        int n2 = this.j;
        if (n2 == Integer.MAX_VALUE) {
            this.k = true;
            n2 = 0;
        }
        if (this.k) {
            while (this.h.c(++n2)) {
            }
            this.j = n2;
        } else {
            this.j = ++n2;
        }
        return n2;
    }

    @Override
    protected void a(boolean bl2) {
        if (!bl2 && e.compareAndSet(this, 0, 1)) {
            Native.eventFdWrite(this.g, 1L);
        }
    }

    void a(io.netty.channel.epoll.a a2) {
        assert (this.bt_());
        int n2 = this.j();
        Native.epollCtlAdd(this.f, a2.e, a2.c, n2);
        a2.f = n2;
        this.h.a(n2, a2);
    }

    void b(io.netty.channel.epoll.a a2) {
        assert (this.bt_());
        Native.epollCtlMod(this.f, a2.e, a2.c, a2.f);
    }

    void c(io.netty.channel.epoll.a a2) {
        assert (this.bt_());
        if (this.h.b(a2.f) != null && a2.H()) {
            Native.epollCtlDel(this.f, a2.e);
        }
    }

    @Override
    protected Queue g() {
        return u.n();
    }

    public int h() {
        return this.m;
    }

    public void a(int n2) {
        if (n2 <= 0 || n2 > 100) {
            throw new IllegalArgumentException("ioRatio: " + n2 + " (expected: 0 < ioRatio <= 100)");
        }
        this.m = n2;
    }

    private int b(boolean bl2) {
        int n2 = 0;
        long l2 = System.nanoTime();
        long l3 = l2 + this.b(l2);
        while (true) {
            int n3;
            long l4;
            if ((l4 = (l3 - l2 + 500000L) / 1000000L) <= 0L) {
                if (n2 != 0 || (n3 = Native.epollWait(this.f, this.i, 0)) <= 0) break;
                return n3;
            }
            n3 = Native.epollWait(this.f, this.i, (int)l4);
            ++n2;
            if (n3 != 0 || bl2 || this.l == 1 || this.s() || this.t()) {
                return n3;
            }
            l2 = System.nanoTime();
        }
        return 0;
    }

    @Override
    protected void e() {
        while (true) {
            boolean bl2 = e.getAndSet(this, 0) == 1;
            try {
                int n2;
                if (this.s()) {
                    n2 = Native.epollWait(this.f, this.i, 0);
                } else {
                    n2 = this.b(bl2);
                    if (this.l == 1) {
                        Native.eventFdWrite(this.g, 1L);
                    }
                }
                int n3 = this.m;
                if (n3 == 100) {
                    if (n2 > 0) {
                        this.a(this.i, n2);
                    }
                    this.v();
                } else {
                    long l2 = System.nanoTime();
                    if (n2 > 0) {
                        this.a(this.i, n2);
                    }
                    long l3 = System.nanoTime() - l2;
                    this.a(l3 * (long)(100 - n3) / (long)n3);
                }
                if (!this.br_()) continue;
                this.l();
                if (!this.x()) continue;
            }
            catch (Throwable throwable) {
                d.d("Unexpected exception in the selector loop.", throwable);
                try {
                    Thread.sleep(1000L);
                }
                catch (InterruptedException interruptedException) {}
                continue;
            }
            break;
        }
    }

    private void l() {
        Native.epollWait(this.f, this.i, 0);
        ArrayList<Object> arrayList = new ArrayList<Object>(this.h.a());
        for (Object object : this.h.d()) {
            arrayList.add(object.c());
        }
        for (Object object : arrayList) {
            ((a)object).t().b(((a)object).t().h());
        }
    }

    private void a(long[] arrl, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = arrl[i2];
            int n3 = (int)(l2 >> 32);
            if (n3 == 0) {
                Native.eventFdRead(this.g);
                continue;
            }
            boolean bl2 = (l2 & 1L) != 0L;
            boolean bl3 = (l2 & 2L) != 0L;
            boolean bl4 = (l2 & 8L) != 0L;
            io.netty.channel.epoll.a a2 = (io.netty.channel.epoll.a)this.h.a(n3);
            if (a2 == null) continue;
            c c2 = (c)a2.t();
            if (bl3 && a2.H()) {
                c2.l();
            }
            if (bl2 && a2.H()) {
                c2.j();
            }
            if (!bl4 || !a2.H()) continue;
            c2.k();
        }
    }

    @Override
    protected void i() {
        try {
            Native.close(this.f);
        }
        catch (IOException iOException) {
            d.d("Failed to close the epoll fd.", iOException);
        }
        try {
            Native.close(this.g);
        }
        catch (IOException iOException) {
            d.d("Failed to close the event fd.", iOException);
        }
    }

    static {
        AtomicIntegerFieldUpdater<h> atomicIntegerFieldUpdater = u.b(h.class, "wakenUp");
        if (atomicIntegerFieldUpdater == null) {
            atomicIntegerFieldUpdater = AtomicIntegerFieldUpdater.newUpdater(h.class, "l");
        }
        e = atomicIntegerFieldUpdater;
    }
}

