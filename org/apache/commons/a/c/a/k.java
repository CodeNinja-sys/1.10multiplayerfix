/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.apache.commons.a.c.a.aa;
import org.apache.commons.a.c.a.af;
import org.apache.commons.a.c.a.b;
import org.apache.commons.a.c.a.h;
import org.apache.commons.a.c.a.j;
import org.apache.commons.a.c.a.m;
import org.apache.commons.a.c.a.n;
import org.apache.commons.a.c.a.p;

public class k {
    private static final Map a = new EnumMap(j.class);
    private static final int b = 20;
    private final b c;
    private final j d;
    private final af e;
    private final boolean f;
    private final int g;

    private static String a(Iterable iterable, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = iterable.iterator();
        if (iterator.hasNext()) {
            stringBuilder.append((String)iterator.next());
        }
        while (iterator.hasNext()) {
            stringBuilder.append(string).append((String)iterator.next());
        }
        return stringBuilder.toString();
    }

    public k(j j2, af af2, boolean bl2) {
        this(j2, af2, bl2, 20);
    }

    public k(j j2, af af2, boolean bl2, int n2) {
        if (af2 == af.c) {
            throw new IllegalArgumentException("ruleType must not be " + (Object)((Object)af.c));
        }
        this.d = j2;
        this.e = af2;
        this.f = bl2;
        this.c = org.apache.commons.a.c.a.b.a(j2);
        this.g = n2;
    }

    private m a(m m2, Map map) {
        if (map == null) {
            throw new NullPointerException("finalRules can not be null");
        }
        if (map.isEmpty()) {
            return m2;
        }
        TreeSet treeSet = new TreeSet(aa.a);
        for (aa aa2 : m2.a()) {
            m m3 = m.a(aa2.a());
            String string = aa2.c().toString();
            int n2 = 0;
            while (n2 < string.length()) {
                n n3 = new n(map, string, m3, n2, this.g).c();
                boolean bl2 = n3.d();
                m3 = n3.b();
                if (!bl2) {
                    m3.a(string.subSequence(n2, n2 + 1));
                }
                n2 = n3.a();
            }
            treeSet.addAll(m3.a());
        }
        return new m(treeSet, null);
    }

    public String a(String string) {
        h h2 = this.c.b(string);
        return this.a(string, h2);
    }

    public String a(String string, h h2) {
        Object object;
        Object object2;
        Object object3;
        Object object42;
        Map map = p.b(this.d, af.c, h2);
        Map map2 = p.b(this.d, this.e, "common");
        Map map3 = p.b(this.d, this.e, h2);
        string = string.toLowerCase(Locale.ENGLISH).replace('-', ' ').trim();
        if (this.d == j.b) {
            if (string.length() >= 2 && string.substring(0, 2).equals("d'")) {
                String string2 = string.substring(2);
                String string3 = "d" + string2;
                return "(" + this.a(string2) + ")-(" + this.a(string3) + ")";
            }
            for (Object object42 : (Set)a.get((Object)this.d)) {
                if (!string.startsWith((String)object42 + " ")) continue;
                String string4 = string.substring(((String)object42).length() + 1);
                String string5 = (String)object42 + string4;
                return "(" + this.a(string4) + ")-(" + this.a(string5) + ")";
            }
        }
        List<String> list = Arrays.asList(string.split("\\s+"));
        object42 = new ArrayList();
        switch (this.d) {
            case c: {
                object3 = list.iterator();
                while (object3.hasNext()) {
                    object2 = (String)object3.next();
                    object = ((String)object2).split("'");
                    String string6 = object[((String[])object).length - 1];
                    object42.add(string6);
                }
                object42.removeAll((Collection)a.get((Object)this.d));
                break;
            }
            case a: {
                object42.addAll(list);
                object42.removeAll((Collection)a.get((Object)this.d));
                break;
            }
            case b: {
                object42.addAll(list);
                break;
            }
            default: {
                throw new IllegalStateException("Unreachable case: " + (Object)((Object)this.d));
            }
        }
        if (this.f) {
            string = k.a((Iterable)object42, " ");
        } else if (object42.size() == 1) {
            string = (String)list.iterator().next();
        } else {
            object3 = new StringBuilder();
            object2 = object42.iterator();
            while (object2.hasNext()) {
                object = (String)object2.next();
                ((StringBuilder)object3).append("-").append(this.a((String)object));
            }
            return ((StringBuilder)object3).substring(1);
        }
        object3 = m.a(h2);
        int n2 = 0;
        while (n2 < string.length()) {
            object = new n(map, string, (m)object3, n2, this.g).c();
            n2 = ((n)object).a();
            object3 = ((n)object).b();
        }
        object3 = this.a((m)object3, map2);
        object3 = this.a((m)object3, map3);
        return ((m)object3).b();
    }

    public b a() {
        return this.c;
    }

    public j b() {
        return this.d;
    }

    public af c() {
        return this.e;
    }

    public boolean d() {
        return this.f;
    }

    public int e() {
        return this.g;
    }

    static {
        a.put(j.a, Collections.unmodifiableSet(new HashSet<String>(Arrays.asList("bar", "ben", "da", "de", "van", "von"))));
        a.put(j.c, Collections.unmodifiableSet(new HashSet<String>(Arrays.asList("al", "el", "da", "dal", "de", "del", "dela", "de la", "della", "des", "di", "do", "dos", "du", "van", "von"))));
        a.put(j.b, Collections.unmodifiableSet(new HashSet<String>(Arrays.asList("da", "dal", "de", "del", "dela", "de la", "della", "des", "di", "do", "dos", "du", "van", "von"))));
    }
}

