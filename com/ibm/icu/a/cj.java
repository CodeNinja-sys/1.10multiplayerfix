/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ej;
import com.ibm.icu.d.jt;
import com.ibm.icu.d.jw;
import com.ibm.icu.d.ku;

public final class cj {
    private static char[] a = new char[]{'x', 'n', '-', '-'};
    private static final int b = 63;
    private static final int c = 45;
    private static final int d = 65;
    private static final int e = 90;
    private static final int f = 32;
    private static final int g = 46;
    private static final int h = 255;
    private static final jt i = jt.a(0);

    private static boolean a(StringBuffer stringBuffer) {
        boolean bl2 = true;
        if (stringBuffer.length() < a.length) {
            return false;
        }
        for (int i2 = 0; i2 < a.length; ++i2) {
            if (cj.a(stringBuffer.charAt(i2)) == a[i2]) continue;
            bl2 = false;
        }
        return bl2;
    }

    private static char a(char c2) {
        if ('A' <= c2 && c2 <= 'Z') {
            return (char)(c2 + 32);
        }
        return c2;
    }

    private static StringBuffer a(CharSequence charSequence) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            stringBuffer.append(cj.a(charSequence.charAt(i2)));
        }
        return stringBuffer;
    }

    private static int a(StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        int n2 = 0;
        while (n2 != stringBuffer.length()) {
            int n3;
            char c2;
            char c3 = stringBuffer.charAt(n2);
            if (c3 != (c2 = stringBuffer2.charAt(n2)) && (n3 = cj.a(c3) - cj.a(c2)) != 0) {
                return n3;
            }
            ++n2;
        }
        return 0;
    }

    private static int a(char[] arrc, int n2, int n3) {
        while (n2 < n3) {
            if (cj.b(arrc[n2])) {
                return n2;
            }
            ++n2;
        }
        return n2;
    }

    private static boolean a(int n2) {
        if (n2 > 122) {
            return false;
        }
        return n2 == 45 || 48 <= n2 && n2 <= 57 || 65 <= n2 && n2 <= 90 || 97 <= n2 && n2 <= 122;
    }

    private static boolean b(int n2) {
        switch (n2) {
            case 46: 
            case 12290: 
            case 65294: 
            case 65377: {
                return true;
            }
        }
        return false;
    }

    public static StringBuffer a(ku ku2, int n2) {
        int n3;
        boolean bl2;
        boolean[] arrbl = null;
        boolean bl3 = true;
        boolean bl4 = true;
        boolean bl5 = bl2 = (n2 & 2) != 0;
        while ((n3 = ku2.d()) != -1) {
            if (n3 <= 127) continue;
            bl3 = false;
        }
        int n4 = -1;
        ku2.l();
        StringBuffer stringBuffer = null;
        stringBuffer = !bl3 ? i.a(ku2, n2) : new StringBuffer(ku2.i());
        int n5 = stringBuffer.length();
        if (n5 == 0) {
            throw new jw("Found zero length lable after NamePrep.", 10);
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        bl3 = true;
        for (int i2 = 0; i2 < n5; ++i2) {
            n3 = stringBuffer.charAt(i2);
            if (n3 > 127) {
                bl3 = false;
                continue;
            }
            if (cj.a(n3)) continue;
            bl4 = false;
            n4 = i2;
        }
        if (bl2 && (!bl4 || stringBuffer.charAt(0) == '-' || stringBuffer.charAt(stringBuffer.length() - 1) == '-')) {
            if (!bl4) {
                throw new jw("The input does not conform to the STD 3 ASCII rules", 5, stringBuffer.toString(), n4 > 0 ? n4 - 1 : n4);
            }
            if (stringBuffer.charAt(0) == '-') {
                throw new jw("The input does not conform to the STD 3 ASCII rules", 5, stringBuffer.toString(), 0);
            }
            throw new jw("The input does not conform to the STD 3 ASCII rules", 5, stringBuffer.toString(), n5 > 0 ? n5 - 1 : n5);
        }
        if (bl3) {
            stringBuffer2 = stringBuffer;
        } else if (!cj.a(stringBuffer)) {
            arrbl = new boolean[n5];
            StringBuilder stringBuilder = ej.a(stringBuffer, arrbl);
            StringBuffer stringBuffer3 = cj.a(stringBuilder);
            stringBuffer2.append(a, 0, a.length);
            stringBuffer2.append(stringBuffer3);
        } else {
            throw new jw("The input does not start with the ACE Prefix.", 6, stringBuffer.toString(), 0);
        }
        if (stringBuffer2.length() > 63) {
            throw new jw("The labels in the input are too long. Length > 63.", 8, stringBuffer2.toString(), 0);
        }
        return stringBuffer2;
    }

    public static StringBuffer a(String string, int n2) {
        char[] arrc = string.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        int n3 = 0;
        int n4 = 0;
        while (true) {
            String string2;
            if ((string2 = new String(arrc, n4, (n3 = cj.a(arrc, n3, arrc.length)) - n4)).length() != 0 || n3 != arrc.length) {
                ku ku2 = ku.b(string2);
                stringBuffer.append(cj.a(ku2, n2));
            }
            if (n3 == arrc.length) break;
            n4 = ++n3;
            stringBuffer.append('.');
        }
        if (stringBuffer.length() > 255) {
            throw new jw("The output exceed the max allowed length.", 11);
        }
        return stringBuffer;
    }

    public static StringBuffer b(ku ku2, int n2) {
        StringBuffer stringBuffer;
        int n3;
        boolean[] arrbl = null;
        boolean bl2 = true;
        int n4 = ku2.c();
        while ((n3 = ku2.d()) != -1) {
            if (n3 <= 127) continue;
            bl2 = false;
        }
        if (!bl2) {
            try {
                ku2.a(n4);
                stringBuffer = i.a(ku2, n2);
            }
            catch (jw jw2) {
                return new StringBuffer(ku2.i());
            }
        } else {
            stringBuffer = new StringBuffer(ku2.i());
        }
        if (cj.a(stringBuffer)) {
            StringBuffer stringBuffer2;
            StringBuffer stringBuffer3 = null;
            String string = stringBuffer.substring(a.length, stringBuffer.length());
            try {
                stringBuffer3 = new StringBuffer(ej.b(string, arrbl));
            }
            catch (jw jw3) {
                stringBuffer3 = null;
            }
            if (stringBuffer3 != null && cj.a(stringBuffer, stringBuffer2 = cj.a(ku.a(stringBuffer3), n2)) != 0) {
                stringBuffer3 = null;
            }
            if (stringBuffer3 != null) {
                return stringBuffer3;
            }
        }
        return new StringBuffer(ku2.i());
    }

    public static StringBuffer b(String string, int n2) {
        char[] arrc = string.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        int n3 = 0;
        int n4 = 0;
        while (true) {
            String string2;
            if ((string2 = new String(arrc, n4, (n3 = cj.a(arrc, n3, arrc.length)) - n4)).length() == 0 && n3 != arrc.length) {
                throw new jw("Found zero length lable after NamePrep.", 10);
            }
            ku ku2 = ku.b(string2);
            stringBuffer.append(cj.b(ku2, n2));
            if (n3 == arrc.length) break;
            stringBuffer.append(arrc[n3]);
            n4 = ++n3;
        }
        if (stringBuffer.length() > 255) {
            throw new jw("The output exceed the max allowed length.", 11);
        }
        return stringBuffer;
    }

    public static int a(String string, String string2, int n2) {
        StringBuffer stringBuffer = cj.a(string, n2);
        StringBuffer stringBuffer2 = cj.a(string2, n2);
        return cj.a(stringBuffer, stringBuffer2);
    }
}

