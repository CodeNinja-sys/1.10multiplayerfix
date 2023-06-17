/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.commons.c.r;

class s
implements Iterator {
    Iterator a = Collections.emptySet().iterator();
    final /* synthetic */ Iterator b;
    final /* synthetic */ Set c;
    final /* synthetic */ r d;

    s(r r2, Iterator iterator, Set set) {
        this.d = r2;
        this.b = iterator;
        this.c = set;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext() || this.b.hasNext();
    }

    public Class a() {
        if (this.a.hasNext()) {
            Class class_ = (Class)this.a.next();
            this.c.add(class_);
            return class_;
        }
        Class class_ = (Class)this.b.next();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.a(linkedHashSet, class_);
        this.a = linkedHashSet.iterator();
        return class_;
    }

    private void a(Set set, Class class_) {
        for (Class<?> class_2 : class_.getInterfaces()) {
            if (!this.c.contains(class_2)) {
                set.add(class_2);
            }
            this.a(set, class_2);
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

