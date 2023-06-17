/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cm;
import com.a.a.d.aad;
import com.a.a.d.tl;
import com.a.a.d.tz;
import com.a.a.d.uc;
import java.util.Map;
import java.util.Set;

class ty
extends tl {
    final Set c;

    ty(Map map, cm cm2) {
        super(map, cm2);
        this.c = aad.a(map.entrySet(), this.b);
    }

    @Override
    protected Set a() {
        return new tz(this, null);
    }

    @Override
    Set h() {
        return new uc(this);
    }
}

