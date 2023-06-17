/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.c;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import org.apache.commons.c.c.d;
import org.apache.commons.c.g.e;

public class c {
    public static void a(Object object, Class class_, Object object2) {
        try {
            e.a(object, "add" + class_.getSimpleName(), object2);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new IllegalArgumentException("Class " + object.getClass().getName() + " does not have a public add" + class_.getSimpleName() + " method which takes a parameter of type " + class_.getName() + ".");
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new IllegalArgumentException("Class " + object.getClass().getName() + " does not have an accessible add" + class_.getSimpleName() + " method which takes a parameter of type " + class_.getName() + ".");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new RuntimeException("Unable to add listener.", invocationTargetException.getCause());
        }
    }

    public static void a(Object object, String string, Object object2, Class class_, String ... arrstring) {
        Object t2 = class_.cast(Proxy.newProxyInstance(object.getClass().getClassLoader(), new Class[]{class_}, (InvocationHandler)new d(object, string, arrstring)));
        c.a(object2, class_, t2);
    }
}

