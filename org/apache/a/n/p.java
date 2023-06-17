/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.n;

import java.util.Map;
import org.apache.a.n.ai;
import org.apache.a.n.n;
import org.apache.a.n.q;
import org.apache.a.o.a;

public class p
implements q {
    private final ai a = new ai();

    public void a(String string, n n2) {
        org.apache.a.o.a.a((Object)string, "URI request pattern");
        org.apache.a.o.a.a(n2, "Request handler");
        this.a.a(string, n2);
    }

    public void a(String string) {
        this.a.a(string);
    }

    public void a(Map map) {
        this.a.b(map);
    }

    public Map a() {
        return this.a.a();
    }

    public n b(String string) {
        return (n)this.a.b(string);
    }
}

