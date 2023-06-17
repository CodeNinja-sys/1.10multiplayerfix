/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import java.io.InputStream;
import java.security.PrivilegedAction;

final class ep
implements PrivilegedAction {
    final /* synthetic */ ClassLoader a;
    final /* synthetic */ String b;

    ep(ClassLoader classLoader, String string) {
        this.a = classLoader;
        this.b = string;
    }

    public InputStream a() {
        if (this.a != null) {
            return this.a.getResourceAsStream(this.b);
        }
        return ClassLoader.getSystemResourceAsStream(this.b);
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

