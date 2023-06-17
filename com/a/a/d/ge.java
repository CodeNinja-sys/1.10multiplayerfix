/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gd;
import java.util.Iterator;

final class ge
extends gd {
    final /* synthetic */ Iterable a;

    ge(Iterable iterable, Iterable iterable2) {
        this.a = iterable2;
        super(iterable);
    }

    public Iterator iterator() {
        return this.a.iterator();
    }
}

