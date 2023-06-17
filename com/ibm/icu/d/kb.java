/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.bc;
import com.ibm.icu.d.en;
import com.ibm.icu.d.eo;
import com.ibm.icu.d.gq;
import com.ibm.icu.d.hf;
import com.ibm.icu.util.dh;
import com.ibm.icu.util.di;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import com.ibm.icu.util.du;
import com.ibm.icu.util.dv;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.TreeMap;

public class kb
extends en {
    public static final int a = 0;
    public static final int c = 1;
    private static final int d = 2;
    private static final long e = -3707773153184971529L;
    private static final String f = "{0} s";
    private static final String g = "{0} min";
    private static final String h = "{0} h";
    private static final String i = "{0} d";
    private static final String j = "{0} w";
    private static final String k = "{0} m";
    private static final String l = "{0} y";
    private gq m;
    private dn n;
    private transient Map o;
    private transient hf p;
    private transient boolean q;
    private int r;

    public kb() {
        this.q = false;
        this.r = 0;
    }

    public kb(dn dn2) {
        this(dn2, 0);
    }

    public kb(Locale locale) {
        this(locale, 0);
    }

    public kb(dn dn2, int n2) {
        if (n2 < 0 || n2 >= 2) {
            throw new IllegalArgumentException("style should be either FULL_NAME or ABBREVIATED_NAME style");
        }
        this.r = n2;
        this.n = dn2;
        this.q = false;
    }

    public kb(Locale locale, int n2) {
        this(dn.a(locale), n2);
    }

    public kb b(dn dn2) {
        if (dn2 != this.n) {
            this.n = dn2;
            this.q = false;
        }
        return this;
    }

    public kb a(Locale locale) {
        return this.b(dn.a(locale));
    }

    public kb a(gq gq2) {
        if (gq2 == this.m) {
            return this;
        }
        if (gq2 == null) {
            if (this.n == null) {
                this.q = false;
                return this;
            }
            this.m = gq.b(this.n);
        } else {
            this.m = gq2;
        }
        if (!this.q) {
            return this;
        }
        for (Map map : this.o.values()) {
            for (Object[] arrobject : map.values()) {
                eo eo2 = (eo)arrobject[0];
                eo2.a(0, (Format)gq2);
                eo2 = (eo)arrobject[1];
                eo2.a(0, (Format)gq2);
            }
        }
        return this;
    }

    public StringBuffer format(Object object, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (!(object instanceof di)) {
            throw new IllegalArgumentException("can not format non TimeUnitAmount object");
        }
        if (!this.q) {
            this.b();
        }
        di di2 = (di)object;
        Map map = (Map)this.o.get(di2.a());
        double d2 = di2.b().doubleValue();
        String string = this.p.a(d2);
        eo eo2 = (eo)((Object[])map.get(string))[this.r];
        return eo2.a(new Object[]{di2.b()}, stringBuffer, fieldPosition);
    }

    public Object parseObject(String string, ParsePosition parsePosition) {
        if (!this.q) {
            this.b();
        }
        Number number = null;
        dh dh2 = null;
        int n2 = parsePosition.getIndex();
        int n3 = -1;
        int n4 = 0;
        String string2 = null;
        for (dh dh3 : this.o.keySet()) {
            Map map = (Map)this.o.get(dh3);
            for (Map.Entry entry : map.entrySet()) {
                String string3 = (String)entry.getKey();
                for (int i2 = 0; i2 < 2; ++i2) {
                    int n5;
                    String string4;
                    eo eo2 = (eo)((Object[])entry.getValue())[i2];
                    parsePosition.setErrorIndex(-1);
                    parsePosition.setIndex(n2);
                    Object object = eo2.parseObject(string, parsePosition);
                    if (parsePosition.getErrorIndex() != -1 || parsePosition.getIndex() == n2) continue;
                    Number number2 = null;
                    if (((Object[])object).length != 0 && !string3.equals(string4 = this.p.a((number2 = (Number)((Object[])object)[0]).doubleValue())) || (n5 = parsePosition.getIndex() - n2) <= n4) continue;
                    number = number2;
                    dh2 = dh3;
                    n3 = parsePosition.getIndex();
                    n4 = n5;
                    string2 = string3;
                }
            }
        }
        if (number == null && n4 != 0) {
            number = string2.equals("zero") ? Integer.valueOf(0) : (string2.equals("one") ? Integer.valueOf(1) : (string2.equals("two") ? Integer.valueOf(2) : Integer.valueOf(3)));
        }
        if (n4 == 0) {
            parsePosition.setIndex(n2);
            parsePosition.setErrorIndex(0);
            return null;
        }
        parsePosition.setIndex(n3);
        parsePosition.setErrorIndex(-1);
        return new di(number, dh2);
    }

    private void b() {
        if (this.n == null) {
            this.n = this.m != null ? this.m.a((du)null) : dn.a(dr.b);
        }
        if (this.m == null) {
            this.m = gq.b(this.n);
        }
        this.p = hf.a(this.n);
        this.o = new HashMap();
        Set set = this.p.a();
        this.a("units", this.o, 0, set);
        this.a("unitsShort", this.o, 1, set);
        this.q = true;
    }

    private void a(String string, Map map, int n2, Set set) {
        Object object;
        Object object2;
        Map map2;
        int n3;
        Object object3;
        Object object4;
        try {
            object4 = (bc)dv.a("com/ibm/icu/impl/data/icudt51b", this.n);
            object3 = ((bc)object4).b(string);
            n3 = ((dv)object3).w();
            for (int i2 = 0; i2 < n3; ++i2) {
                map2 = ((dv)object3).k(i2).k();
                object2 = null;
                if (((String)((Object)map2)).equals("year")) {
                    object2 = dh.g;
                } else if (((String)((Object)map2)).equals("month")) {
                    object2 = dh.f;
                } else if (((String)((Object)map2)).equals("day")) {
                    object2 = dh.d;
                } else if (((String)((Object)map2)).equals("hour")) {
                    object2 = dh.c;
                } else if (((String)((Object)map2)).equals("minute")) {
                    object2 = dh.b;
                } else if (((String)((Object)map2)).equals("second")) {
                    object2 = dh.a;
                } else {
                    if (!((String)((Object)map2)).equals("week")) continue;
                    object2 = dh.e;
                }
                object = ((bc)object3).b((String)((Object)map2));
                int n4 = ((dv)object).w();
                TreeMap<String, Object[]> treeMap = (TreeMap<String, Object[]>)map.get(object2);
                if (treeMap == null) {
                    treeMap = new TreeMap<String, Object[]>();
                    map.put(object2, treeMap);
                }
                for (int i3 = 0; i3 < n4; ++i3) {
                    Object[] arrobject;
                    String string2 = ((dv)object).k(i3).k();
                    if (!set.contains(string2)) continue;
                    String string3 = ((dv)object).k(i3).A();
                    eo eo2 = new eo(string3, this.n);
                    if (this.m != null) {
                        eo2.a(0, (Format)this.m);
                    }
                    if ((arrobject = (Object[])treeMap.get(string2)) == null) {
                        arrobject = new Object[2];
                        treeMap.put(string2, arrobject);
                    }
                    arrobject[n2] = eo2;
                }
            }
        }
        catch (MissingResourceException missingResourceException) {
            // empty catch block
        }
        object4 = dh.a();
        object3 = this.p.a();
        for (n3 = 0; n3 < ((Object)object4).length; ++n3) {
            Object object5 = object4[n3];
            map2 = (Map)map.get(object5);
            if (map2 == null) {
                map2 = new TreeMap();
                map.put(object5, map2);
            }
            object2 = object3.iterator();
            while (object2.hasNext()) {
                object = (String)object2.next();
                if (map2.get(object) != null && ((Object[])map2.get(object))[n2] != null) continue;
                this.a(string, n2, (dh)object5, (String)object, (String)object, map2);
            }
        }
    }

    private void a(String string, int n2, dh dh2, String string2, String string3, Map map) {
        dn dn2;
        String string4 = dh2.toString();
        for (dn2 = this.n; dn2 != null; dn2 = dn2.j()) {
            try {
                Object[] arrobject;
                bc bc2 = (bc)dv.a("com/ibm/icu/impl/data/icudt51b", dn2);
                bc2 = bc2.b(string);
                bc bc3 = bc2.b(string4);
                String string5 = bc3.f(string3);
                eo eo2 = new eo(string5, this.n);
                if (this.m != null) {
                    eo2.a(0, (Format)this.m);
                }
                if ((arrobject = (Object[])map.get(string2)) == null) {
                    arrobject = new Object[2];
                    map.put(string2, arrobject);
                }
                arrobject[n2] = eo2;
                return;
            }
            catch (MissingResourceException missingResourceException) {
                continue;
            }
        }
        if (dn2 == null && string.equals("unitsShort")) {
            this.a("units", n2, dh2, string2, string3, map);
            if (map != null && map.get(string2) != null && ((Object[])map.get(string2))[n2] != null) {
                return;
            }
        }
        if (string3.equals("other")) {
            Object[] arrobject;
            eo eo3 = null;
            if (dh2 == dh.a) {
                eo3 = new eo(f, this.n);
            } else if (dh2 == dh.b) {
                eo3 = new eo(g, this.n);
            } else if (dh2 == dh.c) {
                eo3 = new eo(h, this.n);
            } else if (dh2 == dh.e) {
                eo3 = new eo(j, this.n);
            } else if (dh2 == dh.d) {
                eo3 = new eo(i, this.n);
            } else if (dh2 == dh.f) {
                eo3 = new eo(k, this.n);
            } else if (dh2 == dh.g) {
                eo3 = new eo(l, this.n);
            }
            if (this.m != null && eo3 != null) {
                eo3.a(0, (Format)this.m);
            }
            if ((arrobject = (Object[])map.get(string2)) == null) {
                arrobject = new Object[2];
                map.put(string2, arrobject);
            }
            arrobject[n2] = eo3;
        } else {
            this.a(string, n2, dh2, string2, "other", map);
        }
    }
}

