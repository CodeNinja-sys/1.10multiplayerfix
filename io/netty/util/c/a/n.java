/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.a;
import io.netty.util.c.a.ae;
import io.netty.util.c.a.av;
import io.netty.util.c.a.bl;
import io.netty.util.c.a.c;
import io.netty.util.c.a.h;
import io.netty.util.c.a.i;
import io.netty.util.c.a.m;
import io.netty.util.c.a.o;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class n
extends h
implements Serializable,
Set {
    private static final long b = 2249069246763182397L;

    n(a a2) {
        super(a2);
    }

    @Override
    public boolean contains(Object object) {
        Object v2;
        Object object2;
        Map.Entry entry;
        Object k2;
        return object instanceof Map.Entry && (k2 = (entry = (Map.Entry)object).getKey()) != null && (object2 = this.a.get(k2)) != null && (v2 = entry.getValue()) != null && (v2 == object2 || v2.equals(object2));
    }

    @Override
    public boolean remove(Object object) {
        Object v2;
        Map.Entry entry;
        Object k2;
        return object instanceof Map.Entry && (k2 = (entry = (Map.Entry)object).getKey()) != null && (v2 = entry.getValue()) != null && this.a.remove(k2, v2);
    }

    @Override
    public Iterator iterator() {
        a a2 = this.a;
        av[] arrav = a2.j;
        int n2 = a2.j == null ? 0 : arrav.length;
        return new m(arrav, n2, 0, n2, a2);
    }

    public boolean a(Map.Entry entry) {
        return this.a.a(entry.getKey(), entry.getValue(), false) == null;
    }

    @Override
    public boolean addAll(Collection collection) {
        boolean bl2 = false;
        for (Map.Entry entry : collection) {
            if (!this.a(entry)) continue;
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public final int hashCode() {
        int n2 = 0;
        av[] arrav = this.a.j;
        if (this.a.j != null) {
            av av2;
            bl bl2 = new bl(arrav, arrav.length, 0, arrav.length);
            while ((av2 = bl2.c()) != null) {
                n2 += av2.hashCode();
            }
        }
        return n2;
    }

    @Override
    public final boolean equals(Object object) {
        Set set;
        return object instanceof Set && ((set = (Set)object) == this || this.containsAll((Collection)set) && set.containsAll(this));
    }

    public i b() {
        a a2 = this.a;
        long l2 = a2.f();
        av[] arrav = a2.j;
        int n2 = a2.j == null ? 0 : arrav.length;
        return new o(arrav, n2, 0, n2, l2 < 0L ? 0L : l2, a2);
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
                c2.a(new ae(av2.c, av2.d, this.a));
            }
        }
    }

    @Override
    public /* synthetic */ boolean add(Object object) {
        return this.a((Map.Entry)object);
    }
}

