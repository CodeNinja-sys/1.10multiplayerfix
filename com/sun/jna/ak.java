/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.Native;
import java.lang.reflect.Method;
import java.security.PrivilegedAction;

class ak
implements PrivilegedAction {
    ak() {
    }

    public Object run() {
        try {
            Method method = (Native.k == null ? (Native.k = Native.f("java.lang.ClassLoader")) : Native.k).getDeclaredMethod("findLibrary", Native.j == null ? (Native.j = Native.f("java.lang.String")) : Native.j);
            method.setAccessible(true);
            return method;
        }
        catch (Exception exception) {
            return null;
        }
    }
}

