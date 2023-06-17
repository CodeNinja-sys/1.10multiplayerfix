/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gd;
import com.a.a.d.nj;
import java.util.Iterator;

final class mr
extends gd {
    final /* synthetic */ Iterable a;

    mr(Iterable iterable) {
        this.a = iterable;
    }

    public Iterator iterator() {
        return nj.a(this.a);
    }

    @Override
    public String toString() {
        return this.a.toString() + " (cycled)";
    }
}

