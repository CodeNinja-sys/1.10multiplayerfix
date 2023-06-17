/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f;

import java.io.InputStream;
import org.apache.a.f.n;
import org.apache.a.f.t;

public class a
implements n {
    protected final t a;
    protected final boolean b;

    public a(t t2, boolean bl2) {
        org.apache.a.o.a.a(t2, "Connection");
        this.a = t2;
        this.b = bl2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(InputStream inputStream) {
        try {
            if (this.b) {
                inputStream.close();
                this.a.o();
            }
        }
        finally {
            this.a.cM_();
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean b(InputStream inputStream) {
        try {
            if (this.b) {
                inputStream.close();
                this.a.o();
            }
        }
        finally {
            this.a.cM_();
        }
        return false;
    }

    public boolean c(InputStream inputStream) {
        this.a.cN_();
        return false;
    }
}

