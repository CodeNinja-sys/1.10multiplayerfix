/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cs;
import a.a.a.a.a.dh;
import a.a.a.a.a.dt;
import a.a.a.a.a.du;
import a.a.a.a.a.eo;
import a.a.a.a.a.n;
import a.a.a.a.a.r;
import a.a.a.a.a.s;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public abstract class q
extends n
implements dt,
eo {
    protected q() {
    }

    protected void b(int n2) {
        if (n2 < 0) {
            throw new IndexOutOfBoundsException("Index (" + n2 + ") is negative");
        }
        if (n2 > this.size()) {
            throw new IndexOutOfBoundsException("Index (" + n2 + ") is greater than list size (" + this.size() + ")");
        }
    }

    protected void c(int n2) {
        if (n2 < 0) {
            throw new IndexOutOfBoundsException("Index (" + n2 + ") is negative");
        }
        if (n2 >= this.size()) {
            throw new IndexOutOfBoundsException("Index (" + n2 + ") is greater than or equal to list size (" + this.size() + ")");
        }
    }

    @Override
    public void a(int n2, int n3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean e(int n2) {
        this.a(this.size(), n2);
        return true;
    }

    @Override
    public int d(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int b(int n2, int n3) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(int n2, Collection collection) {
        this.b(n2);
        int n3 = collection.size();
        if (n3 == 0) {
            return false;
        }
        Iterator iterator = collection.iterator();
        while (n3-- != 0) {
            this.a(n2++, (Integer)iterator.next());
        }
        return true;
    }

    @Override
    public boolean addAll(Collection collection) {
        return this.addAll(this.size(), collection);
    }

    @Override
    public du c() {
        return this.e();
    }

    @Override
    public du g(int n2) {
        return this.h(n2);
    }

    @Override
    public du d() {
        return this.e();
    }

    @Override
    public du e() {
        return this.h(0);
    }

    @Override
    public du h(int n2) {
        this.b(n2);
        return new r(this, n2);
    }

    @Override
    public boolean a(int n2) {
        return this.i(n2) >= 0;
    }

    @Override
    public int i(int n2) {
        du du2 = this.e();
        while (du2.hasNext()) {
            int n3 = du2.a();
            if (n2 != n3) continue;
            return du2.previousIndex();
        }
        return -1;
    }

    @Override
    public int j(int n2) {
        du du2 = this.h(this.size());
        while (du2.hasPrevious()) {
            int n3 = du2.b();
            if (n2 != n3) continue;
            return du2.nextIndex();
        }
        return -1;
    }

    @Override
    public void k(int n2) {
        int n3 = this.size();
        if (n2 > n3) {
            while (n3++ < n2) {
                this.e(0);
            }
        } else {
            while (n3-- != n2) {
                this.o(n3);
            }
        }
    }

    @Override
    public dt c(int n2, int n3) {
        this.b(n2);
        this.b(n3);
        if (n2 > n3) {
            throw new IndexOutOfBoundsException("Start index (" + n2 + ") is greater than end index (" + n3 + ")");
        }
        return new s(this, n2, n3);
    }

    @Override
    public dt d(int n2, int n3) {
        return this.c(n2, n3);
    }

    @Override
    public void e(int n2, int n3) {
        this.b(n3);
        du du2 = this.h(n2);
        int n4 = n3 - n2;
        if (n4 < 0) {
            throw new IllegalArgumentException("Start index (" + n2 + ") is greater than end index (" + n3 + ")");
        }
        while (n4-- != 0) {
            du2.a();
            du2.remove();
        }
    }

    @Override
    public void a(int n2, int[] arrn, int n3, int n4) {
        this.b(n2);
        if (n3 < 0) {
            throw new ArrayIndexOutOfBoundsException("Offset (" + n3 + ") is negative");
        }
        if (n3 + n4 > arrn.length) {
            throw new ArrayIndexOutOfBoundsException("End index (" + (n3 + n4) + ") is greater than array length (" + arrn.length + ")");
        }
        while (n4-- != 0) {
            this.a(n2++, arrn[n3++]);
        }
    }

    @Override
    public void a(int n2, int[] arrn) {
        this.a(n2, arrn, 0, arrn.length);
    }

    @Override
    public void b(int n2, int[] arrn, int n3, int n4) {
        du du2 = this.h(n2);
        if (n3 < 0) {
            throw new ArrayIndexOutOfBoundsException("Offset (" + n3 + ") is negative");
        }
        if (n3 + n4 > arrn.length) {
            throw new ArrayIndexOutOfBoundsException("End index (" + (n3 + n4) + ") is greater than array length (" + arrn.length + ")");
        }
        if (n2 + n4 > this.size()) {
            throw new IndexOutOfBoundsException("End index (" + (n2 + n4) + ") is greater than list size (" + this.size() + ")");
        }
        while (n4-- != 0) {
            arrn[n3++] = du2.a();
        }
    }

    private boolean a(Object object, Object object2) {
        return object == null ? object2 == null : object.equals(object2);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof List)) {
            return false;
        }
        List list = (List)object;
        int n2 = this.size();
        if (n2 != list.size()) {
            return false;
        }
        if (list instanceof dt) {
            du du2 = this.e();
            du du3 = ((dt)list).e();
            while (n2-- != 0) {
                if (du2.a() == du3.a()) continue;
                return false;
            }
            return true;
        }
        du du4 = this.e();
        ListIterator listIterator = list.listIterator();
        while (n2-- != 0) {
            if (this.a(du4.next(), listIterator.next())) continue;
            return false;
        }
        return true;
    }

    public int a(List list) {
        if (list == this) {
            return 0;
        }
        if (list instanceof dt) {
            du du2 = this.e();
            du du3 = ((dt)list).e();
            while (du2.hasNext() && du3.hasNext()) {
                int n2;
                int n3 = du2.a();
                int n4 = Integer.compare(n3, n2 = du3.a());
                if (n4 == 0) continue;
                return n4;
            }
            return du3.hasNext() ? -1 : (du2.hasNext() ? 1 : 0);
        }
        du du4 = this.e();
        ListIterator listIterator = list.listIterator();
        while (du4.hasNext() && listIterator.hasNext()) {
            int n5 = ((Comparable)du4.next()).compareTo(listIterator.next());
            if (n5 == 0) continue;
            return n5;
        }
        return listIterator.hasNext() ? -1 : (du4.hasNext() ? 1 : 0);
    }

    @Override
    public int hashCode() {
        du du2 = this.d();
        int n2 = 1;
        int n3 = this.size();
        while (n3-- != 0) {
            int n4 = du2.a();
            n2 = 31 * n2 + n4;
        }
        return n2;
    }

    @Override
    public void l(int n2) {
        this.e(n2);
    }

    @Override
    public int h() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d(this.size() - 1);
    }

    @Override
    public int i() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.q(this.size() - 1);
    }

    @Override
    public int m(int n2) {
        return this.q(this.size() - 1 - n2);
    }

    @Override
    public boolean f(int n2) {
        int n3 = this.i(n2);
        if (n3 == -1) {
            return false;
        }
        this.d(n3);
        return true;
    }

    @Override
    public boolean remove(Object object) {
        return this.f((Integer)object);
    }

    @Override
    public boolean a(int n2, cs cs2) {
        return this.addAll(n2, (Collection)cs2);
    }

    @Override
    public boolean a(int n2, dt dt2) {
        return this.a(n2, (cs)dt2);
    }

    @Override
    public boolean a(cs cs2) {
        return this.a(this.size(), cs2);
    }

    @Override
    public boolean a(dt dt2) {
        return this.a(this.size(), dt2);
    }

    public void a(int n2, Integer n3) {
        this.a(n2, (int)n3);
    }

    public Integer b(int n2, Integer n3) {
        return this.b(n2, (int)n3);
    }

    public Integer n(int n2) {
        return this.q(n2);
    }

    @Override
    public int indexOf(Object object) {
        return this.i((Integer)object);
    }

    @Override
    public int lastIndexOf(Object object) {
        return this.j((Integer)object);
    }

    public Integer o(int n2) {
        return this.d(n2);
    }

    public void b(Integer n2) {
        this.l(n2);
    }

    public Integer j() {
        return this.h();
    }

    public Integer k() {
        return this.i();
    }

    public Integer p(int n2) {
        return this.m(n2);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        du du2 = this.d();
        int n2 = this.size();
        boolean bl2 = true;
        stringBuilder.append("[");
        while (n2-- != 0) {
            if (bl2) {
                bl2 = false;
            } else {
                stringBuilder.append(", ");
            }
            int n3 = du2.a();
            stringBuilder.append(String.valueOf(n3));
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
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
        return this.c(n2, n3);
    }

    public /* synthetic */ ListIterator listIterator(int n2) {
        return this.h(n2);
    }

    public /* synthetic */ ListIterator listIterator() {
        return this.e();
    }

    public /* synthetic */ Object remove(int n2) {
        return this.o(n2);
    }

    public /* synthetic */ void add(int n2, Object object) {
        this.a(n2, (Integer)object);
    }

    public /* synthetic */ Object set(int n2, Object object) {
        return this.b(n2, (Integer)object);
    }

    public /* synthetic */ Object get(int n2) {
        return this.n(n2);
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((List)object);
    }

    @Override
    public /* synthetic */ Object g_(int n2) {
        return this.p(n2);
    }

    @Override
    public /* synthetic */ Object b() {
        return this.k();
    }

    @Override
    public /* synthetic */ Object bE_() {
        return this.j();
    }

    @Override
    public /* synthetic */ void a(Object object) {
        this.b((Integer)object);
    }
}

