/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.n;

import org.apache.a.n.ai;
import org.apache.a.n.n;
import org.apache.a.n.o;
import org.apache.a.o.a;
import org.apache.a.u;

public class ah
implements o {
    private final ai a;

    protected ah(ai ai2) {
        this.a = (ai)org.apache.a.o.a.a(ai2, "Pattern matcher");
    }

    public ah() {
        this(new ai());
    }

    public void a(String string, n n2) {
        org.apache.a.o.a.a((Object)string, "Pattern");
        org.apache.a.o.a.a(n2, "Handler");
        this.a.a(string, n2);
    }

    public void a(String string) {
        this.a.a(string);
    }

    protected String b(u u2) {
        String string = u2.g().c();
        int n2 = string.indexOf("?");
        if (n2 != -1) {
            string = string.substring(0, n2);
        } else {
            n2 = string.indexOf("#");
            if (n2 != -1) {
                string = string.substring(0, n2);
            }
        }
        return string;
    }

    public n a(u u2) {
        org.apache.a.o.a.a(u2, "HTTP request");
        return (n)this.a.b(this.b(u2));
    }
}

