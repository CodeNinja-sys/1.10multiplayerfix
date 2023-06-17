/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

final class WindowsFileVersion {
    private final int a;
    private final int b;

    WindowsFileVersion(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public String toString() {
        int n2 = this.a >> 16 & 0xFFFF;
        int n3 = this.a & 0xFFFF;
        int n4 = this.b >> 16 & 0xFFFF;
        int n5 = this.b & 0xFFFF;
        return n2 + "." + n3 + "." + n4 + "." + n5;
    }
}

