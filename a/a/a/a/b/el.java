/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.cr;
import a.a.a.a.b.cy;
import a.a.a.a.b.dh;
import a.a.a.a.b.di;
import a.a.a.a.b.ee;
import a.a.a.a.b.ei;
import a.a.a.a.b.ej;
import java.io.Serializable;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

public class el
extends ee
implements ei,
Serializable,
Cloneable {
    private static final long a = -7046029254386353129L;

    protected el() {
    }

    @Override
    public boolean g(long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public cr j() {
        return this.bH_();
    }

    @Override
    public cr d(long l2) {
        return di.a;
    }

    @Override
    public ei a(long l2, long l3) {
        return ej.a;
    }

    @Override
    public ei b(long l2) {
        return ej.a;
    }

    @Override
    public ei c(long l2) {
        return ej.a;
    }

    @Override
    public long c() {
        throw new NoSuchElementException();
    }

    @Override
    public long d() {
        throw new NoSuchElementException();
    }

    @Override
    public cy b() {
        return null;
    }

    @Override
    public ei a(Long l2, Long l3) {
        return ej.a;
    }

    @Override
    public ei b(Long l2) {
        return ej.a;
    }

    @Override
    public ei c(Long l2) {
        return ej.a;
    }

    public Long h() {
        throw new NoSuchElementException();
    }

    public Long i() {
        throw new NoSuchElementException();
    }

    @Override
    public Object clone() {
        return ej.a;
    }

    private Object k() {
        return ej.a;
    }

    @Override
    public /* synthetic */ dh g() {
        return this.j();
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

