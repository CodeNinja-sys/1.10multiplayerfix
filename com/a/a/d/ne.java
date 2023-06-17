/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gd;
import com.a.a.d.nj;
import java.util.Iterator;

final class ne
extends gd {
    final /* synthetic */ Iterable a;
    final /* synthetic */ Class b;

    ne(Iterable iterable, Class class_) {
        this.a = iterable;
        this.b = class_;
    }

    public Iterator iterator() {
        return nj.b(this.a.iterator(), this.b);
    }
}

