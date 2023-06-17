/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import java.security.PrivilegedAction;

final class dt
implements PrivilegedAction {
    final /* synthetic */ String a;

    dt(String string) {
        this.a = string;
    }

    public String a() {
        return System.getProperty(this.a);
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

