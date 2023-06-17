/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.afb;
import com.a.a.d.afd;
import java.util.AbstractSet;
import java.util.Iterator;

class afe
extends AbstractSet {
    final /* synthetic */ afd a;

    afe(afd afd2) {
        this.a = afd2;
    }

    @Override
    public Iterator iterator() {
        return afb.a(this.a.a).values().iterator();
    }

    @Override
    public int size() {
        return afb.a(this.a.a).size();
    }
}

