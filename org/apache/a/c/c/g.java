/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.c;

import java.net.URI;
import org.apache.a.c.c.p;

public class g
extends p {
    public static final String a = "DELETE";

    public g() {
    }

    public g(URI uRI) {
        this.a(uRI);
    }

    public g(String string) {
        this.a(URI.create(string));
    }

    public String cL_() {
        return a;
    }
}

