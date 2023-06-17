/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ek;
import com.ibm.icu.a.em;
import java.util.Comparator;

class el
implements Comparator {
    final /* synthetic */ ek a;

    el(ek ek2) {
        this.a = ek2;
    }

    public int a(em em2, em em3) {
        if (em2.a == em3.a) {
            return 0;
        }
        if (em2.a < em3.a) {
            return -1;
        }
        return 1;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((em)object, (em)object2);
    }
}

