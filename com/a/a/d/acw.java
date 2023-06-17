/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.acu;
import com.a.a.d.acx;
import com.a.a.d.ada;
import com.a.a.d.adi;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class acw
extends adi {
    transient Set a;
    transient Collection b;
    private static final long f = 0L;

    acw(Map map, Object object) {
        super(map, object);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Collection a(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            Collection collection = (Collection)super.get(object);
            return collection == null ? null : acu.a(collection, this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Set entrySet() {
        Object object = this.h;
        synchronized (object) {
            if (this.a == null) {
                this.a = new acx(this.d().entrySet(), this.h);
            }
            return this.a;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Collection values() {
        Object object = this.h;
        synchronized (object) {
            if (this.b == null) {
                this.b = new ada(this.d().values(), this.h);
            }
            return this.b;
        }
    }

    @Override
    public boolean containsValue(Object object) {
        return this.values().contains(object);
    }

    @Override
    public /* synthetic */ Object get(Object object) {
        return this.a(object);
    }
}

