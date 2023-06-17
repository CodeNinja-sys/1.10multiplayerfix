/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.l;

import org.apache.a.l.c;
import org.apache.a.l.j;
import org.apache.a.o.a;

public final class h
implements c {
    private h() {
    }

    public static int a(j j2) {
        a.a(j2, "HTTP parameters");
        return j2.a("http.socket.timeout", 0);
    }

    public static void a(j j2, int n2) {
        a.a(j2, "HTTP parameters");
        j2.b("http.socket.timeout", n2);
    }

    public static boolean b(j j2) {
        a.a(j2, "HTTP parameters");
        return j2.a("http.socket.reuseaddr", false);
    }

    public static void a(j j2, boolean bl2) {
        a.a(j2, "HTTP parameters");
        j2.b("http.socket.reuseaddr", bl2);
    }

    public static boolean c(j j2) {
        a.a(j2, "HTTP parameters");
        return j2.a("http.tcp.nodelay", true);
    }

    public static void b(j j2, boolean bl2) {
        a.a(j2, "HTTP parameters");
        j2.b("http.tcp.nodelay", bl2);
    }

    public static int d(j j2) {
        a.a(j2, "HTTP parameters");
        return j2.a("http.socket.buffer-size", -1);
    }

    public static void b(j j2, int n2) {
        a.a(j2, "HTTP parameters");
        j2.b("http.socket.buffer-size", n2);
    }

    public static int e(j j2) {
        a.a(j2, "HTTP parameters");
        return j2.a("http.socket.linger", -1);
    }

    public static void c(j j2, int n2) {
        a.a(j2, "HTTP parameters");
        j2.b("http.socket.linger", n2);
    }

    public static int f(j j2) {
        a.a(j2, "HTTP parameters");
        return j2.a("http.connection.timeout", 0);
    }

    public static void d(j j2, int n2) {
        a.a(j2, "HTTP parameters");
        j2.b("http.connection.timeout", n2);
    }

    public static boolean g(j j2) {
        a.a(j2, "HTTP parameters");
        return j2.a("http.connection.stalecheck", true);
    }

    public static void c(j j2, boolean bl2) {
        a.a(j2, "HTTP parameters");
        j2.b("http.connection.stalecheck", bl2);
    }

    public static boolean h(j j2) {
        a.a(j2, "HTTP parameters");
        return j2.a("http.socket.keepalive", false);
    }

    public static void d(j j2, boolean bl2) {
        a.a(j2, "HTTP parameters");
        j2.b("http.socket.keepalive", bl2);
    }
}

