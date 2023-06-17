/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.abx;
import com.a.a.d.aby;
import com.a.a.d.acj;
import com.a.a.d.acl;
import com.a.a.d.uj;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class aci
extends uj {
    final /* synthetic */ abx a;

    private aci(abx abx2) {
        this.a = abx2;
    }

    public Map a(Object object) {
        return this.a.b(object) ? this.a.d(object) : null;
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a.b(object);
    }

    public Map b(Object object) {
        return this.a.b(object) ? abx.a(this.a, object) : null;
    }

    @Override
    public Set a() {
        return new acj(this);
    }

    @Override
    public Set keySet() {
        return this.a.b();
    }

    @Override
    Collection aL_() {
        return new acl(this);
    }

    @Override
    public /* synthetic */ Object remove(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ Object get(Object object) {
        return this.a(object);
    }

    /* synthetic */ aci(abx abx2, aby aby2) {
        this(abx2);
    }
}

