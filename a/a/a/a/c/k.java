/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.a;
import a.a.a.a.c.ad;
import a.a.a.a.c.ae;
import a.a.a.a.c.ao;
import a.a.a.a.c.ap;
import a.a.a.a.c.d;
import a.a.a.a.c.l;
import a.a.a.a.c.o;
import a.a.a.a.c.w;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.RandomAccess;

public class k
extends d
implements Serializable,
Cloneable,
RandomAccess {
    private static final long e = -7046029254386353131L;
    public static final int a = 16;
    protected final boolean b;
    protected transient Object[] c;
    protected int d;
    private static final boolean f = false;

    protected k(Object[] arrobject, boolean bl2) {
        this.c = arrobject;
        this.b = true;
    }

    public k(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Initial capacity (" + n2 + ") is negative");
        }
        this.c = new Object[n2];
        this.b = false;
    }

    public k() {
        this(16);
    }

    public k(Collection collection) {
        this(collection.size());
        this.d = ae.a(collection.iterator(), this.c);
    }

    public k(w w2) {
        this(w2.size());
        this.d = ae.a((Iterator)w2.a(), this.c);
    }

    public k(ao ao2) {
        this(ao2.size());
        this.d = ao2.size();
        ao2.b(0, this.c, 0, this.d);
    }

    public k(Object[] arrobject) {
        this(arrobject, 0, arrobject.length);
    }

    public k(Object[] arrobject, int n2, int n3) {
        this(n3);
        System.arraycopy(arrobject, n2, this.c, 0, n3);
        this.d = n3;
    }

    public k(Iterator iterator) {
        this();
        while (iterator.hasNext()) {
            this.add(iterator.next());
        }
    }

    public k(ad ad2) {
        this();
        while (ad2.hasNext()) {
            this.add(ad2.next());
        }
    }

    public Object[] f() {
        return this.c;
    }

    public static k a(Object[] arrobject, int n2) {
        if (n2 > arrobject.length) {
            throw new IllegalArgumentException("The specified length (" + n2 + ") is greater than the array size (" + arrobject.length + ")");
        }
        k k2 = new k(arrobject, false);
        k2.d = n2;
        return k2;
    }

    public static k a(Object[] arrobject) {
        return k.a(arrobject, arrobject.length);
    }

    public void g(int n2) {
        if (this.b) {
            this.c = o.a(this.c, n2, this.d);
        } else if (n2 > this.c.length) {
            Object[] arrobject = new Object[n2];
            System.arraycopy(this.c, 0, arrobject, 0, this.d);
            this.c = arrobject;
        }
    }

    private void i(int n2) {
        if (this.b) {
            this.c = o.b(this.c, n2, this.d);
        } else if (n2 > this.c.length) {
            int n3 = (int)Math.max(Math.min(2L * (long)this.c.length, 0x7FFFFFF7L), (long)n2);
            Object[] arrobject = new Object[n3];
            System.arraycopy(this.c, 0, arrobject, 0, this.d);
            this.c = arrobject;
        }
    }

    @Override
    public void add(int n2, Object object) {
        this.b(n2);
        this.i(this.d + 1);
        if (n2 != this.d) {
            System.arraycopy(this.c, n2, this.c, n2 + 1, this.d - n2);
        }
        this.c[n2] = object;
        ++this.d;
    }

    @Override
    public boolean add(Object object) {
        this.i(this.d + 1);
        this.c[this.d++] = object;
        return true;
    }

    public Object get(int n2) {
        if (n2 >= this.d) {
            throw new IndexOutOfBoundsException("Index (" + n2 + ") is greater than or equal to list size (" + this.d + ")");
        }
        return this.c[n2];
    }

    @Override
    public int indexOf(Object object) {
        for (int i2 = 0; i2 < this.d; ++i2) {
            if (!(object == null ? this.c[i2] == null : object.equals(this.c[i2]))) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        int n2 = this.d;
        while (n2-- != 0) {
            if (!(object == null ? this.c[n2] == null : object.equals(this.c[n2]))) continue;
            return n2;
        }
        return -1;
    }

    @Override
    public Object remove(int n2) {
        if (n2 >= this.d) {
            throw new IndexOutOfBoundsException("Index (" + n2 + ") is greater than or equal to list size (" + this.d + ")");
        }
        Object object = this.c[n2];
        --this.d;
        if (n2 != this.d) {
            System.arraycopy(this.c, n2 + 1, this.c, n2, this.d - n2);
        }
        this.c[this.d] = null;
        return object;
    }

    public boolean b(Object object) {
        int n2 = this.indexOf(object);
        if (n2 == -1) {
            return false;
        }
        this.remove(n2);
        return true;
    }

    @Override
    public boolean remove(Object object) {
        return this.b(object);
    }

    @Override
    public Object set(int n2, Object object) {
        if (n2 >= this.d) {
            throw new IndexOutOfBoundsException("Index (" + n2 + ") is greater than or equal to list size (" + this.d + ")");
        }
        Object object2 = this.c[n2];
        this.c[n2] = object;
        return object2;
    }

    @Override
    public void clear() {
        Arrays.fill(this.c, 0, this.d, null);
        this.d = 0;
    }

    @Override
    public int size() {
        return this.d;
    }

    @Override
    public void f(int n2) {
        if (n2 > this.c.length) {
            this.g(n2);
        }
        if (n2 > this.d) {
            Arrays.fill(this.c, this.d, n2, null);
        } else {
            Arrays.fill(this.c, n2, this.d, null);
        }
        this.d = n2;
    }

    @Override
    public boolean isEmpty() {
        return this.d == 0;
    }

    public void h() {
        this.h(0);
    }

    public void h(int n2) {
        if (n2 >= this.c.length || this.d == this.c.length) {
            return;
        }
        Object[] arrobject = new Object[Math.max(n2, this.d)];
        System.arraycopy(this.c, 0, arrobject, 0, this.d);
        this.c = arrobject;
    }

    @Override
    public void b(int n2, Object[] arrobject, int n3, int n4) {
        o.e(arrobject, n3, n4);
        System.arraycopy(this.c, n2, arrobject, n3, n4);
    }

    @Override
    public void c(int n2, int n3) {
        a.a.a.a.a.a(this.d, n2, n3);
        System.arraycopy(this.c, n3, this.c, n2, this.d - n3);
        this.d -= n3 - n2;
        int n4 = n3 - n2;
        while (n4-- != 0) {
            this.c[this.d + n4] = null;
        }
    }

    @Override
    public void a(int n2, Object[] arrobject, int n3, int n4) {
        this.b(n2);
        o.e(arrobject, n3, n4);
        this.i(this.d + n4);
        System.arraycopy(this.c, n2, this.c, n2 + n4, this.d - n2);
        System.arraycopy(arrobject, n3, this.c, n2, n4);
        this.d += n4;
    }

    @Override
    public boolean removeAll(Collection collection) {
        int n2;
        Object[] arrobject = this.c;
        int n3 = 0;
        for (n2 = 0; n2 < this.d; n2 += 1) {
            if (collection.contains(arrobject[n2])) continue;
            arrobject[n3++] = arrobject[n2];
        }
        Arrays.fill(arrobject, n3, this.d, null);
        n2 = this.d != n3 ? 1 : 0;
        this.d = n3;
        return n2 != 0;
    }

    @Override
    public ap e(int n2) {
        this.b(n2);
        return new l(this, n2);
    }

    public k i() {
        k k2 = new k(this.d);
        System.arraycopy(this.c, 0, k2.c, 0, this.d);
        k2.d = this.d;
        return k2;
    }

    private boolean a(Object object, Object object2) {
        return object == null ? object2 == null : object.equals(object2);
    }

    public boolean a(k k2) {
        if (k2 == this) {
            return true;
        }
        int n2 = this.size();
        if (n2 != k2.size()) {
            return false;
        }
        Object[] arrobject = this.c;
        Object[] arrobject2 = k2.c;
        while (n2-- != 0) {
            if (this.a(arrobject[n2], arrobject2[n2])) continue;
            return false;
        }
        return true;
    }

    public int b(k k2) {
        int n2;
        int n3 = this.size();
        int n4 = k2.size();
        Object[] arrobject = this.c;
        Object[] arrobject2 = k2.c;
        for (n2 = 0; n2 < n3 && n2 < n4; ++n2) {
            Object object = arrobject[n2];
            Object object2 = arrobject2[n2];
            int n5 = ((Comparable)object).compareTo(object2);
            if (n5 == 0) continue;
            return n5;
        }
        return n2 < n4 ? -1 : (n2 < n3 ? 1 : 0);
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        for (int i2 = 0; i2 < this.d; ++i2) {
            objectOutputStream.writeObject(this.c[i2]);
        }
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = new Object[this.d];
        for (int i2 = 0; i2 < this.d; ++i2) {
            this.c[i2] = objectInputStream.readObject();
        }
    }

    @Override
    public /* synthetic */ ListIterator listIterator(int n2) {
        return this.e(n2);
    }

    public /* synthetic */ Object clone() {
        return this.i();
    }
}

