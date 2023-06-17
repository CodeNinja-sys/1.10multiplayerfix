/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.c.k;
import org.apache.logging.log4j.j;

public class h
implements k {
    private static final long a = 50505011L;
    private final List b;

    public h(List list) {
        this.b = new ArrayList(list);
    }

    private h(h h2) {
        this.b = new ArrayList(h2.b);
    }

    @Override
    public String a() {
        if (this.b.isEmpty()) {
            return null;
        }
        int n2 = this.b.size() - 1;
        String string = (String)this.b.remove(n2);
        return string;
    }

    @Override
    public String b() {
        if (this.b.isEmpty()) {
            return null;
        }
        int n2 = this.b.size() - 1;
        return (String)this.b.get(n2);
    }

    @Override
    public void a(String string) {
        this.b.add(string);
    }

    @Override
    public int c() {
        return this.b.size();
    }

    @Override
    public List d() {
        return this.b;
    }

    @Override
    public void a(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Maximum stack depth cannot be negative");
        }
        if (this.b == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.b.size());
        int n3 = Math.min(n2, this.b.size());
        for (int i2 = 0; i2 < n3; ++i2) {
            arrayList.add(this.b.get(i2));
        }
        this.b.clear();
        this.b.addAll(arrayList);
    }

    public k f() {
        return new h(this);
    }

    @Override
    public void clear() {
        this.b.clear();
    }

    @Override
    public int size() {
        return this.b.size();
    }

    @Override
    public boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override
    public boolean contains(Object object) {
        return this.b.contains(object);
    }

    @Override
    public Iterator iterator() {
        return this.b.iterator();
    }

    @Override
    public Object[] toArray() {
        return this.b.toArray();
    }

    public Object[] toArray(Object[] arrobject) {
        return this.b.toArray(arrobject);
    }

    public boolean b(String string) {
        return this.b.add(string);
    }

    @Override
    public boolean remove(Object object) {
        return this.b.remove(object);
    }

    public boolean containsAll(Collection collection) {
        return this.b.containsAll(collection);
    }

    public boolean addAll(Collection collection) {
        return this.b.addAll(collection);
    }

    public boolean removeAll(Collection collection) {
        return this.b.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        return this.b.retainAll(collection);
    }

    public String toString() {
        return String.valueOf(this.b);
    }

    @Override
    public /* synthetic */ j e() {
        return this.f();
    }

    public /* synthetic */ boolean add(Object object) {
        return this.b((String)object);
    }
}

