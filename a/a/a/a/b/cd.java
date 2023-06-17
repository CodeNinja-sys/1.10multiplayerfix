/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.a;
import a.a.a.a.b.ce;
import a.a.a.a.b.ch;
import a.a.a.a.b.cs;
import a.a.a.a.b.dh;
import a.a.a.a.b.di;
import a.a.a.a.b.du;
import a.a.a.a.b.dv;
import a.a.a.a.b.q;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.RandomAccess;

public class cd
extends q
implements Serializable,
Cloneable,
RandomAccess {
    private static final long d = -7046029254386353130L;
    public static final int a = 16;
    protected transient long[] b;
    protected int c;
    private static final boolean e = false;

    protected cd(long[] arrl, boolean bl2) {
        this.b = arrl;
    }

    public cd(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Initial capacity (" + n2 + ") is negative");
        }
        this.b = new long[n2];
    }

    public cd() {
        this(16);
    }

    public cd(Collection collection) {
        this(collection.size());
        this.c = di.a(di.a(collection.iterator()), this.b);
    }

    public cd(cs cs2) {
        this(cs2.size());
        this.c = di.a(cs2.a(), this.b);
    }

    public cd(du du2) {
        this(du2.size());
        this.c = du2.size();
        du2.b(0, this.b, 0, this.c);
    }

    public cd(long[] arrl) {
        this(arrl, 0, arrl.length);
    }

    public cd(long[] arrl, int n2, int n3) {
        this(n3);
        System.arraycopy(arrl, n2, this.b, 0, n3);
        this.c = n3;
    }

    public cd(Iterator iterator) {
        this();
        while (iterator.hasNext()) {
            this.a((Long)iterator.next());
        }
    }

    public cd(dh dh2) {
        this();
        while (dh2.hasNext()) {
            this.e(dh2.a());
        }
    }

    public long[] l() {
        return this.b;
    }

    public static cd a(long[] arrl, int n2) {
        if (n2 > arrl.length) {
            throw new IllegalArgumentException("The specified length (" + n2 + ") is greater than the array size (" + arrl.length + ")");
        }
        cd cd2 = new cd(arrl, false);
        cd2.c = n2;
        return cd2;
    }

    public static cd c(long[] arrl) {
        return cd.a(arrl, arrl.length);
    }

    public void m(int n2) {
        this.b = ch.a(this.b, n2, this.c);
    }

    private void o(int n2) {
        this.b = ch.b(this.b, n2, this.c);
    }

    @Override
    public void a(int n2, long l2) {
        this.b(n2);
        this.o(this.c + 1);
        if (n2 != this.c) {
            System.arraycopy(this.b, n2, this.b, n2 + 1, this.c - n2);
        }
        this.b[n2] = l2;
        ++this.c;
    }

    @Override
    public boolean e(long l2) {
        this.o(this.c + 1);
        this.b[this.c++] = l2;
        return true;
    }

    @Override
    public long l(int n2) {
        if (n2 >= this.c) {
            throw new IndexOutOfBoundsException("Index (" + n2 + ") is greater than or equal to list size (" + this.c + ")");
        }
        return this.b[n2];
    }

    @Override
    public int b(long l2) {
        for (int i2 = 0; i2 < this.c; ++i2) {
            if (l2 != this.b[i2]) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public int c(long l2) {
        int n2 = this.c;
        while (n2-- != 0) {
            if (l2 != this.b[n2]) continue;
            return n2;
        }
        return -1;
    }

    @Override
    public long d(int n2) {
        if (n2 >= this.c) {
            throw new IndexOutOfBoundsException("Index (" + n2 + ") is greater than or equal to list size (" + this.c + ")");
        }
        long l2 = this.b[n2];
        --this.c;
        if (n2 != this.c) {
            System.arraycopy(this.b, n2 + 1, this.b, n2, this.c - n2);
        }
        return l2;
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
    public long b(int n2, long l2) {
        if (n2 >= this.c) {
            throw new IndexOutOfBoundsException("Index (" + n2 + ") is greater than or equal to list size (" + this.c + ")");
        }
        long l3 = this.b[n2];
        this.b[n2] = l2;
        return l3;
    }

    @Override
    public void clear() {
        this.c = 0;
    }

    @Override
    public int size() {
        return this.c;
    }

    @Override
    public void g(int n2) {
        if (n2 > this.b.length) {
            this.m(n2);
        }
        if (n2 > this.c) {
            Arrays.fill(this.b, this.c, n2, 0L);
        }
        this.c = n2;
    }

    @Override
    public boolean isEmpty() {
        return this.c == 0;
    }

    public void m() {
        this.n(0);
    }

    public void n(int n2) {
        if (n2 >= this.b.length || this.c == this.b.length) {
            return;
        }
        long[] arrl = new long[Math.max(n2, this.c)];
        System.arraycopy(this.b, 0, arrl, 0, this.c);
        this.b = arrl;
    }

    @Override
    public void b(int n2, long[] arrl, int n3, int n4) {
        ch.e(arrl, n3, n4);
        System.arraycopy(this.b, n2, arrl, n3, n4);
    }

    @Override
    public void c(int n2, int n3) {
        a.a.a.a.a.a(this.c, n2, n3);
        System.arraycopy(this.b, n3, this.b, n2, this.c - n3);
        this.c -= n3 - n2;
    }

    @Override
    public void a(int n2, long[] arrl, int n3, int n4) {
        this.b(n2);
        ch.e(arrl, n3, n4);
        this.o(this.c + n4);
        System.arraycopy(this.b, n2, this.b, n2 + n4, this.c - n2);
        System.arraycopy(arrl, n3, this.b, n2, n4);
        this.c += n4;
    }

    @Override
    public long[] b(long[] arrl) {
        if (arrl == null || arrl.length < this.c) {
            arrl = new long[this.c];
        }
        System.arraycopy(this.b, 0, arrl, 0, this.c);
        return arrl;
    }

    @Override
    public boolean a(int n2, cs cs2) {
        this.b(n2);
        int n3 = cs2.size();
        if (n3 == 0) {
            return false;
        }
        this.o(this.c + n3);
        if (n2 != this.c) {
            System.arraycopy(this.b, n2, this.b, n2 + n3, this.c - n2);
        }
        dh dh2 = cs2.a();
        this.c += n3;
        while (n3-- != 0) {
            this.b[n2++] = dh2.a();
        }
        return true;
    }

    @Override
    public boolean a(int n2, du du2) {
        this.b(n2);
        int n3 = du2.size();
        if (n3 == 0) {
            return false;
        }
        this.o(this.c + n3);
        if (n2 != this.c) {
            System.arraycopy(this.b, n2, this.b, n2 + n3, this.c - n2);
        }
        du2.b(0, this.b, n2, n3);
        this.c += n3;
        return true;
    }

    @Override
    public boolean d(cs cs2) {
        int n2;
        long[] arrl = this.b;
        int n3 = 0;
        for (n2 = 0; n2 < this.c; ++n2) {
            if (cs2.a(arrl[n2])) continue;
            arrl[n3++] = arrl[n2];
        }
        n2 = this.c != n3 ? 1 : 0;
        this.c = n3;
        return n2 != 0;
    }

    @Override
    public boolean removeAll(Collection collection) {
        int n2;
        long[] arrl = this.b;
        int n3 = 0;
        for (n2 = 0; n2 < this.c; ++n2) {
            if (collection.contains(arrl[n2])) continue;
            arrl[n3++] = arrl[n2];
        }
        n2 = this.c != n3 ? 1 : 0;
        this.c = n3;
        return n2 != 0;
    }

    @Override
    public dv f(int n2) {
        this.b(n2);
        return new ce(this, n2);
    }

    public cd n() {
        cd cd2 = new cd(this.c);
        System.arraycopy(this.b, 0, cd2.b, 0, this.c);
        cd2.c = this.c;
        return cd2;
    }

    public boolean a(cd cd2) {
        if (cd2 == this) {
            return true;
        }
        int n2 = this.size();
        if (n2 != cd2.size()) {
            return false;
        }
        long[] arrl = this.b;
        long[] arrl2 = cd2.b;
        while (n2-- != 0) {
            if (arrl[n2] == arrl2[n2]) continue;
            return false;
        }
        return true;
    }

    public int b(cd cd2) {
        int n2;
        int n3 = this.size();
        int n4 = cd2.size();
        long[] arrl = this.b;
        long[] arrl2 = cd2.b;
        for (n2 = 0; n2 < n3 && n2 < n4; ++n2) {
            long l2 = arrl[n2];
            long l3 = arrl2[n2];
            int n5 = Long.compare(l2, l3);
            if (n5 == 0) continue;
            return n5;
        }
        return n2 < n4 ? -1 : (n2 < n3 ? 1 : 0);
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
    public /* synthetic */ ListIterator listIterator(int n2) {
        return this.f(n2);
    }

    public /* synthetic */ Object clone() {
        return this.n();
    }
}

