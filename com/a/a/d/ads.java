/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.acu;
import com.a.a.d.adi;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;

class ads
extends adi
implements SortedMap {
    private static final long a = 0L;

    ads(SortedMap sortedMap, Object object) {
        super(sortedMap, object);
    }

    SortedMap b() {
        return (SortedMap)super.d();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Comparator comparator() {
        Object object = this.h;
        synchronized (object) {
            return this.b().comparator();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object firstKey() {
        Object object = this.h;
        synchronized (object) {
            return this.b().firstKey();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public SortedMap headMap(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return acu.a(this.b().headMap(object), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object lastKey() {
        Object object = this.h;
        synchronized (object) {
            return this.b().lastKey();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public SortedMap subMap(Object object, Object object2) {
        Object object3 = this.h;
        synchronized (object3) {
            return acu.a(this.b().subMap(object, object2), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public SortedMap tailMap(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return acu.a(this.b().tailMap(object), this.h);
        }
    }

    @Override
    /* synthetic */ Map d() {
        return this.b();
    }

    @Override
    /* synthetic */ Object e() {
        return this.b();
    }
}

