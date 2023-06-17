/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.d;

import java.io.PrintStream;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.d.c;

public class a
implements c {
    private static final String a = "org.apache.logging.log4j.StatusLevel";
    private b b = org.apache.logging.log4j.b.b;
    private String[] c = null;
    private final PrintStream d;

    public a() {
        String string = org.apache.logging.log4j.e.b.a().a(a);
        if (string != null) {
            this.b = org.apache.logging.log4j.b.a(string, org.apache.logging.log4j.b.b);
        }
        this.d = System.out;
    }

    public a(b b2) {
        this.b = b2;
        this.d = System.out;
    }

    public a(b b2, PrintStream printStream) {
        this.b = b2;
        this.d = printStream;
    }

    public void a(b b2) {
        this.b = b2;
    }

    @Override
    public b d() {
        return this.b;
    }

    @Override
    public void a(org.apache.logging.log4j.d.b b2) {
        if (!this.b(b2)) {
            this.d.println(b2.f());
        }
    }

    public void a(String ... arrstring) {
        this.c = arrstring;
    }

    private boolean b(org.apache.logging.log4j.d.b b2) {
        if (this.c == null) {
            return false;
        }
        String string = b2.b().getClassName();
        for (String string2 : this.c) {
            if (!string.startsWith(string2)) continue;
            return true;
        }
        return false;
    }
}

