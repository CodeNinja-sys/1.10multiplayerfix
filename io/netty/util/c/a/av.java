/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import java.util.Map;

class av
implements Map.Entry {
    final int b;
    final Object c;
    volatile Object d;
    volatile av e;

    av(int n2, Object object, Object object2, av av2) {
        this.b = n2;
        this.c = object;
        this.d = object2;
        this.e = av2;
    }

    public final Object getKey() {
        return this.c;
    }

    public final Object getValue() {
        return this.d;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ this.d.hashCode();
    }

    public final String toString() {
        return this.c + "=" + this.d;
    }

    public final Object setValue(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean equals(Object object) {
        Object object2;
        Object v2;
        Map.Entry entry;
        Object k2;
        return !(!(object instanceof Map.Entry) || (k2 = (entry = (Map.Entry)object).getKey()) == null || (v2 = entry.getValue()) == null || k2 != this.c && !k2.equals(this.c) || v2 != (object2 = this.d) && !v2.equals(object2));
    }

    av a(int n2, Object object) {
        av av2 = this;
        if (object != null) {
            do {
                Object object2;
                if (av2.b != n2 || (object2 = av2.c) != object && (object2 == null || !object.equals(object2))) continue;
                return av2;
            } while ((av2 = av2.e) != null);
        }
        return null;
    }
}

