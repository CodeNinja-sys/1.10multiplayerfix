/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.security.PrivilegedAction;

final class ef
implements PrivilegedAction {
    final /* synthetic */ String a;

    ef(String string) {
        this.a = string;
    }

    public String a() {
        return System.getProperty(this.a);
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

