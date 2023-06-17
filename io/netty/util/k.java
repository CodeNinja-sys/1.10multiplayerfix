/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.ak;
import io.netty.util.al;
import io.netty.util.am;
import io.netty.util.c.ad;
import io.netty.util.c.l;
import io.netty.util.c.u;
import io.netty.util.h;
import io.netty.util.j;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

final class k
extends l
implements ak {
    private static final int e = 0;
    private static final int f = 1;
    private static final int g = 2;
    private static final AtomicIntegerFieldUpdater h;
    private final h i;
    private final am j;
    private final long k;
    private volatile int l = 0;
    long a;
    k b;
    k c;
    j d;

    k(h h2, am am2, long l2) {
        this.i = h2;
        this.j = am2;
        this.k = l2;
    }

    @Override
    public al a() {
        return this.i;
    }

    @Override
    public am c() {
        return this.j;
    }

    @Override
    public boolean d() {
        if (!this.a(0, 1)) {
            return false;
        }
        io.netty.util.h.g(this.i).add(new io.netty.util.l(this));
        return true;
    }

    public boolean a(int n2, int n3) {
        return h.compareAndSet(this, n2, n3);
    }

    public int e() {
        return this.l;
    }

    @Override
    public boolean f() {
        return this.e() == 1;
    }

    @Override
    public boolean g() {
        return this.e() == 2;
    }

    public k h() {
        return this;
    }

    public void i() {
        block3: {
            if (!this.a(0, 2)) {
                return;
            }
            try {
                this.j.a(this);
            }
            catch (Throwable throwable) {
                if (!io.netty.util.h.a.f()) break block3;
                io.netty.util.h.a.d("An exception was thrown by " + am.class.getSimpleName() + '.', throwable);
            }
        }
    }

    public String toString() {
        long l2 = System.nanoTime();
        long l3 = this.k - l2 + io.netty.util.h.a(this.i);
        StringBuilder stringBuilder = new StringBuilder(192);
        stringBuilder.append(ad.a(this));
        stringBuilder.append('(');
        stringBuilder.append("deadline: ");
        if (l3 > 0L) {
            stringBuilder.append(l3);
            stringBuilder.append(" ns later");
        } else if (l3 < 0L) {
            stringBuilder.append(-l3);
            stringBuilder.append(" ns ago");
        } else {
            stringBuilder.append("now");
        }
        if (this.f()) {
            stringBuilder.append(", cancelled");
        }
        stringBuilder.append(", task: ");
        stringBuilder.append(this.c());
        return stringBuilder.append(')').toString();
    }

    @Override
    public /* synthetic */ Object b() {
        return this.h();
    }

    static /* synthetic */ long a(k k2) {
        return k2.k;
    }

    static {
        AtomicIntegerFieldUpdater<k> atomicIntegerFieldUpdater = u.b(k.class, "state");
        if (atomicIntegerFieldUpdater == null) {
            atomicIntegerFieldUpdater = AtomicIntegerFieldUpdater.newUpdater(k.class, "l");
        }
        h = atomicIntegerFieldUpdater;
    }
}

