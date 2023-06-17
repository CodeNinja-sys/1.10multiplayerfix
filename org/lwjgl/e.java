/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import java.security.PrivilegedExceptionAction;

final class e
implements PrivilegedExceptionAction {
    final /* synthetic */ String[] a;

    e(String[] arrstring) {
        this.a = arrstring;
    }

    public Process a() {
        return Runtime.getRuntime().exec(this.a);
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

