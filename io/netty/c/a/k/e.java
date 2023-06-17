/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.c.a.k.p;
import java.util.Map;

final class e
implements Map.Entry {
    final int a;
    final String b;
    String c;
    e d;
    e e;
    e f;

    e(int n2, String string, String string2) {
        this.a = n2;
        this.b = string;
        this.c = string2;
    }

    void a() {
        this.e.f = this.f;
        this.f.e = this.e;
    }

    void a(e e2) {
        this.f = e2;
        this.e = e2.e;
        this.e.f = this;
        this.f.e = this;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String a(String string) {
        if (string == null) {
            throw new NullPointerException("value");
        }
        p.b(string);
        String string2 = this.c;
        this.c = string;
        return string2;
    }

    public String toString() {
        return this.b + '=' + this.c;
    }

    public /* synthetic */ Object setValue(Object object) {
        return this.a((String)object);
    }

    public /* synthetic */ Object getValue() {
        return this.c();
    }

    public /* synthetic */ Object getKey() {
        return this.b();
    }
}

