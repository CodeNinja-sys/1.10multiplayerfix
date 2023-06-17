/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.e;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.c.am;

public class c {
    public static final Long a = 0L;
    public static final Long b = 1L;
    public static final Long c = -1L;
    public static final Integer d = 0;
    public static final Integer e = 1;
    public static final Integer f = -1;
    public static final Short g = 0;
    public static final Short h = 1;
    public static final Short i = -1;
    public static final Byte j = 0;
    public static final Byte k = 1;
    public static final Byte l = -1;
    public static final Double m = 0.0;
    public static final Double n = 1.0;
    public static final Double o = -1.0;
    public static final Float p = Float.valueOf(0.0f);
    public static final Float q = Float.valueOf(1.0f);
    public static final Float r = Float.valueOf(-1.0f);

    public static int a(String string) {
        return org.apache.commons.c.e.c.a(string, 0);
    }

    public static int a(String string, int n2) {
        if (string == null) {
            return n2;
        }
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return n2;
        }
    }

    public static long b(String string) {
        return org.apache.commons.c.e.c.a(string, 0L);
    }

    public static long a(String string, long l2) {
        if (string == null) {
            return l2;
        }
        try {
            return Long.parseLong(string);
        }
        catch (NumberFormatException numberFormatException) {
            return l2;
        }
    }

    public static float c(String string) {
        return org.apache.commons.c.e.c.a(string, 0.0f);
    }

    public static float a(String string, float f2) {
        if (string == null) {
            return f2;
        }
        try {
            return Float.parseFloat(string);
        }
        catch (NumberFormatException numberFormatException) {
            return f2;
        }
    }

    public static double d(String string) {
        return org.apache.commons.c.e.c.a(string, 0.0);
    }

    public static double a(String string, double d2) {
        if (string == null) {
            return d2;
        }
        try {
            return Double.parseDouble(string);
        }
        catch (NumberFormatException numberFormatException) {
            return d2;
        }
    }

    public static byte e(String string) {
        return org.apache.commons.c.e.c.a(string, (byte)0);
    }

    public static byte a(String string, byte by2) {
        if (string == null) {
            return by2;
        }
        try {
            return Byte.parseByte(string);
        }
        catch (NumberFormatException numberFormatException) {
            return by2;
        }
    }

    public static short f(String string) {
        return org.apache.commons.c.e.c.a(string, (short)0);
    }

    public static short a(String string, short s2) {
        if (string == null) {
            return s2;
        }
        try {
            return Short.parseShort(string);
        }
        catch (NumberFormatException numberFormatException) {
            return s2;
        }
    }

    public static Number g(String string) {
        Number number;
        String string2;
        String string3;
        String string4;
        if (string == null) {
            return null;
        }
        if (am.c((CharSequence)string)) {
            throw new NumberFormatException("A blank string is not a valid number");
        }
        String[] arrstring = new String[]{"0x", "0X", "-0x", "-0X", "#", "-#"};
        int n2 = 0;
        String[] arrstring2 = arrstring;
        int n3 = arrstring2.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            string4 = arrstring2[i2];
            if (!string.startsWith(string4)) continue;
            n2 += string4.length();
            break;
        }
        if (n2 > 0) {
            char c2 = '\u0000';
            for (n3 = n2; n3 < string.length() && (c2 = string.charAt(n3)) == '0'; ++n3) {
                ++n2;
            }
            n3 = string.length() - n2;
            if (n3 > 16 || n3 == 16 && c2 > '7') {
                return org.apache.commons.c.e.c.l(string);
            }
            if (n3 > 8 || n3 == 8 && c2 > '7') {
                return org.apache.commons.c.e.c.k(string);
            }
            return org.apache.commons.c.e.c.j(string);
        }
        char c3 = string.charAt(string.length() - 1);
        int n4 = string.indexOf(46);
        int n5 = string.indexOf(101) + string.indexOf(69) + 1;
        int n6 = 0;
        if (n4 > -1) {
            if (n5 > -1) {
                if (n5 < n4 || n5 > string.length()) {
                    throw new NumberFormatException(string + " is not a valid number.");
                }
                string3 = string.substring(n4 + 1, n5);
            } else {
                string3 = string.substring(n4 + 1);
            }
            string2 = string.substring(0, n4);
            n6 = string3.length();
        } else {
            if (n5 > -1) {
                if (n5 > string.length()) {
                    throw new NumberFormatException(string + " is not a valid number.");
                }
                string2 = string.substring(0, n5);
            } else {
                string2 = string;
            }
            string3 = null;
        }
        if (!Character.isDigit(c3) && c3 != '.') {
            string4 = n5 > -1 && n5 < string.length() - 1 ? string.substring(n5 + 1, string.length() - 1) : null;
            String string5 = string.substring(0, string.length() - 1);
            boolean bl2 = org.apache.commons.c.e.c.p(string2) && org.apache.commons.c.e.c.p(string4);
            switch (c3) {
                case 'L': 
                case 'l': {
                    if (string3 == null && string4 == null && (string5.charAt(0) == '-' && org.apache.commons.c.e.c.n(string5.substring(1)) || org.apache.commons.c.e.c.n(string5))) {
                        try {
                            return org.apache.commons.c.e.c.k(string5);
                        }
                        catch (NumberFormatException numberFormatException) {
                            return org.apache.commons.c.e.c.l(string5);
                        }
                    }
                    throw new NumberFormatException(string + " is not a valid number.");
                }
                case 'F': 
                case 'f': {
                    Number number2;
                    try {
                        number2 = org.apache.commons.c.e.c.h(string5);
                        if (!((Float)number2).isInfinite() && (((Float)number2).floatValue() != 0.0f || bl2)) {
                            return number2;
                        }
                    }
                    catch (NumberFormatException numberFormatException) {
                        // empty catch block
                    }
                }
                case 'D': 
                case 'd': {
                    Number number2;
                    try {
                        number2 = org.apache.commons.c.e.c.i(string5);
                        if (!((Double)number2).isInfinite() && ((double)((Double)number2).floatValue() != 0.0 || bl2)) {
                            return number2;
                        }
                    }
                    catch (NumberFormatException numberFormatException) {
                        // empty catch block
                    }
                    try {
                        return org.apache.commons.c.e.c.m(string5);
                    }
                    catch (NumberFormatException numberFormatException) {
                        // empty catch block
                    }
                }
            }
            throw new NumberFormatException(string + " is not a valid number.");
        }
        string4 = n5 > -1 && n5 < string.length() - 1 ? string.substring(n5 + 1, string.length()) : null;
        if (string3 == null && string4 == null) {
            try {
                return org.apache.commons.c.e.c.j(string);
            }
            catch (NumberFormatException numberFormatException) {
                try {
                    return org.apache.commons.c.e.c.k(string);
                }
                catch (NumberFormatException numberFormatException2) {
                    return org.apache.commons.c.e.c.l(string);
                }
            }
        }
        boolean bl3 = org.apache.commons.c.e.c.p(string2) && org.apache.commons.c.e.c.p(string4);
        try {
            if (n6 <= 7 && !((Float)(number = org.apache.commons.c.e.c.h(string))).isInfinite() && (((Float)number).floatValue() != 0.0f || bl3)) {
                return number;
            }
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        try {
            if (n6 <= 16 && !((Double)(number = org.apache.commons.c.e.c.i(string))).isInfinite() && ((Double)number != 0.0 || bl3)) {
                return number;
            }
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        return org.apache.commons.c.e.c.m(string);
    }

    private static boolean p(String string) {
        if (string == null) {
            return true;
        }
        for (int i2 = string.length() - 1; i2 >= 0; --i2) {
            if (string.charAt(i2) == '0') continue;
            return false;
        }
        return string.length() > 0;
    }

    public static Float h(String string) {
        if (string == null) {
            return null;
        }
        return Float.valueOf(string);
    }

    public static Double i(String string) {
        if (string == null) {
            return null;
        }
        return Double.valueOf(string);
    }

    public static Integer j(String string) {
        if (string == null) {
            return null;
        }
        return Integer.decode(string);
    }

    public static Long k(String string) {
        if (string == null) {
            return null;
        }
        return Long.decode(string);
    }

    public static BigInteger l(String string) {
        if (string == null) {
            return null;
        }
        int n2 = 0;
        int n3 = 10;
        boolean bl2 = false;
        if (string.startsWith("-")) {
            bl2 = true;
            n2 = 1;
        }
        if (string.startsWith("0x", n2) || string.startsWith("0x", n2)) {
            n3 = 16;
            n2 += 2;
        } else if (string.startsWith("#", n2)) {
            n3 = 16;
            ++n2;
        } else if (string.startsWith("0", n2) && string.length() > n2 + 1) {
            n3 = 8;
            ++n2;
        }
        BigInteger bigInteger = new BigInteger(string.substring(n2), n3);
        return bl2 ? bigInteger.negate() : bigInteger;
    }

    public static BigDecimal m(String string) {
        if (string == null) {
            return null;
        }
        if (am.c((CharSequence)string)) {
            throw new NumberFormatException("A blank string is not a valid number");
        }
        if (string.trim().startsWith("--")) {
            throw new NumberFormatException(string + " is not a valid number.");
        }
        return new BigDecimal(string);
    }

    public static long a(long[] arrl) {
        org.apache.commons.c.e.c.a((Object)arrl);
        long l2 = arrl[0];
        for (int i2 = 1; i2 < arrl.length; ++i2) {
            if (arrl[i2] >= l2) continue;
            l2 = arrl[i2];
        }
        return l2;
    }

    public static int a(int[] arrn) {
        org.apache.commons.c.e.c.a((Object)arrn);
        int n2 = arrn[0];
        for (int i2 = 1; i2 < arrn.length; ++i2) {
            if (arrn[i2] >= n2) continue;
            n2 = arrn[i2];
        }
        return n2;
    }

    public static short a(short[] arrs) {
        org.apache.commons.c.e.c.a((Object)arrs);
        short s2 = arrs[0];
        for (int i2 = 1; i2 < arrs.length; ++i2) {
            if (arrs[i2] >= s2) continue;
            s2 = arrs[i2];
        }
        return s2;
    }

    public static byte a(byte[] arrby) {
        org.apache.commons.c.e.c.a((Object)arrby);
        byte by2 = arrby[0];
        for (int i2 = 1; i2 < arrby.length; ++i2) {
            if (arrby[i2] >= by2) continue;
            by2 = arrby[i2];
        }
        return by2;
    }

    public static double a(double[] arrd) {
        org.apache.commons.c.e.c.a((Object)arrd);
        double d2 = arrd[0];
        for (int i2 = 1; i2 < arrd.length; ++i2) {
            if (Double.isNaN(arrd[i2])) {
                return Double.NaN;
            }
            if (!(arrd[i2] < d2)) continue;
            d2 = arrd[i2];
        }
        return d2;
    }

    public static float a(float[] arrf) {
        org.apache.commons.c.e.c.a((Object)arrf);
        float f2 = arrf[0];
        for (int i2 = 1; i2 < arrf.length; ++i2) {
            if (Float.isNaN(arrf[i2])) {
                return Float.NaN;
            }
            if (!(arrf[i2] < f2)) continue;
            f2 = arrf[i2];
        }
        return f2;
    }

    public static long b(long[] arrl) {
        org.apache.commons.c.e.c.a((Object)arrl);
        long l2 = arrl[0];
        for (int i2 = 1; i2 < arrl.length; ++i2) {
            if (arrl[i2] <= l2) continue;
            l2 = arrl[i2];
        }
        return l2;
    }

    public static int b(int[] arrn) {
        org.apache.commons.c.e.c.a((Object)arrn);
        int n2 = arrn[0];
        for (int i2 = 1; i2 < arrn.length; ++i2) {
            if (arrn[i2] <= n2) continue;
            n2 = arrn[i2];
        }
        return n2;
    }

    public static short b(short[] arrs) {
        org.apache.commons.c.e.c.a((Object)arrs);
        short s2 = arrs[0];
        for (int i2 = 1; i2 < arrs.length; ++i2) {
            if (arrs[i2] <= s2) continue;
            s2 = arrs[i2];
        }
        return s2;
    }

    public static byte b(byte[] arrby) {
        org.apache.commons.c.e.c.a((Object)arrby);
        byte by2 = arrby[0];
        for (int i2 = 1; i2 < arrby.length; ++i2) {
            if (arrby[i2] <= by2) continue;
            by2 = arrby[i2];
        }
        return by2;
    }

    public static double b(double[] arrd) {
        org.apache.commons.c.e.c.a((Object)arrd);
        double d2 = arrd[0];
        for (int i2 = 1; i2 < arrd.length; ++i2) {
            if (Double.isNaN(arrd[i2])) {
                return Double.NaN;
            }
            if (!(arrd[i2] > d2)) continue;
            d2 = arrd[i2];
        }
        return d2;
    }

    public static float b(float[] arrf) {
        org.apache.commons.c.e.c.a((Object)arrf);
        float f2 = arrf[0];
        for (int i2 = 1; i2 < arrf.length; ++i2) {
            if (Float.isNaN(arrf[i2])) {
                return Float.NaN;
            }
            if (!(arrf[i2] > f2)) continue;
            f2 = arrf[i2];
        }
        return f2;
    }

    private static void a(Object object) {
        if (object == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (Array.getLength(object) == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
    }

    public static long a(long l2, long l3, long l4) {
        if (l3 < l2) {
            l2 = l3;
        }
        if (l4 < l2) {
            l2 = l4;
        }
        return l2;
    }

    public static int a(int n2, int n3, int n4) {
        if (n3 < n2) {
            n2 = n3;
        }
        if (n4 < n2) {
            n2 = n4;
        }
        return n2;
    }

    public static short a(short s2, short s3, short s4) {
        if (s3 < s2) {
            s2 = s3;
        }
        if (s4 < s2) {
            s2 = s4;
        }
        return s2;
    }

    public static byte a(byte by2, byte by3, byte by4) {
        if (by3 < by2) {
            by2 = by3;
        }
        if (by4 < by2) {
            by2 = by4;
        }
        return by2;
    }

    public static double a(double d2, double d3, double d4) {
        return Math.min(Math.min(d2, d3), d4);
    }

    public static float a(float f2, float f3, float f4) {
        return Math.min(Math.min(f2, f3), f4);
    }

    public static long b(long l2, long l3, long l4) {
        if (l3 > l2) {
            l2 = l3;
        }
        if (l4 > l2) {
            l2 = l4;
        }
        return l2;
    }

    public static int b(int n2, int n3, int n4) {
        if (n3 > n2) {
            n2 = n3;
        }
        if (n4 > n2) {
            n2 = n4;
        }
        return n2;
    }

    public static short b(short s2, short s3, short s4) {
        if (s3 > s2) {
            s2 = s3;
        }
        if (s4 > s2) {
            s2 = s4;
        }
        return s2;
    }

    public static byte b(byte by2, byte by3, byte by4) {
        if (by3 > by2) {
            by2 = by3;
        }
        if (by4 > by2) {
            by2 = by4;
        }
        return by2;
    }

    public static double b(double d2, double d3, double d4) {
        return Math.max(Math.max(d2, d3), d4);
    }

    public static float b(float f2, float f3, float f4) {
        return Math.max(Math.max(f2, f3), f4);
    }

    public static boolean n(String string) {
        if (am.a((CharSequence)string)) {
            return false;
        }
        for (int i2 = 0; i2 < string.length(); ++i2) {
            if (Character.isDigit(string.charAt(i2))) continue;
            return false;
        }
        return true;
    }

    public static boolean o(String string) {
        int n2;
        int n3;
        if (am.a((CharSequence)string)) {
            return false;
        }
        char[] arrc = string.toCharArray();
        int n4 = arrc.length;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        int n5 = n3 = arrc[0] == '-' ? 1 : 0;
        if (n4 > n3 + 1 && arrc[n3] == '0') {
            if (arrc[n3 + 1] == 'x' || arrc[n3 + 1] == 'X') {
                int n6 = n3 + 2;
                if (n6 == n4) {
                    return false;
                }
                while (n6 < arrc.length) {
                    if (!(arrc[n6] >= '0' && arrc[n6] <= '9' || arrc[n6] >= 'a' && arrc[n6] <= 'f' || arrc[n6] >= 'A' && arrc[n6] <= 'F')) {
                        return false;
                    }
                    ++n6;
                }
                return true;
            }
            if (Character.isDigit(arrc[n3 + 1])) {
                for (int i2 = n3 + 1; i2 < arrc.length; ++i2) {
                    if (arrc[i2] >= '0' && arrc[i2] <= '7') continue;
                    return false;
                }
                return true;
            }
        }
        for (n2 = n3; n2 < --n4 || n2 < n4 + 1 && bl4 && !bl5; ++n2) {
            if (arrc[n2] >= '0' && arrc[n2] <= '9') {
                bl5 = true;
                bl4 = false;
                continue;
            }
            if (arrc[n2] == '.') {
                if (bl3 || bl2) {
                    return false;
                }
                bl3 = true;
                continue;
            }
            if (arrc[n2] == 'e' || arrc[n2] == 'E') {
                if (bl2) {
                    return false;
                }
                if (!bl5) {
                    return false;
                }
                bl2 = true;
                bl4 = true;
                continue;
            }
            if (arrc[n2] == '+' || arrc[n2] == '-') {
                if (!bl4) {
                    return false;
                }
                bl4 = false;
                bl5 = false;
                continue;
            }
            return false;
        }
        if (n2 < arrc.length) {
            if (arrc[n2] >= '0' && arrc[n2] <= '9') {
                return true;
            }
            if (arrc[n2] == 'e' || arrc[n2] == 'E') {
                return false;
            }
            if (arrc[n2] == '.') {
                if (bl3 || bl2) {
                    return false;
                }
                return bl5;
            }
            if (!(bl4 || arrc[n2] != 'd' && arrc[n2] != 'D' && arrc[n2] != 'f' && arrc[n2] != 'F')) {
                return bl5;
            }
            if (arrc[n2] == 'l' || arrc[n2] == 'L') {
                return bl5 && !bl2 && !bl3;
            }
            return false;
        }
        return !bl4 && bl5;
    }
}

