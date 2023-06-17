/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ou;
import com.a.a.d.pn;
import com.a.a.d.qc;
import java.util.Collection;
import java.util.List;

class qa
extends qc
implements ou {
    qa(ou ou2, pn pn2) {
        super(ou2, pn2);
    }

    @Override
    public List a(Object object) {
        return (List)super.c(object);
    }

    @Override
    public List b(Object object) {
        return (List)super.d(object);
    }

    @Override
    public List a(Object object, Iterable iterable) {
        return (List)super.b(object, iterable);
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.a(object, iterable);
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.a(object);
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.b(object);
    }
}

