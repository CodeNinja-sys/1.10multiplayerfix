/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import org.apache.a.o.a;

public class r
extends InetSocketAddress {
    private static final long a = -6650701828361907957L;
    private final org.apache.a.r b;

    public r(org.apache.a.r r2, InetAddress inetAddress, int n2) {
        super(inetAddress, n2);
        org.apache.a.o.a.a(r2, "HTTP host");
        this.b = r2;
    }

    public org.apache.a.r a() {
        return this.b;
    }

    public String toString() {
        return this.b.a() + ":" + this.getPort();
    }
}

