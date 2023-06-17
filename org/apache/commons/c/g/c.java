/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.g;

import org.apache.commons.c.e;

public class c {
    public static int a(Class class_, Class class_2) {
        if (class_ == null || class_2 == null) {
            return -1;
        }
        if (class_.equals(class_2)) {
            return 0;
        }
        Class class_3 = class_.getSuperclass();
        int n2 = e.a(class_2.equals(class_3));
        if (n2 == 1) {
            return n2;
        }
        return (n2 += c.a(class_3, class_2)) > 0 ? n2 + 1 : -1;
    }
}

