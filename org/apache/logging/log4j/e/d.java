/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.e;

import java.security.PrivilegedAction;

final class d
implements PrivilegedAction {
    d() {
    }

    public ClassLoader a() {
        return Thread.currentThread().getContextClassLoader();
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

