/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cr;
import a.a.a.a.a.cy;
import a.a.a.a.a.dh;
import a.a.a.a.a.ef;
import a.a.a.a.a.eh;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

public class em
extends ef
implements eh,
Serializable {
    private static final long d = -7046029254386353129L;
    protected final eh c;

    protected em(eh eh2, Object object) {
        super(eh2, object);
        this.c = eh2;
    }

    protected em(eh eh2) {
        super(eh2);
        this.c = eh2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public cy b() {
        Object object = this.b;
        synchronized (object) {
            return this.c.b();
        }
    }

    @Override
    public eh a(int n2, int n3) {
        return new em(this.c.a(n2, n3), this.b);
    }

    @Override
    public eh b(int n2) {
        return new em(this.c.b(n2), this.b);
    }

    @Override
    public eh c(int n2) {
        return new em(this.c.c(n2), this.b);
    }

    @Override
    public cr bF_() {
        return this.c.bF_();
    }

    @Override
    public cr d(int n2) {
        return this.c.d(n2);
    }

    @Override
    public cr j() {
        return this.c.bF_();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int c() {
        Object object = this.b;
        synchronized (object) {
            return this.c.c();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int d() {
        Object object = this.b;
        synchronized (object) {
            return this.c.d();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Integer h() {
        Object object = this.b;
        synchronized (object) {
            return (Integer)this.c.first();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Integer i() {
        Object object = this.b;
        synchronized (object) {
            return (Integer)this.c.last();
        }
    }

    @Override
    public eh a(Integer n2, Integer n3) {
        return new em(this.c.a(n2, n3), this.b);
    }

    @Override
    public eh b(Integer n2) {
        return new em(this.c.b(n2), this.b);
    }

    @Override
    public eh c(Integer n2) {
        return new em(this.c.c(n2), this.b);
    }

    @Override
    public /* synthetic */ dh a() {
        return this.bF_();
    }

    @Override
    public /* synthetic */ dh g() {
        return this.j();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.bF_();
    }

    public /* synthetic */ Object last() {
        return this.i();
    }

    public /* synthetic */ Object first() {
        return this.h();
    }

    public /* synthetic */ SortedSet tailSet(Object object) {
        return this.c((Integer)object);
    }

    public /* synthetic */ SortedSet headSet(Object object) {
        return this.b((Integer)object);
    }

    public /* synthetic */ SortedSet subSet(Object object, Object object2) {
        return this.a((Integer)object, (Integer)object2);
    }

    public /* synthetic */ Comparator comparator() {
        return this.b();
    }
}

