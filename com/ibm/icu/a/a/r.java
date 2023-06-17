/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.a;

import com.ibm.icu.util.aw;
import com.ibm.icu.util.bi;
import com.ibm.icu.util.cp;
import java.util.ListResourceBundle;

public class r
extends ListResourceBundle {
    private static final bi[] a = new bi[]{new cp(0, 1, 0, "New Year's Day"), new cp(4, 19, 0, "Victoria Day"), new cp(5, 24, 0, "National Day"), new cp(6, 1, 0, "Canada Day"), new cp(7, 1, 2, "Civic Holiday"), new cp(8, 1, 2, "Labour Day"), new cp(9, 8, 2, "Thanksgiving"), new cp(10, 11, 0, "Remembrance Day"), cp.i, cp.j, cp.l, aw.e, aw.f, aw.g};
    private static final Object[][] b = new Object[][]{{"holidays", a}};

    public synchronized Object[][] getContents() {
        return b;
    }
}

