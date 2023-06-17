/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.commons.c.i.aa;
import org.apache.commons.c.i.ab;
import org.apache.commons.c.i.ac;
import org.apache.commons.c.i.ad;
import org.apache.commons.c.i.ae;
import org.apache.commons.c.i.af;
import org.apache.commons.c.i.ag;
import org.apache.commons.c.i.ah;
import org.apache.commons.c.i.ai;
import org.apache.commons.c.i.aj;
import org.apache.commons.c.i.c;
import org.apache.commons.c.i.u;
import org.apache.commons.c.i.v;
import org.apache.commons.c.i.w;
import org.apache.commons.c.i.x;
import org.apache.commons.c.i.y;
import org.apache.commons.c.i.z;

public class t
implements Serializable,
c {
    private static final long e = 1L;
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    private final String f;
    private final TimeZone g;
    private final Locale h;
    private transient x[] i;
    private transient int j;
    private static final ConcurrentMap k = new ConcurrentHashMap(7);

    protected t(String string, TimeZone timeZone, Locale locale) {
        this.f = string;
        this.g = timeZone;
        this.h = locale;
        this.f();
    }

    private void f() {
        List list = this.d();
        this.i = list.toArray(new x[list.size()]);
        int n2 = 0;
        int n3 = this.i.length;
        while (--n3 >= 0) {
            n2 += this.i[n3].a();
        }
        this.j = n2;
    }

    protected List d() {
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(this.h);
        ArrayList<ah> arrayList = new ArrayList<ah>();
        String[] arrstring = dateFormatSymbols.getEras();
        String[] arrstring2 = dateFormatSymbols.getMonths();
        String[] arrstring3 = dateFormatSymbols.getShortMonths();
        String[] arrstring4 = dateFormatSymbols.getWeekdays();
        String[] arrstring5 = dateFormatSymbols.getShortWeekdays();
        String[] arrstring6 = dateFormatSymbols.getAmPmStrings();
        int n2 = this.f.length();
        int[] arrn = new int[1];
        for (int i2 = 0; i2 < n2; ++i2) {
            x x2;
            arrn[0] = i2;
            String string = this.a(this.f, arrn);
            i2 = arrn[0];
            int n3 = string.length();
            if (n3 == 0) break;
            char c2 = string.charAt(0);
            switch (c2) {
                case 'G': {
                    x2 = new z(0, arrstring);
                    break;
                }
                case 'y': {
                    if (n3 == 2) {
                        x2 = ah.a;
                        break;
                    }
                    x2 = this.a(1, n3 < 4 ? 4 : n3);
                    break;
                }
                case 'M': {
                    if (n3 >= 4) {
                        x2 = new z(2, arrstring2);
                        break;
                    }
                    if (n3 == 3) {
                        x2 = new z(2, arrstring3);
                        break;
                    }
                    if (n3 == 2) {
                        x2 = af.a;
                        break;
                    }
                    x2 = ai.a;
                    break;
                }
                case 'd': {
                    x2 = this.a(5, n3);
                    break;
                }
                case 'h': {
                    x2 = new ad(this.a(10, n3));
                    break;
                }
                case 'H': {
                    x2 = this.a(11, n3);
                    break;
                }
                case 'm': {
                    x2 = this.a(12, n3);
                    break;
                }
                case 's': {
                    x2 = this.a(13, n3);
                    break;
                }
                case 'S': {
                    x2 = this.a(14, n3);
                    break;
                }
                case 'E': {
                    x2 = new z(7, n3 < 4 ? arrstring5 : arrstring4);
                    break;
                }
                case 'D': {
                    x2 = this.a(6, n3);
                    break;
                }
                case 'F': {
                    x2 = this.a(8, n3);
                    break;
                }
                case 'w': {
                    x2 = this.a(3, n3);
                    break;
                }
                case 'W': {
                    x2 = this.a(4, n3);
                    break;
                }
                case 'a': {
                    x2 = new z(9, arrstring6);
                    break;
                }
                case 'k': {
                    x2 = new ae(this.a(11, n3));
                    break;
                }
                case 'K': {
                    x2 = this.a(10, n3);
                    break;
                }
                case 'z': {
                    if (n3 >= 4) {
                        x2 = new ab(this.g, this.h, 1);
                        break;
                    }
                    x2 = new ab(this.g, this.h, 0);
                    break;
                }
                case 'Z': {
                    if (n3 == 1) {
                        x2 = ac.b;
                        break;
                    }
                    x2 = ac.a;
                    break;
                }
                case '\'': {
                    String string2 = string.substring(1);
                    if (string2.length() == 1) {
                        x2 = new u(string2.charAt(0));
                        break;
                    }
                    x2 = new y(string2);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Illegal pattern component: " + string);
                }
            }
            arrayList.add((ah)x2);
        }
        return arrayList;
    }

    protected String a(String string, int[] arrn) {
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = string.length();
        char c2 = string.charAt(n2);
        if (c2 >= 'A' && c2 <= 'Z' || c2 >= 'a' && c2 <= 'z') {
            char c3;
            stringBuilder.append(c2);
            while (n2 + 1 < n3 && (c3 = string.charAt(n2 + 1)) == c2) {
                stringBuilder.append(c2);
                ++n2;
            }
        } else {
            stringBuilder.append('\'');
            boolean bl2 = false;
            for (n2 = arrn[0]; n2 < n3; ++n2) {
                c2 = string.charAt(n2);
                if (c2 == '\'') {
                    if (n2 + 1 < n3 && string.charAt(n2 + 1) == '\'') {
                        ++n2;
                        stringBuilder.append(c2);
                        continue;
                    }
                    bl2 = !bl2;
                    continue;
                }
                if (bl2 || (c2 < 'A' || c2 > 'Z') && (c2 < 'a' || c2 > 'z')) {
                    stringBuilder.append(c2);
                    continue;
                }
                break;
            }
        }
        arrn[0] = --n2;
        return stringBuilder.toString();
    }

    protected v a(int n2, int n3) {
        switch (n3) {
            case 1: {
                return new aj(n2);
            }
            case 2: {
                return new ag(n2);
            }
        }
        return new w(n2, n3);
    }

    @Override
    public StringBuffer format(Object object, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (object instanceof Date) {
            return this.a((Date)object, stringBuffer);
        }
        if (object instanceof Calendar) {
            return this.a((Calendar)object, stringBuffer);
        }
        if (object instanceof Long) {
            return this.a((Long)object, stringBuffer);
        }
        throw new IllegalArgumentException("Unknown class: " + (object == null ? "<null>" : object.getClass().getName()));
    }

    @Override
    public String a(long l2) {
        GregorianCalendar gregorianCalendar = this.g();
        gregorianCalendar.setTimeInMillis(l2);
        return this.b(gregorianCalendar);
    }

    private String b(Calendar calendar) {
        return this.b(calendar, new StringBuffer(this.j)).toString();
    }

    private GregorianCalendar g() {
        return new GregorianCalendar(this.g, this.h);
    }

    @Override
    public String a(Date date) {
        GregorianCalendar gregorianCalendar = this.g();
        gregorianCalendar.setTime(date);
        return this.b(gregorianCalendar);
    }

    @Override
    public String a(Calendar calendar) {
        return this.a(calendar, new StringBuffer(this.j)).toString();
    }

    @Override
    public StringBuffer a(long l2, StringBuffer stringBuffer) {
        return this.a(new Date(l2), stringBuffer);
    }

    @Override
    public StringBuffer a(Date date, StringBuffer stringBuffer) {
        GregorianCalendar gregorianCalendar = this.g();
        gregorianCalendar.setTime(date);
        return this.b(gregorianCalendar, stringBuffer);
    }

    @Override
    public StringBuffer a(Calendar calendar, StringBuffer stringBuffer) {
        return this.b(calendar, stringBuffer);
    }

    protected StringBuffer b(Calendar calendar, StringBuffer stringBuffer) {
        for (x x2 : this.i) {
            x2.a(stringBuffer, calendar);
        }
        return stringBuffer;
    }

    @Override
    public String a() {
        return this.f;
    }

    @Override
    public TimeZone b() {
        return this.g;
    }

    @Override
    public Locale c() {
        return this.h;
    }

    public int e() {
        return this.j;
    }

    public boolean equals(Object object) {
        if (!(object instanceof t)) {
            return false;
        }
        t t2 = (t)object;
        return this.f.equals(t2.f) && this.g.equals(t2.g) && this.h.equals(t2.h);
    }

    public int hashCode() {
        return this.f.hashCode() + 13 * (this.g.hashCode() + 13 * this.h.hashCode());
    }

    public String toString() {
        return "FastDatePrinter[" + this.f + "," + this.h + "," + this.g.getID() + "]";
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f();
    }

    static String a(TimeZone timeZone, boolean bl2, int n2, Locale locale) {
        String string;
        aa aa2 = new aa(timeZone, bl2, n2, locale);
        String string2 = (String)k.get(aa2);
        if (string2 == null && (string = k.putIfAbsent(aa2, string2 = timeZone.getDisplayName(bl2, n2, locale))) != null) {
            string2 = string;
        }
        return string2;
    }
}

