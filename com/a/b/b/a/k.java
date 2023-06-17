/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.an;
import com.a.b.ap;
import com.a.b.b.a.l;
import com.a.b.b.a.y;
import com.a.b.b.ae;
import com.a.b.b.b;
import com.a.b.b.f;
import com.a.b.c.a;
import java.lang.reflect.Type;
import java.util.Map;

public final class k
implements ap {
    private final f a;
    private final boolean b;

    public k(f f2, boolean bl2) {
        this.a = f2;
        this.b = bl2;
    }

    public an a(com.a.b.k k2, a a2) {
        Type type = a2.b();
        Class class_ = a2.a();
        if (!Map.class.isAssignableFrom(class_)) {
            return null;
        }
        Class class_2 = com.a.b.b.b.e(type);
        Type[] arrtype = com.a.b.b.b.b(type, class_2);
        an an2 = this.a(k2, arrtype[0]);
        an an3 = k2.a(com.a.b.c.a.b(arrtype[1]));
        ae ae2 = this.a.a(a2);
        l l2 = new l(this, k2, arrtype[0], an2, arrtype[1], an3, ae2);
        return l2;
    }

    private an a(com.a.b.k k2, Type type) {
        return type == Boolean.TYPE || type == Boolean.class ? y.f : k2.a(com.a.b.c.a.b(type));
    }

    static /* synthetic */ boolean a(k k2) {
        return k2.b;
    }
}

