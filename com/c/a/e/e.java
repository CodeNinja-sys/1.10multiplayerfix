/*
 * Decompiled with CFR 0.150.
 */
package com.c.a.e;

import com.a.b.ad;
import com.a.b.ae;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import com.c.a.e.d;
import java.lang.reflect.Type;
import java.util.UUID;

class e
implements ae,
v {
    private e() {
    }

    public com.c.a.e a(w w2, Type type, u u2) {
        z z2 = (z)w2;
        UUID uUID = z2.b("id") ? (UUID)u2.a(z2.c("id"), (Type)((Object)UUID.class)) : null;
        String string = z2.b("name") ? z2.d("name").d() : null;
        return new com.c.a.e(uUID, string);
    }

    public w a(com.c.a.e e2, Type type, ad ad2) {
        z z2 = new z();
        if (e2.a() != null) {
            z2.a("id", ad2.a(e2.a()));
        }
        if (e2.b() != null) {
            z2.a("name", e2.b());
        }
        return z2;
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }

    /* synthetic */ e(d d2) {
        this();
    }
}

