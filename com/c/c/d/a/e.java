/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.d.a.f;
import java.util.List;

class e
implements Comparable {
    String a;
    List b;
    f c;
    String d;
    String e;

    public int a(e e2) {
        return this.d.compareTo(e2.d);
    }

    e(String string, List list, String string2, String string3) {
        this.a = string;
        this.b = list;
        this.d = string2;
        this.e = string3;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((e)object);
    }
}

