/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.w;
import com.ibm.icu.d.gq;
import com.ibm.icu.d.hf;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

public class ct
implements Serializable,
Cloneable {
    private static final long b = 1L;
    private static final char[] c = new char[]{'\u00a4', '\u00a4', '\u00a4'};
    private static final String d = new String(c);
    private static final char[] e = new char[]{'\u0000', '.', '#', '#', ' ', '\u00a4', '\u00a4', '\u00a4'};
    private static final String f = new String(e);
    private Map g = null;
    private hf h = null;
    private dn i = null;

    public ct() {
        this.c(dn.a(dr.b));
    }

    public ct(Locale locale) {
        this.c(dn.a(locale));
    }

    public ct(dn dn2) {
        this.c(dn2);
    }

    public static ct a() {
        return new ct();
    }

    public static ct a(Locale locale) {
        return new ct(locale);
    }

    public static ct a(dn dn2) {
        return new ct(dn2);
    }

    public hf b() {
        return this.h;
    }

    public String a(String string) {
        String string2 = (String)this.g.get(string);
        if (string2 == null) {
            if (!string.equals("other")) {
                string2 = (String)this.g.get("other");
            }
            if (string2 == null) {
                string2 = f;
            }
        }
        return string2;
    }

    public dn c() {
        return this.i;
    }

    public void b(String string) {
        this.h = hf.b(string);
    }

    public void a(String string, String string2) {
        this.g.put(string, string2);
    }

    public void b(dn dn2) {
        this.i = dn2;
        this.c(dn2);
    }

    public Object clone() {
        try {
            ct ct2 = (ct)super.clone();
            ct2.i = (dn)this.i.clone();
            ct2.g = new HashMap();
            for (String string : this.g.keySet()) {
                String string2 = (String)this.g.get(string);
                ct2.g.put(string, string2);
            }
            return ct2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException();
        }
    }

    public boolean equals(Object object) {
        if (object instanceof ct) {
            ct ct2 = (ct)object;
            return this.h.a(ct2.h) && ((Object)this.g).equals(ct2.g);
        }
        return false;
    }

    public int hashCode() {
        assert (false) : "hashCode not designed";
        return 42;
    }

    String a(double d2) {
        return this.h.a(d2);
    }

    Iterator d() {
        return this.g.keySet().iterator();
    }

    private void c(dn dn2) {
        this.i = dn2;
        this.h = hf.a(dn2);
        this.d(dn2);
    }

    private void d(dn dn2) {
        this.g = new HashMap();
        String string = gq.c(dn2, 0);
        int n2 = string.indexOf(";");
        String string2 = null;
        if (n2 != -1) {
            string2 = string.substring(n2 + 1);
            string = string.substring(0, n2);
        }
        Map map = w.a.a(dn2, true).a();
        for (Map.Entry entry : map.entrySet()) {
            String string3 = (String)entry.getKey();
            String string4 = (String)entry.getValue();
            String string5 = string4.replace("{0}", string);
            String string6 = string5.replace("{1}", d);
            if (n2 != -1) {
                String string7 = string4;
                String string8 = string7.replace("{0}", string2);
                String string9 = string8.replace("{1}", d);
                StringBuilder stringBuilder = new StringBuilder(string6);
                stringBuilder.append(";");
                stringBuilder.append(string9);
                string6 = stringBuilder.toString();
            }
            this.g.put(string3, string6);
        }
    }
}

