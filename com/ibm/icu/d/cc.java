/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.aj;
import com.ibm.icu.a.bc;
import com.ibm.icu.a.ew;
import com.ibm.icu.d.ce;
import com.ibm.icu.d.cf;
import com.ibm.icu.d.cg;
import com.ibm.icu.d.ch;
import com.ibm.icu.d.dm;
import com.ibm.icu.d.do;
import com.ibm.icu.d.gz;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dv;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;

class cc {
    private static final String c = "short";
    private static final String d = "long";
    private static final String e = "NumberElements";
    private static final String f = "patternsLong/decimalFormat";
    private static final String g = "patternsShort/decimalFormat";
    static final String a = "other";
    static final int b = 15;
    private static final String h = "latn";
    private final aj i = new ew();

    cc() {
    }

    cf a(dn dn2) {
        cf cf2 = (cf)this.i.a(dn2);
        if (cf2 == null) {
            cf2 = cc.b(dn2);
            this.i.a(dn2, cf2);
        }
        return cf2;
    }

    private static cf b(dn dn2) {
        Object object;
        gz gz2 = gz.a(dn2);
        bc bc2 = (bc)dv.a("com/ibm/icu/impl/data/icudt51b", dn2);
        bc2 = bc2.b(e);
        String string = gz2.e();
        bc bc3 = null;
        bc bc4 = null;
        if (!h.equals(string)) {
            object = cc.a(bc2, string, ch.b);
            bc3 = cc.a((bc)object, g, ch.b);
            bc4 = cc.a((bc)object, f, ch.b);
        }
        if (bc3 == null) {
            object = cc.b(bc2, h, ch.a);
            bc3 = cc.b((bc)object, g, ch.a);
            if (bc4 == null && (bc4 = cc.a((bc)object, f, ch.a)) != null && cc.a(bc4) && !cc.a(bc3)) {
                bc4 = null;
            }
        }
        object = cc.a(bc3, dn2, c);
        Object object2 = bc4 == null ? object : cc.a(bc4, dn2, d);
        return new cf((ce)object, (ce)object2);
    }

    private static bc a(bc bc2, String string, ch ch2) {
        if (bc2 == null) {
            return null;
        }
        bc bc3 = bc2.e(string);
        if (bc3 == null) {
            return null;
        }
        switch (ch2) {
            case b: {
                return cc.a(bc3) ? null : bc3;
            }
            case a: {
                return bc3;
            }
        }
        throw new IllegalArgumentException();
    }

    private static bc b(bc bc2, String string, ch ch2) {
        bc bc3 = cc.a(bc2, string, ch2);
        if (bc3 == null) {
            throw new MissingResourceException("Cannot find " + string, bc.class.getName(), string);
        }
        return bc3;
    }

    private static boolean a(bc bc2) {
        dn dn2 = bc2.i();
        return dn2.equals(dn.v) || dn2.toString().equals("root");
    }

    private static ce a(bc bc2, dn dn2, String string) {
        int n2 = bc2.w();
        ce ce2 = new ce(new long[15], new HashMap());
        for (int i2 = 0; i2 < n2; ++i2) {
            cc.a(bc2.k(i2), dn2, string, ce2);
        }
        cc.a(ce2);
        return ce2;
    }

    private static void a(dv dv2, dn dn2, String string, ce ce2) {
        long l2 = Long.parseLong(dv2.k());
        int n2 = (int)Math.log10(l2);
        if (n2 >= 15) {
            return;
        }
        int n3 = dv2.w();
        int n4 = 0;
        boolean bl2 = false;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n5;
            dv dv3 = dv2.k(i2);
            String string2 = dv3.k();
            String string3 = dv3.A();
            if (string2.equals(a)) {
                bl2 = true;
            }
            if ((n5 = cc.a(string2, n2, string3, dn2, string, ce2)) == n4) continue;
            if (n4 != 0) {
                throw new IllegalArgumentException("Plural variant '" + string2 + "' template '" + string3 + "' for 10^" + n2 + " has wrong number of zeros in " + cc.a(dn2, string));
            }
            n4 = n5;
        }
        if (!bl2) {
            throw new IllegalArgumentException("No 'other' plural variant defined for 10^" + n2 + "in " + cc.a(dn2, string));
        }
        long l3 = l2;
        for (int i3 = 1; i3 < n4; ++i3) {
            l3 /= 10L;
        }
        ce2.a[n2] = l3;
    }

    private static int a(String string, int n2, String string2, dn dn2, String string3, ce ce2) {
        int n3;
        int n4 = string2.indexOf("0");
        int n5 = string2.lastIndexOf("0");
        if (n4 == -1) {
            throw new IllegalArgumentException("Expect at least one zero in template '" + string2 + "' for variant '" + string + "' for 10^" + n2 + " in " + cc.a(dn2, string3));
        }
        String string4 = cc.a(string2.substring(0, n4));
        String string5 = cc.a(string2.substring(n5 + 1));
        cc.a(new do(string4, string5), string, n2, ce2.b);
        if (string4.trim().length() == 0 && string5.trim().length() == 0) {
            return n2 + 1;
        }
        for (n3 = n4 + 1; n3 <= n5 && string2.charAt(n3) == '0'; ++n3) {
        }
        return n3 - n4;
    }

    private static String a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = string.length();
        cg cg2 = cg.a;
        block4: for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = string.charAt(i2);
            if (c2 == '\'') {
                if (cg2 == cg.b) {
                    stringBuilder.append('\'');
                }
            } else {
                stringBuilder.append(c2);
            }
            switch (cg2) {
                case a: {
                    cg2 = c2 == '\'' ? cg.b : cg.a;
                    continue block4;
                }
                case b: 
                case c: {
                    cg2 = c2 == '\'' ? cg.a : cg.c;
                    continue block4;
                }
                default: {
                    throw new IllegalStateException();
                }
            }
        }
        return stringBuilder.toString();
    }

    private static String a(dn dn2, String string) {
        return "locale '" + dn2 + "' style '" + string + "'";
    }

    private static void a(ce ce2) {
        long l2 = 1L;
        for (int i2 = 0; i2 < ce2.a.length; ++i2) {
            if (((do[])ce2.b.get(a))[i2] == null) {
                ce2.a[i2] = l2;
                cc.b(i2, ce2.b);
                continue;
            }
            l2 = ce2.a[i2];
            cc.a(i2, ce2.b);
        }
    }

    private static void a(int n2, Map map) {
        do do_ = ((do[])map.get(a))[n2];
        for (do[] arrdo : map.values()) {
            if (arrdo[n2] != null) continue;
            arrdo[n2] = do_;
        }
    }

    private static void b(int n2, Map map) {
        for (do[] arrdo : map.values()) {
            if (n2 == 0) {
                arrdo[n2] = dm.A;
                continue;
            }
            arrdo[n2] = arrdo[n2 - 1];
        }
    }

    private static void a(do do_, String string, int n2, Map map) {
        do[] arrdo = (do[])map.get(string);
        if (arrdo == null) {
            arrdo = new do[15];
            map.put(string, arrdo);
        }
        arrdo[n2] = do_;
    }

    static do a(Map map, String string, int n2) {
        do[] arrdo = (do[])map.get(string);
        if (arrdo == null) {
            arrdo = (do[])map.get(a);
        }
        return arrdo[n2];
    }
}

