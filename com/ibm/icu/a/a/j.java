/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.a;

import com.ibm.icu.util.aw;
import com.ibm.icu.util.bi;
import com.ibm.icu.util.cp;
import java.util.ListResourceBundle;

public class j
extends ListResourceBundle {
    private static final bi[] a = new bi[]{cp.a, cp.b, new cp(2, 25, 0, "Independence Day"), cp.c, cp.d, new cp(9, 28, 0, "Ochi Day"), cp.i, cp.j, new aw(-2, true, "Good Friday"), new aw(0, true, "Easter Sunday"), new aw(1, true, "Easter Monday"), new aw(50, true, "Whit Monday")};
    private static final Object[][] b = new Object[][]{{"holidays", a}};

    public synchronized Object[][] getContents() {
        return b;
    }
}

