/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aan;
import com.a.a.d.xc;
import com.a.a.d.xq;
import java.util.Collection;
import java.util.Iterator;

abstract class xp
extends aan {
    xp() {
    }

    abstract xc a();

    @Override
    public void clear() {
        this.a().clear();
    }

    @Override
    public boolean contains(Object object) {
        return this.a().contains(object);
    }

    @Override
    public boolean containsAll(Collection collection) {
        return this.a().containsAll(collection);
    }

    @Override
    public boolean isEmpty() {
        return this.a().isEmpty();
    }

    @Override
    public Iterator iterator() {
        return new xq(this, this.a().aS_().iterator());
    }

    @Override
    public boolean remove(Object object) {
        int n2 = this.a().a(object);
        if (n2 > 0) {
            this.a().b(object, n2);
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return this.a().aS_().size();
    }
}

