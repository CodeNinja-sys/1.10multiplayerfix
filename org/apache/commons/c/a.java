/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.apache.commons.c.a.ae;
import org.apache.commons.c.a.af;
import org.apache.commons.c.ao;
import org.apache.commons.c.b;

public class a {
    private static final af a = new b();

    public static boolean a(Annotation annotation, Annotation annotation2) {
        if (annotation == annotation2) {
            return true;
        }
        if (annotation == null || annotation2 == null) {
            return false;
        }
        Class<? extends Annotation> class_ = annotation.annotationType();
        Class<? extends Annotation> class_2 = annotation2.annotationType();
        ao.a(class_, "Annotation %s with null annotationType()", annotation);
        ao.a(class_2, "Annotation %s with null annotationType()", annotation2);
        if (!class_.equals(class_2)) {
            return false;
        }
        try {
            for (Method method : class_.getDeclaredMethods()) {
                if (method.getParameterTypes().length != 0 || !org.apache.commons.c.a.a(method.getReturnType())) continue;
                Object object = method.invoke(annotation, new Object[0]);
                Object object2 = method.invoke(annotation2, new Object[0]);
                if (org.apache.commons.c.a.a(method.getReturnType(), object, object2)) continue;
                return false;
            }
        }
        catch (IllegalAccessException illegalAccessException) {
            return false;
        }
        catch (InvocationTargetException invocationTargetException) {
            return false;
        }
        return true;
    }

    public static int a(Annotation annotation) {
        int n2 = 0;
        Class<? extends Annotation> class_ = annotation.annotationType();
        for (Method method : class_.getDeclaredMethods()) {
            try {
                Object object = method.invoke(annotation, new Object[0]);
                if (object == null) {
                    throw new IllegalStateException(String.format("Annotation method %s returned null", method));
                }
                n2 += org.apache.commons.c.a.a(method.getName(), object);
            }
            catch (RuntimeException runtimeException) {
                throw runtimeException;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        }
        return n2;
    }

    public static String b(Annotation annotation) {
        ae ae2 = new ae(annotation, a);
        for (Method method : annotation.annotationType().getDeclaredMethods()) {
            if (method.getParameterTypes().length > 0) continue;
            try {
                ae2.a(method.getName(), method.invoke(annotation, new Object[0]));
            }
            catch (RuntimeException runtimeException) {
                throw runtimeException;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        }
        return ae2.j();
    }

    public static boolean a(Class class_) {
        if (class_ == null) {
            return false;
        }
        if (class_.isArray()) {
            class_ = class_.getComponentType();
        }
        return class_.isPrimitive() || class_.isEnum() || class_.isAnnotation() || String.class.equals(class_) || Class.class.equals(class_);
    }

    private static int a(String string, Object object) {
        int n2 = string.hashCode() * 127;
        if (object.getClass().isArray()) {
            return n2 ^ org.apache.commons.c.a.a(object.getClass().getComponentType(), object);
        }
        if (object instanceof Annotation) {
            return n2 ^ org.apache.commons.c.a.a((Annotation)object);
        }
        return n2 ^ object.hashCode();
    }

    private static boolean a(Class class_, Object object, Object object2) {
        if (object == object2) {
            return true;
        }
        if (object == null || object2 == null) {
            return false;
        }
        if (class_.isArray()) {
            return org.apache.commons.c.a.b(class_.getComponentType(), object, object2);
        }
        if (class_.isAnnotation()) {
            return org.apache.commons.c.a.a((Annotation)object, (Annotation)object2);
        }
        return object.equals(object2);
    }

    private static boolean b(Class class_, Object object, Object object2) {
        if (class_.isAnnotation()) {
            return org.apache.commons.c.a.a((Annotation[])object, (Annotation[])object2);
        }
        if (class_.equals(Byte.TYPE)) {
            return Arrays.equals((byte[])object, (byte[])object2);
        }
        if (class_.equals(Short.TYPE)) {
            return Arrays.equals((short[])object, (short[])object2);
        }
        if (class_.equals(Integer.TYPE)) {
            return Arrays.equals((int[])object, (int[])object2);
        }
        if (class_.equals(Character.TYPE)) {
            return Arrays.equals((char[])object, (char[])object2);
        }
        if (class_.equals(Long.TYPE)) {
            return Arrays.equals((long[])object, (long[])object2);
        }
        if (class_.equals(Float.TYPE)) {
            return Arrays.equals((float[])object, (float[])object2);
        }
        if (class_.equals(Double.TYPE)) {
            return Arrays.equals((double[])object, (double[])object2);
        }
        if (class_.equals(Boolean.TYPE)) {
            return Arrays.equals((boolean[])object, (boolean[])object2);
        }
        return Arrays.equals((Object[])object, (Object[])object2);
    }

    private static boolean a(Annotation[] arrannotation, Annotation[] arrannotation2) {
        if (arrannotation.length != arrannotation2.length) {
            return false;
        }
        for (int i2 = 0; i2 < arrannotation.length; ++i2) {
            if (org.apache.commons.c.a.a(arrannotation[i2], arrannotation2[i2])) continue;
            return false;
        }
        return true;
    }

    private static int a(Class class_, Object object) {
        if (class_.equals(Byte.TYPE)) {
            return Arrays.hashCode((byte[])object);
        }
        if (class_.equals(Short.TYPE)) {
            return Arrays.hashCode((short[])object);
        }
        if (class_.equals(Integer.TYPE)) {
            return Arrays.hashCode((int[])object);
        }
        if (class_.equals(Character.TYPE)) {
            return Arrays.hashCode((char[])object);
        }
        if (class_.equals(Long.TYPE)) {
            return Arrays.hashCode((long[])object);
        }
        if (class_.equals(Float.TYPE)) {
            return Arrays.hashCode((float[])object);
        }
        if (class_.equals(Double.TYPE)) {
            return Arrays.hashCode((double[])object);
        }
        if (class_.equals(Boolean.TYPE)) {
            return Arrays.hashCode((boolean[])object);
        }
        return Arrays.hashCode((Object[])object);
    }
}

