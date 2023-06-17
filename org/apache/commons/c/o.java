/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.apache.commons.c.am;
import org.apache.commons.c.an;
import org.apache.commons.c.c;
import org.apache.commons.c.p;
import org.apache.commons.c.r;
import org.apache.commons.c.t;
import org.apache.commons.c.w;

public class o {
    public static final char a = '.';
    public static final String b;
    public static final char c = '$';
    public static final String d;
    private static final Map e;
    private static final Map f;
    private static final Map g;
    private static final Map h;

    public static String a(Object object, String string) {
        if (object == null) {
            return string;
        }
        return o.a(object.getClass());
    }

    public static String a(Class class_) {
        if (class_ == null) {
            return "";
        }
        return o.a(class_.getName());
    }

    public static String a(String string) {
        int n2;
        if (am.a((CharSequence)string)) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (string.startsWith("[")) {
            while (string.charAt(0) == '[') {
                string = string.substring(1);
                stringBuilder.append("[]");
            }
            if (string.charAt(0) == 'L' && string.charAt(string.length() - 1) == ';') {
                string = string.substring(1, string.length() - 1);
            }
            if (h.containsKey(string)) {
                string = (String)h.get(string);
            }
        }
        int n3 = string.indexOf(36, (n2 = string.lastIndexOf(46)) == -1 ? 0 : n2 + 1);
        String string2 = string.substring(n2 + 1);
        if (n3 != -1) {
            string2 = string2.replace('$', '.');
        }
        return string2 + stringBuilder;
    }

    public static String b(Class class_) {
        if (class_ == null) {
            return "";
        }
        return class_.getSimpleName();
    }

    public static String b(Object object, String string) {
        if (object == null) {
            return string;
        }
        return o.b(object.getClass());
    }

    public static String c(Object object, String string) {
        if (object == null) {
            return string;
        }
        return o.c(object.getClass());
    }

    public static String c(Class class_) {
        if (class_ == null) {
            return "";
        }
        return o.b(class_.getName());
    }

    public static String b(String string) {
        int n2;
        if (am.a((CharSequence)string)) {
            return "";
        }
        while (string.charAt(0) == '[') {
            string = string.substring(1);
        }
        if (string.charAt(0) == 'L' && string.charAt(string.length() - 1) == ';') {
            string = string.substring(1);
        }
        if ((n2 = string.lastIndexOf(46)) == -1) {
            return "";
        }
        return string.substring(0, n2);
    }

    public static List d(Class class_) {
        if (class_ == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Class class_2 = class_.getSuperclass(); class_2 != null; class_2 = class_2.getSuperclass()) {
            arrayList.add(class_2);
        }
        return arrayList;
    }

    public static List e(Class class_) {
        if (class_ == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        o.a(class_, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    private static void a(Class class_, HashSet hashSet) {
        while (class_ != null) {
            Class<?>[] arrclass;
            for (Class<?> class_2 : arrclass = class_.getInterfaces()) {
                if (!hashSet.add(class_2)) continue;
                o.a(class_2, hashSet);
            }
            class_ = class_.getSuperclass();
        }
    }

    public static List a(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String string : list) {
            try {
                arrayList.add(Class.forName(string));
            }
            catch (Exception exception) {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public static List b(List list) {
        if (list == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<String>(list.size());
        for (Class class_ : list) {
            if (class_ == null) {
                arrayList.add(null);
                continue;
            }
            arrayList.add(class_.getName());
        }
        return arrayList;
    }

    public static boolean a(Class[] arrclass, Class ... arrclass2) {
        return o.a(arrclass, arrclass2, an.a(w.f));
    }

    public static boolean a(Class[] arrclass, Class[] arrclass2, boolean bl2) {
        if (!org.apache.commons.c.c.a((Object[])arrclass, arrclass2)) {
            return false;
        }
        if (arrclass == null) {
            arrclass = org.apache.commons.c.c.b;
        }
        if (arrclass2 == null) {
            arrclass2 = org.apache.commons.c.c.b;
        }
        for (int i2 = 0; i2 < arrclass.length; ++i2) {
            if (o.a(arrclass[i2], arrclass2[i2], bl2)) continue;
            return false;
        }
        return true;
    }

    public static boolean f(Class class_) {
        if (class_ == null) {
            return false;
        }
        return class_.isPrimitive() || o.g(class_);
    }

    public static boolean g(Class class_) {
        return f.containsKey(class_);
    }

    public static boolean a(Class class_, Class class_2) {
        return o.a(class_, class_2, an.a(w.f));
    }

    public static boolean a(Class class_, Class class_2, boolean bl2) {
        if (class_2 == null) {
            return false;
        }
        if (class_ == null) {
            return !class_2.isPrimitive();
        }
        if (bl2) {
            if (class_.isPrimitive() && !class_2.isPrimitive() && (class_ = o.h(class_)) == null) {
                return false;
            }
            if (class_2.isPrimitive() && !class_.isPrimitive() && (class_ = o.i(class_)) == null) {
                return false;
            }
        }
        if (class_.equals(class_2)) {
            return true;
        }
        if (class_.isPrimitive()) {
            if (!class_2.isPrimitive()) {
                return false;
            }
            if (Integer.TYPE.equals(class_)) {
                return Long.TYPE.equals(class_2) || Float.TYPE.equals(class_2) || Double.TYPE.equals(class_2);
            }
            if (Long.TYPE.equals(class_)) {
                return Float.TYPE.equals(class_2) || Double.TYPE.equals(class_2);
            }
            if (Boolean.TYPE.equals(class_)) {
                return false;
            }
            if (Double.TYPE.equals(class_)) {
                return false;
            }
            if (Float.TYPE.equals(class_)) {
                return Double.TYPE.equals(class_2);
            }
            if (Character.TYPE.equals(class_)) {
                return Integer.TYPE.equals(class_2) || Long.TYPE.equals(class_2) || Float.TYPE.equals(class_2) || Double.TYPE.equals(class_2);
            }
            if (Short.TYPE.equals(class_)) {
                return Integer.TYPE.equals(class_2) || Long.TYPE.equals(class_2) || Float.TYPE.equals(class_2) || Double.TYPE.equals(class_2);
            }
            if (Byte.TYPE.equals(class_)) {
                return Short.TYPE.equals(class_2) || Integer.TYPE.equals(class_2) || Long.TYPE.equals(class_2) || Float.TYPE.equals(class_2) || Double.TYPE.equals(class_2);
            }
            return false;
        }
        return class_2.isAssignableFrom(class_);
    }

    public static Class h(Class class_) {
        Class class_2 = class_;
        if (class_ != null && class_.isPrimitive()) {
            class_2 = (Class)e.get(class_);
        }
        return class_2;
    }

    public static Class[] a(Class ... arrclass) {
        if (arrclass == null) {
            return null;
        }
        if (arrclass.length == 0) {
            return arrclass;
        }
        Class[] arrclass2 = new Class[arrclass.length];
        for (int i2 = 0; i2 < arrclass.length; ++i2) {
            arrclass2[i2] = o.h(arrclass[i2]);
        }
        return arrclass2;
    }

    public static Class i(Class class_) {
        return (Class)f.get(class_);
    }

    public static Class[] b(Class ... arrclass) {
        if (arrclass == null) {
            return null;
        }
        if (arrclass.length == 0) {
            return arrclass;
        }
        Class[] arrclass2 = new Class[arrclass.length];
        for (int i2 = 0; i2 < arrclass.length; ++i2) {
            arrclass2[i2] = o.i(arrclass[i2]);
        }
        return arrclass2;
    }

    public static boolean j(Class class_) {
        return class_ != null && class_.getEnclosingClass() != null;
    }

    public static Class a(ClassLoader classLoader, String string, boolean bl2) {
        try {
            Class<?> class_;
            if (g.containsKey(string)) {
                String string2 = "[" + (String)g.get(string);
                class_ = Class.forName(string2, bl2, classLoader).getComponentType();
            } else {
                class_ = Class.forName(o.f(string), bl2, classLoader);
            }
            return class_;
        }
        catch (ClassNotFoundException classNotFoundException) {
            int n2 = string.lastIndexOf(46);
            if (n2 != -1) {
                try {
                    return o.a(classLoader, string.substring(0, n2) + '$' + string.substring(n2 + 1), bl2);
                }
                catch (ClassNotFoundException classNotFoundException2) {
                    // empty catch block
                }
            }
            throw classNotFoundException;
        }
    }

    public static Class a(ClassLoader classLoader, String string) {
        return o.a(classLoader, string, true);
    }

    public static Class c(String string) {
        return o.a(string, true);
    }

    public static Class a(String string, boolean bl2) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        ClassLoader classLoader2 = classLoader == null ? o.class.getClassLoader() : classLoader;
        return o.a(classLoader2, string, bl2);
    }

    public static Method a(Class class_, String string, Class ... arrclass) {
        Method method = class_.getMethod(string, arrclass);
        if (Modifier.isPublic(method.getDeclaringClass().getModifiers())) {
            return method;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(o.e(class_));
        arrayList.addAll(o.d(class_));
        for (Class class_2 : arrayList) {
            Method method2;
            if (!Modifier.isPublic(class_2.getModifiers())) continue;
            try {
                method2 = class_2.getMethod(string, arrclass);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                continue;
            }
            if (!Modifier.isPublic(method2.getDeclaringClass().getModifiers())) continue;
            return method2;
        }
        throw new NoSuchMethodException("Can't find a public method for " + string + " " + org.apache.commons.c.c.a((Object)arrclass));
    }

    private static String f(String string) {
        if ((string = am.l(string)) == null) {
            throw new NullPointerException("className must not be null.");
        }
        if (string.endsWith("[]")) {
            StringBuilder stringBuilder = new StringBuilder();
            while (string.endsWith("[]")) {
                string = string.substring(0, string.length() - 2);
                stringBuilder.append("[");
            }
            String string2 = (String)g.get(string);
            if (string2 != null) {
                stringBuilder.append(string2);
            } else {
                stringBuilder.append("L").append(string).append(";");
            }
            string = stringBuilder.toString();
        }
        return string;
    }

    public static Class[] a(Object ... arrobject) {
        if (arrobject == null) {
            return null;
        }
        if (arrobject.length == 0) {
            return org.apache.commons.c.c.b;
        }
        Class[] arrclass = new Class[arrobject.length];
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            arrclass[i2] = arrobject[i2] == null ? null : arrobject[i2].getClass();
        }
        return arrclass;
    }

    public static String d(Object object, String string) {
        if (object == null) {
            return string;
        }
        return o.d(object.getClass().getName());
    }

    public static String k(Class class_) {
        if (class_ == null) {
            return "";
        }
        return o.d(class_.getName());
    }

    public static String d(String string) {
        return o.a(o.g(string));
    }

    public static String e(Object object, String string) {
        if (object == null) {
            return string;
        }
        return o.e(object.getClass().getName());
    }

    public static String l(Class class_) {
        if (class_ == null) {
            return "";
        }
        return o.e(class_.getName());
    }

    public static String e(String string) {
        return o.b(o.g(string));
    }

    private static String g(String string) {
        if ((string = am.l(string)) == null) {
            return null;
        }
        int n2 = 0;
        while (string.startsWith("[")) {
            ++n2;
            string = string.substring(1);
        }
        if (n2 < 1) {
            return string;
        }
        if (string.startsWith("L")) {
            string = string.substring(1, string.endsWith(";") ? string.length() - 1 : string.length());
        } else if (string.length() > 0) {
            string = (String)h.get(string.substring(0, 1));
        }
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append("[]");
        }
        return stringBuilder.toString();
    }

    public static Iterable m(Class class_) {
        return o.a(class_, t.b);
    }

    public static Iterable a(Class class_, t t2) {
        p p2 = new p(class_);
        if (t2 != t.a) {
            return p2;
        }
        return new r(p2);
    }

    static {
        Serializable serializable22;
        b = String.valueOf('.');
        d = String.valueOf('$');
        e = new HashMap();
        e.put(Boolean.TYPE, Boolean.class);
        e.put(Byte.TYPE, Byte.class);
        e.put(Character.TYPE, Character.class);
        e.put(Short.TYPE, Short.class);
        e.put(Integer.TYPE, Integer.class);
        e.put(Long.TYPE, Long.class);
        e.put(Double.TYPE, Double.class);
        e.put(Float.TYPE, Float.class);
        e.put(Void.TYPE, Void.TYPE);
        f = new HashMap();
        for (Serializable serializable22 : e.keySet()) {
            Object object;
            if (serializable22.equals(object = (Class)e.get(serializable22))) continue;
            f.put(object, serializable22);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("int", "I");
        hashMap.put("boolean", "Z");
        hashMap.put("float", "F");
        hashMap.put("long", "J");
        hashMap.put("short", "S");
        hashMap.put("byte", "B");
        hashMap.put("double", "D");
        hashMap.put("char", "C");
        hashMap.put("void", "V");
        serializable22 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            serializable22.put(entry.getValue(), entry.getKey());
        }
        g = Collections.unmodifiableMap(hashMap);
        h = Collections.unmodifiableMap(serializable22);
    }
}

