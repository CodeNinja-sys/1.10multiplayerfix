/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.n;

import org.apache.a.n.g;
import org.apache.a.o.a;
import org.apache.a.x;
import org.apache.a.z;

public class af
implements z {
    private final String a;

    public af(String string) {
        this.a = string;
    }

    public af() {
        this(null);
    }

    public void a(x x2, g g2) {
        org.apache.a.o.a.a(x2, "HTTP response");
        if (!x2.a("Server") && this.a != null) {
            x2.a("Server", this.a);
        }
    }
}

