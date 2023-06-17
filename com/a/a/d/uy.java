/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aad;
import com.a.a.d.uw;
import java.util.Set;

class uy
extends uw
implements Set {
    uy(Set set) {
        super(set);
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

