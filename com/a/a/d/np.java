/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import java.util.Enumeration;
import java.util.Iterator;

final class np
implements Enumeration {
    final /* synthetic */ Iterator a;

    np(Iterator iterator) {
        this.a = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return this.a.hasNext();
    }

    public Object nextElement() {
        return this.a.next();
    }
}

