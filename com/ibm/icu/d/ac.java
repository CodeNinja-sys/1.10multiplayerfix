/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.dt;
import com.ibm.icu.d.ku;
import com.ibm.icu.util.i;
import com.ibm.icu.util.z;
import java.text.CharacterIterator;

class ac
extends dt {
    private CharSequence a;

    public ac(CharSequence charSequence) {
        this.a = charSequence;
    }

    public int a(CharacterIterator characterIterator, int n2, int[] arrn, int[] arrn2, int n3, int[] arrn3) {
        ku ku2 = ku.a(characterIterator);
        z z2 = new z(this.a, 0);
        int n4 = ku2.j();
        i i2 = z2.b(n4);
        int n5 = 1;
        int n6 = 0;
        while (true) {
            if (i2.b()) {
                if (n6 < n3) {
                    if (arrn3 != null) {
                        arrn3[n6] = z2.c();
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
            i2 = z2.d(n4);
        }
        arrn2[0] = n6;
        return n5;
    }

    public int a() {
        return 1;
    }
}

