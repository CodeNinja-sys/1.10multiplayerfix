/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.bx;
import com.a.a.b.cb;
import com.a.a.b.cl;
import java.util.Iterator;

class bz
extends bx {
    final /* synthetic */ bx a;

    bz(bx bx2, bx bx3) {
        this.a = bx2;
        super(bx3, null);
    }

    @Override
    public Appendable a(Appendable appendable, Iterator iterator) {
        Object e2;
        cl.a(appendable, (Object)"appendable");
        cl.a(iterator, (Object)"parts");
        while (iterator.hasNext()) {
            e2 = iterator.next();
            if (e2 == null) continue;
            appendable.append(this.a.a(e2));
            break;
        }
        while (iterator.hasNext()) {
            e2 = iterator.next();
            if (e2 == null) continue;
            appendable.append(bx.a(this.a));
            appendable.append(this.a.a(e2));
        }
        return appendable;
    }

    @Override
    public bx b(String string) {
        throw new UnsupportedOperationException("already specified skipNulls");
    }

    @Override
    public cb c(String string) {
        throw new UnsupportedOperationException("can't use .skipNulls() with maps");
    }
}

