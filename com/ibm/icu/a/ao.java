/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import java.io.InputStream;
import java.security.PrivilegedAction;

final class ao
implements PrivilegedAction {
    final /* synthetic */ Class a;
    final /* synthetic */ String b;

    ao(Class class_, String string) {
        this.a = class_;
        this.b = string;
    }

    public InputStream a() {
        return this.a.getResourceAsStream(this.b);
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

