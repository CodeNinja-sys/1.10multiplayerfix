/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.acu;
import com.a.a.d.acy;
import com.a.a.d.gw;
import java.util.Collection;
import java.util.Map;

class acz
extends gw {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ acy b;

    acz(acy acy2, Map.Entry entry) {
        this.b = acy2;
        this.a = entry;
    }

    @Override
    protected Map.Entry a() {
        return this.a;
    }

    public Collection d() {
        return acu.a((Collection)this.a.getValue(), this.b.b.h);
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

