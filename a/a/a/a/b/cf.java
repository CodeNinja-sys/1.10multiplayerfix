/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.cg;
import a.a.a.a.b.ch;
import a.a.a.a.b.cs;
import a.a.a.a.b.dh;
import a.a.a.a.b.v;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

public class cf
extends v
implements Serializable,
Cloneable {
    private static final long a = 1L;
    private transient long[] b;
    private int c;

    public cf(long[] arrl) {
        this.b = arrl;
        this.c = arrl.length;
    }

    public cf() {
        this.b = ch.a;
    }

    public cf(int n2) {
        this.b = new long[n2];
    }

    public cf(cs cs2) {
        this(cs2.size());
        this.a(cs2);
    }

    public cf(Collection collection) {
        this(collection.size());
        this.addAll(collection);
    }

    public cf(long[] arrl, int n2) {
        this.b = arrl;
        this.c = n2;
        if (n2 > arrl.length) {
            throw new IllegalArgumentException("The provided size (" + n2 + ") is larger than or equal to the array size (" + arrl.length + ")");
        }
    }

    private int b(long l2) {
        int n2 = this.c;
        while (n2-- != 0) {
            if (this.b[n2] != l2) continue;
            return n2;
        }
        return -1;
    }

    @Override
    public dh a() {
        return new cg(this);
    }

    @Override
    public boolean a(long l2) {
        return this.b(l2) != -1;
    }

    @Override
    public int size() {
        return this.c;
    }

    @Override
    public boolean g(long l2) {
        int n2 = this.b(l2);
        if (n2 == -1) {
            return false;
        }
        int n3 = this.c - n2 - 1;
        for (int i2 = 0; i2 < n3; ++i2) {
            this.b[n2 + i2] = this.b[n2 + i2 + 1];
        }
        --this.c;
        return true;
    }

    @Override
    public boolean e(long l2) {
        int n2 = this.b(l2);
        if (n2 != -1) {
            return false;
        }
        if (this.c == this.b.length) {
            long[] arrl = new long[this.c == 0 ? 2 : this.c * 2];
            int n3 = this.c;
            while (n3-- != 0) {
                arrl[n3] = this.b[n3];
            }
            this.b = arrl;
        }
        this.b[this.c++] = l2;
        return true;
    }

    @Override
    public void clear() {
        this.c = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.c == 0;
    }

    public cf b() {
        cf cf2;
        try {
            cf2 = (cf)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
        cf2.b = (long[])this.b.clone();
        return cf2;
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        for (int i2 = 0; i2 < this.c; ++i2) {
            objectOutputStream.writeLong(this.b[i2]);
        }
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.b = new long[this.c];
        for (int i2 = 0; i2 < this.c; ++i2) {
            this.b[i2] = objectInputStream.readLong();
        }
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }

    public /* synthetic */ Object clone() {
        return this.b();
    }

    static /* synthetic */ int a(cf cf2) {
        return cf2.c;
    }

    static /* synthetic */ long[] b(cf cf2) {
        return cf2.b;
    }

    static /* synthetic */ int c(cf cf2) {
        return cf2.c--;
    }
}

