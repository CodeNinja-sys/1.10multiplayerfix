/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import java.security.PrivilegedAction;

final class m
implements PrivilegedAction {
    m() {
    }

    public Object run() {
        try {
            System.loadLibrary("jawt");
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            // empty catch block
        }
        return null;
    }
}

