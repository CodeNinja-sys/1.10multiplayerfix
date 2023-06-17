/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.core.config.plugins.PluginManager;
import org.apache.logging.log4j.core.config.plugins.k;
import org.apache.logging.log4j.core.d.v;
import org.apache.logging.log4j.core.i.ab;
import org.apache.logging.log4j.core.i.ac;
import org.apache.logging.log4j.core.i.aq;
import org.apache.logging.log4j.core.i.ar;
import org.apache.logging.log4j.core.i.au;
import org.apache.logging.log4j.core.i.o;
import org.apache.logging.log4j.core.i.q;
import org.apache.logging.log4j.core.i.t;
import org.apache.logging.log4j.d;

public final class as {
    private static final char a = '%';
    private static final d b = org.apache.logging.log4j.d.d.k();
    private static final int c = 32;
    private static final int d = 10;
    private final org.apache.logging.log4j.core.config.d e;
    private final Map f;

    public as(String string) {
        this(null, string, null, null);
    }

    public as(org.apache.logging.log4j.core.config.d d2, String string, Class class_) {
        this(d2, string, class_, null);
    }

    public as(org.apache.logging.log4j.core.config.d d2, String string, Class class_, Class class_2) {
        this.e = d2;
        PluginManager pluginManager = new PluginManager(string, class_);
        pluginManager.b();
        Map map = pluginManager.a();
        HashMap<String, Class> hashMap = new HashMap<String, Class>();
        for (k k2 : map.values()) {
            try {
                o o2;
                Class class_3 = k2.a();
                if (class_2 != null && !class_2.isAssignableFrom(class_3) || (o2 = class_3.getAnnotation(o.class)) == null) continue;
                for (String string2 : o2.a()) {
                    hashMap.put(string2, class_3);
                }
            }
            catch (Exception exception) {
                b.b("Error processing plugin " + k2.b(), (Throwable)exception);
            }
        }
        this.f = hashMap;
    }

    public List a(String string) {
        return this.a(string, false);
    }

    public List a(String string, boolean bl2) {
        ArrayList<ar> arrayList = new ArrayList<ar>();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.a(string, arrayList2, arrayList3);
        Iterator iterator = arrayList3.iterator();
        boolean bl3 = false;
        for (aq aq2 : arrayList2) {
            ac ac2;
            if (aq2 instanceof ac) {
                ac2 = (ac)aq2;
                bl3 |= ac2.cO_();
            } else {
                ac2 = new ab(this.e, "");
            }
            t t2 = iterator.hasNext() ? (t)iterator.next() : t.a();
            arrayList.add(new ar(ac2, t2));
        }
        if (bl2 && !bl3) {
            q q2 = q.a(null);
            arrayList.add(new ar(q2, t.a()));
        }
        return arrayList;
    }

    private static int a(char c2, String string, int n2, StringBuilder stringBuilder, StringBuilder stringBuilder2) {
        stringBuilder.setLength(0);
        if (!Character.isUnicodeIdentifierStart(c2)) {
            return n2;
        }
        stringBuilder.append(c2);
        while (n2 < string.length() && Character.isUnicodeIdentifierPart(string.charAt(n2))) {
            stringBuilder.append(string.charAt(n2));
            stringBuilder2.append(string.charAt(n2));
            ++n2;
        }
        return n2;
    }

    private static int a(String string, int n2, List list) {
        while (n2 < string.length() && string.charAt(n2) == '{') {
            int n3;
            int n4 = n2++;
            int n5 = 0;
            do {
                if ((n3 = string.indexOf(125, n2)) == -1) continue;
                int n6 = string.indexOf("{", n2);
                if (n6 != -1 && n6 < n3) {
                    n2 = n3 + 1;
                    ++n5;
                    continue;
                }
                if (n5 <= 0) continue;
                --n5;
            } while (n5 > 0);
            if (n3 == -1) break;
            String string2 = string.substring(n4 + 1, n3);
            list.add(string2);
            n2 = n3 + 1;
        }
        return n2;
    }

    public void a(String string, List list, List list2) {
        if (string == null) {
            throw new NullPointerException("pattern");
        }
        StringBuilder stringBuilder = new StringBuilder(32);
        int n2 = string.length();
        au au2 = au.a;
        int n3 = 0;
        t t2 = t.a();
        block14: while (n3 < n2) {
            char c2 = string.charAt(n3++);
            block0 : switch (au2) {
                case a: {
                    if (n3 == n2) {
                        stringBuilder.append(c2);
                        continue block14;
                    }
                    if (c2 == '%') {
                        switch (string.charAt(n3)) {
                            case '%': {
                                stringBuilder.append(c2);
                                ++n3;
                                break block0;
                            }
                        }
                        if (stringBuilder.length() != 0) {
                            list.add(new ab(this.e, stringBuilder.toString()));
                            list2.add(t.a());
                        }
                        stringBuilder.setLength(0);
                        stringBuilder.append(c2);
                        au2 = au.b;
                        t2 = t.a();
                        break;
                    }
                    stringBuilder.append(c2);
                    break;
                }
                case b: {
                    stringBuilder.append(c2);
                    switch (c2) {
                        case '-': {
                            t2 = new t(true, t2.c(), t2.d());
                            break block0;
                        }
                        case '.': {
                            au2 = au.c;
                            break block0;
                        }
                    }
                    if (c2 >= '0' && c2 <= '9') {
                        t2 = new t(t2.b(), c2 - 48, t2.d());
                        au2 = au.d;
                        break;
                    }
                    n3 = this.a(c2, string, n3, stringBuilder, t2, this.f, list, list2);
                    au2 = au.a;
                    t2 = t.a();
                    stringBuilder.setLength(0);
                    break;
                }
                case d: {
                    stringBuilder.append(c2);
                    if (c2 >= '0' && c2 <= '9') {
                        t2 = new t(t2.b(), t2.c() * 10 + c2 - 48, t2.d());
                        break;
                    }
                    if (c2 == '.') {
                        au2 = au.c;
                        break;
                    }
                    n3 = this.a(c2, string, n3, stringBuilder, t2, this.f, list, list2);
                    au2 = au.a;
                    t2 = t.a();
                    stringBuilder.setLength(0);
                    break;
                }
                case c: {
                    stringBuilder.append(c2);
                    if (c2 >= '0' && c2 <= '9') {
                        t2 = new t(t2.b(), t2.c(), c2 - 48);
                        au2 = au.e;
                        break;
                    }
                    b.b("Error occurred in position " + n3 + ".\n Was expecting digit, instead got char \"" + c2 + "\".");
                    au2 = au.a;
                    break;
                }
                case e: {
                    stringBuilder.append(c2);
                    if (c2 >= '0' && c2 <= '9') {
                        t2 = new t(t2.b(), t2.c(), t2.d() * 10 + c2 - 48);
                        break;
                    }
                    n3 = this.a(c2, string, n3, stringBuilder, t2, this.f, list, list2);
                    au2 = au.a;
                    t2 = t.a();
                    stringBuilder.setLength(0);
                }
            }
        }
        if (stringBuilder.length() != 0) {
            list.add(new ab(this.e, stringBuilder.toString()));
            list2.add(t.a());
        }
    }

    private aq a(String string, StringBuilder stringBuilder, Map map, List list) {
        Object[] arrobject;
        String string2 = string;
        Class class_ = null;
        for (int i2 = string.length(); i2 > 0 && class_ == null; --i2) {
            string2 = string2.substring(0, i2);
            if (class_ != null || map == null) continue;
            class_ = (Class)map.get(string2);
        }
        if (class_ == null) {
            b.b("Unrecognized format specifier [" + string + "]");
            return null;
        }
        Method[] arrmethod = class_.getDeclaredMethods();
        Method method = null;
        for (Method method2 : arrmethod) {
            if (!Modifier.isStatic(method2.getModifiers()) || !method2.getDeclaringClass().equals(class_) || !method2.getName().equals("newInstance")) continue;
            if (method == null) {
                method = method2;
                continue;
            }
            if (!method2.getReturnType().equals(method.getReturnType())) continue;
            b.b("Class " + class_ + " cannot contain multiple static newInstance methods");
            return null;
        }
        if (method == null) {
            b.b("Class " + class_ + " does not contain a static newInstance method");
            return null;
        }
        GenericDeclaration[] arrgenericDeclaration = method.getParameterTypes();
        Object[] arrobject2 = arrobject = arrgenericDeclaration.length > 0 ? new Object[arrgenericDeclaration.length] : null;
        if (arrobject != null) {
            int n2 = 0;
            boolean bl2 = false;
            for (GenericDeclaration genericDeclaration : arrgenericDeclaration) {
                if (((Class)genericDeclaration).isArray() && ((Class)genericDeclaration).getName().equals("[Ljava.lang.String;")) {
                    String[] arrstring;
                    arrobject[n2] = arrstring = list.toArray(new String[list.size()]);
                } else if (((Class)genericDeclaration).isAssignableFrom(org.apache.logging.log4j.core.config.d.class)) {
                    arrobject[n2] = this.e;
                } else {
                    b.b("Unknown parameter type " + ((Class)genericDeclaration).getName() + " for static newInstance method of " + class_.getName());
                    bl2 = true;
                }
                ++n2;
            }
            if (bl2) {
                return null;
            }
        }
        try {
            Object object = method.invoke(null, arrobject);
            if (object instanceof aq) {
                stringBuilder.delete(0, stringBuilder.length() - (string.length() - string2.length()));
                return (aq)object;
            }
            b.f("Class " + class_.getName() + " does not extend PatternConverter.");
        }
        catch (Exception exception) {
            b.b("Error creating converter for " + string, (Throwable)exception);
        }
        return null;
    }

    private int a(char c2, String string, int n2, StringBuilder stringBuilder, t t2, Map map, List list, List list2) {
        StringBuilder stringBuilder2 = new StringBuilder();
        n2 = as.a(c2, string, n2, stringBuilder2, stringBuilder);
        String string2 = stringBuilder2.toString();
        ArrayList arrayList = new ArrayList();
        n2 = as.a(string, n2, arrayList);
        aq aq2 = this.a(string2, stringBuilder, map, arrayList);
        if (aq2 == null) {
            StringBuilder stringBuilder3;
            if (v.a(string2)) {
                stringBuilder3 = new StringBuilder("Empty conversion specifier starting at position ");
            } else {
                stringBuilder3 = new StringBuilder("Unrecognized conversion specifier [");
                stringBuilder3.append(string2);
                stringBuilder3.append("] starting at position ");
            }
            stringBuilder3.append(Integer.toString(n2));
            stringBuilder3.append(" in conversion pattern.");
            b.b(stringBuilder3.toString());
            list.add(new ab(this.e, stringBuilder.toString()));
            list2.add(t.a());
        } else {
            list.add(aq2);
            list2.add(t2);
            if (stringBuilder.length() > 0) {
                list.add(new ab(this.e, stringBuilder.toString()));
                list2.add(t.a());
            }
        }
        stringBuilder.setLength(0);
        return n2;
    }
}

