/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;

final class ad
implements PrivilegedExceptionAction {
    final /* synthetic */ Class a;

    ad(Class class_) {
        this.a = class_;
    }

    public Method a() {
        return this.a.getMethod("lookup", String.class);
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

