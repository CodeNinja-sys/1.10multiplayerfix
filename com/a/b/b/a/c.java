/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.an;
import com.a.b.ap;
import com.a.b.b.a.d;
import com.a.b.b.ae;
import com.a.b.b.b;
import com.a.b.b.f;
import com.a.b.c.a;
import com.a.b.k;
import java.lang.reflect.Type;
import java.util.Collection;

public final class c
implements ap {
    private final f a;

    public c(f f2) {
        this.a = f2;
    }

    public an a(k k2, a a2) {
        Type type = a2.b();
        Class class_ = a2.a();
        if (!Collection.class.isAssignableFrom(class_)) {
            return null;
        }
        Type type2 = b.a(type, class_);
        an an2 = k2.a(com.a.b.c.a.b(type2));
        ae ae2 = this.a.a(a2);
        d d2 = new d(k2, type2, an2, ae2);
        return d2;
    }
}

