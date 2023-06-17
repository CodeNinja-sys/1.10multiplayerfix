/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.dm;
import com.a.a.d.dn;
import com.a.a.d.gw;
import com.a.a.d.pn;
import com.a.a.d.pr;
import java.util.Collection;
import java.util.Map;

final class pq
extends gw {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ pn b;

    pq(Map.Entry entry, pn pn2) {
        this.a = entry;
        this.b = pn2;
    }

    @Override
    protected Map.Entry a() {
        return this.a;
    }

    public Collection d() {
        return dn.b((Collection)this.a.getValue(), (dm)new pr(this));
    }

    @Override
    public /* synthetic */ Object getValue() {
        return this.d();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }
}

