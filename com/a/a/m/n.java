/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.d.gs;
import com.a.a.d.sz;
import com.a.a.m.ad;
import com.a.a.m.ae;
import com.a.a.m.p;
import java.util.Map;
import java.util.Set;

public final class n
extends gs
implements ad {
    private final Map a = sz.c();

    @Override
    public Object a(Class class_) {
        return this.b(ae.a(class_));
    }

    @Override
    public Object a(Class class_, Object object) {
        return this.c(ae.a(class_), object);
    }

    @Override
    public Object a(ae ae2) {
        return this.b(ae2.m());
    }

    @Override
    public Object a(ae ae2, Object object) {
        return this.c(ae2.m(), object);
    }

    public Object b(ae ae2, Object object) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override
    public Set entrySet() {
        return p.a(super.entrySet());
    }

    @Override
    protected Map a() {
        return this.a;
    }

    private Object c(ae ae2, Object object) {
        return this.a.put(ae2, object);
    }

    private Object b(ae ae2) {
        return this.a.get(ae2);
    }

    @Override
    public /* synthetic */ Object put(Object object, Object object2) {
        return this.b((ae)object, object2);
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }
}

