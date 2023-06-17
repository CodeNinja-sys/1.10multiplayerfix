/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.util.Iterator;
import org.apache.commons.c.f.h;
import org.apache.commons.c.p;

class q
implements Iterator {
    final /* synthetic */ h a;
    final /* synthetic */ p b;

    q(p p2, h h2) {
        this.b = p2;
        this.a = h2;
    }

    @Override
    public boolean hasNext() {
        return this.a.a() != null;
    }

    public Class a() {
        Class class_ = (Class)this.a.a();
        this.a.a(class_.getSuperclass());
        return class_;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

