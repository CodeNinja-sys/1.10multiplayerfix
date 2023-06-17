/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cm;
import com.a.a.d.gd;
import com.a.a.d.nj;
import java.util.Iterator;

final class nd
extends gd {
    final /* synthetic */ Iterable a;
    final /* synthetic */ cm b;

    nd(Iterable iterable, cm cm2) {
        this.a = iterable;
        this.b = cm2;
    }

    public Iterator iterator() {
        return nj.b(this.a.iterator(), this.b);
    }
}

