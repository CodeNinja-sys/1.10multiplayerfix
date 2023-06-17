/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.d;

public class v {
    public static boolean a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean b(CharSequence charSequence) {
        return !v.a(charSequence);
    }
}

