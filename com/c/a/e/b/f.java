/*
 * Decompiled with CFR 0.150.
 */
package com.c.a.e.b;

import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import com.c.a.e;
import java.lang.reflect.Type;

public class f
implements v {
    public com.c.a.e.b.e a(w w2, Type type, u u2) {
        com.c.a.e.b.e e2 = new com.c.a.e.b.e();
        if (w2 instanceof z) {
            z z2 = (z)w2;
            if (z2.b("error")) {
                e2.a(z2.d("error").d());
            }
            if (z2.b("errorMessage")) {
                e2.a(z2.d("errorMessage").d());
            }
            if (z2.b("cause")) {
                e2.a(z2.d("cause").d());
            }
        } else {
            com.c.a.e.b.e.a(e2, (e[])u2.a(w2, (Type)((Object)e[].class)));
        }
        return e2;
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

