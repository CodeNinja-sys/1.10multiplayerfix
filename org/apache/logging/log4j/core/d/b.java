/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.d;

public class b {
    public static boolean a(String string, boolean bl2) {
        return "true".equalsIgnoreCase(string) || bl2 && !"false".equalsIgnoreCase(string);
    }
}

