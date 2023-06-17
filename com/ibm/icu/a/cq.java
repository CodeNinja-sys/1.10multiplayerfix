/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bc;
import com.ibm.icu.a.cs;
import com.ibm.icu.a.ct;
import com.ibm.icu.a.cu;
import com.ibm.icu.a.cv;
import com.ibm.icu.a.cw;
import com.ibm.icu.a.da;
import com.ibm.icu.a.db;
import com.ibm.icu.a.dc;
import com.ibm.icu.b.aa;
import com.ibm.icu.b.b;
import com.ibm.icu.d.dv;
import com.ibm.icu.d.dw;
import com.ibm.icu.d.el;
import com.ibm.icu.d.em;
import com.ibm.icu.d.eo;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dy;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;

public class cq
extends el {
    private final dn a;
    private final em b;
    private final dv c;
    private final cv d;
    private final cv e;
    private final cs f;
    private final eo g;
    private final eo h;
    private static final ct i = new ct(null);
    private Map j = null;
    private static final Map k = new HashMap();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static el a(dn dn2, em em2) {
        ct ct2 = i;
        synchronized (ct2) {
            return i.a(dn2, em2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static el a(dn dn2, dv ... arrdv) {
        ct ct2 = i;
        synchronized (ct2) {
            return i.a(dn2, arrdv);
        }
    }

    public cq(dn dn2, em em2) {
        this(dn2, em2 == em.a ? dv.a : dv.b, dv.c);
    }

    /*
     * WARNING - void declaration
     */
    public cq(dn dn2, dv ... arrdv) {
        void var5_8;
        em em2 = em.a;
        dv dv2 = dv.c;
        block6: for (Object object : arrdv) {
            switch (object.a()) {
                case a: {
                    em2 = object.b() == dv.a.b() ? em.a : em.b;
                    continue block6;
                }
                case b: {
                    dv2 = object;
                    continue block6;
                }
            }
        }
        this.b = em2;
        this.c = dv2;
        this.d = db.a.a(dn2);
        this.e = dc.a.a(dn2);
        this.a = dn.v.equals(this.d.a()) ? this.e.a() : this.d.a();
        String string = this.d.a("localeDisplayPattern", "separator");
        if ("separator".equals(string)) {
            String string2 = ", ";
        }
        this.f = new cs((String)var5_8);
        String string3 = this.d.a("localeDisplayPattern", "pattern");
        if ("pattern".equals(string3)) {
            string3 = "{0} ({1})";
        }
        this.g = new eo(string3);
        String string4 = this.d.a("localeDisplayPattern", "keyTypePattern");
        if ("keyTypePattern".equals(string4)) {
            string4 = "{0}={1}";
        }
        this.h = new eo(string4);
        if (dv2 == dv.f || dv2 == dv.g) {
            Object object;
            this.j = new HashMap();
            object = new boolean[2];
            object[0] = (dv)false;
            object[1] = (dv)false;
            cu[] arrcu = cu.values();
            for (cu cu2 : arrcu) {
                this.j.put(cu2, object);
            }
            bc bc2 = (bc)com.ibm.icu.util.dv.a("com/ibm/icu/impl/data/icudt51b", dn2);
            bc bc3 = null;
            try {
                bc3 = bc2.b("contextTransforms");
            }
            catch (MissingResourceException missingResourceException) {
                bc3 = null;
            }
            if (bc3 != null) {
                dy dy2 = bc3.D();
                while (dy2.d()) {
                    String string5;
                    cu cu3;
                    com.ibm.icu.util.dv dv3 = dy2.a();
                    int[] arrn = dv3.z();
                    if (arrn.length < 2 || (cu3 = (cu)((Object)k.get(string5 = dv3.k()))) == null) continue;
                    boolean[] arrbl = new boolean[]{arrn[0] != 0, arrn[1] != 0};
                    this.j.put(cu3, arrbl);
                }
            }
        }
    }

    public dn a() {
        return this.a;
    }

    public em b() {
        return this.b;
    }

    public dv a(dw dw2) {
        dv dv2;
        switch (dw2) {
            case a: {
                dv2 = this.b == em.a ? dv.a : dv.b;
                break;
            }
            case b: {
                dv2 = this.c;
                break;
            }
            default: {
                dv2 = dv.a;
            }
        }
        return dv2;
    }

    private String a(cu cu2, String string) {
        String string2 = string;
        boolean bl2 = false;
        switch (this.c) {
            case e: {
                bl2 = true;
                break;
            }
            case f: 
            case g: {
                if (this.j == null) break;
                boolean[] arrbl = (boolean[])this.j.get((Object)cu2);
                bl2 = this.c == dv.f ? arrbl[0] : arrbl[1];
                break;
            }
        }
        if (bl2) {
            int n2;
            int n3;
            int n4 = 8;
            int n5 = string.length();
            if (n4 > n5) {
                n4 = n5;
            }
            for (n3 = 0; !(n3 >= n4 || (n2 = string.codePointAt(n3)) < 65 || n2 > 90 && n2 < 97 || n2 > 122 && n2 < 192); ++n3) {
                if (n2 < 65536) continue;
                ++n3;
            }
            if (n3 > 0 && n3 < n5) {
                String string3 = string.substring(0, n3);
                String string4 = com.ibm.icu.b.b.a(this.a, string3, null, 768);
                string2 = string4.concat(string.substring(n3));
            } else {
                string2 = com.ibm.icu.b.b.a(this.a, string, null, 768);
            }
        }
        return string2;
    }

    public String a(dn dn2) {
        return this.c(dn2);
    }

    public String a(Locale locale) {
        return this.c(dn.a(locale));
    }

    public String a(String string) {
        return this.c(new dn(string));
    }

    private String c(dn dn2) {
        String string;
        CharSequence charSequence;
        Object object;
        boolean bl2;
        Object object2 = null;
        String string2 = dn2.f();
        if (dn2.k().length() == 0) {
            string2 = "root";
        }
        String string3 = dn2.g();
        String string4 = dn2.h();
        String string5 = dn2.i();
        boolean bl3 = string3.length() > 0;
        boolean bl4 = string4.length() > 0;
        boolean bl5 = bl2 = string5.length() > 0;
        if (this.b == em.b) {
            if (bl3 && bl4 && !((String)(object = this.h((String)(charSequence = string2 + '_' + string3 + '_' + string4)))).equals(charSequence)) {
                object2 = object;
                bl3 = false;
                bl4 = false;
            } else if (bl3 && !((String)(object = this.h((String)(charSequence = string2 + '_' + string3)))).equals(charSequence)) {
                object2 = object;
                bl3 = false;
            } else if (bl4 && !((String)(object = this.h((String)(charSequence = string2 + '_' + string4)))).equals(charSequence)) {
                object2 = object;
                bl4 = false;
            }
        }
        if (object2 == null) {
            object2 = this.h(string2);
        }
        charSequence = new StringBuilder();
        if (bl3) {
            ((StringBuilder)charSequence).append(this.d(string3));
        }
        if (bl4) {
            this.f.a(this.e(string4), (StringBuilder)charSequence);
        }
        if (bl2) {
            this.f.a(this.f(string5), (StringBuilder)charSequence);
        }
        if ((object = dn2.m()) != null) {
            while (object.hasNext()) {
                string = (String)object.next();
                String string6 = dn2.j(string);
                String string7 = this.g(string);
                String string8 = this.a(string, string6);
                if (!string8.equals(string6)) {
                    this.f.a(string8, (StringBuilder)charSequence);
                    continue;
                }
                if (!string.equals(string7)) {
                    String string9 = this.h.format(new String[]{string7, string8});
                    this.f.a(string9, (StringBuilder)charSequence);
                    continue;
                }
                this.f.a(string7, (StringBuilder)charSequence).append("=").append(string8);
            }
        }
        string = null;
        if (((StringBuilder)charSequence).length() > 0) {
            string = ((StringBuilder)charSequence).toString();
        }
        if (string != null) {
            object2 = this.g.format(new Object[]{object2, string});
        }
        return this.a(cu.a, (String)object2);
    }

    private String h(String string) {
        return this.d.a("Languages", string);
    }

    public String b(String string) {
        if (string.equals("root") || string.indexOf(95) != -1) {
            return string;
        }
        return this.a(cu.a, this.d.a("Languages", string));
    }

    public String c(String string) {
        String string2 = this.d.a("Scripts%stand-alone", string);
        if (string2.equals(string)) {
            string2 = this.d.a("Scripts", string);
        }
        return this.a(cu.b, string2);
    }

    public String d(String string) {
        return this.a(cu.b, this.d.a("Scripts", string));
    }

    public String a(int n2) {
        return this.a(cu.b, this.c(aa.c(n2)));
    }

    public String e(String string) {
        return this.a(cu.c, this.e.a("Countries", string));
    }

    public String f(String string) {
        return this.a(cu.d, this.d.a("Variants", string));
    }

    public String g(String string) {
        return this.a(cu.e, this.d.a("Keys", string));
    }

    public String a(String string, String string2) {
        return this.a(cu.f, this.d.a("Types", string, string2));
    }

    public static boolean a(cw cw2) {
        switch (cw2) {
            case a: {
                return db.a instanceof da;
            }
            case b: {
                return dc.a instanceof da;
            }
        }
        throw new IllegalArgumentException("unknown type: " + (Object)((Object)cw2));
    }

    static {
        k.put("languages", cu.a);
        k.put("script", cu.b);
        k.put("territory", cu.c);
        k.put("variant", cu.d);
        k.put("key", cu.e);
        k.put("type", cu.f);
    }
}

