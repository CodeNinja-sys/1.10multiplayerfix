/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.hp;
import com.a.a.d.nj;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

public abstract class he
extends hp
implements NavigableSet {
    protected he() {
    }

    protected abstract NavigableSet d();

    public Object lower(Object object) {
        return this.d().lower(object);
    }

    protected Object a(Object object) {
        return nj.d(this.headSet(object, false).descendingIterator(), null);
    }

    public Object floor(Object object) {
        return this.d().floor(object);
    }

    protected Object d(Object object) {
        return nj.d(this.headSet(object, true).descendingIterator(), null);
    }

    public Object ceiling(Object object) {
        return this.d().ceiling(object);
    }

    protected Object e(Object object) {
        return nj.d(this.tailSet(object, true).iterator(), null);
    }

    public Object higher(Object object) {
        return this.d().higher(object);
    }

    protected Object f(Object object) {
        return nj.d(this.tailSet(object, false).iterator(), null);
    }

    public Object pollFirst() {
        return this.d().pollFirst();
    }

    protected Object e() {
        return nj.h(this.iterator());
    }

    public Object pollLast() {
        return this.d().pollLast();
    }

    protected Object f() {
        return nj.h(this.descendingIterator());
    }

    protected Object h() {
        return this.iterator().next();
    }

    protected Object i() {
        return this.descendingIterator().next();
    }

    public NavigableSet descendingSet() {
        return this.d().descendingSet();
    }

    public Iterator descendingIterator() {
        return this.d().descendingIterator();
    }

    public NavigableSet subSet(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.d().subSet(object, bl2, object2, bl3);
    }

    protected NavigableSet a(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.tailSet(object, bl2).headSet(object2, bl3);
    }

    @Override
    protected SortedSet a(Object object, Object object2) {
        return this.subSet(object, true, object2, false);
    }

    public NavigableSet headSet(Object object, boolean bl2) {
        return this.d().headSet(object, bl2);
    }

    protected SortedSet g(Object object) {
        return this.headSet(object, false);
    }

    public NavigableSet tailSet(Object object, boolean bl2) {
        return this.d().tailSet(object, bl2);
    }

    protected SortedSet h(Object object) {
        return this.tailSet(object, true);
    }

    @Override
    protected /* synthetic */ SortedSet c() {
        return this.d();
    }

    @Override
    protected /* synthetic */ Set bI_() {
        return this.d();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.d();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.d();
    }
}

