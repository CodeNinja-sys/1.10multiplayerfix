/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.d.qj;
import com.a.a.d.sz;
import java.util.Map;

class ul
implements qj {
    final Map a;
    final Map b;
    final Map c;
    final Map d;

    ul(Map map, Map map2, Map map3, Map map4) {
        this.a = sz.f(map);
        this.b = sz.f(map2);
        this.c = sz.f(map3);
        this.d = sz.f(map4);
    }

    @Override
    public boolean a() {
        return this.a.isEmpty() && this.b.isEmpty() && this.d.isEmpty();
    }

    @Override
    public Map b() {
        return this.a;
    }

    @Override
    public Map c() {
        return this.b;
    }

    @Override
    public Map d() {
        return this.c;
    }

    @Override
    public Map e() {
        return this.d;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof qj) {
            qj qj2 = (qj)object;
            return this.b().equals(qj2.b()) && this.c().equals(qj2.c()) && this.d().equals(qj2.d()) && this.e().equals(qj2.e());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return cc.a(this.b(), this.c(), this.d(), this.e());
    }

    public String toString() {
        if (this.a()) {
            return "equal";
        }
        StringBuilder stringBuilder = new StringBuilder("not equal");
        if (!this.a.isEmpty()) {
            stringBuilder.append(": only on left=").append(this.a);
        }
        if (!this.b.isEmpty()) {
            stringBuilder.append(": only on right=").append(this.b);
        }
        if (!this.d.isEmpty()) {
            stringBuilder.append(": value differences=").append(this.d);
        }
        return stringBuilder.toString();
    }
}

