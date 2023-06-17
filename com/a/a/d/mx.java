/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gd;
import com.a.a.d.mq;
import com.a.a.d.nj;
import java.util.Comparator;
import java.util.Iterator;

final class mx
extends gd {
    final /* synthetic */ Iterable a;
    final /* synthetic */ Comparator b;

    mx(Iterable iterable, Comparator comparator) {
        this.a = iterable;
        this.b = comparator;
    }

    public Iterator iterator() {
        return nj.a(mq.a(this.a, mq.a()), this.b);
    }
}

