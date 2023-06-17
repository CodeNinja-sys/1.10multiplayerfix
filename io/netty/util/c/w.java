/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import java.security.PrivilegedAction;

final class w
implements PrivilegedAction {
    final /* synthetic */ Class a;

    w(Class class_) {
        this.a = class_;
    }

    public ClassLoader a() {
        return this.a.getClassLoader();
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

