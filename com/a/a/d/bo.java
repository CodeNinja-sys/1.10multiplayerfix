/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.bm;
import com.a.a.d.bp;
import com.a.a.d.jt;
import com.a.a.d.uj;
import java.util.Set;

abstract class bo
extends uj {
    private final jt a;

    private bo(jt jt2) {
        this.a = jt2;
    }

    @Override
    public Set keySet() {
        return this.a.g();
    }

    Object a(int n2) {
        return this.a.g().h().get(n2);
    }

    abstract String b();

    abstract Object b(int var1);

    abstract Object a(int var1, Object var2);

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    protected Set a() {
        return new bp(this);
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public Object get(Object object) {
        Integer n2 = (Integer)this.a.get(object);
        if (n2 == null) {
            return null;
        }
        return this.b(n2);
    }

    @Override
    public Object put(Object object, Object object2) {
        Integer n2 = (Integer)this.a.get(object);
        if (n2 == null) {
            throw new IllegalArgumentException(this.b() + " " + object + " not in " + this.a.g());
        }
        return this.a(n2, object2);
    }

    @Override
    public Object remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ bo(jt jt2, bm bm2) {
        this(jt2);
    }
}

