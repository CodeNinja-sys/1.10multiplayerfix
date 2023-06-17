/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import java.nio.ByteBuffer;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import org.lwjgl.DefaultSysImplementation;
import org.lwjgl.ab;
import org.lwjgl.ag;
import org.lwjgl.d;
import org.lwjgl.o;
import org.lwjgl.opengl.dx;

final class WindowsSysImplementation
extends DefaultSysImplementation {
    private static final int a = 24;

    WindowsSysImplementation() {
    }

    public int e() {
        return 24;
    }

    public long a() {
        return 1000L;
    }

    public long c() {
        return WindowsSysImplementation.nGetTime();
    }

    private static native long nGetTime();

    public boolean b() {
        return true;
    }

    private static long f() {
        if (!dx.v()) {
            return 0L;
        }
        try {
            return (Long)AccessController.doPrivileged(new ag());
        }
        catch (PrivilegedActionException privilegedActionException) {
            throw new Error(privilegedActionException);
        }
    }

    public void a(String string, String string2) {
        if (!dx.v()) {
            WindowsSysImplementation.initCommonControls();
        }
        d.a((CharSequence)String.format("*** Alert *** %s\n%s\n", string, string2));
        ByteBuffer byteBuffer = o.c(string);
        ByteBuffer byteBuffer2 = o.c(string2);
        WindowsSysImplementation.nAlert(WindowsSysImplementation.f(), o.a(byteBuffer), o.a(byteBuffer2));
    }

    private static native void nAlert(long var0, long var2, long var4);

    private static native void initCommonControls();

    public boolean a(String string) {
        try {
            d.a(new String[]{"rundll32", "url.dll,FileProtocolHandler", string});
            return true;
        }
        catch (Exception exception) {
            d.a((CharSequence)("Failed to open url (" + string + "): " + exception.getMessage()));
            return false;
        }
    }

    public String d() {
        return WindowsSysImplementation.nGetClipboard();
    }

    private static native String nGetClipboard();

    static {
        ab.b();
    }
}

