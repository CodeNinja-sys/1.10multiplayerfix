/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gd;
import com.a.a.d.nh;
import java.util.Iterator;
import java.util.Queue;

final class mv
extends gd {
    final /* synthetic */ Iterable a;

    mv(Iterable iterable) {
        this.a = iterable;
    }

    public Iterator iterator() {
        return new nh((Queue)this.a, null);
    }

    @Override
    public String toString() {
        return "Iterables.consumingIterable(...)";
    }
}

