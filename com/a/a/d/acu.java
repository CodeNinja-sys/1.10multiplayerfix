/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aac;
import com.a.a.d.abs;
import com.a.a.d.adc;
import com.a.a.d.add;
import com.a.a.d.ade;
import com.a.a.d.adf;
import com.a.a.d.adg;
import com.a.a.d.adh;
import com.a.a.d.adi;
import com.a.a.d.adj;
import com.a.a.d.adk;
import com.a.a.d.adl;
import com.a.a.d.adm;
import com.a.a.d.ado;
import com.a.a.d.adp;
import com.a.a.d.adq;
import com.a.a.d.adr;
import com.a.a.d.ads;
import com.a.a.d.adt;
import com.a.a.d.adu;
import com.a.a.d.bw;
import com.a.a.d.it;
import com.a.a.d.jr;
import com.a.a.d.kk;
import com.a.a.d.ku;
import com.a.a.d.lr;
import com.a.a.d.ou;
import com.a.a.d.vi;
import com.a.a.d.xc;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

final class acu {
    private acu() {
    }

    private static Collection c(Collection collection, Object object) {
        return new add(collection, object, null);
    }

    static Set a(Set set, Object object) {
        return new adq(set, object);
    }

    private static SortedSet b(SortedSet sortedSet, Object object) {
        return new adt(sortedSet, object);
    }

    private static List b(List list, Object object) {
        return list instanceof RandomAccess ? new adp(list, object) : new adg(list, object);
    }

    static xc a(xc xc2, Object object) {
        if (xc2 instanceof adk || xc2 instanceof ku) {
            return xc2;
        }
        return new adk(xc2, object);
    }

    static vi a(vi vi2, Object object) {
        if (vi2 instanceof adj || vi2 instanceof kk) {
            return vi2;
        }
        return new adj(vi2, object);
    }

    static ou a(ou ou2, Object object) {
        if (ou2 instanceof adh || ou2 instanceof jr) {
            return ou2;
        }
        return new adh(ou2, object);
    }

    static aac a(aac aac2, Object object) {
        if (aac2 instanceof adr || aac2 instanceof lr) {
            return aac2;
        }
        return new adr(aac2, object);
    }

    static abs a(abs abs2, Object object) {
        if (abs2 instanceof adu) {
            return abs2;
        }
        return new adu(abs2, object);
    }

    private static Collection d(Collection collection, Object object) {
        if (collection instanceof SortedSet) {
            return acu.b((SortedSet)collection, object);
        }
        if (collection instanceof Set) {
            return acu.a((Set)collection, object);
        }
        if (collection instanceof List) {
            return acu.b((List)collection, object);
        }
        return acu.c(collection, object);
    }

    private static Set c(Set set, Object object) {
        if (set instanceof SortedSet) {
            return acu.b((SortedSet)set, object);
        }
        return acu.a(set, object);
    }

    static Map a(Map map, Object object) {
        return new adi(map, object);
    }

    static SortedMap a(SortedMap sortedMap, Object object) {
        return new ads(sortedMap, object);
    }

    static bw a(bw bw2, Object object) {
        if (bw2 instanceof adc || bw2 instanceof it) {
            return bw2;
        }
        return new adc(bw2, object, null, null);
    }

    static NavigableSet a(NavigableSet navigableSet, Object object) {
        return new adm(navigableSet, object);
    }

    static NavigableSet a(NavigableSet navigableSet) {
        return acu.a(navigableSet, null);
    }

    static NavigableMap a(NavigableMap navigableMap) {
        return acu.a(navigableMap, null);
    }

    static NavigableMap a(NavigableMap navigableMap, Object object) {
        return new adl(navigableMap, object);
    }

    private static Map.Entry b(Map.Entry entry, Object object) {
        if (entry == null) {
            return null;
        }
        return new adf(entry, object);
    }

    static Queue a(Queue queue, Object object) {
        return queue instanceof ado ? queue : new ado(queue, object);
    }

    static Deque a(Deque deque, Object object) {
        return new ade(deque, object);
    }

    static /* synthetic */ SortedSet a(SortedSet sortedSet, Object object) {
        return acu.b(sortedSet, object);
    }

    static /* synthetic */ List a(List list, Object object) {
        return acu.b(list, object);
    }

    static /* synthetic */ Set b(Set set, Object object) {
        return acu.c(set, object);
    }

    static /* synthetic */ Collection a(Collection collection, Object object) {
        return acu.d(collection, object);
    }

    static /* synthetic */ Collection b(Collection collection, Object object) {
        return acu.c(collection, object);
    }

    static /* synthetic */ Map.Entry a(Map.Entry entry, Object object) {
        return acu.b(entry, object);
    }
}

