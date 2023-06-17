/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.b.g;
import io.netty.c.a.d.ar;
import io.netty.c.a.d.k;
import java.util.Map;

final class m
implements Map.Entry {
    final int a;
    final CharSequence b;
    CharSequence c;
    m d;
    m e;
    m f;
    final /* synthetic */ k g;

    m(k k2, int n2, CharSequence charSequence, CharSequence charSequence2) {
        this.g = k2;
        this.a = n2;
        this.b = charSequence;
        this.c = charSequence2;
    }

    m(k k2) {
        this.g = k2;
        this.a = -1;
        this.b = null;
        this.c = null;
    }

    void a() {
        this.e.f = this.f;
        this.f.e = this.e;
    }

    void a(m m2) {
        this.f = m2;
        this.e = m2.e;
        this.e.f = this;
        this.f.e = this;
    }

    public String b() {
        return this.b.toString();
    }

    public String c() {
        return this.c.toString();
    }

    public String a(String string) {
        if (string == null) {
            throw new NullPointerException("value");
        }
        ar.g((CharSequence)string);
        CharSequence charSequence = this.c;
        this.c = string;
        return charSequence.toString();
    }

    public String toString() {
        return this.b.toString() + '=' + this.c.toString();
    }

    void a(g g2) {
        ar.a(this.b, this.c, g2);
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

