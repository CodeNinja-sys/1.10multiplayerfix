/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.ax;
import com.ibm.icu.util.bi;

public class aw
extends bi {
    public static final aw a = new aw(-48, "Shrove Tuesday");
    public static final aw b = new aw(-47, "Ash Wednesday");
    public static final aw c = new aw(-7, "Palm Sunday");
    public static final aw d = new aw(-3, "Maundy Thursday");
    public static final aw e = new aw(-2, "Good Friday");
    public static final aw f = new aw(0, "Easter Sunday");
    public static final aw g = new aw(1, "Easter Monday");
    public static final aw h = new aw(39, "Ascension");
    public static final aw i = new aw(49, "Pentecost");
    public static final aw j = new aw(49, "Whit Sunday");
    public static final aw k = new aw(50, "Whit Monday");
    public static final aw l = new aw(60, "Corpus Christi");

    public aw(String string) {
        super(string, new ax(0, false));
    }

    public aw(int n2, String string) {
        super(string, new ax(n2, false));
    }

    public aw(int n2, boolean bl2, String string) {
        super(string, new ax(n2, bl2));
    }
}

