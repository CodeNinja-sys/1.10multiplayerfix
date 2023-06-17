/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cr;
import a.a.a.a.a.cy;
import a.a.a.a.a.dh;
import a.a.a.a.a.di;
import a.a.a.a.a.ed;
import a.a.a.a.a.eh;
import a.a.a.a.a.ei;
import java.io.Serializable;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

public class ek
extends ed
implements eh,
Serializable,
Cloneable {
    private static final long a = -7046029254386353129L;

    protected ek() {
    }

    @Override
    public boolean g(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public cr j() {
        return this.bF_();
    }

    @Override
    public cr d(int n2) {
        return di.a;
    }

    @Override
    public eh a(int n2, int n3) {
        return ei.a;
    }

    @Override
    public eh b(int n2) {
        return ei.a;
    }

    @Override
    public eh c(int n2) {
        return ei.a;
    }

    @Override
    public int c() {
        throw new NoSuchElementException();
    }

    @Override
    public int d() {
        throw new NoSuchElementException();
    }

    @Override
    public cy b() {
        return null;
    }

    @Override
    public eh a(Integer n2, Integer n3) {
        return ei.a;
    }

    @Override
    public eh b(Integer n2) {
        return ei.a;
    }

    @Override
    public eh c(Integer n2) {
        return ei.a;
    }

    public Integer h() {
        throw new NoSuchElementException();
    }

    public Integer i() {
        throw new NoSuchElementException();
    }

    @Override
    public Object clone() {
        return ei.a;
    }

    private Object k() {
        return ei.a;
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

