/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.a;
import io.netty.util.c.a.aa;
import io.netty.util.c.a.ac;
import io.netty.util.c.a.av;
import io.netty.util.c.a.bl;
import io.netty.util.c.a.c;
import io.netty.util.c.a.h;
import io.netty.util.c.a.i;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class ab
extends h
implements Serializable,
Set {
    private static final long b = 7249069246763182397L;
    private final Object c;

    ab(a a2, Object object) {
        super(a2);
        this.c = object;
    }

    public Object b() {
        return this.c;
    }

    @Override
    public boolean contains(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public boolean remove(Object object) {
        return this.a.remove(object) != null;
    }

    @Override
    public Iterator iterator() {
        a a2 = this.a;
        av[] arrav = a2.j;
        int n2 = a2.j == null ? 0 : arrav.length;
        return new aa(arrav, n2, 0, n2, a2);
    }

    @Override
    public boolean add(Object object) {
        Object object2 = this.c;
        if (object2 == null) {
            throw new UnsupportedOperationException();
        }
        return this.a.a(object, object2, true) == null;
    }

    @Override
    public boolean addAll(Collection collection) {
        boolean bl2 = false;
        Object object = this.c;
        if (object == null) {
            throw new UnsupportedOperationException();
        }
        for (Object e2 : collection) {
            if (this.a.a(e2, object, true) != null) continue;
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public int hashCode() {
        int n2 = 0;
        for (Object e2 : this) {
            n2 += e2.hashCode();
        }
        return n2;
    }

    @Override
    public boolean equals(Object object) {
        Set set;
        return object instanceof Set && ((set = (Set)object) == this || this.containsAll((Collection)set) && set.containsAll(this));
    }

    public i c() {
        a a2 = this.a;
        long l2 = a2.f();
        av[] arrav = a2.j;
        int n2 = a2.j == null ? 0 : arrav.length;
        return new ac(arrav, n2, 0, n2, l2 < 0L ? 0L : l2);
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
                c2.a(av2.c);
            }
        }
    }
}

