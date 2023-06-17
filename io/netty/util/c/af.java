/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import java.security.PrivilegedAction;

final class af
implements PrivilegedAction {
    final /* synthetic */ String a;

    af(String string) {
        this.a = string;
    }

    public String a() {
        return System.getProperty(this.a);
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

