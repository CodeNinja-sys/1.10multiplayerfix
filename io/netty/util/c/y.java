/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import java.security.PrivilegedAction;

final class y
implements PrivilegedAction {
    y() {
    }

    public ClassLoader a() {
        return ClassLoader.getSystemClassLoader();
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

