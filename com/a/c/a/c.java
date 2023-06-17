/*
 * Decompiled with CFR 0.150.
 */
package com.a.c.a;

import com.a.a.b.bx;
import com.a.a.d.jt;
import com.a.a.d.ju;
import com.a.a.d.ov;
import com.a.c.a.b;
import java.util.List;

class c {
    private static final bx a = bx.a("");

    c() {
    }

    static jt a(CharSequence charSequence) {
        ju ju2 = jt.n();
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; i2 += c.a(ov.b(), charSequence.subSequence(i2, n2), ju2)) {
        }
        return ju2.b();
    }

    private static int a(List list, CharSequence charSequence, ju ju2) {
        String string;
        int n2;
        int n3 = charSequence.length();
        char c2 = '\u0000';
        for (n2 = 0; n2 < n3 && (c2 = charSequence.charAt(n2)) != '&' && c2 != '?' && c2 != '!' && c2 != ':' && c2 != ','; ++n2) {
        }
        list.add(0, c.b(charSequence.subSequence(0, n2)));
        if ((c2 == '!' || c2 == '?' || c2 == ':' || c2 == ',') && (string = a.a(list)).length() > 0) {
            ju2.b(string, (Object)b.a(c2));
        }
        ++n2;
        if (c2 != '?' && c2 != ',') {
            while (n2 < n3) {
                if (charSequence.charAt(n2 += c.a(list, charSequence.subSequence(n2, n3), ju2)) != '?' && charSequence.charAt(n2) != ',') continue;
                ++n2;
                break;
            }
        }
        list.remove(0);
        return n2;
    }

    private static CharSequence b(CharSequence charSequence) {
        int n2 = charSequence.length();
        if (n2 <= 1) {
            return charSequence;
        }
        char[] arrc = new char[n2];
        arrc[0] = charSequence.charAt(n2 - 1);
        for (int i2 = 1; i2 < n2; ++i2) {
            arrc[i2] = charSequence.charAt(n2 - 1 - i2);
            if (!Character.isSurrogatePair(arrc[i2], arrc[i2 - 1])) continue;
            c.a(arrc, i2 - 1, i2);
        }
        return new String(arrc);
    }

    private static void a(char[] arrc, int n2, int n3) {
        char c2 = arrc[n2];
        arrc[n2] = arrc[n3];
        arrc[n3] = c2;
    }
}

