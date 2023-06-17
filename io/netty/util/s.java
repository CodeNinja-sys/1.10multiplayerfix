/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.p;
import io.netty.util.t;
import io.netty.util.u;
import io.netty.util.v;
import java.util.Map;

final class s
implements t {
    private int a;
    private int b;
    private u c;
    private Object d;

    s(u u2) {
        this.c = u2;
    }

    public void a() {
        Thread thread = Thread.currentThread();
        if (thread == this.c.b) {
            this.c.a(this);
            return;
        }
        Map map = (Map)p.b().f();
        v v2 = (v)map.get(this.c);
        if (v2 == null) {
            v2 = new v(this.c, thread);
            map.put(this.c, v2);
        }
        v2.a(this);
    }

    static /* synthetic */ Object a(s s2, Object object) {
        s2.d = object;
        return s2.d;
    }

    static /* synthetic */ Object a(s s2) {
        return s2.d;
    }

    static /* synthetic */ u b(s s2) {
        return s2.c;
    }

    static /* synthetic */ int a(s s2, int n2) {
        s2.a = n2;
        return s2.a;
    }

    static /* synthetic */ u a(s s2, u u2) {
        s2.c = u2;
        return s2.c;
    }

    static /* synthetic */ int c(s s2) {
        return s2.b;
    }

    static /* synthetic */ int b(s s2, int n2) {
        s2.b = n2;
        return s2.b;
    }

    static /* synthetic */ int d(s s2) {
        return s2.a;
    }
}

