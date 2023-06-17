/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import io.netty.util.c.i;
import io.netty.util.c.j;
import io.netty.util.c.l;
import io.netty.util.c.o;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

final class h
extends o
implements Queue {
    private static final long W = -1878402552271506449L;
    long a;
    long b;
    long c;
    long d;
    long e;
    long f;
    long g;
    long h;
    long i;
    long j;
    long k;
    long l;
    long m;
    long n;
    long o;
    long p;

    h() {
        j j2 = new j(null);
        this.a(j2);
        this.c(j2);
    }

    private l c() {
        l l2;
        do {
            l l3;
            if ((l3 = (l2 = this.a()).j()) == null) continue;
            return l3;
        } while (l2 != this.b());
        return null;
    }

    public boolean offer(Object object) {
        l l2;
        if (object == null) {
            throw new NullPointerException("value");
        }
        if (object instanceof l) {
            l2 = (l)object;
            l2.a(null);
        } else {
            l2 = new j(object);
        }
        l l3 = this.d(l2);
        l3.a(l2);
        return true;
    }

    public Object poll() {
        l l2 = this.c();
        if (l2 == null) {
            return null;
        }
        l l3 = this.a();
        this.b(l2);
        l3.k();
        return l2.bk_();
    }

    public Object peek() {
        l l2 = this.c();
        if (l2 == null) {
            return null;
        }
        return l2.b();
    }

    @Override
    public int size() {
        int n2 = 0;
        for (l l2 = this.c(); l2 != null; l2 = l2.j()) {
            ++n2;
        }
        return n2;
    }

    @Override
    public boolean isEmpty() {
        return this.c() == null;
    }

    @Override
    public boolean contains(Object object) {
        for (l l2 = this.c(); l2 != null; l2 = l2.j()) {
            if (l2.b() != object) continue;
            return true;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new i(this);
    }

    @Override
    public boolean add(Object object) {
        if (this.offer(object)) {
            return true;
        }
        throw new IllegalStateException("queue full");
    }

    public Object remove() {
        Object object = this.poll();
        if (object != null) {
            return object;
        }
        throw new NoSuchElementException();
    }

    public Object element() {
        Object object = this.peek();
        if (object != null) {
            return object;
        }
        throw new NoSuchElementException();
    }

    @Override
    public Object[] toArray() {
        Object[] arrobject = new Object[this.size()];
        Iterator iterator = this.iterator();
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            if (!iterator.hasNext()) {
                return Arrays.copyOf(arrobject, i2);
            }
            arrobject[i2] = iterator.next();
        }
        return arrobject;
    }

    @Override
    public Object[] toArray(Object[] arrobject) {
        int n2 = this.size();
        Object[] arrobject2 = arrobject.length >= n2 ? arrobject : (Object[])Array.newInstance(arrobject.getClass().getComponentType(), n2);
        Iterator iterator = this.iterator();
        for (int i2 = 0; i2 < arrobject2.length; ++i2) {
            if (!iterator.hasNext()) {
                if (arrobject == arrobject2) {
                    arrobject2[i2] = null;
                    return arrobject2;
                }
                if (arrobject.length < i2) {
                    return Arrays.copyOf(arrobject2, i2);
                }
                System.arraycopy(arrobject2, 0, arrobject, 0, i2);
                if (arrobject.length > i2) {
                    arrobject[i2] = null;
                }
                return arrobject;
            }
            arrobject2[i2] = iterator.next();
        }
        return arrobject2;
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection collection) {
        for (Object e2 : collection) {
            if (this.contains(e2)) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection collection) {
        if (collection == null) {
            throw new NullPointerException("c");
        }
        if (collection == this) {
            throw new IllegalArgumentException("c == this");
        }
        boolean bl2 = false;
        for (Object e2 : collection) {
            this.add(e2);
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        while (this.poll() != null) {
        }
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        for (Object e2 : this) {
            objectOutputStream.writeObject(e2);
        }
        objectOutputStream.writeObject(null);
    }

    private void a(ObjectInputStream objectInputStream) {
        Object object;
        objectInputStream.defaultReadObject();
        j j2 = new j(null);
        this.a(j2);
        this.c(j2);
        while ((object = objectInputStream.readObject()) != null) {
            this.add(object);
        }
    }

    static /* synthetic */ l a(h h2) {
        return h2.c();
    }
}

