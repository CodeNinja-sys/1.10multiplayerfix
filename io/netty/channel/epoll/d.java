/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.epoll;

import io.netty.channel.epoll.Native;

public final class d {
    private static final Throwable a;

    public static boolean a() {
        return a == null;
    }

    public static void b() {
        if (a != null) {
            throw (Error)new UnsatisfiedLinkError("failed to load the required native library").initCause(a);
        }
    }

    public static Throwable c() {
        return a;
    }

    private d() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static {
        Throwable throwable = null;
        int n2 = -1;
        int n3 = -1;
        try {
            n2 = Native.epollCreate();
            n3 = Native.eventFd();
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
        }
        finally {
            if (n2 != -1) {
                try {
                    Native.close(n2);
                }
                catch (Exception exception) {}
            }
            if (n3 != -1) {
                try {
                    Native.close(n3);
                }
                catch (Exception exception) {}
            }
        }
        a = throwable != null ? throwable : null;
    }
}

