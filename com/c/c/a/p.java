/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.a;

import java.net.Proxy;

public class p {
    private static Proxy a;

    public static Proxy a() {
        return a;
    }

    public static void a(Proxy proxy) {
        if (a == null) {
            a = proxy;
        }
    }
}

