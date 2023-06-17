/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cm;
import com.a.a.d.n;
import com.a.a.d.q;
import com.a.a.d.s;
import com.a.a.d.tu;
import java.util.Iterator;
import java.util.Map;

class r
extends tu {
    final /* synthetic */ q a;

    r(q q2) {
        this.a = q2;
    }

    @Override
    Map a() {
        return this.a;
    }

    @Override
    public Iterator iterator() {
        return new s(this.a);
    }

    @Override
    public boolean contains(Object object) {
        return cm.a(this.a.a.entrySet(), object);
    }

    @Override
    public boolean remove(Object object) {
        if (!this.contains(object)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        n.a(this.a.b, entry.getKey());
        return true;
    }
}

