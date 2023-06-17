/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.a;

import com.ibm.icu.util.aw;
import com.ibm.icu.util.bi;
import com.ibm.icu.util.cp;
import java.util.ListResourceBundle;

public class g
extends ListResourceBundle {
    private static final bi[] a = new bi[]{cp.a, cp.b, aw.e, aw.f, aw.g, aw.h, aw.j, aw.k, aw.l, cp.d, cp.e, cp.g, cp.i, cp.k, new cp(4, 1, 0, "National Holiday"), new cp(9, 31, -2, "National Holiday")};
    private static final Object[][] b = new Object[][]{{"holidays", a}, {"Christmas", "Christtag"}, {"New Year's Day", "Neujahrstag"}};

    public synchronized Object[][] getContents() {
        return b;
    }
}

