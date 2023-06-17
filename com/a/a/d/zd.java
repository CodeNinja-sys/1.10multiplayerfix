/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ka;

final class zd
extends ka {
    private final ka a;
    private final ka b;

    zd(Object object, Object object2, ka ka2, ka ka3) {
        super(object, object2);
        this.a = ka2;
        this.b = ka3;
    }

    zd(ka ka2, ka ka3, ka ka4) {
        super(ka2);
        this.a = ka3;
        this.b = ka4;
    }

    @Override
    ka a() {
        return this.a;
    }

    @Override
    ka b() {
        return this.b;
    }
}

