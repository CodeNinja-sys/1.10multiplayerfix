/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b;

import java.util.Map;

final class ad
implements Map.Entry {
    ad a;
    ad b;
    ad c;
    ad d;
    ad e;
    final Object f;
    Object g;
    int h;

    ad() {
        this.f = null;
        this.d = this.e = this;
    }

    ad(ad ad2, Object object, ad ad3, ad ad4) {
        this.a = ad2;
        this.f = object;
        this.h = 1;
        this.d = ad3;
        this.e = ad4;
        ad4.d = this;
        ad3.e = this;
    }

    public Object getKey() {
        return this.f;
    }

    public Object getValue() {
        return this.g;
    }

    public Object setValue(Object object) {
        Object object2 = this.g;
        this.g = object;
        return object2;
    }

    public boolean equals(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            return (this.f == null ? entry.getKey() == null : this.f.equals(entry.getKey())) && (this.g == null ? entry.getValue() == null : this.g.equals(entry.getValue()));
        }
        return false;
    }

    public int hashCode() {
        return (this.f == null ? 0 : this.f.hashCode()) ^ (this.g == null ? 0 : this.g.hashCode());
    }

    public String toString() {
        return this.f + "=" + this.g;
    }

    public ad a() {
        ad ad2 = this;
        ad ad3 = ad2.b;
        while (ad3 != null) {
            ad2 = ad3;
            ad3 = ad2.b;
        }
        return ad2;
    }

    public ad b() {
        ad ad2 = this;
        ad ad3 = ad2.c;
        while (ad3 != null) {
            ad2 = ad3;
            ad3 = ad2.c;
        }
        return ad2;
    }
}

