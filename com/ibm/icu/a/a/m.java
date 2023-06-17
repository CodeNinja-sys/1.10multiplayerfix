/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.a;

import com.ibm.icu.util.aw;
import com.ibm.icu.util.bi;
import com.ibm.icu.util.cp;
import java.util.ListResourceBundle;

public class m
extends ListResourceBundle {
    private static final bi[] a = new bi[]{cp.a, cp.c, new cp(4, 31, -2, "Spring Holiday"), new cp(7, 31, -2, "Summer Bank Holiday"), cp.i, cp.j, new cp(11, 31, -2, "Christmas Holiday"), aw.e, aw.f, aw.g};
    private static final Object[][] b = new Object[][]{{"holidays", a}, {"Labor Day", "Labour Day"}};

    public synchronized Object[][] getContents() {
        return b;
    }
}

