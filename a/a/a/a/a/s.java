/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cs;
import a.a.a.a.a.dh;
import a.a.a.a.a.dt;
import a.a.a.a.a.du;
import a.a.a.a.a.q;
import a.a.a.a.a.t;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class s
extends q
implements Serializable {
    private static final long d = -7046029254386353129L;
    protected final dt a;
    protected final int b;
    protected int c;
    private static final boolean e = false;

    public s(dt dt2, int n2, int n3) {
        this.a = dt2;
        this.b = n2;
        this.c = n3;
    }

    private void l() {
    }

    @Override
    public boolean e(int n2) {
        this.a.a(this.c, n2);
        ++this.c;
        return true;
    }

    @Override
    public void a(int n2, int n3) {
        this.b(n2);
        this.a.a(this.b + n2, n3);
        ++this.c;
    }

    @Override
    public boolean addAll(int n2, Collection collection) {
        this.b(n2);
        this.c += collection.size();
        return this.a.addAll(this.b + n2, collection);
    }

    @Override
    public int q(int n2) {
        this.c(n2);
        return this.a.q(this.b + n2);
    }

    @Override
    public int d(int n2) {
        this.c(n2);
        --this.c;
        return this.a.d(this.b + n2);
    }

    @Override
    public int b(int n2, int n3) {
        this.c(n2);
        return this.a.b(this.b + n2, n3);
    }

    @Override
    public void clear() {
        this.e(0, this.size());
    }

    @Override
    public int size() {
        return this.c - this.b;
    }

    @Override
    public void b(int n2, int[] arrn, int n3, int n4) {
        this.b(n2);
        if (n2 + n4 > this.size()) {
            throw new IndexOutOfBoundsException("End index (" + n2 + n4 + ") is greater than list size (" + this.size() + ")");
        }
        this.a.b(this.b + n2, arrn, n3, n4);
    }

    @Override
    public void e(int n2, int n3) {
        this.b(n2);
        this.b(n3);
        this.a.e(this.b + n2, this.b + n3);
        this.c -= n3 - n2;
    }

    @Override
    public void a(int n2, int[] arrn, int n3, int n4) {
        this.b(n2);
        this.a.a(this.b + n2, arrn, n3, n4);
        this.c += n4;
    }

    @Override
    public du h(int n2) {
        this.b(n2);
        return new t(this, n2);
    }

    @Override
    public dt c(int n2, int n3) {
        this.b(n2);
        this.b(n3);
        if (n2 > n3) {
            throw new IllegalArgumentException("Start index (" + n2 + ") is greater than end index (" + n3 + ")");
        }
        return new s(this, n2, n3);
    }

    @Override
    public boolean f(int n2) {
        int n3 = this.i(n2);
        if (n3 == -1) {
            return false;
        }
        --this.c;
        this.a.d(this.b + n3);
        return true;
    }

    @Override
    public boolean remove(Object object) {
        return this.f((Integer)object);
    }

    @Override
    public boolean a(int n2, cs cs2) {
        this.b(n2);
        this.c += cs2.size();
        return this.a.a(this.b + n2, cs2);
    }

    @Override
    public boolean a(int n2, dt dt2) {
        this.b(n2);
        this.c += dt2.size();
        return this.a.a(this.b + n2, dt2);
    }

    @Override
    public /* synthetic */ List subList(int n2, int n3) {
        return this.c(n2, n3);
    }

    @Override
    public /* synthetic */ ListIterator listIterator(int n2) {
        return this.h(n2);
    }

    @Override
    public /* synthetic */ ListIterator listIterator() {
        return super.e();
    }

    @Override
    public /* synthetic */ Object remove(int n2) {
        return super.o(n2);
    }

    @Override
    public /* synthetic */ void add(int n2, Object object) {
        super.a(n2, (Integer)object);
    }

    @Override
    public /* synthetic */ Object set(int n2, Object object) {
        return super.b(n2, (Integer)object);
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return super.n(n2);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return super.d();
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return super.a((List)object);
    }

    @Override
    public /* synthetic */ dh a() {
        return super.d();
    }

    @Override
    public /* synthetic */ Object g_(int n2) {
        return super.p(n2);
    }

    @Override
    public /* synthetic */ Object b() {
        return super.k();
    }

    @Override
    public /* synthetic */ Object bE_() {
        return super.j();
    }

    @Override
    public /* synthetic */ void a(Object object) {
        super.b((Integer)object);
    }
}

