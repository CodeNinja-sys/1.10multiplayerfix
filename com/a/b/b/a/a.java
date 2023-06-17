/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.an;
import com.a.b.ap;
import com.a.b.b.a.b;
import com.a.b.b.a.x;
import com.a.b.d.d;
import com.a.b.d.e;
import com.a.b.k;
import java.lang.reflect.Array;
import java.util.ArrayList;

public final class a
extends an {
    public static final ap a = new b();
    private final Class b;
    private final an c;

    public a(k k2, an an2, Class class_) {
        this.c = new x(k2, an2, class_);
        this.b = class_;
    }

    public Object a(com.a.b.d.a a2) {
        Object object;
        if (a2.f() == d.i) {
            a2.j();
            return null;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        a2.a();
        while (a2.e()) {
            object = this.c.a(a2);
            arrayList.add(object);
        }
        a2.b();
        object = Array.newInstance(this.b, arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            Array.set(object, i2, arrayList.get(i2));
        }
        return object;
    }

    public void a(e e2, Object object) {
        if (object == null) {
            e2.f();
            return;
        }
        e2.b();
        int n2 = Array.getLength(object);
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object2 = Array.get(object, i2);
            this.c.a(e2, object2);
        }
        e2.c();
    }
}

