/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import org.lwjgl.opengl.dx;

final class ag
implements PrivilegedExceptionAction {
    ag() {
    }

    public Long a() {
        Method method = dx.class.getDeclaredMethod("t", new Class[0]);
        method.setAccessible(true);
        Object object = method.invoke(null, new Object[0]);
        Class<?> class_ = Class.forName("org.lwjgl.opengl.WindowsDisplay");
        Method method2 = class_.getDeclaredMethod("J", new Class[0]);
        method2.setAccessible(true);
        return (Long)method2.invoke(object, new Object[0]);
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

