/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

public enum av {
    a,
    b,
    c,
    d,
    e;


    public String a() {
        if (this == b) {
            return "0";
        }
        if (this == c) {
            return "7";
        }
        if (this == d) {
            return "8";
        }
        if (this == e) {
            return "13";
        }
        throw new IllegalStateException("Unknown web socket version: " + (Object)((Object)this));
    }
}

