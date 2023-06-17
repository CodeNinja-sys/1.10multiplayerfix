/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.ab;

final class WindowsRegistry {
    static final int a = 1;
    static final int b = 2;
    static final int c = 3;
    static final int d = 4;

    WindowsRegistry() {
    }

    static String a(int n2, String string, String string2) {
        switch (n2) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid enum: " + n2);
            }
        }
        return WindowsRegistry.nQueryRegistrationKey(n2, string, string2);
    }

    private static native String nQueryRegistrationKey(int var0, String var1, String var2);

    static {
        ab.b();
    }
}

