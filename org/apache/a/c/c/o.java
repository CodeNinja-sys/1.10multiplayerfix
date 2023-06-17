/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.c;

import java.net.URI;
import org.apache.a.c.c.h;

public class o
extends h {
    public static final String a = "PUT";

    public o() {
    }

    public o(URI uRI) {
        this.a(uRI);
    }

    public o(String string) {
        this.a(URI.create(string));
    }

    public String cL_() {
        return a;
    }
}

