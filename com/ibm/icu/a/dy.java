/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

public final class dy {
    public static boolean a(int n2) {
        return (n2 & 0x400) == 0;
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        int n2 = charSequence.length();
        if (n2 != charSequence2.length()) {
            return false;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            if (charSequence.charAt(i2) == charSequence2.charAt(i2)) continue;
            return false;
        }
        return true;
    }

    public static boolean a(CharSequence charSequence, int n2, int n3, CharSequence charSequence2, int n4, int n5) {
        if (n3 - n2 != n5 - n4) {
            return false;
        }
        if (charSequence == charSequence2 && n2 == n4) {
            return true;
        }
        while (n2 < n3) {
            if (charSequence.charAt(n2++) == charSequence2.charAt(n4++)) continue;
            return false;
        }
        return true;
    }
}

