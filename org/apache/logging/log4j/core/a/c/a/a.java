/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.c.a;

import java.io.IOException;
import org.apache.logging.log4j.core.a.c.a.b;
import org.apache.logging.log4j.d;

public abstract class a
implements b {
    protected static final d a = org.apache.logging.log4j.d.d.k();
    private boolean b = false;
    private boolean c = false;

    protected a() {
    }

    @Override
    public abstract boolean a();

    @Override
    public synchronized void run() {
        if (!this.c) {
            try {
                this.a();
            }
            catch (IOException iOException) {
                this.a(iOException);
            }
            this.b = true;
            this.c = true;
        }
    }

    @Override
    public synchronized void b() {
        this.c = true;
    }

    @Override
    public boolean c() {
        return this.b;
    }

    protected void a(Exception exception) {
    }
}

