/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import io.netty.util.c.aj;

final class ak
extends aj {
    private final Class a;

    ak(Class class_) {
        this.a = class_;
    }

    @Override
    public boolean a(Object object) {
        return this.a.isInstance(object);
    }
}

