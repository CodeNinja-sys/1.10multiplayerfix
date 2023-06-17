/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.logging.log4j.core.a.b;
import org.apache.logging.log4j.core.a.d;
import org.apache.logging.log4j.core.a.x;
import org.apache.logging.log4j.core.f;

public class y
extends b {
    private volatile OutputStream c;
    private final byte[] d;
    private final byte[] e;

    protected y(OutputStream outputStream, String string, f f2) {
        super(string);
        this.c = outputStream;
        if (f2 != null) {
            this.d = f2.a();
            this.e = f2.b();
            if (this.e != null) {
                try {
                    this.c.write(this.e, 0, this.e.length);
                }
                catch (IOException iOException) {
                    a.b("Unable to write header", (Throwable)iOException);
                }
            }
        } else {
            this.d = null;
            this.e = null;
        }
    }

    public static y a(String string, Object object, x x2) {
        return (y)org.apache.logging.log4j.core.a.b.a(string, x2, object);
    }

    @Override
    public void a() {
        if (this.d != null) {
            this.a(this.d);
        }
        this.k();
    }

    public boolean i() {
        return this.b() > 0;
    }

    protected OutputStream j() {
        return this.c;
    }

    protected void a(OutputStream outputStream) {
        if (this.e != null) {
            try {
                outputStream.write(this.e, 0, this.e.length);
                this.c = outputStream;
            }
            catch (IOException iOException) {
                a.b("Unable to write header", (Throwable)iOException);
            }
        } else {
            this.c = outputStream;
        }
    }

    protected synchronized void a(byte[] arrby, int n2, int n3) {
        try {
            this.c.write(arrby, n2, n3);
        }
        catch (IOException iOException) {
            String string = "Error writing to stream " + this.d();
            throw new d(string, iOException);
        }
    }

    protected void a(byte[] arrby) {
        this.a(arrby, 0, arrby.length);
    }

    protected synchronized void k() {
        OutputStream outputStream = this.c;
        if (outputStream == System.out || outputStream == System.err) {
            return;
        }
        try {
            outputStream.close();
        }
        catch (IOException iOException) {
            a.b("Unable to close stream " + this.d() + ". " + iOException);
        }
    }

    public synchronized void l() {
        try {
            this.c.flush();
        }
        catch (IOException iOException) {
            String string = "Error flushing stream " + this.d();
            throw new d(string, iOException);
        }
    }
}

