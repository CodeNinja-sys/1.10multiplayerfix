/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.gh;

class gg
implements gh {
    gg() {
    }

    public void a(int n2, int n3, int n4, int n5, String string) {
        String string2;
        System.err.println("[LWJGL] KHR_debug message");
        System.err.println("\tID: " + n4);
        switch (n2) {
            case 33350: {
                string2 = "API";
                break;
            }
            case 33351: {
                string2 = "WINDOW SYSTEM";
                break;
            }
            case 33352: {
                string2 = "SHADER COMPILER";
                break;
            }
            case 33353: {
                string2 = "THIRD PARTY";
                break;
            }
            case 33354: {
                string2 = "APPLICATION";
                break;
            }
            case 33355: {
                string2 = "OTHER";
                break;
            }
            default: {
                string2 = this.a(n2);
            }
        }
        System.err.println("\tSource: " + string2);
        switch (n3) {
            case 33356: {
                string2 = "ERROR";
                break;
            }
            case 33357: {
                string2 = "DEPRECATED BEHAVIOR";
                break;
            }
            case 33358: {
                string2 = "UNDEFINED BEHAVIOR";
                break;
            }
            case 33359: {
                string2 = "PORTABILITY";
                break;
            }
            case 33360: {
                string2 = "PERFORMANCE";
                break;
            }
            case 33361: {
                string2 = "OTHER";
                break;
            }
            case 33384: {
                string2 = "MARKER";
                break;
            }
            default: {
                string2 = this.a(n3);
            }
        }
        System.err.println("\tType: " + string2);
        switch (n5) {
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
            case 33387: {
                string2 = "NOTIFICATION";
                break;
            }
            default: {
                string2 = this.a(n5);
            }
        }
        System.err.println("\tSeverity: " + string2);
        System.err.println("\tMessage: " + string);
    }

    private String a(int n2) {
        return "Unknown (0x" + Integer.toHexString(n2).toUpperCase() + ")";
    }
}

