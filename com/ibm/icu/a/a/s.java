/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.a;

import com.ibm.icu.util.aw;
import com.ibm.icu.util.bi;
import com.ibm.icu.util.cp;
import java.util.ListResourceBundle;

public class s
extends ListResourceBundle {
    private static final bi[] a = new bi[]{cp.a, new cp(4, 1, 0, "Labor Day"), new cp(4, 8, 0, "Victory Day"), new cp(6, 14, 0, "Bastille Day"), cp.d, cp.e, new cp(10, 11, 0, "Armistice Day"), cp.i, aw.f, aw.g, aw.h, aw.j, aw.k};
    private static final Object[][] b = new Object[][]{{"holidays", a}};

    public synchronized Object[][] getContents() {
        return b;
    }
}

