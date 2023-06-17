/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.c.a.d.ar;
import io.netty.c.a.d.av;

public final class aq {
    private aq() {
    }

    public static void a(av av2) {
        av2.q().a("X-SPDY-Stream-ID");
    }

    public static int b(av av2) {
        return ar.c(av2, "X-SPDY-Stream-ID");
    }

    public static void a(av av2, int n2) {
        ar.b(av2, "X-SPDY-Stream-ID", n2);
    }

    public static void c(av av2) {
        av2.q().a("X-SPDY-Associated-To-Stream-ID");
    }

    public static int d(av av2) {
        return ar.a(av2, "X-SPDY-Associated-To-Stream-ID", 0);
    }

    public static void b(av av2, int n2) {
        ar.b(av2, "X-SPDY-Associated-To-Stream-ID", n2);
    }

    public static void e(av av2) {
        av2.q().a("X-SPDY-Priority");
    }

    public static byte f(av av2) {
        return (byte)ar.a(av2, "X-SPDY-Priority", 0);
    }

    public static void a(av av2, byte by2) {
        ar.b(av2, "X-SPDY-Priority", (int)by2);
    }

    public static void g(av av2) {
        av2.q().a("X-SPDY-URL");
    }

    public static String h(av av2) {
        return av2.q().b("X-SPDY-URL");
    }

    public static void a(av av2, String string) {
        av2.q().b("X-SPDY-URL", (Object)string);
    }

    public static void i(av av2) {
        av2.q().a("X-SPDY-Scheme");
    }

    public static String j(av av2) {
        return av2.q().b("X-SPDY-Scheme");
    }

    public static void b(av av2, String string) {
        av2.q().b("X-SPDY-Scheme", (Object)string);
    }
}

