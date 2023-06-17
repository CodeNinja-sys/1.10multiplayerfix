/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.ad;
import a.a.a.a.c.ao;
import a.a.a.a.c.ap;
import a.a.a.a.c.d;
import a.a.a.a.c.g;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class f
extends d
implements Serializable {
    private static final long d = -7046029254386353129L;
    protected final ao a;
    protected final int b;
    protected int c;
    private static final boolean e = false;

    public f(ao ao2, int n2, int n3) {
        this.a = ao2;
        this.b = n2;
        this.c = n3;
    }

    private void f() {
    }

    @Override
    public boolean add(Object object) {
        this.a.add(this.c, object);
        ++this.c;
        return true;
    }

    @Override
    public void add(int n2, Object object) {
        this.b(n2);
        this.a.add(this.b + n2, object);
        ++this.c;
    }

    @Override
    public boolean addAll(int n2, Collection collection) {
        this.b(n2);
        this.c += collection.size();
        return this.a.addAll(this.b + n2, collection);
    }

    public Object get(int n2) {
        this.c(n2);
        return this.a.get(this.b + n2);
    }

    @Override
    public Object remove(int n2) {
        this.c(n2);
        --this.c;
        return this.a.remove(this.b + n2);
    }

    @Override
    public Object set(int n2, Object object) {
        this.c(n2);
        return this.a.set(this.b + n2, object);
    }

    @Override
    public void clear() {
        this.c(0, this.size());
    }

    @Override
    public int size() {
        return this.c - this.b;
    }

    @Override
    public void b(int n2, Object[] arrobject, int n3, int n4) {
        this.b(n2);
        if (n2 + n4 > this.size()) {
            throw new IndexOutOfBoundsException("End index (" + n2 + n4 + ") is greater than list size (" + this.size() + ")");
        }
        this.a.b(this.b + n2, arrobject, n3, n4);
    }

    @Override
    public void c(int n2, int n3) {
        this.b(n2);
        this.b(n3);
        this.a.c(this.b + n2, this.b + n3);
        this.c -= n3 - n2;
    }

    @Override
    public void a(int n2, Object[] arrobject, int n3, int n4) {
        this.b(n2);
        this.a.a(this.b + n2, arrobject, n3, n4);
        this.c += n4;
    }

    @Override
    public ap e(int n2) {
        this.b(n2);
        return new g(this, n2);
    }

    @Override
    public ao a(int n2, int n3) {
        this.b(n2);
        this.b(n3);
        if (n2 > n3) {
            throw new IllegalArgumentException("Start index (" + n2 + ") is greater than end index (" + n3 + ")");
        }
        return new f(this, n2, n3);
    }

    @Override
    public boolean remove(Object object) {
        int n2 = this.indexOf(object);
        if (n2 == -1) {
            return false;
        }
        this.remove(n2);
        return true;
    }

    @Override
    public /* synthetic */ List subList(int n2, int n3) {
        return this.a(n2, n3);
    }

    @Override
    public /* synthetic */ ListIterator listIterator(int n2) {
        return this.e(n2);
    }

    @Override
    public /* synthetic */ ListIterator listIterator() {
        return super.e();
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
    public /* synthetic */ ad a() {
        return super.d();
    }
}

