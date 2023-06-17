/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.bc;
import com.ibm.icu.util.cl;
import com.ibm.icu.util.dv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ck
implements Comparable {
    public static final int a = -1;
    private String b;
    private int c;
    private cl d;
    private ck e = null;
    private Set f = new TreeSet();
    private List g = null;
    private static boolean h = false;
    private static Map i = null;
    private static Map j = null;
    private static Map k = null;
    private static ArrayList l = null;
    private static ArrayList m = null;
    private static final String n = "ZZ";
    private static final String o = "QO";
    private static final String p = "001";

    private ck() {
    }

    private static synchronized void f() {
        int n2;
        Object object;
        Object object2;
        Object object3;
        Comparable comparable;
        Object object4;
        Object object6;
        int n3;
        if (h) {
            return;
        }
        k = new HashMap();
        i = new HashMap();
        j = new HashMap();
        m = new ArrayList(cl.values().length);
        dv dv2 = null;
        dv dv3 = null;
        dv dv4 = null;
        dv dv5 = null;
        dv dv6 = null;
        dv dv7 = null;
        dv dv8 = dv.b("com/ibm/icu/impl/data/icudt51b", "metadata", bc.n);
        dv2 = dv8.l("regionCodes");
        dv3 = dv8.l("territoryAlias");
        dv dv9 = dv.b("com/ibm/icu/impl/data/icudt51b", "supplementalData", bc.n);
        dv4 = dv9.l("codeMappings");
        dv6 = dv9.l("territoryContainment");
        dv5 = dv6.l(p);
        dv7 = dv6.l("grouping");
        String[] arrstring = dv5.u();
        List<String> list = Arrays.asList(arrstring);
        String[] arrstring2 = dv7.u();
        List<String> list2 = Arrays.asList(arrstring2);
        int n4 = dv2.w();
        l = new ArrayList(n4);
        for (n3 = 0; n3 < n4; ++n3) {
            String object52;
            object6 = new ck();
            ((ck)object6).b = object52 = dv2.j(n3);
            ((ck)object6).d = cl.b;
            i.put(object52, object6);
            if (object52.matches("[0-9]{3}")) {
                ((ck)object6).c = Integer.valueOf(object52);
                j.put(((ck)object6).c, object6);
                ((ck)object6).d = cl.e;
            } else {
                ((ck)object6).c = -1;
            }
            l.add(object6);
        }
        for (n3 = 0; n3 < dv3.w(); ++n3) {
            object6 = dv3.k(n3);
            String string = ((dv)object6).k();
            object4 = ((dv)object6).A();
            if (i.containsKey(object4) && !i.containsKey(string)) {
                k.put(string, i.get(object4));
                continue;
            }
            if (i.containsKey(string)) {
                comparable = (ck)i.get(string);
            } else {
                comparable = new ck();
                ((ck)comparable).b = string;
                i.put(string, comparable);
                if (string.matches("[0-9]{3}")) {
                    ((ck)comparable).c = Integer.valueOf(string);
                    j.put(((ck)comparable).c, comparable);
                } else {
                    ((ck)comparable).c = -1;
                }
                l.add(comparable);
            }
            ((ck)comparable).d = cl.g;
            object3 = Arrays.asList(((String)object4).split(" "));
            ((ck)comparable).g = new ArrayList();
            object2 = object3.iterator();
            while (object2.hasNext()) {
                object = (String)object2.next();
                if (!i.containsKey(object)) continue;
                ((ck)comparable).g.add(i.get(object));
            }
        }
        for (n3 = 0; n3 < dv4.w(); ++n3) {
            object6 = dv4.k(n3);
            if (((dv)object6).l() != 8) continue;
            String[] arrstring3 = ((dv)object6).u();
            object4 = arrstring3[0];
            comparable = Integer.valueOf(arrstring3[1]);
            object3 = arrstring3[2];
            if (!i.containsKey(object4)) continue;
            object2 = (ck)i.get(object4);
            ((ck)object2).c = (Integer)comparable;
            j.put(((ck)object2).c, object2);
            k.put(object3, object2);
        }
        if (i.containsKey(p)) {
            ck ck2 = (ck)i.get(p);
            ck2.d = cl.c;
        }
        if (i.containsKey(n)) {
            ck ck3 = (ck)i.get(n);
            ck3.d = cl.a;
        }
        for (String string : list) {
            if (!i.containsKey(string)) continue;
            ck ck4 = (ck)i.get(string);
            ck4.d = cl.d;
        }
        for (String string : list2) {
            if (!i.containsKey(string)) continue;
            ck ck5 = (ck)i.get(string);
            ck5.d = cl.f;
        }
        if (i.containsKey(o)) {
            ck ck6 = (ck)i.get(o);
            ck6.d = cl.e;
        }
        for (n2 = 0; n2 < dv6.w(); ++n2) {
            dv dv10 = dv6.k(n2);
            object4 = dv10.k();
            comparable = (ck)i.get(object4);
            for (int i2 = 0; i2 < dv10.w(); ++i2) {
                object2 = dv10.j(i2);
                object = (ck)i.get(object2);
                if (comparable == null || object == null) continue;
                ((ck)comparable).f.add(object);
                if (((ck)comparable).e() == cl.f) continue;
                ((ck)object).e = comparable;
            }
        }
        for (n2 = 0; n2 < cl.values().length; ++n2) {
            m.add(new TreeSet());
        }
        for (ck ck2 : l) {
            object4 = (Set)m.get(ck2.d.ordinal());
            object4.add(ck2);
            m.set(ck2.d.ordinal(), object4);
        }
        h = true;
    }

    public static ck a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        ck.f();
        ck ck2 = (ck)i.get(string);
        if (ck2 == null) {
            ck2 = (ck)k.get(string);
        }
        if (ck2 == null) {
            throw new IllegalArgumentException("Unknown region id: " + string);
        }
        if (ck2.d == cl.g && ck2.g.size() == 1) {
            ck2 = (ck)ck2.g.get(0);
        }
        return ck2;
    }

    public static ck a(int n2) {
        ck.f();
        ck ck2 = (ck)j.get(n2);
        if (ck2 == null) {
            String string = "";
            if (n2 < 10) {
                string = "00";
            } else if (n2 < 100) {
                string = "0";
            }
            String string2 = string + Integer.toString(n2);
            ck2 = (ck)k.get(string2);
        }
        if (ck2 == null) {
            throw new IllegalArgumentException("Unknown region code: " + n2);
        }
        if (ck2.d == cl.g && ck2.g.size() == 1) {
            ck2 = (ck)ck2.g.get(0);
        }
        return ck2;
    }

    public static Set a(cl cl2) {
        ck.f();
        return Collections.unmodifiableSet((Set)m.get(cl2.ordinal()));
    }

    public ck a() {
        ck.f();
        return this.e;
    }

    public ck b(cl cl2) {
        ck.f();
        if (this.e == null) {
            return null;
        }
        if (this.e.d.equals((Object)cl2)) {
            return this.e;
        }
        return this.e.b(cl2);
    }

    public Set b() {
        ck.f();
        return Collections.unmodifiableSet(this.f);
    }

    public Set c(cl cl2) {
        ck.f();
        TreeSet<ck> treeSet = new TreeSet<ck>();
        Set set = this.b();
        for (ck ck2 : set) {
            if (ck2.e() == cl2) {
                treeSet.add(ck2);
                continue;
            }
            treeSet.addAll(ck2.c(cl2));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public List c() {
        ck.f();
        if (this.d == cl.g) {
            return Collections.unmodifiableList(this.g);
        }
        return null;
    }

    public boolean a(ck ck2) {
        ck.f();
        if (this.f.contains(ck2)) {
            return true;
        }
        for (ck ck3 : this.f) {
            if (!ck3.a(ck2)) continue;
            return true;
        }
        return false;
    }

    public String toString() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public cl e() {
        return this.d;
    }

    public int b(ck ck2) {
        return this.b.compareTo(ck2.b);
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.b((ck)object);
    }
}

