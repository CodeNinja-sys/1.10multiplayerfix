/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.ad;
import a.a.a.a.c.ap;
import a.a.a.a.c.at;
import a.a.a.a.c.aw;
import a.a.a.a.c.ax;
import a.a.a.a.c.ay;
import a.a.a.a.c.v;
import java.io.Serializable;
import java.util.Comparator;
import java.util.SortedSet;

public class ba
extends at
implements aw,
Serializable,
Cloneable {
    private static final long c = -7046029254386353129L;
    final Comparator b;

    private ba(Object object, Comparator comparator) {
        super(object);
        this.b = comparator;
    }

    private ba(Object object) {
        this(object, (Comparator)null);
    }

    final int b(Object object, Object object2) {
        return this.b == null ? ((Comparable)object).compareTo(object2) : this.b.compare(object, object2);
    }

    @Override
    public v h() {
        return this.b();
    }

    @Override
    public v c(Object object) {
        ap ap2 = this.b();
        if (this.b(this.a, object) <= 0) {
            ap2.next();
        }
        return ap2;
    }

    public Comparator comparator() {
        return this.b;
    }

    @Override
    public aw a(Object object, Object object2) {
        if (this.b(object, this.a) <= 0 && this.b(this.a, object2) < 0) {
            return this;
        }
        return ax.a;
    }

    @Override
    public aw b(Object object) {
        if (this.b(this.a, object) < 0) {
            return this;
        }
        return ax.a;
    }

    @Override
    public aw a(Object object) {
        if (this.b(object, this.a) <= 0) {
            return this;
        }
        return ax.a;
    }

    public Object first() {
        return this.a;
    }

    public Object last() {
        return this.a;
    }

    @Override
    public /* synthetic */ ad g() {
        return this.h();
    }

    @Override
    public /* synthetic */ v c() {
        return super.b();
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

    /* synthetic */ ba(Object object, ay ay2) {
        this(object);
    }

    /* synthetic */ ba(Object object, Comparator comparator, ay ay2) {
        this(object, comparator);
    }
}

