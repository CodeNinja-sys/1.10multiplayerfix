/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.di;
import com.ibm.icu.a.dt;
import com.ibm.icu.a.dx;
import com.ibm.icu.a.dy;
import com.ibm.icu.a.hk;
import com.ibm.icu.a.ii;
import com.ibm.icu.d.kx;

class ho
extends ii {
    final /* synthetic */ hk a;

    ho(hk hk2, int n2) {
        this.a = hk2;
        super(hk2, n2);
    }

    boolean a(int n2) {
        dt dt2 = di.c().a;
        String string = kx.d(n2);
        StringBuilder stringBuilder = new StringBuilder();
        dx dx2 = new dx(dt2, stringBuilder, 5);
        dt2.a(string, 0, string.length(), false, true, dx2);
        return !dy.a(stringBuilder, string);
    }
}

