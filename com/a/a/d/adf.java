/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.adn;
import java.util.Map;

class adf
extends adn
implements Map.Entry {
    private static final long a = 0L;

    adf(Map.Entry entry, Object object) {
        super(entry, object);
    }

    Map.Entry a() {
        return (Map.Entry)super.e();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean equals(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().equals(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int hashCode() {
        Object object = this.h;
        synchronized (object) {
            return this.a().hashCode();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object getKey() {
        Object object = this.h;
        synchronized (object) {
            return this.a().getKey();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object getValue() {
        Object object = this.h;
        synchronized (object) {
            return this.a().getValue();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object setValue(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().setValue(object);
        }
    }

    @Override
    /* synthetic */ Object e() {
        return this.a();
    }
}

