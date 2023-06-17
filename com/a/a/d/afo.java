/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aad;
import com.a.a.d.afm;
import com.a.a.d.gh;
import java.util.Collection;
import java.util.Set;

final class afo
extends gh
implements Set {
    final /* synthetic */ afm a;

    afo(afm afm2) {
        this.a = afm2;
    }

    @Override
    protected Collection b() {
        return this.a.a.values();
    }

    @Override
    public int hashCode() {
        return aad.b(this);
    }

    @Override
    public boolean equals(Object object) {
        return aad.a((Set)this, object);
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.b();
    }
}

