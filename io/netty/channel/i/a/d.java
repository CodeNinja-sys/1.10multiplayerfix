/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.barchart.udt.StatusUDT
 */
package io.netty.channel.i.a;

import com.barchart.udt.StatusUDT;

class d {
    static final /* synthetic */ int[] a;

    static {
        a = new int[StatusUDT.values().length];
        try {
            d.a[StatusUDT.INIT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            d.a[StatusUDT.OPENED.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

