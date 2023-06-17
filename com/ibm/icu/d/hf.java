/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.eb;
import com.ibm.icu.a.ed;
import com.ibm.icu.a.jd;
import com.ibm.icu.d.hg;
import com.ibm.icu.d.hh;
import com.ibm.icu.d.hi;
import com.ibm.icu.d.hk;
import com.ibm.icu.d.hl;
import com.ibm.icu.d.hm;
import com.ibm.icu.d.hn;
import com.ibm.icu.d.ho;
import com.ibm.icu.d.hp;
import com.ibm.icu.d.hr;
import com.ibm.icu.d.hs;
import com.ibm.icu.d.ht;
import com.ibm.icu.util.cd;
import com.ibm.icu.util.dn;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class hf
implements Serializable {
    private static final long i = 1L;
    private final ht j;
    private final Set k;
    private int l;
    private transient int m;
    private transient Map n;
    private transient Map o;
    public static final String a = "zero";
    public static final String b = "one";
    public static final String c = "two";
    public static final String d = "few";
    public static final String e = "many";
    public static final String f = "other";
    public static final double g = -0.00123456777;
    private static final hl p = new hg();
    private static final hr q = new hh();
    public static final hf h = new hf(new hs(q));

    public static hf a(String string) {
        if ((string = string.trim()).length() == 0) {
            return h;
        }
        return new hf(hf.h(string));
    }

    public static hf b(String string) {
        try {
            return hf.a(string);
        }
        catch (ParseException parseException) {
            return null;
        }
    }

    private static hl f(String string) {
        string = string.trim().toLowerCase(Locale.ENGLISH);
        hl hl2 = null;
        String[] arrstring = jd.a(string, "or");
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            hl hl3 = null;
            String[] arrstring2 = jd.a(arrstring[i2], "and");
            for (int i3 = 0; i3 < arrstring2.length; ++i3) {
                String string2;
                hl hl4 = p;
                String string3 = arrstring2[i3].trim();
                String[] arrstring3 = jd.j(string3);
                int n2 = 0;
                boolean bl2 = true;
                boolean bl3 = true;
                long l2 = Long.MAX_VALUE;
                long l3 = Long.MIN_VALUE;
                long[] arrl = null;
                boolean bl4 = false;
                int n3 = 0;
                if (!"n".equals(string2 = arrstring3[n3++])) {
                    throw hf.a(string2, string3);
                }
                if (n3 < arrstring3.length) {
                    if ("mod".equals(string2 = arrstring3[n3++])) {
                        n2 = Integer.parseInt(arrstring3[n3++]);
                        string2 = hf.a(arrstring3, n3++, string3);
                    }
                    if ("is".equals(string2)) {
                        if ("not".equals(string2 = hf.a(arrstring3, n3++, string3))) {
                            bl2 = false;
                            string2 = hf.a(arrstring3, n3++, string3);
                        }
                    } else {
                        bl4 = true;
                        if ("not".equals(string2)) {
                            bl2 = false;
                            string2 = hf.a(arrstring3, n3++, string3);
                        }
                        if ("in".equals(string2)) {
                            string2 = hf.a(arrstring3, n3++, string3);
                        } else if ("within".equals(string2)) {
                            bl3 = false;
                            string2 = hf.a(arrstring3, n3++, string3);
                        } else {
                            throw hf.a(string2, string3);
                        }
                    }
                    if (bl4) {
                        String[] arrstring4 = jd.a(string2, ",");
                        arrl = new long[arrstring4.length * 2];
                        int n4 = 0;
                        int n5 = 0;
                        while (n4 < arrstring4.length) {
                            long l4;
                            long l5;
                            String string4 = arrstring4[n4];
                            String[] arrstring5 = jd.a(string4, "..");
                            if (arrstring5.length == 2) {
                                l5 = Long.parseLong(arrstring5[0]);
                                if (l5 > (l4 = Long.parseLong(arrstring5[1]))) {
                                    throw hf.a(string4, string3);
                                }
                            } else if (arrstring5.length == 1) {
                                l5 = l4 = Long.parseLong(arrstring5[0]);
                            } else {
                                throw hf.a(string4, string3);
                            }
                            arrl[n5] = l5;
                            arrl[n5 + 1] = l4;
                            l2 = Math.min(l2, l5);
                            l3 = Math.max(l3, l4);
                            ++n4;
                            n5 += 2;
                        }
                        if (arrl.length == 2) {
                            arrl = null;
                        }
                    } else {
                        l2 = l3 = Long.parseLong(string2);
                    }
                    if (n3 != arrstring3.length) {
                        throw hf.a(arrstring3[n3], string3);
                    }
                    hl4 = new hp(n2, bl2, bl3, l2, l3, arrl);
                }
                hl3 = hl3 == null ? hl4 : new hi(hl3, hl4);
            }
            hl2 = hl2 == null ? hl3 : new hn(hl2, hl3);
        }
        return hl2;
    }

    private static ParseException a(String string, String string2) {
        return new ParseException("unexpected token '" + string + "' in '" + string2 + "'", -1);
    }

    private static String a(String[] arrstring, int n2, String string) {
        if (n2 < arrstring.length) {
            return arrstring[n2];
        }
        throw new ParseException("missing token at end of '" + string + "'", -1);
    }

    private static hr g(String string) {
        int n2 = string.indexOf(58);
        if (n2 == -1) {
            throw new ParseException("missing ':' in rule description '" + string + "'", 0);
        }
        String string2 = string.substring(0, n2).trim();
        if (!hf.i(string2)) {
            throw new ParseException("keyword '" + string2 + " is not valid", 0);
        }
        if ((string = string.substring(n2 + 1).trim()).length() == 0) {
            throw new ParseException("missing constraint in '" + string + "'", n2 + 1);
        }
        hl hl2 = hf.f(string);
        hk hk2 = new hk(string2, hl2);
        return hk2;
    }

    private static hs h(String string) {
        hs hs2 = null;
        String[] arrstring = jd.a(string, ';');
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            hr hr2 = hf.g(arrstring[i2].trim());
            hs2 = hs2 == null ? new hs(hr2) : hs2.a(hr2);
        }
        return hs2;
    }

    public static hf a(dn dn2) {
        return ed.a.b(dn2, ho.a);
    }

    public static hf a(dn dn2, ho ho2) {
        return ed.a.b(dn2, ho2);
    }

    private static boolean i(String string) {
        return eb.a((CharSequence)string);
    }

    private hf(ht ht2) {
        this.j = ht2;
        this.k = Collections.unmodifiableSet(ht2.a());
    }

    public String a(double d2) {
        return this.j.a(d2);
    }

    public Set a() {
        return this.k;
    }

    public double c(String string) {
        Collection collection = this.d(string);
        if (collection != null && collection.size() == 1) {
            return (Double)collection.iterator().next();
        }
        return -0.00123456777;
    }

    public Collection d(String string) {
        if (!this.k.contains(string)) {
            return Collections.emptyList();
        }
        Collection collection = (Collection)this.d().get(string);
        if (collection.size() > 2 && !((Boolean)this.c().get(string)).booleanValue()) {
            return null;
        }
        return collection;
    }

    public Collection e(String string) {
        if (!this.k.contains(string)) {
            return null;
        }
        return (Collection)this.d().get(string);
    }

    private Map c() {
        this.e();
        return this.o;
    }

    private Map d() {
        this.e();
        return this.n;
    }

    private synchronized void e() {
        if (this.n == null) {
            int n2 = 3;
            HashMap<String, Boolean> hashMap = new HashMap<String, Boolean>();
            for (String string : this.k) {
                hashMap.put(string, this.j.a(string));
            }
            this.o = hashMap;
            HashMap hashMap2 = new HashMap();
            int n3 = this.k.size();
            int n4 = Math.max(5, this.f() * 3) * 2;
            for (int i2 = 0; n3 > 0 && i2 < n4; ++i2) {
                double d2 = (double)i2 / 2.0;
                String string = this.a(d2);
                boolean bl2 = (Boolean)this.o.get(string);
                ArrayList<Double> arrayList = (ArrayList<Double>)hashMap2.get(string);
                if (arrayList == null) {
                    arrayList = new ArrayList<Double>(3);
                    hashMap2.put(string, arrayList);
                } else if (!bl2 && arrayList.size() == 3) continue;
                arrayList.add(d2);
                if (bl2 || arrayList.size() != 3) continue;
                --n3;
            }
            if (n3 > 0) {
                for (String string : this.k) {
                    if (hashMap2.containsKey(string)) continue;
                    hashMap2.put(string, Collections.emptyList());
                    if (--n3 != 0) continue;
                    break;
                }
            }
            for (Map.Entry entry : hashMap2.entrySet()) {
                hashMap2.put(entry.getKey(), Collections.unmodifiableList((List)entry.getValue()));
            }
            this.n = hashMap2;
        }
    }

    public static dn[] b() {
        return ed.a.a();
    }

    public static dn a(dn dn2, boolean[] arrbl) {
        return ed.a.a(dn2, arrbl);
    }

    public String toString() {
        return "keywords: " + this.k + " limit: " + this.f() + " rules: " + this.j.toString();
    }

    public int hashCode() {
        if (this.m == 0) {
            int n2 = ((Object)this.k).hashCode();
            for (int i2 = 0; i2 < 12; ++i2) {
                n2 = n2 * 31 + this.a(i2).hashCode();
            }
            if (n2 == 0) {
                n2 = 1;
            }
            this.m = n2;
        }
        return this.m;
    }

    public boolean equals(Object object) {
        return object instanceof hf && this.a((hf)object);
    }

    public boolean a(hf hf2) {
        if (hf2 == null) {
            return false;
        }
        if (hf2 == this) {
            return true;
        }
        if (this.hashCode() != hf2.hashCode()) {
            return false;
        }
        if (!((Object)hf2.a()).equals(this.k)) {
            return false;
        }
        int n2 = Math.max(this.f(), hf2.f());
        for (int i2 = 0; i2 < n2 * 2; ++i2) {
            if (this.a(i2).equals(hf2.a(i2))) continue;
            return false;
        }
        return true;
    }

    private int f() {
        if (this.l == 0) {
            this.l = this.j.b() + 1;
        }
        return this.l;
    }

    public hm a(String string, int n2, Set set, cd cd2) {
        if (cd2 != null) {
            cd2.a = null;
        }
        if (!this.j.a().contains(string)) {
            return hm.a;
        }
        Collection collection = this.d(string);
        if (collection == null) {
            return hm.e;
        }
        int n3 = collection.size();
        if (set == null) {
            set = Collections.emptySet();
        }
        if (n3 > set.size()) {
            if (n3 == 1) {
                if (cd2 != null) {
                    cd2.a = collection.iterator().next();
                }
                return hm.c;
            }
            return hm.d;
        }
        HashSet hashSet = new HashSet(collection);
        for (Double d2 : set) {
            hashSet.remove(d2 - (double)n2);
        }
        if (hashSet.size() == 0) {
            return hm.b;
        }
        if (cd2 != null && hashSet.size() == 1) {
            cd2.a = hashSet.iterator().next();
        }
        return n3 == 1 ? hm.c : hm.d;
    }
}

