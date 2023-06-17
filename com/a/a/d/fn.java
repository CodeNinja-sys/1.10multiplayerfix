/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cn;
import com.a.a.d.fi;
import com.a.a.d.fj;
import com.a.a.d.fr;
import com.a.a.d.sz;
import com.a.a.d.vb;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class fn
extends vb {
    final /* synthetic */ fj a;

    fn(fj fj2, Map map) {
        this.a = fj2;
        super(map);
    }

    @Override
    public boolean remove(Object object) {
        if (object instanceof Collection) {
            Collection collection = (Collection)object;
            Iterator iterator = this.a.a.a.c().entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = iterator.next();
                Object k2 = entry.getKey();
                Collection collection2 = fi.a((Collection)entry.getValue(), new fr(this.a.a, k2));
                if (collection2.isEmpty() || !collection.equals(collection2)) continue;
                if (collection2.size() == ((Collection)entry.getValue()).size()) {
                    iterator.remove();
                } else {
                    collection2.clear();
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection collection) {
        return this.a.a.a(sz.b(cn.a(collection)));
    }

    @Override
    public boolean retainAll(Collection collection) {
        return this.a.a.a(sz.b(cn.a(cn.a(collection))));
    }
}

