/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.c.a;
import com.ibm.icu.a.dd;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import com.ibm.icu.util.dt;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessControlException;
import java.security.AccessController;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

final class ds {
    private static boolean a = false;
    private static Method b;
    private static Method c;
    private static Method d;
    private static Method e;
    private static Method f;
    private static Method g;
    private static Method h;
    private static Method i;
    private static Method j;
    private static Object k;
    private static Object l;
    private static final String[][] m;

    private ds() {
    }

    public static boolean a() {
        return a;
    }

    public static dn a(Locale locale) {
        return a ? ds.c(locale) : ds.d(locale);
    }

    public static Locale a(dn dn2) {
        return a ? ds.b(dn2) : ds.c(dn2);
    }

    private static dn c(Locale locale) {
        Object object;
        Object object22;
        Object object3;
        Object object4;
        TreeMap<String, String> treeMap;
        TreeSet<Object> treeSet;
        String string;
        String string2;
        String string3;
        String string4;
        block25: {
            string4 = locale.getLanguage();
            string3 = "";
            string2 = locale.getCountry();
            string = locale.getVariant();
            treeSet = null;
            treeMap = null;
            try {
                string3 = (String)b.invoke(locale, null);
                object4 = (Set)c.invoke(locale, null);
                if (object4.isEmpty()) break block25;
                object3 = object4.iterator();
                while (object3.hasNext()) {
                    Character c2 = (Character)object3.next();
                    if (c2.charValue() == 'u') {
                        Set set = (Set)f.invoke(locale, null);
                        if (!set.isEmpty()) {
                            treeSet = new TreeSet<Object>();
                            for (Object object22 : set) {
                                treeSet.add(object22);
                            }
                        }
                        object = (Set)e.invoke(locale, null);
                        object22 = object.iterator();
                        while (object22.hasNext()) {
                            String string5 = (String)object22.next();
                            String string6 = (String)g.invoke(locale, string5);
                            if (string6 == null) continue;
                            if (string5.equals("va")) {
                                string = string.length() == 0 ? string6 : string6 + "_" + string;
                                continue;
                            }
                            if (treeMap == null) {
                                treeMap = new TreeMap();
                            }
                            treeMap.put(string5, string6);
                        }
                        continue;
                    }
                    String string7 = (String)d.invoke(locale, c2);
                    if (string7 == null) continue;
                    if (treeMap == null) {
                        treeMap = new TreeMap<String, String>();
                    }
                    treeMap.put(String.valueOf(c2), string7);
                }
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new RuntimeException(illegalAccessException);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw new RuntimeException(invocationTargetException);
            }
        }
        if (string4.equals("no") && string2.equals("NO") && string.equals("NY")) {
            string4 = "nn";
            string = "";
        }
        object4 = new StringBuilder(string4);
        if (string3.length() > 0) {
            ((StringBuilder)object4).append('_');
            ((StringBuilder)object4).append(string3);
        }
        if (string2.length() > 0) {
            ((StringBuilder)object4).append('_');
            ((StringBuilder)object4).append(string2);
        }
        if (string.length() > 0) {
            if (string2.length() == 0) {
                ((StringBuilder)object4).append('_');
            }
            ((StringBuilder)object4).append('_');
            ((StringBuilder)object4).append(string);
        }
        if (treeSet != null) {
            object3 = new StringBuilder();
            for (String string8 : treeSet) {
                if (((StringBuilder)object3).length() != 0) {
                    ((StringBuilder)object3).append('-');
                }
                ((StringBuilder)object3).append(string8);
            }
            if (treeMap == null) {
                treeMap = new TreeMap();
            }
            treeMap.put("attribute", ((StringBuilder)object3).toString());
        }
        if (treeMap != null) {
            ((StringBuilder)object4).append('@');
            boolean bl2 = false;
            for (Map.Entry entry : treeMap.entrySet()) {
                object = (String)entry.getKey();
                object22 = (String)entry.getValue();
                if (((String)object).length() != 1) {
                    object = dn.r((String)object);
                    object22 = dn.l((String)object, (String)(((String)object22).length() == 0 ? "yes" : object22));
                }
                if (bl2) {
                    ((StringBuilder)object4).append(';');
                } else {
                    bl2 = true;
                }
                ((StringBuilder)object4).append((String)object);
                ((StringBuilder)object4).append('=');
                ((StringBuilder)object4).append((String)object22);
            }
        }
        return new dn(dn.h(((StringBuilder)object4).toString()), locale, null);
    }

    private static dn d(Locale locale) {
        dn dn2 = null;
        String string = locale.toString();
        if (string.length() == 0) {
            dn2 = dn.v;
        } else {
            for (int i2 = 0; i2 < m.length; ++i2) {
                if (!m[i2][0].equals(string)) continue;
                dd dd2 = new dd(m[i2][1]);
                dd2.b(m[i2][2], m[i2][3]);
                string = dd2.h();
                break;
            }
            dn2 = new dn(dn.h(string), locale, null);
        }
        return dn2;
    }

    private static Locale b(dn dn2) {
        Locale locale = null;
        String string = dn2.l();
        if (dn2.g().length() > 0 || string.contains("@")) {
            String string2 = dn2.C();
            string2 = com.ibm.icu.a.c.a.b(string2);
            try {
                locale = (Locale)h.invoke(null, string2);
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new RuntimeException(illegalAccessException);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw new RuntimeException(invocationTargetException);
            }
        }
        if (locale == null) {
            locale = new Locale(dn2.f(), dn2.h(), dn2.i());
        }
        return locale;
    }

    private static Locale c(dn dn2) {
        Object object;
        String string = dn2.k();
        for (int i2 = 0; i2 < m.length; ++i2) {
            if (!string.equals(m[i2][1]) && !string.equals(m[i2][4])) continue;
            if (m[i2][2] != null) {
                object = dn2.j(m[i2][2]);
                if (object == null || !((String)object).equals(m[i2][3])) continue;
                string = m[i2][0];
                break;
            }
            string = m[i2][0];
            break;
        }
        dd dd2 = new dd(string);
        object = dd2.e();
        return new Locale(object[0], object[2], object[3]);
    }

    public static Locale a(dr dr2) {
        Locale locale = Locale.getDefault();
        if (a) {
            Object object = null;
            switch (dr2) {
                case a: {
                    object = k;
                    break;
                }
                case b: {
                    object = l;
                }
            }
            if (object != null) {
                try {
                    locale = (Locale)i.invoke(null, object);
                }
                catch (InvocationTargetException invocationTargetException) {
                }
                catch (IllegalArgumentException illegalArgumentException) {
                }
                catch (IllegalAccessException illegalAccessException) {
                    // empty catch block
                }
            }
        }
        return locale;
    }

    public static void a(dr dr2, Locale locale) {
        if (a) {
            Object object = null;
            switch (dr2) {
                case a: {
                    object = k;
                    break;
                }
                case b: {
                    object = l;
                }
            }
            if (object != null) {
                try {
                    j.invoke(null, object, locale);
                }
                catch (InvocationTargetException invocationTargetException) {
                }
                catch (IllegalArgumentException illegalArgumentException) {
                }
                catch (IllegalAccessException illegalAccessException) {
                    // empty catch block
                }
            }
        }
    }

    public static boolean b(Locale locale) {
        if (a) {
            String string = "";
            try {
                string = (String)b.invoke(locale, null);
            }
            catch (Exception exception) {
                return false;
            }
            return locale.getLanguage().equals(ds.a("user.language")) && locale.getCountry().equals(ds.a("user.country")) && locale.getVariant().equals(ds.a("user.variant")) && string.equals(ds.a("user.script"));
        }
        return locale.getLanguage().equals(ds.a("user.language")) && locale.getCountry().equals(ds.a("user.country")) && locale.getVariant().equals(ds.a("user.variant"));
    }

    public static String a(String string) {
        String string2 = null;
        String string3 = string;
        if (System.getSecurityManager() != null) {
            try {
                string2 = (String)AccessController.doPrivileged(new dt(string3));
            }
            catch (AccessControlException accessControlException) {}
        } else {
            string2 = System.getProperty(string3);
        }
        return string2;
    }

    static {
        m = new String[][]{{"ja_JP_JP", "ja_JP", "calendar", "japanese", "ja"}, {"no_NO_NY", "nn_NO", null, null, "nn"}, {"th_TH_TH", "th_TH", "numbers", "thai", "th"}};
        try {
            b = Locale.class.getMethod("getScript", null);
            c = Locale.class.getMethod("getExtensionKeys", null);
            d = Locale.class.getMethod("getExtension", Character.TYPE);
            e = Locale.class.getMethod("getUnicodeLocaleKeys", null);
            f = Locale.class.getMethod("getUnicodeLocaleAttributes", null);
            g = Locale.class.getMethod("getUnicodeLocaleType", String.class);
            h = Locale.class.getMethod("forLanguageTag", String.class);
            Class<?> class_ = null;
            Class<?>[] arrclass = Locale.class.getDeclaredClasses();
            for (Class<?> class_2 : arrclass) {
                if (!class_2.getName().equals("java.util.Locale$Category")) continue;
                class_ = class_2;
                break;
            }
            if (class_ != null) {
                ?[] arrobj;
                i = Locale.class.getDeclaredMethod("getDefault", class_);
                j = Locale.class.getDeclaredMethod("setDefault", class_, Locale.class);
                Method method = class_.getMethod("name", null);
                for (Object obj : arrobj = class_.getEnumConstants()) {
                    String string = (String)method.invoke(obj, null);
                    if (string.equals("DISPLAY")) {
                        k = obj;
                        continue;
                    }
                    if (!string.equals("FORMAT")) continue;
                    l = obj;
                }
                if (k != null && l != null) {
                    a = true;
                }
            }
        }
        catch (NoSuchMethodException noSuchMethodException) {
        }
        catch (IllegalArgumentException illegalArgumentException) {
        }
        catch (IllegalAccessException illegalAccessException) {
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (SecurityException securityException) {
            // empty catch block
        }
    }
}

