/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b;

import java.util.Comparator;

final class x
implements Comparator {
    x() {
    }

    public int a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Comparable)object, (Comparable)object2);
    }
}

