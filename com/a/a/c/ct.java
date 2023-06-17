/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.ao;
import java.util.Map;

final class ct
implements Map.Entry {
    final Object a;
    Object b;
    final /* synthetic */ ao c;

    ct(ao ao2, Object object, Object object2) {
        this.c = ao2;
        this.a = object;
        this.b = object2;
    }

    public Object getKey() {
        return this.a;
    }

    public Object getValue() {
        return this.b;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            return this.a.equals(entry.getKey()) && this.b.equals(entry.getValue());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public Object setValue(Object object) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return this.getKey() + "=" + this.getValue();
    }
}

