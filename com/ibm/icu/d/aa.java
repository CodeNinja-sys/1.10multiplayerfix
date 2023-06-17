/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.a;
import com.ibm.icu.d.dt;
import com.ibm.icu.d.ku;
import com.ibm.icu.util.e;
import com.ibm.icu.util.i;
import java.text.CharacterIterator;

class aa
extends dt {
    private final byte[] a;
    private final int b;

    public aa(byte[] arrby, int n2) {
        this.a = arrby;
        com.ibm.icu.a.a.a((n2 & 0x7F000000) == 0x1000000);
        this.b = n2;
    }

    private int a(int n2) {
        if (n2 == 8205) {
            return 255;
        }
        if (n2 == 8204) {
            return 254;
        }
        int n3 = n2 - (this.b & 0x1FFFFF);
        if (n3 < 0 || 253 < n3) {
            return -1;
        }
        return n3;
    }

    public int a(CharacterIterator characterIterator, int n2, int[] arrn, int[] arrn2, int n3, int[] arrn3) {
        ku ku2 = ku.a(characterIterator);
        e e2 = new e(this.a, 0);
        int n4 = ku2.j();
        i i2 = e2.a(this.a(n4));
        int n5 = 1;
        int n6 = 0;
        while (true) {
            if (i2.b()) {
                if (n6 < n3) {
                    if (arrn3 != null) {
                        arrn3[n6] = e2.c();
                    }
                    arrn[n6] = n5;
                    ++n6;
                }
                if (i2 == i.c) {
                    break;
                }
            } else if (i2 == i.a) break;
            if (n5 >= n2) break;
            n4 = ku2.j();
            ++n5;
            i2 = e2.b(this.a(n4));
        }
        arrn2[0] = n6;
        return n5;
    }

    public int a() {
        return 0;
    }
}

