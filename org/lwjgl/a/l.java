/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.a;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import org.lwjgl.a.m;
import org.lwjgl.a.n;
import org.lwjgl.opengl.gc;

final class l {
    static final Object a;

    l() {
    }

    static gc a() {
        try {
            return (gc)AccessController.doPrivileged(new n());
        }
        catch (PrivilegedActionException privilegedActionException) {
            throw new Error(privilegedActionException);
        }
    }

    static {
        try {
            a = AccessController.doPrivileged(new m());
        }
        catch (PrivilegedActionException privilegedActionException) {
            throw new Error(privilegedActionException);
        }
    }
}

