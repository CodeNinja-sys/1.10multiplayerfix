/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.ad;
import a.a.a.a.c.i;
import a.a.a.a.c.n;
import a.a.a.a.c.o;
import a.a.a.a.c.w;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

public class m
extends i
implements Serializable,
Cloneable {
    private static final long a = 1L;
    private transient Object[] b;
    private int c;

    public m(Object[] arrobject) {
        this.b = arrobject;
        this.c = arrobject.length;
    }

    public m() {
        this.b = o.a;
    }

    public m(int n2) {
        this.b = new Object[n2];
    }

    public m(w w2) {
        this(w2.size());
        this.addAll((Collection)w2);
    }

    public m(Collection collection) {
        this(collection.size());
        this.addAll(collection);
    }

    public m(Object[] arrobject, int n2) {
        this.b = arrobject;
        this.c = n2;
        if (n2 > arrobject.length) {
            throw new IllegalArgumentException("The provided size (" + n2 + ") is larger than or equal to the array size (" + arrobject.length + ")");
        }
    }

    private int a(Object object) {
        int n2 = this.c;
        while (n2-- != 0) {
            if (!(this.b[n2] == null ? object == null : this.b[n2].equals(object))) continue;
            return n2;
        }
        return -1;
    }

    @Override
    public ad a() {
        return new n(this);
    }

    @Override
    public boolean contains(Object object) {
        return this.a(object) != -1;
    }

    @Override
    public int size() {
        return this.c;
    }

    @Override
    public boolean remove(Object object) {
        int n2 = this.a(object);
        if (n2 == -1) {
            return false;
        }
        int n3 = this.c - n2 - 1;
        for (int i2 = 0; i2 < n3; ++i2) {
            this.b[n2 + i2] = this.b[n2 + i2 + 1];
        }
        --this.c;
        this.b[this.c] = null;
        return true;
    }

    @Override
    public boolean add(Object object) {
        int n2 = this.a(object);
        if (n2 != -1) {
            return false;
        }
        if (this.c == this.b.length) {
            Object[] arrobject = new Object[this.c == 0 ? 2 : this.c * 2];
            int n3 = this.c;
            while (n3-- != 0) {
                arrobject[n3] = this.b[n3];
            }
            this.b = arrobject;
        }
        this.b[this.c++] = object;
        return true;
    }

    @Override
    public void clear() {
        int n2 = this.c;
        while (n2-- != 0) {
            this.b[n2] = null;
        }
        this.c = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.c == 0;
    }

    public m b() {
        m m2;
        try {
            m2 = (m)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
        m2.b = (Object[])this.b.clone();
        return m2;
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        for (int i2 = 0; i2 < this.c; ++i2) {
            objectOutputStream.writeObject(this.b[i2]);
        }
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.b = new Object[this.c];
        for (int i2 = 0; i2 < this.c; ++i2) {
            this.b[i2] = objectInputStream.readObject();
        }
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }

    public /* synthetic */ Object clone() {
        return this.b();
    }

    static /* synthetic */ int a(m m2) {
        return m2.c;
    }

    static /* synthetic */ Object[] b(m m2) {
        return m2.b;
    }

    static /* synthetic */ int c(m m2) {
        return m2.c--;
    }
}

