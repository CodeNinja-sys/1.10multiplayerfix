/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aad;
import com.a.a.d.ab;
import com.a.a.d.n;
import java.util.Collection;
import java.util.Set;

class ag
extends ab
implements Set {
    final /* synthetic */ n a;

    ag(n n2, Object object, Set set) {
        this.a = n2;
        super(n2, object, set, null);
    }

    @Override
    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int n2 = this.size();
        boolean bl2 = aad.a((Set)this.c, collection);
        if (bl2) {
            int n3 = this.c.size();
            n.a(this.a, n3 - n2);
            this.b();
        }
        return bl2;
    }
}

