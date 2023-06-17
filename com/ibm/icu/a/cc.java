/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ar;
import com.ibm.icu.a.ax;
import com.ibm.icu.a.az;
import com.ibm.icu.a.bb;
import com.ibm.icu.a.cd;
import com.ibm.icu.a.ce;
import com.ibm.icu.a.cf;
import com.ibm.icu.a.cg;
import com.ibm.icu.a.ch;
import com.ibm.icu.a.ci;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EventListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class cc
extends ax {
    protected final String a;
    private static final boolean b = ar.b("service");
    private final az c = new az();
    private final List d = new ArrayList();
    private int e = 0;
    private SoftReference f;
    private SoftReference g;
    private cg h;

    public cc() {
        this.a = "";
    }

    public cc(String string) {
        this.a = string;
    }

    public Object b(String string) {
        return this.a(this.a(string), null);
    }

    public Object a(String string, String[] arrstring) {
        if (string == null) {
            throw new NullPointerException("descriptor must not be null");
        }
        return this.a(this.a(string), arrstring);
    }

    public Object a(cf cf2) {
        return this.a(cf2, null);
    }

    public Object a(cf cf2, String[] arrstring) {
        return this.a(cf2, arrstring, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object a(cf cf2, String[] arrstring, ce ce2) {
        if (this.d.size() == 0) {
            return this.b(cf2, arrstring);
        }
        if (b) {
            System.out.println("Service: " + this.a + " key: " + cf2.c());
        }
        cd cd2 = null;
        if (cf2 != null) {
            try {
                int n2;
                this.c.d();
                Map<String, cd> map = null;
                SoftReference softReference = this.f;
                if (softReference != null) {
                    if (b) {
                        System.out.println("Service " + this.a + " ref exists");
                    }
                    map = (Map<String, cd>)softReference.get();
                }
                if (map == null) {
                    if (b) {
                        System.out.println("Service " + this.a + " cache was empty");
                    }
                    map = Collections.synchronizedMap(new HashMap());
                    softReference = new SoftReference(map);
                }
                String string = null;
                ArrayList<String> arrayList = null;
                boolean bl2 = false;
                int n3 = 0;
                int n4 = 0;
                int n5 = this.d.size();
                boolean bl3 = true;
                if (ce2 != null) {
                    for (n2 = 0; n2 < n5; ++n2) {
                        if (ce2 != this.d.get(n2)) continue;
                        n4 = n2 + 1;
                        break;
                    }
                    if (n4 == 0) {
                        throw new IllegalStateException("Factory " + ce2 + "not registered with service: " + this);
                    }
                    bl3 = false;
                }
                block4: do {
                    string = cf2.e();
                    if (b) {
                        System.out.println(this.a + "[" + n3++ + "] looking for: " + string);
                    }
                    if ((cd2 = (cd)map.get(string)) != null) {
                        if (!b) break;
                        System.out.println(this.a + " found with descriptor: " + string);
                        break;
                    }
                    if (b) {
                        System.out.println("did not find: " + string + " in cache");
                    }
                    bl2 = bl3;
                    n2 = n4;
                    while (n2 < n5) {
                        Object object;
                        ce object2 = (ce)this.d.get(n2++);
                        if (b) {
                            System.out.println("trying factory[" + (n2 - 1) + "] " + object2.toString());
                        }
                        if ((object = object2.a(cf2, this)) != null) {
                            cd2 = new cd(string, object);
                            if (!b) break block4;
                            System.out.println(this.a + " factory supported: " + string + ", caching");
                            break block4;
                        }
                        if (!b) continue;
                        System.out.println("factory did not support: " + string);
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList<String>(5);
                    }
                    arrayList.add(string);
                } while (cf2.h());
                if (cd2 != null) {
                    if (bl2) {
                        if (b) {
                            System.out.println("caching '" + cd2.a + "'");
                        }
                        map.put(cd2.a, cd2);
                        if (arrayList != null) {
                            for (String string2 : arrayList) {
                                if (b) {
                                    System.out.println(this.a + " adding descriptor: '" + string2 + "' for actual: '" + cd2.a + "'");
                                }
                                map.put(string2, cd2);
                            }
                        }
                        this.f = softReference;
                    }
                    if (arrstring != null) {
                        arrstring[0] = cd2.a.indexOf("/") == 0 ? cd2.a.substring(1) : cd2.a;
                    }
                    if (b) {
                        System.out.println("found in service: " + this.a);
                    }
                    Object object = cd2.b;
                    return object;
                }
            }
            finally {
                this.c.e();
            }
        }
        if (b) {
            System.out.println("not found in service: " + this.a);
        }
        return this.b(cf2, arrstring);
    }

    protected Object b(cf cf2, String[] arrstring) {
        return null;
    }

    public Set e() {
        return this.c((String)null);
    }

    public Set c(String string) {
        Set set = this.a().keySet();
        cf cf2 = this.a(string);
        if (cf2 != null) {
            HashSet hashSet = new HashSet(set.size());
            for (String string2 : set) {
                if (!cf2.a(string2)) continue;
                hashSet.add(string2);
            }
            set = hashSet;
        }
        return set;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Map a() {
        Map map = null;
        SoftReference softReference = this.g;
        if (softReference != null) {
            map = (HashMap)softReference.get();
        }
        while (map == null) {
            cc cc2 = this;
            synchronized (cc2) {
                if (softReference == this.g || this.g == null) {
                    try {
                        this.c.d();
                        map = new HashMap();
                        ListIterator listIterator = this.d.listIterator(this.d.size());
                        while (listIterator.hasPrevious()) {
                            ce ce2 = (ce)listIterator.previous();
                            ce2.a(map);
                        }
                        map = Collections.unmodifiableMap(map);
                        this.g = new SoftReference(map);
                    }
                    finally {
                        this.c.e();
                    }
                } else {
                    softReference = this.g;
                    map = (Map)softReference.get();
                }
            }
        }
        return map;
    }

    public String d(String string) {
        return this.a(string, dn.a(dr.a));
    }

    public String a(String string, dn dn2) {
        Map map = this.a();
        ce ce2 = (ce)map.get(string);
        if (ce2 != null) {
            return ce2.a(string, dn2);
        }
        cf cf2 = this.a(string);
        while (cf2.h()) {
            ce2 = (ce)map.get(cf2.d());
            if (ce2 == null) continue;
            return ce2.a(string, dn2);
        }
        return null;
    }

    public SortedMap f() {
        dn dn2 = dn.a(dr.a);
        return this.a(dn2, null, null);
    }

    public SortedMap b(dn dn2) {
        return this.a(dn2, null, null);
    }

    public SortedMap a(dn dn2, Comparator comparator) {
        return this.a(dn2, comparator, null);
    }

    public SortedMap a(dn dn2, String string) {
        return this.a(dn2, null, string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public SortedMap a(dn dn2, Comparator comparator, String string) {
        Map map;
        Object object;
        SortedMap<String, String> sortedMap = null;
        cg cg2 = this.h;
        if (cg2 != null) {
            sortedMap = cg2.a(dn2, comparator);
        }
        while (sortedMap == null) {
            object = this;
            synchronized (object) {
                if (cg2 == this.h || this.h == null) {
                    sortedMap = new TreeMap(comparator);
                    map = this.a();
                    for (Map.Entry entry : map.entrySet()) {
                        String string2 = (String)entry.getKey();
                        ce ce2 = (ce)entry.getValue();
                        sortedMap.put(ce2.a(string2, dn2), string2);
                    }
                    sortedMap = Collections.unmodifiableSortedMap(sortedMap);
                    this.h = new cg(sortedMap, dn2, comparator);
                } else {
                    cg2 = this.h;
                    sortedMap = cg2.a(dn2, comparator);
                }
            }
        }
        object = this.a(string);
        if (object == null) {
            return sortedMap;
        }
        map = new TreeMap(sortedMap);
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry;
            entry = iterator.next();
            if (((cf)object).a((String)entry.getValue())) continue;
            iterator.remove();
        }
        return map;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final List g() {
        try {
            this.c.d();
            ArrayList arrayList = new ArrayList(this.d);
            return arrayList;
        }
        finally {
            this.c.e();
        }
    }

    public ce a(Object object, String string) {
        return this.a(object, string, true);
    }

    public ce a(Object object, String string, boolean bl2) {
        String string2 = this.a(string).c();
        return this.a(new ci(object, string2, bl2));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final ce a(ce ce2) {
        if (ce2 == null) {
            throw new NullPointerException();
        }
        try {
            this.c.f();
            this.d.add(0, ce2);
            this.l();
        }
        finally {
            this.c.g();
        }
        this.d();
        return ce2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final boolean b(ce ce2) {
        if (ce2 == null) {
            throw new NullPointerException();
        }
        boolean bl2 = false;
        try {
            this.c.f();
            if (this.d.remove(ce2)) {
                bl2 = true;
                this.l();
            }
        }
        finally {
            this.c.g();
        }
        if (bl2) {
            this.d();
        }
        return bl2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void h() {
        try {
            this.c.f();
            this.i();
            this.l();
        }
        finally {
            this.c.g();
        }
        this.d();
    }

    protected void i() {
        this.d.clear();
    }

    public boolean j() {
        return this.d.size() == this.e;
    }

    protected void k() {
        this.e = this.d.size();
    }

    public cf a(String string) {
        return string == null ? null : new cf(string);
    }

    protected void l() {
        this.f = null;
        this.g = null;
        this.h = null;
    }

    protected void m() {
        this.f = null;
    }

    protected boolean c(EventListener eventListener) {
        return eventListener instanceof ch;
    }

    protected void d(EventListener eventListener) {
        ((ch)eventListener).a(this);
    }

    public String n() {
        bb bb2 = this.c.a();
        if (bb2 != null) {
            return bb2.toString();
        }
        return "no stats";
    }

    public String o() {
        return this.a;
    }

    public String toString() {
        return super.toString() + "{" + this.a + "}";
    }
}

