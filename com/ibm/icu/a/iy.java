/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ej;
import com.ibm.icu.a.gx;
import com.ibm.icu.b.aa;
import com.ibm.icu.b.b;
import com.ibm.icu.d.ea;
import com.ibm.icu.d.eb;
import com.ibm.icu.d.ec;
import com.ibm.icu.d.gm;
import com.ibm.icu.d.go;
import com.ibm.icu.d.jw;
import java.util.EnumSet;

public final class iy
extends ea {
    private static final gm j = gm.a(null, "uts46", go.a);
    final int a;
    private static final EnumSet k = EnumSet.of(eb.g, eb.h, eb.i, eb.j, eb.k);
    private static final byte[] l = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1};
    private static final int m = iy.c(0);
    private static final int n = iy.c(1) | iy.c(13);
    private static final int o = m | n;
    private static final int p = n | iy.c(5);
    private static final int q = iy.c(2) | iy.c(5);
    private static final int r = n | q;
    private static final int s = m | iy.c(2);
    private static final int t = iy.c(3) | iy.c(6) | iy.c(4) | iy.c(10) | iy.c(18) | iy.c(17);
    private static final int u = s | t;
    private static final int v = n | q | t;
    private static int w = iy.c(6) | iy.c(7) | iy.c(8);

    public iy(int n2) {
        this.a = n2;
    }

    public StringBuilder a(CharSequence charSequence, StringBuilder stringBuilder, ec ec2) {
        return this.a(charSequence, true, true, stringBuilder, ec2);
    }

    public StringBuilder b(CharSequence charSequence, StringBuilder stringBuilder, ec ec2) {
        return this.a(charSequence, true, false, stringBuilder, ec2);
    }

    public StringBuilder c(CharSequence charSequence, StringBuilder stringBuilder, ec ec2) {
        this.a(charSequence, false, true, stringBuilder, ec2);
        if (stringBuilder.length() >= 254 && !ec2.b().contains((Object)eb.c) && iy.a(stringBuilder) && (stringBuilder.length() > 254 || stringBuilder.charAt(253) != '.')) {
            iy.b(ec2, eb.c);
        }
        return stringBuilder;
    }

    public StringBuilder d(CharSequence charSequence, StringBuilder stringBuilder, ec ec2) {
        return this.a(charSequence, false, false, stringBuilder, ec2);
    }

    private static boolean a(CharSequence charSequence) {
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (charSequence.charAt(i2) <= '\u007f') continue;
            return false;
        }
        return true;
    }

    private StringBuilder a(CharSequence charSequence, boolean bl2, boolean bl3, StringBuilder stringBuilder, ec ec2) {
        if (stringBuilder == charSequence) {
            throw new IllegalArgumentException();
        }
        stringBuilder.delete(0, Integer.MAX_VALUE);
        iy.a(ec2);
        int n2 = charSequence.length();
        if (n2 == 0) {
            if (bl3) {
                iy.b(ec2, eb.a);
            }
            return stringBuilder;
        }
        boolean bl4 = (this.a & 2) != 0;
        int n3 = 0;
        int n4 = 0;
        while (true) {
            if (n4 == n2) {
                if (bl3) {
                    if (n4 - n3 > 63) {
                        iy.a(ec2, eb.b);
                    }
                    if (!(bl2 || n4 < 254 || n4 <= 254 && n3 >= n4)) {
                        iy.b(ec2, eb.c);
                    }
                }
                iy.b(ec2);
                return stringBuilder;
            }
            char c2 = charSequence.charAt(n4);
            if (c2 > '\u007f') break;
            byte by2 = l[c2];
            if (by2 > 0) {
                stringBuilder.append((char)(c2 + 32));
            } else {
                if (by2 < 0 && bl4) break;
                stringBuilder.append(c2);
                if (c2 == '-') {
                    if (n4 == n3 + 3 && charSequence.charAt(n4 - 1) == '-') {
                        ++n4;
                        break;
                    }
                    if (n4 == n3) {
                        iy.a(ec2, eb.d);
                    }
                    if (n4 + 1 == n2 || charSequence.charAt(n4 + 1) == '.') {
                        iy.a(ec2, eb.e);
                    }
                } else if (c2 == '.') {
                    if (bl2) {
                        ++n4;
                        break;
                    }
                    if (bl3) {
                        if (n4 == n3 && n4 < n2 - 1) {
                            iy.a(ec2, eb.a);
                        } else if (n4 - n3 > 63) {
                            iy.a(ec2, eb.b);
                        }
                    }
                    iy.b(ec2);
                    n3 = n4 + 1;
                }
            }
            ++n4;
        }
        iy.b(ec2);
        this.a(charSequence, n3, n4, bl2, bl3, stringBuilder, ec2);
        if (iy.e(ec2) && !iy.a(ec2, k) && (!iy.g(ec2) || n3 > 0 && !iy.a(stringBuilder, n3))) {
            iy.b(ec2, eb.l);
        }
        return stringBuilder;
    }

    private StringBuilder a(CharSequence charSequence, int n2, int n3, boolean bl2, boolean bl3, StringBuilder stringBuilder, ec ec2) {
        if (n3 == 0) {
            j.a(charSequence, stringBuilder);
        } else {
            j.a(stringBuilder, charSequence.subSequence(n3, charSequence.length()));
        }
        boolean bl4 = bl3 ? (this.a & 0x10) == 0 : (this.a & 0x20) == 0;
        int n4 = stringBuilder.length();
        int n5 = n2;
        while (n5 < n4) {
            char c2 = stringBuilder.charAt(n5);
            if (c2 == '.' && !bl2) {
                int n6 = n5 - n2;
                int n7 = this.a(stringBuilder, n2, n6, bl3, ec2);
                iy.b(ec2);
                n4 += n7 - n6;
                n5 = n2 += n7 + 1;
                continue;
            }
            if ('\u00df' <= c2 && c2 <= '\u200d' && (c2 == '\u00df' || c2 == '\u03c2' || c2 >= '\u200c')) {
                iy.c(ec2);
                if (bl4) {
                    n4 = this.a(stringBuilder, n2, n5);
                    bl4 = false;
                    continue;
                }
                ++n5;
                continue;
            }
            ++n5;
        }
        if (0 == n2 || n2 < n5) {
            this.a(stringBuilder, n2, n5 - n2, bl3, ec2);
            iy.b(ec2);
        }
        return stringBuilder;
    }

    private int a(StringBuilder stringBuilder, int n2, int n3) {
        int n4 = stringBuilder.length();
        boolean bl2 = false;
        int n5 = n3;
        block5: while (n5 < n4) {
            char c2 = stringBuilder.charAt(n5);
            switch (c2) {
                case '\u00df': {
                    bl2 = true;
                    stringBuilder.setCharAt(n5++, 's');
                    stringBuilder.insert(n5++, 's');
                    ++n4;
                    continue block5;
                }
                case '\u03c2': {
                    bl2 = true;
                    stringBuilder.setCharAt(n5++, '\u03c3');
                    continue block5;
                }
                case '\u200c': 
                case '\u200d': {
                    bl2 = true;
                    stringBuilder.delete(n5, n5 + 1);
                    --n4;
                    continue block5;
                }
            }
            ++n5;
        }
        if (bl2) {
            String string = j.d(stringBuilder.subSequence(n2, stringBuilder.length()));
            stringBuilder.replace(n2, Integer.MAX_VALUE, string);
            return stringBuilder.length();
        }
        return n4;
    }

    private static boolean b(int n2) {
        return n2 == 8800 || n2 == 8814 || n2 == 8815;
    }

    private static int a(StringBuilder stringBuilder, int n2, int n3, CharSequence charSequence, int n4) {
        if (charSequence != stringBuilder) {
            stringBuilder.delete(n2, n2 + n3).insert(n2, charSequence);
        }
        return n4;
    }

    private int a(StringBuilder stringBuilder, int n2, int n3, boolean bl2, ec ec2) {
        int n4;
        boolean bl3;
        StringBuilder stringBuilder2;
        int n5;
        boolean bl4;
        int n6 = n2;
        int n7 = n3;
        if (n3 >= 4 && stringBuilder.charAt(n2) == 'x' && stringBuilder.charAt(n2 + 1) == 'n' && stringBuilder.charAt(n2 + 2) == '-' && stringBuilder.charAt(n2 + 3) == '-') {
            StringBuilder stringBuilder3;
            bl4 = true;
            try {
                stringBuilder3 = ej.b(stringBuilder.subSequence(n2 + 4, n2 + n3), null);
            }
            catch (jw jw2) {
                iy.a(ec2, eb.i);
                return this.b(stringBuilder, n2, n3, bl2, ec2);
            }
            n5 = j.a(stringBuilder3) ? 1 : 0;
            if (n5 == 0) {
                iy.a(ec2, eb.k);
                return this.b(stringBuilder, n2, n3, bl2, ec2);
            }
            stringBuilder2 = stringBuilder3;
            n2 = 0;
            n3 = stringBuilder3.length();
        } else {
            bl4 = false;
            stringBuilder2 = stringBuilder;
        }
        if (n3 == 0) {
            if (bl2) {
                iy.a(ec2, eb.a);
            }
            return iy.a(stringBuilder, n6, n7, stringBuilder2, n3);
        }
        if (n3 >= 4 && stringBuilder2.charAt(n2 + 2) == '-' && stringBuilder2.charAt(n2 + 3) == '-') {
            iy.a(ec2, eb.f);
        }
        if (stringBuilder2.charAt(n2) == '-') {
            iy.a(ec2, eb.d);
        }
        if (stringBuilder2.charAt(n2 + n3 - 1) == '-') {
            iy.a(ec2, eb.e);
        }
        n5 = n2;
        int n8 = n2 + n3;
        char c2 = '\u0000';
        boolean bl5 = bl3 = (this.a & 2) != 0;
        do {
            if ((n4 = stringBuilder2.charAt(n5)) <= 127) {
                if (n4 == 46) {
                    iy.a(ec2, eb.j);
                    stringBuilder2.setCharAt(n5, '\ufffd');
                    continue;
                }
                if (!bl3 || l[n4] >= 0) continue;
                iy.a(ec2, eb.h);
                stringBuilder2.setCharAt(n5, '\ufffd');
                continue;
            }
            c2 = (char)(c2 | n4);
            if (bl3 && iy.b(n4)) {
                iy.a(ec2, eb.h);
                stringBuilder2.setCharAt(n5, '\ufffd');
                continue;
            }
            if (n4 != 65533) continue;
            iy.a(ec2, eb.h);
        } while (++n5 < n8);
        n4 = stringBuilder2.codePointAt(n2);
        if ((iy.d(n4) & w) != 0) {
            iy.a(ec2, eb.g);
            stringBuilder2.setCharAt(n2, '\ufffd');
            if (n4 > 65535) {
                stringBuilder2.deleteCharAt(n2 + 1);
                --n3;
                if (stringBuilder2 == stringBuilder) {
                    --n7;
                }
            }
        }
        if (!iy.b(ec2, k)) {
            if ((this.a & 4) != 0 && (!iy.e(ec2) || iy.g(ec2))) {
                this.a(stringBuilder2, n2, n3, ec2);
            }
            if ((this.a & 8) != 0 && (c2 & 0x200C) == 8204 && !this.a((CharSequence)stringBuilder2, n2, n3)) {
                iy.a(ec2, eb.m);
            }
            if ((this.a & 0x40) != 0 && c2 >= '\u00b7') {
                this.b(stringBuilder2, n2, n3, ec2);
            }
            if (bl2) {
                if (bl4) {
                    if (n7 > 63) {
                        iy.a(ec2, eb.b);
                    }
                    return n7;
                }
                if (c2 >= '\u0080') {
                    StringBuilder stringBuilder4;
                    try {
                        stringBuilder4 = ej.a(stringBuilder2.subSequence(n2, n2 + n3), null);
                    }
                    catch (jw jw3) {
                        throw new RuntimeException(jw3);
                    }
                    stringBuilder4.insert(0, "xn--");
                    if (stringBuilder4.length() > 63) {
                        iy.a(ec2, eb.b);
                    }
                    return iy.a(stringBuilder, n6, n7, stringBuilder4, stringBuilder4.length());
                }
                if (n3 > 63) {
                    iy.a(ec2, eb.b);
                }
            }
        } else if (bl4) {
            iy.a(ec2, eb.k);
            return this.b(stringBuilder, n6, n7, bl2, ec2);
        }
        return iy.a(stringBuilder, n6, n7, stringBuilder2, n3);
    }

    private int b(StringBuilder stringBuilder, int n2, int n3, boolean bl2, ec ec2) {
        boolean bl3 = (this.a & 2) != 0;
        boolean bl4 = true;
        boolean bl5 = true;
        int n4 = n2 + 4;
        int n5 = n2 + n3;
        do {
            char c2;
            if ((c2 = stringBuilder.charAt(n4)) <= '\u007f') {
                if (c2 == '.') {
                    iy.a(ec2, eb.j);
                    stringBuilder.setCharAt(n4, '\ufffd');
                    bl5 = false;
                    bl4 = false;
                    continue;
                }
                if (l[c2] >= 0) continue;
                bl5 = false;
                if (!bl3) continue;
                stringBuilder.setCharAt(n4, '\ufffd');
                bl4 = false;
                continue;
            }
            bl5 = false;
            bl4 = false;
        } while (++n4 < n5);
        if (bl5) {
            stringBuilder.insert(n2 + n3, '\ufffd');
            ++n3;
        } else if (bl2 && bl4 && n3 > 63) {
            iy.a(ec2, eb.b);
        }
        return n3;
    }

    private void a(CharSequence charSequence, int n2, int n3, ec ec2) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        block11: {
            n9 = n2;
            n8 = Character.codePointAt(charSequence, n9);
            n9 += Character.charCount(n8);
            n7 = iy.c(gx.a.b(n8));
            if ((n7 & ~o) != 0) {
                iy.f(ec2);
            }
            n6 = n2 + n3;
            do {
                if (n9 >= n6) {
                    n4 = n7;
                    break block11;
                }
                n8 = Character.codePointBefore(charSequence, n6);
                n6 -= Character.charCount(n8);
            } while ((n5 = gx.a.b(n8)) == 17);
            n4 = iy.c(n5);
        }
        if ((n7 & m) != 0 ? (n4 & ~s) != 0 : (n4 & ~r) != 0) {
            iy.f(ec2);
        }
        n5 = 0;
        while (n9 < n6) {
            n8 = Character.codePointAt(charSequence, n9);
            n9 += Character.charCount(n8);
            n5 |= iy.c(gx.a.b(n8));
        }
        if ((n7 & m) != 0) {
            if ((n5 & ~u) != 0) {
                iy.f(ec2);
            }
        } else {
            if ((n5 & ~v) != 0) {
                iy.f(ec2);
            }
            if ((n5 & q) == q) {
                iy.f(ec2);
            }
        }
        if (((n7 | n5 | n4) & p) != 0) {
            iy.d(ec2);
        }
    }

    private static boolean a(CharSequence charSequence, int n2) {
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = charSequence.charAt(i2);
            if (c2 == '.') {
                if (!(i2 <= n3 || 'a' <= (c2 = charSequence.charAt(i2 - 1)) && c2 <= 'z' || '0' <= c2 && c2 <= '9')) {
                    return false;
                }
                n3 = i2 + 1;
                continue;
            }
            if (!(i2 == n3 ? 'a' > c2 || c2 > 'z' : c2 <= ' ' && (c2 >= '\u001c' || '\t' <= c2 && c2 <= '\r'))) continue;
            return false;
        }
        return true;
    }

    private boolean a(CharSequence charSequence, int n2, int n3) {
        int n4 = n2 + n3;
        for (int i2 = n2; i2 < n4; ++i2) {
            int n5;
            if (charSequence.charAt(i2) == '\u200c') {
                int n6;
                if (i2 == n2) {
                    return false;
                }
                int n7 = i2;
                n5 = Character.codePointBefore(charSequence, n7);
                n7 -= Character.charCount(n5);
                if (j.f(n5) == 9) continue;
                while ((n6 = gx.a.g(n5)) == 5) {
                    if (n7 == 0) {
                        return false;
                    }
                    n5 = Character.codePointBefore(charSequence, n7);
                    n7 -= Character.charCount(n5);
                }
                if (n6 != 3 && n6 != 2) {
                    return false;
                }
                n7 = i2 + 1;
                do {
                    if (n7 == n4) {
                        return false;
                    }
                    n5 = Character.codePointAt(charSequence, n7);
                    n7 += Character.charCount(n5);
                } while ((n6 = gx.a.g(n5)) == 5);
                if (n6 == 4 || n6 == 2) continue;
                return false;
            }
            if (charSequence.charAt(i2) != '\u200d') continue;
            if (i2 == n2) {
                return false;
            }
            n5 = Character.codePointBefore(charSequence, i2);
            if (j.f(n5) == 9) continue;
            return false;
        }
        return true;
    }

    private void b(CharSequence charSequence, int n2, int n3, ec ec2) {
        int n4 = n2 + n3 - 1;
        int n5 = 0;
        block0: for (int i2 = n2; i2 <= n4; ++i2) {
            int n6 = charSequence.charAt(i2);
            if (n6 < 183) continue;
            if (n6 <= 1785) {
                if (n6 == 183) {
                    if (n2 < i2 && charSequence.charAt(i2 - 1) == 'l' && i2 < n4 && charSequence.charAt(i2 + 1) == 'l') continue;
                    iy.a(ec2, eb.n);
                    continue;
                }
                if (n6 == 885) {
                    if (i2 < n4 && 14 == aa.a(Character.codePointAt(charSequence, i2 + 1))) continue;
                    iy.a(ec2, eb.n);
                    continue;
                }
                if (n6 == 1523 || n6 == 1524) {
                    if (n2 < i2 && 19 == aa.a(Character.codePointBefore(charSequence, i2))) continue;
                    iy.a(ec2, eb.n);
                    continue;
                }
                if (1632 > n6) continue;
                if (n6 <= 1641) {
                    if (n5 > 0) {
                        iy.a(ec2, eb.o);
                    }
                    n5 = -1;
                    continue;
                }
                if (1776 > n6) continue;
                if (n5 < 0) {
                    iy.a(ec2, eb.o);
                }
                n5 = 1;
                continue;
            }
            if (n6 != 12539) continue;
            int n7 = n2;
            while (true) {
                if (n7 > n4) {
                    iy.a(ec2, eb.n);
                    continue block0;
                }
                n6 = Character.codePointAt(charSequence, n7);
                int n8 = aa.a(n6);
                if (n8 == 20 || n8 == 22 || n8 == 17) continue block0;
                n7 += Character.charCount(n6);
            }
        }
    }

    private static int c(int n2) {
        return 1 << n2;
    }

    private static int d(int n2) {
        return 1 << com.ibm.icu.b.b.e(n2);
    }
}

