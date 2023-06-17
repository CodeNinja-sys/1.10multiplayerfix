/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util;

import org.lwjgl.opengl.DisplayMode;

class d {
    final String a;
    final int b;
    final int c;
    final boolean d;

    d(String string, int n2, int n3, boolean bl2) {
        this.a = string;
        this.b = n2;
        this.c = n3;
        this.d = bl2;
    }

    int a(DisplayMode displayMode) {
        if ("width".equals(this.a)) {
            return displayMode.b();
        }
        if ("height".equals(this.a)) {
            return displayMode.c();
        }
        if ("freq".equals(this.a)) {
            return displayMode.e();
        }
        if ("bpp".equals(this.a)) {
            return displayMode.d();
        }
        throw new IllegalArgumentException("Unknown field " + this.a);
    }
}

