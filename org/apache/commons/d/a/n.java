/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.d.a;

import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.d.a.o;
import org.apache.commons.d.a.p;
import org.apache.commons.d.a.q;
import org.apache.commons.d.a.r;

public final class n
extends Hashtable {
    private static final long a = -1546036869799732453L;
    private static final int b = 100;
    private static final int c = 10;
    private final ReferenceQueue d = new ReferenceQueue();
    private int e = 0;

    public boolean containsKey(Object object) {
        q q2 = new q(object, null);
        return super.containsKey(q2);
    }

    public Enumeration elements() {
        this.a();
        return super.elements();
    }

    public Set entrySet() {
        this.a();
        Set set = super.entrySet();
        HashSet<p> hashSet = new HashSet<p>();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            q q2 = (q)entry.getKey();
            Object object = q.a(q2);
            Object v2 = entry.getValue();
            if (object == null) continue;
            p p2 = new p(object, v2, null);
            hashSet.add(p2);
        }
        return hashSet;
    }

    public Object get(Object object) {
        q q2 = new q(object, null);
        return super.get(q2);
    }

    public Enumeration keys() {
        this.a();
        Enumeration enumeration = super.keys();
        return new o(this, enumeration);
    }

    public Set keySet() {
        this.a();
        Set set = super.keySet();
        HashSet<Object> hashSet = new HashSet<Object>();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            q q2 = (q)iterator.next();
            Object object = q.a(q2);
            if (object == null) continue;
            hashSet.add(object);
        }
        return hashSet;
    }

    public synchronized Object put(Object object, Object object2) {
        if (object == null) {
            throw new NullPointerException("Null keys are not allowed");
        }
        if (object2 == null) {
            throw new NullPointerException("Null values are not allowed");
        }
        if (this.e++ > 100) {
            this.a();
            this.e = 0;
        } else if (this.e % 10 == 0) {
            this.b();
        }
        q q2 = new q(object, this.d, null);
        return super.put(q2, object2);
    }

    public void putAll(Map map) {
        if (map != null) {
            Set set = map.entrySet();
            Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = iterator.next();
                this.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public Collection values() {
        this.a();
        return super.values();
    }

    public synchronized Object remove(Object object) {
        if (this.e++ > 100) {
            this.a();
            this.e = 0;
        } else if (this.e % 10 == 0) {
            this.b();
        }
        return super.remove(new q(object, null));
    }

    public boolean isEmpty() {
        this.a();
        return super.isEmpty();
    }

    public int size() {
        this.a();
        return super.size();
    }

    public String toString() {
        this.a();
        return super.toString();
    }

    protected void rehash() {
        this.a();
        super.rehash();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a() {
        ArrayList<q> arrayList = new ArrayList<q>();
        ReferenceQueue referenceQueue = this.d;
        synchronized (referenceQueue) {
            r r2;
            while ((r2 = (r)this.d.poll()) != null) {
                arrayList.add(r.a(r2));
            }
        }
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            super.remove(arrayList.get(i2));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void b() {
        ReferenceQueue referenceQueue = this.d;
        synchronized (referenceQueue) {
            r r2 = (r)this.d.poll();
            if (r2 != null) {
                super.remove(r.a(r2));
            }
        }
    }
}

