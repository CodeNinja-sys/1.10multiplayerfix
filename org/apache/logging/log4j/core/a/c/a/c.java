/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.c.a;

import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.core.a.c.a.a;
import org.apache.logging.log4j.core.a.c.a.b;

public class c
extends a {
    private final b[] b;
    private final boolean c;

    public c(List list, boolean bl2) {
        this.b = new b[list.size()];
        list.toArray(this.b);
        this.c = bl2;
    }

    @Override
    public void run() {
        try {
            this.a();
        }
        catch (IOException iOException) {
            a.f("Exception during file rollover.", (Throwable)iOException);
        }
    }

    @Override
    public boolean a() {
        if (this.c) {
            for (b b2 : this.b) {
                if (b2.a()) continue;
                return false;
            }
            return true;
        }
        boolean bl2 = true;
        IOException iOException = null;
        for (b b3 : this.b) {
            try {
                bl2 &= b3.a();
            }
            catch (IOException iOException2) {
                bl2 = false;
                if (iOException != null) continue;
                iOException = iOException2;
            }
        }
        if (iOException != null) {
            throw iOException;
        }
        return bl2;
    }
}

