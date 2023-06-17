/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

final class nu
extends agi {
    final /* synthetic */ Iterator a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;

    nu(Iterator iterator, int n2, boolean bl2) {
        this.a = iterator;
        this.b = n2;
        this.c = bl2;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    public List a() {
        int n2;
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] arrobject = new Object[this.b];
        for (n2 = 0; n2 < this.b && this.a.hasNext(); ++n2) {
            arrobject[n2] = this.a.next();
        }
        for (int i2 = n2; i2 < this.b; ++i2) {
            arrobject[i2] = null;
        }
        List<Object> list = Collections.unmodifiableList(Arrays.asList(arrobject));
        return this.c || n2 == this.b ? list : list.subList(0, n2);
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

