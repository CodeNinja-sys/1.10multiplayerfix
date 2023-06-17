/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.ab;
import io.netty.util.b.ad;
import io.netty.util.b.af;
import io.netty.util.b.ao;
import io.netty.util.b.ap;
import io.netty.util.b.aq;
import io.netty.util.b.ar;
import io.netty.util.b.au;
import io.netty.util.b.az;
import io.netty.util.b.d;
import io.netty.util.b.l;
import io.netty.util.b.u;
import io.netty.util.b.w;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class an
extends d {
    private final w[] a;
    private final AtomicInteger b = new AtomicInteger();
    private final AtomicInteger c = new AtomicInteger();
    private final au d = new l(af.a);
    private final ap e;

    protected an(int n2, ThreadFactory threadFactory, Object ... arrobject) {
        if (n2 <= 0) {
            throw new IllegalArgumentException(String.format("nThreads: %d (expected: > 0)", n2));
        }
        if (threadFactory == null) {
            threadFactory = this.a();
        }
        this.a = new az[n2];
        this.e = an.a(this.a.length) ? new ar(this, null) : new aq(this, null);
        for (int i2 = 0; i2 < n2; ++i2) {
            boolean bl2 = false;
            try {
                this.a[i2] = this.a(threadFactory, arrobject);
                bl2 = true;
                continue;
            }
            catch (Exception exception) {
                throw new IllegalStateException("failed to create a child event loop", exception);
            }
            finally {
                if (!bl2) {
                    int n3;
                    for (n3 = 0; n3 < i2; ++n3) {
                        this.a[n3].m();
                    }
                    for (n3 = 0; n3 < i2; ++n3) {
                        w w2 = this.a[n3];
                        try {
                            while (!w2.isTerminated()) {
                                w2.awaitTermination(Integer.MAX_VALUE, TimeUnit.SECONDS);
                            }
                            continue;
                        }
                        catch (InterruptedException interruptedException) {
                            Thread.currentThread().interrupt();
                            break;
                        }
                    }
                }
            }
        }
        ao ao2 = new ao(this);
        for (w w3 : this.a) {
            w3.bs_().a_((ad)ao2);
        }
    }

    protected ThreadFactory a() {
        return new u(this.getClass());
    }

    @Override
    public w c() {
        return this.e.a();
    }

    @Override
    public Iterator iterator() {
        return this.g().iterator();
    }

    public final int f() {
        return this.a.length;
    }

    protected Set g() {
        Set set = Collections.newSetFromMap(new LinkedHashMap());
        Collections.addAll(set, this.a);
        return set;
    }

    protected abstract w a(ThreadFactory var1, Object ... var2);

    @Override
    public ab a(long l2, long l3, TimeUnit timeUnit) {
        for (w w2 : this.a) {
            w2.a(l2, l3, timeUnit);
        }
        return this.bs_();
    }

    @Override
    public ab bs_() {
        return this.d;
    }

    @Override
    public void shutdown() {
        for (w w2 : this.a) {
            w2.shutdown();
        }
    }

    @Override
    public boolean br_() {
        for (w w2 : this.a) {
            if (w2.br_()) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean isShutdown() {
        for (w w2 : this.a) {
            if (w2.isShutdown()) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean isTerminated() {
        for (w w2 : this.a) {
            if (w2.isTerminated()) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean awaitTermination(long l2, TimeUnit timeUnit) {
        long l3 = System.nanoTime() + timeUnit.toNanos(l2);
        block0: for (w w2 : this.a) {
            long l4;
            while ((l4 = l3 - System.nanoTime()) > 0L) {
                if (!w2.awaitTermination(l4, TimeUnit.NANOSECONDS)) continue;
                continue block0;
            }
            break block0;
        }
        return this.isTerminated();
    }

    private static boolean a(int n2) {
        return (n2 & -n2) == n2;
    }

    static /* synthetic */ AtomicInteger a(an an2) {
        return an2.c;
    }

    static /* synthetic */ w[] b(an an2) {
        return an2.a;
    }

    static /* synthetic */ au c(an an2) {
        return an2.d;
    }

    static /* synthetic */ AtomicInteger d(an an2) {
        return an2.b;
    }
}

