/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.a;

import com.ibm.icu.util.bi;
import com.ibm.icu.util.cp;
import java.util.ListResourceBundle;

public class l
extends ListResourceBundle {
    private static final bi[] a = new bi[]{cp.a, new cp(4, 19, 0, "Victoria Day"), new cp(6, 1, 0, "Canada Day"), new cp(7, 1, 2, "Civic Holiday"), new cp(8, 1, 2, "Labor Day"), new cp(9, 8, 2, "Thanksgiving"), new cp(10, 11, 0, "Remembrance Day"), cp.i, cp.j, cp.l};
    private static final Object[][] b = new Object[][]{{"holidays", a}, {"Labor Day", "Labour Day"}};

    public synchronized Object[][] getContents() {
        return b;
    }
}

