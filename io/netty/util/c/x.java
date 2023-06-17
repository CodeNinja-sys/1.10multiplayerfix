/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import java.security.PrivilegedAction;

final class x
implements PrivilegedAction {
    x() {
    }

    public ClassLoader a() {
        return Thread.currentThread().getContextClassLoader();
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

