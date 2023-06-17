/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.a;

import net.minecraft.client.g.a.d;
import net.minecraft.k.p;

class j
implements p {
    final /* synthetic */ d a;
    private final /* synthetic */ int[][] b;

    j(d d2, int[][] arrn) {
        this.a = d2;
        this.b = arrn;
    }

    public String a() {
        StringBuilder stringBuilder = new StringBuilder();
        int[][] arrn = this.b;
        int n2 = this.b.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            int[] arrn2 = arrn[i2];
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(arrn2 == null ? "null" : Integer.valueOf(arrn2.length));
        }
        return stringBuilder.toString();
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

