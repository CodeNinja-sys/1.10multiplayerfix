/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.ac;
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
    public Object a(int n2, Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object a(int n2) {
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
        return this.b((Integer)object);
    }

    @Override
    public Object get(Object object) {
        if (object == null) {
            return null;
        }
        int n2 = (Integer)object;
        return this.b(n2) ? this.c(n2) : null;
    }

    public Object a(Integer n2, Object object) {
        int n3 = n2;
        boolean bl2 = this.b(n3);
        Object object2 = this.a(n3, object);
        return bl2 ? object2 : null;
    }

    @Override
    public Object remove(Object object) {
        if (object == null) {
            return null;
        }
        int n2 = (Integer)object;
        boolean bl2 = this.b(n2);
        Object object2 = this.a(n2);
        return bl2 ? object2 : null;
    }

    @Override
    public /* synthetic */ Object put(Object object, Object object2) {
        return this.a((Integer)object, object2);
    }
}

