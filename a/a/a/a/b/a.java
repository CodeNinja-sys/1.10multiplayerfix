/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.ac;
import java.io.Serializable;

public abstract class a
implements ac,
Serializable {
    private static final long b = -4940583368468432370L;
    protected Object a;

    protected a() {
    }

    @Override
    public void a(Object object) {
        this.a = object;
    }

    @Override
    public Object a() {
        return this.a;
    }

    @Override
    public Object a(long l2, Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object a(long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsKey(Object object) {
        if (object == null) {
            return false;
        }
        return this.b((Long)object);
    }

    @Override
    public Object get(Object object) {
        if (object == null) {
            return null;
        }
        long l2 = (Long)object;
        return this.b(l2) ? this.c(l2) : null;
    }

    public Object a(Long l2, Object object) {
        long l3 = l2;
        boolean bl2 = this.b(l3);
        Object object2 = this.a(l3, object);
        return bl2 ? object2 : null;
    }

    @Override
    public Object remove(Object object) {
        if (object == null) {
            return null;
        }
        long l2 = (Long)object;
        boolean bl2 = this.b(l2);
        Object object2 = this.a(l2);
        return bl2 ? object2 : null;
    }

    @Override
    public /* synthetic */ Object put(Object object, Object object2) {
        return this.a((Long)object, object2);
    }
}

