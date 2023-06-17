/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gh;
import com.a.a.d.ov;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public abstract class gp
extends gh
implements List {
    protected gp() {
    }

    protected abstract List a();

    public void add(int n2, Object object) {
        this.a().add(n2, object);
    }

    public boolean addAll(int n2, Collection collection) {
        return this.a().addAll(n2, collection);
    }

    public Object get(int n2) {
        return this.a().get(n2);
    }

    @Override
    public int indexOf(Object object) {
        return this.a().indexOf(object);
    }

    @Override
    public int lastIndexOf(Object object) {
        return this.a().lastIndexOf(object);
    }

    public ListIterator listIterator() {
        return this.a().listIterator();
    }

    public ListIterator listIterator(int n2) {
        return this.a().listIterator(n2);
    }

    public Object remove(int n2) {
        return this.a().remove(n2);
    }

    public Object set(int n2, Object object) {
        return this.a().set(n2, object);
    }

    public List subList(int n2, int n3) {
        return this.a().subList(n2, n3);
    }

    @Override
    public boolean equals(Object object) {
        return object == this || this.a().equals(object);
    }

    @Override
    public int hashCode() {
        return this.a().hashCode();
    }

    protected boolean a(Object object) {
        this.add(this.size(), object);
        return true;
    }

    protected boolean a(int n2, Iterable iterable) {
        return ov.a((List)this, n2, iterable);
    }

    protected int d(Object object) {
        return ov.b((List)this, object);
    }

    protected int e(Object object) {
        return ov.c(this, object);
    }

    protected Iterator c() {
        return this.listIterator();
    }

    protected ListIterator d() {
        return this.listIterator(0);
    }

    protected ListIterator a(int n2) {
        return ov.b((List)this, n2);
    }

    protected List a(int n2, int n3) {
        return ov.a((List)this, n2, n3);
    }

    protected boolean f(Object object) {
        return ov.a((List)this, object);
    }

    protected int e() {
        return ov.c(this);
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.a();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }
}

