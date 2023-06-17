/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.af;
import com.a.a.b.m;

abstract class ae
extends m {
    ae() {
    }

    ae(String string) {
        super(string);
    }

    @Override
    public final m b() {
        return this;
    }

    @Override
    public m a() {
        return new af(this);
    }
}

