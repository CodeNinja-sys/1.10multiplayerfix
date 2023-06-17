/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aad;
import com.a.a.d.an;
import com.a.a.d.ao;
import com.a.a.d.ap;
import java.util.Set;

class aq
extends ap
implements Set {
    final /* synthetic */ an b;

    private aq(an an2) {
        this.b = an2;
        super(an2, null);
    }

    @Override
    public int hashCode() {
        return aad.b(this);
    }

    @Override
    public boolean equals(Object object) {
        return aad.a((Set)this, object);
    }

    /* synthetic */ aq(an an2, ao ao2) {
        this(an2);
    }
}

