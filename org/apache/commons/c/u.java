/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.util.UUID;

public class u {
    public static int a(char c2) {
        int n2 = Character.digit(c2, 16);
        if (n2 < 0) {
            throw new IllegalArgumentException("Cannot interpret '" + c2 + "' as a hexadecimal digit");
        }
        return n2;
    }

    public static int b(char c2) {
        switch (c2) {
            case '0': {
                return 0;
            }
            case '1': {
                return 8;
            }
            case '2': {
                return 4;
            }
            case '3': {
                return 12;
            }
            case '4': {
                return 2;
            }
            case '5': {
                return 10;
            }
            case '6': {
                return 6;
            }
            case '7': {
                return 14;
            }
            case '8': {
                return 1;
            }
            case '9': {
                return 9;
            }
            case 'A': 
            case 'a': {
                return 5;
            }
            case 'B': 
            case 'b': {
                return 13;
            }
            case 'C': 
            case 'c': {
                return 3;
            }
            case 'D': 
            case 'd': {
                return 11;
            }
            case 'E': 
            case 'e': {
                return 7;
            }
            case 'F': 
            case 'f': {
                return 15;
            }
        }
        throw new IllegalArgumentException("Cannot interpret '" + c2 + "' as a hexadecimal digit");
    }

    public static boolean[] c(char c2) {
        switch (c2) {
            case '0': {
                return new boolean[]{false, false, false, false};
            }
            case '1': {
                return new boolean[]{true, false, false, false};
            }
            case '2': {
                return new boolean[]{false, true, false, false};
            }
            case '3': {
                return new boolean[]{true, true, false, false};
            }
            case '4': {
                return new boolean[]{false, false, true, false};
            }
            case '5': {
                return new boolean[]{true, false, true, false};
            }
            case '6': {
                return new boolean[]{false, true, true, false};
            }
            case '7': {
                return new boolean[]{true, true, true, false};
            }
            case '8': {
                return new boolean[]{false, false, false, true};
            }
            case '9': {
                return new boolean[]{true, false, false, true};
            }
            case 'A': 
            case 'a': {
                return new boolean[]{false, true, false, true};
            }
            case 'B': 
            case 'b': {
                return new boolean[]{true, true, false, true};
            }
            case 'C': 
            case 'c': {
                return new boolean[]{false, false, true, true};
            }
            case 'D': 
            case 'd': {
                return new boolean[]{true, false, true, true};
            }
            case 'E': 
            case 'e': {
                return new boolean[]{false, true, true, true};
            }
            case 'F': 
            case 'f': {
                return new boolean[]{true, true, true, true};
            }
        }
        throw new IllegalArgumentException("Cannot interpret '" + c2 + "' as a hexadecimal digit");
    }

    public static boolean[] d(char c2) {
        switch (c2) {
            case '0': {
                return new boolean[]{false, false, false, false};
            }
            case '1': {
                return new boolean[]{false, false, false, true};
            }
            case '2': {
                return new boolean[]{false, false, true, false};
            }
            case '3': {
                return new boolean[]{false, false, true, true};
            }
            case '4': {
                return new boolean[]{false, true, false, false};
            }
            case '5': {
                return new boolean[]{false, true, false, true};
            }
            case '6': {
                return new boolean[]{false, true, true, false};
            }
            case '7': {
                return new boolean[]{false, true, true, true};
            }
            case '8': {
                return new boolean[]{true, false, false, false};
            }
            case '9': {
                return new boolean[]{true, false, false, true};
            }
            case 'A': 
            case 'a': {
                return new boolean[]{true, false, true, false};
            }
            case 'B': 
            case 'b': {
                return new boolean[]{true, false, true, true};
            }
            case 'C': 
            case 'c': {
                return new boolean[]{true, true, false, false};
            }
            case 'D': 
            case 'd': {
                return new boolean[]{true, true, false, true};
            }
            case 'E': 
            case 'e': {
                return new boolean[]{true, true, true, false};
            }
            case 'F': 
            case 'f': {
                return new boolean[]{true, true, true, true};
            }
        }
        throw new IllegalArgumentException("Cannot interpret '" + c2 + "' as a hexadecimal digit");
    }

    public static char a(boolean[] arrbl) {
        return u.a(arrbl, 0);
    }

    public static char a(boolean[] arrbl, int n2) {
        if (arrbl.length == 0) {
            throw new IllegalArgumentException("Cannot convert an empty array.");
        }
        if (arrbl.length > n2 + 3 && arrbl[n2 + 3]) {
            if (arrbl.length > n2 + 2 && arrbl[n2 + 2]) {
                if (arrbl.length > n2 + 1 && arrbl[n2 + 1]) {
                    if (arrbl[n2]) {
                        return 'f';
                    }
                    return 'e';
                }
                if (arrbl[n2]) {
                    return 'd';
                }
                return 'c';
            }
            if (arrbl.length > n2 + 1 && arrbl[n2 + 1]) {
                if (arrbl[n2]) {
                    return 'b';
                }
                return 'a';
            }
            if (arrbl[n2]) {
                return '9';
            }
            return '8';
        }
        if (arrbl.length > n2 + 2 && arrbl[n2 + 2]) {
            if (arrbl.length > n2 + 1 && arrbl[n2 + 1]) {
                if (arrbl[n2]) {
                    return '7';
                }
                return '6';
            }
            if (arrbl[n2]) {
                return '5';
            }
            return '4';
        }
        if (arrbl.length > n2 + 1 && arrbl[n2 + 1]) {
            if (arrbl[n2]) {
                return '3';
            }
            return '2';
        }
        if (arrbl[n2]) {
            return '1';
        }
        return '0';
    }

    public static char b(boolean[] arrbl) {
        return u.b(arrbl, 0);
    }

    public static char b(boolean[] arrbl, int n2) {
        if (arrbl.length > 8) {
            throw new IllegalArgumentException("src.length>8: src.length=" + arrbl.length);
        }
        if (arrbl.length - n2 < 4) {
            throw new IllegalArgumentException("src.length-srcPos<4: src.length=" + arrbl.length + ", srcPos=" + n2);
        }
        if (arrbl[n2 + 3]) {
            if (arrbl[n2 + 2]) {
                if (arrbl[n2 + 1]) {
                    if (arrbl[n2]) {
                        return 'f';
                    }
                    return '7';
                }
                if (arrbl[n2]) {
                    return 'b';
                }
                return '3';
            }
            if (arrbl[n2 + 1]) {
                if (arrbl[n2]) {
                    return 'd';
                }
                return '5';
            }
            if (arrbl[n2]) {
                return '9';
            }
            return '1';
        }
        if (arrbl[n2 + 2]) {
            if (arrbl[n2 + 1]) {
                if (arrbl[n2]) {
                    return 'e';
                }
                return '6';
            }
            if (arrbl[n2]) {
                return 'a';
            }
            return '2';
        }
        if (arrbl[n2 + 1]) {
            if (arrbl[n2]) {
                return 'c';
            }
            return '4';
        }
        if (arrbl[n2]) {
            return '8';
        }
        return '0';
    }

    public static char c(boolean[] arrbl) {
        return u.c(arrbl, 0);
    }

    public static char c(boolean[] arrbl, int n2) {
        if (arrbl.length == 0) {
            throw new IllegalArgumentException("Cannot convert an empty array.");
        }
        int n3 = arrbl.length - 1 - n2;
        int n4 = Math.min(4, n3 + 1);
        boolean[] arrbl2 = new boolean[4];
        System.arraycopy(arrbl, n3 + 1 - n4, arrbl2, 4 - n4, n4);
        arrbl = arrbl2;
        n2 = 0;
        if (arrbl[n2]) {
            if (arrbl.length > n2 + 1 && arrbl[n2 + 1]) {
                if (arrbl.length > n2 + 2 && arrbl[n2 + 2]) {
                    if (arrbl.length > n2 + 3 && arrbl[n2 + 3]) {
                        return 'f';
                    }
                    return 'e';
                }
                if (arrbl.length > n2 + 3 && arrbl[n2 + 3]) {
                    return 'd';
                }
                return 'c';
            }
            if (arrbl.length > n2 + 2 && arrbl[n2 + 2]) {
                if (arrbl.length > n2 + 3 && arrbl[n2 + 3]) {
                    return 'b';
                }
                return 'a';
            }
            if (arrbl.length > n2 + 3 && arrbl[n2 + 3]) {
                return '9';
            }
            return '8';
        }
        if (arrbl.length > n2 + 1 && arrbl[n2 + 1]) {
            if (arrbl.length > n2 + 2 && arrbl[n2 + 2]) {
                if (arrbl.length > n2 + 3 && arrbl[n2 + 3]) {
                    return '7';
                }
                return '6';
            }
            if (arrbl.length > n2 + 3 && arrbl[n2 + 3]) {
                return '5';
            }
            return '4';
        }
        if (arrbl.length > n2 + 2 && arrbl[n2 + 2]) {
            if (arrbl.length > n2 + 3 && arrbl[n2 + 3]) {
                return '3';
            }
            return '2';
        }
        if (arrbl.length > n2 + 3 && arrbl[n2 + 3]) {
            return '1';
        }
        return '0';
    }

    public static char a(int n2) {
        char c2 = Character.forDigit(n2, 16);
        if (c2 == '\u0000') {
            throw new IllegalArgumentException("nibble value not between 0 and 15: " + n2);
        }
        return c2;
    }

    public static char b(int n2) {
        switch (n2) {
            case 0: {
                return '0';
            }
            case 1: {
                return '8';
            }
            case 2: {
                return '4';
            }
            case 3: {
                return 'c';
            }
            case 4: {
                return '2';
            }
            case 5: {
                return 'a';
            }
            case 6: {
                return '6';
            }
            case 7: {
                return 'e';
            }
            case 8: {
                return '1';
            }
            case 9: {
                return '9';
            }
            case 10: {
                return '5';
            }
            case 11: {
                return 'd';
            }
            case 12: {
                return '3';
            }
            case 13: {
                return 'b';
            }
            case 14: {
                return '7';
            }
            case 15: {
                return 'f';
            }
        }
        throw new IllegalArgumentException("nibble value not between 0 and 15: " + n2);
    }

    public static long a(int[] arrn, int n2, long l2, int n3, int n4) {
        if (arrn.length == 0 && n2 == 0 || 0 == n4) {
            return l2;
        }
        if ((n4 - 1) * 32 + n3 >= 64) {
            throw new IllegalArgumentException("(nInts-1)*32+dstPos is greather or equal to than 64");
        }
        long l3 = l2;
        int n5 = 0;
        for (int i2 = 0; i2 < n4; ++i2) {
            n5 = i2 * 32 + n3;
            long l4 = (0xFFFFFFFFL & (long)arrn[i2 + n2]) << n5;
            long l5 = 0xFFFFFFFFL << n5;
            l3 = l3 & (l5 ^ 0xFFFFFFFFFFFFFFFFL) | l4;
        }
        return l3;
    }

    public static long a(short[] arrs, int n2, long l2, int n3, int n4) {
        if (arrs.length == 0 && n2 == 0 || 0 == n4) {
            return l2;
        }
        if ((n4 - 1) * 16 + n3 >= 64) {
            throw new IllegalArgumentException("(nShorts-1)*16+dstPos is greather or equal to than 64");
        }
        long l3 = l2;
        int n5 = 0;
        for (int i2 = 0; i2 < n4; ++i2) {
            n5 = i2 * 16 + n3;
            long l4 = (0xFFFFL & (long)arrs[i2 + n2]) << n5;
            long l5 = 65535L << n5;
            l3 = l3 & (l5 ^ 0xFFFFFFFFFFFFFFFFL) | l4;
        }
        return l3;
    }

    public static int a(short[] arrs, int n2, int n3, int n4, int n5) {
        if (arrs.length == 0 && n2 == 0 || 0 == n5) {
            return n3;
        }
        if ((n5 - 1) * 16 + n4 >= 32) {
            throw new IllegalArgumentException("(nShorts-1)*16+dstPos is greather or equal to than 32");
        }
        int n6 = n3;
        int n7 = 0;
        for (int i2 = 0; i2 < n5; ++i2) {
            n7 = i2 * 16 + n4;
            int n8 = (0xFFFF & arrs[i2 + n2]) << n7;
            int n9 = 65535 << n7;
            n6 = n6 & ~n9 | n8;
        }
        return n6;
    }

    public static long a(byte[] arrby, int n2, long l2, int n3, int n4) {
        if (arrby.length == 0 && n2 == 0 || 0 == n4) {
            return l2;
        }
        if ((n4 - 1) * 8 + n3 >= 64) {
            throw new IllegalArgumentException("(nBytes-1)*8+dstPos is greather or equal to than 64");
        }
        long l3 = l2;
        int n5 = 0;
        for (int i2 = 0; i2 < n4; ++i2) {
            n5 = i2 * 8 + n3;
            long l4 = (0xFFL & (long)arrby[i2 + n2]) << n5;
            long l5 = 255L << n5;
            l3 = l3 & (l5 ^ 0xFFFFFFFFFFFFFFFFL) | l4;
        }
        return l3;
    }

    public static int a(byte[] arrby, int n2, int n3, int n4, int n5) {
        if (arrby.length == 0 && n2 == 0 || 0 == n5) {
            return n3;
        }
        if ((n5 - 1) * 8 + n4 >= 32) {
            throw new IllegalArgumentException("(nBytes-1)*8+dstPos is greather or equal to than 32");
        }
        int n6 = n3;
        int n7 = 0;
        for (int i2 = 0; i2 < n5; ++i2) {
            n7 = i2 * 8 + n4;
            int n8 = (0xFF & arrby[i2 + n2]) << n7;
            int n9 = 255 << n7;
            n6 = n6 & ~n9 | n8;
        }
        return n6;
    }

    public static short a(byte[] arrby, int n2, short s2, int n3, int n4) {
        if (arrby.length == 0 && n2 == 0 || 0 == n4) {
            return s2;
        }
        if ((n4 - 1) * 8 + n3 >= 16) {
            throw new IllegalArgumentException("(nBytes-1)*8+dstPos is greather or equal to than 16");
        }
        short s3 = s2;
        int n5 = 0;
        for (int i2 = 0; i2 < n4; ++i2) {
            n5 = i2 * 8 + n3;
            int n6 = (0xFF & arrby[i2 + n2]) << n5;
            int n7 = 255 << n5;
            s3 = (short)(s3 & ~n7 | n6);
        }
        return s3;
    }

    public static long a(String string, int n2, long l2, int n3, int n4) {
        if (0 == n4) {
            return l2;
        }
        if ((n4 - 1) * 4 + n3 >= 64) {
            throw new IllegalArgumentException("(nHexs-1)*4+dstPos is greather or equal to than 64");
        }
        long l3 = l2;
        int n5 = 0;
        for (int i2 = 0; i2 < n4; ++i2) {
            n5 = i2 * 4 + n3;
            long l4 = (0xFL & (long)u.a(string.charAt(i2 + n2))) << n5;
            long l5 = 15L << n5;
            l3 = l3 & (l5 ^ 0xFFFFFFFFFFFFFFFFL) | l4;
        }
        return l3;
    }

    public static int a(String string, int n2, int n3, int n4, int n5) {
        if (0 == n5) {
            return n3;
        }
        if ((n5 - 1) * 4 + n4 >= 32) {
            throw new IllegalArgumentException("(nHexs-1)*4+dstPos is greather or equal to than 32");
        }
        int n6 = n3;
        int n7 = 0;
        for (int i2 = 0; i2 < n5; ++i2) {
            n7 = i2 * 4 + n4;
            int n8 = (0xF & u.a(string.charAt(i2 + n2))) << n7;
            int n9 = 15 << n7;
            n6 = n6 & ~n9 | n8;
        }
        return n6;
    }

    public static short a(String string, int n2, short s2, int n3, int n4) {
        if (0 == n4) {
            return s2;
        }
        if ((n4 - 1) * 4 + n3 >= 16) {
            throw new IllegalArgumentException("(nHexs-1)*4+dstPos is greather or equal to than 16");
        }
        short s3 = s2;
        int n5 = 0;
        for (int i2 = 0; i2 < n4; ++i2) {
            n5 = i2 * 4 + n3;
            int n6 = (0xF & u.a(string.charAt(i2 + n2))) << n5;
            int n7 = 15 << n5;
            s3 = (short)(s3 & ~n7 | n6);
        }
        return s3;
    }

    public static byte a(String string, int n2, byte by2, int n3, int n4) {
        if (0 == n4) {
            return by2;
        }
        if ((n4 - 1) * 4 + n3 >= 8) {
            throw new IllegalArgumentException("(nHexs-1)*4+dstPos is greather or equal to than 8");
        }
        byte by3 = by2;
        int n5 = 0;
        for (int i2 = 0; i2 < n4; ++i2) {
            n5 = i2 * 4 + n3;
            int n6 = (0xF & u.a(string.charAt(i2 + n2))) << n5;
            int n7 = 15 << n5;
            by3 = (byte)(by3 & ~n7 | n6);
        }
        return by3;
    }

    public static long a(boolean[] arrbl, int n2, long l2, int n3, int n4) {
        if (arrbl.length == 0 && n2 == 0 || 0 == n4) {
            return l2;
        }
        if (n4 - 1 + n3 >= 64) {
            throw new IllegalArgumentException("nBools-1+dstPos is greather or equal to than 64");
        }
        long l3 = l2;
        int n5 = 0;
        for (int i2 = 0; i2 < n4; ++i2) {
            n5 = i2 * 1 + n3;
            long l4 = (arrbl[i2 + n2] ? 1L : 0L) << n5;
            long l5 = 1L << n5;
            l3 = l3 & (l5 ^ 0xFFFFFFFFFFFFFFFFL) | l4;
        }
        return l3;
    }

    public static int a(boolean[] arrbl, int n2, int n3, int n4, int n5) {
        if (arrbl.length == 0 && n2 == 0 || 0 == n5) {
            return n3;
        }
        if (n5 - 1 + n4 >= 32) {
            throw new IllegalArgumentException("nBools-1+dstPos is greather or equal to than 32");
        }
        int n6 = n3;
        int n7 = 0;
        for (int i2 = 0; i2 < n5; ++i2) {
            n7 = i2 * 1 + n4;
            int n8 = (arrbl[i2 + n2] ? 1 : 0) << n7;
            int n9 = 1 << n7;
            n6 = n6 & ~n9 | n8;
        }
        return n6;
    }

    public static short a(boolean[] arrbl, int n2, short s2, int n3, int n4) {
        if (arrbl.length == 0 && n2 == 0 || 0 == n4) {
            return s2;
        }
        if (n4 - 1 + n3 >= 16) {
            throw new IllegalArgumentException("nBools-1+dstPos is greather or equal to than 16");
        }
        short s3 = s2;
        int n5 = 0;
        for (int i2 = 0; i2 < n4; ++i2) {
            n5 = i2 * 1 + n3;
            int n6 = (arrbl[i2 + n2] ? 1 : 0) << n5;
            int n7 = 1 << n5;
            s3 = (short)(s3 & ~n7 | n6);
        }
        return s3;
    }

    public static byte a(boolean[] arrbl, int n2, byte by2, int n3, int n4) {
        if (arrbl.length == 0 && n2 == 0 || 0 == n4) {
            return by2;
        }
        if (n4 - 1 + n3 >= 8) {
            throw new IllegalArgumentException("nBools-1+dstPos is greather or equal to than 8");
        }
        byte by3 = by2;
        int n5 = 0;
        for (int i2 = 0; i2 < n4; ++i2) {
            n5 = i2 * 1 + n3;
            int n6 = (arrbl[i2 + n2] ? 1 : 0) << n5;
            int n7 = 1 << n5;
            by3 = (byte)(by3 & ~n7 | n6);
        }
        return by3;
    }

    public static int[] a(long l2, int n2, int[] arrn, int n3, int n4) {
        if (0 == n4) {
            return arrn;
        }
        if ((n4 - 1) * 32 + n2 >= 64) {
            throw new IllegalArgumentException("(nInts-1)*32+srcPos is greather or equal to than 64");
        }
        int n5 = 0;
        for (int i2 = 0; i2 < n4; ++i2) {
            n5 = i2 * 32 + n2;
            arrn[n3 + i2] = (int)(0xFFFFFFFFFFFFFFFFL & l2 >> n5);
        }
        return arrn;
    }

    public static short[] a(long l2, int n2, short[] arrs, int n3, int n4) {
        if (0 == n4) {
            return arrs;
        }
        if ((n4 - 1) * 16 + n2 >= 64) {
            throw new IllegalArgumentException("(nShorts-1)*16+srcPos is greather or equal to than 64");
        }
        int n5 = 0;
        for (int i2 = 0; i2 < n4; ++i2) {
            n5 = i2 * 16 + n2;
            arrs[n3 + i2] = (short)(0xFFFFL & l2 >> n5);
        }
        return arrs;
    }

    public static short[] a(int n2, int n3, short[] arrs, int n4, int n5) {
        if (0 == n5) {
            return arrs;
        }
        if ((n5 - 1) * 16 + n3 >= 32) {
            throw new IllegalArgumentException("(nShorts-1)*16+srcPos is greather or equal to than 32");
        }
        int n6 = 0;
        for (int i2 = 0; i2 < n5; ++i2) {
            n6 = i2 * 16 + n3;
            arrs[n4 + i2] = (short)(0xFFFF & n2 >> n6);
        }
        return arrs;
    }

    public static byte[] a(long l2, int n2, byte[] arrby, int n3, int n4) {
        if (0 == n4) {
            return arrby;
        }
        if ((n4 - 1) * 8 + n2 >= 64) {
            throw new IllegalArgumentException("(nBytes-1)*8+srcPos is greather or equal to than 64");
        }
        int n5 = 0;
        for (int i2 = 0; i2 < n4; ++i2) {
            n5 = i2 * 8 + n2;
            arrby[n3 + i2] = (byte)(0xFFL & l2 >> n5);
        }
        return arrby;
    }

    public static byte[] a(int n2, int n3, byte[] arrby, int n4, int n5) {
        if (0 == n5) {
            return arrby;
        }
        if ((n5 - 1) * 8 + n3 >= 32) {
            throw new IllegalArgumentException("(nBytes-1)*8+srcPos is greather or equal to than 32");
        }
        int n6 = 0;
        for (int i2 = 0; i2 < n5; ++i2) {
            n6 = i2 * 8 + n3;
            arrby[n4 + i2] = (byte)(0xFF & n2 >> n6);
        }
        return arrby;
    }

    public static byte[] a(short s2, int n2, byte[] arrby, int n3, int n4) {
        if (0 == n4) {
            return arrby;
        }
        if ((n4 - 1) * 8 + n2 >= 16) {
            throw new IllegalArgumentException("(nBytes-1)*8+srcPos is greather or equal to than 16");
        }
        int n5 = 0;
        for (int i2 = 0; i2 < n4; ++i2) {
            n5 = i2 * 8 + n2;
            arrby[n3 + i2] = (byte)(0xFF & s2 >> n5);
        }
        return arrby;
    }

    public static String a(long l2, int n2, String string, int n3, int n4) {
        if (0 == n4) {
            return string;
        }
        if ((n4 - 1) * 4 + n2 >= 64) {
            throw new IllegalArgumentException("(nHexs-1)*4+srcPos is greather or equal to than 64");
        }
        StringBuilder stringBuilder = new StringBuilder(string);
        int n5 = 0;
        int n6 = stringBuilder.length();
        for (int i2 = 0; i2 < n4; ++i2) {
            n5 = i2 * 4 + n2;
            int n7 = (int)(0xFL & l2 >> n5);
            if (n3 + i2 == n6) {
                ++n6;
                stringBuilder.append(u.a(n7));
                continue;
            }
            stringBuilder.setCharAt(n3 + i2, u.a(n7));
        }
        return stringBuilder.toString();
    }

    public static String a(int n2, int n3, String string, int n4, int n5) {
        if (0 == n5) {
            return string;
        }
        if ((n5 - 1) * 4 + n3 >= 32) {
            throw new IllegalArgumentException("(nHexs-1)*4+srcPos is greather or equal to than 32");
        }
        StringBuilder stringBuilder = new StringBuilder(string);
        int n6 = 0;
        int n7 = stringBuilder.length();
        for (int i2 = 0; i2 < n5; ++i2) {
            n6 = i2 * 4 + n3;
            int n8 = 0xF & n2 >> n6;
            if (n4 + i2 == n7) {
                ++n7;
                stringBuilder.append(u.a(n8));
                continue;
            }
            stringBuilder.setCharAt(n4 + i2, u.a(n8));
        }
        return stringBuilder.toString();
    }

    public static String a(short s2, int n2, String string, int n3, int n4) {
        if (0 == n4) {
            return string;
        }
        if ((n4 - 1) * 4 + n2 >= 16) {
            throw new IllegalArgumentException("(nHexs-1)*4+srcPos is greather or equal to than 16");
        }
        StringBuilder stringBuilder = new StringBuilder(string);
        int n5 = 0;
        int n6 = stringBuilder.length();
        for (int i2 = 0; i2 < n4; ++i2) {
            n5 = i2 * 4 + n2;
            int n7 = 0xF & s2 >> n5;
            if (n3 + i2 == n6) {
                ++n6;
                stringBuilder.append(u.a(n7));
                continue;
            }
            stringBuilder.setCharAt(n3 + i2, u.a(n7));
        }
        return stringBuilder.toString();
    }

    public static String a(byte by2, int n2, String string, int n3, int n4) {
        if (0 == n4) {
            return string;
        }
        if ((n4 - 1) * 4 + n2 >= 8) {
            throw new IllegalArgumentException("(nHexs-1)*4+srcPos is greather or equal to than 8");
        }
        StringBuilder stringBuilder = new StringBuilder(string);
        int n5 = 0;
        int n6 = stringBuilder.length();
        for (int i2 = 0; i2 < n4; ++i2) {
            n5 = i2 * 4 + n2;
            int n7 = 0xF & by2 >> n5;
            if (n3 + i2 == n6) {
                ++n6;
                stringBuilder.append(u.a(n7));
                continue;
            }
            stringBuilder.setCharAt(n3 + i2, u.a(n7));
        }
        return stringBuilder.toString();
    }

    public static boolean[] a(long l2, int n2, boolean[] arrbl, int n3, int n4) {
        if (0 == n4) {
            return arrbl;
        }
        if (n4 - 1 + n2 >= 64) {
            throw new IllegalArgumentException("nBools-1+srcPos is greather or equal to than 64");
        }
        int n5 = 0;
        for (int i2 = 0; i2 < n4; ++i2) {
            n5 = i2 * 1 + n2;
            arrbl[n3 + i2] = (1L & l2 >> n5) != 0L;
        }
        return arrbl;
    }

    public static boolean[] a(int n2, int n3, boolean[] arrbl, int n4, int n5) {
        if (0 == n5) {
            return arrbl;
        }
        if (n5 - 1 + n3 >= 32) {
            throw new IllegalArgumentException("nBools-1+srcPos is greather or equal to than 32");
        }
        int n6 = 0;
        for (int i2 = 0; i2 < n5; ++i2) {
            n6 = i2 * 1 + n3;
            arrbl[n4 + i2] = (1 & n2 >> n6) != 0;
        }
        return arrbl;
    }

    public static boolean[] a(short s2, int n2, boolean[] arrbl, int n3, int n4) {
        if (0 == n4) {
            return arrbl;
        }
        if (n4 - 1 + n2 >= 16) {
            throw new IllegalArgumentException("nBools-1+srcPos is greather or equal to than 16");
        }
        int n5 = 0;
        assert ((n4 - 1) * 1 < 16 - n2);
        for (int i2 = 0; i2 < n4; ++i2) {
            n5 = i2 * 1 + n2;
            arrbl[n3 + i2] = (1 & s2 >> n5) != 0;
        }
        return arrbl;
    }

    public static boolean[] a(byte by2, int n2, boolean[] arrbl, int n3, int n4) {
        if (0 == n4) {
            return arrbl;
        }
        if (n4 - 1 + n2 >= 8) {
            throw new IllegalArgumentException("nBools-1+srcPos is greather or equal to than 8");
        }
        int n5 = 0;
        for (int i2 = 0; i2 < n4; ++i2) {
            n5 = i2 * 1 + n2;
            arrbl[n3 + i2] = (1 & by2 >> n5) != 0;
        }
        return arrbl;
    }

    public static byte[] a(UUID uUID, byte[] arrby, int n2, int n3) {
        if (0 == n3) {
            return arrby;
        }
        if (n3 > 16) {
            throw new IllegalArgumentException("nBytes is greather than 16");
        }
        u.a(uUID.getMostSignificantBits(), 0, arrby, n2, n3 > 8 ? 8 : n3);
        if (n3 >= 8) {
            u.a(uUID.getLeastSignificantBits(), 0, arrby, n2 + 8, n3 - 8);
        }
        return arrby;
    }

    public static UUID a(byte[] arrby, int n2) {
        if (arrby.length - n2 < 16) {
            throw new IllegalArgumentException("Need at least 16 bytes for UUID");
        }
        return new UUID(u.a(arrby, n2, 0L, 0, 8), u.a(arrby, n2 + 8, 0L, 0, 8));
    }
}

