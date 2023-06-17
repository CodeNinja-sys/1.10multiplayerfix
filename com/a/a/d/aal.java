/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cm;
import com.a.a.d.aad;
import com.a.a.d.co;
import java.util.Set;

class aal
extends co
implements Set {
    aal(Set set, cm cm2) {
        super(set, cm2);
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

