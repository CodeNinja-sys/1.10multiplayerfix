/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.m;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import org.apache.a.m.i;
import org.apache.a.m.k;
import org.apache.a.o.a;
import org.apache.a.o.b;

abstract class m {
    private final Object a;
    private final Set b;
    private final LinkedList c;
    private final LinkedList d;

    m(Object object) {
        this.a = object;
        this.b = new HashSet();
        this.c = new LinkedList();
        this.d = new LinkedList();
    }

    protected abstract i a(Object var1);

    public final Object a() {
        return this.a;
    }

    public int b() {
        return this.b.size();
    }

    public int c() {
        return this.d.size();
    }

    public int d() {
        return this.c.size();
    }

    public int e() {
        return this.c.size() + this.b.size();
    }

    public i b(Object object) {
        if (!this.c.isEmpty()) {
            i i2;
            Iterator iterator;
            if (object != null) {
                iterator = this.c.iterator();
                while (iterator.hasNext()) {
                    i2 = (i)iterator.next();
                    if (!object.equals(i2.l())) continue;
                    iterator.remove();
                    this.b.add(i2);
                    return i2;
                }
            }
            iterator = this.c.iterator();
            while (iterator.hasNext()) {
                i2 = (i)iterator.next();
                if (i2.l() != null) continue;
                iterator.remove();
                this.b.add(i2);
                return i2;
            }
        }
        return null;
    }

    public i f() {
        if (!this.c.isEmpty()) {
            return (i)this.c.getLast();
        }
        return null;
    }

    public boolean a(i i2) {
        org.apache.a.o.a.a(i2, "Pool entry");
        return this.c.remove(i2) || this.b.remove(i2);
    }

    public void a(i i2, boolean bl2) {
        org.apache.a.o.a.a(i2, "Pool entry");
        boolean bl3 = this.b.remove(i2);
        org.apache.a.o.b.a(bl3, "Entry %s has not been leased from this pool", i2);
        if (bl2) {
            this.c.addFirst(i2);
        }
    }

    public i c(Object object) {
        i i2 = this.a(object);
        this.b.add(i2);
        return i2;
    }

    public void a(k k2) {
        if (k2 == null) {
            return;
        }
        this.d.add(k2);
    }

    public k g() {
        return (k)this.d.poll();
    }

    public void b(k k2) {
        if (k2 == null) {
            return;
        }
        this.d.remove(k2);
    }

    public void h() {
        for (Object object : this.d) {
            ((k)object).cancel(true);
        }
        this.d.clear();
        for (Object object : this.c) {
            ((i)object).f();
        }
        this.c.clear();
        for (Object object : this.b) {
            ((i)object).f();
        }
        this.b.clear();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[route: ");
        stringBuilder.append(this.a);
        stringBuilder.append("][leased: ");
        stringBuilder.append(this.b.size());
        stringBuilder.append("][available: ");
        stringBuilder.append(this.c.size());
        stringBuilder.append("][pending: ");
        stringBuilder.append(this.d.size());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

