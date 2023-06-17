/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.security.PrivilegedExceptionAction;

final class dp
implements PrivilegedExceptionAction {
    dp() {
    }

    public PointerInfo a() {
        return MouseInfo.getPointerInfo();
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

