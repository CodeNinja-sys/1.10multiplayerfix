/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.ce;
import com.a.a.b.cl;
import java.util.Arrays;

public final class cc {
    private cc() {
    }

    public static boolean a(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
    }

    public static int a(Object ... arrobject) {
        return Arrays.hashCode(arrobject);
    }

    public static ce a(Object object) {
        return new ce(cc.b(object.getClass()), null);
    }

    public static ce a(Class class_) {
        return new ce(cc.b(class_), null);
    }

    public static ce a(String string) {
        return new ce(string, null);
    }

    private static String b(Class class_) {
        String string = class_.getName();
        int n2 = (string = string.replaceAll("\\$[0-9]+", "\\$")).lastIndexOf(36);
        if (n2 == -1) {
            n2 = string.lastIndexOf(46);
        }
        return string.substring(n2 + 1);
    }

    public static Object b(Object object, Object object2) {
        return object != null ? object : cl.a(object2);
    }
}

