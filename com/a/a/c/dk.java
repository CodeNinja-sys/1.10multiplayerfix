/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.c.da;
import java.util.Map;

public final class dk
implements Map.Entry {
    private final Object a;
    private final Object b;
    private final da c;
    private static final long d = 0L;

    dk(Object object, Object object2, da da2) {
        this.a = object;
        this.b = object2;
        this.c = (da)((Object)cl.a((Object)da2));
    }

    public da a() {
        return this.c;
    }

    public boolean b() {
        return this.c.a();
    }

    public Object getKey() {
        return this.a;
    }

    public Object getValue() {
        return this.b;
    }

    public final Object setValue(Object object) {
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

