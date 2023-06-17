/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.g;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.apache.commons.c.ao;
import org.apache.commons.c.c;
import org.apache.commons.c.g.d;
import org.apache.commons.c.g.g;
import org.apache.commons.c.o;
import org.apache.commons.c.t;

public class e {
    public static Object a(Object object, String string, Object ... arrobject) {
        arrobject = c.d(arrobject);
        Class[] arrclass = o.a(arrobject);
        return e.a(object, string, arrobject, arrclass);
    }

    public static Object a(Object object, String string, Object[] arrobject, Class[] arrclass) {
        arrclass = c.a(arrclass);
        arrobject = c.d(arrobject);
        Method method = e.b(object.getClass(), string, arrclass);
        if (method == null) {
            throw new NoSuchMethodException("No such accessible method: " + string + "() on object: " + object.getClass().getName());
        }
        return method.invoke(object, arrobject);
    }

    public static Object b(Object object, String string, Object ... arrobject) {
        arrobject = c.d(arrobject);
        Class[] arrclass = o.a(arrobject);
        return e.b(object, string, arrobject, arrclass);
    }

    public static Object b(Object object, String string, Object[] arrobject, Class[] arrclass) {
        arrobject = c.d(arrobject);
        arrclass = c.a(arrclass);
        Method method = e.a(object.getClass(), string, arrclass);
        if (method == null) {
            throw new NoSuchMethodException("No such accessible method: " + string + "() on object: " + object.getClass().getName());
        }
        return method.invoke(object, arrobject);
    }

    public static Object a(Class class_, String string, Object[] arrobject, Class[] arrclass) {
        arrobject = c.d(arrobject);
        Method method = e.a(class_, string, arrclass = c.a(arrclass));
        if (method == null) {
            throw new NoSuchMethodException("No such accessible method: " + string + "() on class: " + class_.getName());
        }
        return method.invoke(null, arrobject);
    }

    public static Object a(Class class_, String string, Object ... arrobject) {
        arrobject = c.d(arrobject);
        Class[] arrclass = o.a(arrobject);
        return e.b(class_, string, arrobject, arrclass);
    }

    public static Object b(Class class_, String string, Object[] arrobject, Class[] arrclass) {
        arrobject = c.d(arrobject);
        Method method = e.b(class_, string, arrclass = c.a(arrclass));
        if (method == null) {
            throw new NoSuchMethodException("No such accessible method: " + string + "() on class: " + class_.getName());
        }
        return method.invoke(null, arrobject);
    }

    public static Object b(Class class_, String string, Object ... arrobject) {
        arrobject = c.d(arrobject);
        Class[] arrclass = o.a(arrobject);
        return e.a(class_, string, arrobject, arrclass);
    }

    public static Method a(Class class_, String string, Class ... arrclass) {
        try {
            return e.a(class_.getMethod(string, arrclass));
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return null;
        }
    }

    public static Method a(Method method) {
        Class[] arrclass;
        if (!d.a(method)) {
            return null;
        }
        Class<?> class_ = method.getDeclaringClass();
        if (Modifier.isPublic(class_.getModifiers())) {
            return method;
        }
        String string = method.getName();
        if ((method = e.d(class_, string, arrclass = method.getParameterTypes())) == null) {
            method = e.c(class_, string, arrclass);
        }
        return method;
    }

    private static Method c(Class class_, String string, Class ... arrclass) {
        for (Class class_2 = class_.getSuperclass(); class_2 != null; class_2 = class_2.getSuperclass()) {
            if (!Modifier.isPublic(class_2.getModifiers())) continue;
            try {
                return class_2.getMethod(string, arrclass);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                return null;
            }
        }
        return null;
    }

    private static Method d(Class class_, String string, Class ... arrclass) {
        while (class_ != null) {
            Class<?>[] arrclass2 = class_.getInterfaces();
            for (int i2 = 0; i2 < arrclass2.length; ++i2) {
                if (!Modifier.isPublic(arrclass2[i2].getModifiers())) continue;
                try {
                    return arrclass2[i2].getDeclaredMethod(string, arrclass);
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    Method method = e.d(arrclass2[i2], string, arrclass);
                    if (method == null) continue;
                    return method;
                }
            }
            class_ = class_.getSuperclass();
        }
        return null;
    }

    public static Method b(Class class_, String string, Class ... arrclass) {
        try {
            Method method = class_.getMethod(string, arrclass);
            d.a(method);
            return method;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            Method[] arrmethod;
            Method method = null;
            for (Method method2 : arrmethod = class_.getMethods()) {
                Method method3;
                if (!method2.getName().equals(string) || !o.a(arrclass, (Class[])method2.getParameterTypes(), true) || (method3 = e.a(method2)) == null || method != null && d.a(method3.getParameterTypes(), method.getParameterTypes(), arrclass) >= 0) continue;
                method = method3;
            }
            if (method != null) {
                d.a(method);
            }
            return method;
        }
    }

    public static Set a(Method method, t t2) {
        ao.a(method);
        LinkedHashSet<Method> linkedHashSet = new LinkedHashSet<Method>();
        linkedHashSet.add(method);
        Object[] arrobject = method.getParameterTypes();
        Class<?> class_ = method.getDeclaringClass();
        Iterator iterator = o.a(class_, t2).iterator();
        iterator.next();
        block0: while (iterator.hasNext()) {
            Class class_2 = (Class)iterator.next();
            Method method2 = e.b(class_2, method.getName(), (Class[])arrobject);
            if (method2 == null) continue;
            if (Arrays.equals(method2.getParameterTypes(), arrobject)) {
                linkedHashSet.add(method2);
                continue;
            }
            Map map = g.a(class_, method2.getDeclaringClass());
            for (int i2 = 0; i2 < arrobject.length; ++i2) {
                Type type;
                Type type2 = g.a(map, method.getGenericParameterTypes()[i2]);
                if (!g.c(type2, type = g.a(map, method2.getGenericParameterTypes()[i2]))) continue block0;
            }
            linkedHashSet.add(method2);
        }
        return linkedHashSet;
    }
}

