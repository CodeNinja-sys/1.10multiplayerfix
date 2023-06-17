/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.ce;
import com.a.a.d.ep;
import com.a.a.d.et;
import com.a.a.d.me;
import com.a.a.d.mf;
import com.a.a.d.yd;
import com.a.a.d.yl;
import com.a.a.d.ys;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

public abstract class du
extends me {
    final ep a;

    public static du a(yl yl2, ep ep2) {
        cl.a(yl2);
        cl.a(ep2);
        yl yl3 = yl2;
        try {
            if (!yl2.d()) {
                yl3 = yl3.c(yl.d(ep2.d()));
            }
            if (!yl2.g()) {
                yl3 = yl3.c(yl.b(ep2.e()));
            }
        }
        catch (NoSuchElementException noSuchElementException) {
            throw new IllegalArgumentException(noSuchElementException);
        }
        boolean bl2 = yl3.j() || yl.e(yl2.b.a(ep2), yl2.c.b(ep2)) > 0;
        return bl2 ? new et(ep2) : new ys(yl3, ep2);
    }

    du(ep ep2) {
        super(yd.d());
        this.a = ep2;
    }

    public du a(Comparable comparable) {
        return this.c((Comparable)cl.a(comparable), false);
    }

    public du a(Comparable comparable, boolean bl2) {
        return this.c((Comparable)cl.a(comparable), bl2);
    }

    public du a(Comparable comparable, Comparable comparable2) {
        cl.a(comparable);
        cl.a(comparable2);
        cl.a(this.comparator().compare(comparable, comparable2) <= 0);
        return this.b(comparable, true, comparable2, false);
    }

    public du a(Comparable comparable, boolean bl2, Comparable comparable2, boolean bl3) {
        cl.a(comparable);
        cl.a(comparable2);
        cl.a(this.comparator().compare(comparable, comparable2) <= 0);
        return this.b(comparable, bl2, comparable2, bl3);
    }

    public du b(Comparable comparable) {
        return this.d((Comparable)cl.a(comparable), true);
    }

    public du b(Comparable comparable, boolean bl2) {
        return this.d((Comparable)cl.a(comparable), bl2);
    }

    abstract du c(Comparable var1, boolean var2);

    abstract du b(Comparable var1, boolean var2, Comparable var3, boolean var4);

    abstract du d(Comparable var1, boolean var2);

    public abstract du a(du var1);

    public abstract yl b();

    public abstract yl a(ce var1, ce var2);

    @Override
    public String toString() {
        return this.b().toString();
    }

    public static mf c() {
        throw new UnsupportedOperationException();
    }

    @Override
    /* synthetic */ me a(Object object, boolean bl2) {
        return this.d((Comparable)object, bl2);
    }

    @Override
    /* synthetic */ me a(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.b((Comparable)object, bl2, (Comparable)object2, bl3);
    }

    @Override
    /* synthetic */ me b(Object object, boolean bl2) {
        return this.c((Comparable)object, bl2);
    }

    @Override
    public /* synthetic */ me c(Object object, boolean bl2) {
        return this.b((Comparable)object, bl2);
    }

    @Override
    public /* synthetic */ me a(Object object) {
        return this.b((Comparable)object);
    }

    @Override
    public /* synthetic */ me b(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.a((Comparable)object, bl2, (Comparable)object2, bl3);
    }

    @Override
    public /* synthetic */ me d(Object object, boolean bl2) {
        return this.a((Comparable)object, bl2);
    }

    @Override
    public /* synthetic */ me b(Object object) {
        return this.a((Comparable)object);
    }

    @Override
    public /* synthetic */ SortedSet tailSet(Object object) {
        return this.b((Comparable)object);
    }

    @Override
    public /* synthetic */ SortedSet headSet(Object object) {
        return this.a((Comparable)object);
    }

    @Override
    public /* synthetic */ SortedSet subSet(Object object, Object object2) {
        return this.a((Comparable)object, (Comparable)object2);
    }

    @Override
    public /* synthetic */ NavigableSet tailSet(Object object, boolean bl2) {
        return this.b((Comparable)object, bl2);
    }

    @Override
    public /* synthetic */ NavigableSet headSet(Object object, boolean bl2) {
        return this.a((Comparable)object, bl2);
    }

    @Override
    public /* synthetic */ NavigableSet subSet(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.a((Comparable)object, bl2, (Comparable)object2, bl3);
    }
}

