/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.cr;
import a.a.a.a.b.cy;
import a.a.a.a.b.dh;
import a.a.a.a.b.eg;
import a.a.a.a.b.ei;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

public class en
extends eg
implements ei,
Serializable {
    private static final long d = -7046029254386353129L;
    protected final ei c;

    protected en(ei ei2, Object object) {
        super(ei2, object);
        this.c = ei2;
    }

    protected en(ei ei2) {
        super(ei2);
        this.c = ei2;
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
    public ei a(long l2, long l3) {
        return new en(this.c.a(l2, l3), this.b);
    }

    @Override
    public ei b(long l2) {
        return new en(this.c.b(l2), this.b);
    }

    @Override
    public ei c(long l2) {
        return new en(this.c.c(l2), this.b);
    }

    @Override
    public cr bH_() {
        return this.c.bH_();
    }

    @Override
    public cr d(long l2) {
        return this.c.d(l2);
    }

    @Override
    public cr j() {
        return this.c.bH_();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public long c() {
        Object object = this.b;
        synchronized (object) {
            return this.c.c();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public long d() {
        Object object = this.b;
        synchronized (object) {
            return this.c.d();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Long h() {
        Object object = this.b;
        synchronized (object) {
            return (Long)this.c.first();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Long i() {
        Object object = this.b;
        synchronized (object) {
            return (Long)this.c.last();
        }
    }

    @Override
    public ei a(Long l2, Long l3) {
        return new en(this.c.a(l2, l3), this.b);
    }

    @Override
    public ei b(Long l2) {
        return new en(this.c.b(l2), this.b);
    }

    @Override
    public ei c(Long l2) {
        return new en(this.c.c(l2), this.b);
    }

    @Override
    public /* synthetic */ dh a() {
        return this.bH_();
    }

    @Override
    public /* synthetic */ dh g() {
        return this.j();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.bH_();
    }

    public /* synthetic */ Object last() {
        return this.i();
    }

    public /* synthetic */ Object first() {
        return this.h();
    }

    public /* synthetic */ SortedSet tailSet(Object object) {
        return this.c((Long)object);
    }

    public /* synthetic */ SortedSet headSet(Object object) {
        return this.b((Long)object);
    }

    public /* synthetic */ SortedSet subSet(Object object, Object object2) {
        return this.a((Long)object, (Long)object2);
    }

    public /* synthetic */ Comparator comparator() {
        return this.b();
    }
}

