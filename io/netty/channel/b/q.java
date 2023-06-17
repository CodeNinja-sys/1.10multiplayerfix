/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.b;

import java.util.Map;

final class q
implements Map.Entry {
    private final Object a;
    private final Object b;

    q(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

    public Object getKey() {
        return this.a;
    }

    public Object getValue() {
        return this.b;
    }

    public Object setValue(Object object) {
        throw new UnsupportedOperationException("read-only");
    }
}

