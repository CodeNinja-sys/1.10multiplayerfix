/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.uk;
import com.a.a.d.vb;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

abstract class uj
extends AbstractMap {
    private transient Set a;
    private transient Set b;
    private transient Collection c;

    uj() {
    }

    abstract Set a();

    @Override
    public Set entrySet() {
        Set set = this.a;
        return set == null ? (this.a = this.a()) : set;
    }

    @Override
    public Set keySet() {
        Set set = this.b;
        return set == null ? (this.b = this.h()) : set;
    }

    Set h() {
        return new uk(this);
    }

    @Override
    public Collection values() {
        Collection collection = this.c;
        return collection == null ? (this.c = this.aL_()) : collection;
    }

    Collection aL_() {
        return new vb(this);
    }
}

