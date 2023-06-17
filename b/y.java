/*
 * Decompiled with CFR 0.150.
 */
package b;

import b.a;
import b.aa;
import b.ab;
import b.b;
import b.k;
import b.r;
import b.z;
import java.util.NoSuchElementException;

class y {
    private static final char a = '+';
    private static final char b = '*';
    private String c;
    private int d;

    y(String string) {
        if (string == null) {
            throw new NullPointerException("null option specification");
        }
        this.c = string;
    }

    boolean a() {
        return this.d < this.c.length();
    }

    a b() {
        a a2;
        if (!this.a()) {
            throw new NoSuchElementException();
        }
        String string = String.valueOf(this.c.charAt(this.d));
        ++this.d;
        if ("W".equals(string) && (a2 = this.c()) != null) {
            return a2;
        }
        aa.d(string);
        if (this.a()) {
            boolean bl2 = false;
            if (this.c.charAt(this.d) == '*') {
                bl2 = true;
                ++this.d;
            }
            a a3 = a2 = this.a() && this.c.charAt(this.d) == ':' ? this.a(string) : new k(string);
            if (bl2) {
                a2.c();
            }
        } else {
            a2 = new k(string);
        }
        return a2;
    }

    void a(r r2) {
        this.b(r2);
        while (this.a()) {
            r2.a(this.b());
        }
    }

    private void b(r r2) {
        if ('+' == this.c.charAt(0)) {
            r2.a(true);
            this.c = this.c.substring(1);
        }
    }

    private a c() {
        if (!this.a()) {
            return new k("W");
        }
        if (this.c.charAt(this.d) == ';') {
            ++this.d;
            return new b();
        }
        return null;
    }

    private a a(String string) {
        ++this.d;
        if (this.a() && this.c.charAt(this.d) == ':') {
            ++this.d;
            return new z(string);
        }
        return new ab(string);
    }
}

