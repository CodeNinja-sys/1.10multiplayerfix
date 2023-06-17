/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import java.lang.reflect.Method;
import java.net.URL;
import java.security.PrivilegedExceptionAction;

final class ae
implements PrivilegedExceptionAction {
    final /* synthetic */ Class a;

    ae(Class class_) {
        this.a = class_;
    }

    public Method a() {
        return this.a.getMethod("showDocument", URL.class);
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

