/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.by;
import com.sun.jna.bz;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class bx
implements Map {
    private final ReferenceQueue a = new ReferenceQueue();
    private Map b = new HashMap();

    public void clear() {
        this.b.clear();
        this.a();
    }

    public boolean containsKey(Object object) {
        this.a();
        return this.b.containsKey(new bz(this, object));
    }

    public boolean containsValue(Object object) {
        this.a();
        return this.b.containsValue(object);
    }

    public Set entrySet() {
        this.a();
        HashSet<by> hashSet = new HashSet<by>();
        Iterator iterator = this.b.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            Object t2 = ((bz)entry.getKey()).get();
            Object v2 = entry.getValue();
            by by2 = new by(this, t2, v2);
            hashSet.add(by2);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public Set keySet() {
        this.a();
        HashSet hashSet = new HashSet();
        Iterator iterator = this.b.keySet().iterator();
        while (iterator.hasNext()) {
            bz bz2 = (bz)iterator.next();
            hashSet.add(bz2.get());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public boolean equals(Object object) {
        return ((Object)this.b).equals(((bx)object).b);
    }

    public Object get(Object object) {
        this.a();
        return this.b.get(new bz(this, object));
    }

    public Object put(Object object, Object object2) {
        this.a();
        return this.b.put(new bz(this, object), object2);
    }

    public int hashCode() {
        this.a();
        return ((Object)this.b).hashCode();
    }

    public boolean isEmpty() {
        this.a();
        return this.b.isEmpty();
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    public Object remove(Object object) {
        this.a();
        return this.b.remove(new bz(this, object));
    }

    public int size() {
        this.a();
        return this.b.size();
    }

    public Collection values() {
        this.a();
        return this.b.values();
    }

    private synchronized void a() {
        Reference reference = this.a.poll();
        while (reference != null) {
            bz bz2 = (bz)reference;
            this.b.remove(bz2);
            reference = this.a.poll();
        }
    }

    static ReferenceQueue a(bx bx2) {
        return bx2.a;
    }
}

