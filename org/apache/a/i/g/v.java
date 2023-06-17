/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.g;

import java.io.InputStream;
import org.apache.a.j.a;
import org.apache.a.j.h;

public class v
extends InputStream {
    private final h a;
    private boolean b = false;

    public v(h h2) {
        this.a = (h)org.apache.a.o.a.a(h2, "Session input buffer");
    }

    public int available() {
        if (this.a instanceof a) {
            return ((a)((Object)this.a)).g();
        }
        return 0;
    }

    public void close() {
        this.b = true;
    }

    public int read() {
        if (this.b) {
            return -1;
        }
        return this.a.a();
    }

    public int read(byte[] arrby, int n2, int n3) {
        if (this.b) {
            return -1;
        }
        return this.a.a(arrby, n2, n3);
    }
}

