/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.ad;
import a.a.a.a.c.ae;
import a.a.a.a.c.as;
import a.a.a.a.c.aw;
import a.a.a.a.c.ax;
import a.a.a.a.c.v;
import java.io.Serializable;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

public class az
extends as
implements aw,
Serializable,
Cloneable {
    private static final long a = -7046029254386353129L;

    protected az() {
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public v h() {
        return this.c();
    }

    @Override
    public v c(Object object) {
        return ae.a;
    }

    @Override
    public aw a(Object object, Object object2) {
        return ax.a;
    }

    @Override
    public aw b(Object object) {
        return ax.a;
    }

    @Override
    public aw a(Object object) {
        return ax.a;
    }

    public Object first() {
        throw new NoSuchElementException();
    }

    public Object last() {
        throw new NoSuchElementException();
    }

    public Comparator comparator() {
        return null;
    }

    @Override
    public Object clone() {
        return ax.a;
    }

    private Object b() {
        return ax.a;
    }

    @Override
    public /* synthetic */ ad g() {
        return this.h();
    }

    public /* synthetic */ SortedSet tailSet(Object object) {
        return this.a(object);
    }

    public /* synthetic */ SortedSet headSet(Object object) {
        return this.b(object);
    }

    public /* synthetic */ SortedSet subSet(Object object, Object object2) {
        return this.a(object, object2);
    }
}

