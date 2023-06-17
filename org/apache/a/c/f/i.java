/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.f;

import java.util.StringTokenizer;
import org.apache.a.c.f.f;

public class i
implements f {
    private static final int a = 36;
    private static final int b = 1;
    private static final int c = 26;
    private static final int d = 38;
    private static final int e = 700;
    private static final int f = 72;
    private static final int g = 128;
    private static final char h = '-';
    private static final String i = "xn--";

    private int a(int n2, int n3, boolean bl2) {
        int n4 = n2;
        n4 = bl2 ? (n4 /= 700) : (n4 /= 2);
        n4 += n4 / n3;
        int n5 = 0;
        while (n4 > 455) {
            n4 /= 35;
            n5 += 36;
        }
        return n5 + 36 * n4 / (n4 + 38);
    }

    private int a(char c2) {
        if (c2 >= 'A' && c2 <= 'Z') {
            return c2 - 65;
        }
        if (c2 >= 'a' && c2 <= 'z') {
            return c2 - 97;
        }
        if (c2 >= '0' && c2 <= '9') {
            return c2 - 48 + 26;
        }
        throw new IllegalArgumentException("illegal digit: " + c2);
    }

    public String a(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.length());
        StringTokenizer stringTokenizer = new StringTokenizer(string, ".");
        while (stringTokenizer.hasMoreTokens()) {
            String string2 = stringTokenizer.nextToken();
            if (stringBuilder.length() > 0) {
                stringBuilder.append('.');
            }
            if (string2.startsWith(i)) {
                string2 = this.b(string2.substring(4));
            }
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    protected String b(String string) {
        String string2 = string;
        int n2 = 128;
        int n3 = 0;
        int n4 = 72;
        StringBuilder stringBuilder = new StringBuilder(string2.length());
        int n5 = string2.lastIndexOf(45);
        if (n5 != -1) {
            stringBuilder.append(string2.subSequence(0, n5));
            string2 = string2.substring(n5 + 1);
        }
        while (string2.length() > 0) {
            int n6 = n3;
            int n7 = 1;
            int n8 = 36;
            while (string2.length() != 0) {
                char c2 = string2.charAt(0);
                string2 = string2.substring(1);
                int n9 = this.a(c2);
                n3 += n9 * n7;
                int n10 = n8 <= n4 + 1 ? 1 : (n8 >= n4 + 26 ? 26 : n8 - n4);
                if (n9 < n10) break;
                n7 *= 36 - n10;
                n8 += 36;
            }
            n4 = this.a(n3 - n6, stringBuilder.length() + 1, n6 == 0);
            n2 += n3 / (stringBuilder.length() + 1);
            stringBuilder.insert(n3 %= stringBuilder.length() + 1, (char)n2);
            ++n3;
        }
        return stringBuilder.toString();
    }
}

