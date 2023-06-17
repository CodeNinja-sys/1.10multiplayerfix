/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import io.netty.util.c.l;

final class j
extends l {
    private Object a;

    j(Object object) {
        this.a = object;
    }

    @Override
    public Object b() {
        return this.a;
    }

    @Override
    protected Object bk_() {
        Object object = this.a;
        this.a = null;
        return object;
    }
}

