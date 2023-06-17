/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import java.security.PrivilegedAction;

final class i
implements PrivilegedAction {
    final /* synthetic */ String a;

    i(String string) {
        this.a = string;
    }

    public Integer a() {
        return Integer.getInteger(this.a);
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

