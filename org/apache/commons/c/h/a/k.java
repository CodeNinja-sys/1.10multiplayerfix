/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h.a;

import java.io.Writer;
import org.apache.commons.c.h.a.c;

public class k
extends c {
    private final int a;
    private final int b;
    private final boolean c;

    public k() {
        this(0, Integer.MAX_VALUE, true);
    }

    protected k(int n2, int n3, boolean bl2) {
        this.a = n2;
        this.b = n3;
        this.c = bl2;
    }

    public static k e(int n2) {
        return k.c(n2, Integer.MAX_VALUE);
    }

    public static k f(int n2) {
        return k.c(0, n2);
    }

    public static k c(int n2, int n3) {
        return new k(n2, n3, false);
    }

    public static k d(int n2, int n3) {
        return new k(n2, n3, true);
    }

    @Override
    public boolean a(int n2, Writer writer) {
        if (this.c ? n2 < this.a || n2 > this.b : n2 >= this.a && n2 <= this.b) {
            return false;
        }
        if (n2 > 65535) {
            writer.write(this.d(n2));
        } else if (n2 > 4095) {
            writer.write("\\u" + k.a(n2));
        } else if (n2 > 255) {
            writer.write("\\u0" + k.a(n2));
        } else if (n2 > 15) {
            writer.write("\\u00" + k.a(n2));
        } else {
            writer.write("\\u000" + k.a(n2));
        }
        return true;
    }

    protected String d(int n2) {
        return "\\u" + k.a(n2);
    }
}

