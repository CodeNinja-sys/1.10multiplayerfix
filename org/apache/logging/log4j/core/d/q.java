/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.d;

import java.security.PrivilegedAction;

final class q
implements PrivilegedAction {
    q() {
    }

    public ClassLoader a() {
        return Thread.currentThread().getContextClassLoader();
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

