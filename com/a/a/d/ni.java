/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gd;
import com.a.a.d.mr;
import com.a.a.d.nj;
import java.util.Iterator;

final class ni
extends gd {
    private final Iterable a;

    private ni(Iterable iterable) {
        this.a = iterable;
    }

    public Iterator iterator() {
        return nj.a(this.a.iterator());
    }

    @Override
    public String toString() {
        return this.a.toString();
    }

    /* synthetic */ ni(Iterable iterable, mr mr2) {
        this(iterable);
    }
}

