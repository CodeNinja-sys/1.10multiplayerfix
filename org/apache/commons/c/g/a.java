/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.g;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import org.apache.commons.c.ao;
import org.apache.commons.c.c;
import org.apache.commons.c.g.d;
import org.apache.commons.c.o;

public class a {
    public static Object a(Class class_, Object ... arrobject) {
        arrobject = c.d(arrobject);
        Class[] arrclass = o.a(arrobject);
        return a.a(class_, arrobject, arrclass);
    }

    public static Object a(Class class_, Object[] arrobject, Class[] arrclass) {
        arrobject = c.d(arrobject);
        Constructor constructor = a.b(class_, arrclass = c.a(arrclass));
        if (constructor == null) {
            throw new NoSuchMethodException("No such accessible constructor on object: " + class_.getName());
        }
        return constructor.newInstance(arrobject);
    }

    public static Object b(Class class_, Object ... arrobject) {
        arrobject = c.d(arrobject);
        Class[] arrclass = o.a(arrobject);
        return a.b(class_, arrobject, arrclass);
    }

    public static Object b(Class class_, Object[] arrobject, Class[] arrclass) {
        arrobject = c.d(arrobject);
        Constructor constructor = a.a(class_, arrclass = c.a(arrclass));
        if (constructor == null) {
            throw new NoSuchMethodException("No such accessible constructor on object: " + class_.getName());
        }
        return constructor.newInstance(arrobject);
    }

    public static Constructor a(Class class_, Class ... arrclass) {
        ao.a((Object)class_, "class cannot be null", new Object[0]);
        try {
            return a.a(class_.getConstructor(arrclass));
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return null;
        }
    }

    public static Constructor a(Constructor constructor) {
        ao.a((Object)constructor, "constructor cannot be null", new Object[0]);
        return d.a(constructor) && a.a(constructor.getDeclaringClass()) ? constructor : null;
    }

    public static Constructor b(Class class_, Class ... arrclass) {
        ao.a((Object)class_, "class cannot be null", new Object[0]);
        try {
            Constructor constructor = class_.getConstructor(arrclass);
            d.a(constructor);
            return constructor;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            Constructor<?>[] arrconstructor;
            Constructor constructor = null;
            for (Constructor<?> constructor2 : arrconstructor = class_.getConstructors()) {
                Constructor constructor3;
                Constructor constructor4;
                if (!o.a(arrclass, (Class[])constructor2.getParameterTypes(), true) || (constructor4 = a.a(constructor2)) == null) continue;
                d.a(constructor4);
                if (constructor != null && d.a(constructor4.getParameterTypes(), constructor.getParameterTypes(), arrclass) >= 0) continue;
                constructor = constructor3 = constructor4;
            }
            return constructor;
        }
    }

    private static boolean a(Class class_) {
        for (Class<?> class_2 = class_; class_2 != null; class_2 = class_2.getEnclosingClass()) {
            if (Modifier.isPublic(class_2.getModifiers())) continue;
            return false;
        }
        return true;
    }
}

