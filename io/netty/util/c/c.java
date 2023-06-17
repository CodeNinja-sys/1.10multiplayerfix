/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import io.netty.util.c.u;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

public final class c
extends AbstractSet
implements Serializable {
    private static final long a = -6761513279741915432L;
    private final ConcurrentMap b = u.m();

    @Override
    public int size() {
        return this.b.size();
    }

    @Override
    public boolean contains(Object object) {
        return this.b.containsKey(object);
    }

    @Override
    public boolean add(Object object) {
        return this.b.putIfAbsent(object, Boolean.TRUE) == null;
    }

    @Override
    public boolean remove(Object object) {
        return this.b.remove(object) != null;
    }

    @Override
    public void clear() {
        this.b.clear();
    }

    @Override
    public Iterator iterator() {
        return this.b.keySet().iterator();
    }
}

