/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import org.apache.a.f.j;
import org.apache.a.f.m;
import org.apache.a.f.n;
import org.apache.a.f.t;
import org.apache.a.o.a;
import org.apache.a.o.g;

public class b
extends org.apache.a.h.j
implements j,
n {
    protected t a;
    protected final boolean b;

    public b(org.apache.a.n n2, t t2, boolean bl2) {
        super(n2);
        org.apache.a.o.a.a(t2, "Connection");
        this.a = t2;
        this.b = bl2;
    }

    public boolean a() {
        return false;
    }

    public InputStream f() {
        return new m(this.c.f(), this);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void l() {
        if (this.a == null) {
            return;
        }
        try {
            if (this.b) {
                g.b(this.c);
                this.a.o();
            } else {
                this.a.p();
            }
        }
        finally {
            this.k();
        }
    }

    public void h() {
        this.l();
    }

    public void a(OutputStream outputStream) {
        super.a(outputStream);
        this.l();
    }

    public void cM_() {
        this.l();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void cN_() {
        if (this.a != null) {
            try {
                this.a.cN_();
            }
            finally {
                this.a = null;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(InputStream inputStream) {
        try {
            if (this.a != null) {
                if (this.b) {
                    inputStream.close();
                    this.a.o();
                } else {
                    this.a.p();
                }
            }
        }
        finally {
            this.k();
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean b(InputStream inputStream) {
        block7: {
            try {
                if (this.a == null) break block7;
                if (this.b) {
                    boolean bl2 = this.a.c();
                    try {
                        inputStream.close();
                        this.a.o();
                        break block7;
                    }
                    catch (SocketException socketException) {
                        if (bl2) {
                            throw socketException;
                        }
                        break block7;
                    }
                }
                this.a.p();
            }
            finally {
                this.k();
            }
        }
        return false;
    }

    public boolean c(InputStream inputStream) {
        if (this.a != null) {
            this.a.cN_();
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void k() {
        if (this.a != null) {
            try {
                this.a.cM_();
            }
            finally {
                this.a = null;
            }
        }
    }
}

