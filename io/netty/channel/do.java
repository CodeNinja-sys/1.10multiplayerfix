/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.an;
import io.netty.channel.ar;
import io.netty.channel.av;
import io.netty.channel.bw;
import io.netty.channel.cn;
import io.netty.channel.cr;
import io.netty.channel.ct;
import io.netty.channel.cu;
import io.netty.channel.dm;
import io.netty.channel.dp;
import io.netty.util.b.ab;
import io.netty.util.b.ac;
import io.netty.util.b.ad;
import io.netty.util.b.af;
import io.netty.util.b.au;
import io.netty.util.b.l;
import io.netty.util.b.w;
import io.netty.util.c.d;
import io.netty.util.c.u;
import io.netty.util.c.z;
import java.util.Collections;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class do
extends io.netty.util.b.d
implements ct {
    private final Object[] d;
    private final int e;
    final ThreadFactory a;
    final Set b = Collections.newSetFromMap(u.m());
    final Queue c = new ConcurrentLinkedQueue();
    private final ar f;
    private volatile boolean g;
    private final au h = new l(af.a);
    private final ac i = new dp(this);

    protected do() {
        this(0);
    }

    protected do(int n2) {
        this(n2, Executors.defaultThreadFactory(), new Object[0]);
    }

    protected do(int n2, ThreadFactory threadFactory, Object ... arrobject) {
        if (n2 < 0) {
            throw new IllegalArgumentException(String.format("maxChannels: %d (expected: >= 0)", n2));
        }
        if (threadFactory == null) {
            throw new NullPointerException("threadFactory");
        }
        this.d = arrobject == null ? io.netty.util.c.d.h : (Object[])arrobject.clone();
        this.e = n2;
        this.a = threadFactory;
        this.f = new ar("too many channels (max: " + n2 + ')');
        this.f.setStackTrace(io.netty.util.c.d.k);
    }

    protected dm a(Object ... arrobject) {
        return new dm(this);
    }

    @Override
    public Iterator iterator() {
        return new z(this.b.iterator());
    }

    @Override
    public cr b() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ab a(long l2, long l3, TimeUnit timeUnit) {
        this.g = true;
        for (cr cr2 : this.b) {
            cr2.a(l2, l3, timeUnit);
        }
        for (cr cr2 : this.c) {
            cr2.a(l2, l3, timeUnit);
        }
        if (this.isTerminated()) {
            this.h.a_((Object)null);
        }
        return this.bs_();
    }

    @Override
    public ab bs_() {
        return this.h;
    }

    @Override
    public void shutdown() {
        this.g = true;
        for (cr cr2 : this.b) {
            cr2.shutdown();
        }
        for (cr cr2 : this.c) {
            cr2.shutdown();
        }
        if (this.isTerminated()) {
            this.h.a_((Object)null);
        }
    }

    @Override
    public boolean br_() {
        for (cr cr2 : this.b) {
            if (cr2.br_()) continue;
            return false;
        }
        for (cr cr2 : this.c) {
            if (cr2.br_()) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean isShutdown() {
        for (cr cr2 : this.b) {
            if (cr2.isShutdown()) continue;
            return false;
        }
        for (cr cr2 : this.c) {
            if (cr2.isShutdown()) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean isTerminated() {
        for (cr cr2 : this.b) {
            if (cr2.isTerminated()) continue;
            return false;
        }
        for (cr cr2 : this.c) {
            if (cr2.isTerminated()) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean awaitTermination(long l2, TimeUnit timeUnit) {
        long l3;
        long l4 = System.nanoTime() + timeUnit.toNanos(l2);
        for (cr cr2 : this.b) {
            do {
                if ((l3 = l4 - System.nanoTime()) > 0L) continue;
                return this.isTerminated();
            } while (!cr2.awaitTermination(l3, TimeUnit.NANOSECONDS));
        }
        for (cr cr2 : this.c) {
            do {
                if ((l3 = l4 - System.nanoTime()) > 0L) continue;
                return this.isTerminated();
            } while (!cr2.awaitTermination(l3, TimeUnit.NANOSECONDS));
        }
        return this.isTerminated();
    }

    @Override
    public av a(an an2) {
        if (an2 == null) {
            throw new NullPointerException("channel");
        }
        try {
            cr cr2 = this.e();
            return cr2.a(an2, new cn(an2, cr2));
        }
        catch (Throwable throwable) {
            return new cu(an2, af.a, throwable);
        }
    }

    @Override
    public av a(an an2, bw bw2) {
        if (an2 == null) {
            throw new NullPointerException("channel");
        }
        try {
            return this.e().a(an2, bw2);
        }
        catch (Throwable throwable) {
            bw2.a(throwable);
            return bw2;
        }
    }

    private cr e() {
        if (this.g) {
            throw new RejectedExecutionException("shutting down");
        }
        dm dm2 = (dm)this.c.poll();
        if (dm2 == null) {
            if (this.e > 0 && this.b.size() >= this.e) {
                throw this.f;
            }
            dm2 = this.a(this.d);
            dm2.bs_().a_((ad)this.i);
        }
        this.b.add(dm2);
        return dm2;
    }

    @Override
    public /* synthetic */ w c() {
        return this.b();
    }

    static /* synthetic */ au a(do do_) {
        return do_.h;
    }
}

