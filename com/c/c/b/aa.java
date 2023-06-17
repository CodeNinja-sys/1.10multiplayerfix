/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.b;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public abstract class aa {
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        for (Field field : this.getClass().getFields()) {
            if (aa.a(field)) continue;
            try {
                stringBuilder.append(field.getName()).append("=").append(field.get(this)).append(" ");
            }
            catch (IllegalAccessException illegalAccessException) {
                // empty catch block
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    private static boolean a(Field field) {
        return Modifier.isStatic(field.getModifiers());
    }
}

