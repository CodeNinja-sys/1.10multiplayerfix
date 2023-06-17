/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.Native;

class ap {
    private ap() {
    }

    static boolean a(Class class_) {
        return (Native.D == null ? (Native.D = Native.f("java.nio.Buffer")) : Native.D).isAssignableFrom(class_);
    }
}

