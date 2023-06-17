/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.a;
import java.util.Map;

final class ae
implements Map.Entry {
    final Object a;
    Object b;
    final a c;

    ae(Object object, Object object2, a a2) {
        this.a = object;
        this.b = object2;
        this.c = a2;
    }

    public Object getKey() {
        return this.a;
    }

    public Object getValue() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public String toString() {
        return this.a + "=" + this.b;
    }

    @Override
    public boolean equals(Object object) {
        Object v2;
        Map.Entry entry;
        Object k2;
        return !(!(object instanceof Map.Entry) || (k2 = (entry = (Map.Entry)object).getKey()) == null || (v2 = entry.getValue()) == null || k2 != this.a && !k2.equals(this.a) || v2 != this.b && !v2.equals(this.b));
    }

    public Object setValue(Object object) {
        if (object == null) {
            throw new NullPointerException();
        }
        Object object2 = this.b;
        this.b = object;
        this.c.put(this.a, object);
        return object2;
    }
}

