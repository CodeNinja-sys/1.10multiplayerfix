/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gd;
import com.a.a.d.nj;
import java.util.Iterator;

final class mu
extends gd {
    final /* synthetic */ Iterable a;
    final /* synthetic */ int b;

    mu(Iterable iterable, int n2) {
        this.a = iterable;
        this.b = n2;
    }

    public Iterator iterator() {
        return nj.e(this.a.iterator(), this.b);
    }
}

