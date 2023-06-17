/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.Native;
import com.sun.jna.ax;
import java.awt.Component;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Window;

class ao {
    private ao() {
    }

    static long a(Window window) {
        return ao.a((Object)window);
    }

    static long a(Object object) {
        if (GraphicsEnvironment.isHeadless()) {
            throw new HeadlessException("No native windows when headless");
        }
        Component component = (Component)object;
        if (component.isLightweight()) {
            throw new IllegalArgumentException("Component must be heavyweight");
        }
        if (!component.isDisplayable()) {
            throw new IllegalStateException("Component must be displayable");
        }
        if (ax.i() && System.getProperty("java.version").startsWith("1.4") && !component.isVisible()) {
            throw new IllegalStateException("Component must be visible");
        }
        return Native.getWindowHandle0(component);
    }
}

