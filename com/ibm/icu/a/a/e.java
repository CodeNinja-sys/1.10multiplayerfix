/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.a;

import com.ibm.icu.util.aw;
import com.ibm.icu.util.bi;
import com.ibm.icu.util.cp;
import java.util.ListResourceBundle;

public class e
extends ListResourceBundle {
    private static final bi[] a = new bi[]{cp.a, new cp(3, 30, -6, "General Prayer Day"), new cp(5, 5, "Constitution Day"), cp.h, cp.i, cp.j, cp.l, aw.d, aw.e, aw.f, aw.g, aw.h, aw.k};
    private static final Object[][] b = new Object[][]{{"holidays", a}};

    public synchronized Object[][] getContents() {
        return b;
    }
}

