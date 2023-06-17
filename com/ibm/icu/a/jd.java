/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ck;
import com.ibm.icu.a.eb;
import com.ibm.icu.a.hk;
import com.ibm.icu.b.b;
import com.ibm.icu.d.iq;
import com.ibm.icu.d.kx;
import com.ibm.icu.d.ld;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

public final class jd {
    private static final char e = '\'';
    private static final char f = '\\';
    private static final int g = Integer.MIN_VALUE;
    private static final char h = '\ua5a5';
    static final byte a = -91;
    public static String b = System.getProperty("line.separator");
    static final char[] c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] i = new char[]{'a', '\u0007', 'b', '\b', 'e', '\u001b', 'f', '\f', 'n', '\n', 'r', '\r', 't', '\t', 'v', '\u000b'};
    static final char[] d = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static final boolean a(Object[] arrobject, Object object) {
        if (arrobject == null) {
            return object == null;
        }
        if (!(object instanceof Object[])) {
            return false;
        }
        Object[] arrobject2 = (Object[])object;
        return arrobject.length == arrobject2.length && jd.a(arrobject, 0, arrobject2, 0, arrobject.length);
    }

    public static final boolean a(int[] arrn, Object object) {
        if (arrn == null) {
            return object == null;
        }
        if (!(object instanceof int[])) {
            return false;
        }
        int[] arrn2 = (int[])object;
        return arrn.length == arrn2.length && jd.a(arrn, 0, arrn2, 0, arrn.length);
    }

    public static final boolean a(double[] arrd, Object object) {
        if (arrd == null) {
            return object == null;
        }
        if (!(object instanceof double[])) {
            return false;
        }
        double[] arrd2 = (double[])object;
        return arrd.length == arrd2.length && jd.a(arrd, 0, arrd2, 0, arrd.length);
    }

    public static final boolean a(byte[] arrby, Object object) {
        if (arrby == null) {
            return object == null;
        }
        if (!(object instanceof byte[])) {
            return false;
        }
        byte[] arrby2 = (byte[])object;
        return arrby.length == arrby2.length && jd.a(arrby, 0, arrby2, 0, arrby.length);
    }

    public static final boolean a(Object object, Object object2) {
        if (object == null) {
            return object2 == null;
        }
        if (object instanceof Object[]) {
            return jd.a((Object[])object, object2);
        }
        if (object instanceof int[]) {
            return jd.a((int[])object, object2);
        }
        if (object instanceof double[]) {
            return jd.a((double[])object, object2);
        }
        if (object instanceof byte[]) {
            return jd.a((byte[])object, object2);
        }
        return object.equals(object2);
    }

    public static final boolean a(Object[] arrobject, int n2, Object[] arrobject2, int n3, int n4) {
        int n5 = n2 + n4;
        int n6 = n3 - n2;
        for (int i2 = n2; i2 < n5; ++i2) {
            if (jd.a(arrobject[i2], arrobject2[i2 + n6])) continue;
            return false;
        }
        return true;
    }

    public static final boolean a(char[] arrc, int n2, char[] arrc2, int n3, int n4) {
        int n5 = n2 + n4;
        int n6 = n3 - n2;
        for (int i2 = n2; i2 < n5; ++i2) {
            if (arrc[i2] == arrc2[i2 + n6]) continue;
            return false;
        }
        return true;
    }

    public static final boolean a(int[] arrn, int n2, int[] arrn2, int n3, int n4) {
        int n5 = n2 + n4;
        int n6 = n3 - n2;
        for (int i2 = n2; i2 < n5; ++i2) {
            if (arrn[i2] == arrn2[i2 + n6]) continue;
            return false;
        }
        return true;
    }

    public static final boolean a(double[] arrd, int n2, double[] arrd2, int n3, int n4) {
        int n5 = n2 + n4;
        int n6 = n3 - n2;
        for (int i2 = n2; i2 < n5; ++i2) {
            if (arrd[i2] == arrd2[i2 + n6]) continue;
            return false;
        }
        return true;
    }

    public static final boolean a(byte[] arrby, int n2, byte[] arrby2, int n3, int n4) {
        int n5 = n2 + n4;
        int n6 = n3 - n2;
        for (int i2 = n2; i2 < n5; ++i2) {
            if (arrby[i2] == arrby2[i2 + n6]) continue;
            return false;
        }
        return true;
    }

    public static final boolean b(Object object, Object object2) {
        return object == null ? object2 == null : (object2 == null ? false : object.equals(object2));
    }

    public static int a(Comparable comparable, Comparable comparable2) {
        return comparable == null ? (comparable2 == null ? 0 : -1) : (comparable2 == null ? 1 : comparable.compareTo(comparable2));
    }

    public static int a(Object object) {
        return object == null ? 0 : object.hashCode();
    }

    public static final String a(int[] arrn) {
        StringBuilder stringBuilder = new StringBuilder();
        jd.b(stringBuilder, arrn.length);
        int n2 = arrn[0];
        int n3 = 1;
        for (int i2 = 1; i2 < arrn.length; ++i2) {
            int n4 = arrn[i2];
            if (n4 == n2 && n3 < 65535) {
                ++n3;
                continue;
            }
            jd.a((Appendable)stringBuilder, n2, n3);
            n2 = n4;
            n3 = 1;
        }
        jd.a((Appendable)stringBuilder, n2, n3);
        return stringBuilder.toString();
    }

    public static final String a(short[] arrs) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((char)(arrs.length >> 16));
        stringBuilder.append((char)arrs.length);
        short s2 = arrs[0];
        int n2 = 1;
        for (int i2 = 1; i2 < arrs.length; ++i2) {
            short s3 = arrs[i2];
            if (s3 == s2 && n2 < 65535) {
                ++n2;
                continue;
            }
            jd.a((Appendable)stringBuilder, s2, n2);
            s2 = s3;
            n2 = 1;
        }
        jd.a((Appendable)stringBuilder, s2, n2);
        return stringBuilder.toString();
    }

    public static final String a(char[] arrc) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((char)(arrc.length >> 16));
        stringBuilder.append((char)arrc.length);
        char c2 = arrc[0];
        int n2 = 1;
        for (int i2 = 1; i2 < arrc.length; ++i2) {
            char c3 = arrc[i2];
            if (c3 == c2 && n2 < 65535) {
                ++n2;
                continue;
            }
            jd.a((Appendable)stringBuilder, (short)c2, n2);
            c2 = c3;
            n2 = 1;
        }
        jd.a((Appendable)stringBuilder, (short)c2, n2);
        return stringBuilder.toString();
    }

    public static final String a(byte[] arrby) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((char)(arrby.length >> 16));
        stringBuilder.append((char)arrby.length);
        byte by2 = arrby[0];
        int n2 = 1;
        byte[] arrby2 = new byte[2];
        for (int i2 = 1; i2 < arrby.length; ++i2) {
            byte by3 = arrby[i2];
            if (by3 == by2 && n2 < 255) {
                ++n2;
                continue;
            }
            jd.a((Appendable)stringBuilder, by2, n2, arrby2);
            by2 = by3;
            n2 = 1;
        }
        jd.a((Appendable)stringBuilder, by2, n2, arrby2);
        if (arrby2[0] != 0) {
            jd.a((Appendable)stringBuilder, (byte)0, arrby2);
        }
        return stringBuilder.toString();
    }

    private static final void a(Appendable appendable, int n2, int n3) {
        if (n3 < 4) {
            for (int i2 = 0; i2 < n3; ++i2) {
                if (n2 == 42405) {
                    jd.b(appendable, n2);
                }
                jd.b(appendable, n2);
            }
        } else {
            if (n3 == 42405) {
                if (n2 == 42405) {
                    jd.b(appendable, 42405);
                }
                jd.b(appendable, n2);
                --n3;
            }
            jd.b(appendable, 42405);
            jd.b(appendable, n3);
            jd.b(appendable, n2);
        }
    }

    private static final void b(Appendable appendable, int n2) {
        try {
            appendable.append((char)(n2 >>> 16));
            appendable.append((char)(n2 & 0xFFFF));
        }
        catch (IOException iOException) {
            throw new ck(iOException);
        }
    }

    private static final void a(Appendable appendable, short s2, int n2) {
        try {
            if (n2 < 4) {
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (s2 == 42405) {
                        appendable.append('\ua5a5');
                    }
                    appendable.append((char)s2);
                }
            } else {
                if (n2 == 42405) {
                    if (s2 == 42405) {
                        appendable.append('\ua5a5');
                    }
                    appendable.append((char)s2);
                    --n2;
                }
                appendable.append('\ua5a5');
                appendable.append((char)n2);
                appendable.append((char)s2);
            }
        }
        catch (IOException iOException) {
            throw new ck(iOException);
        }
    }

    private static final void a(Appendable appendable, byte by2, int n2, byte[] arrby) {
        if (n2 < 4) {
            for (int i2 = 0; i2 < n2; ++i2) {
                if (by2 == -91) {
                    jd.a(appendable, (byte)-91, arrby);
                }
                jd.a(appendable, by2, arrby);
            }
        } else {
            if (n2 == -91) {
                if (by2 == -91) {
                    jd.a(appendable, (byte)-91, arrby);
                }
                jd.a(appendable, by2, arrby);
                --n2;
            }
            jd.a(appendable, (byte)-91, arrby);
            jd.a(appendable, (byte)n2, arrby);
            jd.a(appendable, by2, arrby);
        }
    }

    private static final void a(Appendable appendable, byte by2, byte[] arrby) {
        try {
            if (arrby[0] != 0) {
                char c2 = (char)(arrby[1] << 8 | by2 & 0xFF);
                appendable.append(c2);
                arrby[0] = 0;
            } else {
                arrby[0] = 1;
                arrby[1] = by2;
            }
        }
        catch (IOException iOException) {
            throw new ck(iOException);
        }
    }

    public static final int[] a(String string) {
        int n2 = jd.a(string, 0);
        int[] arrn = new int[n2];
        int n3 = 0;
        int n4 = 1;
        int n5 = string.length() / 2;
        while (n3 < n2 && n4 < n5) {
            int n6;
            if ((n6 = jd.a(string, n4++)) == 42405) {
                if ((n6 = jd.a(string, n4++)) == 42405) {
                    arrn[n3++] = n6;
                    continue;
                }
                int n7 = n6;
                int n8 = jd.a(string, n4++);
                for (int i2 = 0; i2 < n7; ++i2) {
                    arrn[n3++] = n8;
                }
                continue;
            }
            arrn[n3++] = n6;
        }
        if (n3 != n2 || n4 != n5) {
            throw new IllegalStateException("Bad run-length encoded int array");
        }
        return arrn;
    }

    static final int a(String string, int n2) {
        return string.charAt(2 * n2) << 16 | string.charAt(2 * n2 + 1);
    }

    public static final short[] b(String string) {
        int n2 = string.charAt(0) << 16 | string.charAt(1);
        short[] arrs = new short[n2];
        int n3 = 0;
        for (int i2 = 2; i2 < string.length(); ++i2) {
            int n4 = string.charAt(i2);
            if (n4 == 42405) {
                if ((n4 = string.charAt(++i2)) == 42405) {
                    arrs[n3++] = (short)n4;
                    continue;
                }
                int n5 = n4;
                short s2 = (short)string.charAt(++i2);
                for (int i3 = 0; i3 < n5; ++i3) {
                    arrs[n3++] = s2;
                }
                continue;
            }
            arrs[n3++] = (short)n4;
        }
        if (n3 != n2) {
            throw new IllegalStateException("Bad run-length encoded short array");
        }
        return arrs;
    }

    public static final char[] c(String string) {
        int n2 = string.charAt(0) << 16 | string.charAt(1);
        char[] arrc = new char[n2];
        int n3 = 0;
        for (int i2 = 2; i2 < string.length(); ++i2) {
            int n4 = string.charAt(i2);
            if (n4 == 42405) {
                if ((n4 = string.charAt(++i2)) == 42405) {
                    arrc[n3++] = n4;
                    continue;
                }
                int n5 = n4;
                char c2 = string.charAt(++i2);
                for (int i3 = 0; i3 < n5; ++i3) {
                    arrc[n3++] = c2;
                }
                continue;
            }
            arrc[n3++] = n4;
        }
        if (n3 != n2) {
            throw new IllegalStateException("Bad run-length encoded short array");
        }
        return arrc;
    }

    public static final byte[] d(String string) {
        int n2 = string.charAt(0) << 16 | string.charAt(1);
        byte[] arrby = new byte[n2];
        boolean bl2 = true;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 2;
        int n7 = 0;
        while (n7 < n2) {
            int n8;
            if (bl2) {
                n3 = string.charAt(n6++);
                n8 = (byte)(n3 >> 8);
                bl2 = false;
            } else {
                n8 = n3 & 0xFF;
                bl2 = true;
            }
            switch (n4) {
                case 0: {
                    if (n8 == -91) {
                        n4 = 1;
                        break;
                    }
                    arrby[n7++] = n8;
                    break;
                }
                case 1: {
                    if (n8 == -91) {
                        arrby[n7++] = -91;
                        n4 = 0;
                        break;
                    }
                    n5 = n8;
                    if (n5 < 0) {
                        n5 += 256;
                    }
                    n4 = 2;
                    break;
                }
                case 2: {
                    for (int i2 = 0; i2 < n5; ++i2) {
                        arrby[n7++] = n8;
                    }
                    n4 = 0;
                }
            }
        }
        if (n4 != 0) {
            throw new IllegalStateException("Bad run-length encoded byte array");
        }
        if (n6 != string.length()) {
            throw new IllegalStateException("Excess data in RLE byte array string");
        }
        return arrby;
    }

    public static final String e(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            if (n2 > 0) {
                stringBuilder.append('+').append(b);
            }
            stringBuilder.append("        \"");
            int n3 = 11;
            while (n2 < string.length() && n3 < 80) {
                char c2;
                if ((c2 = string.charAt(n2++)) < ' ' || c2 == '\"' || c2 == '\\') {
                    if (c2 == '\n') {
                        stringBuilder.append("\\n");
                        n3 += 2;
                        continue;
                    }
                    if (c2 == '\t') {
                        stringBuilder.append("\\t");
                        n3 += 2;
                        continue;
                    }
                    if (c2 == '\r') {
                        stringBuilder.append("\\r");
                        n3 += 2;
                        continue;
                    }
                    stringBuilder.append('\\');
                    stringBuilder.append(c[(c2 & 0x1C0) >> 6]);
                    stringBuilder.append(c[(c2 & 0x38) >> 3]);
                    stringBuilder.append(c[c2 & 7]);
                    n3 += 4;
                    continue;
                }
                if (c2 <= '~') {
                    stringBuilder.append(c2);
                    ++n3;
                    continue;
                }
                stringBuilder.append("\\u");
                stringBuilder.append(c[(c2 & 0xF000) >> 12]);
                stringBuilder.append(c[(c2 & 0xF00) >> 8]);
                stringBuilder.append(c[(c2 & 0xF0) >> 4]);
                stringBuilder.append(c[c2 & 0xF]);
                n3 += 6;
            }
            stringBuilder.append('\"');
        }
        return stringBuilder.toString();
    }

    public static final String f(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\"");
        int n2 = 0;
        while (n2 < string.length()) {
            char c2;
            if ((c2 = string.charAt(n2++)) < ' ' || c2 == '\"' || c2 == '\\') {
                if (c2 == '\n') {
                    stringBuilder.append("\\n");
                    continue;
                }
                if (c2 == '\t') {
                    stringBuilder.append("\\t");
                    continue;
                }
                if (c2 == '\r') {
                    stringBuilder.append("\\r");
                    continue;
                }
                stringBuilder.append('\\');
                stringBuilder.append(c[(c2 & 0x1C0) >> 6]);
                stringBuilder.append(c[(c2 & 0x38) >> 3]);
                stringBuilder.append(c[c2 & 7]);
                continue;
            }
            if (c2 <= '~') {
                stringBuilder.append(c2);
                continue;
            }
            stringBuilder.append("\\u");
            stringBuilder.append(c[(c2 & 0xF000) >> 12]);
            stringBuilder.append(c[(c2 & 0xF00) >> 8]);
            stringBuilder.append(c[(c2 & 0xF0) >> 4]);
            stringBuilder.append(c[c2 & 0xF]);
        }
        stringBuilder.append('\"');
        return stringBuilder.toString();
    }

    public static final String g(String string) {
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < string.length(); i2 += kx.a(n2)) {
            n2 = Character.codePointAt(string, i2);
            if (n2 >= 32 && n2 <= 127) {
                if (n2 == 92) {
                    stringBuilder.append("\\\\");
                    continue;
                }
                stringBuilder.append((char)n2);
                continue;
            }
            boolean bl2 = n2 <= 65535;
            stringBuilder.append(bl2 ? "\\u" : "\\U");
            stringBuilder.append(jd.a((long)n2, bl2 ? 4 : 8));
        }
        return stringBuilder.toString();
    }

    public static int a(String string, int[] arrn) {
        int n2;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 4;
        boolean bl2 = false;
        int n8 = arrn[0];
        int n9 = string.length();
        if (n8 < 0 || n8 >= n9) {
            return -1;
        }
        int n10 = Character.codePointAt(string, n8);
        n8 += kx.a(n10);
        switch (n10) {
            case 117: {
                n6 = 4;
                n5 = 4;
                break;
            }
            case 85: {
                n6 = 8;
                n5 = 8;
                break;
            }
            case 120: {
                n5 = 1;
                if (n8 < n9 && kx.a(string, n8) == 123) {
                    ++n8;
                    bl2 = true;
                    n6 = 8;
                    break;
                }
                n6 = 2;
                break;
            }
            default: {
                n2 = com.ibm.icu.b.b.a(n10, 8);
                if (n2 < 0) break;
                n5 = 1;
                n6 = 3;
                n4 = 1;
                n7 = 3;
                n3 = n2;
            }
        }
        if (n5 != 0) {
            while (n8 < n9 && n4 < n6 && (n2 = com.ibm.icu.b.b.a(n10 = kx.a(string, n8), n7 == 3 ? 8 : 16)) >= 0) {
                n3 = n3 << n7 | n2;
                n8 += kx.a(n10);
                ++n4;
            }
            if (n4 < n5) {
                return -1;
            }
            if (bl2) {
                if (n10 != 125) {
                    return -1;
                }
                ++n8;
            }
            if (n3 < 0 || n3 >= 0x110000) {
                return -1;
            }
            if (n8 < n9 && kx.c((char)n3)) {
                int n11 = n8 + 1;
                n10 = string.charAt(n8);
                if (n10 == 92 && n11 < n9) {
                    int[] arrn2 = new int[]{n11};
                    n10 = jd.a(string, arrn2);
                    n11 = arrn2[0];
                }
                if (kx.b((char)n10)) {
                    n8 = n11;
                    n3 = hk.a((char)n3, (char)n10);
                }
            }
            arrn[0] = n8;
            return n3;
        }
        for (int i2 = 0; i2 < i.length; i2 += 2) {
            if (n10 == i[i2]) {
                arrn[0] = n8;
                return i[i2 + 1];
            }
            if (n10 < i[i2]) break;
        }
        if (n10 == 99 && n8 < n9) {
            n10 = kx.a(string, n8);
            arrn[0] = n8 + kx.a(n10);
            return 0x1F & n10;
        }
        arrn[0] = n8;
        return n10;
    }

    public static String h(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] arrn = new int[1];
        int n2 = 0;
        while (n2 < string.length()) {
            char c2;
            if ((c2 = string.charAt(n2++)) == '\\') {
                arrn[0] = n2;
                int n3 = jd.a(string, arrn);
                if (n3 < 0) {
                    throw new IllegalArgumentException("Invalid escape sequence " + string.substring(n2 - 1, Math.min(n2 + 8, string.length())));
                }
                stringBuilder.appendCodePoint(n3);
                n2 = arrn[0];
                continue;
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public static String i(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] arrn = new int[1];
        int n2 = 0;
        while (n2 < string.length()) {
            char c2;
            if ((c2 = string.charAt(n2++)) == '\\') {
                arrn[0] = n2;
                int n3 = jd.a(string, arrn);
                if (n3 < 0) {
                    stringBuilder.append(c2);
                    continue;
                }
                stringBuilder.appendCodePoint(n3);
                n2 = arrn[0];
                continue;
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public static String a(long l2) {
        return jd.a(l2, 4);
    }

    public static String a(long l2, int n2) {
        String string;
        boolean bl2;
        if (l2 == Long.MIN_VALUE) {
            return "-8000000000000000";
        }
        boolean bl3 = bl2 = l2 < 0L;
        if (bl2) {
            l2 = -l2;
        }
        if ((string = Long.toString(l2, 16).toUpperCase(Locale.ENGLISH)).length() < n2) {
            string = "0000000000000000".substring(string.length(), n2) + string;
        }
        if (bl2) {
            return '-' + string;
        }
        return string;
    }

    public static String a(CharSequence charSequence) {
        return ((StringBuilder)jd.a(charSequence, 4, ",", true, new StringBuilder())).toString();
    }

    public static Appendable a(CharSequence charSequence, int n2, CharSequence charSequence2, boolean bl2, Appendable appendable) {
        try {
            if (bl2) {
                int n3;
                for (int i2 = 0; i2 < charSequence.length(); i2 += kx.a(n3)) {
                    n3 = Character.codePointAt(charSequence, i2);
                    if (i2 != 0) {
                        appendable.append(charSequence2);
                    }
                    appendable.append(jd.a((long)n3, n2));
                }
            } else {
                for (int i3 = 0; i3 < charSequence.length(); ++i3) {
                    if (i3 != 0) {
                        appendable.append(charSequence2);
                    }
                    appendable.append(jd.a((long)charSequence.charAt(i3), n2));
                }
            }
            return appendable;
        }
        catch (IOException iOException) {
            throw new ck(iOException);
        }
    }

    public static String a(byte[] arrby, int n2, int n3, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = n2; i2 < n3; ++i2) {
            if (i2 != 0) {
                stringBuilder.append(string);
            }
            stringBuilder.append(jd.a((long)arrby[i2]));
        }
        return stringBuilder.toString();
    }

    public static String a(CharSequence charSequence, int n2, CharSequence charSequence2) {
        return ((StringBuilder)jd.a(charSequence, n2, charSequence2, true, new StringBuilder())).toString();
    }

    public static void a(String string, char c2, String[] arrstring) {
        int n2;
        int n3 = 0;
        int n4 = 0;
        for (n2 = 0; n2 < string.length(); ++n2) {
            if (string.charAt(n2) != c2) continue;
            arrstring[n4++] = string.substring(n3, n2);
            n3 = n2 + 1;
        }
        arrstring[n4++] = string.substring(n3, n2);
        while (n4 < arrstring.length) {
            arrstring[n4++] = "";
        }
    }

    public static String[] a(String string, char c2) {
        int n2;
        int n3 = 0;
        ArrayList<String> arrayList = new ArrayList<String>();
        for (n2 = 0; n2 < string.length(); ++n2) {
            if (string.charAt(n2) != c2) continue;
            arrayList.add(string.substring(n3, n2));
            n3 = n2 + 1;
        }
        arrayList.add(string.substring(n3, n2));
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public static int a(String string, String[] arrstring) {
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            if (!string.equals(arrstring[i2])) continue;
            return i2;
        }
        return -1;
    }

    public static boolean a(String string, int[] arrn, char c2) {
        int n2 = arrn[0];
        arrn[0] = eb.a(string, arrn[0]);
        if (arrn[0] == string.length() || string.charAt(arrn[0]) != c2) {
            arrn[0] = n2;
            return false;
        }
        arrn[0] = arrn[0] + 1;
        return true;
    }

    public static int a(String string, int n2, int n3, String string2, int[] arrn) {
        int[] arrn2 = new int[1];
        int n4 = 0;
        block5: for (int i2 = 0; i2 < string2.length(); ++i2) {
            char c2 = string2.charAt(i2);
            switch (c2) {
                case ' ': {
                    char c3;
                    if (n2 >= n3) {
                        return -1;
                    }
                    if (!eb.c(c3 = string.charAt(n2++))) {
                        return -1;
                    }
                }
                case '~': {
                    n2 = eb.a(string, n2);
                    continue block5;
                }
                case '#': {
                    arrn2[0] = n2;
                    arrn[n4++] = jd.a(string, arrn2, n3);
                    if (arrn2[0] == n2) {
                        return -1;
                    }
                    n2 = arrn2[0];
                    continue block5;
                }
                default: {
                    char c3;
                    if (n2 >= n3) {
                        return -1;
                    }
                    if ((c3 = (char)com.ibm.icu.b.b.w(string.charAt(n2++))) == c2) continue block5;
                    return -1;
                }
            }
        }
        return n2;
    }

    public static int a(String string, iq iq2, int n2, int n3) {
        int n4 = 0;
        if (n4 == string.length()) {
            return n2;
        }
        int n5 = Character.codePointAt(string, n4);
        while (n2 < n3) {
            int n6 = iq2.b(n2);
            if (n5 == 126) {
                if (eb.c(n6)) {
                    n2 += kx.a(n6);
                    continue;
                }
                if (++n4 == string.length()) {
                    return n2;
                }
            } else if (n6 == n5) {
                int n7 = kx.a(n6);
                n2 += n7;
                if ((n4 += n7) == string.length()) {
                    return n2;
                }
            } else {
                return -1;
            }
            n5 = kx.a(string, n4);
        }
        return -1;
    }

    public static int a(String string, int[] arrn, int n2) {
        int n3 = 0;
        int n4 = 0;
        int n5 = arrn[0];
        int n6 = 10;
        if (string.regionMatches(true, n5, "0x", 0, 2)) {
            n5 += 2;
            n6 = 16;
        } else if (n5 < n2 && string.charAt(n5) == '0') {
            ++n5;
            n3 = 1;
            n6 = 8;
        }
        while (n5 < n2) {
            int n7;
            if ((n7 = com.ibm.icu.b.b.a((int)string.charAt(n5++), n6)) < 0) {
                --n5;
                break;
            }
            ++n3;
            int n8 = n4 * n6 + n7;
            if (n8 <= n4) {
                return 0;
            }
            n4 = n8;
        }
        if (n3 > 0) {
            arrn[0] = n5;
        }
        return n4;
    }

    public static String b(String string, int[] arrn) {
        int n2;
        int n3;
        StringBuilder stringBuilder = new StringBuilder();
        for (n2 = arrn[0]; n2 < string.length(); n2 += kx.a(n3)) {
            n3 = Character.codePointAt(string, n2);
            if (stringBuilder.length() == 0) {
                if (com.ibm.icu.b.b.t(n3)) {
                    stringBuilder.appendCodePoint(n3);
                    continue;
                }
                return null;
            }
            if (!com.ibm.icu.b.b.s(n3)) break;
            stringBuilder.appendCodePoint(n3);
        }
        arrn[0] = n2;
        return stringBuilder.toString();
    }

    private static void b(Appendable appendable, int n2, int n3, int n4) {
        try {
            int n5 = n2 % n3;
            if (n2 >= n3 || n4 > 1) {
                jd.b(appendable, n2 / n3, n3, n4 - 1);
            }
            appendable.append(d[n5]);
        }
        catch (IOException iOException) {
            throw new ck(iOException);
        }
    }

    public static Appendable a(Appendable appendable, int n2, int n3, int n4) {
        try {
            if (n3 < 2 || n3 > 36) {
                throw new IllegalArgumentException("Illegal radix " + n3);
            }
            int n5 = n2;
            if (n2 < 0) {
                n5 = -n2;
                appendable.append("-");
            }
            jd.b(appendable, n5, n3, n4);
            return appendable;
        }
        catch (IOException iOException) {
            throw new ck(iOException);
        }
    }

    public static int b(String string, int[] arrn, int n2) {
        int n3;
        int n4;
        int n5;
        int n6 = 0;
        for (n5 = arrn[0]; n5 < string.length() && (n4 = com.ibm.icu.b.b.a(n3 = Character.codePointAt(string, n5), n2)) >= 0; ++n5) {
            if ((n6 = n2 * n6 + n4) >= 0) continue;
            return -1;
        }
        if (n5 == arrn[0]) {
            return -1;
        }
        arrn[0] = n5;
        return n6;
    }

    public static boolean a(int n2) {
        return n2 < 32 || n2 > 126;
    }

    public static boolean a(Appendable appendable, int n2) {
        try {
            if (jd.a(n2)) {
                appendable.append('\\');
                if ((n2 & 0xFFFF0000) != 0) {
                    appendable.append('U');
                    appendable.append(d[0xF & n2 >> 28]);
                    appendable.append(d[0xF & n2 >> 24]);
                    appendable.append(d[0xF & n2 >> 20]);
                    appendable.append(d[0xF & n2 >> 16]);
                } else {
                    appendable.append('u');
                }
                appendable.append(d[0xF & n2 >> 12]);
                appendable.append(d[0xF & n2 >> 8]);
                appendable.append(d[0xF & n2 >> 4]);
                appendable.append(d[0xF & n2]);
                return true;
            }
            return false;
        }
        catch (IOException iOException) {
            throw new ck(iOException);
        }
    }

    public static int a(String string, int n2, int n3, String string2) {
        for (int i2 = n2; i2 < n3; ++i2) {
            char c2 = string.charAt(i2);
            if (c2 == '\\') {
                ++i2;
                continue;
            }
            if (c2 == '\'') {
                while (++i2 < n3 && string.charAt(i2) != '\'') {
                }
                continue;
            }
            if (string2.indexOf(c2) < 0) continue;
            return i2;
        }
        return -1;
    }

    public static void a(StringBuffer stringBuffer, int n2, boolean bl2, boolean bl3, StringBuffer stringBuffer2) {
        if (bl2 || bl3 && jd.a(n2)) {
            int n3;
            if (stringBuffer2.length() > 0) {
                while (stringBuffer2.length() >= 2 && stringBuffer2.charAt(0) == '\'' && stringBuffer2.charAt(1) == '\'') {
                    stringBuffer.append('\\').append('\'');
                    stringBuffer2.delete(0, 2);
                }
                n3 = 0;
                while (stringBuffer2.length() >= 2 && stringBuffer2.charAt(stringBuffer2.length() - 2) == '\'' && stringBuffer2.charAt(stringBuffer2.length() - 1) == '\'') {
                    stringBuffer2.setLength(stringBuffer2.length() - 2);
                    ++n3;
                }
                if (stringBuffer2.length() > 0) {
                    stringBuffer.append('\'');
                    stringBuffer.append(stringBuffer2);
                    stringBuffer.append('\'');
                    stringBuffer2.setLength(0);
                }
                while (n3-- > 0) {
                    stringBuffer.append('\\').append('\'');
                }
            }
            if (n2 != -1) {
                if (n2 == 32) {
                    n3 = stringBuffer.length();
                    if (n3 > 0 && stringBuffer.charAt(n3 - 1) != ' ') {
                        stringBuffer.append(' ');
                    }
                } else if (!bl3 || !jd.a(stringBuffer, n2)) {
                    stringBuffer.appendCodePoint(n2);
                }
            }
        } else if (stringBuffer2.length() == 0 && (n2 == 39 || n2 == 92)) {
            stringBuffer.append('\\').append((char)n2);
        } else if (!(stringBuffer2.length() <= 0 && (n2 < 33 || n2 > 126 || n2 >= 48 && n2 <= 57 || n2 >= 65 && n2 <= 90 || n2 >= 97 && n2 <= 122) && !eb.c(n2))) {
            stringBuffer2.appendCodePoint(n2);
            if (n2 == 39) {
                stringBuffer2.append((char)n2);
            }
        } else {
            stringBuffer.appendCodePoint(n2);
        }
    }

    public static void a(StringBuffer stringBuffer, String string, boolean bl2, boolean bl3, StringBuffer stringBuffer2) {
        for (int i2 = 0; i2 < string.length(); ++i2) {
            jd.a(stringBuffer, (int)string.charAt(i2), bl2, bl3, stringBuffer2);
        }
    }

    public static void a(StringBuffer stringBuffer, ld ld2, boolean bl2, StringBuffer stringBuffer2) {
        if (ld2 != null) {
            jd.a(stringBuffer, ld2.a(bl2), true, bl2, stringBuffer2);
        }
    }

    public static final int a(int n2, int n3) {
        if ((n2 -= Integer.MIN_VALUE) < (n3 -= Integer.MIN_VALUE)) {
            return -1;
        }
        if (n2 > n3) {
            return 1;
        }
        return 0;
    }

    public static final byte b(int n2) {
        if (n2 <= 0) {
            return -1;
        }
        byte by2 = 0;
        if (n2 >= 65536) {
            n2 >>= 16;
            by2 = (byte)(by2 + 16);
        }
        if (n2 >= 256) {
            n2 >>= 8;
            by2 = (byte)(by2 + 8);
        }
        if (n2 >= 16) {
            n2 >>= 4;
            by2 = (byte)(by2 + 4);
        }
        if (n2 >= 4) {
            n2 >>= 2;
            by2 = (byte)(by2 + 2);
        }
        if (n2 >= 2) {
            n2 >>= 1;
            by2 = (byte)(by2 + 1);
        }
        return by2;
    }

    public static String b(int[] arrn) {
        StringBuilder stringBuilder = new StringBuilder(arrn.length);
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            stringBuilder.appendCodePoint(arrn[i2]);
        }
        return stringBuilder.toString();
    }

    public static String b(String string, int n2) {
        if (n2 <= 0) {
            return "";
        }
        if (n2 == 1) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static String[] a(String string, String string2) {
        return string.split("\\Q" + string2 + "\\E");
    }

    public static String[] j(String string) {
        return string.split("\\s+");
    }

    public static String a(String string, int n2, String string2) {
        return jd.a(string, n2, Pattern.compile(string2 != null ? string2 : "\\s+"));
    }

    public static String a(String string, int n2, Pattern pattern) {
        String[] arrstring;
        StringBuilder stringBuilder = new StringBuilder();
        for (String string2 : arrstring = pattern.split(string)) {
            if (string2.length() < n2) {
                throw new IllegalArgumentException("code point too short: " + string2);
            }
            int n3 = Integer.parseInt(string2, 16);
            stringBuilder.appendCodePoint(n3);
        }
        return stringBuilder.toString();
    }

    public static ClassLoader a() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader == null && (classLoader = ClassLoader.getSystemClassLoader()) == null) {
            throw new RuntimeException("No accessible class loader is available.");
        }
        return classLoader;
    }
}

