/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.a;

import com.ibm.icu.util.aw;
import com.ibm.icu.util.bi;
import com.ibm.icu.util.cp;
import java.util.ListResourceBundle;

public class h
extends ListResourceBundle {
    private static final bi[] a = new bi[]{cp.a, cp.c, new cp(5, 15, 4, "Memorial Day"), new cp(9, 3, 0, "Unity Day"), cp.e, new cp(10, 18, 0, "Day of Prayer and Repentance"), cp.i, cp.j, aw.e, aw.f, aw.g, aw.h, aw.j, aw.k};
    private static final Object[][] b = new Object[][]{{"holidays", a}};

    public synchronized Object[][] getContents() {
        return b;
    }
}

