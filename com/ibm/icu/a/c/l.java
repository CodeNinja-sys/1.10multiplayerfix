/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.c;

import com.ibm.icu.a.c.a;
import com.ibm.icu.a.c.g;
import com.ibm.icu.a.c.h;
import com.ibm.icu.a.c.i;
import com.ibm.icu.a.c.j;
import com.ibm.icu.a.c.k;
import com.ibm.icu.a.c.r;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class l {
    private SortedMap e;
    private String f;
    private static final SortedMap g = Collections.unmodifiableSortedMap(new TreeMap());
    public static final l a = new l();
    public static final l b;
    public static final l c;

    private l() {
    }

    /*
     * WARNING - void declaration
     */
    l(Map map, Set set, Map map2) {
        Object object;
        boolean bl2;
        boolean bl3 = map != null && map.size() > 0;
        boolean bl4 = set != null && set.size() > 0;
        boolean bl5 = bl2 = map2 != null && map2.size() > 0;
        if (!(bl3 || bl4 || bl2)) {
            this.e = g;
            this.f = "";
            return;
        }
        this.e = new TreeMap();
        if (bl3) {
            for (Map.Entry object2 : map.entrySet()) {
                void var10_16;
                String string;
                char r2 = com.ibm.icu.a.c.a.b(((i)object2.getKey()).a());
                String string2 = (String)object2.getValue();
                if (k.b(r2) && (string = h.h(string2)) == null) continue;
                object = new g(r2, com.ibm.icu.a.c.a.a((String)var10_16));
                this.e.put(Character.valueOf(r2), object);
            }
        }
        if (bl4 || bl2) {
            void var8_11;
            Object object4 = null;
            Object var8_9 = null;
            if (bl4) {
                object4 = new TreeSet();
                for (j j2 : set) {
                    ((TreeSet)object4).add(com.ibm.icu.a.c.a.a(j2.a()));
                }
            }
            if (bl2) {
                TreeMap<Object, String> treeMap = new TreeMap<Object, String>();
                for (Map.Entry entry : map2.entrySet()) {
                    object = com.ibm.icu.a.c.a.a(((j)entry.getKey()).a());
                    String string = com.ibm.icu.a.c.a.a((String)entry.getValue());
                    treeMap.put(object, string);
                }
            }
            r r2 = new r((SortedSet)object4, (SortedMap)var8_11);
            this.e.put(Character.valueOf('u'), r2);
        }
        if (this.e.size() == 0) {
            this.e = g;
            this.f = "";
        } else {
            this.f = l.a(this.e);
        }
    }

    public Set a() {
        return Collections.unmodifiableSet(this.e.keySet());
    }

    public g a(Character c2) {
        return (g)this.e.get(Character.valueOf(com.ibm.icu.a.c.a.b(c2.charValue())));
    }

    public String b(Character c2) {
        g g2 = (g)this.e.get(Character.valueOf(com.ibm.icu.a.c.a.b(c2.charValue())));
        if (g2 == null) {
            return null;
        }
        return g2.b();
    }

    public Set b() {
        g g2 = (g)this.e.get(Character.valueOf('u'));
        if (g2 == null) {
            return Collections.emptySet();
        }
        assert (g2 instanceof r);
        return ((r)g2).d();
    }

    public Set c() {
        g g2 = (g)this.e.get(Character.valueOf('u'));
        if (g2 == null) {
            return Collections.emptySet();
        }
        assert (g2 instanceof r);
        return ((r)g2).e();
    }

    public String a(String string) {
        g g2 = (g)this.e.get(Character.valueOf('u'));
        if (g2 == null) {
            return null;
        }
        assert (g2 instanceof r);
        return ((r)g2).a(com.ibm.icu.a.c.a.a(string));
    }

    public boolean d() {
        return this.e.isEmpty();
    }

    public static boolean a(char c2) {
        return k.a(c2) || k.b(c2);
    }

    public static boolean b(String string) {
        return r.c(string);
    }

    private static String a(SortedMap sortedMap) {
        StringBuilder stringBuilder = new StringBuilder();
        g g2 = null;
        for (Map.Entry entry : sortedMap.entrySet()) {
            char c2 = ((Character)entry.getKey()).charValue();
            g g3 = (g)entry.getValue();
            if (k.b(c2)) {
                g2 = g3;
                continue;
            }
            if (stringBuilder.length() > 0) {
                stringBuilder.append("-");
            }
            stringBuilder.append(g3);
        }
        if (g2 != null) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("-");
            }
            stringBuilder.append(g2);
        }
        return stringBuilder.toString();
    }

    public String toString() {
        return this.f;
    }

    public String e() {
        return this.f;
    }

    public int hashCode() {
        return this.f.hashCode();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof l)) {
            return false;
        }
        return this.f.equals(((l)object).f);
    }

    static {
        l.a.f = "";
        l.a.e = g;
        b = new l();
        l.b.f = "u-ca-japanese";
        l.b.e = new TreeMap();
        l.b.e.put(Character.valueOf('u'), r.c);
        c = new l();
        l.c.f = "u-nu-thai";
        l.c.e = new TreeMap();
        l.c.e.put(Character.valueOf('u'), r.d);
    }
}

