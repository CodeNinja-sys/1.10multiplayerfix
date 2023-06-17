/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.g;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import org.apache.commons.c.o;

abstract class d {
    private static final int a = 7;
    private static final Class[] b = new Class[]{Byte.TYPE, Short.TYPE, Character.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE};

    d() {
    }

    static boolean a(AccessibleObject accessibleObject) {
        if (accessibleObject == null || accessibleObject.isAccessible()) {
            return false;
        }
        Member member = (Member)((Object)accessibleObject);
        if (!accessibleObject.isAccessible() && Modifier.isPublic(member.getModifiers()) && d.a(member.getDeclaringClass().getModifiers())) {
            try {
                accessibleObject.setAccessible(true);
                return true;
            }
            catch (SecurityException securityException) {
                // empty catch block
            }
        }
        return false;
    }

    static boolean a(int n2) {
        return (n2 & 7) == 0;
    }

    static boolean a(Member member) {
        return member != null && Modifier.isPublic(member.getModifiers()) && !member.isSynthetic();
    }

    static int a(Class[] arrclass, Class[] arrclass2, Class[] arrclass3) {
        float f2;
        float f3 = d.a(arrclass3, arrclass);
        return f3 < (f2 = d.a(arrclass3, arrclass2)) ? -1 : (f2 < f3 ? 1 : 0);
    }

    private static float a(Class[] arrclass, Class[] arrclass2) {
        float f2 = 0.0f;
        for (int i2 = 0; i2 < arrclass.length; ++i2) {
            Class class_ = arrclass[i2];
            Class class_2 = arrclass2[i2];
            f2 += d.a(class_, class_2);
        }
        return f2;
    }

    private static float a(Class class_, Class class_2) {
        if (class_2.isPrimitive()) {
            return d.b(class_, class_2);
        }
        float f2 = 0.0f;
        while (class_ != null && !class_2.equals(class_)) {
            if (class_2.isInterface() && o.a(class_, class_2)) {
                f2 += 0.25f;
                break;
            }
            f2 += 1.0f;
            class_ = class_.getSuperclass();
        }
        if (class_ == null) {
            f2 += 1.5f;
        }
        return f2;
    }

    private static float b(Class class_, Class class_2) {
        float f2 = 0.0f;
        Class class_3 = class_;
        if (!class_3.isPrimitive()) {
            f2 += 0.1f;
            class_3 = o.i(class_3);
        }
        for (int i2 = 0; class_3 != class_2 && i2 < b.length; ++i2) {
            if (class_3 != b[i2]) continue;
            f2 += 0.1f;
            if (i2 >= b.length - 1) continue;
            class_3 = b[i2 + 1];
        }
        return f2;
    }
}

