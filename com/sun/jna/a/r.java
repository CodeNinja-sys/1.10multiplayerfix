/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.u;
import com.sun.jna.a.y;
import java.awt.Component;
import java.awt.GraphicsConfiguration;
import java.awt.Shape;
import java.awt.Window;
import javax.swing.Icon;

public class r {
    private static final String b = "transparent-old-bg";
    private static final String c = "transparent-old-opaque";
    private static final String d = "transparent-alpha";
    public static final Shape a = null;

    private static y c() {
        return u.b;
    }

    public static void a(Window window, Shape shape) {
        r.c().a((Component)window, shape);
    }

    public static void a(Component component, Shape shape) {
        r.c().a(component, shape);
    }

    public static void a(Window window, Icon icon) {
        r.c().b((Component)window, icon);
    }

    public static boolean a() {
        return r.c().a();
    }

    public static GraphicsConfiguration b() {
        return r.c().b();
    }

    public static void a(Window window, float f2) {
        r.c().a(window, Math.max(0.0f, Math.min(f2, 1.0f)));
    }

    public static void a(Window window, boolean bl2) {
        r.c().a(window, bl2);
    }
}

