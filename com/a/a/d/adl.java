/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.acu;
import com.a.a.d.ads;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

class adl
extends ads
implements NavigableMap {
    transient NavigableSet a;
    transient NavigableMap b;
    transient NavigableSet f;
    private static final long i = 0L;

    adl(NavigableMap navigableMap, Object object) {
        super(navigableMap, object);
    }

    NavigableMap a() {
        return (NavigableMap)super.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Map.Entry ceilingEntry(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return acu.a(this.a().ceilingEntry(object), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object ceilingKey(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().ceilingKey(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public NavigableSet descendingKeySet() {
        Object object = this.h;
        synchronized (object) {
            if (this.a == null) {
                this.a = acu.a(this.a().descendingKeySet(), this.h);
                return this.a;
            }
            return this.a;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public NavigableMap descendingMap() {
        Object object = this.h;
        synchronized (object) {
            if (this.b == null) {
                this.b = acu.a(this.a().descendingMap(), this.h);
                return this.b;
            }
            return this.b;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Map.Entry firstEntry() {
        Object object = this.h;
        synchronized (object) {
            return acu.a(this.a().firstEntry(), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Map.Entry floorEntry(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return acu.a(this.a().floorEntry(object), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object floorKey(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().floorKey(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public NavigableMap headMap(Object object, boolean bl2) {
        Object object2 = this.h;
        synchronized (object2) {
            return acu.a(this.a().headMap(object, bl2), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Map.Entry higherEntry(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return acu.a(this.a().higherEntry(object), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object higherKey(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().higherKey(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Map.Entry lastEntry() {
        Object object = this.h;
        synchronized (object) {
            return acu.a(this.a().lastEntry(), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Map.Entry lowerEntry(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return acu.a(this.a().lowerEntry(object), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object lowerKey(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().lowerKey(object);
        }
    }

    @Override
    public Set keySet() {
        return this.navigableKeySet();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public NavigableSet navigableKeySet() {
        Object object = this.h;
        synchronized (object) {
            if (this.f == null) {
                this.f = acu.a(this.a().navigableKeySet(), this.h);
                return this.f;
            }
            return this.f;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Map.Entry pollFirstEntry() {
        Object object = this.h;
        synchronized (object) {
            return acu.a(this.a().pollFirstEntry(), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Map.Entry pollLastEntry() {
        Object object = this.h;
        synchronized (object) {
            return acu.a(this.a().pollLastEntry(), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public NavigableMap subMap(Object object, boolean bl2, Object object2, boolean bl3) {
        Object object3 = this.h;
        synchronized (object3) {
            return acu.a(this.a().subMap(object, bl2, object2, bl3), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public NavigableMap tailMap(Object object, boolean bl2) {
        Object object2 = this.h;
        synchronized (object2) {
            return acu.a(this.a().tailMap(object, bl2), this.h);
        }
    }

    @Override
    public SortedMap headMap(Object object) {
        return this.headMap(object, false);
    }

    @Override
    public SortedMap subMap(Object object, Object object2) {
        return this.subMap(object, true, object2, false);
    }

    @Override
    public SortedMap tailMap(Object object) {
        return this.tailMap(object, true);
    }

    @Override
    /* synthetic */ SortedMap b() {
        return this.a();
    }

    @Override
    /* synthetic */ Map d() {
        return this.a();
    }

    @Override
    /* synthetic */ Object e() {
        return this.a();
    }
}

