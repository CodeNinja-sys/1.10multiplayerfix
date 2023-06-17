/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aae;
import com.a.a.d.lo;
import java.util.AbstractSet;
import java.util.Set;

public abstract class aaq
extends AbstractSet {
    private aaq() {
    }

    public lo a() {
        return lo.a(this);
    }

    public Set a(Set set) {
        set.addAll(this);
        return set;
    }

    /* synthetic */ aaq(aae aae2) {
        this();
    }
}

