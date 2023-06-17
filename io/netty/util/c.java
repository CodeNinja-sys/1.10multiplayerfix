/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.an;
import io.netty.util.c.u;
import java.util.concurrent.ConcurrentMap;

public final class c
extends an {
    private static final ConcurrentMap a = u.m();

    public static c a(String string) {
        return new c(string);
    }

    public c(String string) {
        super(a, string, new Object[0]);
    }
}

