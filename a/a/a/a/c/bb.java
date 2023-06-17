/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.ad;
import a.a.a.a.c.au;
import a.a.a.a.c.aw;
import a.a.a.a.c.v;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

public class bb
extends au
implements aw,
Serializable {
    private static final long d = -7046029254386353129L;
    protected final aw c;

    protected bb(aw aw2, Object object) {
        super(aw2, object);
        this.c = aw2;
    }

    protected bb(aw aw2) {
        super(aw2);
        this.c = aw2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Comparator comparator() {
        Object object = this.b;
        synchronized (object) {
            return this.c.comparator();
        }
    }

    @Override
    public aw a(Object object, Object object2) {
        return new bb(this.c.a(object, object2), this.b);
    }

    @Override
    public aw b(Object object) {
        return new bb(this.c.b(object), this.b);
    }

    @Override
    public aw a(Object object) {
        return new bb(this.c.a(object), this.b);
    }

    @Override
    public v c() {
        return this.c.c();
    }

    @Override
    public v c(Object object) {
        return this.c.c(object);
    }

    @Override
    public v h() {
        return this.c.c();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object first() {
        Object object = this.b;
        synchronized (object) {
            return this.c.first();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object last() {
        Object object = this.b;
        synchronized (object) {
            return this.c.last();
        }
    }

    @Override
    public /* synthetic */ ad a() {
        return this.c();
    }

    @Override
    public /* synthetic */ ad g() {
        return this.h();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.c();
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

