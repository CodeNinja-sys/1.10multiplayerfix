/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.c;

import java.net.URI;
import org.apache.a.c.c.h;

public class m
extends h {
    public static final String a = "PATCH";

    public m() {
    }

    public m(URI uRI) {
        this.a(uRI);
    }

    public m(String string) {
        this.a(URI.create(string));
    }

    public String cL_() {
        return a;
    }
}

