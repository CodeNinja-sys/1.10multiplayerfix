/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.openal;

import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.a;
import org.lwjgl.openal.b;
import org.lwjgl.openal.d;

public final class e {
    private e() {
    }

    public static void a(b b2) {
        int n2 = ALC10.b(b2);
        if (n2 != 0) {
            throw new d(ALC10.a(AL.e(), n2));
        }
    }

    public static void a() {
        int n2 = AL10.a();
        if (n2 != 0) {
            throw new d(n2);
        }
    }

    public static void b(b b2) {
        if (!b2.b()) {
            throw new d("Invalid device: " + b2);
        }
    }

    public static void a(a a2) {
        if (!a2.b()) {
            throw new d("Invalid context: " + a2);
        }
    }
}

