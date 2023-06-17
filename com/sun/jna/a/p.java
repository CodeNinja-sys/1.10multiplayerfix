/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import java.awt.Rectangle;
import java.util.Comparator;

class p
implements Comparator {
    p() {
    }

    public int compare(Object object, Object object2) {
        return ((Rectangle)object).x - ((Rectangle)object2).x;
    }
}

