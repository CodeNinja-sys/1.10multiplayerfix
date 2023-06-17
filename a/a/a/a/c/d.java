/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.ad;
import a.a.a.a.c.ao;
import a.a.a.a.c.ap;
import a.a.a.a.c.b;
import a.a.a.a.c.e;
import a.a.a.a.c.f;
import a.a.a.a.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public abstract class d
extends b
implements ao,
h {
    protected d() {
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

    public void add(int n2, Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(Object object) {
        this.add(this.size(), object);
        return true;
    }

    public Object remove(int n2) {
        throw new UnsupportedOperationException();
    }

    public Object set(int n2, Object object) {
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
            this.add(n2++, iterator.next());
        }
        return true;
    }

    @Override
    public boolean addAll(Collection collection) {
        return this.addAll(this.size(), collection);
    }

    @Override
    public ap c() {
        return this.e();
    }

    @Override
    public ap d(int n2) {
        return this.e(n2);
    }

    @Override
    public ap d() {
        return this.e();
    }

    @Override
    public ap e() {
        return this.e(0);
    }

    @Override
    public ap e(int n2) {
        this.b(n2);
        return new e(this, n2);
    }

    @Override
    public boolean contains(Object object) {
        return this.indexOf(object) >= 0;
    }

    @Override
    public int indexOf(Object object) {
        ap ap2 = this.e();
        while (ap2.hasNext()) {
            Object e2 = ap2.next();
            if (!(object == null ? e2 == null : object.equals(e2))) continue;
            return ap2.previousIndex();
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        ap ap2 = this.e(this.size());
        while (ap2.hasPrevious()) {
            Object object2 = ap2.previous();
            if (!(object == null ? object2 == null : object.equals(object2))) continue;
            return ap2.nextIndex();
        }
        return -1;
    }

    @Override
    public void f(int n2) {
        int n3 = this.size();
        if (n2 > n3) {
            while (n3++ < n2) {
                this.add((Object)null);
            }
        } else {
            while (n3-- != n2) {
                this.remove(n3);
            }
        }
    }

    @Override
    public ao a(int n2, int n3) {
        this.b(n2);
        this.b(n3);
        if (n2 > n3) {
            throw new IndexOutOfBoundsException("Start index (" + n2 + ") is greater than end index (" + n3 + ")");
        }
        return new f(this, n2, n3);
    }

    @Override
    public ao b(int n2, int n3) {
        return this.a(n2, n3);
    }

    @Override
    public void c(int n2, int n3) {
        this.b(n3);
        ap ap2 = this.e(n2);
        int n4 = n3 - n2;
        if (n4 < 0) {
            throw new IllegalArgumentException("Start index (" + n2 + ") is greater than end index (" + n3 + ")");
        }
        while (n4-- != 0) {
            ap2.next();
            ap2.remove();
        }
    }

    @Override
    public void a(int n2, Object[] arrobject, int n3, int n4) {
        this.b(n2);
        if (n3 < 0) {
            throw new ArrayIndexOutOfBoundsException("Offset (" + n3 + ") is negative");
        }
        if (n3 + n4 > arrobject.length) {
            throw new ArrayIndexOutOfBoundsException("End index (" + (n3 + n4) + ") is greater than array length (" + arrobject.length + ")");
        }
        while (n4-- != 0) {
            this.add(n2++, arrobject[n3++]);
        }
    }

    @Override
    public void a(int n2, Object[] arrobject) {
        this.a(n2, arrobject, 0, arrobject.length);
    }

    @Override
    public void b(int n2, Object[] arrobject, int n3, int n4) {
        ap ap2 = this.e(n2);
        if (n3 < 0) {
            throw new ArrayIndexOutOfBoundsException("Offset (" + n3 + ") is negative");
        }
        if (n3 + n4 > arrobject.length) {
            throw new ArrayIndexOutOfBoundsException("End index (" + (n3 + n4) + ") is greater than array length (" + arrobject.length + ")");
        }
        if (n2 + n4 > this.size()) {
            throw new IndexOutOfBoundsException("End index (" + (n2 + n4) + ") is greater than list size (" + this.size() + ")");
        }
        while (n4-- != 0) {
            arrobject[n3++] = ap2.next();
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
        ap ap2 = this.e();
        ListIterator listIterator = list.listIterator();
        while (n2-- != 0) {
            if (this.a(ap2.next(), listIterator.next())) continue;
            return false;
        }
        return true;
    }

    public int a(List list) {
        if (list == this) {
            return 0;
        }
        if (list instanceof ao) {
            ap ap2 = this.e();
            ap ap3 = ((ao)list).e();
            while (ap2.hasNext() && ap3.hasNext()) {
                Object e2;
                Object e3 = ap2.next();
                int n2 = ((Comparable)e3).compareTo(e2 = ap3.next());
                if (n2 == 0) continue;
                return n2;
            }
            return ap3.hasNext() ? -1 : (ap2.hasNext() ? 1 : 0);
        }
        ap ap4 = this.e();
        ListIterator listIterator = list.listIterator();
        while (ap4.hasNext() && listIterator.hasNext()) {
            int n3 = ((Comparable)ap4.next()).compareTo(listIterator.next());
            if (n3 == 0) continue;
            return n3;
        }
        return listIterator.hasNext() ? -1 : (ap4.hasNext() ? 1 : 0);
    }

    @Override
    public int hashCode() {
        ap ap2 = this.d();
        int n2 = 1;
        int n3 = this.size();
        while (n3-- != 0) {
            Object e2 = ap2.next();
            n2 = 31 * n2 + (e2 == null ? 0 : e2.hashCode());
        }
        return n2;
    }

    @Override
    public void a(Object object) {
        this.add(object);
    }

    @Override
    public Object bE_() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.remove(this.size() - 1);
    }

    @Override
    public Object b() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.get(this.size() - 1);
    }

    @Override
    public Object g_(int n2) {
        return this.get(this.size() - 1 - n2);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        ap ap2 = this.d();
        int n2 = this.size();
        boolean bl2 = true;
        stringBuilder.append("[");
        while (n2-- != 0) {
            if (bl2) {
                bl2 = false;
            } else {
                stringBuilder.append(", ");
            }
            Object e2 = ap2.next();
            if (this == e2) {
                stringBuilder.append("(this list)");
                continue;
            }
            stringBuilder.append(String.valueOf(e2));
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public /* synthetic */ ad a() {
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
        return this.e(n2);
    }

    public /* synthetic */ ListIterator listIterator() {
        return this.e();
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((List)object);
    }
}

