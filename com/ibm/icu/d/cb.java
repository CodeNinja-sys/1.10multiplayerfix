/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.a;
import com.ibm.icu.a.u;
import com.ibm.icu.d.ds;
import com.ibm.icu.d.dt;
import com.ibm.icu.d.eg;
import com.ibm.icu.d.fo;
import com.ibm.icu.d.lf;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Stack;

class cb
implements eg {
    private static final lf a = new lf();
    private static final lf b = new lf();
    private static final lf c = new lf();
    private static final lf d = new lf();
    private final lf e;
    private dt f = ds.a("Hira");
    private static final int g = 8;
    private static final int h = 20;
    private static final int i = 255;
    private static final int j = Integer.MAX_VALUE;

    public cb(boolean bl2) {
        if (bl2) {
            this.e = a;
        } else {
            this.e = new lf();
            this.e.f(b);
            this.e.f(c);
            this.e.f(d);
            this.e.a((CharSequence)"\\uff70\\u30fc");
        }
    }

    public boolean a(int n2, int n3) {
        return n3 == 1 && this.e.b(n2);
    }

    private static int a(int n2) {
        int[] arrn = new int[]{8192, 984, 408, 240, 204, 252, 300, 372, 480};
        return n2 > 8 ? 8192 : arrn[n2];
    }

    private static boolean b(int n2) {
        return n2 >= 12449 && n2 <= 12542 && n2 != 12539 || n2 >= 65382 && n2 <= 65439;
    }

    public int a(CharacterIterator characterIterator, int n2, int n3, boolean bl2, int n4, Stack stack) {
        int n5;
        int n6;
        int n7;
        if (n2 >= n3) {
            return 0;
        }
        characterIterator.setIndex(n2);
        int n8 = n3 - n2;
        int[] arrn = new int[n8 + 1];
        StringBuffer stringBuffer = new StringBuffer("");
        characterIterator.setIndex(n2);
        while (characterIterator.getIndex() < n3) {
            stringBuffer.append(characterIterator.current());
            characterIterator.next();
        }
        String string = stringBuffer.toString();
        boolean bl3 = fo.b(string, fo.h) == fo.q || fo.c(string, fo.h, 0);
        CharacterIterator characterIterator2 = characterIterator;
        int n9 = 0;
        if (bl3) {
            int n10 = 0;
            arrn[0] = 0;
            while (n10 < string.length()) {
                int n11 = string.codePointAt(n10);
                arrn[++n9] = n10 += Character.charCount(n11);
            }
        } else {
            String string2 = fo.a(string, fo.h);
            characterIterator2 = new StringCharacterIterator(string2);
            arrn = new int[string2.length() + 1];
            fo fo2 = new fo(string, fo.h, 0);
            n7 = 0;
            arrn[0] = 0;
            while (n7 < fo2.k()) {
                fo2.b();
                arrn[++n9] = n7 = fo2.i();
            }
        }
        int[] arrn2 = new int[n9 + 1];
        arrn2[0] = 0;
        for (int i2 = 1; i2 <= n9; ++i2) {
            arrn2[i2] = Integer.MAX_VALUE;
        }
        int[] arrn3 = new int[n9 + 1];
        for (n7 = 0; n7 <= n9; ++n7) {
            arrn3[n7] = -1;
        }
        n7 = 20;
        int[] arrn4 = new int[n9];
        int[] arrn5 = new int[n9];
        int n12 = 0;
        for (int i3 = 0; i3 < n9; ++i3) {
            int n13;
            int n14;
            characterIterator2.setIndex(i3);
            if (arrn2[i3] == Integer.MAX_VALUE) continue;
            n6 = i3 + 20 < n9 ? 20 : n9 - i3;
            int[] arrn6 = new int[1];
            this.f.a(characterIterator2, n6, arrn5, arrn6, n6, arrn4);
            n5 = arrn6[0];
            if (!(n5 != 0 && arrn5[0] == 1 || u.c(characterIterator2) == Integer.MAX_VALUE || a.b(u.c(characterIterator2)))) {
                arrn4[n5] = 255;
                arrn5[n5] = 1;
                ++n5;
            }
            for (n14 = 0; n14 < n5; ++n14) {
                n13 = arrn2[i3] + arrn4[n14];
                if (n13 >= arrn2[arrn5[n14] + i3]) continue;
                arrn2[arrn5[n14] + i3] = n13;
                arrn3[arrn5[n14] + i3] = i3;
            }
            characterIterator2.setIndex(i3);
            n14 = cb.b(u.c(characterIterator2)) ? 1 : 0;
            if (n12 == 0 && n14 != 0) {
                int n15;
                u.a(characterIterator2);
                for (n13 = i3 + 1; n13 < n9 && n13 - i3 < 20 && cb.b(u.c(characterIterator2)); ++n13) {
                    u.a(characterIterator2);
                }
                if (n13 - i3 < 20 && (n15 = arrn2[i3] + cb.a(n13 - i3)) < arrn2[n13]) {
                    arrn2[n13] = n15;
                    arrn3[n13] = i3;
                }
            }
            n12 = n14;
        }
        int[] arrn7 = new int[n9 + 1];
        n6 = 0;
        if (arrn2[n9] == Integer.MAX_VALUE) {
            arrn7[n6] = n9;
            ++n6;
        } else {
            int n16 = n9;
            while (n16 > 0) {
                arrn7[n6] = n16;
                ++n6;
                n16 = arrn3[n16];
            }
            com.ibm.icu.a.a.a(arrn3[arrn7[n6 - 1]] == 0);
        }
        if (stack.size() == 0 || (Integer)stack.peek() < n2) {
            arrn7[n6++] = 0;
        }
        for (int i4 = n6 - 1; i4 >= 0; --i4) {
            n5 = arrn[arrn7[i4]] + n2;
            if (stack.contains(n5) || n5 == n2) continue;
            stack.push(arrn[arrn7[i4]] + n2);
        }
        if (!stack.empty() && (Integer)stack.peek() == n3) {
            stack.pop();
        }
        if (!stack.empty()) {
            characterIterator.setIndex((Integer)stack.peek());
        }
        return 0;
    }

    static {
        a.a("[\\uac00-\\ud7a3]");
        b.a("[:Han:]");
        c.a("[[:Katakana:]\\uff9e\\uff9f]");
        d.a("[:Hiragana:]");
        a.l();
        b.l();
        c.l();
        d.l();
    }
}

