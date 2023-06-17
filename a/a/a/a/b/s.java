/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.cs;
import a.a.a.a.b.dh;
import a.a.a.a.b.du;
import a.a.a.a.b.dv;
import a.a.a.a.b.q;
import a.a.a.a.b.t;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class s
extends q
implements Serializable {
    private static final long d = -7046029254386353129L;
    protected final du a;
    protected final int b;
    protected int c;
    private static final boolean e = false;

    public s(du du2, int n2, int n3) {
        this.a = du2;
        this.b = n2;
        this.c = n3;
    }

    private void l() {
    }

    @Override
    public boolean e(long l2) {
        this.a.a(this.c, l2);
        ++this.c;
        return true;
    }

    @Override
    public void a(int n2, long l2) {
        this.b(n2);
        this.a.a(this.b + n2, l2);
        ++this.c;
    }

    @Override
    public boolean addAll(int n2, Collection collection) {
        this.b(n2);
        this.c += collection.size();
        return this.a.addAll(this.b + n2, collection);
    }

    @Override
    public long l(int n2) {
        this.c(n2);
        return this.a.l(this.b + n2);
    }

    @Override
    public long d(int n2) {
        this.c(n2);
        --this.c;
        return this.a.d(this.b + n2);
    }

    @Override
    public long b(int n2, long l2) {
        this.c(n2);
        return this.a.b(this.b + n2, l2);
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
    public void b(int n2, long[] arrl, int n3, int n4) {
        this.b(n2);
        if (n2 + n4 > this.size()) {
            throw new IndexOutOfBoundsException("End index (" + n2 + n4 + ") is greater than list size (" + this.size() + ")");
        }
        this.a.b(this.b + n2, arrl, n3, n4);
    }

    @Override
    public void c(int n2, int n3) {
        this.b(n2);
        this.b(n3);
        this.a.c(this.b + n2, this.b + n3);
        this.c -= n3 - n2;
    }

    @Override
    public void a(int n2, long[] arrl, int n3, int n4) {
        this.b(n2);
        this.a.a(this.b + n2, arrl, n3, n4);
        this.c += n4;
    }

    @Override
    public dv f(int n2) {
        this.b(n2);
        return new t(this, n2);
    }

    @Override
    public du a(int n2, int n3) {
        this.b(n2);
        this.b(n3);
        if (n2 > n3) {
            throw new IllegalArgumentException("Start index (" + n2 + ") is greater than end index (" + n3 + ")");
        }
        return new s(this, n2, n3);
    }

    @Override
    public boolean f(long l2) {
        int n2 = this.b(l2);
        if (n2 == -1) {
            return false;
        }
        --this.c;
        this.a.d(this.b + n2);
        return true;
    }

    @Override
    public boolean remove(Object object) {
        return this.f((Long)object);
    }

    @Override
    public boolean a(int n2, cs cs2) {
        this.b(n2);
        this.c += cs2.size();
        return this.a.a(this.b + n2, cs2);
    }

    @Override
    public boolean a(int n2, du du2) {
        this.b(n2);
        this.c += du2.size();
        return this.a.a(this.b + n2, du2);
    }

    @Override
    public /* synthetic */ List subList(int n2, int n3) {
        return this.a(n2, n3);
    }

    @Override
    public /* synthetic */ ListIterator listIterator(int n2) {
        return this.f(n2);
    }

    @Override
    public /* synthetic */ ListIterator listIterator() {
        return super.e();
    }

    @Override
    public /* synthetic */ Object remove(int n2) {
        return super.j(n2);
    }

    @Override
    public /* synthetic */ void add(int n2, Object object) {
        super.a(n2, (Long)object);
    }

    @Override
    public /* synthetic */ Object set(int n2, Object object) {
        return super.b(n2, (Long)object);
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return super.i(n2);
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
        return super.k(n2);
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
        super.b((Long)object);
    }
}

