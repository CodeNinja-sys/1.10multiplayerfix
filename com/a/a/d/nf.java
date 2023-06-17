/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.d.gd;
import com.a.a.d.nj;
import java.util.Iterator;

final class nf
extends gd {
    final /* synthetic */ Iterable a;
    final /* synthetic */ bl b;

    nf(Iterable iterable, bl bl2) {
        this.a = iterable;
        this.b = bl2;
    }

    public Iterator iterator() {
        return nj.a(this.a.iterator(), this.b);
    }
}

