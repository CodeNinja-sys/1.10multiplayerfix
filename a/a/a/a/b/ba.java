/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.ah;
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

public class ba
extends ah
implements as,
Serializable {
    private static final long g = -7046029254386353129L;
    protected final as c;
    protected transient aq d;
    protected transient ec e;
    protected transient w f;

    protected ba(as as2) {
        super(as2);
        this.c = as2;
    }

    @Override
    public int size() {
        return this.c.size();
    }

    @Override
    public boolean b(long l2) {
        return this.c.b(l2);
    }

    @Override
    public boolean containsValue(Object object) {
        return this.c.containsValue(object);
    }

    @Override
    public Object a() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object a(long l2, Object object) {
        throw new UnsupportedOperationException();
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override
    public aq bG_() {
        if (this.d == null) {
            this.d = ar.b(this.c.bG_());
        }
        return this.d;
    }

    @Override
    public ec b() {
        if (this.e == null) {
            this.e = ed.b(this.c.b());
        }
        return this.e;
    }

    @Override
    public w c() {
        if (this.f == null) {
            return x.b(this.c.c());
        }
        return this.f;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return this.c.toString();
    }

    @Override
    public Object a(long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object c(long l2) {
        return this.c.c(l2);
    }

    @Override
    public boolean containsKey(Object object) {
        return this.c.containsKey(object);
    }

    @Override
    public Object remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object get(Object object) {
        return this.c.get(object);
    }

    @Override
    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override
    public aq d() {
        return ar.b(this.c.d());
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

