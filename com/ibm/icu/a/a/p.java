/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.a;

import com.ibm.icu.util.bi;
import com.ibm.icu.util.cp;
import java.util.ListResourceBundle;

public class p
extends ListResourceBundle {
    private static final bi[] a = new bi[]{cp.a, new cp(1, 5, 0, "Constitution Day"), new cp(2, 21, 0, "Benito Ju\u00e1rez Day"), cp.c, new cp(4, 5, 0, "Cinco de Mayo"), new cp(5, 1, 0, "Navy Day"), new cp(8, 16, 0, "Independence Day"), new cp(9, 12, 0, "D\u00eda de la Raza"), cp.e, new cp(10, 2, 0, "Day of the Dead"), new cp(10, 20, 0, "Revolution Day"), new cp(11, 12, 0, "Flag Day"), cp.i};
    private static final Object[][] b = new Object[][]{{"holidays", a}};

    public synchronized Object[][] getContents() {
        return b;
    }
}

