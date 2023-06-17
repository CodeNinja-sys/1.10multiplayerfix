/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b;

import com.a.b.b.ad;
import com.a.b.b.w;
import com.a.b.b.z;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

class y
extends AbstractSet {
    final /* synthetic */ w a;

    y(w w2) {
        this.a = w2;
    }

    public int size() {
        return this.a.c;
    }

    public Iterator iterator() {
        return new z(this);
    }

    public boolean contains(Object object) {
        return object instanceof Map.Entry && this.a.a((Map.Entry)object) != null;
    }

    public boolean remove(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        ad ad2 = this.a.a((Map.Entry)object);
        if (ad2 == null) {
            return false;
        }
        this.a.a(ad2, true);
        return true;
    }

    public void clear() {
        this.a.clear();
    }
}

