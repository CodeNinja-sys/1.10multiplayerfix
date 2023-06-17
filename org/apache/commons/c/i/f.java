/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.apache.commons.c.am;
import org.apache.commons.c.i.g;

public class f {
    public static final String a = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'";
    static final Object b = "y";
    static final Object c = "M";
    static final Object d = "d";
    static final Object e = "H";
    static final Object f = "m";
    static final Object g = "s";
    static final Object h = "S";

    public static String a(long l2) {
        return org.apache.commons.c.i.f.a(l2, "H:mm:ss.SSS");
    }

    public static String b(long l2) {
        return org.apache.commons.c.i.f.a(l2, a, false);
    }

    public static String a(long l2, String string) {
        return org.apache.commons.c.i.f.a(l2, string, true);
    }

    public static String a(long l2, String string, boolean bl2) {
        g[] arrg = org.apache.commons.c.i.f.a(string);
        long l3 = 0L;
        long l4 = 0L;
        long l5 = 0L;
        long l6 = 0L;
        long l7 = l2;
        if (org.apache.commons.c.i.g.a(arrg, d)) {
            l3 = l7 / 86400000L;
            l7 -= l3 * 86400000L;
        }
        if (org.apache.commons.c.i.g.a(arrg, e)) {
            l4 = l7 / 3600000L;
            l7 -= l4 * 3600000L;
        }
        if (org.apache.commons.c.i.g.a(arrg, f)) {
            l5 = l7 / 60000L;
            l7 -= l5 * 60000L;
        }
        if (org.apache.commons.c.i.g.a(arrg, g)) {
            l6 = l7 / 1000L;
            l7 -= l6 * 1000L;
        }
        return org.apache.commons.c.i.f.a(arrg, 0L, 0L, l3, l4, l5, l6, l7, bl2);
    }

    public static String a(long l2, boolean bl2, boolean bl3) {
        String string;
        String string2 = org.apache.commons.c.i.f.a(l2, "d' days 'H' hours 'm' minutes 's' seconds'");
        if (bl2) {
            string2 = " " + string2;
            string = am.c(string2, " 0 days", "");
            if (string.length() != string2.length() && (string = am.c(string2 = string, " 0 hours", "")).length() != string2.length()) {
                string2 = string;
                string2 = string = am.c(string2, " 0 minutes", "");
                if (string.length() != string2.length()) {
                    string2 = am.c(string, " 0 seconds", "");
                }
            }
            if (string2.length() != 0) {
                string2 = string2.substring(1);
            }
        }
        if (bl3 && (string = am.c(string2, " 0 seconds", "")).length() != string2.length() && (string = am.c(string2 = string, " 0 minutes", "")).length() != string2.length() && (string = am.c(string2 = string, " 0 hours", "")).length() != string2.length()) {
            string2 = am.c(string, " 0 days", "");
        }
        string2 = " " + string2;
        string2 = am.c(string2, " 1 seconds", " 1 second");
        string2 = am.c(string2, " 1 minutes", " 1 minute");
        string2 = am.c(string2, " 1 hours", " 1 hour");
        string2 = am.c(string2, " 1 days", " 1 day");
        return string2.trim();
    }

    public static String a(long l2, long l3) {
        return org.apache.commons.c.i.f.a(l2, l3, a, false, TimeZone.getDefault());
    }

    public static String a(long l2, long l3, String string) {
        return org.apache.commons.c.i.f.a(l2, l3, string, true, TimeZone.getDefault());
    }

    public static String a(long l2, long l3, String string, boolean bl2, TimeZone timeZone) {
        g[] arrg = org.apache.commons.c.i.f.a(string);
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTime(new Date(l2));
        Calendar calendar2 = Calendar.getInstance(timeZone);
        calendar2.setTime(new Date(l3));
        int n2 = calendar2.get(14) - calendar.get(14);
        int n3 = calendar2.get(13) - calendar.get(13);
        int n4 = calendar2.get(12) - calendar.get(12);
        int n5 = calendar2.get(11) - calendar.get(11);
        int n6 = calendar2.get(5) - calendar.get(5);
        int n7 = calendar2.get(2) - calendar.get(2);
        int n8 = calendar2.get(1) - calendar.get(1);
        while (n2 < 0) {
            n2 += 1000;
            --n3;
        }
        while (n3 < 0) {
            n3 += 60;
            --n4;
        }
        while (n4 < 0) {
            n4 += 60;
            --n5;
        }
        while (n5 < 0) {
            n5 += 24;
            --n6;
        }
        if (org.apache.commons.c.i.g.a(arrg, c)) {
            while (n6 < 0) {
                n6 += calendar.getActualMaximum(5);
                --n7;
                calendar.add(2, 1);
            }
            while (n7 < 0) {
                n7 += 12;
                --n8;
            }
            if (!org.apache.commons.c.i.g.a(arrg, b) && n8 != 0) {
                while (n8 != 0) {
                    n7 += 12 * n8;
                    n8 = 0;
                }
            }
        } else {
            if (!org.apache.commons.c.i.g.a(arrg, b)) {
                int n9 = calendar2.get(1);
                if (n7 < 0) {
                    --n9;
                }
                while (calendar.get(1) != n9) {
                    n6 += calendar.getActualMaximum(6) - calendar.get(6);
                    if (calendar instanceof GregorianCalendar && calendar.get(2) == 1 && calendar.get(5) == 29) {
                        ++n6;
                    }
                    calendar.add(1, 1);
                    n6 += calendar.get(6);
                }
                n8 = 0;
            }
            while (calendar.get(2) != calendar2.get(2)) {
                n6 += calendar.getActualMaximum(5);
                calendar.add(2, 1);
            }
            n7 = 0;
            while (n6 < 0) {
                n6 += calendar.getActualMaximum(5);
                --n7;
                calendar.add(2, 1);
            }
        }
        if (!org.apache.commons.c.i.g.a(arrg, d)) {
            n5 += 24 * n6;
            n6 = 0;
        }
        if (!org.apache.commons.c.i.g.a(arrg, e)) {
            n4 += 60 * n5;
            n5 = 0;
        }
        if (!org.apache.commons.c.i.g.a(arrg, f)) {
            n3 += 60 * n4;
            n4 = 0;
        }
        if (!org.apache.commons.c.i.g.a(arrg, g)) {
            n2 += 1000 * n3;
            n3 = 0;
        }
        return org.apache.commons.c.i.f.a(arrg, n8, n7, n6, n5, n4, n3, n2, bl2);
    }

    static String a(g[] arrg, long l2, long l3, long l4, long l5, long l6, long l7, long l8, boolean bl2) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl3 = false;
        for (g g2 : arrg) {
            Object object = g2.c();
            int n2 = g2.b();
            if (object instanceof StringBuilder) {
                stringBuilder.append(object.toString());
                continue;
            }
            if (object == b) {
                stringBuilder.append(org.apache.commons.c.i.f.a(l2, bl2, n2));
                bl3 = false;
                continue;
            }
            if (object == c) {
                stringBuilder.append(org.apache.commons.c.i.f.a(l3, bl2, n2));
                bl3 = false;
                continue;
            }
            if (object == d) {
                stringBuilder.append(org.apache.commons.c.i.f.a(l4, bl2, n2));
                bl3 = false;
                continue;
            }
            if (object == e) {
                stringBuilder.append(org.apache.commons.c.i.f.a(l5, bl2, n2));
                bl3 = false;
                continue;
            }
            if (object == f) {
                stringBuilder.append(org.apache.commons.c.i.f.a(l6, bl2, n2));
                bl3 = false;
                continue;
            }
            if (object == g) {
                stringBuilder.append(org.apache.commons.c.i.f.a(l7, bl2, n2));
                bl3 = true;
                continue;
            }
            if (object != h) continue;
            if (bl3) {
                int n3 = bl2 ? Math.max(3, n2) : 3;
                stringBuilder.append(org.apache.commons.c.i.f.a(l8, true, n3));
            } else {
                stringBuilder.append(org.apache.commons.c.i.f.a(l8, bl2, n2));
            }
            bl3 = false;
        }
        return stringBuilder.toString();
    }

    private static String a(long l2, boolean bl2, int n2) {
        String string = Long.toString(l2);
        return bl2 ? am.b(string, n2, '0') : string;
    }

    static g[] a(String string) {
        ArrayList<g> arrayList = new ArrayList<g>(string.length());
        boolean bl2 = false;
        StringBuilder stringBuilder = null;
        g g2 = null;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (bl2 && c2 != '\'') {
                stringBuilder.append(c2);
                continue;
            }
            Object object = null;
            switch (c2) {
                case '\'': {
                    if (bl2) {
                        stringBuilder = null;
                        bl2 = false;
                        break;
                    }
                    stringBuilder = new StringBuilder();
                    arrayList.add(new g(stringBuilder));
                    bl2 = true;
                    break;
                }
                case 'y': {
                    object = b;
                    break;
                }
                case 'M': {
                    object = c;
                    break;
                }
                case 'd': {
                    object = d;
                    break;
                }
                case 'H': {
                    object = e;
                    break;
                }
                case 'm': {
                    object = f;
                    break;
                }
                case 's': {
                    object = g;
                    break;
                }
                case 'S': {
                    object = h;
                    break;
                }
                default: {
                    if (stringBuilder == null) {
                        stringBuilder = new StringBuilder();
                        arrayList.add(new g(stringBuilder));
                    }
                    stringBuilder.append(c2);
                }
            }
            if (object == null) continue;
            if (g2 != null && g2.c() == object) {
                g2.a();
            } else {
                g g3 = new g(object);
                arrayList.add(g3);
                g2 = g3;
            }
            stringBuilder = null;
        }
        if (bl2) {
            throw new IllegalArgumentException("Unmatched quote in format: " + string);
        }
        return arrayList.toArray(new g[arrayList.size()]);
    }
}

