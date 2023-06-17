/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.k;

import java.util.NoSuchElementException;
import org.apache.a.ai;
import org.apache.a.ao;
import org.apache.a.i;
import org.apache.a.o.a;

public class q
implements ao {
    public static final String a = " ,;=()<>@:\\\"/[]?{}\t";
    protected final i b;
    protected String c;
    protected String d;
    protected int e;

    public q(i i2) {
        this.b = (i)org.apache.a.o.a.a(i2, "Header iterator");
        this.e = this.a(-1);
    }

    public boolean hasNext() {
        return this.d != null;
    }

    public String a() {
        if (this.d == null) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        String string = this.d;
        this.e = this.a(this.e);
        return string;
    }

    public final Object next() {
        return this.a();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Removing tokens is not supported.");
    }

    protected int a(int n2) {
        int n3 = n2;
        if (n3 < 0) {
            if (!this.b.hasNext()) {
                return -1;
            }
            this.c = this.b.a().d();
            n3 = 0;
        } else {
            n3 = this.c(n3);
        }
        int n4 = this.b(n3);
        if (n4 < 0) {
            this.d = null;
            return -1;
        }
        int n5 = this.d(n4);
        this.d = this.a(this.c, n4, n5);
        return n5;
    }

    protected String a(String string, int n2, int n3) {
        return string.substring(n2, n3);
    }

    protected int b(int n2) {
        int n3 = org.apache.a.o.a.b(n2, "Search position");
        boolean bl2 = false;
        while (!bl2 && this.c != null) {
            int n4 = this.c.length();
            while (!bl2 && n3 < n4) {
                char c2 = this.c.charAt(n3);
                if (this.a(c2) || this.b(c2)) {
                    ++n3;
                    continue;
                }
                if (this.c(this.c.charAt(n3))) {
                    bl2 = true;
                    continue;
                }
                throw new ai("Invalid character before token (pos " + n3 + "): " + this.c);
            }
            if (bl2) continue;
            if (this.b.hasNext()) {
                this.c = this.b.a().d();
                n3 = 0;
                continue;
            }
            this.c = null;
        }
        return bl2 ? n3 : -1;
    }

    protected int c(int n2) {
        int n3 = org.apache.a.o.a.b(n2, "Search position");
        boolean bl2 = false;
        int n4 = this.c.length();
        while (!bl2 && n3 < n4) {
            char c2 = this.c.charAt(n3);
            if (this.a(c2)) {
                bl2 = true;
                continue;
            }
            if (this.b(c2)) {
                ++n3;
                continue;
            }
            if (this.c(c2)) {
                throw new ai("Tokens without separator (pos " + n3 + "): " + this.c);
            }
            throw new ai("Invalid character after token (pos " + n3 + "): " + this.c);
        }
        return n3;
    }

    protected int d(int n2) {
        int n3;
        org.apache.a.o.a.b(n2, "Search position");
        int n4 = this.c.length();
        for (n3 = n2 + 1; n3 < n4 && this.c(this.c.charAt(n3)); ++n3) {
        }
        return n3;
    }

    protected boolean a(char c2) {
        return c2 == ',';
    }

    protected boolean b(char c2) {
        return c2 == '\t' || Character.isSpaceChar(c2);
    }

    protected boolean c(char c2) {
        if (Character.isLetterOrDigit(c2)) {
            return true;
        }
        if (Character.isISOControl(c2)) {
            return false;
        }
        return !this.d(c2);
    }

    protected boolean d(char c2) {
        return a.indexOf(c2) >= 0;
    }
}

