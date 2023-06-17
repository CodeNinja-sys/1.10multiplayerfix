/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.acu;
import com.a.a.d.add;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

class adg
extends add
implements List {
    private static final long a = 0L;

    adg(List list, Object object) {
        super(list, object, null);
    }

    List a() {
        return (List)super.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void add(int n2, Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            this.a().add(n2, object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean addAll(int n2, Collection collection) {
        Object object = this.h;
        synchronized (object) {
            return this.a().addAll(n2, collection);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object get(int n2) {
        Object object = this.h;
        synchronized (object) {
            return this.a().get(n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int indexOf(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().indexOf(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int lastIndexOf(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().lastIndexOf(object);
        }
    }

    public ListIterator listIterator() {
        return this.a().listIterator();
    }

    public ListIterator listIterator(int n2) {
        return this.a().listIterator(n2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object remove(int n2) {
        Object object = this.h;
        synchronized (object) {
            return this.a().remove(n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object set(int n2, Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().set(n2, object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public List subList(int n2, int n3) {
        Object object = this.h;
        synchronized (object) {
            return acu.a(this.a().subList(n2, n3), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().equals(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int hashCode() {
        Object object = this.h;
        synchronized (object) {
            return this.a().hashCode();
        }
    }

    @Override
    /* synthetic */ Collection b() {
        return this.a();
    }

    @Override
    /* synthetic */ Object e() {
        return this.a();
    }
}

