/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b;

import com.a.b.b.ab;
import com.a.b.b.w;
import java.util.AbstractSet;
import java.util.Iterator;

class aa
extends AbstractSet {
    final /* synthetic */ w a;

    aa(w w2) {
        this.a = w2;
    }

    public int size() {
        return this.a.c;
    }

    public Iterator iterator() {
        return new ab(this);
    }

    public boolean contains(Object object) {
        return this.a.containsKey(object);
    }

    public boolean remove(Object object) {
        return this.a.b(object) != null;
    }

    public void clear() {
        this.a.clear();
    }
}

