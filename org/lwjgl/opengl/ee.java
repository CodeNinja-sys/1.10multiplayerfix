/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.security.PrivilegedAction;

final class ee
implements PrivilegedAction {
    final /* synthetic */ String a;

    ee(String string) {
        this.a = string;
    }

    public Boolean a() {
        return Boolean.getBoolean(this.a);
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

