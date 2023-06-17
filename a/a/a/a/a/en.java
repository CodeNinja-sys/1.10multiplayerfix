/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cr;
import a.a.a.a.a.cy;
import a.a.a.a.a.dh;
import a.a.a.a.a.di;
import a.a.a.a.a.eg;
import a.a.a.a.a.eh;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

public class en
extends eg
implements eh,
Serializable {
    private static final long c = -7046029254386353129L;
    protected final eh b;

    protected en(eh eh2) {
        super(eh2);
        this.b = eh2;
    }

    @Override
    public cy b() {
        return this.b.b();
    }

    @Override
    public eh a(int n2, int n3) {
        return new en(this.b.a(n2, n3));
    }

    @Override
    public eh b(int n2) {
        return new en(this.b.b(n2));
    }

    @Override
    public eh c(int n2) {
        return new en(this.b.c(n2));
    }

    @Override
    public cr bF_() {
        return di.a(this.b.bF_());
    }

    @Override
    public cr d(int n2) {
        return di.a(this.b.d(n2));
    }

    @Override
    public cr j() {
        return this.bF_();
    }

    @Override
    public int c() {
        return this.b.c();
    }

    @Override
    public int d() {
        return this.b.d();
    }

    public Integer h() {
        return (Integer)this.b.first();
    }

    public Integer i() {
        return (Integer)this.b.last();
    }

    @Override
    public eh a(Integer n2, Integer n3) {
        return new en(this.b.a(n2, n3));
    }

    @Override
    public eh b(Integer n2) {
        return new en(this.b.b(n2));
    }

    @Override
    public eh c(Integer n2) {
        return new en(this.b.c(n2));
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

