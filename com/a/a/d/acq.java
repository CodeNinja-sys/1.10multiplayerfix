/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.abx;
import com.a.a.d.acr;
import com.a.a.d.uj;
import java.util.Map;
import java.util.Set;

class acq
extends uj {
    final /* synthetic */ abx b;

    acq(abx abx2) {
        this.b = abx2;
    }

    @Override
    public boolean containsKey(Object object) {
        return this.b.a(object);
    }

    public Map a(Object object) {
        return this.b.a(object) ? this.b.e(object) : null;
    }

    public Map b(Object object) {
        return object == null ? null : (Map)this.b.a.remove(object);
    }

    @Override
    protected Set a() {
        return new acr(this);
    }

    @Override
    public /* synthetic */ Object remove(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ Object get(Object object) {
        return this.a(object);
    }
}

