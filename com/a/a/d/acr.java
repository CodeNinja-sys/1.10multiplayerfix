/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.d.acq;
import com.a.a.d.acs;
import com.a.a.d.act;
import com.a.a.d.cm;
import com.a.a.d.sz;
import java.util.Iterator;
import java.util.Map;

class acr
extends act {
    final /* synthetic */ acq a;

    acr(acq acq2) {
        this.a = acq2;
        super(acq2.b, null);
    }

    @Override
    public Iterator iterator() {
        return sz.b(this.a.b.a.keySet(), (bl)new acs(this));
    }

    @Override
    public int size() {
        return this.a.b.a.size();
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            return entry.getKey() != null && entry.getValue() instanceof Map && cm.a(this.a.b.a.entrySet(), entry);
        }
        return false;
    }

    @Override
    public boolean remove(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            return entry.getKey() != null && entry.getValue() instanceof Map && this.a.b.a.entrySet().remove(entry);
        }
        return false;
    }
}

