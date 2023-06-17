/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.cs;
import a.a.a.a.b.dh;
import a.a.a.a.b.du;
import a.a.a.a.b.dv;
import a.a.a.a.b.ep;
import a.a.a.a.b.n;
import a.a.a.a.b.r;
import a.a.a.a.b.s;
import a.a.a.a.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public abstract class q
extends n
implements du,
ep {
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
    public void a(int n2, long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean e(long l2) {
        this.a(this.size(), l2);
        return true;
    }

    @Override
    public long d(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long b(int n2, long l2) {
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
            this.a(n2++, (Long)iterator.next());
        }
        return true;
    }

    @Override
    public boolean addAll(Collection collection) {
        return this.addAll(this.size(), collection);
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
    public dv d() {
        return this.e();
    }

    @Override
    public dv e() {
        return this.f(0);
    }

    @Override
    public dv f(int n2) {
        this.b(n2);
        return new r(this, n2);
    }

    @Override
    public boolean a(long l2) {
        return this.b(l2) >= 0;
    }

    @Override
    public int b(long l2) {
        dv dv2 = this.e();
        while (dv2.hasNext()) {
            long l3 = dv2.a();
            if (l2 != l3) continue;
            return dv2.previousIndex();
        }
        return -1;
    }

    @Override
    public int c(long l2) {
        dv dv2 = this.f(this.size());
        while (dv2.hasPrevious()) {
            long l3 = dv2.b();
            if (l2 != l3) continue;
            return dv2.nextIndex();
        }
        return -1;
    }

    @Override
    public void g(int n2) {
        int n3 = this.size();
        if (n2 > n3) {
            while (n3++ < n2) {
                this.e(0L);
            }
        } else {
            while (n3-- != n2) {
                this.j(n3);
            }
        }
    }

    @Override
    public du a(int n2, int n3) {
        this.b(n2);
        this.b(n3);
        if (n2 > n3) {
            throw new IndexOutOfBoundsException("Start index (" + n2 + ") is greater than end index (" + n3 + ")");
        }
        return new s(this, n2, n3);
    }

    @Override
    public du b(int n2, int n3) {
        return this.a(n2, n3);
    }

    @Override
    public void c(int n2, int n3) {
        this.b(n3);
        dv dv2 = this.f(n2);
        int n4 = n3 - n2;
        if (n4 < 0) {
            throw new IllegalArgumentException("Start index (" + n2 + ") is greater than end index (" + n3 + ")");
        }
        while (n4-- != 0) {
            dv2.a();
            dv2.remove();
        }
    }

    @Override
    public void a(int n2, long[] arrl, int n3, int n4) {
        this.b(n2);
        if (n3 < 0) {
            throw new ArrayIndexOutOfBoundsException("Offset (" + n3 + ") is negative");
        }
        if (n3 + n4 > arrl.length) {
            throw new ArrayIndexOutOfBoundsException("End index (" + (n3 + n4) + ") is greater than array length (" + arrl.length + ")");
        }
        while (n4-- != 0) {
            this.a(n2++, arrl[n3++]);
        }
    }

    @Override
    public void a(int n2, long[] arrl) {
        this.a(n2, arrl, 0, arrl.length);
    }

    @Override
    public void b(int n2, long[] arrl, int n3, int n4) {
        dv dv2 = this.f(n2);
        if (n3 < 0) {
            throw new ArrayIndexOutOfBoundsException("Offset (" + n3 + ") is negative");
        }
        if (n3 + n4 > arrl.length) {
            throw new ArrayIndexOutOfBoundsException("End index (" + (n3 + n4) + ") is greater than array length (" + arrl.length + ")");
        }
        if (n2 + n4 > this.size()) {
            throw new IndexOutOfBoundsException("End index (" + (n2 + n4) + ") is greater than list size (" + this.size() + ")");
        }
        while (n4-- != 0) {
            arrl[n3++] = dv2.a();
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
        if (list instanceof du) {
            dv dv2 = this.e();
            dv dv3 = ((du)list).e();
            while (n2-- != 0) {
                if (dv2.a() == dv3.a()) continue;
                return false;
            }
            return true;
        }
        dv dv4 = this.e();
        ListIterator listIterator = list.listIterator();
        while (n2-- != 0) {
            if (this.a(dv4.next(), listIterator.next())) continue;
            return false;
        }
        return true;
    }

    public int a(List list) {
        if (list == this) {
            return 0;
        }
        if (list instanceof du) {
            dv dv2 = this.e();
            dv dv3 = ((du)list).e();
            while (dv2.hasNext() && dv3.hasNext()) {
                long l2;
                long l3 = dv2.a();
                int n2 = Long.compare(l3, l2 = dv3.a());
                if (n2 == 0) continue;
                return n2;
            }
            return dv3.hasNext() ? -1 : (dv2.hasNext() ? 1 : 0);
        }
        dv dv4 = this.e();
        ListIterator listIterator = list.listIterator();
        while (dv4.hasNext() && listIterator.hasNext()) {
            int n3 = ((Comparable)dv4.next()).compareTo(listIterator.next());
            if (n3 == 0) continue;
            return n3;
        }
        return listIterator.hasNext() ? -1 : (dv4.hasNext() ? 1 : 0);
    }

    @Override
    public int hashCode() {
        dv dv2 = this.d();
        int n2 = 1;
        int n3 = this.size();
        while (n3-- != 0) {
            long l2 = dv2.a();
            n2 = 31 * n2 + g.d(l2);
        }
        return n2;
    }

    @Override
    public void d(long l2) {
        this.e(l2);
    }

    @Override
    public long h() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d(this.size() - 1);
    }

    @Override
    public long i() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.l(this.size() - 1);
    }

    @Override
    public long h(int n2) {
        return this.l(this.size() - 1 - n2);
    }

    @Override
    public boolean f(long l2) {
        int n2 = this.b(l2);
        if (n2 == -1) {
            return false;
        }
        this.d(n2);
        return true;
    }

    @Override
    public boolean remove(Object object) {
        return this.f((Long)object);
    }

    @Override
    public boolean a(int n2, cs cs2) {
        return this.addAll(n2, (Collection)cs2);
    }

    @Override
    public boolean a(int n2, du du2) {
        return this.a(n2, (cs)du2);
    }

    @Override
    public boolean a(cs cs2) {
        return this.a(this.size(), cs2);
    }

    @Override
    public boolean a(du du2) {
        return this.a(this.size(), du2);
    }

    public void a(int n2, Long l2) {
        this.a(n2, (long)l2);
    }

    public Long b(int n2, Long l2) {
        return this.b(n2, (long)l2);
    }

    public Long i(int n2) {
        return this.l(n2);
    }

    @Override
    public int indexOf(Object object) {
        return this.b((long)((Long)object));
    }

    @Override
    public int lastIndexOf(Object object) {
        return this.c((Long)object);
    }

    public Long j(int n2) {
        return this.d(n2);
    }

    public void b(Long l2) {
        this.d(l2);
    }

    public Long j() {
        return this.h();
    }

    public Long k() {
        return this.i();
    }

    public Long k(int n2) {
        return this.h(n2);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        dv dv2 = this.d();
        int n2 = this.size();
        boolean bl2 = true;
        stringBuilder.append("[");
        while (n2-- != 0) {
            if (bl2) {
                bl2 = false;
            } else {
                stringBuilder.append(", ");
            }
            long l2 = dv2.a();
            stringBuilder.append(String.valueOf(l2));
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
        return this.a(n2, n3);
    }

    public /* synthetic */ ListIterator listIterator(int n2) {
        return this.f(n2);
    }

    public /* synthetic */ ListIterator listIterator() {
        return this.e();
    }

    public /* synthetic */ Object remove(int n2) {
        return this.j(n2);
    }

    public /* synthetic */ void add(int n2, Object object) {
        this.a(n2, (Long)object);
    }

    public /* synthetic */ Object set(int n2, Object object) {
        return this.b(n2, (Long)object);
    }

    public /* synthetic */ Object get(int n2) {
        return this.i(n2);
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((List)object);
    }

    @Override
    public /* synthetic */ Object g_(int n2) {
        return this.k(n2);
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
        this.b((Long)object);
    }
}

