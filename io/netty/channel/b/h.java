/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.b;

import io.netty.channel.an;
import io.netty.channel.b.e;

final class h
implements e {
    private final Class a;

    h(Class class_) {
        this.a = class_;
    }

    @Override
    public boolean a(an an2) {
        return this.a.isInstance(an2);
    }
}

