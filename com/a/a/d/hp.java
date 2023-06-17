/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.hi;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

public abstract class hp
extends hi
implements SortedSet {
    protected hp() {
    }

    protected abstract SortedSet c();

    public Comparator comparator() {
        return this.c().comparator();
    }

    public Object first() {
        return this.c().first();
    }

    public SortedSet headSet(Object object) {
        return this.c().headSet(object);
    }

    public Object last() {
        return this.c().last();
    }

    public SortedSet subSet(Object object, Object object2) {
        return this.c().subSet(object, object2);
    }

    public SortedSet tailSet(Object object) {
        return this.c().tailSet(object);
    }

    private int b(Object object, Object object2) {
        Comparator comparator = this.comparator();
        return comparator == null ? ((Comparable)object).compareTo(object2) : comparator.compare(object, object2);
    }

    @Override
    protected boolean b(Object object) {
        try {
            hp hp2 = this;
            Object object2 = hp2.tailSet(object).first();
            return this.b(object2, object) == 0;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
        catch (NoSuchElementException noSuchElementException) {
            return false;
        }
        catch (NullPointerException nullPointerException) {
            return false;
        }
    }

    @Override
    protected boolean c(Object object) {
        try {
            Object e2;
            hp hp2 = this;
            Iterator iterator = hp2.tailSet(object).iterator();
            if (iterator.hasNext() && this.b(e2 = iterator.next(), object) == 0) {
                iterator.remove();
                return true;
            }
        }
        catch (ClassCastException classCastException) {
            return false;
        }
        catch (NullPointerException nullPointerException) {
            return false;
        }
        return false;
    }

    protected SortedSet a(Object object, Object object2) {
        return this.tailSet(object).headSet(object2);
    }

    @Override
    protected /* synthetic */ Set bI_() {
        return this.c();
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

