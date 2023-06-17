/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.a;

import java.util.ArrayList;
import java.util.List;

public class g {
    private final List a = new ArrayList();
    private final List b = new ArrayList();
    private final List c = new ArrayList();

    void a(String string) {
        this.c.add(string);
    }

    void b(String string) {
        this.b.add(string);
    }

    void c(String string) {
        this.a.add(string);
    }

    public List a() {
        return this.a;
    }

    public List b() {
        return this.b;
    }

    public List c() {
        return this.c;
    }

    boolean d(String string) {
        return this.a.contains(string) || this.b.contains(string);
    }
}

