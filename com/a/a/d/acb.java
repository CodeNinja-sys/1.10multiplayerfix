/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cn;
import com.a.a.d.aan;
import com.a.a.d.abx;
import com.a.a.d.aby;
import com.a.a.d.aca;
import com.a.a.d.acc;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class acb
extends aan {
    final /* synthetic */ aca a;

    private acb(aca aca2) {
        this.a = aca2;
    }

    @Override
    public Iterator iterator() {
        return new acc(this.a, null);
    }

    @Override
    public int size() {
        int n2 = 0;
        for (Map map : this.a.b.a.values()) {
            if (!map.containsKey(this.a.a)) continue;
            ++n2;
        }
        return n2;
    }

    @Override
    public boolean isEmpty() {
        return !this.a.b.b(this.a.a);
    }

    @Override
    public void clear() {
        this.a.a(cn.a());
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            return abx.a(this.a.b, entry.getKey(), this.a.a, entry.getValue());
        }
        return false;
    }

    @Override
    public boolean remove(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            return abx.b(this.a.b, entry.getKey(), this.a.a, entry.getValue());
        }
        return false;
    }

    @Override
    public boolean retainAll(Collection collection) {
        return this.a.a(cn.a(cn.a(collection)));
    }

    /* synthetic */ acb(aca aca2, aby aby2) {
        this(aca2);
    }
}

