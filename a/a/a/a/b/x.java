/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.as;
import a.a.a.a.b.au;
import a.a.a.a.b.b;
import a.a.a.a.b.cf;
import a.a.a.a.b.ch;
import a.a.a.a.b.ec;
import a.a.a.a.b.z;
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
    private transient long[] c;
    private transient Object[] d;
    private int e;

    public x(long[] arrl, Object[] arrobject) {
        this.c = arrl;
        this.d = arrobject;
        this.e = arrl.length;
        if (arrl.length != arrobject.length) {
            throw new IllegalArgumentException("Keys and values have different lengths (" + arrl.length + ", " + arrobject.length + ")");
        }
    }

    public x() {
        this.c = ch.a;
        this.d = o.a;
    }

    public x(int n2) {
        this.c = new long[n2];
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

    public x(long[] arrl, Object[] arrobject, int n2) {
        this.c = arrl;
        this.d = arrobject;
        this.e = n2;
        if (arrl.length != arrobject.length) {
            throw new IllegalArgumentException("Keys and values have different lengths (" + arrl.length + ", " + arrobject.length + ")");
        }
        if (n2 > arrl.length) {
            throw new IllegalArgumentException("The provided size (" + n2 + ") is larger than or equal to the backing-arrays size (" + arrl.length + ")");
        }
    }

    public au e() {
        return new z(this, null);
    }

    private int d(long l2) {
        long[] arrl = this.c;
        int n2 = this.e;
        while (n2-- != 0) {
            if (arrl[n2] != l2) continue;
            return n2;
        }
        return -1;
    }

    @Override
    public Object c(long l2) {
        long[] arrl = this.c;
        int n2 = this.e;
        while (n2-- != 0) {
            if (arrl[n2] != l2) continue;
            return this.d[n2];
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
    public boolean b(long l2) {
        return this.d(l2) != -1;
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
    public Object a(long l2, Object object) {
        int n2 = this.d(l2);
        if (n2 != -1) {
            Object object2 = this.d[n2];
            this.d[n2] = object;
            return object2;
        }
        if (this.e == this.c.length) {
            long[] arrl = new long[this.e == 0 ? 2 : this.e * 2];
            Object[] arrobject = new Object[this.e == 0 ? 2 : this.e * 2];
            int n3 = this.e;
            while (n3-- != 0) {
                arrl[n3] = this.c[n3];
                arrobject[n3] = this.d[n3];
            }
            this.c = arrl;
            this.d = arrobject;
        }
        this.c[this.e] = l2;
        this.d[this.e] = object;
        ++this.e;
        return this.a;
    }

    @Override
    public Object a(long l2) {
        int n2 = this.d(l2);
        if (n2 == -1) {
            return this.a;
        }
        Object object = this.d[n2];
        int n3 = this.e - n2 - 1;
        System.arraycopy(this.c, n2 + 1, this.c, n2, n3);
        System.arraycopy(this.d, n2 + 1, this.d, n2, n3);
        --this.e;
        this.d[this.e] = null;
        return object;
    }

    @Override
    public ec b() {
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
        x2.c = (long[])this.c.clone();
        x2.d = (Object[])this.d.clone();
        return x2;
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        for (int i2 = 0; i2 < this.e; ++i2) {
            objectOutputStream.writeLong(this.c[i2]);
            objectOutputStream.writeObject(this.d[i2]);
        }
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = new long[this.e];
        this.d = new Object[this.e];
        for (int i2 = 0; i2 < this.e; ++i2) {
            this.c[i2] = objectInputStream.readLong();
            this.d[i2] = objectInputStream.readObject();
        }
    }

    @Override
    public /* synthetic */ aq bG_() {
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

    static /* synthetic */ long[] b(x x2) {
        return x2.c;
    }

    static /* synthetic */ Object[] c(x x2) {
        return x2.d;
    }

    static /* synthetic */ int d(x x2) {
        return x2.e--;
    }

    static /* synthetic */ int a(x x2, long l2) {
        return x2.d(l2);
    }
}

