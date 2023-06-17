/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.a;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import org.lwjgl.opengl.dx;
import org.lwjgl.opengl.gc;

final class n
implements PrivilegedExceptionAction {
    n() {
    }

    public gc a() {
        Method method = dx.class.getDeclaredMethod("t", new Class[0]);
        method.setAccessible(true);
        return (gc)method.invoke(null, new Object[0]);
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

