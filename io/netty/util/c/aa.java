/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import io.netty.util.c.ab;
import io.netty.util.p;
import io.netty.util.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public final class aa
extends ArrayList {
    private static final long a = -8605125654176467947L;
    private static final int b = 8;
    private static final p c = new ab();
    private final t d;

    public static aa a() {
        return aa.a(8);
    }

    public static aa a(int n2) {
        aa aa2 = (aa)c.a();
        aa2.ensureCapacity(n2);
        return aa2;
    }

    private aa(t t2) {
        this(t2, 8);
    }

    private aa(t t2, int n2) {
        super(n2);
        this.d = t2;
    }

    @Override
    public boolean addAll(Collection collection) {
        aa.a(collection);
        return super.addAll(collection);
    }

    @Override
    public boolean addAll(int n2, Collection collection) {
        aa.a(collection);
        return super.addAll(n2, collection);
    }

    private static void a(Collection collection) {
        if (collection instanceof RandomAccess && collection instanceof List) {
            List list = (List)collection;
            int n2 = list.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                if (list.get(i2) != null) continue;
                throw new IllegalArgumentException("c contains null values");
            }
        } else {
            for (Object e2 : collection) {
                if (e2 != null) continue;
                throw new IllegalArgumentException("c contains null values");
            }
        }
    }

    @Override
    public boolean add(Object object) {
        if (object == null) {
            throw new NullPointerException("element");
        }
        return super.add(object);
    }

    @Override
    public void add(int n2, Object object) {
        if (object == null) {
            throw new NullPointerException("element");
        }
        super.add(n2, object);
    }

    @Override
    public Object set(int n2, Object object) {
        if (object == null) {
            throw new NullPointerException("element");
        }
        return super.set(n2, object);
    }

    public boolean b() {
        this.clear();
        return c.a(this, this.d);
    }

    /* synthetic */ aa(t t2, ab ab2) {
        this(t2);
    }
}

