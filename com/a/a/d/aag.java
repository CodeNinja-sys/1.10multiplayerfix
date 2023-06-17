/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cm;
import com.a.a.d.aaq;
import com.a.a.d.nj;
import java.util.Iterator;
import java.util.Set;

final class aag
extends aaq {
    final /* synthetic */ Set a;
    final /* synthetic */ cm b;
    final /* synthetic */ Set c;

    aag(Set set, cm cm2, Set set2) {
        this.a = set;
        this.b = cm2;
        this.c = set2;
        super(null);
    }

    @Override
    public Iterator iterator() {
        return nj.b(this.a.iterator(), this.b);
    }

    @Override
    public int size() {
        return nj.b(this.iterator());
    }

    @Override
    public boolean isEmpty() {
        return this.c.containsAll(this.a);
    }

    @Override
    public boolean contains(Object object) {
        return this.a.contains(object) && !this.c.contains(object);
    }
}

