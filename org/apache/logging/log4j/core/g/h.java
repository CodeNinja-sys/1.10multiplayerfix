/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.g;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.logging.log4j.a.x;
import org.apache.logging.log4j.a.y;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.a.am;
import org.apache.logging.log4j.core.config.d;
import org.apache.logging.log4j.core.d.s;
import org.apache.logging.log4j.core.g.f;
import org.apache.logging.log4j.core.g.j;
import org.apache.logging.log4j.core.g.k;
import org.apache.logging.log4j.core.g.l;
import org.apache.logging.log4j.core.g.m;
import org.apache.logging.log4j.core.g.n;
import org.apache.logging.log4j.core.g.o;
import org.apache.logging.log4j.core.i.ac;
import org.apache.logging.log4j.core.i.ar;
import org.apache.logging.log4j.core.i.as;
import org.apache.logging.log4j.core.i.bc;
import org.apache.logging.log4j.core.net.w;
import org.apache.logging.log4j.e;

public class h
extends org.apache.logging.log4j.core.g.b {
    private static final String i = "\n";
    public static final int d = 18060;
    public static final String e = "Audit";
    public static final Pattern f = Pattern.compile("\\r?\\n");
    public static final Pattern g = Pattern.compile("[\\\"\\]\\\\]");
    protected static final String h = "mdc";
    private static final int j = 10;
    private static final int k = 100;
    private static final int l = 60000;
    private static final int m = 60;
    private static final String n = "RFC5424-Converter";
    private final org.apache.logging.log4j.core.net.j o;
    private final String p;
    private final int q;
    private final boolean r;
    private final String s;
    private final x t;
    private final String u;
    private final String v;
    private final String w;
    private final String x;
    private final String y;
    private final String z;
    private final List A;
    private final List B;
    private final List C;
    private final m D;
    private final m E = new n(this, null);
    private final boolean F;
    private final String G;
    private final boolean H;
    private long I = -1L;
    private String J;
    private final List K;
    private final Map L;

    private h(d d2, org.apache.logging.log4j.core.net.j j2, String string, int n2, boolean bl2, boolean bl3, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, Charset charset, String string11, boolean bl4, f[] arrf) {
        super(charset);
        Object object;
        as as2 = org.apache.logging.log4j.core.g.h.a(d2, bc.class);
        this.K = string11 == null ? null : as2.a(string11, false);
        this.o = j2;
        this.p = string == null ? e : string;
        this.q = n2;
        this.r = bl2;
        this.F = bl3;
        this.G = string2 == null ? null : Matcher.quoteReplacement(string2);
        this.s = string3;
        this.t = new x(string3, this.q, null, null);
        this.y = string4;
        this.z = string5;
        this.v = string6;
        this.w = string7;
        this.H = bl4;
        this.u = org.apache.logging.log4j.core.d.s.a();
        m m2 = null;
        if (string8 != null) {
            object = string8.split(",");
            if (((String[])object).length > 0) {
                m2 = new j(this, null);
                this.A = new ArrayList(((String[])object).length);
                for (String string12 : object) {
                    this.A.add(string12.trim());
                }
            } else {
                this.A = null;
            }
        } else {
            this.A = null;
        }
        if (string9 != null) {
            object = string9.split(",");
            if (((String[])object).length > 0) {
                m2 = new l(this, null);
                this.B = new ArrayList(((String[])object).length);
                for (String string12 : object) {
                    this.B.add(string12.trim());
                }
            } else {
                this.B = null;
            }
        } else {
            this.B = null;
        }
        if (string10 != null) {
            object = string10.split(",");
            if (((String[])object).length > 0) {
                this.C = new ArrayList(((String[])object).length);
                for (String string12 : object) {
                    this.C.add(string12.trim());
                }
            } else {
                this.C = null;
            }
        } else {
            this.C = null;
        }
        this.D = m2 != null ? m2 : this.E;
        object = d2 == null ? null : d2.j();
        this.x = object != null && ((String)object).length() > 0 ? object : null;
        this.L = this.a(arrf, d2);
    }

    private Map a(f[] arrf, d d2) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        if (arrf != null) {
            for (f f2 : arrf) {
                x x2 = f2.b() == null ? this.t : f2.b();
                HashMap hashMap2 = new HashMap();
                Map map = f2.a();
                if (map.isEmpty()) continue;
                as as2 = org.apache.logging.log4j.core.g.h.a(d2, null);
                for (Map.Entry entry : map.entrySet()) {
                    List list = as2.a((String)entry.getValue(), false);
                    hashMap2.put(entry.getKey(), list);
                }
                k k2 = new k(this, hashMap2, f2.c());
                hashMap.put(x2.toString(), k2);
            }
        }
        return hashMap.size() > 0 ? hashMap : null;
    }

    private static as a(d d2, Class class_) {
        if (d2 == null) {
            return new as(d2, "Converter", ac.class, class_);
        }
        as as2 = (as)d2.a(n);
        if (as2 == null) {
            as2 = new as(d2, "Converter", bc.class);
            d2.a(n, as2);
            as2 = (as)d2.a(n);
        }
        return as2;
    }

    @Override
    public Map d() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("structured", "true");
        hashMap.put("formatType", "RFC5424");
        return hashMap;
    }

    public String c(org.apache.logging.log4j.core.h h2) {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, h2.a());
        this.a(stringBuilder, h2.g());
        this.a(stringBuilder);
        this.b(stringBuilder);
        this.a(stringBuilder);
        this.c(stringBuilder);
        this.a(stringBuilder);
        this.d(stringBuilder);
        this.a(stringBuilder);
        this.a(stringBuilder, h2.d());
        this.a(stringBuilder);
        this.b(stringBuilder, h2);
        this.a(stringBuilder, h2);
        if (this.H) {
            return new am(stringBuilder.toString()).toString();
        }
        return stringBuilder.toString();
    }

    private void a(StringBuilder stringBuilder, b b2) {
        stringBuilder.append("<");
        stringBuilder.append(org.apache.logging.log4j.core.net.w.a(this.o, b2));
        stringBuilder.append(">1 ");
    }

    private void a(StringBuilder stringBuilder, long l2) {
        stringBuilder.append(this.a(l2));
    }

    private void a(StringBuilder stringBuilder) {
        stringBuilder.append(" ");
    }

    private void b(StringBuilder stringBuilder) {
        stringBuilder.append(this.u);
    }

    private void c(StringBuilder stringBuilder) {
        if (this.v != null) {
            stringBuilder.append(this.v);
        } else if (this.x != null) {
            stringBuilder.append(this.x);
        } else {
            stringBuilder.append("-");
        }
    }

    private void d(StringBuilder stringBuilder) {
        stringBuilder.append(this.f());
    }

    private void a(StringBuilder stringBuilder, org.apache.logging.log4j.a.m m2) {
        String string;
        boolean bl2 = m2 instanceof y;
        String string2 = string = bl2 ? ((y)m2).j() : null;
        if (string != null) {
            stringBuilder.append(string);
        } else if (this.w != null) {
            stringBuilder.append(this.w);
        } else {
            stringBuilder.append("-");
        }
    }

    private void a(StringBuilder stringBuilder, org.apache.logging.log4j.core.h h2) {
        org.apache.logging.log4j.a.m m2 = h2.d();
        String string = m2.b();
        if (string != null && string.length() > 0) {
            stringBuilder.append(" ").append(this.a(string, this.G));
        }
        if (this.K != null && h2.h() != null) {
            StringBuilder stringBuilder2 = new StringBuilder(i);
            for (ar ar2 : this.K) {
                ar2.a(h2, stringBuilder2);
            }
            stringBuilder.append(this.a(stringBuilder2.toString(), this.G));
        }
        if (this.F) {
            stringBuilder.append(i);
        }
    }

    private void b(StringBuilder stringBuilder, org.apache.logging.log4j.core.h h2) {
        Object object;
        o o2;
        Object object2;
        org.apache.logging.log4j.a.m m2 = h2.d();
        boolean bl2 = m2 instanceof y;
        if (!bl2 && this.L != null && this.L.size() == 0 && !this.r) {
            stringBuilder.append("-");
            return;
        }
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        Map map = h2.i();
        if (this.C != null) {
            this.a(map);
        }
        if (this.L != null) {
            for (Map.Entry entry : this.L.entrySet()) {
                object2 = (String)entry.getKey();
                o2 = ((k)entry.getValue()).a(h2);
                hashMap.put(object2, o2);
            }
        }
        if (this.r && map.size() > 0) {
            if (hashMap.containsKey(this.t.toString())) {
                object = (o)hashMap.get(this.t.toString());
                ((o)object).a(map);
                hashMap.put(this.t.toString(), object);
            } else {
                object = new o(this, map, false);
                hashMap.put(this.t.toString(), object);
            }
        }
        if (bl2) {
            Map.Entry entry;
            object = (y)m2;
            entry = ((org.apache.logging.log4j.a.j)object).f();
            object2 = ((y)object).i();
            if (hashMap.containsKey(((x)object2).toString())) {
                o2 = (o)hashMap.get(((x)object2).toString());
                o2.a((Map)((Object)entry));
                hashMap.put(((x)object2).toString(), o2);
            } else {
                o2 = new o(this, (Map)((Object)entry), false);
                hashMap.put(((x)object2).toString(), o2);
            }
        }
        if (hashMap.size() == 0) {
            stringBuilder.append("-");
            return;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            this.a((String)entry.getKey(), this.y, (o)entry.getValue(), stringBuilder, this.D);
        }
    }

    private String a(String string, String string2) {
        if (null == string2) {
            return string;
        }
        return f.matcher(string).replaceAll(string2);
    }

    protected String f() {
        return "-";
    }

    protected List g() {
        return this.A;
    }

    protected List h() {
        return this.B;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private String a(long l2) {
        int n2;
        long l3;
        Object object = this;
        synchronized (object) {
            l3 = this.I;
            if (l2 == this.I) {
                return this.J;
            }
        }
        object = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(l2);
        ((StringBuilder)object).append(Integer.toString(gregorianCalendar.get(1)));
        ((StringBuilder)object).append("-");
        this.a(gregorianCalendar.get(2) + 1, 10, (StringBuilder)object);
        ((StringBuilder)object).append("-");
        this.a(gregorianCalendar.get(5), 10, (StringBuilder)object);
        ((StringBuilder)object).append("T");
        this.a(gregorianCalendar.get(11), 10, (StringBuilder)object);
        ((StringBuilder)object).append(":");
        this.a(gregorianCalendar.get(12), 10, (StringBuilder)object);
        ((StringBuilder)object).append(":");
        this.a(gregorianCalendar.get(13), 10, (StringBuilder)object);
        int n3 = gregorianCalendar.get(14);
        if (n3 != 0) {
            ((StringBuilder)object).append('.');
            this.a(n3, 100, (StringBuilder)object);
        }
        if ((n2 = (gregorianCalendar.get(15) + gregorianCalendar.get(16)) / 60000) == 0) {
            ((StringBuilder)object).append("Z");
        } else {
            if (n2 < 0) {
                n2 = -n2;
                ((StringBuilder)object).append("-");
            } else {
                ((StringBuilder)object).append("+");
            }
            int n4 = n2 / 60;
            this.a(n4, 10, (StringBuilder)object);
            ((StringBuilder)object).append(":");
            this.a(n2 -= n4 * 60, 10, (StringBuilder)object);
        }
        h h2 = this;
        synchronized (h2) {
            if (l3 == this.I) {
                this.I = l2;
                this.J = ((StringBuilder)object).toString();
            }
        }
        return ((StringBuilder)object).toString();
    }

    private void a(int n2, int n3, StringBuilder stringBuilder) {
        while (n3 > 1) {
            if (n2 < n3) {
                stringBuilder.append("0");
            }
            n3 /= 10;
        }
        stringBuilder.append(Integer.toString(n2));
    }

    private void a(String string, String string2, o o2, StringBuilder stringBuilder, m m2) {
        if (string == null && this.p == null || o2.a()) {
            return;
        }
        stringBuilder.append("[");
        stringBuilder.append(string);
        if (!this.t.toString().equals(string)) {
            this.a(string2, o2.b(), stringBuilder, this.E);
        } else {
            this.a(string2, o2.b(), stringBuilder, m2);
        }
        stringBuilder.append("]");
    }

    private String a(x x2) {
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        if (x2 == null || x2.c() == null) {
            stringBuilder.append(this.p);
        } else {
            stringBuilder.append(x2.c());
        }
        int n3 = n2 = x2 != null ? x2.d() : this.q;
        if (n2 < 0) {
            n2 = this.q;
        }
        if (n2 >= 0) {
            stringBuilder.append("@").append(n2);
        }
        return stringBuilder.toString();
    }

    private void a(Map map) {
        for (String string : this.C) {
            String string2 = (String)map.get(string);
            if (string2 != null) continue;
            throw new e("Required key " + string + " is missing from the " + this.s);
        }
    }

    private void a(String string, Map map, StringBuilder stringBuilder, m m2) {
        TreeMap treeMap = new TreeMap(map);
        for (Map.Entry entry : treeMap.entrySet()) {
            if (!m2.a((String)entry.getKey()) || entry.getValue() == null) continue;
            stringBuilder.append(" ");
            if (string != null) {
                stringBuilder.append(string);
            }
            stringBuilder.append(this.a(this.a((String)entry.getKey()), this.G)).append("=\"").append(this.a(this.a((String)entry.getValue()), this.G)).append("\"");
        }
    }

    private String a(String string) {
        return g.matcher(string).replaceAll("\\\\$0");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("facility=").append(this.o.name());
        stringBuilder.append(" appName=").append(this.v);
        stringBuilder.append(" defaultId=").append(this.p);
        stringBuilder.append(" enterpriseNumber=").append(this.q);
        stringBuilder.append(" newLine=").append(this.F);
        stringBuilder.append(" includeMDC=").append(this.r);
        stringBuilder.append(" messageId=").append(this.w);
        return stringBuilder.toString();
    }

    public static h a(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, f[] arrf, d d2) {
        Charset charset = org.apache.logging.log4j.core.d.e.a;
        if (string13 != null && string12 != null) {
            a.b("mdcIncludes and mdcExcludes are mutually exclusive. Includes wil be ignored");
            string13 = null;
        }
        org.apache.logging.log4j.core.net.j j2 = org.apache.logging.log4j.core.net.j.a(string, org.apache.logging.log4j.core.net.j.q);
        int n2 = org.apache.logging.log4j.core.d.n.a(string3, 18060);
        boolean bl2 = org.apache.logging.log4j.core.d.b.a(string4, true);
        boolean bl3 = Boolean.parseBoolean(string8);
        boolean bl4 = org.apache.logging.log4j.core.d.b.a(string16, false);
        if (string5 == null) {
            string5 = h;
        }
        return new h(d2, j2, string2, n2, bl2, bl3, string9, string5, string6, string7, string10, string11, string12, string13, string14, charset, string15, bl4, arrf);
    }

    @Override
    public /* synthetic */ Serializable b(org.apache.logging.log4j.core.h h2) {
        return this.c(h2);
    }

    static /* synthetic */ List a(h h2) {
        return h2.B;
    }

    static /* synthetic */ List b(h h2) {
        return h2.A;
    }
}

