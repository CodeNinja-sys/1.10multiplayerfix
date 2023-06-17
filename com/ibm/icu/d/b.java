/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.gx;
import com.ibm.icu.d.c;

public final class b {
    private final int Q;
    private boolean R;
    private boolean S;
    private char T;
    public static final int a = 0x200000;
    public static final int b = 0x700000;
    public static final int c = 0x1000000;
    public static final int d = 0x3800000;
    public static final int e = 262144;
    public static final int f = 393216;
    public static final int g = 524288;
    public static final int h = 786432;
    public static final int i = 917504;
    public static final int j = 0x4000000;
    public static final int k = 0x4000000;
    public static final int l = 0x8000000;
    public static final int m = 0x8000000;
    public static final int n = 0;
    public static final int o = 0;
    public static final int p = 1;
    public static final int q = 1;
    public static final int r = 2;
    public static final int s = 2;
    public static final int t = 3;
    public static final int u = 3;
    public static final int v = 65536;
    public static final int w = 65539;
    public static final int x = 65539;
    public static final int y = 0;
    public static final int z = 0;
    public static final int A = 4;
    public static final int B = 4;
    public static final int C = 0;
    public static final int D = 8;
    public static final int E = 16;
    public static final int F = 24;
    public static final int G = 24;
    public static final int H = 0;
    public static final int I = 32;
    public static final int J = 64;
    public static final int K = 96;
    public static final int L = 128;
    public static final int M = 224;
    public static final int N = 0;
    public static final int O = 256;
    public static final int P = 256;
    private static final char U = '\ufe80';
    private static final char V = '\u0621';
    private static final char W = '\u0626';
    private static final char X = '\ufe89';
    private static final char Y = '\uffff';
    private static final char Z = '\ufffe';
    private static final char aa = '\u0644';
    private static final char ab = ' ';
    private static final char ac = '\ufe7c';
    private static final char ad = '\u0651';
    private static final char ae = '\u0640';
    private static final char af = '\ufe7d';
    private static final char ag = '\ufe73';
    private static final char ah = '\u200b';
    private static final int ai = 0;
    private static final int aj = 1;
    private static final int ak = 4;
    private static final int al = 16;
    private static final int am = 32;
    private static final int an = 1;
    private static final int ao = 2;
    private static final int ap = 3;
    private static final int[] aq = new int[]{0, 2, 4, 6, 8, 10, 12, 14};
    private static final int[] ar = new int[]{1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1};
    private static final int[] as = new int[]{0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
    private static final char[] at = new char[]{'\ufeef', '\ufef0'};
    private static final char[] au = new char[]{'\u0622', '\u0623', '\u0625', '\u0627'};
    private static final int[] av = new int[]{4385, 4897, 5377, 5921, 6403, 7457, 7939, 8961, 9475, 10499, 11523, 12547, 13571, 14593, 15105, 15617, 16129, 16643, 17667, 18691, 19715, 20739, 21763, 22787, 23811, 0, 0, 0, 0, 0, 3, 24835, 25859, 26883, 27923, 28931, 29955, 30979, 32001, 32513, 33027, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 0, 0, 0, 0, 34049, 34561, 35073, 35585, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 33, 33, 0, 33, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 3, 3, 3, 3, 1, 1};
    private static final int[] aw = new int[]{3, 3, 3, 0, 3, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 32, 33, 32, 33, 0, 1, 32, 33, 0, 2, 3, 1, 32, 33, 0, 2, 3, 1, 0, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 16, 18, 19, 17, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 1, 0, 1, 0, 2, 3, 1, 0, 1, 0, 1, 0, 1, 0, 1};
    private static int[] ax = new int[]{1611, 1611, 1612, 1612, 1613, 1613, 1614, 1614, 1615, 1615, 1616, 1616, 1617, 1617, 1618, 1618, 1569, 1570, 1570, 1571, 1571, 1572, 1572, 1573, 1573, 1574, 1574, 1574, 1574, 1575, 1575, 1576, 1576, 1576, 1576, 1577, 1577, 1578, 1578, 1578, 1578, 1579, 1579, 1579, 1579, 1580, 1580, 1580, 1580, 1581, 1581, 1581, 1581, 1582, 1582, 1582, 1582, 1583, 1583, 1584, 1584, 1585, 1585, 1586, 1586, 1587, 1587, 1587, 1587, 1588, 1588, 1588, 1588, 1589, 1589, 1589, 1589, 1590, 1590, 1590, 1590, 1591, 1591, 1591, 1591, 1592, 1592, 1592, 1592, 1593, 1593, 1593, 1593, 1594, 1594, 1594, 1594, 1601, 1601, 1601, 1601, 1602, 1602, 1602, 1602, 1603, 1603, 1603, 1603, 1604, 1604, 1604, 1604, 1605, 1605, 1605, 1605, 1606, 1606, 1606, 1606, 1607, 1607, 1607, 1607, 1608, 1608, 1609, 1609, 1610, 1610, 1610, 1610, 1628, 1628, 1629, 1629, 1630, 1630, 1631, 1631};
    private static final int[][][] ay = new int[][][]{new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 1, 0, 3}, {0, 1, 0, 1}}, new int[][]{{0, 0, 2, 2}, {0, 0, 1, 2}, {0, 1, 1, 2}, {0, 1, 1, 3}}, new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 1, 0, 3}, {0, 1, 0, 3}}, new int[][]{{0, 0, 1, 2}, {0, 0, 1, 2}, {0, 1, 1, 2}, {0, 1, 1, 3}}};

    public int a(char[] arrc, int n2, int n3, char[] arrc2, int n4, int n5) {
        if (arrc == null) {
            throw new IllegalArgumentException("source can not be null");
        }
        if (n2 < 0 || n3 < 0 || n2 + n3 > arrc.length) {
            throw new IllegalArgumentException("bad source start (" + n2 + ") or length (" + n3 + ") for buffer of length " + arrc.length);
        }
        if (arrc2 == null && n5 != 0) {
            throw new IllegalArgumentException("null dest requires destSize == 0");
        }
        if (n5 != 0 && (n4 < 0 || n5 < 0 || n4 + n5 > arrc2.length)) {
            throw new IllegalArgumentException("bad dest start (" + n4 + ") or size (" + n5 + ") for buffer of length " + arrc2.length);
        }
        if ((this.Q & 0xE0000) > 0 && (this.Q & 0xE0000) != 262144 && (this.Q & 0xE0000) != 393216 && (this.Q & 0xE0000) != 524288 && (this.Q & 0xE0000) != 786432) {
            throw new IllegalArgumentException("Wrong Tashkeel argument");
        }
        if ((this.Q & 0x10003) > 0 && (this.Q & 0x10003) != 3 && (this.Q & 0x10003) != 2 && (this.Q & 0x10003) != 0 && (this.Q & 0x10003) != 65536 && (this.Q & 0x10003) != 1) {
            throw new IllegalArgumentException("Wrong Lam Alef argument");
        }
        if ((this.Q & 0xE0000) > 0 && (this.Q & 0x18) == 16) {
            throw new IllegalArgumentException("Tashkeel replacement should not be enabled in deshaping mode ");
        }
        return this.b(arrc, n2, n3, arrc2, n4, n5);
    }

    public void a(char[] arrc, int n2, int n3) {
        if ((this.Q & 0x10003) == 0) {
            throw new c("Cannot shape in place with length option resize.");
        }
        this.a(arrc, n2, n3, arrc, n2, n3);
    }

    public String a(String string) {
        char[] arrc;
        char[] arrc2 = arrc = string.toCharArray();
        if ((this.Q & 0x10003) == 0 && (this.Q & 0x18) == 16) {
            arrc2 = new char[arrc.length * 2];
        }
        int n2 = this.a(arrc, 0, arrc.length, arrc2, 0, arrc2.length);
        return new String(arrc2, 0, n2);
    }

    public b(int n2) {
        this.Q = n2;
        if ((n2 & 0xE0) > 128) {
            throw new IllegalArgumentException("bad DIGITS options");
        }
        this.R = (n2 & 4) == 0;
        this.S = (n2 & 0x4000000) == 0x4000000;
        this.T = (n2 & 0x8000000) == 0x8000000 ? (char)65139 : (char)8203;
    }

    public boolean equals(Object object) {
        return object != null && object.getClass() == b.class && this.Q == ((b)object).Q;
    }

    public int hashCode() {
        return this.Q;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.append('[');
        switch (this.Q & 0x10003) {
            case 0: {
                stringBuilder.append("LamAlef resize");
                break;
            }
            case 1: {
                stringBuilder.append("LamAlef spaces at near");
                break;
            }
            case 3: {
                stringBuilder.append("LamAlef spaces at begin");
                break;
            }
            case 2: {
                stringBuilder.append("LamAlef spaces at end");
                break;
            }
            case 65536: {
                stringBuilder.append("lamAlef auto");
            }
        }
        switch (this.Q & 4) {
            case 0: {
                stringBuilder.append(", logical");
                break;
            }
            case 4: {
                stringBuilder.append(", visual");
            }
        }
        switch (this.Q & 0x18) {
            case 0: {
                stringBuilder.append(", no letter shaping");
                break;
            }
            case 8: {
                stringBuilder.append(", shape letters");
                break;
            }
            case 24: {
                stringBuilder.append(", shape letters tashkeel isolated");
                break;
            }
            case 16: {
                stringBuilder.append(", unshape letters");
            }
        }
        switch (this.Q & 0x700000) {
            case 0x200000: {
                stringBuilder.append(", Seen at near");
            }
        }
        switch (this.Q & 0x3800000) {
            case 0x1000000: {
                stringBuilder.append(", Yeh Hamza at near");
            }
        }
        switch (this.Q & 0xE0000) {
            case 262144: {
                stringBuilder.append(", Tashkeel at begin");
                break;
            }
            case 393216: {
                stringBuilder.append(", Tashkeel at end");
                break;
            }
            case 786432: {
                stringBuilder.append(", Tashkeel replace with tatweel");
                break;
            }
            case 524288: {
                stringBuilder.append(", Tashkeel resize");
            }
        }
        switch (this.Q & 0xE0) {
            case 0: {
                stringBuilder.append(", no digit shaping");
                break;
            }
            case 32: {
                stringBuilder.append(", shape digits to AN");
                break;
            }
            case 64: {
                stringBuilder.append(", shape digits to EN");
                break;
            }
            case 96: {
                stringBuilder.append(", shape digits to AN contextually: default EN");
                break;
            }
            case 128: {
                stringBuilder.append(", shape digits to AN contextually: default AL");
            }
        }
        switch (this.Q & 0x100) {
            case 0: {
                stringBuilder.append(", standard Arabic-Indic digits");
                break;
            }
            case 256: {
                stringBuilder.append(", extended Arabic-Indic digits");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private void a(char[] arrc, int n2, int n3, char c2, boolean bl2) {
        gx gx2 = gx.a;
        c2 = (char)(c2 - 48);
        int n4 = n2 + n3;
        while (--n4 >= n2) {
            char c3 = arrc[n4];
            switch (gx2.b(c3)) {
                case 0: 
                case 1: {
                    bl2 = false;
                    break;
                }
                case 13: {
                    bl2 = true;
                    break;
                }
                case 2: {
                    if (!bl2 || c3 > '9') break;
                    arrc[n4] = (char)(c3 + c2);
                    break;
                }
            }
        }
    }

    private static void b(char[] arrc, int n2, int n3) {
        int n4 = n2;
        for (int i2 = n2 + n3 - 1; n4 < i2; ++n4, --i2) {
            char c2 = arrc[n4];
            arrc[n4] = arrc[i2];
            arrc[i2] = c2;
        }
    }

    private static char a(char c2) {
        switch (c2) {
            case '\u0622': {
                return '\u065c';
            }
            case '\u0623': {
                return '\u065d';
            }
            case '\u0625': {
                return '\u065e';
            }
            case '\u0627': {
                return '\u065f';
            }
        }
        return '\u0000';
    }

    private static int b(char c2) {
        if (c2 > '\u0621' && c2 < '\u0626' || c2 == '\u0627' || c2 > '\u062e' && c2 < '\u0633' || c2 > '\u0647' && c2 < '\u064a' || c2 == '\u0629') {
            return 1;
        }
        if (c2 >= '\u064b' && c2 <= '\u0652') {
            return 2;
        }
        if (c2 >= '\u0653' && c2 <= '\u0655' || c2 == '\u0670' || c2 >= '\ufe70' && c2 <= '\ufe7f') {
            return 3;
        }
        return 0;
    }

    private static int c(char c2) {
        if (c2 >= '\u0622' && c2 <= '\u06d3') {
            return av[c2 - 1570];
        }
        if (c2 == '\u200d') {
            return 3;
        }
        if (c2 >= '\u206d' && c2 <= '\u206f') {
            return 4;
        }
        if (c2 >= '\ufe70' && c2 <= '\ufefc') {
            return aw[c2 - 65136];
        }
        return 0;
    }

    private static int c(char[] arrc, int n2, int n3) {
        int n4 = n2 + n3;
        for (int i2 = n2; i2 < n4; ++i2) {
            if (arrc[i2] == ' ') continue;
            return i2 - n2;
        }
        return n3;
    }

    private static int d(char[] arrc, int n2, int n3) {
        int n4 = n2 + n3;
        while (--n4 >= n2) {
            if (arrc[n4] == ' ') continue;
            return n2 + n3 - 1 - n4;
        }
        return n3;
    }

    private static boolean d(char c2) {
        return c2 >= '\u064b' && c2 <= '\u0652';
    }

    private static int e(char c2) {
        if (c2 >= '\ufeb1' && c2 < '\ufebf') {
            return ar[c2 - 65201];
        }
        return 0;
    }

    private static int f(char c2) {
        if (c2 >= '\u0633' && c2 <= '\u0636') {
            return 1;
        }
        return 0;
    }

    private static boolean g(char c2) {
        return c2 == '\u200b' || c2 == '\ufe73';
    }

    private static boolean h(char c2) {
        return c2 == '\ufeef' || c2 == '\ufef0' || c2 == '\u0649';
    }

    private static boolean i(char c2) {
        return c2 == '\ufe89' || c2 == '\ufe8a';
    }

    private static boolean j(char c2) {
        return c2 != '\ufe75' && c2 >= '\ufe70' && c2 <= '\ufe7f';
    }

    private static int k(char c2) {
        if (c2 >= '\ufe70' && c2 <= '\ufe7f' && c2 != '\ufe73' && c2 != '\ufe75' && c2 != '\ufe7d') {
            return as[c2 - 65136];
        }
        if (c2 >= '\ufcf2' && c2 <= '\ufcf4' || c2 == '\ufe7d') {
            return 2;
        }
        return 0;
    }

    private static int l(char c2) {
        if (c2 >= '\ufe70' && c2 <= '\ufe7f' && c2 != '\ufe73' && c2 != '\ufe75') {
            return 1 - as[c2 - 65136];
        }
        if (c2 >= '\ufc5e' && c2 <= '\ufc63') {
            return 1;
        }
        return 0;
    }

    private static boolean m(char c2) {
        return c2 == '\u0622' || c2 == '\u0623' || c2 == '\u0625' || c2 == '\u0627';
    }

    private static boolean n(char c2) {
        return c2 >= '\ufef5' && c2 <= '\ufefc';
    }

    private static boolean o(char c2) {
        return c2 >= '\u065c' && c2 <= '\u065f';
    }

    private int e(char[] arrc, int n2, int n3) {
        int n4 = n3;
        switch (this.Q & 0x18) {
            case 8: 
            case 24: {
                if (this.R) {
                    int n5 = n2 + n3 - 1;
                    for (int i2 = n2; i2 < n5; ++i2) {
                        if ((arrc[i2] != '\u0644' || !com.ibm.icu.d.b.m(arrc[i2 + 1])) && !com.ibm.icu.d.b.j(arrc[i2])) continue;
                        --n4;
                    }
                } else {
                    int n6 = n2 + n3;
                    for (int i3 = n2 + 1; i3 < n6; ++i3) {
                        if ((arrc[i3] != '\u0644' || !com.ibm.icu.d.b.m(arrc[i3 - 1])) && !com.ibm.icu.d.b.j(arrc[i3])) continue;
                        --n4;
                    }
                }
                break;
            }
            case 16: {
                int n7 = n2 + n3;
                for (int i4 = n2; i4 < n7; ++i4) {
                    if (!com.ibm.icu.d.b.n(arrc[i4])) continue;
                    ++n4;
                }
                break;
            }
        }
        return n4;
    }

    private static int a(char[] arrc, int n2, char c2) {
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (arrc[i2] != c2) continue;
            ++n3;
        }
        return n3;
    }

    private static void a(char[] arrc, int n2, int n3, char c2) {
        int n4 = n3;
        int n5 = n3;
        while (--n5 >= n2) {
            char c3 = arrc[n5];
            if (c3 == c2 || --n4 == n5) continue;
            arrc[n4] = c3;
        }
    }

    private static int a(char[] arrc, int n2, int n3, int n4) {
        if (n4 > n2) {
            int n5 = n4;
            n4 = n2;
            while (n5 < n3) {
                arrc[n4++] = arrc[n5++];
            }
        } else {
            n4 = n3;
        }
        return n4;
    }

    private static int a(char[] arrc, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            if (com.ibm.icu.d.b.k(arrc[i2]) == 1) {
                arrc[i2] = 1600;
                continue;
            }
            if (com.ibm.icu.d.b.k(arrc[i2]) == 2) {
                arrc[i2] = 65149;
                continue;
            }
            if (com.ibm.icu.d.b.l(arrc[i2]) != 1 || arrc[i2] == '\ufe7c') continue;
            arrc[i2] = 32;
        }
        return n2;
    }

    private int f(char[] arrc, int n2, int n3) {
        block26: {
            boolean bl2;
            boolean bl3;
            int n4;
            int n5;
            block25: {
                int n6;
                n5 = this.Q & 0x10003;
                n4 = this.Q & 0xE0000;
                bl3 = false;
                bl2 = false;
                if (!this.R & !this.S) {
                    switch (n5) {
                        case 3: {
                            n5 = 2;
                            break;
                        }
                        case 2: {
                            n5 = 3;
                            break;
                        }
                    }
                    switch (n4) {
                        case 262144: {
                            n4 = 393216;
                            break;
                        }
                        case 393216: {
                            n4 = 262144;
                            break;
                        }
                    }
                }
                if (n5 != 1) break block25;
                int n7 = n6 + n3;
                for (n6 = n2; n6 < n7; ++n6) {
                    if (arrc[n6] != '\uffff') continue;
                    arrc[n6] = 32;
                }
                break block26;
            }
            int n8 = n2 + n3;
            int n9 = com.ibm.icu.d.b.a(arrc, n3, '\uffff');
            int n10 = com.ibm.icu.d.b.a(arrc, n3, '\ufffe');
            if (n5 == 2) {
                bl3 = true;
            }
            if (n4 == 393216) {
                bl2 = true;
            }
            if (bl3 && n5 == 2) {
                com.ibm.icu.d.b.a(arrc, n2, n8, '\uffff');
                while (n9 > n2) {
                    arrc[--n9] = 32;
                }
            }
            if (bl2 && n4 == 393216) {
                com.ibm.icu.d.b.a(arrc, n2, n8, '\ufffe');
                while (n10 > n2) {
                    arrc[--n10] = 32;
                }
            }
            bl3 = false;
            bl2 = false;
            if (n5 == 0) {
                bl3 = true;
            }
            if (n4 == 524288) {
                bl2 = true;
            }
            if (bl3 && n5 == 0) {
                com.ibm.icu.d.b.a(arrc, n2, n8, '\uffff');
                n9 = com.ibm.icu.d.b.a(arrc, n2, n8, n9);
                n3 = n9 - n2;
            }
            if (bl2 && n4 == 524288) {
                com.ibm.icu.d.b.a(arrc, n2, n8, '\ufffe');
                n10 = com.ibm.icu.d.b.a(arrc, n2, n8, n10);
                n3 = n10 - n2;
            }
            bl3 = false;
            bl2 = false;
            if (n5 == 3 || n5 == 65536) {
                bl3 = true;
            }
            if (n4 == 262144) {
                bl2 = true;
            }
            if (bl3 && (n5 == 3 || n5 == 65536)) {
                com.ibm.icu.d.b.a(arrc, n2, n8, '\uffff');
                n9 = com.ibm.icu.d.b.a(arrc, n2, n8, n9);
                while (n9 < n8) {
                    arrc[n9++] = 32;
                }
            }
            if (!bl2 || n4 != 262144) break block26;
            com.ibm.icu.d.b.a(arrc, n2, n8, '\ufffe');
            n10 = com.ibm.icu.d.b.a(arrc, n2, n8, n10);
            while (n10 < n8) {
                arrc[n10++] = 32;
            }
        }
        return n3;
    }

    private boolean b(char[] arrc, int n2, int n3, int n4) {
        boolean bl2 = false;
        if (n4 > com.ibm.icu.d.b.d(arrc, n2, n3)) {
            bl2 = true;
            return bl2;
        }
        int n5 = n2 + n3 - n4;
        int n6 = n2 + n3;
        while (--n5 >= n2) {
            char c2 = arrc[n5];
            if (com.ibm.icu.d.b.o(c2)) {
                arrc[--n6] = 1604;
                arrc[--n6] = au[c2 - 1628];
                continue;
            }
            arrc[--n6] = c2;
        }
        return bl2;
    }

    private boolean c(char[] arrc, int n2, int n3, int n4) {
        boolean bl2 = false;
        if (n4 > com.ibm.icu.d.b.c(arrc, n2, n3)) {
            bl2 = true;
            return bl2;
        }
        int n5 = n2;
        int n6 = n2 + n3;
        for (int i2 = n2 + n4; i2 < n6; ++i2) {
            char c2 = arrc[i2];
            if (com.ibm.icu.d.b.o(c2)) {
                arrc[n5++] = au[c2 - 1628];
                arrc[n5++] = 1604;
                continue;
            }
            arrc[n5++] = c2;
        }
        return bl2;
    }

    private boolean a(char[] arrc, int n2, int n3, int n4, int n5, int n6) {
        boolean bl2 = false;
        if (com.ibm.icu.d.b.o(arrc[n2])) {
            bl2 = true;
            return bl2;
        }
        int n7 = n2 + n3;
        while (--n7 >= n2) {
            char c2 = arrc[n7];
            if (n6 == 1 && com.ibm.icu.d.b.o(c2)) {
                if (n7 > n2 && arrc[n7 - 1] == ' ') {
                    arrc[n7] = 1604;
                    arrc[--n7] = au[c2 - 1628];
                    continue;
                }
                bl2 = true;
                return bl2;
            }
            if (n5 == 1 && com.ibm.icu.d.b.e(c2) == 1) {
                if (n7 > n2 && arrc[n7 - 1] == ' ') {
                    arrc[n7 - 1] = this.T;
                    continue;
                }
                bl2 = true;
                return bl2;
            }
            if (n4 != 1 || !com.ibm.icu.d.b.i(c2)) continue;
            if (n7 > n2 && arrc[n7 - 1] == ' ') {
                arrc[n7] = at[c2 - 65161];
                arrc[n7 - 1] = 65152;
                continue;
            }
            bl2 = true;
            return bl2;
        }
        return false;
    }

    private int a(char[] arrc, int n2, int n3, int n4, int n5) {
        int n6 = this.Q & 0x10003;
        int n7 = this.Q & 0x700000;
        int n8 = this.Q & 0x3800000;
        boolean bl2 = false;
        if (!this.R && !this.S) {
            switch (n6) {
                case 3: {
                    n6 = 2;
                    break;
                }
                case 2: {
                    n6 = 3;
                    break;
                }
            }
        }
        if (n5 == 1) {
            if (n6 == 65536) {
                if (this.R) {
                    bl2 = this.c(arrc, n2, n3, n4);
                    if (bl2) {
                        bl2 = this.b(arrc, n2, n3, n4);
                    }
                    if (bl2) {
                        bl2 = this.a(arrc, n2, n3, 0, 0, 1);
                    }
                    if (bl2) {
                        throw new c("No spacefor lamalef");
                    }
                } else {
                    bl2 = this.b(arrc, n2, n3, n4);
                    if (bl2) {
                        bl2 = this.c(arrc, n2, n3, n4);
                    }
                    if (bl2) {
                        bl2 = this.a(arrc, n2, n3, 0, 0, 1);
                    }
                    if (bl2) {
                        throw new c("No spacefor lamalef");
                    }
                }
            } else if (n6 == 2) {
                bl2 = this.c(arrc, n2, n3, n4);
                if (bl2) {
                    throw new c("No spacefor lamalef");
                }
            } else if (n6 == 3) {
                bl2 = this.b(arrc, n2, n3, n4);
                if (bl2) {
                    throw new c("No spacefor lamalef");
                }
            } else if (n6 == 1) {
                bl2 = this.a(arrc, n2, n3, 0, 0, 1);
                if (bl2) {
                    throw new c("No spacefor lamalef");
                }
            } else if (n6 == 0) {
                int n9 = n2 + n3;
                int n10 = n9 + n4;
                while (--n9 >= n2) {
                    char c2 = arrc[n9];
                    if (com.ibm.icu.d.b.o(c2)) {
                        arrc[--n10] = 1604;
                        arrc[--n10] = au[c2 - 1628];
                        continue;
                    }
                    arrc[--n10] = c2;
                }
                n3 += n4;
            }
        } else {
            if (n7 == 0x200000 && (bl2 = this.a(arrc, n2, n3, 0, 1, 0))) {
                throw new c("No space for Seen tail expansion");
            }
            if (n8 == 0x1000000 && (bl2 = this.a(arrc, n2, n3, 1, 0, 0))) {
                throw new c("No space for YehHamza expansion");
            }
        }
        return n3;
    }

    private int g(char[] arrc, int n2, int n3) {
        int n4;
        int n5 = 0;
        int n6 = n4 + n3;
        for (n4 = n2; n4 < n6; ++n4) {
            char c2 = arrc[n4];
            if (c2 < '\ufe70' || c2 > '\ufefc') continue;
            if (com.ibm.icu.d.b.n(c2)) {
                ++n5;
            }
            arrc[n4] = (char)ax[c2 - 65136];
        }
        return n5;
    }

    private int h(char[] arrc, int n2, int n3) {
        int n4;
        int n5 = 0;
        boolean bl2 = false;
        boolean bl3 = false;
        bl2 = (this.Q & 0x3800000) == 0x1000000;
        bl3 = (this.Q & 0x700000) == 0x200000;
        int n6 = n4 + n3;
        for (n4 = n2; n4 < n6; ++n4) {
            char c2 = arrc[n4];
            if (bl2 && (c2 == '\u0621' || c2 == '\ufe80') && n4 < n3 - 1 && com.ibm.icu.d.b.h(arrc[n4 + 1])) {
                arrc[n4] = 32;
                arrc[n4 + 1] = 1574;
                continue;
            }
            if (bl3 && com.ibm.icu.d.b.g(c2) && n4 < n3 - 1 && com.ibm.icu.d.b.e(arrc[n4 + 1]) == 1) {
                arrc[n4] = 32;
                continue;
            }
            if (c2 < '\ufe70' || c2 > '\ufefc') continue;
            if (com.ibm.icu.d.b.n(c2)) {
                ++n5;
            }
            arrc[n4] = (char)ax[c2 - 65136];
        }
        return n5;
    }

    private int b(char[] arrc, int n2, int n3, int n4, int n5) {
        int n6 = this.g(arrc, n2, n3);
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        int n7 = n2 + n3 - 1;
        int n8 = com.ibm.icu.d.b.c(arrc[n7]);
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = n7;
        int n13 = -2;
        int n14 = 0;
        while (n7 >= 0) {
            if ((n8 & 0xFF00) > 0 || com.ibm.icu.d.b.d(arrc[n7])) {
                char c2;
                n14 = n7 - 1;
                n13 = -2;
                while (n13 < 0) {
                    if (n14 == -1) {
                        n9 = 0;
                        n13 = Integer.MAX_VALUE;
                        continue;
                    }
                    n9 = com.ibm.icu.d.b.c(arrc[n14]);
                    if ((n9 & 4) == 0) {
                        n13 = n14;
                        continue;
                    }
                    --n14;
                }
                if ((n8 & 0x20) > 0 && (n11 & 0x10) > 0) {
                    bl2 = true;
                    c2 = com.ibm.icu.d.b.a(arrc[n7]);
                    if (c2 != '\u0000') {
                        arrc[n7] = 65535;
                        arrc[n12] = c2;
                        n7 = n12;
                    }
                    n11 = n10;
                    n8 = com.ibm.icu.d.b.c(c2);
                }
                if (n7 > 0 && arrc[n7 - 1] == ' ') {
                    if (com.ibm.icu.d.b.f(arrc[n7]) == 1) {
                        bl3 = true;
                    } else if (arrc[n7] == '\u0626') {
                        bl4 = true;
                    }
                } else if (n7 == 0) {
                    if (com.ibm.icu.d.b.f(arrc[n7]) == 1) {
                        bl3 = true;
                    } else if (arrc[n7] == '\u0626') {
                        bl4 = true;
                    }
                }
                c2 = com.ibm.icu.d.b.b(arrc[n7]);
                int n15 = ay[n9 & 3][n11 & 3][n8 & 3];
                if (c2 == '\u0001') {
                    n15 &= 1;
                } else if (c2 == '\u0002') {
                    n15 = n5 == 0 && (n11 & 2) != 0 && (n9 & 1) != 0 && arrc[n7] != '\u064c' && arrc[n7] != '\u064d' && ((n9 & 0x20) != 32 || (n11 & 0x10) != 16) ? 1 : (n5 == 2 && arrc[n7] == '\u0651' ? 1 : 0);
                }
                if (c2 == '\u0002') {
                    if (n5 == 2 && arrc[n7] != '\u0651') {
                        arrc[n7] = 65534;
                        bl5 = true;
                    } else {
                        arrc[n7] = (char)(65136 + aq[arrc[n7] - 1611] + n15);
                    }
                } else {
                    arrc[n7] = (char)(65136 + (n8 >> 8) + n15);
                }
            }
            if ((n8 & 4) == 0) {
                n10 = n11;
                n11 = n8;
                n12 = n7;
            }
            if (--n7 == n13) {
                n8 = n9;
                n13 = -2;
                continue;
            }
            if (n7 == -1) continue;
            n8 = com.ibm.icu.d.b.c(arrc[n7]);
        }
        n4 = n3;
        if (bl2 || bl5) {
            n4 = this.f(arrc, n2, n3);
        }
        if (bl3 || bl4) {
            n4 = this.a(arrc, n2, n4, n6, 0);
        }
        return n4;
    }

    private int d(char[] arrc, int n2, int n3, int n4) {
        int n5 = this.h(arrc, n2, n3);
        n4 = n5 != 0 ? this.a(arrc, n2, n3, n5, 1) : n3;
        return n4;
    }

    private int b(char[] arrc, int n2, int n3, char[] arrc2, int n4, int n5) {
        if (n3 == 0) {
            return 0;
        }
        if (n5 == 0) {
            if ((this.Q & 0x18) != 0 && (this.Q & 0x10003) == 0) {
                return this.e(arrc, n2, n3);
            }
            return n3;
        }
        char[] arrc3 = new char[n3 * 2];
        System.arraycopy(arrc, n2, arrc3, 0, n3);
        if (this.R) {
            com.ibm.icu.d.b.b(arrc3, 0, n3);
        }
        int n6 = n3;
        switch (this.Q & 0x18) {
            case 24: {
                n6 = this.b(arrc3, 0, n3, n5, 1);
                break;
            }
            case 8: {
                if ((this.Q & 0xE0000) > 0 && (this.Q & 0xE0000) != 786432) {
                    n6 = this.b(arrc3, 0, n3, n5, 2);
                    break;
                }
                n6 = this.b(arrc3, 0, n3, n5, 0);
                if ((this.Q & 0xE0000) != 786432) break;
                n6 = com.ibm.icu.d.b.a(arrc3, n3);
                break;
            }
            case 16: {
                n6 = this.d(arrc3, 0, n3, n5);
                break;
            }
        }
        if (n6 > n5) {
            throw new c("not enough room for result data");
        }
        if ((this.Q & 0xE0) != 0) {
            char c2 = '0';
            switch (this.Q & 0x100) {
                case 0: {
                    c2 = '\u0660';
                    break;
                }
                case 256: {
                    c2 = '\u06f0';
                    break;
                }
            }
            switch (this.Q & 0xE0) {
                case 32: {
                    int n7 = c2 - 48;
                    for (int i2 = 0; i2 < n6; ++i2) {
                        char c3 = arrc3[i2];
                        if (c3 > '9' || c3 < '0') continue;
                        int n8 = i2;
                        arrc3[n8] = (char)(arrc3[n8] + n7);
                    }
                    break;
                }
                case 64: {
                    char c4 = (char)(c2 + 9);
                    int n9 = 48 - c2;
                    for (int i3 = 0; i3 < n6; ++i3) {
                        char c5 = arrc3[i3];
                        if (c5 > c4 || c5 < c2) continue;
                        int n10 = i3;
                        arrc3[n10] = (char)(arrc3[n10] + n9);
                    }
                    break;
                }
                case 96: {
                    this.a(arrc3, 0, n6, c2, false);
                    break;
                }
                case 128: {
                    this.a(arrc3, 0, n6, c2, true);
                    break;
                }
            }
        }
        if (this.R) {
            com.ibm.icu.d.b.b(arrc3, 0, n6);
        }
        System.arraycopy(arrc3, 0, arrc2, n4, n6);
        return n6;
    }
}

