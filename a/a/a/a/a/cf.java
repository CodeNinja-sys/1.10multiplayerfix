/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cg;
import a.a.a.a.a.ch;
import a.a.a.a.a.cs;
import a.a.a.a.a.dh;
import a.a.a.a.a.v;
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
    private transient int[] b;
    private int c;

    public cf(int[] arrn) {
        this.b = arrn;
        this.c = arrn.length;
    }

    public cf() {
        this.b = ch.a;
    }

    public cf(int n2) {
        this.b = new int[n2];
    }

    public cf(cs cs2) {
        this(cs2.size());
        this.a(cs2);
    }

    public cf(Collection collection) {
        this(collection.size());
        this.addAll(collection);
    }

    public cf(int[] arrn, int n2) {
        this.b = arrn;
        this.c = n2;
        if (n2 > arrn.length) {
            throw new IllegalArgumentException("The provided size (" + n2 + ") is larger than or equal to the array size (" + arrn.length + ")");
        }
    }

    private int b(int n2) {
        int n3 = this.c;
        while (n3-- != 0) {
            if (this.b[n3] != n2) continue;
            return n3;
        }
        return -1;
    }

    @Override
    public dh a() {
        return new cg(this);
    }

    @Override
    public boolean a(int n2) {
        return this.b(n2) != -1;
    }

    @Override
    public int size() {
        return this.c;
    }

    @Override
    public boolean g(int n2) {
        int n3 = this.b(n2);
        if (n3 == -1) {
            return false;
        }
        int n4 = this.c - n3 - 1;
        for (int i2 = 0; i2 < n4; ++i2) {
            this.b[n3 + i2] = this.b[n3 + i2 + 1];
        }
        --this.c;
        return true;
    }

    @Override
    public boolean e(int n2) {
        int n3 = this.b(n2);
        if (n3 != -1) {
            return false;
        }
        if (this.c == this.b.length) {
            int[] arrn = new int[this.c == 0 ? 2 : this.c * 2];
            int n4 = this.c;
            while (n4-- != 0) {
                arrn[n4] = this.b[n4];
            }
            this.b = arrn;
        }
        this.b[this.c++] = n2;
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
        cf2.b = (int[])this.b.clone();
        return cf2;
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        for (int i2 = 0; i2 < this.c; ++i2) {
            objectOutputStream.writeInt(this.b[i2]);
        }
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.b = new int[this.c];
        for (int i2 = 0; i2 < this.c; ++i2) {
            this.b[i2] = objectInputStream.readInt();
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

    static /* synthetic */ int[] b(cf cf2) {
        return cf2.b;
    }

    static /* synthetic */ int c(cf cf2) {
        return cf2.c--;
    }
}

