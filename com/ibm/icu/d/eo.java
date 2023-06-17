/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.eb;
import com.ibm.icu.a.jd;
import com.ibm.icu.d.cu;
import com.ibm.icu.d.dm;
import com.ibm.icu.d.dp;
import com.ibm.icu.d.ep;
import com.ibm.icu.d.eq;
import com.ibm.icu.d.er;
import com.ibm.icu.d.es;
import com.ibm.icu.d.et;
import com.ibm.icu.d.ev;
import com.ibm.icu.d.ew;
import com.ibm.icu.d.ex;
import com.ibm.icu.d.ey;
import com.ibm.icu.d.gq;
import com.ibm.icu.d.hb;
import com.ibm.icu.d.ho;
import com.ibm.icu.d.iu;
import com.ibm.icu.d.iy;
import com.ibm.icu.d.iz;
import com.ibm.icu.d.kv;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.ChoiceFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class eo
extends kv {
    static final long a = 7136212545847378652L;
    private transient dn c;
    private transient et d;
    private transient Map e;
    private transient Set f;
    private transient Format g;
    private transient Format h;
    private transient es i;
    private transient es j;
    private static final String[] k = new String[]{"number", "date", "time", "spellout", "ordinal", "duration"};
    private static final int l = 0;
    private static final int m = 1;
    private static final int n = 2;
    private static final int o = 3;
    private static final int p = 4;
    private static final int q = 5;
    private static final String[] r = new String[]{"", "currency", "percent", "integer"};
    private static final int s = 0;
    private static final int t = 1;
    private static final int u = 2;
    private static final int v = 3;
    private static final String[] w = new String[]{"", "short", "medium", "long", "full"};
    private static final int x = 0;
    private static final int y = 1;
    private static final int z = 2;
    private static final int A = 3;
    private static final int B = 4;
    private static final Locale C = new Locale("");
    private static final char D = '\'';
    private static final char E = '{';
    private static final char F = '}';
    private static final int G = 0;
    private static final int H = 1;
    private static final int I = 2;
    private static final int J = 3;

    public eo(String string) {
        this.c = dn.a(dr.b);
        this.a(string);
    }

    public eo(String string, Locale locale) {
        this(string, dn.a(locale));
    }

    public eo(String string, dn dn2) {
        this.c = dn2;
        this.a(string);
    }

    public void a(Locale locale) {
        this.a(dn.a(locale));
    }

    public void a(dn dn2) {
        String string = this.d();
        this.c = dn2;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.a(string);
    }

    public Locale a() {
        return this.c.a();
    }

    public dn b() {
        return this.c;
    }

    public void a(String string) {
        try {
            if (this.d == null) {
                this.d = new et(string);
            } else {
                this.d.a(string);
            }
            this.j();
        }
        catch (RuntimeException runtimeException) {
            this.i();
            throw runtimeException;
        }
    }

    public void a(String string, ev ev2) {
        if (this.d == null) {
            this.d = new et(ev2);
        } else if (ev2 != this.d.b()) {
            this.d.a(ev2);
        }
        this.a(string);
    }

    public ev c() {
        if (this.d == null) {
            this.d = new et();
        }
        return this.d.b();
    }

    public String d() {
        if (this.f != null) {
            throw new IllegalStateException("toPattern() is not supported after custom Format objects have been set via setFormat() or similar APIs");
        }
        if (this.d == null) {
            return "";
        }
        String string = this.d.d();
        return string == null ? "" : string;
    }

    private int a(int n2) {
        ey ey2;
        if (n2 != 0) {
            n2 = this.d.e(n2);
        }
        do {
            if ((ey2 = this.d.b(++n2)) != ey.f) continue;
            return n2;
        } while (ey2 != ey.b);
        return -1;
    }

    private boolean a(int n2, String string, int n3) {
        ex ex2 = this.d.a(n2);
        return ex2.a() == ey.i ? this.d.a(ex2, string) : ex2.e() == n3;
    }

    private String b(int n2) {
        ex ex2 = this.d.a(n2);
        if (ex2.a() == ey.i) {
            return this.d.a(ex2);
        }
        return Integer.toString(ex2.e());
    }

    public void a(Format[] arrformat) {
        if (this.d.e()) {
            throw new IllegalArgumentException("This method is not available in MessageFormat objects that use alphanumeric argument names.");
        }
        int n2 = 0;
        while ((n2 = this.a(n2)) >= 0) {
            int n3 = this.d.a(n2 + 1).e();
            if (n3 >= arrformat.length) continue;
            this.d(n2, arrformat[n3]);
        }
    }

    public void a(Map map) {
        int n2 = 0;
        while ((n2 = this.a(n2)) >= 0) {
            String string = this.b(n2 + 1);
            if (!map.containsKey(string)) continue;
            this.d(n2, (Format)map.get(string));
        }
    }

    public void b(Format[] arrformat) {
        int n2 = 0;
        for (int i2 = 0; i2 < arrformat.length && (n2 = this.a(n2)) >= 0; ++i2) {
            this.d(n2, arrformat[i2]);
        }
    }

    public void a(int n2, Format format) {
        if (this.d.e()) {
            throw new IllegalArgumentException("This method is not available in MessageFormat objects that use alphanumeric argument names.");
        }
        int n3 = 0;
        while ((n3 = this.a(n3)) >= 0) {
            if (this.d.a(n3 + 1).e() != n2) continue;
            this.d(n3, format);
        }
    }

    public void a(String string, Format format) {
        int n2 = et.e(string);
        if (n2 < -1) {
            return;
        }
        int n3 = 0;
        while ((n3 = this.a(n3)) >= 0) {
            if (!this.a(n3 + 1, string, n2)) continue;
            this.d(n3, format);
        }
    }

    public void b(int n2, Format format) {
        int n3 = 0;
        int n4 = 0;
        while ((n4 = this.a(n4)) >= 0) {
            if (n3 == n2) {
                this.d(n4, format);
                return;
            }
            ++n3;
        }
        throw new ArrayIndexOutOfBoundsException(n2);
    }

    public Format[] e() {
        if (this.d.e()) {
            throw new IllegalArgumentException("This method is not available in MessageFormat objects that use alphanumeric argument names.");
        }
        ArrayList<Format> arrayList = new ArrayList<Format>();
        int n2 = 0;
        while ((n2 = this.a(n2)) >= 0) {
            int n3 = this.d.a(n2 + 1).e();
            while (n3 >= arrayList.size()) {
                arrayList.add(null);
            }
            arrayList.set(n3, this.e == null ? null : (Format)this.e.get(n2));
        }
        return arrayList.toArray(new Format[arrayList.size()]);
    }

    public Format[] f() {
        ArrayList<Format> arrayList = new ArrayList<Format>();
        int n2 = 0;
        while ((n2 = this.a(n2)) >= 0) {
            arrayList.add(this.e == null ? null : (Format)this.e.get(n2));
        }
        return arrayList.toArray(new Format[arrayList.size()]);
    }

    public Set g() {
        HashSet<String> hashSet = new HashSet<String>();
        int n2 = 0;
        while ((n2 = this.a(n2)) >= 0) {
            hashSet.add(this.b(n2 + 1));
        }
        return hashSet;
    }

    public Format b(String string) {
        if (this.e == null) {
            return null;
        }
        int n2 = et.e(string);
        if (n2 < -1) {
            return null;
        }
        int n3 = 0;
        while ((n3 = this.a(n3)) >= 0) {
            if (!this.a(n3 + 1, string, n2)) continue;
            return (Format)this.e.get(n3);
        }
        return null;
    }

    public final StringBuffer a(Object[] arrobject, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        this.a(arrobject, null, new ep(stringBuffer), fieldPosition);
        return stringBuffer;
    }

    public final StringBuffer a(Map map, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        this.a(null, map, new ep(stringBuffer), fieldPosition);
        return stringBuffer;
    }

    public static String a(String string, Object ... arrobject) {
        eo eo2 = new eo(string);
        return eo2.format(arrobject);
    }

    public static String a(String string, Map map) {
        eo eo2 = new eo(string);
        return eo2.format(map);
    }

    public boolean h() {
        return this.d.e();
    }

    public final StringBuffer format(Object object, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        this.a(object, new ep(stringBuffer), fieldPosition);
        return stringBuffer;
    }

    public AttributedCharacterIterator formatToCharacterIterator(Object object) {
        if (object == null) {
            throw new NullPointerException("formatToCharacterIterator must be passed non-null object");
        }
        StringBuilder stringBuilder = new StringBuilder();
        ep ep2 = new ep(stringBuilder);
        ep2.a();
        this.a(object, ep2, null);
        AttributedString attributedString = new AttributedString(stringBuilder.toString());
        for (eq eq2 : ep.a(ep2)) {
            attributedString.addAttribute(eq.a(eq2), eq.b(eq2), eq.c(eq2), eq.d(eq2));
        }
        return attributedString.getIterator();
    }

    public Object[] a(String string, ParsePosition parsePosition) {
        int n2;
        if (this.d.e()) {
            throw new IllegalArgumentException("This method is not available in MessageFormat objects that use named argument.");
        }
        int n3 = -1;
        int n4 = 0;
        while ((n4 = this.a(n4)) >= 0) {
            n2 = this.d.a(n4 + 1).e();
            if (n2 <= n3) continue;
            n3 = n2;
        }
        Object[] arrobject = new Object[n3 + 1];
        n2 = parsePosition.getIndex();
        this.a(0, string, parsePosition, arrobject, null);
        if (parsePosition.getIndex() == n2) {
            return null;
        }
        return arrobject;
    }

    public Map b(String string, ParsePosition parsePosition) {
        HashMap hashMap = new HashMap();
        int n2 = parsePosition.getIndex();
        this.a(0, string, parsePosition, null, hashMap);
        if (parsePosition.getIndex() == n2) {
            return null;
        }
        return hashMap;
    }

    public Object[] c(String string) {
        ParsePosition parsePosition = new ParsePosition(0);
        Object[] arrobject = this.a(string, parsePosition);
        if (parsePosition.getIndex() == 0) {
            throw new ParseException("MessageFormat parse error!", parsePosition.getErrorIndex());
        }
        return arrobject;
    }

    private void a(int n2, String string, ParsePosition parsePosition, Object[] arrobject, Map map) {
        if (string == null) {
            return;
        }
        String string2 = this.d.d();
        int n3 = this.d.a(n2).d();
        int n4 = parsePosition.getIndex();
        ParsePosition parsePosition2 = new ParsePosition(0);
        int n5 = n2 + 1;
        while (true) {
            ex ex2 = this.d.a(n5);
            ey ey2 = ex2.a();
            int n6 = ex2.b();
            int n7 = n6 - n3;
            if (n7 == 0 || string2.regionMatches(n3, string, n4, n7)) {
                n4 += n7;
                n3 += n7;
            } else {
                parsePosition.setErrorIndex(n4);
                return;
            }
            if (ey2 == ey.b) {
                parsePosition.setIndex(n4);
                return;
            }
            if (ey2 == ey.c || ey2 == ey.d) {
                n3 = ex2.d();
            } else {
                assert (ey2 == ey.f) : "Unexpected Part " + ex2 + " in parsed message.";
                int n8 = this.d.e(n5);
                ew ew2 = ex2.f();
                ex2 = this.d.a(++n5);
                Object object = null;
                int n9 = 0;
                String string3 = null;
                if (arrobject != null) {
                    n9 = ex2.e();
                    object = n9;
                } else {
                    string3 = ex2.a() == ey.i ? this.d.a(ex2) : Integer.toString(ex2.e());
                    object = string3;
                }
                Format format = null;
                boolean bl2 = false;
                Object object2 = null;
                if (this.e != null && (format = (Format)this.e.get(++n5 - 2)) != null) {
                    parsePosition2.setIndex(n4);
                    object2 = format.parseObject(string, parsePosition2);
                    if (parsePosition2.getIndex() == n4) {
                        parsePosition.setErrorIndex(n4);
                        return;
                    }
                    bl2 = true;
                    n4 = parsePosition2.getIndex();
                } else if (ew2 == ew.a || this.e != null && this.e.containsKey(n5 - 2)) {
                    String string4 = this.c(n8);
                    int n10 = string4.length() != 0 ? string.indexOf(string4, n4) : string.length();
                    if (n10 < 0) {
                        parsePosition.setErrorIndex(n4);
                        return;
                    }
                    String string5 = string.substring(n4, n10);
                    if (!string5.equals("{" + object.toString() + "}")) {
                        bl2 = true;
                        object2 = string5;
                    }
                    n4 = n10;
                } else if (ew2 == ew.c) {
                    parsePosition2.setIndex(n4);
                    double d2 = eo.a(this.d, n5, string, parsePosition2);
                    if (parsePosition2.getIndex() == n4) {
                        parsePosition.setErrorIndex(n4);
                        return;
                    }
                    object2 = d2;
                    bl2 = true;
                    n4 = parsePosition2.getIndex();
                } else {
                    if (ew2.a() || ew2 == ew.e) {
                        throw new UnsupportedOperationException("Parsing of plural/select/selectordinal argument is not supported.");
                    }
                    throw new IllegalStateException("unexpected argType " + (Object)((Object)ew2));
                }
                if (bl2) {
                    if (arrobject != null) {
                        arrobject[n9] = object2;
                    } else if (map != null) {
                        map.put(string3, object2);
                    }
                }
                n3 = this.d.a(n8).d();
                n5 = n8;
            }
            ++n5;
        }
    }

    public Map d(String string) {
        ParsePosition parsePosition = new ParsePosition(0);
        HashMap hashMap = new HashMap();
        this.a(0, string, parsePosition, null, hashMap);
        if (parsePosition.getIndex() == 0) {
            throw new ParseException("MessageFormat parse error!", parsePosition.getErrorIndex());
        }
        return hashMap;
    }

    public Object parseObject(String string, ParsePosition parsePosition) {
        if (!this.d.e()) {
            return this.a(string, parsePosition);
        }
        return this.b(string, parsePosition);
    }

    public Object clone() {
        eo eo2 = (eo)super.clone();
        if (this.f != null) {
            eo2.f = new HashSet();
            for (Integer object : this.f) {
                eo2.f.add(object);
            }
        } else {
            eo2.f = null;
        }
        if (this.e != null) {
            eo2.e = new HashMap();
            for (Map.Entry entry : this.e.entrySet()) {
                eo2.e.put(entry.getKey(), entry.getValue());
            }
        } else {
            eo2.e = null;
        }
        eo2.d = this.d == null ? null : (et)this.d.clone();
        eo2.g = this.g == null ? null : (Format)this.g.clone();
        eo2.h = this.h == null ? null : (Format)this.h.clone();
        eo2.i = null;
        eo2.j = null;
        return eo2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        eo eo2 = (eo)object;
        return jd.b(this.c, eo2.c) && jd.b(this.d, eo2.d) && jd.b(this.e, eo2.e) && jd.b(this.f, eo2.f);
    }

    public int hashCode() {
        return this.d.d().hashCode();
    }

    private void a(int n2, double d2, Object[] arrobject, Map map, ep ep2, FieldPosition fieldPosition) {
        String string = this.d.d();
        int n3 = this.d.a(n2).d();
        int n4 = n2 + 1;
        while (true) {
            ex ex2 = this.d.a(n4);
            ey ey2 = ex2.a();
            int n5 = ex2.b();
            ep2.a(string, n3, n5);
            if (ey2 == ey.b) {
                return;
            }
            n3 = ex2.d();
            if (ey2 == ey.e) {
                if (this.h == null) {
                    this.h = gq.a(this.c);
                }
                ep2.a(this.h, d2);
            } else if (ey2 == ey.f) {
                Object object;
                int n6;
                int n7 = this.d.e(n4);
                ew ew2 = ex2.f();
                ex2 = this.d.a(++n4);
                String string2 = null;
                Object object2 = null;
                if (arrobject != null) {
                    n6 = ex2.e();
                    if (ep.a(ep2) != null) {
                        object2 = n6;
                    }
                    if (0 <= n6 && n6 < arrobject.length) {
                        object = arrobject[n6];
                    } else {
                        object = null;
                        string2 = "{" + n6 + "}";
                    }
                } else {
                    String string3 = ex2.a() == ey.i ? this.d.a(ex2) : Integer.toString(ex2.e());
                    object2 = string3;
                    if (map != null && map.containsKey(string3)) {
                        object = map.get(string3);
                    } else {
                        object = null;
                        string2 = "{" + string3 + "}";
                    }
                }
                ++n4;
                n6 = ep.b(ep2);
                Format format = null;
                if (string2 != null) {
                    ep2.a(string2);
                } else if (object == null) {
                    ep2.a("null");
                } else if (this.e != null && (format = (Format)this.e.get(n4 - 2)) != null) {
                    if (format instanceof ChoiceFormat || format instanceof hb || format instanceof iy) {
                        String string4 = format.format(object);
                        if (string4.indexOf(123) >= 0 || string4.indexOf(39) >= 0 && !this.d.c()) {
                            eo eo2 = new eo(string4, this.c);
                            eo2.a(0, 0.0, arrobject, map, ep2, null);
                        } else if (ep.a(ep2) == null) {
                            ep2.a(string4);
                        } else {
                            ep2.a(format, object);
                        }
                    } else {
                        ep2.a(format, object);
                    }
                } else if (ew2 == ew.a || this.e != null && this.e.containsKey(n4 - 2)) {
                    if (object instanceof Number) {
                        if (this.h == null) {
                            this.h = gq.a(this.c);
                        }
                        ep2.a(this.h, object);
                    } else if (object instanceof Date) {
                        if (this.g == null) {
                            this.g = cu.a(3, 3, this.c);
                        }
                        ep2.a(this.g, object);
                    } else {
                        ep2.a(object.toString());
                    }
                } else if (ew2 == ew.c) {
                    if (!(object instanceof Number)) {
                        throw new IllegalArgumentException("'" + object + "' is not a Number");
                    }
                    double d3 = ((Number)object).doubleValue();
                    int n8 = eo.a(this.d, n4, d3);
                    this.a(n8, 0.0, arrobject, map, ep2);
                } else if (ew2.a()) {
                    es es2;
                    if (!(object instanceof Number)) {
                        throw new IllegalArgumentException("'" + object + "' is not a Number");
                    }
                    double d4 = ((Number)object).doubleValue();
                    if (ew2 == ew.d) {
                        if (this.i == null) {
                            this.i = new es(this.c, ho.a);
                        }
                        es2 = this.i;
                    } else {
                        if (this.j == null) {
                            this.j = new es(this.c, ho.b);
                        }
                        es2 = this.j;
                    }
                    int n9 = hb.a(this.d, n4, es2, d4);
                    double d5 = this.d.d(n4);
                    this.a(n9, d4 - d5, arrobject, map, ep2);
                } else if (ew2 == ew.e) {
                    int n10 = iy.a(this.d, n4, object.toString());
                    this.a(n10, 0.0, arrobject, map, ep2);
                } else {
                    throw new IllegalStateException("unexpected argType " + (Object)((Object)ew2));
                }
                fieldPosition = this.a(ep2, n6, fieldPosition, object2);
                n3 = this.d.a(n7).d();
                n4 = n7;
            }
            ++n4;
        }
    }

    private void a(int n2, double d2, Object[] arrobject, Map map, ep ep2) {
        String string;
        if (!this.d.c()) {
            this.a(n2, d2, arrobject, map, ep2, null);
            return;
        }
        String string2 = this.d.d();
        StringBuilder stringBuilder = null;
        int n3 = this.d.a(n2).d();
        int n4 = n2;
        while (true) {
            ex ex2 = this.d.a(++n4);
            ey ey2 = ex2.a();
            int n5 = ex2.b();
            if (ey2 == ey.b) {
                if (stringBuilder == null) {
                    string = string2.substring(n3, n5);
                    break;
                }
                string = stringBuilder.append(string2, n3, n5).toString();
                break;
            }
            if (ey2 == ey.e || ey2 == ey.c) {
                if (stringBuilder == null) {
                    stringBuilder = new StringBuilder();
                }
                stringBuilder.append(string2, n3, n5);
                if (ey2 == ey.e) {
                    if (this.h == null) {
                        this.h = gq.a(this.c);
                    }
                    stringBuilder.append(this.h.format(d2));
                }
                n3 = ex2.d();
                continue;
            }
            if (ey2 != ey.f) continue;
            if (stringBuilder == null) {
                stringBuilder = new StringBuilder();
            }
            stringBuilder.append(string2, n3, n5);
            n3 = n5;
            n4 = this.d.e(n4);
            n5 = this.d.a(n4).d();
            et.a(string2, n3, n5, stringBuilder);
            n3 = n5;
        }
        if (string.indexOf(123) >= 0) {
            eo eo2 = new eo("", this.c);
            eo2.a(string, ev.b);
            eo2.a(0, 0.0, arrobject, map, ep2, null);
        } else {
            ep2.a(string);
        }
    }

    private String c(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        String string = this.d.d();
        int n3 = this.d.a(n2).d();
        int n4 = n2 + 1;
        while (true) {
            ex ex2 = this.d.a(n4);
            ey ey2 = ex2.a();
            int n5 = ex2.b();
            stringBuilder.append(string, n3, n5);
            if (ey2 == ey.f || ey2 == ey.b) {
                return stringBuilder.toString();
            }
            assert (ey2 == ey.c || ey2 == ey.d) : "Unexpected Part " + ex2 + " in parsed message.";
            n3 = ex2.d();
            ++n4;
        }
    }

    private FieldPosition a(ep ep2, int n2, FieldPosition fieldPosition, Object object) {
        if (ep.a(ep2) != null && n2 < ep.b(ep2)) {
            ep.a(ep2).add(new eq(object, n2, ep.b(ep2)));
        }
        if (fieldPosition != null && er.a.equals(fieldPosition.getFieldAttribute())) {
            fieldPosition.setBeginIndex(n2);
            fieldPosition.setEndIndex(ep.b(ep2));
            return null;
        }
        return fieldPosition;
    }

    private static int a(et et2, int n2, double d2) {
        int n3;
        double d3;
        int n4;
        char c2;
        int n5 = et2.k();
        n2 += 2;
        do {
            ex ex2;
            ey ey2;
            n3 = n2;
            n2 = et2.e(n2);
            if (++n2 >= n5 || (ey2 = (ex2 = et2.a(n2++)).a()) == ey.g) break;
            assert (ey2.a());
            d3 = et2.b(ex2);
            n4 = et2.c(n2++);
        } while (!((c2 = et2.d().charAt(n4)) == '<' ? !(d2 > d3) : !(d2 >= d3)));
        return n3;
    }

    private static double a(et et2, int n2, String string, ParsePosition parsePosition) {
        int n3;
        int n4 = n3 = parsePosition.getIndex();
        double d2 = Double.NaN;
        double d3 = 0.0;
        while (et2.b(n2) != ey.g) {
            int n5;
            int n6;
            int n7;
            d3 = et2.b(et2.a(n2));
            if ((n7 = eo.a(et2, n2 += 2, n6 = et2.e(n2), string, n3)) >= 0 && (n5 = n3 + n7) > n4) {
                n4 = n5;
                d2 = d3;
                if (n4 == string.length()) break;
            }
            n2 = n6 + 1;
        }
        if (n4 == n3) {
            parsePosition.setErrorIndex(n3);
        } else {
            parsePosition.setIndex(n4);
        }
        return d2;
    }

    private static int a(et et2, int n2, int n3, String string, int n4) {
        int n5 = 0;
        String string2 = et2.d();
        int n6 = et2.a(n2).d();
        while (true) {
            ex ex2 = et2.a(++n2);
            if (n2 != n3 && ex2.a() != ey.c) continue;
            int n7 = ex2.b();
            int n8 = n7 - n6;
            if (n8 != 0 && !string.regionMatches(n4, string2, n6, n8)) {
                return -1;
            }
            n5 += n8;
            if (n2 == n3) {
                return n5;
            }
            n6 = ex2.d();
        }
    }

    private void a(Object object, ep ep2, FieldPosition fieldPosition) {
        if (object == null || object instanceof Map) {
            this.a(null, (Map)object, ep2, fieldPosition);
        } else {
            this.a((Object[])object, null, ep2, fieldPosition);
        }
    }

    private void a(Object[] arrobject, Map map, ep ep2, FieldPosition fieldPosition) {
        if (arrobject != null && this.d.e()) {
            throw new IllegalArgumentException("This method is not available in MessageFormat objects that use alphanumeric argument names.");
        }
        this.a(0, 0.0, arrobject, map, ep2, fieldPosition);
    }

    private void i() {
        if (this.d != null) {
            this.d.a();
        }
        if (this.e != null) {
            this.e.clear();
        }
        this.f = null;
    }

    private Format a(String string, String string2) {
        kv kv2 = null;
        int n2 = eo.a(string, k);
        block3 : switch (n2) {
            case 0: {
                switch (eo.a(string2, r)) {
                    case 0: {
                        kv2 = gq.a(this.c);
                        break block3;
                    }
                    case 1: {
                        kv2 = gq.d(this.c);
                        break block3;
                    }
                    case 2: {
                        kv2 = gq.e(this.c);
                        break block3;
                    }
                    case 3: {
                        kv2 = gq.c(this.c);
                        break block3;
                    }
                }
                kv2 = new dm(string2, new dp(this.c));
                break;
            }
            case 1: {
                switch (eo.a(string2, w)) {
                    case 0: {
                        kv2 = cu.b(2, this.c);
                        break block3;
                    }
                    case 1: {
                        kv2 = cu.b(3, this.c);
                        break block3;
                    }
                    case 2: {
                        kv2 = cu.b(2, this.c);
                        break block3;
                    }
                    case 3: {
                        kv2 = cu.b(1, this.c);
                        break block3;
                    }
                    case 4: {
                        kv2 = cu.b(0, this.c);
                        break block3;
                    }
                }
                kv2 = new iz(string2, this.c);
                break;
            }
            case 2: {
                switch (eo.a(string2, w)) {
                    case 0: {
                        kv2 = cu.a(2, this.c);
                        break block3;
                    }
                    case 1: {
                        kv2 = cu.a(3, this.c);
                        break block3;
                    }
                    case 2: {
                        kv2 = cu.a(2, this.c);
                        break block3;
                    }
                    case 3: {
                        kv2 = cu.a(1, this.c);
                        break block3;
                    }
                    case 4: {
                        kv2 = cu.a(0, this.c);
                        break block3;
                    }
                }
                kv2 = new iz(string2, this.c);
                break;
            }
            case 3: {
                iu iu2 = new iu(this.c, 1);
                String string3 = string2.trim();
                if (string3.length() != 0) {
                    try {
                        iu2.b(string3);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                kv2 = iu2;
                break;
            }
            case 4: {
                iu iu3 = new iu(this.c, 2);
                String string4 = string2.trim();
                if (string4.length() != 0) {
                    try {
                        iu3.b(string4);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                kv2 = iu3;
                break;
            }
            case 5: {
                iu iu4 = new iu(this.c, 3);
                String string5 = string2.trim();
                if (string5.length() != 0) {
                    try {
                        iu4.b(string5);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                kv2 = iu4;
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown format type \"" + string + "\"");
            }
        }
        return kv2;
    }

    private static final int a(String string, String[] arrstring) {
        string = eb.a(string).toLowerCase(C);
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            if (!string.equals(arrstring[i2])) continue;
            return i2;
        }
        return -1;
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.c.C());
        if (this.d == null) {
            this.d = new et();
        }
        objectOutputStream.writeObject((Object)this.d.b());
        objectOutputStream.writeObject(this.d.d());
        if (this.f == null || this.f.isEmpty()) {
            objectOutputStream.writeInt(0);
        } else {
            objectOutputStream.writeInt(this.f.size());
            int n2 = 0;
            int n3 = 0;
            while ((n3 = this.a(n3)) >= 0) {
                if (this.f.contains(n3)) {
                    objectOutputStream.writeInt(n2);
                    objectOutputStream.writeObject(this.e.get(n3));
                }
                ++n2;
            }
        }
        objectOutputStream.writeInt(0);
    }

    private void a(ObjectInputStream objectInputStream) {
        int n2;
        String string;
        objectInputStream.defaultReadObject();
        String string2 = (String)objectInputStream.readObject();
        this.c = dn.q(string2);
        ev ev2 = (ev)((Object)objectInputStream.readObject());
        if (this.d == null || ev2 != this.d.b()) {
            this.d = new et(ev2);
        }
        if ((string = (String)objectInputStream.readObject()) != null) {
            this.a(string);
        }
        for (n2 = objectInputStream.readInt(); n2 > 0; --n2) {
            int n3 = objectInputStream.readInt();
            Format format = (Format)objectInputStream.readObject();
            this.b(n3, format);
        }
        for (n2 = objectInputStream.readInt(); n2 > 0; --n2) {
            objectInputStream.readInt();
            objectInputStream.readObject();
        }
    }

    private void j() {
        if (this.e != null) {
            this.e.clear();
        }
        this.f = null;
        int n2 = this.d.k() - 2;
        for (int i2 = 1; i2 < n2; ++i2) {
            ew ew2;
            ex ex2 = this.d.a(i2);
            if (ex2.a() != ey.f || (ew2 = ex2.f()) != ew.b) continue;
            int n3 = i2;
            i2 += 2;
            String string = this.d.a(this.d.a(i2++));
            String string2 = "";
            ex2 = this.d.a(i2);
            if (ex2.a() == ey.k) {
                string2 = this.d.a(ex2);
                ++i2;
            }
            Format format = this.a(string, string2);
            this.c(n3, format);
        }
    }

    private void c(int n2, Format format) {
        if (this.e == null) {
            this.e = new HashMap();
        }
        this.e.put(n2, format);
    }

    private void d(int n2, Format format) {
        this.c(n2, format);
        if (this.f == null) {
            this.f = new HashSet();
        }
        this.f.add(n2);
    }

    public static String e(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.length() * 2);
        int n2 = 0;
        int n3 = 0;
        int n4 = string.length();
        for (int i2 = 0; i2 < n4; ++i2) {
            char c2 = string.charAt(i2);
            block0 : switch (n2) {
                case 0: {
                    switch (c2) {
                        case '\'': {
                            n2 = 1;
                            break block0;
                        }
                        case '{': {
                            n2 = 3;
                            ++n3;
                        }
                    }
                    break;
                }
                case 1: {
                    switch (c2) {
                        case '\'': {
                            n2 = 0;
                            break block0;
                        }
                        case '{': 
                        case '}': {
                            n2 = 2;
                            break block0;
                        }
                    }
                    stringBuilder.append('\'');
                    n2 = 0;
                    break;
                }
                case 2: {
                    switch (c2) {
                        case '\'': {
                            n2 = 0;
                        }
                    }
                    break;
                }
                case 3: {
                    switch (c2) {
                        case '{': {
                            ++n3;
                            break block0;
                        }
                        case '}': {
                            if (--n3 != 0) break;
                            n2 = 0;
                        }
                    }
                    break;
                }
            }
            stringBuilder.append(c2);
        }
        if (n2 == 1 || n2 == 2) {
            stringBuilder.append('\'');
        }
        return new String(stringBuilder);
    }
}

