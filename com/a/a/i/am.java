/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.i.al;
import com.a.a.i.an;
import java.util.Iterator;

class am
implements Iterable {
    final /* synthetic */ al a;

    am(al al2) {
        this.a = al2;
    }

    public Iterator iterator() {
        return new an(this);
    }
}

