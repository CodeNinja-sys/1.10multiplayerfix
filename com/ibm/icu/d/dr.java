/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.eg;
import com.ibm.icu.d.ku;
import com.ibm.icu.d.lf;
import java.text.CharacterIterator;
import java.util.Stack;

abstract class dr
implements eg {
    protected lf a = new lf();
    private final int b;

    public dr(int n2) {
        this.b = n2;
    }

    public boolean a(int n2, int n3) {
        return n3 >= 0 && n3 < 32 && (1 << n3 & this.b) != 0 && this.a.b(n2);
    }

    public int a(CharacterIterator characterIterator, int n2, int n3, boolean bl2, int n4, Stack stack) {
        int n5;
        int n6;
        int n7;
        if (n4 < 0 || n4 >= 32 || (1 << n4 & this.b) == 0) {
            return 0;
        }
        int n8 = 0;
        ku ku2 = ku.a(characterIterator);
        int n9 = ku2.c();
        int n10 = ku2.a();
        if (bl2) {
            boolean bl3 = this.a.b(n10);
            while ((n7 = ku2.c()) > n2 && bl3) {
                n10 = ku2.e();
                bl3 = this.a.b(n10);
            }
            n6 = n7 < n2 ? n2 : n7 + (bl3 ? 0 : 1);
            n5 = n9 + 1;
        } else {
            while ((n7 = ku2.c()) < n3 && this.a.b(n10)) {
                n10 = ku2.d();
            }
            n6 = n9;
            n5 = n7;
        }
        n8 = this.a(ku2, n6, n5, stack);
        ku2.a(n7);
        return n8;
    }

    protected abstract int a(ku var1, int var2, int var3, Stack var4);
}

