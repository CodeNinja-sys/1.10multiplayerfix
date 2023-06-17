/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.ad;
import a.a.a.a.c.ae;
import a.a.a.a.c.av;
import a.a.a.a.c.aw;
import a.a.a.a.c.v;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

public class bc
extends av
implements aw,
Serializable {
    private static final long c = -7046029254386353129L;
    protected final aw b;

    protected bc(aw aw2) {
        super(aw2);
        this.b = aw2;
    }

    public Comparator comparator() {
        return this.b.comparator();
    }

    @Override
    public aw a(Object object, Object object2) {
        return new bc(this.b.a(object, object2));
    }

    @Override
    public aw b(Object object) {
        return new bc(this.b.b(object));
    }

    @Override
    public aw a(Object object) {
        return new bc(this.b.a(object));
    }

    @Override
    public v c() {
        return ae.a(this.b.c());
    }

    @Override
    public v c(Object object) {
        return ae.a(this.b.c(object));
    }

    @Override
    public v h() {
        return this.c();
    }

    public Object first() {
        return this.b.first();
    }

    public Object last() {
        return this.b.last();
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

