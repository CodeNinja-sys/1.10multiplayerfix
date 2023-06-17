/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import java.security.PrivilegedAction;

final class al
implements PrivilegedAction {
    final /* synthetic */ String a;

    al(String string) {
        this.a = string;
    }

    public String a() {
        return System.getProperty(this.a);
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

