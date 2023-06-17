/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.a;

import com.ibm.icu.util.aw;
import com.ibm.icu.util.bi;
import com.ibm.icu.util.cp;
import java.util.ListResourceBundle;

public class n
extends ListResourceBundle {
    private static final bi[] a = new bi[]{cp.a, new cp(0, 15, 2, "Martin Luther King Day", 1986), new cp(1, 15, 2, "Presidents' Day", 1976), new cp(1, 22, "Washington's Birthday", 1776, 1975), aw.e, aw.f, new cp(4, 8, 1, "Mother's Day", 1914), new cp(4, 31, -2, "Memorial Day", 1971), new cp(4, 30, "Memorial Day", 1868, 1970), new cp(5, 15, 1, "Father's Day", 1956), new cp(6, 4, "Independence Day", 1776), new cp(8, 1, 2, "Labor Day", 1894), new cp(10, 2, 3, "Election Day"), new cp(9, 8, 2, "Columbus Day", 1971), new cp(9, 31, "Halloween"), new cp(10, 11, "Veterans' Day", 1918), new cp(10, 22, 5, "Thanksgiving", 1863), cp.i};
    private static final Object[][] b = new Object[][]{{"holidays", a}};

    public synchronized Object[][] getContents() {
        return b;
    }
}

