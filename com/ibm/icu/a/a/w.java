/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.a;

import com.ibm.icu.util.bh;
import com.ibm.icu.util.bi;
import java.util.ListResourceBundle;

public class w
extends ListResourceBundle {
    private static final bi[] a = new bi[]{bh.a, bh.c, bh.h, bh.l, bh.n, bh.u, bh.x};
    private static final Object[][] b = new Object[][]{{"holidays", a}};

    public synchronized Object[][] getContents() {
        return b;
    }
}

