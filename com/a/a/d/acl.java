/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.abx;
import com.a.a.d.aci;
import com.a.a.d.ov;
import com.a.a.d.vb;
import java.util.Collection;
import java.util.Map;

class acl
extends vb {
    final /* synthetic */ aci a;

    acl(aci aci2) {
        this.a = aci2;
        super(aci2);
    }

    @Override
    public boolean remove(Object object) {
        for (Map.Entry entry : this.a.entrySet()) {
            if (!((Map)entry.getValue()).equals(object)) continue;
            abx.a(this.a.a, entry.getKey());
            return true;
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection collection) {
        cl.a(collection);
        boolean bl2 = false;
        for (Object e2 : ov.a(this.a.a.b().iterator())) {
            if (!collection.contains(this.a.a.d(e2))) continue;
            abx.a(this.a.a, e2);
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public boolean retainAll(Collection collection) {
        cl.a(collection);
        boolean bl2 = false;
        for (Object e2 : ov.a(this.a.a.b().iterator())) {
            if (collection.contains(this.a.a.d(e2))) continue;
            abx.a(this.a.a, e2);
            bl2 = true;
        }
        return bl2;
    }
}

