/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.p;
import io.netty.util.s;
import io.netty.util.v;
import java.util.Arrays;

final class u {
    final p a;
    final Thread b;
    private s[] c;
    private final int d;
    private int e;
    private volatile v f;
    private v g;
    private v h;

    u(p p2, Thread thread, int n2) {
        this.a = p2;
        this.b = thread;
        this.d = n2;
        this.c = new s[p.d()];
    }

    s a() {
        s s2;
        int n2 = this.e;
        if (n2 == 0) {
            if (!this.b()) {
                return null;
            }
            n2 = this.e;
        }
        if (s.d(s2 = this.c[--n2]) != s.c(s2)) {
            throw new IllegalStateException("recycled multiple times");
        }
        s.b(s2, 0);
        s.a(s2, 0);
        this.e = n2;
        return s2;
    }

    boolean b() {
        if (this.c()) {
            return true;
        }
        this.h = null;
        this.g = this.f;
        return false;
    }

    boolean c() {
        boolean bl2 = false;
        v v2 = this.g;
        v v3 = this.h;
        while (v2 != null) {
            if (v2.a(this)) {
                bl2 = true;
                break;
            }
            v v4 = v.a(v2);
            if (v.b(v2).get() == null) {
                if (v2.a()) {
                    while (v2.a(this)) {
                    }
                }
                if (v3 != null) {
                    v.a(v3, v4);
                }
            } else {
                v3 = v2;
            }
            v2 = v4;
        }
        this.h = v3;
        this.g = v2;
        return bl2;
    }

    void a(s s2) {
        if ((s.c(s2) | s.d(s2)) != 0) {
            throw new IllegalStateException("recycled already");
        }
        s.b(s2, s.a(s2, p.e()));
        int n2 = this.e;
        if (n2 == this.c.length) {
            if (n2 == this.d) {
                return;
            }
            this.c = Arrays.copyOf(this.c, n2 << 1);
        }
        this.c[n2] = s2;
        this.e = n2 + 1;
    }

    s d() {
        return new s(this);
    }

    static /* synthetic */ v a(u u2) {
        return u2.f;
    }

    static /* synthetic */ v a(u u2, v v2) {
        u2.f = v2;
        return u2.f;
    }

    static /* synthetic */ int b(u u2) {
        return u2.e;
    }

    static /* synthetic */ s[] c(u u2) {
        return u2.c;
    }

    static /* synthetic */ s[] a(u u2, s[] arrs) {
        u2.c = arrs;
        return arrs;
    }

    static /* synthetic */ int a(u u2, int n2) {
        u2.e = n2;
        return u2.e;
    }
}

