/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.am;
import com.a.a.d.qy;
import java.util.Map;

final class sy
extends am {
    final Object a;
    Object b;
    final /* synthetic */ qy c;

    sy(qy qy2, Object object, Object object2) {
        this.c = qy2;
        this.a = object;
        this.b = object2;
    }

    @Override
    public Object getKey() {
        return this.a;
    }

    @Override
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

    @Override
    public Object setValue(Object object) {
        Object object2 = this.c.put(this.a, object);
        this.b = object;
        return object2;
    }
}

