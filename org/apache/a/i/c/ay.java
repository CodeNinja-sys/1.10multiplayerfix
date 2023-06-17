/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.net.Proxy;

class ay {
    static final /* synthetic */ int[] a;

    static {
        a = new int[Proxy.Type.values().length];
        try {
            ay.a[Proxy.Type.DIRECT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ay.a[Proxy.Type.HTTP.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ay.a[Proxy.Type.SOCKS.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

