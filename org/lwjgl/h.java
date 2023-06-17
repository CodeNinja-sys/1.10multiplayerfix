/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import java.security.PrivilegedAction;

final class h
implements PrivilegedAction {
    final /* synthetic */ String a;

    h(String string) {
        this.a = string;
    }

    public Boolean a() {
        return Boolean.getBoolean(this.a);
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

