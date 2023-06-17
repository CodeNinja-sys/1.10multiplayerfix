/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.afb;
import com.a.a.d.afc;
import com.a.a.d.afe;
import com.a.a.d.aff;
import com.a.a.d.yl;
import java.util.AbstractMap;
import java.util.Set;

final class afd
extends AbstractMap {
    final /* synthetic */ afb a;

    private afd(afb afb2) {
        this.a = afb2;
    }

    @Override
    public boolean containsKey(Object object) {
        return this.get(object) != null;
    }

    @Override
    public Object get(Object object) {
        if (object instanceof yl) {
            yl yl2 = (yl)object;
            aff aff2 = (aff)afb.a(this.a).get(yl2.b);
            if (aff2 != null && aff2.a().equals(yl2)) {
                return aff2.getValue();
            }
        }
        return null;
    }

    @Override
    public Set entrySet() {
        return new afe(this);
    }

    /* synthetic */ afd(afb afb2, afc afc2) {
        this(afb2);
    }
}

