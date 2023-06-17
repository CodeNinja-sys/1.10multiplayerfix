/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.hy;
import com.a.a.d.ia;
import com.a.a.d.ie;
import com.a.a.d.ij;
import com.a.a.d.uk;
import java.util.Iterator;

final class ii
extends uk {
    final /* synthetic */ ie a;

    ii(ie ie2) {
        this.a = ie2;
        super(ie2);
    }

    @Override
    public boolean remove(Object object) {
        ia ia2 = hy.b(this.a.a, object, hy.a(object));
        if (ia2 == null) {
            return false;
        }
        hy.a(this.a.a, ia2);
        return true;
    }

    @Override
    public Iterator iterator() {
        return new ij(this);
    }
}

