/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.ag;
import a.a.a.a.b.as;
import a.a.a.a.b.ec;
import a.a.a.a.b.ed;
import a.a.a.a.c.aq;
import a.a.a.a.c.ar;
import a.a.a.a.c.w;
import a.a.a.a.c.x;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class az
extends ag
implements as,
Serializable {
    private static final long h = -7046029254386353129L;
    protected final as d;
    protected transient aq e;
    protected transient ec f;
    protected transient w g;

    protected az(as as2, Object object) {
        super(as2, object);
        this.d = as2;
    }

    protected az(as as2) {
        super(as2);
        this.d = as2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int size() {
        Object object = this.c;
        synchronized (object) {
            return this.d.size();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean b(long l2) {
        Object object = this.c;
        synchronized (object) {
            return this.d.b(l2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean containsValue(Object object) {
        Object object2 = this.c;
        synchronized (object2) {
            return this.d.containsValue(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object a() {
        Object object = this.c;
        synchronized (object) {
            return this.d.a();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(Object object) {
        Object object2 = this.c;
        synchronized (object2) {
            this.d.a(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object a(long l2, Object object) {
        Object object2 = this.c;
        synchronized (object2) {
            return this.d.a(l2, object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void putAll(Map map) {
        Object object = this.c;
        synchronized (object) {
            this.d.putAll(map);
        }
    }

    @Override
    public aq bG_() {
        if (this.e == null) {
            this.e = ar.a(this.d.bG_(), this.c);
        }
        return this.e;
    }

    @Override
    public ec b() {
        if (this.f == null) {
            this.f = ed.a(this.d.b(), this.c);
        }
        return this.f;
    }

    @Override
    public w c() {
        if (this.g == null) {
            return x.a(this.d.c(), this.c);
        }
        return this.g;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void clear() {
        Object object = this.c;
        synchronized (object) {
            this.d.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public String toString() {
        Object object = this.c;
        synchronized (object) {
            return this.d.toString();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object a(Long l2, Object object) {
        Object object2 = this.c;
        synchronized (object2) {
            return this.d.put(l2, object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object a(long l2) {
        Object object = this.c;
        synchronized (object) {
            return this.d.a(l2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object c(long l2) {
        Object object = this.c;
        synchronized (object) {
            return this.d.c(l2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean containsKey(Object object) {
        Object object2 = this.c;
        synchronized (object2) {
            return this.d.containsKey(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean isEmpty() {
        Object object = this.c;
        synchronized (object) {
            return this.d.isEmpty();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public aq d() {
        Object object = this.c;
        synchronized (object) {
            return this.d.d();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int hashCode() {
        Object object = this.c;
        synchronized (object) {
            return this.d.hashCode();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean equals(Object object) {
        Object object2 = this.c;
        synchronized (object2) {
            return this.d.equals(object);
        }
    }

    @Override
    public /* synthetic */ Object put(Object object, Object object2) {
        return this.a((Long)object, object2);
    }

    public /* synthetic */ Set entrySet() {
        return this.d();
    }

    public /* synthetic */ Collection values() {
        return this.c();
    }

    public /* synthetic */ Set keySet() {
        return this.b();
    }
}

