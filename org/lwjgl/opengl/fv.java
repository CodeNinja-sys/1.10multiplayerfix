/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;

final class fv
implements PrivilegedExceptionAction {
    final /* synthetic */ Class a;

    fv(Class class_) {
        this.a = class_;
    }

    public Object run() {
        Method method = this.a.getDeclaredMethod("initNativeStubs", new Class[0]);
        method.invoke(null, new Object[0]);
        return null;
    }
}

