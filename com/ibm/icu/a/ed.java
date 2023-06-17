/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bc;
import com.ibm.icu.d.hf;
import com.ibm.icu.d.ho;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dv;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.TreeMap;

public class ed {
    private final Map b = new HashMap();
    private Map c;
    private Map d;
    private Map e;
    public static final ed a = new ed();

    private ed() {
    }

    public dn[] a() {
        Set set = this.a(ho.a).keySet();
        dn[] arrdn = new dn[set.size()];
        int n2 = 0;
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            arrdn[n2++] = dn.a((String)iterator.next());
        }
        return arrdn;
    }

    public dn a(dn dn2, boolean[] arrbl) {
        Object object;
        String string;
        if (arrbl != null && arrbl.length > 0) {
            string = dn.k(dn2.k());
            object = this.a(ho.a);
            arrbl[0] = object.containsKey(string);
        }
        if ((string = this.a(dn2, ho.a)) == null || string.trim().length() == 0) {
            return dn.v;
        }
        object = (dn)this.c().get(string);
        if (object == null) {
            return dn.v;
        }
        return object;
    }

    private Map a(ho ho2) {
        this.d();
        return ho2 == ho.a ? this.c : this.d;
    }

    private Map c() {
        this.d();
        return this.e;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void d() {
        boolean bl2;
        TreeMap<String, String> treeMap = this;
        synchronized (treeMap) {
            bl2 = this.c != null;
        }
        if (!bl2) {
            Map<String, String> map;
            Map<String, dn> map2;
            Object object;
            try {
                String string;
                String string2;
                dv dv2;
                int n2;
                object = this.b();
                dv dv3 = ((dv)object).l("locales");
                treeMap = new TreeMap<String, String>();
                map2 = new HashMap();
                for (n2 = 0; n2 < dv3.w(); ++n2) {
                    dv2 = dv3.k(n2);
                    string2 = dv2.k();
                    string = dv2.A().intern();
                    treeMap.put(string2, string);
                    if (map2.containsKey(string)) continue;
                    map2.put(string, new dn(string2));
                }
                dv3 = ((dv)object).l("locales_ordinals");
                map = new TreeMap();
                for (n2 = 0; n2 < dv3.w(); ++n2) {
                    dv2 = dv3.k(n2);
                    string2 = dv2.k();
                    string = dv2.A().intern();
                    map.put(string2, string);
                }
            }
            catch (MissingResourceException missingResourceException) {
                treeMap = Collections.emptyMap();
                map = Collections.emptyMap();
                map2 = Collections.emptyMap();
            }
            object = this;
            synchronized (object) {
                if (this.c == null) {
                    this.c = treeMap;
                    this.d = map;
                    this.e = map2;
                }
            }
        }
    }

    public String a(dn dn2, ho ho2) {
        int n2;
        Map map = this.a(ho2);
        String string = dn.k(dn2.k());
        String string2 = null;
        while (null == (string2 = (String)map.get(string)) && (n2 = string.lastIndexOf("_")) != -1) {
            string = string.substring(0, n2);
        }
        return string2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public hf a(String string) {
        boolean bl2;
        hf hf2 = null;
        Object object = this.b;
        synchronized (object) {
            bl2 = this.b.containsKey(string);
            if (bl2) {
                hf2 = (hf)this.b.get(string);
            }
        }
        if (!bl2) {
            try {
                object = this.b();
                dv dv2 = ((dv)object).l("rules");
                dv dv3 = dv2.l(string);
                StringBuilder stringBuilder = new StringBuilder();
                for (int i2 = 0; i2 < dv3.w(); ++i2) {
                    dv dv4 = dv3.k(i2);
                    if (i2 > 0) {
                        stringBuilder.append("; ");
                    }
                    stringBuilder.append(dv4.k());
                    stringBuilder.append(": ");
                    stringBuilder.append(dv4.A());
                }
                hf2 = hf.a(stringBuilder.toString());
            }
            catch (ParseException parseException) {
            }
            catch (MissingResourceException missingResourceException) {
                // empty catch block
            }
            object = this.b;
            synchronized (object) {
                if (this.b.containsKey(string)) {
                    hf2 = (hf)this.b.get(string);
                } else {
                    this.b.put(string, hf2);
                }
            }
        }
        return hf2;
    }

    public dv b() {
        return bc.a("com/ibm/icu/impl/data/icudt51b", "plurals", bc.n, true);
    }

    public hf b(dn dn2, ho ho2) {
        String string = this.a(dn2, ho2);
        if (string == null || string.trim().length() == 0) {
            return hf.h;
        }
        hf hf2 = this.a(string);
        if (hf2 == null) {
            hf2 = hf.h;
        }
        return hf2;
    }
}

