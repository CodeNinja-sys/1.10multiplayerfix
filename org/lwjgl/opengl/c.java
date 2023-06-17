/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.d;

class c
implements d {
    c() {
    }

    public void a(int n2, int n3, int n4, String string) {
        String string2;
        System.err.println("[LWJGL] AMD_debug_output message");
        System.err.println("\tID: " + n2);
        switch (n3) {
            case 37193: {
                string2 = "API ERROR";
                break;
            }
            case 37194: {
                string2 = "WINDOW SYSTEM";
                break;
            }
            case 37195: {
                string2 = "DEPRECATION";
                break;
            }
            case 37196: {
                string2 = "UNDEFINED BEHAVIOR";
                break;
            }
            case 37197: {
                string2 = "PERFORMANCE";
                break;
            }
            case 37198: {
                string2 = "SHADER COMPILER";
                break;
            }
            case 37199: {
                string2 = "APPLICATION";
                break;
            }
            case 37200: {
                string2 = "OTHER";
                break;
            }
            default: {
                string2 = this.a(n3);
            }
        }
        System.err.println("\tCategory: " + string2);
        switch (n4) {
            case 37190: {
                string2 = "HIGH";
                break;
            }
            case 37191: {
                string2 = "MEDIUM";
                break;
            }
            case 37192: {
                string2 = "LOW";
                break;
            }
            default: {
                string2 = this.a(n4);
            }
        }
        System.err.println("\tSeverity: " + string2);
        System.err.println("\tMessage: " + string);
    }

    private String a(int n2) {
        return "Unknown (0x" + Integer.toHexString(n2).toUpperCase() + ")";
    }
}

