/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.ac;
import com.a.b.ag;
import com.a.b.an;
import com.a.b.b.a.x;
import com.a.b.b.ae;
import com.a.b.b.u;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.e;
import com.a.b.k;
import com.a.b.w;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

final class l
extends an {
    private final an b;
    private final an c;
    private final ae d;
    final /* synthetic */ com.a.b.b.a.k a;

    public l(com.a.b.b.a.k k2, k k3, Type type, an an2, Type type2, an an3, ae ae2) {
        this.a = k2;
        this.b = new x(k3, an2, type);
        this.c = new x(k3, an3, type2);
        this.d = ae2;
    }

    public Map b(a a2) {
        d d2 = a2.f();
        if (d2 == com.a.b.d.d.i) {
            a2.j();
            return null;
        }
        Map map = (Map)this.d.a();
        if (d2 == com.a.b.d.d.a) {
            a2.a();
            while (a2.e()) {
                a2.a();
                Object object = this.b.a(a2);
                Object object2 = this.c.a(a2);
                Object object3 = map.put(object, object2);
                if (object3 != null) {
                    throw new ag("duplicate key: " + object);
                }
                a2.b();
            }
            a2.b();
        } else {
            a2.c();
            while (a2.e()) {
                Object object;
                u.a.a(a2);
                Object object4 = this.b.a(a2);
                Object object5 = map.put(object4, object = this.c.a(a2));
                if (object5 == null) continue;
                throw new ag("duplicate key: " + object4);
            }
            a2.d();
        }
        return map;
    }

    public void a(e e2, Map map) {
        if (map == null) {
            e2.f();
            return;
        }
        if (!com.a.b.b.a.k.a(this.a)) {
            e2.d();
            for (Map.Entry entry : map.entrySet()) {
                e2.a(String.valueOf(entry.getKey()));
                this.c.a(e2, entry.getValue());
            }
            e2.e();
            return;
        }
        boolean bl2 = false;
        ArrayList<w> arrayList = new ArrayList<w>(map.size());
        ArrayList arrayList2 = new ArrayList(map.size());
        for (Map.Entry object : map.entrySet()) {
            w w2 = this.b.b(object.getKey());
            arrayList.add(w2);
            arrayList2.add(object.getValue());
            bl2 |= w2.p() || w2.q();
        }
        if (bl2) {
            e2.b();
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                e2.b();
                com.a.b.b.ag.a((w)arrayList.get(i2), e2);
                this.c.a(e2, arrayList2.get(i2));
                e2.c();
            }
            e2.c();
        } else {
            e2.d();
            for (int i3 = 0; i3 < arrayList.size(); ++i3) {
                w w3 = (w)arrayList.get(i3);
                e2.a(this.b(w3));
                this.c.a(e2, arrayList2.get(i3));
            }
            e2.e();
        }
    }

    private String b(w w2) {
        if (w2.r()) {
            ac ac2 = w2.v();
            if (ac2.y()) {
                return String.valueOf(ac2.c());
            }
            if (ac2.b()) {
                return Boolean.toString(ac2.n());
            }
            if (ac2.z()) {
                return ac2.d();
            }
            throw new AssertionError();
        }
        if (w2.s()) {
            return "null";
        }
        throw new AssertionError();
    }

    public /* synthetic */ Object a(a a2) {
        return this.b(a2);
    }
}

