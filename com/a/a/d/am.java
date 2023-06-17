/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import java.util.Map;

abstract class am
implements Map.Entry {
    am() {
    }

    public abstract Object getKey();

    public abstract Object getValue();

    public Object setValue(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            return cc.a(this.getKey(), entry.getKey()) && cc.a(this.getValue(), entry.getValue());
        }
        return false;
    }

    @Override
    public int hashCode() {
        Object object = this.getKey();
        Object object2 = this.getValue();
        return (object == null ? 0 : object.hashCode()) ^ (object2 == null ? 0 : object2.hashCode());
    }

    public String toString() {
        return this.getKey() + "=" + this.getValue();
    }
}

