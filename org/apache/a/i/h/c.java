/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.h;

import java.io.IOException;
import org.apache.a.j;
import org.apache.a.m.i;
import org.apache.a.r;

public class c
extends i {
    public c(String string, r r2, j j2) {
        super(string, r2, j2);
    }

    public void f() {
        try {
            ((j)this.i()).close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public boolean e() {
        return !((j)this.i()).c();
    }
}

