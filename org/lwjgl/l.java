/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import java.awt.Toolkit;
import java.security.AccessController;
import org.lwjgl.b;
import org.lwjgl.d;
import org.lwjgl.m;

final class l
extends b {
    private static final int a = 19;

    l() {
    }

    public int e() {
        return 19;
    }

    public boolean a(String string) {
        String[] arrstring;
        for (String string2 : arrstring = new String[]{"sensible-browser", "xdg-open", "google-chrome", "chromium", "firefox", "iceweasel", "mozilla", "opera", "konqueror", "nautilus", "galeon", "netscape"}) {
            try {
                d.a(new String[]{string2, string});
                return true;
            }
            catch (Exception exception) {
                exception.printStackTrace(System.err);
            }
        }
        return false;
    }

    public boolean b() {
        return true;
    }

    static {
        Toolkit.getDefaultToolkit();
        AccessController.doPrivileged(new m());
    }
}

