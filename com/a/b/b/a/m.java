/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.an;
import com.a.b.ap;
import com.a.b.b.a.n;
import com.a.b.b.w;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.e;
import com.a.b.k;
import java.util.ArrayList;

public final class m
extends an {
    public static final ap a = new n();
    private final k b;

    private m(k k2) {
        this.b = k2;
    }

    public Object a(a a2) {
        d d2 = a2.f();
        switch (d2) {
            case a: {
                ArrayList<Object> arrayList = new ArrayList<Object>();
                a2.a();
                while (a2.e()) {
                    arrayList.add(this.a(a2));
                }
                a2.b();
                return arrayList;
            }
            case c: {
                w w2 = new w();
                a2.c();
                while (a2.e()) {
                    w2.put(a2.g(), this.a(a2));
                }
                a2.d();
                return w2;
            }
            case f: {
                return a2.h();
            }
            case g: {
                return a2.k();
            }
            case h: {
                return a2.i();
            }
            case i: {
                a2.j();
                return null;
            }
        }
        throw new IllegalStateException();
    }

    public void a(e e2, Object object) {
        if (object == null) {
            e2.f();
            return;
        }
        an an2 = this.b.a(object.getClass());
        if (an2 instanceof m) {
            e2.d();
            e2.e();
            return;
        }
        an2.a(e2, object);
    }

    /* synthetic */ m(k k2, n n2) {
        this(k2);
    }
}

