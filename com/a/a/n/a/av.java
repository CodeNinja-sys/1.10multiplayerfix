/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.bl;
import com.a.a.b.cl;
import com.a.a.d.sz;
import com.a.a.n.a.aw;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public final class av {
    private final ConcurrentHashMap a;
    private transient Map b;

    private av(ConcurrentHashMap concurrentHashMap) {
        this.a = (ConcurrentHashMap)cl.a(concurrentHashMap);
    }

    public static av a() {
        return new av(new ConcurrentHashMap());
    }

    public static av a(Map map) {
        av av2 = av.a();
        av2.b(map);
        return av2;
    }

    public long a(Object object) {
        AtomicLong atomicLong = (AtomicLong)this.a.get(object);
        return atomicLong == null ? 0L : atomicLong.get();
    }

    public long b(Object object) {
        return this.a(object, 1L);
    }

    public long c(Object object) {
        return this.a(object, -1L);
    }

    public long a(Object object, long l2) {
        long l3;
        block0: while (true) {
            long l4;
            AtomicLong atomicLong;
            if ((atomicLong = (AtomicLong)this.a.get(object)) == null && (atomicLong = this.a.putIfAbsent(object, new AtomicLong(l2))) == null) {
                return l2;
            }
            do {
                if ((l4 = atomicLong.get()) != 0L) continue;
                if (!this.a.replace(object, atomicLong, new AtomicLong(l2))) continue block0;
                return l2;
            } while (!atomicLong.compareAndSet(l4, l3 = l4 + l2));
            break;
        }
        return l3;
    }

    public long d(Object object) {
        return this.b(object, 1L);
    }

    public long e(Object object) {
        return this.b(object, -1L);
    }

    public long b(Object object, long l2) {
        long l3;
        block0: while (true) {
            long l4;
            AtomicLong atomicLong;
            if ((atomicLong = (AtomicLong)this.a.get(object)) == null && (atomicLong = this.a.putIfAbsent(object, new AtomicLong(l2))) == null) {
                return 0L;
            }
            do {
                if ((l3 = atomicLong.get()) != 0L) continue;
                if (!this.a.replace(object, atomicLong, new AtomicLong(l2))) continue block0;
                return 0L;
            } while (!atomicLong.compareAndSet(l3, l4 = l3 + l2));
            break;
        }
        return l3;
    }

    public long c(Object object, long l2) {
        long l3;
        block0: while (true) {
            AtomicLong atomicLong;
            if ((atomicLong = (AtomicLong)this.a.get(object)) == null && (atomicLong = this.a.putIfAbsent(object, new AtomicLong(l2))) == null) {
                return 0L;
            }
            do {
                if ((l3 = atomicLong.get()) != 0L) continue;
                if (!this.a.replace(object, atomicLong, new AtomicLong(l2))) continue block0;
                return 0L;
            } while (!atomicLong.compareAndSet(l3, l2));
            break;
        }
        return l3;
    }

    public void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.c(entry.getKey(), (Long)entry.getValue());
        }
    }

    public long f(Object object) {
        long l2;
        AtomicLong atomicLong = (AtomicLong)this.a.get(object);
        if (atomicLong == null) {
            return 0L;
        }
        while ((l2 = atomicLong.get()) != 0L && !atomicLong.compareAndSet(l2, 0L)) {
        }
        this.a.remove(object, atomicLong);
        return l2;
    }

    public void b() {
        for (Object e2 : this.a.keySet()) {
            AtomicLong atomicLong = (AtomicLong)this.a.get(e2);
            if (atomicLong == null || atomicLong.get() != 0L) continue;
            this.a.remove(e2, atomicLong);
        }
    }

    public long c() {
        long l2 = 0L;
        for (AtomicLong atomicLong : this.a.values()) {
            l2 += atomicLong.get();
        }
        return l2;
    }

    public Map d() {
        Map map = this.b;
        return map == null ? (this.b = this.h()) : map;
    }

    private Map h() {
        return Collections.unmodifiableMap(sz.a((Map)this.a, (bl)new aw(this)));
    }

    public boolean g(Object object) {
        return this.a.containsKey(object);
    }

    public int e() {
        return this.a.size();
    }

    public boolean f() {
        return this.a.isEmpty();
    }

    public void g() {
        this.a.clear();
    }

    public String toString() {
        return this.a.toString();
    }

    long d(Object object, long l2) {
        long l3;
        block2: {
            AtomicLong atomicLong;
            do {
                if ((atomicLong = (AtomicLong)this.a.get(object)) == null && (atomicLong = this.a.putIfAbsent(object, new AtomicLong(l2))) == null) {
                    return 0L;
                }
                l3 = atomicLong.get();
                if (l3 != 0L) break block2;
            } while (!this.a.replace(object, atomicLong, new AtomicLong(l2)));
            return 0L;
        }
        return l3;
    }

    boolean a(Object object, long l2, long l3) {
        if (l2 == 0L) {
            return this.d(object, l3) == 0L;
        }
        AtomicLong atomicLong = (AtomicLong)this.a.get(object);
        return atomicLong == null ? false : atomicLong.compareAndSet(l2, l3);
    }

    boolean e(Object object, long l2) {
        AtomicLong atomicLong = (AtomicLong)this.a.get(object);
        if (atomicLong == null) {
            return false;
        }
        long l3 = atomicLong.get();
        if (l3 != l2) {
            return false;
        }
        if (l3 == 0L || atomicLong.compareAndSet(l3, 0L)) {
            this.a.remove(object, atomicLong);
            return true;
        }
        return false;
    }
}

