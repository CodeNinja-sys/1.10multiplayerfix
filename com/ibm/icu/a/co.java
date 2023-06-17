/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import java.util.Comparator;
import java.util.Iterator;

public class co
implements Comparator {
    private final Comparator a;
    private final int b;
    private static final co c = new co();

    public co() {
        this(null, true);
    }

    public co(Comparator comparator) {
        this(comparator, true);
    }

    public co(Comparator comparator, boolean bl2) {
        this.a = comparator;
        this.b = bl2 ? 1 : -1;
    }

    public int a(Iterable iterable, Iterable iterable2) {
        Object t2;
        Object t3;
        int n2;
        if (iterable == null) {
            return iterable2 == null ? 0 : -this.b;
        }
        if (iterable2 == null) {
            return this.b;
        }
        Iterator iterator = iterable.iterator();
        Iterator iterator2 = iterable2.iterator();
        do {
            if (!iterator.hasNext()) {
                return iterator2.hasNext() ? -this.b : 0;
            }
            if (!iterator2.hasNext()) {
                return this.b;
            }
            t3 = iterator.next();
            t2 = iterator2.next();
        } while ((n2 = this.a != null ? this.a.compare(t3, t2) : ((Comparable)t3).compareTo(t2)) == 0);
        return n2;
    }

    public static int b(Iterable iterable, Iterable iterable2) {
        return c.a(iterable, iterable2);
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Iterable)object, (Iterable)object2);
    }
}

