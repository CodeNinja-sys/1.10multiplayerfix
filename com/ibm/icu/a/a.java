/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

public class a {
    public static void a(Exception exception) {
        a.a(exception.toString());
    }

    public static void a(String string) {
        throw new IllegalStateException("failure '" + string + "'");
    }

    public static void a(boolean bl2) {
        if (!bl2) {
            throw new IllegalStateException("assert failed");
        }
    }

    public static void a(String string, boolean bl2) {
        if (!bl2) {
            throw new IllegalStateException("assert '" + string + "' failed");
        }
    }
}

