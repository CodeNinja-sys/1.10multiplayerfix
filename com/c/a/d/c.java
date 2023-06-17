/*
 * Decompiled with CFR 0.150.
 */
package com.c.a.d;

import com.a.b.ad;
import com.a.b.ae;
import com.a.b.t;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import com.c.a.d.a;
import com.c.a.d.b;
import java.lang.reflect.Type;
import java.util.Map;

public class c
implements ae,
v {
    public b a(w w2, Type type, u u2) {
        b b2;
        block5: {
            block4: {
                b2 = new b();
                if (!(w2 instanceof z)) break block4;
                z z2 = (z)w2;
                for (Map.Entry entry : z2.b()) {
                    if (!(entry.getValue() instanceof t)) continue;
                    for (w w3 : (t)entry.getValue()) {
                        b2.a(entry.getKey(), new a((String)entry.getKey(), w3.d()));
                    }
                }
                break block5;
            }
            if (!(w2 instanceof t)) break block5;
            for (w w4 : (t)w2) {
                if (!(w4 instanceof z)) continue;
                z z3 = (z)w4;
                String string = z3.d("name").d();
                String string2 = z3.d("value").d();
                if (z3.b("signature")) {
                    b2.a(string, new a(string, string2, z3.d("signature").d()));
                    continue;
                }
                b2.a(string, new a(string, string2));
            }
        }
        return b2;
    }

    public w a(b b2, Type type, ad ad2) {
        t t2 = new t();
        for (a a2 : b2.j()) {
            z z2 = new z();
            z2.a("name", a2.a());
            z2.a("value", a2.b());
            if (a2.d()) {
                z2.a("signature", a2.c());
            }
            t2.a(z2);
        }
        return t2;
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

