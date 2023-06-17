/*
 * Decompiled with CFR 0.150.
 */
package com.b.b;

import com.b.b.a;
import com.b.b.ah;

class al
extends ah {
    al() {
    }

    int a(a a2, Object object, float[][] arrf, int[] arrn, int n2) {
        int n3 = 0;
        for (n3 = 0; n3 < n2 && arrn[n3] == 0; ++n3) {
        }
        if (n3 == n2) {
            return 0;
        }
        return al.a(a2, object, arrf, n2);
    }
}

