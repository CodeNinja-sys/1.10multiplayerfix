/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.ig;

public final class iy {
    private iy() {
    }

    public static void a() {
        int n2 = GL11.b();
        if (n2 != 0) {
            throw new ig(n2);
        }
    }

    public static String a(int n2) {
        switch (n2) {
            case 0: {
                return "No error";
            }
            case 1280: {
                return "Invalid enum";
            }
            case 1281: {
                return "Invalid value";
            }
            case 1282: {
                return "Invalid operation";
            }
            case 1283: {
                return "Stack overflow";
            }
            case 1284: {
                return "Stack underflow";
            }
            case 1285: {
                return "Out of memory";
            }
            case 32817: {
                return "Table too large";
            }
            case 1286: {
                return "Invalid framebuffer operation";
            }
        }
        return null;
    }
}

