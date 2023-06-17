/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.commons.c.am;
import org.apache.commons.c.y;

public class x {
    private static final ConcurrentMap a = new ConcurrentHashMap();
    private static final ConcurrentMap b = new ConcurrentHashMap();

    public static Locale a(String string) {
        if (string == null) {
            return null;
        }
        if (string.isEmpty()) {
            return new Locale("", "");
        }
        if (string.contains("#")) {
            throw new IllegalArgumentException("Invalid locale format: " + string);
        }
        int n2 = string.length();
        if (n2 < 2) {
            throw new IllegalArgumentException("Invalid locale format: " + string);
        }
        char c2 = string.charAt(0);
        if (c2 == '_') {
            if (n2 < 3) {
                throw new IllegalArgumentException("Invalid locale format: " + string);
            }
            char c3 = string.charAt(1);
            char c4 = string.charAt(2);
            if (!Character.isUpperCase(c3) || !Character.isUpperCase(c4)) {
                throw new IllegalArgumentException("Invalid locale format: " + string);
            }
            if (n2 == 3) {
                return new Locale("", string.substring(1, 3));
            }
            if (n2 < 5) {
                throw new IllegalArgumentException("Invalid locale format: " + string);
            }
            if (string.charAt(3) != '_') {
                throw new IllegalArgumentException("Invalid locale format: " + string);
            }
            return new Locale("", string.substring(1, 3), string.substring(4));
        }
        String[] arrstring = string.split("_", -1);
        int n3 = arrstring.length - 1;
        switch (n3) {
            case 0: {
                if (am.o((CharSequence)string) && (n2 == 2 || n2 == 3)) {
                    return new Locale(string);
                }
                throw new IllegalArgumentException("Invalid locale format: " + string);
            }
            case 1: {
                if (am.o((CharSequence)arrstring[0]) && (arrstring[0].length() == 2 || arrstring[0].length() == 3) && arrstring[1].length() == 2 && am.p((CharSequence)arrstring[1])) {
                    return new Locale(arrstring[0], arrstring[1]);
                }
                throw new IllegalArgumentException("Invalid locale format: " + string);
            }
            case 2: {
                if (!am.o((CharSequence)arrstring[0]) || arrstring[0].length() != 2 && arrstring[0].length() != 3 || arrstring[1].length() != 0 && (arrstring[1].length() != 2 || !am.p((CharSequence)arrstring[1])) || arrstring[2].length() <= 0) break;
                return new Locale(arrstring[0], arrstring[1], arrstring[2]);
            }
        }
        throw new IllegalArgumentException("Invalid locale format: " + string);
    }

    public static List a(Locale locale) {
        return x.a(locale, locale);
    }

    public static List a(Locale locale, Locale locale2) {
        ArrayList<Locale> arrayList = new ArrayList<Locale>(4);
        if (locale != null) {
            arrayList.add(locale);
            if (locale.getVariant().length() > 0) {
                arrayList.add(new Locale(locale.getLanguage(), locale.getCountry()));
            }
            if (locale.getCountry().length() > 0) {
                arrayList.add(new Locale(locale.getLanguage(), ""));
            }
            if (!arrayList.contains(locale2)) {
                arrayList.add(locale2);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static List a() {
        return y.a();
    }

    public static Set b() {
        return y.b();
    }

    public static boolean b(Locale locale) {
        return x.a().contains(locale);
    }

    public static List b(String string) {
        if (string == null) {
            return Collections.emptyList();
        }
        List<Locale> list = (ArrayList)a.get(string);
        if (list == null) {
            list = new ArrayList();
            List list2 = x.a();
            for (int i2 = 0; i2 < list2.size(); ++i2) {
                Locale locale = (Locale)list2.get(i2);
                if (!string.equals(locale.getCountry()) || !locale.getVariant().isEmpty()) continue;
                list.add(locale);
            }
            list = Collections.unmodifiableList(list);
            a.putIfAbsent(string, list);
            list = (List)a.get(string);
        }
        return list;
    }

    public static List c(String string) {
        if (string == null) {
            return Collections.emptyList();
        }
        List<Locale> list = (ArrayList)b.get(string);
        if (list == null) {
            list = new ArrayList();
            List list2 = x.a();
            for (int i2 = 0; i2 < list2.size(); ++i2) {
                Locale locale = (Locale)list2.get(i2);
                if (!string.equals(locale.getLanguage()) || locale.getCountry().length() == 0 || !locale.getVariant().isEmpty()) continue;
                list.add(locale);
            }
            list = Collections.unmodifiableList(list);
            b.putIfAbsent(string, list);
            list = (List)b.get(string);
        }
        return list;
    }
}

