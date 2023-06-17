/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.c.i.b;
import org.apache.commons.c.i.k;
import org.apache.commons.c.i.l;
import org.apache.commons.c.i.m;
import org.apache.commons.c.i.n;
import org.apache.commons.c.i.o;
import org.apache.commons.c.i.p;
import org.apache.commons.c.i.q;
import org.apache.commons.c.i.r;
import org.apache.commons.c.i.s;

public class j
implements Serializable,
b {
    private static final long b = 2L;
    static final Locale a = new Locale("ja", "JP", "JP");
    private final String c;
    private final TimeZone d;
    private final Locale e;
    private final int f;
    private final int g;
    private transient Pattern h;
    private transient q[] i;
    private transient String j;
    private transient q k;
    private static final Pattern l = Pattern.compile("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++");
    private static final ConcurrentMap[] m = new ConcurrentMap[17];
    private static final q n = new k(1);
    private static final q o = new l(2);
    private static final q p = new p(1);
    private static final q q = new p(3);
    private static final q r = new p(4);
    private static final q s = new p(6);
    private static final q t = new p(5);
    private static final q u = new p(8);
    private static final q v = new p(11);
    private static final q w = new m(11);
    private static final q x = new n(10);
    private static final q y = new p(10);
    private static final q z = new p(12);
    private static final q A = new p(13);
    private static final q B = new p(14);

    protected j(String string, TimeZone timeZone, Locale locale) {
        this(string, timeZone, locale, null);
    }

    protected j(String string, TimeZone timeZone, Locale locale, Date date) {
        int n2;
        this.c = string;
        this.d = timeZone;
        this.e = locale;
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        if (date != null) {
            calendar.setTime(date);
            n2 = calendar.get(1);
        } else if (locale.equals(a)) {
            n2 = 0;
        } else {
            calendar.setTime(new Date());
            n2 = calendar.get(1) - 80;
        }
        this.f = n2 / 100 * 100;
        this.g = n2 - this.f;
        this.a(calendar);
    }

    private void a(Calendar calendar) {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<q> arrayList = new ArrayList<q>();
        Matcher matcher = l.matcher(this.c);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("Illegal pattern character '" + this.c.charAt(matcher.regionStart()) + "'");
        }
        this.j = matcher.group();
        q q2 = this.a(this.j, calendar);
        while (true) {
            matcher.region(matcher.end(), matcher.regionEnd());
            if (!matcher.lookingAt()) break;
            String string = matcher.group();
            this.k = this.a(string, calendar);
            if (q2.a(this, stringBuilder)) {
                arrayList.add(q2);
            }
            this.j = string;
            q2 = this.k;
        }
        this.k = null;
        if (matcher.regionStart() != matcher.regionEnd()) {
            throw new IllegalArgumentException("Failed to parse \"" + this.c + "\" ; gave up at index " + matcher.regionStart());
        }
        if (q2.a(this, stringBuilder)) {
            arrayList.add(q2);
        }
        this.j = null;
        this.i = arrayList.toArray(new q[arrayList.size()]);
        this.h = Pattern.compile(stringBuilder.toString());
    }

    @Override
    public String a() {
        return this.c;
    }

    @Override
    public TimeZone b() {
        return this.d;
    }

    @Override
    public Locale c() {
        return this.e;
    }

    Pattern d() {
        return this.h;
    }

    public boolean equals(Object object) {
        if (!(object instanceof j)) {
            return false;
        }
        j j2 = (j)object;
        return this.c.equals(j2.c) && this.d.equals(j2.d) && this.e.equals(j2.e);
    }

    public int hashCode() {
        return this.c.hashCode() + 13 * (this.d.hashCode() + 13 * this.e.hashCode());
    }

    public String toString() {
        return "FastDateParser[" + this.c + "," + this.e + "," + this.d.getID() + "]";
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Calendar calendar = Calendar.getInstance(this.d, this.e);
        this.a(calendar);
    }

    @Override
    public Object parseObject(String string) {
        return this.a(string);
    }

    @Override
    public Date a(String string) {
        Date date = this.a(string, new ParsePosition(0));
        if (date == null) {
            if (this.e.equals(a)) {
                throw new ParseException("(The " + this.e + " locale does not support dates before 1868 AD)\n" + "Unparseable date: \"" + string + "\" does not match " + this.h.pattern(), 0);
            }
            throw new ParseException("Unparseable date: \"" + string + "\" does not match " + this.h.pattern(), 0);
        }
        return date;
    }

    @Override
    public Object parseObject(String string, ParsePosition parsePosition) {
        return this.a(string, parsePosition);
    }

    @Override
    public Date a(String string, ParsePosition parsePosition) {
        int n2 = parsePosition.getIndex();
        Matcher matcher = this.h.matcher(string.substring(n2));
        if (!matcher.lookingAt()) {
            return null;
        }
        Calendar calendar = Calendar.getInstance(this.d, this.e);
        calendar.clear();
        int n3 = 0;
        while (n3 < this.i.length) {
            q q2 = this.i[n3++];
            q2.a(this, calendar, matcher.group(n3));
        }
        parsePosition.setIndex(n2 + matcher.end());
        return calendar.getTime();
    }

    private static StringBuilder b(StringBuilder stringBuilder, String string, boolean bl2) {
        stringBuilder.append("\\Q");
        for (int i2 = 0; i2 < string.length(); ++i2) {
            int n2 = string.charAt(i2);
            switch (n2) {
                case 39: {
                    if (!bl2) break;
                    if (++i2 == string.length()) {
                        return stringBuilder;
                    }
                    n2 = string.charAt(i2);
                    break;
                }
                case 92: {
                    if (++i2 == string.length()) break;
                    stringBuilder.append((char)n2);
                    n2 = string.charAt(i2);
                    if (n2 != 69) break;
                    stringBuilder.append("E\\\\E\\");
                    n2 = 81;
                    break;
                }
            }
            stringBuilder.append((char)n2);
        }
        stringBuilder.append("\\E");
        return stringBuilder;
    }

    private static Map b(int n2, Calendar calendar, Locale locale) {
        return calendar.getDisplayNames(n2, 0, locale);
    }

    private int a(int n2) {
        int n3 = this.f + n2;
        return n2 >= this.g ? n3 : n3 + 100;
    }

    boolean e() {
        return this.k != null && this.k.a();
    }

    int f() {
        return this.j.length();
    }

    private q a(String string, Calendar calendar) {
        switch (string.charAt(0)) {
            case '\'': {
                if (string.length() > 2) {
                    return new o(string.substring(1, string.length() - 1));
                }
            }
            default: {
                return new o(string);
            }
            case 'D': {
                return s;
            }
            case 'E': {
                return this.a(7, calendar);
            }
            case 'F': {
                return u;
            }
            case 'G': {
                return this.a(0, calendar);
            }
            case 'H': {
                return w;
            }
            case 'K': {
                return y;
            }
            case 'M': {
                return string.length() >= 3 ? this.a(2, calendar) : o;
            }
            case 'S': {
                return B;
            }
            case 'W': {
                return r;
            }
            case 'a': {
                return this.a(9, calendar);
            }
            case 'd': {
                return t;
            }
            case 'h': {
                return x;
            }
            case 'k': {
                return v;
            }
            case 'm': {
                return z;
            }
            case 's': {
                return A;
            }
            case 'w': {
                return q;
            }
            case 'y': {
                return string.length() > 2 ? p : n;
            }
            case 'Z': 
            case 'z': 
        }
        return this.a(15, calendar);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static ConcurrentMap b(int n2) {
        ConcurrentMap[] arrconcurrentMap = m;
        synchronized (m) {
            if (m[n2] == null) {
                org.apache.commons.c.i.j.m[n2] = new ConcurrentHashMap(3);
            }
            // ** MonitorExit[var1_1] (shouldn't be in output)
            return m[n2];
        }
    }

    private q a(int n2, Calendar calendar) {
        q q2;
        ConcurrentMap concurrentMap = org.apache.commons.c.i.j.b(n2);
        q q3 = (q)concurrentMap.get(this.e);
        if (q3 == null && (q2 = concurrentMap.putIfAbsent(this.e, q3 = n2 == 15 ? new s(this.e) : new r(n2, calendar, this.e))) != null) {
            return q2;
        }
        return q3;
    }

    static /* synthetic */ StringBuilder a(StringBuilder stringBuilder, String string, boolean bl2) {
        return org.apache.commons.c.i.j.b(stringBuilder, string, bl2);
    }

    static /* synthetic */ Map a(int n2, Calendar calendar, Locale locale) {
        return org.apache.commons.c.i.j.b(n2, calendar, locale);
    }

    static /* synthetic */ int a(j j2, int n2) {
        return j2.a(n2);
    }
}

