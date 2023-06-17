/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.hi;
import com.a.a.d.ta;
import com.a.a.d.ty;
import com.a.a.d.ua;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

class tz
extends hi {
    final /* synthetic */ ty a;

    private tz(ty ty2) {
        this.a = ty2;
    }

    @Override
    protected Set bI_() {
        return this.a.c;
    }

    @Override
    public Iterator iterator() {
        return new ua(this, this.a.c.iterator());
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.bI_();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.bI_();
    }

    /* synthetic */ tz(ty ty2, ta ta2) {
        this(ty2);
    }
}

