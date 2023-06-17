/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.security.PrivilegedAction;
import org.lwjgl.d;

final class ja
implements PrivilegedAction {
    ja() {
    }

    public Object run() {
        try {
            System.loadLibrary("jawt");
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            d.a((CharSequence)("Failed to load jawt: " + unsatisfiedLinkError.getMessage()));
        }
        return null;
    }
}

