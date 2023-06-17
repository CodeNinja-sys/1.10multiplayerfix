/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.d.lo;
import com.a.a.n.a.bd;
import com.a.a.n.a.bl;
import com.a.a.n.a.bs;
import java.util.Arrays;
import java.util.Set;

class bk
extends IllegalStateException {
    static final StackTraceElement[] a = new StackTraceElement[0];
    static Set b = lo.a(bd.class.getName(), bk.class.getName(), bl.class.getName());

    bk(bl bl2, bl bl3) {
        super(bl2.a() + " -> " + bl3.a());
        StackTraceElement[] arrstackTraceElement = this.getStackTrace();
        int n2 = arrstackTraceElement.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (bs.class.getName().equals(arrstackTraceElement[i2].getClassName())) {
                this.setStackTrace(a);
                break;
            }
            if (b.contains(arrstackTraceElement[i2].getClassName())) continue;
            this.setStackTrace(Arrays.copyOfRange(arrstackTraceElement, i2, n2));
            break;
        }
    }
}

