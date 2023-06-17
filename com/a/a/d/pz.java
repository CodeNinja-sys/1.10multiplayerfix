/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aad;
import com.a.a.d.pn;
import com.a.a.d.px;
import java.util.Set;

class pz
extends px
implements Set {
    pz(Set set, pn pn2) {
        super(set, pn2);
    }

    @Override
    public boolean equals(Object object) {
        return aad.a((Set)this, object);
    }

    @Override
    public int hashCode() {
        return aad.b(this);
    }
}

