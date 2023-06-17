/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.cs;
import a.a.a.a.b.cx;
import a.a.a.a.b.dh;
import a.a.a.a.b.di;
import a.a.a.a.b.du;
import a.a.a.a.b.dv;
import a.a.a.a.b.dw;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class eb
extends cx
implements du,
Serializable {
    private static final long c = -7046029254386353129L;
    protected final du b;

    protected eb(du du2) {
        super(du2);
        this.b = du2;
    }

    @Override
    public long l(int n2) {
        return this.b.l(n2);
    }

    @Override
    public long b(int n2, long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(int n2, long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long d(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int b(long l2) {
        return this.b.b(l2);
    }

    @Override
    public int c(long l2) {
        return this.b.c(l2);
    }

    public boolean addAll(int n2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void b(int n2, long[] arrl, int n3, int n4) {
        this.b.b(n2, arrl, n3, n4);
    }

    @Override
    public void c(int n2, int n3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(int n2, long[] arrl, int n3, int n4) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(int n2, long[] arrl) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void g(int n2) {
        this.b.g(n2);
    }

    @Override
    public dv d() {
        return this.e();
    }

    @Override
    public dv e() {
        return di.a(this.b.e());
    }

    @Override
    public dv f(int n2) {
        return di.a(this.b.f(n2));
    }

    @Override
    public dv c() {
        return this.e();
    }

    @Override
    public dv e(int n2) {
        return this.f(n2);
    }

    @Override
    public du a(int n2, int n3) {
        return dw.b(this.b.a(n2, n3));
    }

    @Override
    public du b(int n2, int n3) {
        return this.a(n2, n3);
    }

    @Override
    public boolean equals(Object object) {
        return this.a.equals(object);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    public int a(List list) {
        return this.b.compareTo(list);
    }

    @Override
    public boolean a(int n2, cs cs2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(du du2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(int n2, du du2) {
        throw new UnsupportedOperationException();
    }

    public Long a(int n2) {
        return (Long)this.b.get(n2);
    }

    public void a(int n2, Long l2) {
        throw new UnsupportedOperationException();
    }

    public Long b(int n2, Long l2) {
        throw new UnsupportedOperationException();
    }

    public Long b(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object object) {
        return this.b.indexOf(object);
    }

    @Override
    public int lastIndexOf(Object object) {
        return this.b.lastIndexOf(object);
    }

    @Override
    public /* synthetic */ dh a() {
        return this.d();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.d();
    }

    public /* synthetic */ List subList(int n2, int n3) {
        return this.a(n2, n3);
    }

    public /* synthetic */ ListIterator listIterator(int n2) {
        return this.f(n2);
    }

    public /* synthetic */ ListIterator listIterator() {
        return this.e();
    }

    public /* synthetic */ Object remove(int n2) {
        return this.b(n2);
    }

    public /* synthetic */ void add(int n2, Object object) {
        this.a(n2, (Long)object);
    }

    public /* synthetic */ Object set(int n2, Object object) {
        return this.b(n2, (Long)object);
    }

    public /* synthetic */ Object get(int n2) {
        return this.a(n2);
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((List)object);
    }
}

