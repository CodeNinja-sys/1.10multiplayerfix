/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cm;
import com.a.a.b.cn;
import com.a.a.d.mq;
import com.a.a.d.ov;
import com.a.a.d.sz;
import com.a.a.d.vb;
import java.util.Collection;
import java.util.Map;

final class ui
extends vb {
    Map a;
    cm b;

    ui(Map map, Map map2, cm cm2) {
        super(map);
        this.a = map2;
        this.b = cm2;
    }

    @Override
    public boolean remove(Object object) {
        return mq.b(this.a.entrySet(), cn.a(this.b, sz.b(cn.a(object)))) != null;
    }

    private boolean a(cm cm2) {
        return mq.a(this.a.entrySet(), cn.a(this.b, sz.b(cm2)));
    }

    @Override
    public boolean removeAll(Collection collection) {
        return this.a(cn.a(collection));
    }

    @Override
    public boolean retainAll(Collection collection) {
        return this.a(cn.a(cn.a(collection)));
    }

    @Override
    public Object[] toArray() {
        return ov.a(this.iterator()).toArray();
    }

    @Override
    public Object[] toArray(Object[] arrobject) {
        return ov.a(this.iterator()).toArray(arrobject);
    }
}

