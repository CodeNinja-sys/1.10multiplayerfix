/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.as;
import a.a.a.a.a.au;
import a.a.a.a.a.b;
import a.a.a.a.a.cf;
import a.a.a.a.a.ch;
import a.a.a.a.a.eb;
import a.a.a.a.a.z;
import a.a.a.a.c.aq;
import a.a.a.a.c.m;
import a.a.a.a.c.o;
import a.a.a.a.c.w;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class x
extends b
implements Serializable,
Cloneable {
    private static final long b = 1L;
    private transient int[] c;
    private transient Object[] d;
    private int e;

    public x(int[] arrn, Object[] arrobject) {
        this.c = arrn;
        this.d = arrobject;
        this.e = arrn.length;
        if (arrn.length != arrobject.length) {
            throw new IllegalArgumentException("Keys and values have different lengths (" + arrn.length + ", " + arrobject.length + ")");
        }
    }

    public x() {
        this.c = ch.a;
        this.d = o.a;
    }

    public x(int n2) {
        this.c = new int[n2];
        this.d = new Object[n2];
    }

    public x(as as2) {
        this(as2.size());
        this.putAll((Map)as2);
    }

    public x(Map map) {
        this(map.size());
        this.putAll(map);
    }

    public x(int[] arrn, Object[] arrobject, int n2) {
        this.c = arrn;
        this.d = arrobject;
        this.e = n2;
        if (arrn.length != arrobject.length) {
            throw new IllegalArgumentException("Keys and values have different lengths (" + arrn.length + ", " + arrobject.length + ")");
        }
        if (n2 > arrn.length) {
            throw new IllegalArgumentException("The provided size (" + n2 + ") is larger than or equal to the backing-arrays size (" + arrn.length + ")");
        }
    }

    public au e() {
        return new z(this, null);
    }

    private int d(int n2) {
        int[] arrn = this.c;
        int n3 = this.e;
        while (n3-- != 0) {
            if (arrn[n3] != n2) continue;
            return n3;
        }
        return -1;
    }

    @Override
    public Object c(int n2) {
        int[] arrn = this.c;
        int n3 = this.e;
        while (n3-- != 0) {
            if (arrn[n3] != n2) continue;
            return this.d[n3];
        }
        return this.a;
    }

    @Override
    public int size() {
        return this.e;
    }

    @Override
    public void clear() {
        int n2 = this.e;
        while (n2-- != 0) {
            this.d[n2] = null;
        }
        this.e = 0;
    }

    @Override
    public boolean b(int n2) {
        return this.d(n2) != -1;
    }

    @Override
    public boolean containsValue(Object object) {
        int n2 = this.e;
        while (n2-- != 0) {
            if (!(this.d[n2] == null ? object == null : this.d[n2].equals(object))) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return this.e == 0;
    }

    @Override
    public Object a(int n2, Object object) {
        int n3 = this.d(n2);
        if (n3 != -1) {
            Object object2 = this.d[n3];
            this.d[n3] = object;
            return object2;
        }
        if (this.e == this.c.length) {
            int[] arrn = new int[this.e == 0 ? 2 : this.e * 2];
            Object[] arrobject = new Object[this.e == 0 ? 2 : this.e * 2];
            int n4 = this.e;
            while (n4-- != 0) {
                arrn[n4] = this.c[n4];
                arrobject[n4] = this.d[n4];
            }
            this.c = arrn;
            this.d = arrobject;
        }
        this.c[this.e] = n2;
        this.d[this.e] = object;
        ++this.e;
        return this.a;
    }

    @Override
    public Object a(int n2) {
        int n3 = this.d(n2);
        if (n3 == -1) {
            return this.a;
        }
        Object object = this.d[n3];
        int n4 = this.e - n3 - 1;
        System.arraycopy(this.c, n3 + 1, this.c, n3, n4);
        System.arraycopy(this.d, n3 + 1, this.d, n3, n4);
        --this.e;
        this.d[this.e] = null;
        return object;
    }

    @Override
    public eb b() {
        return new cf(this.c, this.e);
    }

    @Override
    public w c() {
        return a.a.a.a.c.x.b(new m(this.d, this.e));
    }

    public x f() {
        x x2;
        try {
            x2 = (x)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
        x2.c = (int[])this.c.clone();
        x2.d = (Object[])this.d.clone();
        return x2;
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        for (int i2 = 0; i2 < this.e; ++i2) {
            objectOutputStream.writeInt(this.c[i2]);
            objectOutputStream.writeObject(this.d[i2]);
        }
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = new int[this.e];
        this.d = new Object[this.e];
        for (int i2 = 0; i2 < this.e; ++i2) {
            this.c[i2] = objectInputStream.readInt();
            this.d[i2] = objectInputStream.readObject();
        }
    }

    @Override
    public /* synthetic */ aq bD_() {
        return this.e();
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.c();
    }

    @Override
    public /* synthetic */ Set keySet() {
        return this.b();
    }

    public /* synthetic */ Object clone() {
        return this.f();
    }

    static /* synthetic */ int a(x x2) {
        return x2.e;
    }

    static /* synthetic */ int[] b(x x2) {
        return x2.c;
    }

    static /* synthetic */ Object[] c(x x2) {
        return x2.d;
    }

    static /* synthetic */ int d(x x2) {
        return x2.e--;
    }

    static /* synthetic */ int a(x x2, int n2) {
        return x2.d(n2);
    }
}

