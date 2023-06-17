/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c;

import javax.net.ssl.SSLEngineResult;

class y {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;

    static {
        b = new int[SSLEngineResult.Status.values().length];
        try {
            y.b[SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        a = new int[SSLEngineResult.HandshakeStatus.values().length];
        try {
            y.a[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            y.a[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            y.a[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            y.a[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            y.a[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

