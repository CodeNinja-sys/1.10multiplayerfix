/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.util.Iterator;
import org.apache.commons.c.f.h;
import org.apache.commons.c.q;

final class p
implements Iterable {
    final /* synthetic */ Class a;

    p(Class class_) {
        this.a = class_;
    }

    public Iterator iterator() {
        h h2 = new h(this.a);
        return new q(this, h2);
    }
}

