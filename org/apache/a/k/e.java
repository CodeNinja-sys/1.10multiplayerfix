/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.k;

import java.util.NoSuchElementException;
import org.apache.a.f;
import org.apache.a.i;
import org.apache.a.o.a;

public class e
implements i {
    protected final f[] a;
    protected int b;
    protected String c;

    public e(f[] arrf, String string) {
        this.a = (f[])org.apache.a.o.a.a(arrf, "Header array");
        this.c = string;
        this.b = this.a(-1);
    }

    protected int a(int n2) {
        int n3 = n2;
        if (n3 < -1) {
            return -1;
        }
        int n4 = this.a.length - 1;
        boolean bl2 = false;
        while (!bl2 && n3 < n4) {
            bl2 = this.b(++n3);
        }
        return bl2 ? n3 : -1;
    }

    protected boolean b(int n2) {
        return this.c == null || this.c.equalsIgnoreCase(this.a[n2].c());
    }

    public boolean hasNext() {
        return this.b >= 0;
    }

    public f a() {
        int n2 = this.b;
        if (n2 < 0) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.b = this.a(n2);
        return this.a[n2];
    }

    public final Object next() {
        return this.a();
    }

    public void remove() {
        throw new UnsupportedOperationException("Removing headers is not supported.");
    }
}

