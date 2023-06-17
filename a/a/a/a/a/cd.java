/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a;
import a.a.a.a.a.ce;
import a.a.a.a.a.ch;
import a.a.a.a.a.cs;
import a.a.a.a.a.dh;
import a.a.a.a.a.di;
import a.a.a.a.a.dt;
import a.a.a.a.a.du;
import a.a.a.a.a.q;
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
    protected transient int[] b;
    protected int c;
    private static final boolean e = false;

    protected cd(int[] arrn, boolean bl2) {
        this.b = arrn;
    }

    public cd(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Initial capacity (" + n2 + ") is negative");
        }
        this.b = new int[n2];
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

    public cd(dt dt2) {
        this(dt2.size());
        this.c = dt2.size();
        dt2.b(0, this.b, 0, this.c);
    }

    public cd(int[] arrn) {
        this(arrn, 0, arrn.length);
    }

    public cd(int[] arrn, int n2, int n3) {
        this(n3);
        System.arraycopy(arrn, n2, this.b, 0, n3);
        this.c = n3;
    }

    public cd(Iterator iterator) {
        this();
        while (iterator.hasNext()) {
            this.a((Integer)iterator.next());
        }
    }

    public cd(dh dh2) {
        this();
        while (dh2.hasNext()) {
            this.e(dh2.a());
        }
    }

    public int[] l() {
        return this.b;
    }

    public static cd a(int[] arrn, int n2) {
        if (n2 > arrn.length) {
            throw new IllegalArgumentException("The specified length (" + n2 + ") is greater than the array size (" + arrn.length + ")");
        }
        cd cd2 = new cd(arrn, false);
        cd2.c = n2;
        return cd2;
    }

    public static cd c(int[] arrn) {
        return cd.a(arrn, arrn.length);
    }

    public void r(int n2) {
        this.b = ch.a(this.b, n2, this.c);
    }

    private void t(int n2) {
        this.b = ch.b(this.b, n2, this.c);
    }

    @Override
    public void a(int n2, int n3) {
        this.b(n2);
        this.t(this.c + 1);
        if (n2 != this.c) {
            System.arraycopy(this.b, n2, this.b, n2 + 1, this.c - n2);
        }
        this.b[n2] = n3;
        ++this.c;
    }

    @Override
    public boolean e(int n2) {
        this.t(this.c + 1);
        this.b[this.c++] = n2;
        return true;
    }

    @Override
    public int q(int n2) {
        if (n2 >= this.c) {
            throw new IndexOutOfBoundsException("Index (" + n2 + ") is greater than or equal to list size (" + this.c + ")");
        }
        return this.b[n2];
    }

    @Override
    public int i(int n2) {
        for (int i2 = 0; i2 < this.c; ++i2) {
            if (n2 != this.b[i2]) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public int j(int n2) {
        int n3 = this.c;
        while (n3-- != 0) {
            if (n2 != this.b[n3]) continue;
            return n3;
        }
        return -1;
    }

    @Override
    public int d(int n2) {
        if (n2 >= this.c) {
            throw new IndexOutOfBoundsException("Index (" + n2 + ") is greater than or equal to list size (" + this.c + ")");
        }
        int n3 = this.b[n2];
        --this.c;
        if (n2 != this.c) {
            System.arraycopy(this.b, n2 + 1, this.b, n2, this.c - n2);
        }
        return n3;
    }

    @Override
    public boolean f(int n2) {
        int n3 = this.i(n2);
        if (n3 == -1) {
            return false;
        }
        this.d(n3);
        return true;
    }

    @Override
    public int b(int n2, int n3) {
        if (n2 >= this.c) {
            throw new IndexOutOfBoundsException("Index (" + n2 + ") is greater than or equal to list size (" + this.c + ")");
        }
        int n4 = this.b[n2];
        this.b[n2] = n3;
        return n4;
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
    public void k(int n2) {
        if (n2 > this.b.length) {
            this.r(n2);
        }
        if (n2 > this.c) {
            Arrays.fill(this.b, this.c, n2, 0);
        }
        this.c = n2;
    }

    @Override
    public boolean isEmpty() {
        return this.c == 0;
    }

    public void m() {
        this.s(0);
    }

    public void s(int n2) {
        if (n2 >= this.b.length || this.c == this.b.length) {
            return;
        }
        int[] arrn = new int[Math.max(n2, this.c)];
        System.arraycopy(this.b, 0, arrn, 0, this.c);
        this.b = arrn;
    }

    @Override
    public void b(int n2, int[] arrn, int n3, int n4) {
        ch.e(arrn, n3, n4);
        System.arraycopy(this.b, n2, arrn, n3, n4);
    }

    @Override
    public void e(int n2, int n3) {
        a.a.a.a.a.a(this.c, n2, n3);
        System.arraycopy(this.b, n3, this.b, n2, this.c - n3);
        this.c -= n3 - n2;
    }

    @Override
    public void a(int n2, int[] arrn, int n3, int n4) {
        this.b(n2);
        ch.e(arrn, n3, n4);
        this.t(this.c + n4);
        System.arraycopy(this.b, n2, this.b, n2 + n4, this.c - n2);
        System.arraycopy(arrn, n3, this.b, n2, n4);
        this.c += n4;
    }

    @Override
    public int[] b(int[] arrn) {
        if (arrn == null || arrn.length < this.c) {
            arrn = new int[this.c];
        }
        System.arraycopy(this.b, 0, arrn, 0, this.c);
        return arrn;
    }

    @Override
    public boolean a(int n2, cs cs2) {
        this.b(n2);
        int n3 = cs2.size();
        if (n3 == 0) {
            return false;
        }
        this.t(this.c + n3);
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
    public boolean a(int n2, dt dt2) {
        this.b(n2);
        int n3 = dt2.size();
        if (n3 == 0) {
            return false;
        }
        this.t(this.c + n3);
        if (n2 != this.c) {
            System.arraycopy(this.b, n2, this.b, n2 + n3, this.c - n2);
        }
        dt2.b(0, this.b, n2, n3);
        this.c += n3;
        return true;
    }

    @Override
    public boolean d(cs cs2) {
        int n2;
        int[] arrn = this.b;
        int n3 = 0;
        for (n2 = 0; n2 < this.c; ++n2) {
            if (cs2.a(arrn[n2])) continue;
            arrn[n3++] = arrn[n2];
        }
        n2 = this.c != n3 ? 1 : 0;
        this.c = n3;
        return n2 != 0;
    }

    @Override
    public boolean removeAll(Collection collection) {
        int n2;
        int[] arrn = this.b;
        int n3 = 0;
        for (n2 = 0; n2 < this.c; ++n2) {
            if (collection.contains(arrn[n2])) continue;
            arrn[n3++] = arrn[n2];
        }
        n2 = this.c != n3 ? 1 : 0;
        this.c = n3;
        return n2 != 0;
    }

    @Override
    public du h(int n2) {
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
        int[] arrn = this.b;
        int[] arrn2 = cd2.b;
        while (n2-- != 0) {
            if (arrn[n2] == arrn2[n2]) continue;
            return false;
        }
        return true;
    }

    public int b(cd cd2) {
        int n2;
        int n3 = this.size();
        int n4 = cd2.size();
        int[] arrn = this.b;
        int[] arrn2 = cd2.b;
        for (n2 = 0; n2 < n3 && n2 < n4; ++n2) {
            int n5 = arrn[n2];
            int n6 = arrn2[n2];
            int n7 = Integer.compare(n5, n6);
            if (n7 == 0) continue;
            return n7;
        }
        return n2 < n4 ? -1 : (n2 < n3 ? 1 : 0);
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
    public /* synthetic */ ListIterator listIterator(int n2) {
        return this.h(n2);
    }

    public /* synthetic */ Object clone() {
        return this.n();
    }
}

