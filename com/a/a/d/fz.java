/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aad;
import com.a.a.d.fx;
import com.a.a.d.fy;
import java.util.Set;

class fz
extends fx
implements Set {
    final /* synthetic */ fy b;

    fz(fy fy2) {
        this.b = fy2;
        super(fy2);
    }

    @Override
    public int hashCode() {
        return aad.b(this);
    }

    @Override
    public boolean equals(Object object) {
        return aad.a((Set)this, object);
    }
}

