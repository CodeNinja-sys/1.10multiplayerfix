/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.an;
import com.a.b.b.a.x;
import com.a.b.b.ae;
import com.a.b.d.a;
import com.a.b.d.e;
import com.a.b.k;
import java.lang.reflect.Type;
import java.util.Collection;

final class d
extends an {
    private final an a;
    private final ae b;

    public d(k k2, Type type, an an2, ae ae2) {
        this.a = new x(k2, an2, type);
        this.b = ae2;
    }

    public Collection b(a a2) {
        if (a2.f() == com.a.b.d.d.i) {
            a2.j();
            return null;
        }
        Collection collection = (Collection)this.b.a();
        a2.a();
        while (a2.e()) {
            Object object = this.a.a(a2);
            collection.add(object);
        }
        a2.b();
        return collection;
    }

    public void a(e e2, Collection collection) {
        if (collection == null) {
            e2.f();
            return;
        }
        e2.b();
        for (Object e3 : collection) {
            this.a.a(e2, e3);
        }
        e2.c();
    }

    public /* synthetic */ Object a(a a2) {
        return this.b(a2);
    }
}

