/*
 * Decompiled with CFR 0.150.
 */
package com.b.b;

import com.b.b.a;
import com.b.b.ah;

class ak
extends ah {
    ak() {
    }

    int a(a a2, Object object, float[][] arrf, int[] arrn, int n2) {
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (arrn[i2] == 0) continue;
            arrf[n3++] = arrf[i2];
        }
        if (n3 != 0) {
            return ak.a(a2, object, arrf, n3, 1);
        }
        return 0;
    }
}

