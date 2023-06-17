/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.c;

import java.net.URI;
import org.apache.a.c.c.p;

public class k
extends p {
    public static final String a = "HEAD";

    public k() {
    }

    public k(URI uRI) {
        this.a(uRI);
    }

    public k(String string) {
        this.a(URI.create(string));
    }

    public String cL_() {
        return a;
    }
}

