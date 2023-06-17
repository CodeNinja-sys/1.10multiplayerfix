/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.fi;
import com.a.a.d.fl;
import com.a.a.d.fr;
import com.a.a.d.j;
import com.a.a.d.sz;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class fm
extends j {
    final Iterator a;
    final /* synthetic */ fl b;

    fm(fl fl2) {
        this.b = fl2;
        this.a = this.b.a.a.a.c().entrySet().iterator();
    }

    protected Map.Entry d() {
        while (this.a.hasNext()) {
            Map.Entry entry = (Map.Entry)this.a.next();
            Object k2 = entry.getKey();
            Collection collection = fi.a((Collection)entry.getValue(), new fr(this.b.a.a, k2));
            if (collection.isEmpty()) continue;
            return sz.a(k2, (Object)collection);
        }
        return (Map.Entry)this.b();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

