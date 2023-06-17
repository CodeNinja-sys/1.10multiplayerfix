/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.a;
import io.netty.util.c.a.av;
import io.netty.util.c.a.bl;
import io.netty.util.c.a.bo;
import io.netty.util.c.a.bp;
import io.netty.util.c.a.c;
import io.netty.util.c.a.h;
import io.netty.util.c.a.i;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

final class bq
extends h
implements Serializable,
Collection {
    private static final long b = 2249069246763182397L;

    bq(a a2) {
        super(a2);
    }

    @Override
    public final boolean contains(Object object) {
        return this.a.containsValue(object);
    }

    @Override
    public final boolean remove(Object object) {
        if (object != null) {
            Iterator iterator = this.iterator();
            while (iterator.hasNext()) {
                if (!object.equals(iterator.next())) continue;
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        a a2 = this.a;
        av[] arrav = a2.j;
        int n2 = a2.j == null ? 0 : arrav.length;
        return new bo(arrav, n2, 0, n2, a2);
    }

    public final boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public i b() {
        a a2 = this.a;
        long l2 = a2.f();
        av[] arrav = a2.j;
        int n2 = a2.j == null ? 0 : arrav.length;
        return new bp(arrav, n2, 0, n2, l2 < 0L ? 0L : l2);
    }

    public void a(c c2) {
        if (c2 == null) {
            throw new NullPointerException();
        }
        av[] arrav = this.a.j;
        if (this.a.j != null) {
            av av2;
            bl bl2 = new bl(arrav, arrav.length, 0, arrav.length);
            while ((av2 = bl2.c()) != null) {
                c2.a(av2.d);
            }
        }
    }
}

