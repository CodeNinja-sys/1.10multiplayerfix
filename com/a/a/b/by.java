/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.bx;

class by
extends bx {
    final /* synthetic */ String a;
    final /* synthetic */ bx b;

    by(bx bx2, bx bx3, String string) {
        this.b = bx2;
        this.a = string;
        super(bx3, null);
    }

    @Override
    CharSequence a(Object object) {
        return object == null ? this.a : this.b.a(object);
    }

    @Override
    public bx b(String string) {
        throw new UnsupportedOperationException("already specified useForNull");
    }

    @Override
    public bx a() {
        throw new UnsupportedOperationException("already specified useForNull");
    }
}

