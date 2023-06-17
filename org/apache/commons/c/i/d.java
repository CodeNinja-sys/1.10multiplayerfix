/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.c.i.e;

public class d {
    public static final long a = 1000L;
    public static final long b = 60000L;
    public static final long c = 3600000L;
    public static final long d = 86400000L;
    public static final int e = 1001;
    private static final int[][] l = new int[][]{{14}, {13}, {12}, {11, 10}, {5, 5, 9}, {2, 1001}, {1}, {0}};
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;
    public static final int j = 5;
    public static final int k = 6;
    private static final int m = 0;
    private static final int n = 1;
    private static final int o = 2;

    public static boolean a(Date date, Date date2) {
        if (date == null || date2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return org.apache.commons.c.i.d.a(calendar, calendar2);
    }

    public static boolean a(Calendar calendar, Calendar calendar2) {
        if (calendar == null || calendar2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        return calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    public static boolean b(Date date, Date date2) {
        if (date == null || date2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        return date.getTime() == date2.getTime();
    }

    public static boolean b(Calendar calendar, Calendar calendar2) {
        if (calendar == null || calendar2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        return calendar.getTime().getTime() == calendar2.getTime().getTime();
    }

    public static boolean c(Calendar calendar, Calendar calendar2) {
        if (calendar == null || calendar2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        return calendar.get(14) == calendar2.get(14) && calendar.get(13) == calendar2.get(13) && calendar.get(12) == calendar2.get(12) && calendar.get(11) == calendar2.get(11) && calendar.get(6) == calendar2.get(6) && calendar.get(1) == calendar2.get(1) && calendar.get(0) == calendar2.get(0) && calendar.getClass() == calendar2.getClass();
    }

    public static Date a(String string, String ... arrstring) {
        return org.apache.commons.c.i.d.a(string, null, arrstring);
    }

    public static Date a(String string, Locale locale, String ... arrstring) {
        return org.apache.commons.c.i.d.a(string, locale, arrstring, true);
    }

    public static Date b(String string, String ... arrstring) {
        return org.apache.commons.c.i.d.b(string, null, arrstring);
    }

    public static Date b(String string, Locale locale, String ... arrstring) {
        return org.apache.commons.c.i.d.a(string, null, arrstring, false);
    }

    private static Date a(String string, Locale locale, String[] arrstring, boolean bl2) {
        if (string == null || arrstring == null) {
            throw new IllegalArgumentException("Date and Patterns must not be null");
        }
        SimpleDateFormat simpleDateFormat = locale == null ? new SimpleDateFormat() : new SimpleDateFormat("", locale);
        simpleDateFormat.setLenient(bl2);
        ParsePosition parsePosition = new ParsePosition(0);
        String[] arrstring2 = arrstring;
        int n2 = arrstring2.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Date date;
            String string2;
            String string3 = string2 = arrstring2[i2];
            if (string2.endsWith("ZZ")) {
                string3 = string3.substring(0, string3.length() - 1);
            }
            simpleDateFormat.applyPattern(string3);
            parsePosition.setIndex(0);
            String string4 = string;
            if (string2.endsWith("ZZ")) {
                string4 = string.replaceAll("([-+][0-9][0-9]):([0-9][0-9])$", "$1$2");
            }
            if ((date = simpleDateFormat.parse(string4, parsePosition)) == null || parsePosition.getIndex() != string4.length()) continue;
            return date;
        }
        throw new ParseException("Unable to parse the date: " + string, -1);
    }

    public static Date a(Date date, int n2) {
        return org.apache.commons.c.i.d.a(date, 1, n2);
    }

    public static Date b(Date date, int n2) {
        return org.apache.commons.c.i.d.a(date, 2, n2);
    }

    public static Date c(Date date, int n2) {
        return org.apache.commons.c.i.d.a(date, 3, n2);
    }

    public static Date d(Date date, int n2) {
        return org.apache.commons.c.i.d.a(date, 5, n2);
    }

    public static Date e(Date date, int n2) {
        return org.apache.commons.c.i.d.a(date, 11, n2);
    }

    public static Date f(Date date, int n2) {
        return org.apache.commons.c.i.d.a(date, 12, n2);
    }

    public static Date g(Date date, int n2) {
        return org.apache.commons.c.i.d.a(date, 13, n2);
    }

    public static Date h(Date date, int n2) {
        return org.apache.commons.c.i.d.a(date, 14, n2);
    }

    private static Date a(Date date, int n2, int n3) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(n2, n3);
        return calendar.getTime();
    }

    public static Date i(Date date, int n2) {
        return org.apache.commons.c.i.d.b(date, 1, n2);
    }

    public static Date j(Date date, int n2) {
        return org.apache.commons.c.i.d.b(date, 2, n2);
    }

    public static Date k(Date date, int n2) {
        return org.apache.commons.c.i.d.b(date, 5, n2);
    }

    public static Date l(Date date, int n2) {
        return org.apache.commons.c.i.d.b(date, 11, n2);
    }

    public static Date m(Date date, int n2) {
        return org.apache.commons.c.i.d.b(date, 12, n2);
    }

    public static Date n(Date date, int n2) {
        return org.apache.commons.c.i.d.b(date, 13, n2);
    }

    public static Date o(Date date, int n2) {
        return org.apache.commons.c.i.d.b(date, 14, n2);
    }

    private static Date b(Date date, int n2, int n3) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setLenient(false);
        calendar.setTime(date);
        calendar.set(n2, n3);
        return calendar.getTime();
    }

    public static Calendar a(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static Date p(Date date, int n2) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        org.apache.commons.c.i.d.a(calendar, n2, 1);
        return calendar.getTime();
    }

    public static Calendar a(Calendar calendar, int n2) {
        if (calendar == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar2 = (Calendar)calendar.clone();
        org.apache.commons.c.i.d.a(calendar2, n2, 1);
        return calendar2;
    }

    public static Date a(Object object, int n2) {
        if (object == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        if (object instanceof Date) {
            return org.apache.commons.c.i.d.p((Date)object, n2);
        }
        if (object instanceof Calendar) {
            return org.apache.commons.c.i.d.a((Calendar)object, n2).getTime();
        }
        throw new ClassCastException("Could not round " + object);
    }

    public static Date q(Date date, int n2) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        org.apache.commons.c.i.d.a(calendar, n2, 0);
        return calendar.getTime();
    }

    public static Calendar b(Calendar calendar, int n2) {
        if (calendar == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar2 = (Calendar)calendar.clone();
        org.apache.commons.c.i.d.a(calendar2, n2, 0);
        return calendar2;
    }

    public static Date b(Object object, int n2) {
        if (object == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        if (object instanceof Date) {
            return org.apache.commons.c.i.d.q((Date)object, n2);
        }
        if (object instanceof Calendar) {
            return org.apache.commons.c.i.d.b((Calendar)object, n2).getTime();
        }
        throw new ClassCastException("Could not truncate " + object);
    }

    public static Date r(Date date, int n2) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        org.apache.commons.c.i.d.a(calendar, n2, 2);
        return calendar.getTime();
    }

    public static Calendar c(Calendar calendar, int n2) {
        if (calendar == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar2 = (Calendar)calendar.clone();
        org.apache.commons.c.i.d.a(calendar2, n2, 2);
        return calendar2;
    }

    public static Date c(Object object, int n2) {
        if (object == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        if (object instanceof Date) {
            return org.apache.commons.c.i.d.r((Date)object, n2);
        }
        if (object instanceof Calendar) {
            return org.apache.commons.c.i.d.c((Calendar)object, n2).getTime();
        }
        throw new ClassCastException("Could not find ceiling of for type: " + object.getClass());
    }

    private static void a(Calendar calendar, int n2, int n3) {
        if (calendar.get(1) > 280000000) {
            throw new ArithmeticException("Calendar value too large for accurate calculations");
        }
        if (n2 == 14) {
            return;
        }
        Date date = calendar.getTime();
        long l2 = date.getTime();
        boolean bl2 = false;
        int n4 = calendar.get(14);
        if (0 == n3 || n4 < 500) {
            l2 -= (long)n4;
        }
        if (n2 == 13) {
            bl2 = true;
        }
        int n5 = calendar.get(13);
        if (!(bl2 || 0 != n3 && n5 >= 30)) {
            l2 -= (long)n5 * 1000L;
        }
        if (n2 == 12) {
            bl2 = true;
        }
        int n6 = calendar.get(12);
        if (!(bl2 || 0 != n3 && n6 >= 30)) {
            l2 -= (long)n6 * 60000L;
        }
        if (date.getTime() != l2) {
            date.setTime(l2);
            calendar.setTime(date);
        }
        boolean bl3 = false;
        int[][] arrn = l;
        int n7 = arrn.length;
        for (int i2 = 0; i2 < n7; ++i2) {
            int[] arrn2;
            for (int n8 : arrn2 = arrn[i2]) {
                if (n8 != n2) continue;
                if (n3 == 2 || n3 == 1 && bl3) {
                    if (n2 == 1001) {
                        if (calendar.get(5) == 1) {
                            calendar.add(5, 15);
                        } else {
                            calendar.add(5, -15);
                            calendar.add(2, 1);
                        }
                    } else if (n2 == 9) {
                        if (calendar.get(11) == 0) {
                            calendar.add(11, 12);
                        } else {
                            calendar.add(11, -12);
                            calendar.add(5, 1);
                        }
                    } else {
                        calendar.add(arrn2[0], 1);
                    }
                }
                return;
            }
            int n9 = 0;
            int n10 = 0;
            switch (n2) {
                case 1001: {
                    if (arrn2[0] != 5) break;
                    n9 = calendar.get(5) - 1;
                    if (n9 >= 15) {
                        n9 -= 15;
                    }
                    bl3 = n9 > 7;
                    n10 = 1;
                    break;
                }
                case 9: {
                    if (arrn2[0] != 11) break;
                    n9 = calendar.get(11);
                    if (n9 >= 12) {
                        n9 -= 12;
                    }
                    bl3 = n9 >= 6;
                    n10 = 1;
                    break;
                }
            }
            if (n10 == 0) {
                int n8;
                int n11 = calendar.getActualMinimum(arrn2[0]);
                n8 = calendar.getActualMaximum(arrn2[0]);
                n9 = calendar.get(arrn2[0]) - n11;
                boolean bl4 = bl3 = n9 > (n8 - n11) / 2;
            }
            if (n9 == 0) continue;
            calendar.set(arrn2[0], calendar.get(arrn2[0]) - n9);
        }
        throw new IllegalArgumentException("The field " + n2 + " is not supported");
    }

    public static Iterator s(Date date, int n2) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return org.apache.commons.c.i.d.d(calendar, n2);
    }

    public static Iterator d(Calendar calendar, int n2) {
        if (calendar == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar2 = null;
        Calendar calendar3 = null;
        int n3 = 1;
        int n4 = 7;
        block0 : switch (n2) {
            case 5: 
            case 6: {
                calendar2 = org.apache.commons.c.i.d.b(calendar, 2);
                calendar3 = (Calendar)calendar2.clone();
                calendar3.add(2, 1);
                calendar3.add(5, -1);
                if (n2 != 6) break;
                n3 = 2;
                n4 = 1;
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                calendar2 = org.apache.commons.c.i.d.b(calendar, 5);
                calendar3 = org.apache.commons.c.i.d.b(calendar, 5);
                switch (n2) {
                    case 1: {
                        break block0;
                    }
                    case 2: {
                        n3 = 2;
                        n4 = 1;
                        break block0;
                    }
                    case 3: {
                        n3 = calendar.get(7);
                        n4 = n3 - 1;
                        break block0;
                    }
                    case 4: {
                        n3 = calendar.get(7) - 3;
                        n4 = calendar.get(7) + 3;
                        break block0;
                    }
                }
                break;
            }
            default: {
                throw new IllegalArgumentException("The range style " + n2 + " is not valid.");
            }
        }
        if (n3 < 1) {
            n3 += 7;
        }
        if (n3 > 7) {
            n3 -= 7;
        }
        if (n4 < 1) {
            n4 += 7;
        }
        if (n4 > 7) {
            n4 -= 7;
        }
        while (calendar2.get(7) != n3) {
            calendar2.add(5, -1);
        }
        while (calendar3.get(7) != n4) {
            calendar3.add(5, 1);
        }
        return new e(calendar2, calendar3);
    }

    public static Iterator d(Object object, int n2) {
        if (object == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        if (object instanceof Date) {
            return org.apache.commons.c.i.d.s((Date)object, n2);
        }
        if (object instanceof Calendar) {
            return org.apache.commons.c.i.d.d((Calendar)object, n2);
        }
        throw new ClassCastException("Could not iterate based on " + object);
    }

    public static long t(Date date, int n2) {
        return org.apache.commons.c.i.d.a(date, n2, TimeUnit.MILLISECONDS);
    }

    public static long u(Date date, int n2) {
        return org.apache.commons.c.i.d.a(date, n2, TimeUnit.SECONDS);
    }

    public static long v(Date date, int n2) {
        return org.apache.commons.c.i.d.a(date, n2, TimeUnit.MINUTES);
    }

    public static long w(Date date, int n2) {
        return org.apache.commons.c.i.d.a(date, n2, TimeUnit.HOURS);
    }

    public static long x(Date date, int n2) {
        return org.apache.commons.c.i.d.a(date, n2, TimeUnit.DAYS);
    }

    public static long e(Calendar calendar, int n2) {
        return org.apache.commons.c.i.d.a(calendar, n2, TimeUnit.MILLISECONDS);
    }

    public static long f(Calendar calendar, int n2) {
        return org.apache.commons.c.i.d.a(calendar, n2, TimeUnit.SECONDS);
    }

    public static long g(Calendar calendar, int n2) {
        return org.apache.commons.c.i.d.a(calendar, n2, TimeUnit.MINUTES);
    }

    public static long h(Calendar calendar, int n2) {
        return org.apache.commons.c.i.d.a(calendar, n2, TimeUnit.HOURS);
    }

    public static long i(Calendar calendar, int n2) {
        return org.apache.commons.c.i.d.a(calendar, n2, TimeUnit.DAYS);
    }

    private static long a(Date date, int n2, TimeUnit timeUnit) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return org.apache.commons.c.i.d.a(calendar, n2, timeUnit);
    }

    private static long a(Calendar calendar, int n2, TimeUnit timeUnit) {
        if (calendar == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        long l2 = 0L;
        int n3 = timeUnit == TimeUnit.DAYS ? 0 : 1;
        switch (n2) {
            case 1: {
                l2 += timeUnit.convert(calendar.get(6) - n3, TimeUnit.DAYS);
                break;
            }
            case 2: {
                l2 += timeUnit.convert(calendar.get(5) - n3, TimeUnit.DAYS);
                break;
            }
        }
        switch (n2) {
            case 1: 
            case 2: 
            case 5: 
            case 6: {
                l2 += timeUnit.convert(calendar.get(11), TimeUnit.HOURS);
            }
            case 11: {
                l2 += timeUnit.convert(calendar.get(12), TimeUnit.MINUTES);
            }
            case 12: {
                l2 += timeUnit.convert(calendar.get(13), TimeUnit.SECONDS);
            }
            case 13: {
                l2 += timeUnit.convert(calendar.get(14), TimeUnit.MILLISECONDS);
                break;
            }
            case 14: {
                break;
            }
            default: {
                throw new IllegalArgumentException("The fragment " + n2 + " is not supported");
            }
        }
        return l2;
    }

    public static boolean a(Calendar calendar, Calendar calendar2, int n2) {
        return org.apache.commons.c.i.d.b(calendar, calendar2, n2) == 0;
    }

    public static boolean a(Date date, Date date2, int n2) {
        return org.apache.commons.c.i.d.b(date, date2, n2) == 0;
    }

    public static int b(Calendar calendar, Calendar calendar2, int n2) {
        Calendar calendar3 = org.apache.commons.c.i.d.b(calendar, n2);
        Calendar calendar4 = org.apache.commons.c.i.d.b(calendar2, n2);
        return calendar3.compareTo(calendar4);
    }

    public static int b(Date date, Date date2, int n2) {
        Date date3 = org.apache.commons.c.i.d.q(date, n2);
        Date date4 = org.apache.commons.c.i.d.q(date2, n2);
        return date3.compareTo(date4);
    }
}

