/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.f;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import org.apache.a.f.m;
import org.apache.a.h.j;
import org.apache.a.i.f.c;
import org.apache.a.n;

class k
extends j
implements org.apache.a.f.n {
    private final c a;

    public k(n n2, c c2) {
        super(n2);
        this.a = c2;
    }

    private void j() {
        if (this.a != null) {
            this.a.cN_();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void i() {
        if (this.a != null) {
            try {
                if (this.a.b()) {
                    this.a.cM_();
                }
            }
            finally {
                this.j();
            }
        }
    }

    public boolean a() {
        return false;
    }

    public InputStream f() {
        return new m(this.c.f(), this);
    }

    public void h() {
        this.i();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(OutputStream outputStream) {
        try {
            this.c.a(outputStream);
            this.i();
        }
        finally {
            this.j();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(InputStream inputStream) {
        try {
            inputStream.close();
            this.i();
        }
        finally {
            this.j();
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean b(InputStream inputStream) {
        try {
            boolean bl2 = this.a != null && !this.a.e();
            try {
                inputStream.close();
                this.i();
            }
            catch (SocketException socketException) {
                if (bl2) {
                    throw socketException;
                }
            }
        }
        finally {
            this.j();
        }
        return false;
    }

    public boolean c(InputStream inputStream) {
        this.j();
        return false;
    }
}

