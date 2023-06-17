/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gd;
import com.a.a.d.mt;
import com.a.a.d.nj;
import java.util.Iterator;

final class ms
extends gd {
    final /* synthetic */ Iterable a;
    final /* synthetic */ int b;

    ms(Iterable iterable, int n2) {
        this.a = iterable;
        this.b = n2;
    }

    public Iterator iterator() {
        Iterator iterator = this.a.iterator();
        nj.d(iterator, this.b);
        return new mt(this, iterator);
    }
}

