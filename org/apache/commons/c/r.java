/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.util.HashSet;
import java.util.Iterator;
import org.apache.commons.c.s;

final class r
implements Iterable {
    final /* synthetic */ Iterable a;

    r(Iterable iterable) {
        this.a = iterable;
    }

    public Iterator iterator() {
        HashSet hashSet = new HashSet();
        Iterator iterator = this.a.iterator();
        return new s(this, iterator, hashSet);
    }
}

