/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.c;

import java.net.URI;
import org.apache.a.c.c.p;

public class j
extends p {
    public static final String a = "GET";

    public j() {
    }

    public j(URI uRI) {
        this.a(uRI);
    }

    public j(String string) {
        this.a(URI.create(string));
    }

    public String cL_() {
        return a;
    }
}

