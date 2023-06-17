/*
 * Decompiled with CFR 0.150.
 */
package com.a.b;

import com.a.b.ae;
import com.a.b.ah;
import com.a.b.ak;
import com.a.b.an;
import com.a.b.ap;
import com.a.b.b;
import com.a.b.b.a.y;
import com.a.b.c.a;
import com.a.b.d;
import com.a.b.j;
import com.a.b.k;
import com.a.b.s;
import com.a.b.v;
import java.lang.reflect.Type;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class r {
    private com.a.b.b.s a = com.a.b.b.s.a;
    private ah b = ah.a;
    private j c = com.a.b.d.a;
    private final Map d = new HashMap();
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    private boolean g;
    private String h;
    private int i = 2;
    private int j = 2;
    private boolean k;
    private boolean l;
    private boolean m = true;
    private boolean n;
    private boolean o;

    public r a(double d2) {
        this.a = this.a.a(d2);
        return this;
    }

    public r a(int ... arrn) {
        this.a = this.a.a(arrn);
        return this;
    }

    public r a() {
        this.o = true;
        return this;
    }

    public r b() {
        this.a = this.a.c();
        return this;
    }

    public r c() {
        this.g = true;
        return this;
    }

    public r d() {
        this.k = true;
        return this;
    }

    public r e() {
        this.a = this.a.b();
        return this;
    }

    public r a(ah ah2) {
        this.b = ah2;
        return this;
    }

    public r a(d d2) {
        this.c = d2;
        return this;
    }

    public r a(j j2) {
        this.c = j2;
        return this;
    }

    public r a(b ... arrb) {
        for (b b2 : arrb) {
            this.a = this.a.a(b2, true, true);
        }
        return this;
    }

    public r a(b b2) {
        this.a = this.a.a(b2, true, false);
        return this;
    }

    public r b(b b2) {
        this.a = this.a.a(b2, false, true);
        return this;
    }

    public r f() {
        this.n = true;
        return this;
    }

    public r g() {
        this.m = false;
        return this;
    }

    public r a(String string) {
        this.h = string;
        return this;
    }

    public r a(int n2) {
        this.i = n2;
        this.h = null;
        return this;
    }

    public r a(int n2, int n3) {
        this.i = n2;
        this.j = n3;
        this.h = null;
        return this;
    }

    public r a(Type type, Object object) {
        com.a.b.b.a.a(object instanceof ae || object instanceof v || object instanceof s || object instanceof an);
        if (object instanceof s) {
            this.d.put(type, (s)object);
        }
        if (object instanceof ae || object instanceof v) {
            a a2 = com.a.b.c.a.b(type);
            this.e.add(ak.b(a2, object));
        }
        if (object instanceof an) {
            this.e.add(y.a(com.a.b.c.a.b(type), (an)object));
        }
        return this;
    }

    public r a(ap ap2) {
        this.e.add(ap2);
        return this;
    }

    public r a(Class class_, Object object) {
        com.a.b.b.a.a(object instanceof ae || object instanceof v || object instanceof an);
        if (object instanceof v || object instanceof ae) {
            this.f.add(0, ak.a(class_, object));
        }
        if (object instanceof an) {
            this.e.add(y.b(class_, (an)object));
        }
        return this;
    }

    public r h() {
        this.l = true;
        return this;
    }

    public k i() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.e);
        Collections.reverse(arrayList);
        arrayList.addAll(this.f);
        this.a(this.h, this.i, this.j, arrayList);
        return new k(this.a, this.c, this.d, this.g, this.k, this.o, this.m, this.n, this.l, this.b, arrayList);
    }

    private void a(String string, int n2, int n3, List list) {
        com.a.b.a a2;
        if (string != null && !"".equals(string.trim())) {
            a2 = new com.a.b.a(string);
        } else if (n2 != 2 && n3 != 2) {
            a2 = new com.a.b.a(n2, n3);
        } else {
            return;
        }
        list.add(ak.a(com.a.b.c.a.c(java.util.Date.class), (Object)a2));
        list.add(ak.a(com.a.b.c.a.c(Timestamp.class), (Object)a2));
        list.add(ak.a(com.a.b.c.a.c(Date.class), (Object)a2));
    }
}

