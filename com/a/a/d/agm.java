/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ago;
import com.a.a.d.gs;
import java.util.Map;
import java.util.Set;

final class agm
extends gs {
    private final Map a;
    private Set b;

    private agm(Map map) {
        this.a = map;
    }

    static agm a(Map map) {
        return new agm(map);
    }

    @Override
    protected Map a() {
        return this.a;
    }

    @Override
    public Set entrySet() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        this.b = new ago(this, null);
        return this.b;
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }
}

