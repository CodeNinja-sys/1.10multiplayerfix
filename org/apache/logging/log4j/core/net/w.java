/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.net;

import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.net.ad;
import org.apache.logging.log4j.core.net.j;

public class w {
    private final j a;
    private final ad b;

    public w(j j2, ad ad2) {
        this.a = j2;
        this.b = ad2;
    }

    public static int a(j j2, b b2) {
        return (j2.a() << 3) + ad.a(b2).a();
    }

    public j a() {
        return this.a;
    }

    public ad b() {
        return this.b;
    }

    public int c() {
        return this.a.a() << 3 + this.b.a();
    }

    public String toString() {
        return Integer.toString(this.c());
    }
}

