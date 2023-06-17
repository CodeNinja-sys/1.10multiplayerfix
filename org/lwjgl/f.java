/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import java.security.PrivilegedAction;

final class f
implements PrivilegedAction {
    final /* synthetic */ String a;

    f(String string) {
        this.a = string;
    }

    public String a() {
        return System.getProperty(this.a);
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

