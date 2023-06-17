/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gw;
import com.a.a.d.pn;
import java.util.Map;

final class pp
extends gw {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ pn b;

    pp(Map.Entry entry, pn pn2) {
        this.a = entry;
        this.b = pn2;
    }

    @Override
    protected Map.Entry a() {
        return this.a;
    }

    @Override
    public Object setValue(Object object) {
        this.b.a(this.getKey(), object);
        return this.a.setValue(object);
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }
}

