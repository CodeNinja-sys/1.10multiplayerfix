/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.b.cn;
import com.a.a.d.aae;
import com.a.a.d.aaf;
import com.a.a.d.aag;
import com.a.a.d.aah;
import com.a.a.d.aak;
import com.a.a.d.aal;
import com.a.a.d.aam;
import com.a.a.d.aao;
import com.a.a.d.aaq;
import com.a.a.d.aat;
import com.a.a.d.acu;
import com.a.a.d.cm;
import com.a.a.d.ji;
import com.a.a.d.lo;
import com.a.a.d.me;
import com.a.a.d.mq;
import com.a.a.d.nj;
import com.a.a.d.ov;
import com.a.a.d.sz;
import com.a.a.d.xc;
import com.a.a.d.yj;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

public final class aad {
    private aad() {
    }

    public static lo a(Enum enum_, Enum ... arrenum) {
        return ji.a(EnumSet.of(enum_, arrenum));
    }

    public static lo a(Iterable iterable) {
        if (iterable instanceof ji) {
            return (ji)iterable;
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection)iterable;
            if (collection.isEmpty()) {
                return lo.j();
            }
            return ji.a(EnumSet.copyOf(collection));
        }
        Iterator iterator = iterable.iterator();
        if (iterator.hasNext()) {
            EnumSet<Enum> enumSet = EnumSet.of((Enum)iterator.next());
            nj.a(enumSet, iterator);
            return ji.a(enumSet);
        }
        return lo.j();
    }

    public static EnumSet a(Iterable iterable, Class class_) {
        EnumSet enumSet = EnumSet.noneOf(class_);
        mq.a(enumSet, iterable);
        return enumSet;
    }

    public static HashSet a() {
        return new HashSet();
    }

    public static HashSet a(Object ... arrobject) {
        HashSet hashSet = aad.a(arrobject.length);
        Collections.addAll(hashSet, arrobject);
        return hashSet;
    }

    public static HashSet a(int n2) {
        return new HashSet(sz.b(n2));
    }

    public static HashSet b(Iterable iterable) {
        return iterable instanceof Collection ? new HashSet(cm.a(iterable)) : aad.a(iterable.iterator());
    }

    public static HashSet a(Iterator iterator) {
        HashSet hashSet = aad.a();
        nj.a(hashSet, iterator);
        return hashSet;
    }

    public static Set b() {
        return aad.a(new ConcurrentHashMap());
    }

    public static Set c(Iterable iterable) {
        Set set = aad.b();
        mq.a(set, iterable);
        return set;
    }

    public static LinkedHashSet c() {
        return new LinkedHashSet();
    }

    public static LinkedHashSet b(int n2) {
        return new LinkedHashSet(sz.b(n2));
    }

    public static LinkedHashSet d(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet(cm.a(iterable));
        }
        LinkedHashSet linkedHashSet = aad.c();
        mq.a(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static TreeSet d() {
        return new TreeSet();
    }

    public static TreeSet e(Iterable iterable) {
        TreeSet treeSet = aad.d();
        mq.a(treeSet, iterable);
        return treeSet;
    }

    public static TreeSet a(Comparator comparator) {
        return new TreeSet((Comparator)cl.a(comparator));
    }

    public static Set e() {
        return aad.a(sz.g());
    }

    public static CopyOnWriteArraySet f() {
        return new CopyOnWriteArraySet();
    }

    public static CopyOnWriteArraySet f(Iterable iterable) {
        Collection collection = iterable instanceof Collection ? cm.a(iterable) : ov.a(iterable);
        return new CopyOnWriteArraySet(collection);
    }

    public static EnumSet a(Collection collection) {
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet)collection);
        }
        cl.a(!collection.isEmpty(), (Object)"collection is empty; use the other version of this method");
        Class class_ = ((Enum)collection.iterator().next()).getDeclaringClass();
        return aad.b(collection, class_);
    }

    public static EnumSet a(Collection collection, Class class_) {
        cl.a(collection);
        return collection instanceof EnumSet ? EnumSet.complementOf((EnumSet)collection) : aad.b(collection, class_);
    }

    private static EnumSet b(Collection collection, Class class_) {
        EnumSet enumSet = EnumSet.allOf(class_);
        enumSet.removeAll(collection);
        return enumSet;
    }

    public static Set a(Map map) {
        return yj.a(map);
    }

    public static aaq a(Set set, Set set2) {
        cl.a(set, (Object)"set1");
        cl.a(set2, (Object)"set2");
        aaq aaq2 = aad.c(set2, set);
        return new aae(set, aaq2, set2);
    }

    public static aaq b(Set set, Set set2) {
        cl.a(set, (Object)"set1");
        cl.a(set2, (Object)"set2");
        com.a.a.b.cm cm2 = cn.a(set2);
        return new aaf(set, cm2, set2);
    }

    public static aaq c(Set set, Set set2) {
        cl.a(set, (Object)"set1");
        cl.a(set2, (Object)"set2");
        com.a.a.b.cm cm2 = cn.a(cn.a(set2));
        return new aag(set, cm2, set2);
    }

    public static aaq d(Set set, Set set2) {
        cl.a(set, (Object)"set1");
        cl.a(set2, (Object)"set2");
        return aad.c(aad.a(set, set2), aad.b(set, set2));
    }

    public static Set a(Set set, com.a.a.b.cm cm2) {
        if (set instanceof SortedSet) {
            return aad.a((SortedSet)set, cm2);
        }
        if (set instanceof aal) {
            aal aal2 = (aal)set;
            com.a.a.b.cm cm3 = cn.a(aal2.b, cm2);
            return new aal((Set)aal2.a, cm3);
        }
        return new aal((Set)cl.a(set), (com.a.a.b.cm)cl.a(cm2));
    }

    public static SortedSet a(SortedSet sortedSet, com.a.a.b.cm cm2) {
        return yj.a(sortedSet, cm2);
    }

    static SortedSet b(SortedSet sortedSet, com.a.a.b.cm cm2) {
        if (sortedSet instanceof aal) {
            aal aal2 = (aal)((Object)sortedSet);
            com.a.a.b.cm cm3 = cn.a(aal2.b, cm2);
            return new aam((SortedSet)aal2.a, cm3);
        }
        return new aam((SortedSet)cl.a(sortedSet), (com.a.a.b.cm)cl.a(cm2));
    }

    public static NavigableSet a(NavigableSet navigableSet, com.a.a.b.cm cm2) {
        if (navigableSet instanceof aal) {
            aal aal2 = (aal)((Object)navigableSet);
            com.a.a.b.cm cm3 = cn.a(aal2.b, cm2);
            return new aak((NavigableSet)aal2.a, cm3);
        }
        return new aak((NavigableSet)cl.a(navigableSet), (com.a.a.b.cm)cl.a(cm2));
    }

    public static Set a(List list) {
        return aah.a(list);
    }

    public static Set a(Set ... arrset) {
        return aad.a(Arrays.asList(arrset));
    }

    public static Set a(Set set) {
        return new aao(set);
    }

    static int b(Set set) {
        int n2 = 0;
        for (Object e2 : set) {
            n2 += e2 != null ? e2.hashCode() : 0;
            n2 = ~(~n2);
        }
        return n2;
    }

    static boolean a(Set set, Object object) {
        if (set == object) {
            return true;
        }
        if (object instanceof Set) {
            Set set2 = (Set)object;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            }
            catch (NullPointerException nullPointerException) {
                return false;
            }
            catch (ClassCastException classCastException) {
                return false;
            }
        }
        return false;
    }

    public static NavigableSet a(NavigableSet navigableSet) {
        if (navigableSet instanceof me || navigableSet instanceof aat) {
            return navigableSet;
        }
        return new aat(navigableSet);
    }

    public static NavigableSet b(NavigableSet navigableSet) {
        return acu.a(navigableSet);
    }

    static boolean a(Set set, Iterator iterator) {
        boolean bl2 = false;
        while (iterator.hasNext()) {
            bl2 |= set.remove(iterator.next());
        }
        return bl2;
    }

    static boolean a(Set set, Collection collection) {
        cl.a(collection);
        if (collection instanceof xc) {
            collection = ((xc)collection).d();
        }
        if (collection instanceof Set && collection.size() > set.size()) {
            return nj.a(set.iterator(), collection);
        }
        return aad.a(set, collection.iterator());
    }
}

