/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.aad;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Set;

abstract class aan
extends AbstractSet {
    aan() {
    }

    @Override
    public boolean removeAll(Collection collection) {
        return aad.a((Set)this, collection);
    }

    @Override
    public boolean retainAll(Collection collection) {
        return super.retainAll((Collection)cl.a(collection));
    }
}

