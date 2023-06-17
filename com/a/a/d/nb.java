/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gd;
import com.a.a.d.nj;
import java.util.Iterator;

final class nb
extends gd {
    final /* synthetic */ Iterable a;
    final /* synthetic */ int b;

    nb(Iterable iterable, int n2) {
        this.a = iterable;
        this.b = n2;
    }

    public Iterator iterator() {
        return nj.a(this.a.iterator(), this.b);
    }
}

