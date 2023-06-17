/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gd;
import com.a.a.d.nj;
import java.util.Iterator;

final class mw
extends gd {
    final /* synthetic */ Iterable a;

    mw(Iterable iterable) {
        this.a = iterable;
    }

    public Iterator iterator() {
        return nj.g(this.a.iterator());
    }

    @Override
    public String toString() {
        return "Iterables.consumingIterable(...)";
    }
}

