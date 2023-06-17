/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.acu;
import com.a.a.d.adn;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class adi
extends adn
implements Map {
    transient Set c;
    transient Collection d;
    transient Set e;
    private static final long a = 0L;

    adi(Map map, Object object) {
        super(map, object);
    }

    Map d() {
        return (Map)super.e();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void clear() {
        Object object = this.h;
        synchronized (object) {
            this.d().clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean containsKey(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.d().containsKey(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean containsValue(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.d().containsValue(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Set entrySet() {
        Object object = this.h;
        synchronized (object) {
            if (this.e == null) {
                this.e = acu.a(this.d().entrySet(), this.h);
            }
            return this.e;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object get(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.d().get(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean isEmpty() {
        Object object = this.h;
        synchronized (object) {
            return this.d().isEmpty();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Set keySet() {
        Object object = this.h;
        synchronized (object) {
            if (this.c == null) {
                this.c = acu.a(this.d().keySet(), this.h);
            }
            return this.c;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object put(Object object, Object object2) {
        Object object3 = this.h;
        synchronized (object3) {
            return this.d().put(object, object2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void putAll(Map map) {
        Object object = this.h;
        synchronized (object) {
            this.d().putAll(map);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object remove(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.d().remove(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int size() {
        Object object = this.h;
        synchronized (object) {
            return this.d().size();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Collection values() {
        Object object = this.h;
        synchronized (object) {
            if (this.d == null) {
                this.d = acu.b(this.d().values(), this.h);
            }
            return this.d;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        Object object2 = this.h;
        synchronized (object2) {
            return this.d().equals(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int hashCode() {
        Object object = this.h;
        synchronized (object) {
            return this.d().hashCode();
        }
    }

    @Override
    /* synthetic */ Object e() {
        return this.d();
    }
}

