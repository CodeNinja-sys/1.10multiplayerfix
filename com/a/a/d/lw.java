/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.fa;
import com.a.a.d.iz;
import com.a.a.d.jl;
import com.a.a.d.jn;
import com.a.a.d.lo;
import com.a.a.d.lx;
import com.a.a.d.ly;
import com.a.a.d.lz;
import com.a.a.d.me;
import com.a.a.d.sz;
import com.a.a.d.yd;
import com.a.a.d.zl;
import com.a.a.d.zq;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

public abstract class lw
extends lz
implements NavigableMap {
    private static final Comparator a = yd.d();
    private static final lw b = new fa(a);
    private transient lw c;
    private static final long d = 0L;

    static lw a(Comparator comparator) {
        if (yd.d().equals(comparator)) {
            return lw.j();
        }
        return new fa(comparator);
    }

    static lw a(Comparator comparator, int n2, Map.Entry[] arrentry) {
        if (n2 == 0) {
            return lw.a(comparator);
        }
        jn jn2 = jl.g();
        jn jn3 = jl.g();
        for (int i2 = 0; i2 < n2; ++i2) {
            Map.Entry entry = arrentry[i2];
            jn2.c(entry.getKey());
            jn3.c(entry.getValue());
        }
        return new zl(new zq(jn2.b(), comparator), jn3.b());
    }

    static lw a(me me2, jl jl2) {
        if (me2.isEmpty()) {
            return lw.a(me2.comparator());
        }
        return new zl((zq)me2, jl2);
    }

    public static lw j() {
        return b;
    }

    public static lw a(Comparable comparable, Object object) {
        return lw.a(me.c(comparable), jl.a(object));
    }

    public static lw a(Comparable comparable, Object object, Comparable comparable2, Object object2) {
        return lw.a(yd.d(), false, 2, lw.d(comparable, object), lw.d(comparable2, object2));
    }

    public static lw a(Comparable comparable, Object object, Comparable comparable2, Object object2, Comparable comparable3, Object object3) {
        return lw.a(yd.d(), false, 3, lw.d(comparable, object), lw.d(comparable2, object2), lw.d(comparable3, object3));
    }

    public static lw a(Comparable comparable, Object object, Comparable comparable2, Object object2, Comparable comparable3, Object object3, Comparable comparable4, Object object4) {
        return lw.a(yd.d(), false, 4, lw.d(comparable, object), lw.d(comparable2, object2), lw.d(comparable3, object3), lw.d(comparable4, object4));
    }

    public static lw a(Comparable comparable, Object object, Comparable comparable2, Object object2, Comparable comparable3, Object object3, Comparable comparable4, Object object4, Comparable comparable5, Object object5) {
        return lw.a(yd.d(), false, 5, lw.d(comparable, object), lw.d(comparable2, object2), lw.d(comparable3, object3), lw.d(comparable4, object4), lw.d(comparable5, object5));
    }

    public static lw a(Map map) {
        yd yd2 = yd.d();
        return lw.b(map, yd2);
    }

    public static lw a(Map map, Comparator comparator) {
        return lw.b(map, (Comparator)cl.a(comparator));
    }

    public static lw a(SortedMap sortedMap) {
        Comparator comparator = sortedMap.comparator();
        if (comparator == null) {
            comparator = a;
        }
        return lw.b(sortedMap, comparator);
    }

    private static lw b(Map map, Comparator comparator) {
        Map.Entry[] arrentry;
        boolean bl2 = false;
        if (map instanceof SortedMap) {
            arrentry = (Map.Entry[])map;
            Comparator comparator2 = arrentry.comparator();
            boolean bl3 = comparator2 == null ? comparator == a : (bl2 = comparator.equals(comparator2));
        }
        if (bl2 && map instanceof lw && !(arrentry = (lw)map).b()) {
            return arrentry;
        }
        arrentry = map.entrySet().toArray(new Map.Entry[0]);
        return lw.a(comparator, bl2, arrentry.length, arrentry);
    }

    static lw a(Comparator comparator, boolean bl2, int n2, Map.Entry ... arrentry) {
        for (int i2 = 0; i2 < n2; ++i2) {
            Map.Entry entry = arrentry[i2];
            arrentry[i2] = lw.d(entry.getKey(), entry.getValue());
        }
        if (!bl2) {
            lw.b(comparator, n2, arrentry);
            lw.a(n2, arrentry, comparator);
        }
        return lw.a(comparator, n2, arrentry);
    }

    private static void b(Comparator comparator, int n2, Map.Entry[] arrentry) {
        Arrays.sort(arrentry, 0, n2, yd.a(comparator).h());
    }

    private static void a(int n2, Map.Entry[] arrentry, Comparator comparator) {
        for (int i2 = 1; i2 < n2; ++i2) {
            lw.a(comparator.compare(arrentry[i2 - 1].getKey(), arrentry[i2].getKey()) != 0, "key", arrentry[i2 - 1], arrentry[i2]);
        }
    }

    public static lx k() {
        return new lx(yd.d());
    }

    public static lx b(Comparator comparator) {
        return new lx(comparator);
    }

    public static lx o() {
        return new lx(yd.d().a());
    }

    lw() {
    }

    lw(lw lw2) {
        this.c = lw2;
    }

    @Override
    public int size() {
        return this.aU_().size();
    }

    @Override
    public boolean containsValue(Object object) {
        return this.aU_().contains(object);
    }

    @Override
    boolean b() {
        return this.a().a() || this.aU_().a();
    }

    @Override
    public lo e() {
        return super.e();
    }

    public abstract me a();

    @Override
    public abstract iz aU_();

    @Override
    public Comparator comparator() {
        return this.a().comparator();
    }

    @Override
    public Object firstKey() {
        return this.a().first();
    }

    @Override
    public Object lastKey() {
        return this.a().last();
    }

    public lw a(Object object) {
        return this.a(object, false);
    }

    public abstract lw a(Object var1, boolean var2);

    public lw a(Object object, Object object2) {
        return this.a(object, true, object2, false);
    }

    public lw a(Object object, boolean bl2, Object object2, boolean bl3) {
        cl.a(object);
        cl.a(object2);
        cl.a(this.comparator().compare(object, object2) <= 0, "expected fromKey <= toKey but %s > %s", object, object2);
        return this.a(object2, bl3).b(object, bl2);
    }

    public lw b(Object object) {
        return this.b(object, true);
    }

    public abstract lw b(Object var1, boolean var2);

    public Map.Entry lowerEntry(Object object) {
        return this.a(object, false).lastEntry();
    }

    public Object lowerKey(Object object) {
        return sz.b(this.lowerEntry(object));
    }

    public Map.Entry floorEntry(Object object) {
        return this.a(object, true).lastEntry();
    }

    public Object floorKey(Object object) {
        return sz.b(this.floorEntry(object));
    }

    public Map.Entry ceilingEntry(Object object) {
        return this.b(object, true).firstEntry();
    }

    public Object ceilingKey(Object object) {
        return sz.b(this.ceilingEntry(object));
    }

    public Map.Entry higherEntry(Object object) {
        return this.b(object, false).firstEntry();
    }

    public Object higherKey(Object object) {
        return sz.b(this.higherEntry(object));
    }

    public Map.Entry firstEntry() {
        return this.isEmpty() ? null : (Map.Entry)this.e().h().get(0);
    }

    public Map.Entry lastEntry() {
        return this.isEmpty() ? null : (Map.Entry)this.e().h().get(this.size() - 1);
    }

    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public lw p() {
        lw lw2 = this.c;
        if (lw2 == null) {
            lw2 = this.c = this.i();
        }
        return lw2;
    }

    abstract lw i();

    public me q() {
        return this.a();
    }

    public me r() {
        return this.a().aP_();
    }

    @Override
    Object l() {
        return new ly(this);
    }

    @Override
    public /* synthetic */ lo g() {
        return this.a();
    }

    @Override
    public /* synthetic */ Set entrySet() {
        return this.e();
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.aU_();
    }

    @Override
    public /* synthetic */ Set keySet() {
        return this.a();
    }

    @Override
    public /* synthetic */ SortedMap tailMap(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ SortedMap headMap(Object object) {
        return this.a(object);
    }

    @Override
    public /* synthetic */ SortedMap subMap(Object object, Object object2) {
        return this.a(object, object2);
    }

    public /* synthetic */ NavigableMap tailMap(Object object, boolean bl2) {
        return this.b(object, bl2);
    }

    public /* synthetic */ NavigableMap headMap(Object object, boolean bl2) {
        return this.a(object, bl2);
    }

    public /* synthetic */ NavigableMap subMap(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.a(object, bl2, object2, bl3);
    }

    public /* synthetic */ NavigableSet descendingKeySet() {
        return this.r();
    }

    public /* synthetic */ NavigableSet navigableKeySet() {
        return this.q();
    }

    public /* synthetic */ NavigableMap descendingMap() {
        return this.p();
    }
}

