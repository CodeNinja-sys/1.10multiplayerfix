/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.d.hg;
import java.util.Map;

public abstract class gw
extends hg
implements Map.Entry {
    protected gw() {
    }

    protected abstract Map.Entry a();

    public Object getKey() {
        return this.a().getKey();
    }

    public Object getValue() {
        return this.a().getValue();
    }

    public Object setValue(Object object) {
        return this.a().setValue(object);
    }

    @Override
    public boolean equals(Object object) {
        return this.a().equals(object);
    }

    @Override
    public int hashCode() {
        return this.a().hashCode();
    }

    protected boolean a(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            return cc.a(this.getKey(), entry.getKey()) && cc.a(this.getValue(), entry.getValue());
        }
        return false;
    }

    protected int b() {
        Object object = this.getKey();
        Object object2 = this.getValue();
        return (object == null ? 0 : object.hashCode()) ^ (object2 == null ? 0 : object2.hashCode());
    }

    protected String c() {
        return this.getKey() + "=" + this.getValue();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }
}

