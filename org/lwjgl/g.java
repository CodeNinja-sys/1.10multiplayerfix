/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;

final class g
implements PrivilegedExceptionAction {
    final /* synthetic */ Class a;
    final /* synthetic */ ClassLoader b;
    final /* synthetic */ String c;

    g(Class class_, ClassLoader classLoader, String string) {
        this.a = class_;
        this.b = classLoader;
        this.c = string;
    }

    public String a() {
        Method method = this.a.getDeclaredMethod("findLibrary", String.class);
        method.setAccessible(true);
        String string = (String)method.invoke(this.b, this.c);
        return string;
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

