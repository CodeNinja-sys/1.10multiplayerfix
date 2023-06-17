/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.barchart.udt.TypeUDT
 *  com.barchart.udt.nio.KindUDT
 */
package io.netty.channel.i.a;

import com.barchart.udt.TypeUDT;
import com.barchart.udt.nio.KindUDT;

class k {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;

    static {
        b = new int[KindUDT.values().length];
        try {
            k.b[KindUDT.ACCEPTOR.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            k.b[KindUDT.CONNECTOR.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            k.b[KindUDT.RENDEZVOUS.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        a = new int[TypeUDT.values().length];
        try {
            k.a[TypeUDT.DATAGRAM.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            k.a[TypeUDT.STREAM.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

