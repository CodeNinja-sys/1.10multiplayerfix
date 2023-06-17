/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.a;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;

final class m
implements PrivilegedExceptionAction {
    m() {
    }

    public Object run() {
        Field field = Class.forName("org.lwjgl.opengl.fz").getDeclaredField("a");
        field.setAccessible(true);
        return field.get(null);
    }
}

