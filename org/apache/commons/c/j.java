/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

public class j {
    public static CharSequence a(CharSequence charSequence, int n2) {
        return charSequence == null ? null : charSequence.subSequence(n2, charSequence.length());
    }

    static int a(CharSequence charSequence, int n2, int n3) {
        if (charSequence instanceof String) {
            return ((String)charSequence).indexOf(n2, n3);
        }
        int n4 = charSequence.length();
        if (n3 < 0) {
            n3 = 0;
        }
        for (int i2 = n3; i2 < n4; ++i2) {
            if (charSequence.charAt(i2) != n2) continue;
            return i2;
        }
        return -1;
    }

    static int a(CharSequence charSequence, CharSequence charSequence2, int n2) {
        return charSequence.toString().indexOf(charSequence2.toString(), n2);
    }

    static int b(CharSequence charSequence, int n2, int n3) {
        if (charSequence instanceof String) {
            return ((String)charSequence).lastIndexOf(n2, n3);
        }
        int n4 = charSequence.length();
        if (n3 < 0) {
            return -1;
        }
        if (n3 >= n4) {
            n3 = n4 - 1;
        }
        for (int i2 = n3; i2 >= 0; --i2) {
            if (charSequence.charAt(i2) != n2) continue;
            return i2;
        }
        return -1;
    }

    static int b(CharSequence charSequence, CharSequence charSequence2, int n2) {
        return charSequence.toString().lastIndexOf(charSequence2.toString(), n2);
    }

    static char[] a(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return ((String)charSequence).toCharArray();
        }
        int n2 = charSequence.length();
        char[] arrc = new char[charSequence.length()];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrc[i2] = charSequence.charAt(i2);
        }
        return arrc;
    }

    static boolean a(CharSequence charSequence, boolean bl2, int n2, CharSequence charSequence2, int n3, int n4) {
        if (charSequence instanceof String && charSequence2 instanceof String) {
            return ((String)charSequence).regionMatches(bl2, n2, (String)charSequence2, n3, n4);
        }
        int n5 = n2;
        int n6 = n3;
        int n7 = n4;
        while (n7-- > 0) {
            char c2;
            char c3;
            if ((c3 = charSequence.charAt(n5++)) == (c2 = charSequence2.charAt(n6++))) continue;
            if (!bl2) {
                return false;
            }
            if (Character.toUpperCase(c3) == Character.toUpperCase(c2) || Character.toLowerCase(c3) == Character.toLowerCase(c2)) continue;
            return false;
        }
        return true;
    }
}

