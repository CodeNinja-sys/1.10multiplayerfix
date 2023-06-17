/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.ag;
import com.a.b.an;
import com.a.b.b.a.q;
import com.a.b.b.a.s;
import com.a.b.b.ae;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.e;
import java.util.Map;

public final class r
extends an {
    private final ae a;
    private final Map b;

    private r(ae ae2, Map map) {
        this.a = ae2;
        this.b = map;
    }

    public Object a(a a2) {
        if (a2.f() == d.i) {
            a2.j();
            return null;
        }
        Object object = this.a.a();
        try {
            a2.c();
            while (a2.e()) {
                String string = a2.g();
                s s2 = (s)this.b.get(string);
                if (s2 == null || !s2.i) {
                    a2.n();
                    continue;
                }
                s2.a(a2, object);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw new ag(illegalStateException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError((Object)illegalAccessException);
        }
        a2.d();
        return object;
    }

    public void a(e e2, Object object) {
        if (object == null) {
            e2.f();
            return;
        }
        e2.d();
        try {
            for (s s2 : this.b.values()) {
                if (!s2.h) continue;
                e2.a(s2.g);
                s2.a(e2, object);
            }
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError();
        }
        e2.e();
    }

    /* synthetic */ r(ae ae2, Map map, q q2) {
        this(ae2, map);
    }
}

