/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.a;

import java.security.PrivilegedAction;

final class k
implements PrivilegedAction {
    final /* synthetic */ String a;

    k(String string) {
        this.a = string;
    }

    public Boolean a() {
        return Boolean.getBoolean(this.a);
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

