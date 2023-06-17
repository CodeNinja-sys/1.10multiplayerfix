/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.c;

import java.net.URI;
import org.apache.a.c.c.h;

public class n
extends h {
    public static final String a = "POST";

    public n() {
    }

    public n(URI uRI) {
        this.a(uRI);
    }

    public n(String string) {
        this.a(URI.create(string));
    }

    public String cL_() {
        return a;
    }
}

