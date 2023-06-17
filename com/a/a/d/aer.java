/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.abn;
import com.a.a.d.aes;
import com.a.a.d.aet;
import com.a.a.d.aeu;
import com.a.a.d.aew;
import com.a.a.d.aez;
import com.a.a.d.afa;
import com.a.a.d.bc;
import com.a.a.d.ce;
import com.a.a.d.cl;
import com.a.a.d.hs;
import com.a.a.d.mq;
import com.a.a.d.xc;
import com.a.a.d.xd;
import com.a.a.d.yd;
import com.a.a.d.zz;
import com.a.a.l.q;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

public final class aer
extends bc
implements Serializable {
    private final transient afa b;
    private final transient hs c;
    private final transient aez d;
    private static final long e = 1L;

    public static aer r() {
        return new aer(yd.d());
    }

    public static aer a(Comparator comparator) {
        return comparator == null ? new aer(yd.d()) : new aer(comparator);
    }

    public static aer a(Iterable iterable) {
        aer aer2 = aer.r();
        mq.a(aer2, iterable);
        return aer2;
    }

    aer(afa afa2, hs hs2, aez aez2) {
        super(hs2.a());
        this.b = afa2;
        this.c = hs2;
        this.d = aez2;
    }

    aer(Comparator comparator) {
        super(comparator);
        this.c = hs.a(comparator);
        this.d = new aez(null, 1);
        aer.b(this.d, this.d);
        this.b = new afa(null);
    }

    private long a(aew aew2) {
        aez aez2 = (aez)this.b.a();
        long l2 = aew2.b(aez2);
        if (this.c.b()) {
            l2 -= this.a(aew2, aez2);
        }
        if (this.c.c()) {
            l2 -= this.b(aew2, aez2);
        }
        return l2;
    }

    private long a(aew aew2, aez aez2) {
        if (aez2 == null) {
            return 0L;
        }
        int n2 = this.comparator().compare(this.c.f(), aez.d(aez2));
        if (n2 < 0) {
            return this.a(aew2, aez.e(aez2));
        }
        if (n2 == 0) {
            switch (this.c.g()) {
                case a: {
                    return (long)aew2.a(aez2) + aew2.b(aez.e(aez2));
                }
                case b: {
                    return aew2.b(aez.e(aez2));
                }
            }
            throw new AssertionError();
        }
        return aew2.b(aez.e(aez2)) + (long)aew2.a(aez2) + this.a(aew2, aez.f(aez2));
    }

    private long b(aew aew2, aez aez2) {
        if (aez2 == null) {
            return 0L;
        }
        int n2 = this.comparator().compare(this.c.h(), aez.d(aez2));
        if (n2 > 0) {
            return this.b(aew2, aez.f(aez2));
        }
        if (n2 == 0) {
            switch (this.c.i()) {
                case a: {
                    return (long)aew2.a(aez2) + aew2.b(aez.f(aez2));
                }
                case b: {
                    return aew2.b(aez.f(aez2));
                }
            }
            throw new AssertionError();
        }
        return aew2.b(aez.f(aez2)) + (long)aew2.a(aez2) + this.b(aew2, aez.e(aez2));
    }

    @Override
    public int size() {
        return q.b(this.a(aew.a));
    }

    @Override
    int c() {
        return q.b(this.a(aew.b));
    }

    @Override
    public int a(Object object) {
        try {
            Object object2 = object;
            aez aez2 = (aez)this.b.a();
            if (!this.c.c(object2) || aez2 == null) {
                return 0;
            }
            return aez2.a(this.comparator(), object2);
        }
        catch (ClassCastException classCastException) {
            return 0;
        }
        catch (NullPointerException nullPointerException) {
            return 0;
        }
    }

    @Override
    public int a(Object object, int n2) {
        cl.a(n2, "occurrences");
        if (n2 == 0) {
            return this.a(object);
        }
        com.a.a.b.cl.a(this.c.c(object));
        aez aez2 = (aez)this.b.a();
        if (aez2 == null) {
            this.comparator().compare(object, object);
            aez aez3 = new aez(object, n2);
            aer.b(this.d, aez3, this.d);
            this.b.a(aez2, aez3);
            return 0;
        }
        int[] arrn = new int[1];
        aez aez4 = aez2.a(this.comparator(), object, n2, arrn);
        this.b.a(aez2, aez4);
        return arrn[0];
    }

    @Override
    public int b(Object object, int n2) {
        aez aez2;
        cl.a(n2, "occurrences");
        if (n2 == 0) {
            return this.a(object);
        }
        aez aez3 = (aez)this.b.a();
        int[] arrn = new int[1];
        try {
            Object object2 = object;
            if (!this.c.c(object2) || aez3 == null) {
                return 0;
            }
            aez2 = aez3.b(this.comparator(), object2, n2, arrn);
        }
        catch (ClassCastException classCastException) {
            return 0;
        }
        catch (NullPointerException nullPointerException) {
            return 0;
        }
        this.b.a(aez3, aez2);
        return arrn[0];
    }

    @Override
    public int c(Object object, int n2) {
        cl.a(n2, "count");
        if (!this.c.c(object)) {
            com.a.a.b.cl.a(n2 == 0);
            return 0;
        }
        aez aez2 = (aez)this.b.a();
        if (aez2 == null) {
            if (n2 > 0) {
                this.a(object, n2);
            }
            return 0;
        }
        int[] arrn = new int[1];
        aez aez3 = aez2.c(this.comparator(), object, n2, arrn);
        this.b.a(aez2, aez3);
        return arrn[0];
    }

    @Override
    public boolean a(Object object, int n2, int n3) {
        cl.a(n3, "newCount");
        cl.a(n2, "oldCount");
        com.a.a.b.cl.a(this.c.c(object));
        aez aez2 = (aez)this.b.a();
        if (aez2 == null) {
            if (n2 == 0) {
                if (n3 > 0) {
                    this.a(object, n3);
                }
                return true;
            }
            return false;
        }
        int[] arrn = new int[1];
        aez aez3 = aez2.a(this.comparator(), object, n2, n3, arrn);
        this.b.a(aez2, aez3);
        return arrn[0] == n2;
    }

    private xd b(aez aez2) {
        return new aes(this, aez2);
    }

    private aez s() {
        aez aez2;
        aez aez3 = (aez)this.b.a();
        if (aez3 == null) {
            return null;
        }
        if (this.c.b()) {
            Object object = this.c.f();
            aez2 = aez.a((aez)this.b.a(), this.comparator(), object);
            if (aez2 == null) {
                return null;
            }
            if (this.c.g() == ce.a && this.comparator().compare(object, aez2.a()) == 0) {
                aez2 = aez.g(aez2);
            }
        } else {
            aez2 = aez.g(this.d);
        }
        return aez2 == this.d || !this.c.c(aez2.a()) ? null : aez2;
    }

    private aez t() {
        aez aez2;
        aez aez3 = (aez)this.b.a();
        if (aez3 == null) {
            return null;
        }
        if (this.c.c()) {
            Object object = this.c.h();
            aez2 = aez.b((aez)this.b.a(), this.comparator(), object);
            if (aez2 == null) {
                return null;
            }
            if (this.c.i() == ce.a && this.comparator().compare(object, aez2.a()) == 0) {
                aez2 = aez.h(aez2);
            }
        } else {
            aez2 = aez.h(this.d);
        }
        return aez2 == this.d || !this.c.c(aez2.a()) ? null : aez2;
    }

    @Override
    Iterator b() {
        return new aet(this);
    }

    @Override
    Iterator m() {
        return new aeu(this);
    }

    @Override
    public abn d(Object object, ce ce2) {
        return new aer(this.b, this.c.a(hs.b(this.comparator(), object, ce2)), this.d);
    }

    @Override
    public abn c(Object object, ce ce2) {
        return new aer(this.b, this.c.a(hs.a(this.comparator(), object, ce2)), this.d);
    }

    static int a(aez aez2) {
        return aez2 == null ? 0 : aez.c(aez2);
    }

    private static void b(aez aez2, aez aez3) {
        aez.a(aez2, aez3);
        aez.b(aez3, aez2);
    }

    private static void b(aez aez2, aez aez3, aez aez4) {
        aer.b(aez2, aez3);
        aer.b(aez3, aez4);
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.g().comparator());
        zz.a((xc)this, objectOutputStream);
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator)objectInputStream.readObject();
        zz.a(bc.class, "comparator").a((Object)this, comparator);
        zz.a(aer.class, "range").a((Object)this, hs.a(comparator));
        zz.a(aer.class, "rootReference").a((Object)this, new afa(null));
        aez aez2 = new aez(null, 1);
        zz.a(aer.class, "header").a((Object)this, aez2);
        aer.b(aez2, aez2);
        zz.a((xc)this, objectInputStream);
    }

    static /* synthetic */ aez a(aer aer2) {
        return aer2.s();
    }

    static /* synthetic */ hs b(aer aer2) {
        return aer2.c;
    }

    static /* synthetic */ xd a(aer aer2, aez aez2) {
        return aer2.b(aez2);
    }

    static /* synthetic */ aez c(aer aer2) {
        return aer2.d;
    }

    static /* synthetic */ aez d(aer aer2) {
        return aer2.t();
    }

    static /* synthetic */ void a(aez aez2, aez aez3, aez aez4) {
        aer.b(aez2, aez3, aez4);
    }

    static /* synthetic */ void a(aez aez2, aez aez3) {
        aer.b(aez2, aez3);
    }
}

