/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gd;
import com.a.a.d.mq;
import com.a.a.d.nj;
import java.util.Iterator;

final class mz
extends gd {
    final /* synthetic */ Iterable a;

    mz(Iterable iterable) {
        this.a = iterable;
    }

    public Iterator iterator() {
        return nj.e(mq.k(this.a));
    }
}

