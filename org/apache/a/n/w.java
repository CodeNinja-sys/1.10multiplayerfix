/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.n;

import org.apache.a.n.g;
import org.apache.a.o.a;
import org.apache.a.u;

public class w
implements org.apache.a.w {
    public void a(u u2, g g2) {
        a.a(u2, "HTTP request");
        String string = u2.g().a();
        if (string.equalsIgnoreCase("CONNECT")) {
            return;
        }
        if (!u2.a("Connection")) {
            u2.a("Connection", "Keep-Alive");
        }
    }
}

