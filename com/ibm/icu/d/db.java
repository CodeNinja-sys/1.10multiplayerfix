/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.aj;
import com.ibm.icu.a.bc;
import com.ibm.icu.a.ew;
import com.ibm.icu.d.cz;
import com.ibm.icu.d.dc;
import com.ibm.icu.util.az;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dv;
import com.ibm.icu.util.n;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.MissingResourceException;

public class db
implements az,
Serializable,
Cloneable {
    static final int a = 1;
    static final String[] b = new String[]{"G", "y", "M", "w", "W", "d", "D", "E", "F", "a", "h", "H", "m"};
    private static final long c = 1L;
    private static final int d = 12;
    private static String e = "fallback";
    private static String f = "latestFirst:";
    private static String g = "earliestFirst:";
    private static final aj h = new ew();
    private String i;
    private boolean j = false;
    private Map k = null;
    private transient boolean l = false;
    private transient boolean m = false;

    public db() {
        this.k = new HashMap();
        this.i = "{0} \u2013 {1}";
    }

    public db(dn dn2) {
        this.a(dn2);
    }

    private void a(dn dn2) {
        String string = dn2.toString();
        db db2 = (db)h.a(string);
        if (db2 == null) {
            this.b(dn2);
            this.m = true;
            h.a(string, ((db)this.clone()).c());
        } else {
            this.a(db2);
        }
    }

    private void a(db db2) {
        this.i = db2.i;
        this.j = db2.j;
        this.k = db2.k;
        this.m = true;
    }

    private void b(dn dn2) {
        int n2 = 19;
        this.k = new HashMap(n2);
        this.i = "{0} \u2013 {1}";
        HashSet<String> hashSet = new HashSet<String>();
        try {
            Object object;
            dn dn3 = dn2;
            Object object2 = dn2.j("calendar");
            if (object2 == null) {
                object = n.a("calendar", dn2, true);
                object2 = object[0];
            }
            if (object2 == null) {
                object2 = "gregorian";
            }
            while (((String)(object = dn3.l())).length() != 0) {
                bc bc2 = (bc)dv.a("com/ibm/icu/impl/data/icudt51b", dn3);
                bc bc3 = bc2.b("calendar/" + (String)object2 + "/intervalFormats");
                String string = bc3.f(e);
                this.a(string);
                int n3 = bc3.w();
                for (int i2 = 0; i2 < n3; ++i2) {
                    String string2 = bc3.k(i2).k();
                    if (hashSet.contains(string2)) continue;
                    hashSet.add(string2);
                    if (string2.compareTo(e) == 0) continue;
                    bc bc4 = (bc)bc3.l(string2);
                    int n4 = bc4.w();
                    for (int i3 = 0; i3 < n4; ++i3) {
                        String string3 = bc4.k(i3).k();
                        String string4 = bc4.k(i3).A();
                        int n5 = -1;
                        if (string3.compareTo(b[1]) == 0) {
                            n5 = 1;
                        } else if (string3.compareTo(b[2]) == 0) {
                            n5 = 2;
                        } else if (string3.compareTo(b[5]) == 0) {
                            n5 = 5;
                        } else if (string3.compareTo(b[9]) == 0) {
                            n5 = 9;
                        } else if (string3.compareTo(b[10]) == 0) {
                            n5 = 10;
                        } else if (string3.compareTo(b[12]) == 0) {
                            n5 = 12;
                        }
                        if (n5 == -1) continue;
                        this.a(string2, string3, string4);
                    }
                }
                try {
                    dv dv2 = bc2.l("%%Parent");
                    dn3 = new dn(dv2.A());
                }
                catch (MissingResourceException missingResourceException) {
                    dn3 = dn3.j();
                }
                if (dn3 != null && !dn3.k().equals("root")) continue;
                break;
            }
        }
        catch (MissingResourceException missingResourceException) {
            // empty catch block
        }
    }

    private static int c(String string) {
        int n2;
        boolean bl2 = false;
        char c2 = '\u0000';
        int n3 = 0;
        int[] arrn = new int[58];
        int n4 = 65;
        boolean bl3 = false;
        for (n2 = 0; n2 < string.length(); ++n2) {
            char c3 = string.charAt(n2);
            if (c3 != c2 && n3 > 0) {
                int n5 = arrn[c2 - n4];
                if (n5 != 0) {
                    bl3 = true;
                    break;
                }
                arrn[c2 - n4] = 1;
                n3 = 0;
            }
            if (c3 == '\'') {
                if (n2 + 1 < string.length() && string.charAt(n2 + 1) == '\'') {
                    ++n2;
                    continue;
                }
                bl2 = !bl2;
                continue;
            }
            if (bl2 || (c3 < 'a' || c3 > 'z') && (c3 < 'A' || c3 > 'Z')) continue;
            c2 = c3;
            ++n3;
        }
        if (n3 > 0 && !bl3 && arrn[c2 - n4] == 0) {
            n3 = 0;
        }
        return n2 - n3;
    }

    public void a(String string, int n2, String string2) {
        if (this.l) {
            throw new UnsupportedOperationException("no modification is allowed after DII is frozen");
        }
        if (n2 > 12) {
            throw new IllegalArgumentException("calendar field is larger than MINIMUM_SUPPORTED_CALENDAR_FIELD");
        }
        if (this.m) {
            this.k = db.a(this.k);
            this.m = false;
        }
        dc dc2 = this.a(string, b[n2], string2);
        if (n2 == 11) {
            this.a(string, b[9], dc2);
            this.a(string, b[10], dc2);
        } else if (n2 == 5 || n2 == 7) {
            this.a(string, b[5], dc2);
        }
    }

    private dc a(String string, String string2, String string3) {
        int n2;
        HashMap<String, dc> hashMap = (HashMap<String, dc>)this.k.get(string);
        boolean bl2 = false;
        if (hashMap == null) {
            hashMap = new HashMap<String, dc>();
            bl2 = true;
        }
        boolean bl3 = this.j;
        if (string3.startsWith(f)) {
            bl3 = true;
            n2 = f.length();
            string3 = string3.substring(n2, string3.length());
        } else if (string3.startsWith(g)) {
            bl3 = false;
            n2 = g.length();
            string3 = string3.substring(n2, string3.length());
        }
        dc dc2 = db.a(string3, bl3);
        hashMap.put(string2, dc2);
        if (bl2) {
            this.k.put(string, hashMap);
        }
        return dc2;
    }

    private void a(String string, String string2, dc dc2) {
        Map map = (Map)this.k.get(string);
        map.put(string2, dc2);
    }

    static dc a(String string, boolean bl2) {
        int n2 = db.c(string);
        String string2 = string.substring(0, n2);
        String string3 = null;
        if (n2 < string.length()) {
            string3 = string.substring(n2, string.length());
        }
        return new dc(string2, string3, bl2);
    }

    public dc a(String string, int n2) {
        dc dc2;
        if (n2 > 12) {
            throw new IllegalArgumentException("no support for field less than MINUTE");
        }
        Map map = (Map)this.k.get(string);
        if (map != null && (dc2 = (dc)map.get(b[n2])) != null) {
            return dc2;
        }
        return null;
    }

    public String a() {
        return this.i;
    }

    public void a(String string) {
        if (this.l) {
            throw new UnsupportedOperationException("no modification is allowed after DII is frozen");
        }
        int n2 = string.indexOf("{0}");
        int n3 = string.indexOf("{1}");
        if (n2 == -1 || n3 == -1) {
            throw new IllegalArgumentException("no pattern {0} or pattern {1} in fallbackPattern");
        }
        if (n2 > n3) {
            this.j = true;
        }
        this.i = string;
    }

    public boolean b() {
        return this.j;
    }

    public Object clone() {
        if (this.l) {
            return this;
        }
        return this.g();
    }

    private Object g() {
        try {
            db db2 = (db)super.clone();
            db2.i = this.i;
            db2.j = this.j;
            if (this.m) {
                db2.k = this.k;
                db2.m = true;
            } else {
                db2.k = db.a(this.k);
                db2.m = false;
            }
            db2.l = false;
            return db2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException("clone is not supported");
        }
    }

    private static Map a(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            String string = (String)entry.getKey();
            Map map2 = (Map)entry.getValue();
            HashMap<String, dc> hashMap2 = new HashMap<String, dc>();
            for (Map.Entry entry2 : map2.entrySet()) {
                String string2 = (String)entry2.getKey();
                dc dc2 = (dc)entry2.getValue();
                hashMap2.put(string2, dc2);
            }
            hashMap.put(string, hashMap2);
        }
        return hashMap;
    }

    public boolean f() {
        return this.l;
    }

    public db c() {
        this.l = true;
        this.m = true;
        return this;
    }

    public db d() {
        db db2 = (db)this.g();
        return db2;
    }

    static void a(String string, int[] arrn) {
        int n2 = 65;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            int n3 = string.charAt(i2) - n2;
            arrn[n3] = arrn[n3] + 1;
        }
    }

    private static boolean a(int n2, int n3, char c2) {
        return c2 == 'M' && (n2 <= 2 && n3 > 2 || n2 > 2 && n3 <= 2);
    }

    cz b(String string) {
        String string2 = string;
        int[] arrn = new int[58];
        int[] arrn2 = new int[58];
        int n2 = 4096;
        int n3 = 256;
        int n4 = 65;
        boolean bl2 = false;
        if (string.indexOf(122) != -1) {
            string = string.replace('z', 'v');
            bl2 = true;
        }
        db.a(string, arrn);
        int n5 = Integer.MAX_VALUE;
        int n6 = 0;
        for (String string3 : this.k.keySet()) {
            int n7;
            for (n7 = 0; n7 < arrn2.length; ++n7) {
                arrn2[n7] = 0;
            }
            db.a(string3, arrn2);
            n7 = 0;
            int n8 = 1;
            for (int i2 = 0; i2 < arrn.length; ++i2) {
                int n9 = arrn[i2];
                int n10 = arrn2[i2];
                if (n9 == n10) continue;
                if (n9 == 0) {
                    n8 = -1;
                    n7 += 4096;
                    continue;
                }
                if (n10 == 0) {
                    n8 = -1;
                    n7 += 4096;
                    continue;
                }
                if (db.a(n9, n10, (char)(i2 + 65))) {
                    n7 += 256;
                    continue;
                }
                n7 += Math.abs(n9 - n10);
            }
            if (n7 < n5) {
                string2 = string3;
                n5 = n7;
                n6 = n8;
            }
            if (n7 != 0) continue;
            n6 = 0;
            break;
        }
        if (bl2 && n6 != -1) {
            n6 = 2;
        }
        return new cz(string2, n6);
    }

    public boolean equals(Object object) {
        if (object instanceof db) {
            db db2 = (db)object;
            return ((Object)this.k).equals(db2.k);
        }
        return false;
    }

    public int hashCode() {
        return ((Object)this.k).hashCode();
    }

    public Map e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.k.entrySet()) {
            linkedHashMap.put(entry.getKey(), new LinkedHashSet(((Map)entry.getValue()).keySet()));
        }
        return linkedHashMap;
    }

    public /* synthetic */ Object i() {
        return this.d();
    }

    public /* synthetic */ Object j() {
        return this.c();
    }
}

