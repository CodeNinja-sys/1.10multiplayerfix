/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aaq;
import com.a.a.d.lo;
import com.a.a.d.lp;
import com.a.a.d.nj;
import java.util.Iterator;
import java.util.Set;

final class aae
extends aaq {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;
    final /* synthetic */ Set c;

    aae(Set set, Set set2, Set set3) {
        this.a = set;
        this.b = set2;
        this.c = set3;
        super(null);
    }

    @Override
    public int size() {
        return this.a.size() + this.b.size();
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty() && this.c.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return nj.a(nj.b(this.a.iterator(), this.b.iterator()));
    }

    @Override
    public boolean contains(Object object) {
        return this.a.contains(object) || this.c.contains(object);
    }

    @Override
    public Set a(Set set) {
        set.addAll(this.a);
        set.addAll(this.c);
        return set;
    }

    @Override
    public lo a() {
        return new lp().b(this.a).b(this.c).b();
    }
}

