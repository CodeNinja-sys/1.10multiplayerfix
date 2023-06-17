/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.p;
import io.netty.util.s;
import io.netty.util.u;
import io.netty.util.w;
import java.lang.ref.WeakReference;
import java.util.Arrays;

final class v {
    private static final int a = 16;
    private w b;
    private w c;
    private v d;
    private final WeakReference e;
    private final int f = p.c().getAndIncrement();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    v(u u2, Thread thread) {
        this.b = this.c = new w(null);
        this.e = new WeakReference<Thread>(thread);
        u u3 = u2;
        synchronized (u3) {
            this.d = u.a(u2);
            u.a(u2, this);
        }
    }

    void a(s s2) {
        s.a(s2, this.f);
        w w2 = this.c;
        int n2 = w2.get();
        if (n2 == 16) {
            this.c = w2 = w.a(w2, new w(null));
            n2 = w2.get();
        }
        w.a((w)w2)[n2] = s2;
        s.a(s2, null);
        w2.lazySet(n2 + 1);
    }

    boolean a() {
        return w.b(this.c) != this.c.get();
    }

    boolean a(u u2) {
        int n2;
        int n3;
        w w2 = this.b;
        if (w2 == null) {
            return false;
        }
        if (w.b(w2) == 16) {
            if (w.c(w2) == null) {
                return false;
            }
            this.b = w2 = w.c(w2);
        }
        if ((n3 = w.b(w2)) == (n2 = w2.get())) {
            return false;
        }
        int n4 = n2 - n3;
        if (u.b(u2) + n4 > u.c(u2).length) {
            u.a(u2, Arrays.copyOf(u.c(u2), (u.b(u2) + n4) * 2));
        }
        s[] arrs = w.a(w2);
        s[] arrs2 = u.c(u2);
        int n5 = u.b(u2);
        while (n3 < n2) {
            s s2 = arrs[n3];
            if (s.c(s2) == 0) {
                s.b(s2, s.d(s2));
            } else if (s.c(s2) != s.d(s2)) {
                throw new IllegalStateException("recycled already");
            }
            s.a(s2, u2);
            arrs2[n5++] = s2;
            arrs[n3++] = null;
        }
        u.a(u2, n5);
        if (n2 == 16 && w.c(w2) != null) {
            this.b = w.c(w2);
        }
        w.a(w2, n2);
        return true;
    }

    static /* synthetic */ v a(v v2) {
        return v2.d;
    }

    static /* synthetic */ WeakReference b(v v2) {
        return v2.e;
    }

    static /* synthetic */ v a(v v2, v v3) {
        v2.d = v3;
        return v2.d;
    }
}

