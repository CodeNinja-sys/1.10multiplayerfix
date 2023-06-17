/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.o;

public final class k {
    public static boolean a(CharSequence charSequence) {
        if (charSequence == null) {
            return true;
        }
        return charSequence.length() == 0;
    }

    public static boolean b(CharSequence charSequence) {
        if (charSequence == null) {
            return true;
        }
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            if (Character.isWhitespace(charSequence.charAt(i2))) continue;
            return false;
        }
        return true;
    }
}

