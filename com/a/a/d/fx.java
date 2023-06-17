/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cm;
import com.a.a.d.fu;
import com.a.a.d.gh;
import java.util.Collection;
import java.util.Map;

class fx
extends gh {
    final /* synthetic */ fu a;

    fx(fu fu2) {
        this.a = fu2;
    }

    @Override
    protected Collection b() {
        return cm.a(this.a.a.l(), this.a.b());
    }

    @Override
    public boolean remove(Object object) {
        Map.Entry entry;
        if (object instanceof Map.Entry && this.a.a.f((entry = (Map.Entry)object).getKey()) && this.a.b.a(entry.getKey())) {
            return this.a.a.c(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.b();
    }
}

