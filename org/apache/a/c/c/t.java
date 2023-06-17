/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.c;

import java.net.URI;
import org.apache.a.c.c.p;

public class t
extends p {
    public static final String a = "TRACE";

    public t() {
    }

    public t(URI uRI) {
        this.a(uRI);
    }

    public t(String string) {
        this.a(URI.create(string));
    }

    public String cL_() {
        return a;
    }
}

