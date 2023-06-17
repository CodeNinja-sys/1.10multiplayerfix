/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.b.b;
import com.ibm.icu.d.eg;
import com.ibm.icu.d.lf;
import java.text.CharacterIterator;
import java.util.Stack;

final class kz
implements eg {
    private final lf[] a = new lf[5];

    public kz() {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = new lf();
        }
    }

    public boolean a(int n2, int n3) {
        return n3 >= 0 && n3 < this.a.length && this.a[n3].b(n2);
    }

    public int a(CharacterIterator characterIterator, int n2, int n3, boolean bl2, int n4, Stack stack) {
        characterIterator.setIndex(n3);
        return 0;
    }

    public synchronized void b(int n2, int n3) {
        if (n3 >= 0 && n3 < this.a.length && n2 != Integer.MAX_VALUE && !this.a[n3].b(n2)) {
            int n4 = b.e(n2, 4106);
            this.a[n3].j(4106, n4);
        }
    }
}

