/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.c.u;
import io.netty.util.h;
import io.netty.util.i;
import io.netty.util.j;
import io.netty.util.k;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class m
implements Runnable {
    private final Set b = new HashSet();
    private long c;
    final /* synthetic */ h a;

    private m(h h2) {
        this.a = h2;
    }

    @Override
    public void run() {
        j j2;
        int n2;
        h.a(this.a, System.nanoTime());
        if (h.a(this.a) == 0L) {
            h.a(this.a, 1L);
        }
        h.b(this.a).countDown();
        do {
            long l2;
            if ((l2 = this.d()) <= 0L) continue;
            n2 = (int)(this.c & (long)h.c(this.a));
            this.c();
            j2 = h.d(this.a)[n2];
            this.b();
            j2.a(l2);
            ++this.c;
        } while (h.c().get(this.a) == 1);
        Object object = h.d(this.a);
        int n3 = ((j[])object).length;
        for (n2 = 0; n2 < n3; ++n2) {
            j2 = object[n2];
            j2.a(this.b);
        }
        while ((object = (k)h.e(this.a).poll()) != null) {
            if (((k)object).f()) continue;
            this.b.add(object);
        }
        this.c();
    }

    private void b() {
        k k2;
        for (int i2 = 0; i2 < 100000 && (k2 = (k)h.e(this.a).poll()) != null; ++i2) {
            if (k2.e() == 1) continue;
            long l2 = k.a(k2) / h.f(this.a);
            k2.a = (l2 - this.c) / (long)h.d(this.a).length;
            long l3 = Math.max(l2, this.c);
            int n2 = (int)(l3 & (long)h.c(this.a));
            j j2 = h.d(this.a)[n2];
            j2.a(k2);
        }
    }

    private void c() {
        Runnable runnable;
        while ((runnable = (Runnable)h.g(this.a).poll()) != null) {
            try {
                runnable.run();
            }
            catch (Throwable throwable) {
                if (!h.a.f()) continue;
                h.a.d("An exception was thrown while process a cancellation task", throwable);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private long d() {
        long l2 = h.f(this.a) * (this.c + 1L);
        while (true) {
            long l3;
            long l4;
            if ((l4 = (l2 - (l3 = System.nanoTime() - h.a(this.a)) + 999999L) / 1000000L) <= 0L) {
                if (l3 != Long.MIN_VALUE) return l3;
                return -9223372036854775807L;
            }
            if (u.b()) {
                l4 = l4 / 10L * 10L;
            }
            try {
                Thread.sleep(l4);
                continue;
            }
            catch (InterruptedException interruptedException) {
                if (h.c().get(this.a) == 2) return Long.MIN_VALUE;
                continue;
            }
            break;
        }
    }

    public Set a() {
        return Collections.unmodifiableSet(this.b);
    }

    /* synthetic */ m(h h2, i i2) {
        this(h2);
    }
}

