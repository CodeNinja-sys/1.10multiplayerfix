/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.as;
import com.a.a.d.cl;
import com.a.a.d.dh;
import com.a.a.d.di;
import com.a.a.d.dj;
import com.a.a.d.dk;
import com.a.a.d.dl;
import com.a.a.d.mq;
import com.a.a.d.ov;
import com.a.a.d.ql;
import com.a.a.d.sz;
import com.a.a.d.xd;
import com.a.a.j.g;
import com.a.a.l.q;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class dg
extends as
implements Serializable {
    private final transient ConcurrentMap a;
    private transient dk b;
    private static final long c = 1L;

    public static dg g() {
        return new dg(new ConcurrentHashMap());
    }

    public static dg a(Iterable iterable) {
        dg dg2 = dg.g();
        mq.a(dg2, iterable);
        return dg2;
    }

    public static dg a(ql ql2) {
        return new dg(ql2.e());
    }

    dg(ConcurrentMap concurrentMap) {
        com.a.a.b.cl.a(concurrentMap.isEmpty());
        this.a = concurrentMap;
    }

    @Override
    public int a(Object object) {
        AtomicInteger atomicInteger = (AtomicInteger)sz.a((Map)this.a, object);
        return atomicInteger == null ? 0 : atomicInteger.get();
    }

    @Override
    public int size() {
        long l2 = 0L;
        for (AtomicInteger atomicInteger : this.a.values()) {
            l2 += (long)atomicInteger.get();
        }
        return q.b(l2);
    }

    @Override
    public Object[] toArray() {
        return this.h().toArray();
    }

    public Object[] toArray(Object[] arrobject) {
        return this.h().toArray(arrobject);
    }

    private List h() {
        ArrayList arrayList = ov.c(this.size());
        for (xd xd2 : this.aS_()) {
            Object object = xd2.a();
            for (int i2 = xd2.b(); i2 > 0; --i2) {
                arrayList.add(object);
            }
        }
        return arrayList;
    }

    @Override
    public int a(Object object, int n2) {
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        com.a.a.b.cl.a(object);
        if (n2 == 0) {
            return this.a(object);
        }
        com.a.a.b.cl.a(n2 > 0, "Invalid occurrences: %s", new Object[]{n2});
        do {
            int n3;
            if ((atomicInteger = (AtomicInteger)sz.a((Map)this.a, object)) == null && (atomicInteger = this.a.putIfAbsent(object, new AtomicInteger(n2))) == null) {
                return 0;
            }
            while ((n3 = atomicInteger.get()) != 0) {
                try {
                    int n4 = g.e(n3, n2);
                    if (!atomicInteger.compareAndSet(n3, n4)) continue;
                    return n3;
                }
                catch (ArithmeticException arithmeticException) {
                    throw new IllegalArgumentException("Overflow adding " + n2 + " occurrences to a count of " + n3);
                }
            }
        } while (this.a.putIfAbsent(object, atomicInteger2 = new AtomicInteger(n2)) != null && !this.a.replace(object, atomicInteger, atomicInteger2));
        return 0;
    }

    @Override
    public int b(Object object, int n2) {
        int n3;
        if (n2 == 0) {
            return this.a(object);
        }
        com.a.a.b.cl.a(n2 > 0, "Invalid occurrences: %s", new Object[]{n2});
        AtomicInteger atomicInteger = (AtomicInteger)sz.a((Map)this.a, object);
        if (atomicInteger == null) {
            return 0;
        }
        while ((n3 = atomicInteger.get()) != 0) {
            int n4 = Math.max(0, n3 - n2);
            if (!atomicInteger.compareAndSet(n3, n4)) continue;
            if (n4 == 0) {
                this.a.remove(object, atomicInteger);
            }
            return n3;
        }
        return 0;
    }

    public boolean d(Object object, int n2) {
        int n3;
        int n4;
        if (n2 == 0) {
            return true;
        }
        com.a.a.b.cl.a(n2 > 0, "Invalid occurrences: %s", new Object[]{n2});
        AtomicInteger atomicInteger = (AtomicInteger)sz.a((Map)this.a, object);
        if (atomicInteger == null) {
            return false;
        }
        do {
            if ((n4 = atomicInteger.get()) >= n2) continue;
            return false;
        } while (!atomicInteger.compareAndSet(n4, n3 = n4 - n2));
        if (n3 == 0) {
            this.a.remove(object, atomicInteger);
        }
        return true;
    }

    @Override
    public int c(Object object, int n2) {
        int n3;
        AtomicInteger atomicInteger;
        com.a.a.b.cl.a(object);
        cl.a(n2, "count");
        block0: while (true) {
            if ((atomicInteger = (AtomicInteger)sz.a((Map)this.a, object)) == null) {
                if (n2 == 0) {
                    return 0;
                }
                atomicInteger = this.a.putIfAbsent(object, new AtomicInteger(n2));
                if (atomicInteger == null) {
                    return 0;
                }
            }
            do {
                if ((n3 = atomicInteger.get()) != 0) continue;
                if (n2 == 0) {
                    return 0;
                }
                AtomicInteger atomicInteger2 = new AtomicInteger(n2);
                if (this.a.putIfAbsent(object, atomicInteger2) != null && !this.a.replace(object, atomicInteger, atomicInteger2)) continue block0;
                return 0;
            } while (!atomicInteger.compareAndSet(n3, n2));
            break;
        }
        if (n2 == 0) {
            this.a.remove(object, atomicInteger);
        }
        return n3;
    }

    @Override
    public boolean a(Object object, int n2, int n3) {
        com.a.a.b.cl.a(object);
        cl.a(n2, "oldCount");
        cl.a(n3, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger)sz.a((Map)this.a, object);
        if (atomicInteger == null) {
            if (n2 != 0) {
                return false;
            }
            if (n3 == 0) {
                return true;
            }
            return this.a.putIfAbsent(object, new AtomicInteger(n3)) == null;
        }
        int n4 = atomicInteger.get();
        if (n4 == n2) {
            if (n4 == 0) {
                if (n3 == 0) {
                    this.a.remove(object, atomicInteger);
                    return true;
                }
                AtomicInteger atomicInteger2 = new AtomicInteger(n3);
                return this.a.putIfAbsent(object, atomicInteger2) == null || this.a.replace(object, atomicInteger, atomicInteger2);
            }
            if (atomicInteger.compareAndSet(n4, n3)) {
                if (n3 == 0) {
                    this.a.remove(object, atomicInteger);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    Set e() {
        Set set = this.a.keySet();
        return new dh(this, set);
    }

    @Override
    public Set aS_() {
        dk dk2 = this.b;
        if (dk2 == null) {
            this.b = dk2 = new dk(this, null);
        }
        return dk2;
    }

    @Override
    int c() {
        return this.a.size();
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    Iterator b() {
        di di2 = new di(this);
        return new dj(this, di2);
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.a);
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        ConcurrentMap concurrentMap = (ConcurrentMap)objectInputStream.readObject();
        dl.a.a((Object)this, concurrentMap);
    }

    static /* synthetic */ ConcurrentMap a(dg dg2) {
        return dg2.a;
    }
}

