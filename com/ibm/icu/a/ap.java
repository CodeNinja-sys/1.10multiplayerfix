/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import java.io.InputStream;
import java.security.PrivilegedAction;

final class ap
implements PrivilegedAction {
    final /* synthetic */ ClassLoader a;
    final /* synthetic */ String b;

    ap(ClassLoader classLoader, String string) {
        this.a = classLoader;
        this.b = string;
    }

    public InputStream a() {
        return this.a.getResourceAsStream(this.b);
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

