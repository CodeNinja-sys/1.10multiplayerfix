/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.hy;
import com.a.a.d.ia;
import com.a.a.d.in;
import com.a.a.d.uk;
import java.util.Iterator;

final class im
extends uk {
    final /* synthetic */ hy a;

    im(hy hy2) {
        this.a = hy2;
        super(hy2);
    }

    @Override
    public Iterator iterator() {
        return new in(this);
    }

    @Override
    public boolean remove(Object object) {
        ia ia2 = hy.a(this.a, object, hy.a(object));
        if (ia2 == null) {
            return false;
        }
        hy.a(this.a, ia2);
        return true;
    }
}

