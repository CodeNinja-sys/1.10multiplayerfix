/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.hh;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

public final class fg
extends hh
implements Serializable {
    private final Queue b;
    final int a;
    private static final long c = 0L;

    private fg(int n2) {
        cl.a(n2 >= 0, "maxSize (%s) must >= 0", new Object[]{n2});
        this.b = new ArrayDeque(n2);
        this.a = n2;
    }

    public static fg a(int n2) {
        return new fg(n2);
    }

    public int a() {
        return this.a - this.size();
    }

    @Override
    protected Queue c() {
        return this.b;
    }

    @Override
    public boolean offer(Object object) {
        return this.add(object);
    }

    @Override
    public boolean add(Object object) {
        cl.a(object);
        if (this.a == 0) {
            return true;
        }
        if (this.size() == this.a) {
            this.b.remove();
        }
        this.b.add(object);
        return true;
    }

    @Override
    public boolean addAll(Collection collection) {
        return this.b(collection);
    }

    @Override
    public boolean contains(Object object) {
        return this.c().contains(cl.a(object));
    }

    @Override
    public boolean remove(Object object) {
        return this.c().remove(cl.a(object));
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.c();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.c();
    }
}

