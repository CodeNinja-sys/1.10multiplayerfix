/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.cr;
import a.a.a.a.b.cy;
import a.a.a.a.b.dh;
import a.a.a.a.b.di;
import a.a.a.a.b.eh;
import a.a.a.a.b.ei;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

public class eo
extends eh
implements ei,
Serializable {
    private static final long c = -7046029254386353129L;
    protected final ei b;

    protected eo(ei ei2) {
        super(ei2);
        this.b = ei2;
    }

    @Override
    public cy b() {
        return this.b.b();
    }

    @Override
    public ei a(long l2, long l3) {
        return new eo(this.b.a(l2, l3));
    }

    @Override
    public ei b(long l2) {
        return new eo(this.b.b(l2));
    }

    @Override
    public ei c(long l2) {
        return new eo(this.b.c(l2));
    }

    @Override
    public cr bH_() {
        return di.a(this.b.bH_());
    }

    @Override
    public cr d(long l2) {
        return di.a(this.b.d(l2));
    }

    @Override
    public cr j() {
        return this.bH_();
    }

    @Override
    public long c() {
        return this.b.c();
    }

    @Override
    public long d() {
        return this.b.d();
    }

    public Long h() {
        return (Long)this.b.first();
    }

    public Long i() {
        return (Long)this.b.last();
    }

    @Override
    public ei a(Long l2, Long l3) {
        return new eo(this.b.a(l2, l3));
    }

    @Override
    public ei b(Long l2) {
        return new eo(this.b.b(l2));
    }

    @Override
    public ei c(Long l2) {
        return new eo(this.b.c(l2));
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

