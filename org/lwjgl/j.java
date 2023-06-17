/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import java.security.PrivilegedAction;

final class j
implements PrivilegedAction {
    final /* synthetic */ String a;
    final /* synthetic */ int b;

    j(String string, int n2) {
        this.a = string;
        this.b = n2;
    }

    public Integer a() {
        return Integer.getInteger(this.a, this.b);
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

