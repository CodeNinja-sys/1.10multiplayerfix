/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.b.g;
import io.netty.b.i;
import io.netty.channel.a;
import io.netty.channel.an;
import io.netty.channel.bk;
import io.netty.channel.bl;
import io.netty.channel.bm;
import io.netty.channel.bo;
import io.netty.channel.bv;
import io.netty.channel.bw;
import io.netty.channel.cv;
import io.netty.channel.dq;
import io.netty.util.b.z;
import io.netty.util.c.b.h;
import io.netty.util.c.f;
import io.netty.util.c.u;
import io.netty.util.x;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public final class bj {
    private static final io.netty.util.c.b.g b = io.netty.util.c.b.h.a(bj.class);
    private static final z c = new bk();
    private final an d;
    private bm e;
    private bm f;
    private bm g;
    private int h;
    private int i;
    private long j;
    private boolean k;
    private static final AtomicLongFieldUpdater l;
    private volatile long m;
    private static final AtomicIntegerFieldUpdater n;
    private volatile int o = 1;

    bj(a a2) {
        this.d = a2;
    }

    public void a(Object object, int n2, bw bw2) {
        bm bm2 = bm.a(object, n2, bj.a(object), bw2);
        if (this.g == null) {
            this.e = null;
            this.g = bm2;
        } else {
            bm bm3 = this.g;
            bm3.a = bm2;
            this.g = bm2;
        }
        if (this.f == null) {
            this.f = bm2;
        }
        this.a(n2);
    }

    public void a() {
        bm bm2 = this.f;
        if (bm2 != null) {
            if (this.e == null) {
                this.e = bm2;
            }
            do {
                ++this.h;
                if (bm2.e.bn_()) continue;
                int n2 = bm2.a();
                this.b(n2);
            } while ((bm2 = bm2.a) != null);
            this.f = null;
        }
    }

    void a(long l2) {
        if (l2 == 0L) {
            return;
        }
        long l3 = l.addAndGet(this, l2);
        if (l3 > (long)this.d.G().i() && n.compareAndSet(this, 1, 0)) {
            this.d.c().o();
        }
    }

    void b(long l2) {
        if (l2 == 0L) {
            return;
        }
        long l3 = l.addAndGet(this, -l2);
        if ((l3 == 0L || l3 < (long)this.d.G().j()) && n.compareAndSet(this, 0, 1)) {
            this.d.c().o();
        }
    }

    private static long a(Object object) {
        if (object instanceof g) {
            return ((g)object).r();
        }
        if (object instanceof cv) {
            return ((cv)object).b();
        }
        if (object instanceof i) {
            return ((i)object).a().r();
        }
        return -1L;
    }

    public Object b() {
        bm bm2 = this.e;
        if (bm2 == null) {
            return null;
        }
        return bm2.b;
    }

    public void c(long l2) {
        bm bm2 = this.e;
        assert (bm2 != null);
        bw bw2 = bm2.e;
        if (bw2 instanceof bv) {
            long l3;
            bm2.f = l3 = bm2.f + l2;
            ((bv)bw2).c(l3, bm2.g);
        }
    }

    public boolean c() {
        bm bm2 = this.e;
        if (bm2 == null) {
            return false;
        }
        Object object = bm2.b;
        bw bw2 = bm2.e;
        int n2 = bm2.h;
        this.a(bm2);
        if (!bm2.j) {
            x.c(object);
            bj.a(bw2);
            this.b(n2);
        }
        bm2.b();
        return true;
    }

    public boolean a(Throwable throwable) {
        bm bm2 = this.e;
        if (bm2 == null) {
            return false;
        }
        Object object = bm2.b;
        bw bw2 = bm2.e;
        int n2 = bm2.h;
        this.a(bm2);
        if (!bm2.j) {
            x.c(object);
            bj.a(bw2, throwable);
            this.b(n2);
        }
        bm2.b();
        return true;
    }

    private void a(bm bm2) {
        if (--this.h == 0) {
            this.e = null;
            if (bm2 == this.g) {
                this.g = null;
                this.f = null;
            }
        } else {
            this.e = bm2.a;
        }
    }

    public void d(long l2) {
        block4: {
            int n2;
            g g2;
            while (true) {
                Object object;
                if (!((object = this.b()) instanceof g)) {
                    assert (l2 == 0L);
                    break block4;
                }
                g2 = (g)object;
                n2 = g2.p();
                int n3 = g2.q() - n2;
                if ((long)n3 > l2) break;
                if (l2 != 0L) {
                    this.c(n3);
                    l2 -= (long)n3;
                }
                this.c();
            }
            if (l2 == 0L) break block4;
            g2.g(n2 + (int)l2);
            this.c(l2);
        }
    }

    public ByteBuffer[] d() {
        long l2 = 0L;
        int n2 = 0;
        f f2 = io.netty.util.c.f.b();
        ByteBuffer[] arrbyteBuffer = (ByteBuffer[])c.a(f2);
        bm bm2 = this.e;
        while (this.b(bm2) && bm2.b instanceof g) {
            if (!bm2.j) {
                g g2 = (g)bm2.b;
                int n3 = g2.p();
                int n4 = g2.q() - n3;
                if (n4 > 0) {
                    Object object;
                    int n5;
                    l2 += (long)n4;
                    int n6 = bm2.i;
                    if (n6 == -1) {
                        bm2.i = n6 = g2.T();
                    }
                    if ((n5 = n2 + n6) > arrbyteBuffer.length) {
                        arrbyteBuffer = bj.a(arrbyteBuffer, n5, n2);
                        c.a(f2, arrbyteBuffer);
                    }
                    if (n6 == 1) {
                        object = bm2.d;
                        if (object == null) {
                            object = g2.k(n3, n4);
                            bm2.d = object;
                        }
                        arrbyteBuffer[n2++] = object;
                    } else {
                        object = bm2.c;
                        if (object == null) {
                            object = g2.V();
                            bm2.c = object;
                        }
                        n2 = bj.a(object, arrbyteBuffer, n2);
                    }
                }
            }
            bm2 = bm2.a;
        }
        this.i = n2;
        this.j = l2;
        return arrbyteBuffer;
    }

    private static int a(ByteBuffer[] arrbyteBuffer, ByteBuffer[] arrbyteBuffer2, int n2) {
        for (ByteBuffer byteBuffer : arrbyteBuffer) {
            if (byteBuffer == null) break;
            arrbyteBuffer2[n2++] = byteBuffer;
        }
        return n2;
    }

    private static ByteBuffer[] a(ByteBuffer[] arrbyteBuffer, int n2, int n3) {
        int n4 = arrbyteBuffer.length;
        do {
            if ((n4 <<= 1) >= 0) continue;
            throw new IllegalStateException();
        } while (n2 > n4);
        ByteBuffer[] arrbyteBuffer2 = new ByteBuffer[n4];
        System.arraycopy(arrbyteBuffer, 0, arrbyteBuffer2, 0, n3);
        return arrbyteBuffer2;
    }

    public int e() {
        return this.i;
    }

    public long f() {
        return this.j;
    }

    boolean g() {
        return this.o != 0;
    }

    public int h() {
        return this.h;
    }

    public boolean i() {
        return this.h == 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void b(Throwable throwable) {
        if (this.k) {
            return;
        }
        try {
            this.k = true;
            while (this.a(throwable)) {
            }
        }
        finally {
            this.k = false;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(ClosedChannelException closedChannelException) {
        if (this.k) {
            this.d.e().execute(new bl(this, closedChannelException));
            return;
        }
        this.k = true;
        if (this.d.H()) {
            throw new IllegalStateException("close() must be invoked after the channel is closed.");
        }
        if (!this.i()) {
            throw new IllegalStateException("close() must be invoked after all flushed writes are handled.");
        }
        try {
            for (bm bm2 = this.f; bm2 != null; bm2 = bm2.c()) {
                int n2 = bm2.h;
                l.addAndGet(this, -n2);
                if (bm2.j) continue;
                x.c(bm2.b);
                bj.a(bm2.e, closedChannelException);
            }
        }
        finally {
            this.k = false;
        }
    }

    private static void a(bw bw2) {
        if (!(bw2 instanceof dq) && !bw2.c()) {
            b.d("Failed to mark a promise as success because it is done already: {}", (Object)bw2);
        }
    }

    private static void a(bw bw2, Throwable throwable) {
        if (!(bw2 instanceof dq) && !bw2.b(throwable)) {
            b.d("Failed to mark a promise as failure because it's done already: {}", (Object)bw2, (Object)throwable);
        }
    }

    public void j() {
    }

    public long k() {
        return this.m;
    }

    public void a(bo bo2) {
        if (bo2 == null) {
            throw new NullPointerException("processor");
        }
        bm bm2 = this.e;
        if (bm2 == null) {
            return;
        }
        do {
            if (bm2.j || bo2.a(bm2.b)) continue;
            return;
        } while (this.b(bm2 = bm2.a));
    }

    private boolean b(bm bm2) {
        return bm2 != null && bm2 != this.f;
    }

    static {
        AtomicIntegerFieldUpdater<bj> atomicIntegerFieldUpdater = u.b(bj.class, "writable");
        if (atomicIntegerFieldUpdater == null) {
            atomicIntegerFieldUpdater = AtomicIntegerFieldUpdater.newUpdater(bj.class, "o");
        }
        n = atomicIntegerFieldUpdater;
        AtomicLongFieldUpdater<bj> atomicLongFieldUpdater = u.c(bj.class, "totalPendingSize");
        if (atomicLongFieldUpdater == null) {
            atomicLongFieldUpdater = AtomicLongFieldUpdater.newUpdater(bj.class, "m");
        }
        l = atomicLongFieldUpdater;
    }
}

