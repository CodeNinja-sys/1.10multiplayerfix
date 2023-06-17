/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cm;
import com.a.a.d.aad;
import com.a.a.d.tl;
import java.util.Map;
import java.util.Set;

class uh
extends tl {
    cm c;

    uh(Map map, cm cm2, cm cm3) {
        super(map, cm3);
        this.c = cm2;
    }

    @Override
    protected Set a() {
        return aad.a(this.a.entrySet(), this.b);
    }

    @Override
    Set h() {
        return aad.a(this.a.keySet(), this.c);
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a.containsKey(object) && this.c.a(object);
    }
}

