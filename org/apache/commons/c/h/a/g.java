/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h.a;

import java.io.Writer;
import org.apache.commons.c.h.a.c;

public class g
extends c {
    private final int a;
    private final int b;
    private final boolean c;

    private g(int n2, int n3, boolean bl2) {
        this.a = n2;
        this.b = n3;
        this.c = bl2;
    }

    public g() {
        this(0, Integer.MAX_VALUE, true);
    }

    public static g b(int n2) {
        return g.b(n2, Integer.MAX_VALUE);
    }

    public static g c(int n2) {
        return g.b(0, n2);
    }

    public static g a(int n2, int n3) {
        return new g(n2, n3, true);
    }

    public static g b(int n2, int n3) {
        return new g(n2, n3, false);
    }

    @Override
    public boolean a(int n2, Writer writer) {
        if (this.c ? n2 < this.a || n2 > this.b : n2 >= this.a && n2 <= this.b) {
            return false;
        }
        writer.write("&#");
        writer.write(Integer.toString(n2, 10));
        writer.write(59);
        return true;
    }
}

