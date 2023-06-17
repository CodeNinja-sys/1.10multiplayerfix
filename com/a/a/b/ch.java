/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.ci;
import java.util.Iterator;

final class ch
implements Iterable {
    final /* synthetic */ Iterable a;

    ch(Iterable iterable) {
        this.a = iterable;
    }

    public Iterator iterator() {
        return new ci(this);
    }
}

