/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.c;

import java.io.InputStream;
import org.apache.commons.b.c.j;
import org.apache.commons.b.c.o;

public class a
extends o {
    public a(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public void close() {
        this.in.close();
        this.in = new j();
    }

    @Override
    protected void a(int n2) {
        if (n2 == -1) {
            this.close();
        }
    }

    protected void finalize() {
        this.close();
        super.finalize();
    }
}

