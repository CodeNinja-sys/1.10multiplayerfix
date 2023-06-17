/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.a;

import com.ibm.icu.util.aw;
import com.ibm.icu.util.bi;
import com.ibm.icu.util.cp;
import java.util.ListResourceBundle;

public class u
extends ListResourceBundle {
    private static final bi[] a = new bi[]{cp.a, cp.b, new cp(3, 1, 0, "Liberation Day"), new cp(4, 1, 0, "Labor Day"), cp.d, cp.e, cp.g, cp.i, new cp(11, 26, 0, "St. Stephens Day"), cp.l, aw.f, aw.g};
    private static final Object[][] b = new Object[][]{{"holidays", a}};

    public synchronized Object[][] getContents() {
        return b;
    }
}

