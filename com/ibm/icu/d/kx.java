/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.hk;
import com.ibm.icu.d.iq;

public final class kx {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 5;
    public static final int d = 0;
    public static final int e = 0x10FFFF;
    public static final int f = 65536;
    public static final int g = 55296;
    public static final int h = 56320;
    public static final int i = 56319;
    public static final int j = 57343;
    public static final int k = 55296;
    public static final int l = 57343;
    private static final int m = -1024;
    private static final int n = -1024;
    private static final int o = -2048;
    private static final int p = 55296;
    private static final int q = 56320;
    private static final int r = 55296;
    private static final int s = 10;
    private static final int t = 1023;
    private static final int u = 55232;

    private kx() {
    }

    public static int a(String string, int n2) {
        char c2 = string.charAt(n2);
        if (c2 < '\ud800') {
            return c2;
        }
        return kx.a(string, n2, c2);
    }

    private static int a(String string, int n2, char c2) {
        char c3;
        if (c2 > '\udfff') {
            return c2;
        }
        if (c2 <= '\udbff') {
            char c4;
            if (string.length() != ++n2 && (c4 = string.charAt(n2)) >= '\udc00' && c4 <= '\udfff') {
                return hk.a(c2, c4);
            }
        } else if (--n2 >= 0 && (c3 = string.charAt(n2)) >= '\ud800' && c3 <= '\udbff') {
            return hk.a(c3, c2);
        }
        return c2;
    }

    public static int a(CharSequence charSequence, int n2) {
        char c2 = charSequence.charAt(n2);
        if (c2 < '\ud800') {
            return c2;
        }
        return kx.a(charSequence, n2, c2);
    }

    private static int a(CharSequence charSequence, int n2, char c2) {
        char c3;
        if (c2 > '\udfff') {
            return c2;
        }
        if (c2 <= '\udbff') {
            char c4;
            if (charSequence.length() != ++n2 && (c4 = charSequence.charAt(n2)) >= '\udc00' && c4 <= '\udfff') {
                return hk.a(c2, c4);
            }
        } else if (--n2 >= 0 && (c3 = charSequence.charAt(n2)) >= '\ud800' && c3 <= '\udbff') {
            return hk.a(c3, c2);
        }
        return c2;
    }

    public static int a(StringBuffer stringBuffer, int n2) {
        char c2;
        if (n2 < 0 || n2 >= stringBuffer.length()) {
            throw new StringIndexOutOfBoundsException(n2);
        }
        char c3 = stringBuffer.charAt(n2);
        if (!kx.a(c3)) {
            return c3;
        }
        if (c3 <= '\udbff') {
            char c4;
            if (stringBuffer.length() != ++n2 && kx.b(c4 = stringBuffer.charAt(n2))) {
                return hk.a(c3, c4);
            }
        } else if (--n2 >= 0 && kx.c(c2 = stringBuffer.charAt(n2))) {
            return hk.a(c2, c3);
        }
        return c3;
    }

    public static int a(char[] arrc, int n2, int n3, int n4) {
        if ((n4 += n2) < n2 || n4 >= n3) {
            throw new ArrayIndexOutOfBoundsException(n4);
        }
        char c2 = arrc[n4];
        if (!kx.a(c2)) {
            return c2;
        }
        if (c2 <= '\udbff') {
            if (++n4 >= n3) {
                return c2;
            }
            char c3 = arrc[n4];
            if (kx.b(c3)) {
                return hk.a(c2, c3);
            }
        } else {
            char c4;
            if (n4 == n2) {
                return c2;
            }
            if (kx.c(c4 = arrc[--n4])) {
                return hk.a(c4, c2);
            }
        }
        return c2;
    }

    public static int a(iq iq2, int n2) {
        char c2;
        if (n2 < 0 || n2 >= iq2.a()) {
            throw new StringIndexOutOfBoundsException(n2);
        }
        char c3 = iq2.a(n2);
        if (!kx.a(c3)) {
            return c3;
        }
        if (c3 <= '\udbff') {
            char c4;
            if (iq2.a() != ++n2 && kx.b(c4 = iq2.a(n2))) {
                return hk.a(c3, c4);
            }
        } else if (--n2 >= 0 && kx.c(c2 = iq2.a(n2))) {
            return hk.a(c2, c3);
        }
        return c3;
    }

    public static int a(int n2) {
        if (n2 < 65536) {
            return 1;
        }
        return 2;
    }

    public static int b(String string, int n2) {
        char c2 = string.charAt(n2);
        if (kx.a(c2)) {
            if (kx.c(c2)) {
                if (++n2 < string.length() && kx.b(string.charAt(n2))) {
                    return 2;
                }
            } else if (--n2 >= 0 && kx.c(string.charAt(n2))) {
                return 5;
            }
        }
        return 1;
    }

    public static int b(StringBuffer stringBuffer, int n2) {
        char c2 = stringBuffer.charAt(n2);
        if (kx.a(c2)) {
            if (kx.c(c2)) {
                if (++n2 < stringBuffer.length() && kx.b(stringBuffer.charAt(n2))) {
                    return 2;
                }
            } else if (--n2 >= 0 && kx.c(stringBuffer.charAt(n2))) {
                return 5;
            }
        }
        return 1;
    }

    public static int b(char[] arrc, int n2, int n3, int n4) {
        if ((n4 += n2) < n2 || n4 >= n3) {
            throw new ArrayIndexOutOfBoundsException(n4);
        }
        char c2 = arrc[n4];
        if (kx.a(c2)) {
            if (kx.c(c2)) {
                if (++n4 < n3 && kx.b(arrc[n4])) {
                    return 2;
                }
            } else if (--n4 >= n2 && kx.c(arrc[n4])) {
                return 5;
            }
        }
        return 1;
    }

    public static boolean a(char c2) {
        return (c2 & 0xFFFFF800) == 55296;
    }

    public static boolean b(char c2) {
        return (c2 & 0xFFFFFC00) == 56320;
    }

    public static boolean c(char c2) {
        return (c2 & 0xFFFFFC00) == 55296;
    }

    public static char b(int n2) {
        if (n2 >= 65536) {
            return (char)(55232 + (n2 >> 10));
        }
        return '\u0000';
    }

    public static char c(int n2) {
        if (n2 >= 65536) {
            return (char)(56320 + (n2 & 0x3FF));
        }
        return (char)n2;
    }

    public static String d(int n2) {
        if (n2 < 0 || n2 > 0x10FFFF) {
            throw new IllegalArgumentException("Illegal codepoint");
        }
        return kx.e(n2);
    }

    public static String c(String string, int n2) {
        switch (kx.b(string, n2)) {
            case 2: {
                return string.substring(n2, n2 + 2);
            }
            case 5: {
                return string.substring(n2 - 1, n2 + 1);
            }
        }
        return string.substring(n2, n2 + 1);
    }

    public static String c(StringBuffer stringBuffer, int n2) {
        switch (kx.b(stringBuffer, n2)) {
            case 2: {
                return stringBuffer.substring(n2, n2 + 2);
            }
            case 5: {
                return stringBuffer.substring(n2 - 1, n2 + 1);
            }
        }
        return stringBuffer.substring(n2, n2 + 1);
    }

    public static String c(char[] arrc, int n2, int n3, int n4) {
        switch (kx.b(arrc, n2, n3, n4)) {
            case 2: {
                return new String(arrc, n2 + n4, 2);
            }
            case 5: {
                return new String(arrc, n2 + n4 - 1, 2);
            }
        }
        return new String(arrc, n2 + n4, 1);
    }

    public static int d(String string, int n2) {
        int n3;
        int n4 = string.length();
        int n5 = 0;
        if (n2 < 0 || n2 > n4) {
            throw new StringIndexOutOfBoundsException(n2);
        }
        for (n3 = n2; n5 < n4 && n3 > 0; --n3, ++n5) {
            char c2 = string.charAt(n5);
            if (!kx.c(c2) || n5 + 1 >= n4 || !kx.b(string.charAt(n5 + 1))) continue;
            ++n5;
        }
        if (n3 != 0) {
            throw new StringIndexOutOfBoundsException(n2);
        }
        return n5;
    }

    public static int d(StringBuffer stringBuffer, int n2) {
        int n3;
        int n4 = stringBuffer.length();
        int n5 = 0;
        if (n2 < 0 || n2 > n4) {
            throw new StringIndexOutOfBoundsException(n2);
        }
        for (n3 = n2; n5 < n4 && n3 > 0; --n3, ++n5) {
            char c2 = stringBuffer.charAt(n5);
            if (!kx.c(c2) || n5 + 1 >= n4 || !kx.b(stringBuffer.charAt(n5 + 1))) continue;
            ++n5;
        }
        if (n3 != 0) {
            throw new StringIndexOutOfBoundsException(n2);
        }
        return n5;
    }

    public static int d(char[] arrc, int n2, int n3, int n4) {
        int n5;
        int n6 = n2;
        if (n4 > n3 - n2) {
            throw new ArrayIndexOutOfBoundsException(n4);
        }
        for (n5 = n4; n6 < n3 && n5 > 0; --n5, ++n6) {
            char c2 = arrc[n6];
            if (!kx.c(c2) || n6 + 1 >= n3 || !kx.b(arrc[n6 + 1])) continue;
            ++n6;
        }
        if (n5 != 0) {
            throw new ArrayIndexOutOfBoundsException(n4);
        }
        return n6 - n2;
    }

    public static int e(String string, int n2) {
        if (n2 < 0 || n2 > string.length()) {
            throw new StringIndexOutOfBoundsException(n2);
        }
        int n3 = 0;
        boolean bl2 = false;
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = string.charAt(i2);
            if (bl2 && kx.b(c2)) {
                bl2 = false;
                continue;
            }
            bl2 = kx.c(c2);
            ++n3;
        }
        if (n2 == string.length()) {
            return n3;
        }
        if (bl2 && kx.b(string.charAt(n2))) {
            --n3;
        }
        return n3;
    }

    public static int e(StringBuffer stringBuffer, int n2) {
        if (n2 < 0 || n2 > stringBuffer.length()) {
            throw new StringIndexOutOfBoundsException(n2);
        }
        int n3 = 0;
        boolean bl2 = false;
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = stringBuffer.charAt(i2);
            if (bl2 && kx.b(c2)) {
                bl2 = false;
                continue;
            }
            bl2 = kx.c(c2);
            ++n3;
        }
        if (n2 == stringBuffer.length()) {
            return n3;
        }
        if (bl2 && kx.b(stringBuffer.charAt(n2))) {
            --n3;
        }
        return n3;
    }

    public static int e(char[] arrc, int n2, int n3, int n4) {
        if ((n4 += n2) > n3) {
            throw new StringIndexOutOfBoundsException(n4);
        }
        int n5 = 0;
        boolean bl2 = false;
        for (int i2 = n2; i2 < n4; ++i2) {
            char c2 = arrc[i2];
            if (bl2 && kx.b(c2)) {
                bl2 = false;
                continue;
            }
            bl2 = kx.c(c2);
            ++n5;
        }
        if (n4 == n3) {
            return n5;
        }
        if (bl2 && kx.b(arrc[n4])) {
            --n5;
        }
        return n5;
    }

    public static StringBuffer f(StringBuffer stringBuffer, int n2) {
        if (n2 < 0 || n2 > 0x10FFFF) {
            throw new IllegalArgumentException("Illegal codepoint: " + Integer.toHexString(n2));
        }
        if (n2 >= 65536) {
            stringBuffer.append(kx.b(n2));
            stringBuffer.append(kx.c(n2));
        } else {
            stringBuffer.append((char)n2);
        }
        return stringBuffer;
    }

    public static StringBuffer g(StringBuffer stringBuffer, int n2) {
        return kx.f(stringBuffer, n2);
    }

    public static int a(char[] arrc, int n2, int n3) {
        if (n3 < 0 || n3 > 0x10FFFF) {
            throw new IllegalArgumentException("Illegal codepoint");
        }
        if (n3 >= 65536) {
            arrc[n2++] = kx.b(n3);
            arrc[n2++] = kx.c(n3);
        } else {
            arrc[n2++] = (char)n3;
        }
        return n2;
    }

    public static int a(String string) {
        if (string == null || string.length() == 0) {
            return 0;
        }
        return kx.e(string, string.length());
    }

    public static int a(StringBuffer stringBuffer) {
        if (stringBuffer == null || stringBuffer.length() == 0) {
            return 0;
        }
        return kx.e(stringBuffer, stringBuffer.length());
    }

    public static int b(char[] arrc, int n2, int n3) {
        if (arrc == null || arrc.length == 0) {
            return 0;
        }
        return kx.e(arrc, n2, n3, n3 - n2);
    }

    public static void a(StringBuffer stringBuffer, int n2, int n3) {
        int n4 = 1;
        char c2 = stringBuffer.charAt(n2);
        if (kx.a(c2)) {
            if (kx.c(c2) && stringBuffer.length() > n2 + 1 && kx.b(stringBuffer.charAt(n2 + 1))) {
                ++n4;
            } else if (kx.b(c2) && n2 > 0 && kx.c(stringBuffer.charAt(n2 - 1))) {
                --n2;
                ++n4;
            }
        }
        stringBuffer.replace(n2, n2 + n4, kx.d(n3));
    }

    public static int f(char[] arrc, int n2, int n3, int n4) {
        if (n3 >= n2) {
            throw new ArrayIndexOutOfBoundsException(n3);
        }
        int n5 = 1;
        char c2 = arrc[n3];
        if (kx.a(c2)) {
            if (kx.c(c2) && arrc.length > n3 + 1 && kx.b(arrc[n3 + 1])) {
                ++n5;
            } else if (kx.b(c2) && n3 > 0 && kx.c(arrc[n3 - 1])) {
                --n3;
                ++n5;
            }
        }
        String string = kx.d(n4);
        int n6 = n2;
        int n7 = string.length();
        arrc[n3] = string.charAt(0);
        if (n5 == n7) {
            if (n5 == 2) {
                arrc[n3 + 1] = string.charAt(1);
            }
        } else {
            System.arraycopy(arrc, n3 + n5, arrc, n3 + n7, n2 - (n3 + n5));
            if (n5 < n7) {
                arrc[n3 + 1] = string.charAt(1);
                if (++n6 < arrc.length) {
                    arrc[n6] = '\u0000';
                }
            } else {
                arrc[--n6] = '\u0000';
            }
        }
        return n6;
    }

    public static int a(String string, int n2, int n3) {
        int n4;
        int n5 = n2;
        int n6 = string.length();
        if (n2 < 0 || n2 > n6) {
            throw new StringIndexOutOfBoundsException(n2);
        }
        if (n3 > 0) {
            if (n3 + n2 > n6) {
                throw new StringIndexOutOfBoundsException(n2);
            }
            for (n4 = n3; n5 < n6 && n4 > 0; --n4, ++n5) {
                char c2 = string.charAt(n5);
                if (!kx.c(c2) || n5 + 1 >= n6 || !kx.b(string.charAt(n5 + 1))) continue;
                ++n5;
            }
        } else {
            if (n2 + n3 < 0) {
                throw new StringIndexOutOfBoundsException(n2);
            }
            for (n4 = -n3; n4 > 0 && --n5 >= 0; --n4) {
                char c3 = string.charAt(n5);
                if (!kx.b(c3) || n5 <= 0 || !kx.c(string.charAt(n5 - 1))) continue;
                --n5;
            }
        }
        if (n4 != 0) {
            throw new StringIndexOutOfBoundsException(n3);
        }
        return n5;
    }

    public static int b(StringBuffer stringBuffer, int n2, int n3) {
        int n4;
        int n5 = n2;
        int n6 = stringBuffer.length();
        if (n2 < 0 || n2 > n6) {
            throw new StringIndexOutOfBoundsException(n2);
        }
        if (n3 > 0) {
            if (n3 + n2 > n6) {
                throw new StringIndexOutOfBoundsException(n2);
            }
            for (n4 = n3; n5 < n6 && n4 > 0; --n4, ++n5) {
                char c2 = stringBuffer.charAt(n5);
                if (!kx.c(c2) || n5 + 1 >= n6 || !kx.b(stringBuffer.charAt(n5 + 1))) continue;
                ++n5;
            }
        } else {
            if (n2 + n3 < 0) {
                throw new StringIndexOutOfBoundsException(n2);
            }
            for (n4 = -n3; n4 > 0 && --n5 >= 0; --n4) {
                char c3 = stringBuffer.charAt(n5);
                if (!kx.b(c3) || n5 <= 0 || !kx.c(stringBuffer.charAt(n5 - 1))) continue;
                --n5;
            }
        }
        if (n4 != 0) {
            throw new StringIndexOutOfBoundsException(n3);
        }
        return n5;
    }

    public static int a(char[] arrc, int n2, int n3, int n4, int n5) {
        int n6;
        int n7 = arrc.length;
        int n8 = n4 + n2;
        if (n2 < 0 || n3 < n2) {
            throw new StringIndexOutOfBoundsException(n2);
        }
        if (n3 > n7) {
            throw new StringIndexOutOfBoundsException(n3);
        }
        if (n4 < 0 || n8 > n3) {
            throw new StringIndexOutOfBoundsException(n4);
        }
        if (n5 > 0) {
            if (n5 + n8 > n7) {
                throw new StringIndexOutOfBoundsException(n8);
            }
            for (n6 = n5; n8 < n3 && n6 > 0; --n6, ++n8) {
                char c2 = arrc[n8];
                if (!kx.c(c2) || n8 + 1 >= n3 || !kx.b(arrc[n8 + 1])) continue;
                ++n8;
            }
        } else {
            if (n8 + n5 < n2) {
                throw new StringIndexOutOfBoundsException(n8);
            }
            for (n6 = -n5; n6 > 0 && --n8 >= n2; --n6) {
                char c3 = arrc[n8];
                if (!kx.b(c3) || n8 <= n2 || !kx.c(arrc[n8 - 1])) continue;
                --n8;
            }
        }
        if (n6 != 0) {
            throw new StringIndexOutOfBoundsException(n5);
        }
        return n8 -= n2;
    }

    public static StringBuffer c(StringBuffer stringBuffer, int n2, int n3) {
        String string = kx.d(n3);
        if (n2 != stringBuffer.length() && kx.b(stringBuffer, n2) == 5) {
            ++n2;
        }
        stringBuffer.insert(n2, string);
        return stringBuffer;
    }

    public static int g(char[] arrc, int n2, int n3, int n4) {
        int n5;
        String string = kx.d(n4);
        if (n3 != n2 && kx.b(arrc, 0, n2, n3) == 5) {
            ++n3;
        }
        if (n2 + (n5 = string.length()) > arrc.length) {
            throw new ArrayIndexOutOfBoundsException(n3 + n5);
        }
        System.arraycopy(arrc, n3, arrc, n3 + n5, n2 - n3);
        arrc[n3] = string.charAt(0);
        if (n5 == 2) {
            arrc[n3 + 1] = string.charAt(1);
        }
        return n2 + n5;
    }

    public static StringBuffer h(StringBuffer stringBuffer, int n2) {
        int n3 = 1;
        switch (kx.b(stringBuffer, n2)) {
            case 2: {
                ++n3;
                break;
            }
            case 5: {
                ++n3;
                --n2;
            }
        }
        stringBuffer.delete(n2, n2 + n3);
        return stringBuffer;
    }

    public static int c(char[] arrc, int n2, int n3) {
        int n4 = 1;
        switch (kx.b(arrc, 0, n2, n3)) {
            case 2: {
                ++n4;
                break;
            }
            case 5: {
                ++n4;
                --n3;
            }
        }
        System.arraycopy(arrc, n3 + n4, arrc, n3, n2 - (n3 + n4));
        arrc[n2 - n4] = '\u0000';
        return n2 - n4;
    }

    public static int f(String string, int n2) {
        if (n2 < 0 || n2 > 0x10FFFF) {
            throw new IllegalArgumentException("Argument char32 is not a valid codepoint");
        }
        if (n2 < 55296 || n2 > 57343 && n2 < 65536) {
            return string.indexOf((char)n2);
        }
        if (n2 < 65536) {
            int n3 = string.indexOf((char)n2);
            if (n3 >= 0) {
                if (kx.c((char)n2) && n3 < string.length() - 1 && kx.b(string.charAt(n3 + 1))) {
                    return kx.b(string, n2, n3 + 1);
                }
                if (n3 > 0 && kx.c(string.charAt(n3 - 1))) {
                    return kx.b(string, n2, n3 + 1);
                }
            }
            return n3;
        }
        String string2 = kx.e(n2);
        return string.indexOf(string2);
    }

    public static int a(String string, String string2) {
        int n2 = string2.length();
        if (!kx.b(string2.charAt(0)) && !kx.c(string2.charAt(n2 - 1))) {
            return string.indexOf(string2);
        }
        int n3 = string.indexOf(string2);
        int n4 = n3 + n2;
        if (n3 >= 0) {
            if (kx.c(string2.charAt(n2 - 1)) && n3 < string.length() - 1 && kx.b(string.charAt(n4 + 1))) {
                return kx.a(string, string2, n4 + 1);
            }
            if (kx.b(string2.charAt(0)) && n3 > 0 && kx.c(string.charAt(n3 - 1))) {
                return kx.a(string, string2, n4 + 1);
            }
        }
        return n3;
    }

    public static int b(String string, int n2, int n3) {
        if (n2 < 0 || n2 > 0x10FFFF) {
            throw new IllegalArgumentException("Argument char32 is not a valid codepoint");
        }
        if (n2 < 55296 || n2 > 57343 && n2 < 65536) {
            return string.indexOf((char)n2, n3);
        }
        if (n2 < 65536) {
            int n4 = string.indexOf((char)n2, n3);
            if (n4 >= 0) {
                if (kx.c((char)n2) && n4 < string.length() - 1 && kx.b(string.charAt(n4 + 1))) {
                    return kx.b(string, n2, n4 + 1);
                }
                if (n4 > 0 && kx.c(string.charAt(n4 - 1))) {
                    return kx.b(string, n2, n4 + 1);
                }
            }
            return n4;
        }
        String string2 = kx.e(n2);
        return string.indexOf(string2, n3);
    }

    public static int a(String string, String string2, int n2) {
        int n3 = string2.length();
        if (!kx.b(string2.charAt(0)) && !kx.c(string2.charAt(n3 - 1))) {
            return string.indexOf(string2, n2);
        }
        int n4 = string.indexOf(string2, n2);
        int n5 = n4 + n3;
        if (n4 >= 0) {
            if (kx.c(string2.charAt(n3 - 1)) && n4 < string.length() - 1 && kx.b(string.charAt(n5))) {
                return kx.a(string, string2, n5 + 1);
            }
            if (kx.b(string2.charAt(0)) && n4 > 0 && kx.c(string.charAt(n4 - 1))) {
                return kx.a(string, string2, n5 + 1);
            }
        }
        return n4;
    }

    public static int g(String string, int n2) {
        if (n2 < 0 || n2 > 0x10FFFF) {
            throw new IllegalArgumentException("Argument char32 is not a valid codepoint");
        }
        if (n2 < 55296 || n2 > 57343 && n2 < 65536) {
            return string.lastIndexOf((char)n2);
        }
        if (n2 < 65536) {
            int n3 = string.lastIndexOf((char)n2);
            if (n3 >= 0) {
                if (kx.c((char)n2) && n3 < string.length() - 1 && kx.b(string.charAt(n3 + 1))) {
                    return kx.c(string, n2, n3 - 1);
                }
                if (n3 > 0 && kx.c(string.charAt(n3 - 1))) {
                    return kx.c(string, n2, n3 - 1);
                }
            }
            return n3;
        }
        String string2 = kx.e(n2);
        return string.lastIndexOf(string2);
    }

    public static int b(String string, String string2) {
        int n2 = string2.length();
        if (!kx.b(string2.charAt(0)) && !kx.c(string2.charAt(n2 - 1))) {
            return string.lastIndexOf(string2);
        }
        int n3 = string.lastIndexOf(string2);
        if (n3 >= 0) {
            if (kx.c(string2.charAt(n2 - 1)) && n3 < string.length() - 1 && kx.b(string.charAt(n3 + n2 + 1))) {
                return kx.b(string, string2, n3 - 1);
            }
            if (kx.b(string2.charAt(0)) && n3 > 0 && kx.c(string.charAt(n3 - 1))) {
                return kx.b(string, string2, n3 - 1);
            }
        }
        return n3;
    }

    public static int c(String string, int n2, int n3) {
        if (n2 < 0 || n2 > 0x10FFFF) {
            throw new IllegalArgumentException("Argument char32 is not a valid codepoint");
        }
        if (n2 < 55296 || n2 > 57343 && n2 < 65536) {
            return string.lastIndexOf((char)n2, n3);
        }
        if (n2 < 65536) {
            int n4 = string.lastIndexOf((char)n2, n3);
            if (n4 >= 0) {
                if (kx.c((char)n2) && n4 < string.length() - 1 && kx.b(string.charAt(n4 + 1))) {
                    return kx.c(string, n2, n4 - 1);
                }
                if (n4 > 0 && kx.c(string.charAt(n4 - 1))) {
                    return kx.c(string, n2, n4 - 1);
                }
            }
            return n4;
        }
        String string2 = kx.e(n2);
        return string.lastIndexOf(string2, n3);
    }

    public static int b(String string, String string2, int n2) {
        int n3 = string2.length();
        if (!kx.b(string2.charAt(0)) && !kx.c(string2.charAt(n3 - 1))) {
            return string.lastIndexOf(string2, n2);
        }
        int n4 = string.lastIndexOf(string2, n2);
        if (n4 >= 0) {
            if (kx.c(string2.charAt(n3 - 1)) && n4 < string.length() - 1 && kx.b(string.charAt(n4 + n3))) {
                return kx.b(string, string2, n4 - 1);
            }
            if (kx.b(string2.charAt(0)) && n4 > 0 && kx.c(string.charAt(n4 - 1))) {
                return kx.b(string, string2, n4 - 1);
            }
        }
        return n4;
    }

    public static String d(String string, int n2, int n3) {
        if (n2 <= 0 || n2 > 0x10FFFF) {
            throw new IllegalArgumentException("Argument oldChar32 is not a valid codepoint");
        }
        if (n3 <= 0 || n3 > 0x10FFFF) {
            throw new IllegalArgumentException("Argument newChar32 is not a valid codepoint");
        }
        int n4 = kx.f(string, n2);
        if (n4 == -1) {
            return string;
        }
        String string2 = kx.e(n3);
        int n5 = 1;
        int n6 = string2.length();
        StringBuffer stringBuffer = new StringBuffer(string);
        int n7 = n4;
        if (n2 >= 65536) {
            n5 = 2;
        }
        while (n4 != -1) {
            int n8 = n7 + n5;
            stringBuffer.replace(n7, n8, string2);
            int n9 = n4 + n5;
            n4 = kx.b(string, n2, n9);
            n7 += n6 + n4 - n9;
        }
        return stringBuffer.toString();
    }

    public static String a(String string, String string2, String string3) {
        int n2 = kx.a(string, string2);
        if (n2 == -1) {
            return string;
        }
        int n3 = string2.length();
        int n4 = string3.length();
        StringBuffer stringBuffer = new StringBuffer(string);
        int n5 = n2;
        while (n2 != -1) {
            int n6 = n5 + n3;
            stringBuffer.replace(n5, n6, string3);
            int n7 = n2 + n3;
            n2 = kx.a(string, string2, n7);
            n5 += n4 + n2 - n7;
        }
        return stringBuffer.toString();
    }

    public static StringBuffer b(StringBuffer stringBuffer) {
        int n2 = stringBuffer.length();
        StringBuffer stringBuffer2 = new StringBuffer(n2);
        int n3 = n2;
        while (n3-- > 0) {
            char c2;
            char c3 = stringBuffer.charAt(n3);
            if (kx.b(c3) && n3 > 0 && kx.c(c2 = stringBuffer.charAt(n3 - 1))) {
                stringBuffer2.append(c2);
                stringBuffer2.append(c3);
                --n3;
                continue;
            }
            stringBuffer2.append(c3);
        }
        return stringBuffer2;
    }

    public static boolean h(String string, int n2) {
        if (n2 < 0) {
            return true;
        }
        if (string == null) {
            return false;
        }
        int n3 = string.length();
        if (n3 + 1 >> 1 > n2) {
            return true;
        }
        int n4 = n3 - n2;
        if (n4 <= 0) {
            return false;
        }
        int n5 = 0;
        while (n3 != 0) {
            if (n2 == 0) {
                return true;
            }
            if (kx.c(string.charAt(n5++)) && n5 != n3 && kx.b(string.charAt(n5))) {
                ++n5;
                if (--n4 <= 0) {
                    return false;
                }
            }
            --n2;
        }
        return false;
    }

    public static boolean h(char[] arrc, int n2, int n3, int n4) {
        int n5 = n3 - n2;
        if (n5 < 0 || n2 < 0 || n3 < 0) {
            throw new IndexOutOfBoundsException("Start and limit indexes should be non-negative and start <= limit");
        }
        if (n4 < 0) {
            return true;
        }
        if (arrc == null) {
            return false;
        }
        if (n5 + 1 >> 1 > n4) {
            return true;
        }
        int n6 = n5 - n4;
        if (n6 <= 0) {
            return false;
        }
        while (n5 != 0) {
            if (n4 == 0) {
                return true;
            }
            if (kx.c(arrc[n2++]) && n2 != n3 && kx.b(arrc[n2])) {
                ++n2;
                if (--n6 <= 0) {
                    return false;
                }
            }
            --n4;
        }
        return false;
    }

    public static boolean i(StringBuffer stringBuffer, int n2) {
        if (n2 < 0) {
            return true;
        }
        if (stringBuffer == null) {
            return false;
        }
        int n3 = stringBuffer.length();
        if (n3 + 1 >> 1 > n2) {
            return true;
        }
        int n4 = n3 - n2;
        if (n4 <= 0) {
            return false;
        }
        int n5 = 0;
        while (n3 != 0) {
            if (n2 == 0) {
                return true;
            }
            if (kx.c(stringBuffer.charAt(n5++)) && n5 != n3 && kx.b(stringBuffer.charAt(n5))) {
                ++n5;
                if (--n4 <= 0) {
                    return false;
                }
            }
            --n2;
        }
        return false;
    }

    public static String a(int[] arrn, int n2, int n3) {
        if (n3 < 0) {
            throw new IllegalArgumentException();
        }
        char[] arrc = new char[n3];
        int n4 = 0;
        int n5 = n2 + n3;
        block2: for (int i2 = n2; i2 < n5; ++i2) {
            int n6 = arrn[i2];
            if (n6 < 0 || n6 > 0x10FFFF) {
                throw new IllegalArgumentException();
            }
            while (true) {
                try {
                    if (n6 < 65536) {
                        arrc[n4] = (char)n6;
                        ++n4;
                        continue block2;
                    }
                    arrc[n4] = (char)(55232 + (n6 >> 10));
                    arrc[n4 + 1] = (char)(56320 + (n6 & 0x3FF));
                    n4 += 2;
                    continue block2;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    int n7 = (int)Math.ceil((double)arrn.length * (double)(n4 + 2) / (double)(i2 - n2 + 1));
                    char[] arrc2 = new char[n7];
                    System.arraycopy(arrc, 0, arrc2, 0, n4);
                    arrc = arrc2;
                    continue;
                }
                break;
            }
        }
        return new String(arrc, 0, n4);
    }

    private static String e(int n2) {
        if (n2 < 65536) {
            return String.valueOf((char)n2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(kx.b(n2));
        stringBuilder.append(kx.c(n2));
        return stringBuilder.toString();
    }
}

