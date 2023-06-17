/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gd;
import com.a.a.d.nj;
import java.util.Iterator;

final class nc
extends gd {
    final /* synthetic */ Iterable a;
    final /* synthetic */ int b;

    nc(Iterable iterable, int n2) {
        this.a = iterable;
        this.b = n2;
    }

    public Iterator iterator() {
        return nj.b(this.a.iterator(), this.b);
    }
}

