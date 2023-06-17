/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.h;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.a.h.a;
import org.apache.a.h.g;

public class d
extends a
implements Cloneable {
    protected final byte[] e;
    private final byte[] f;
    private final int g;
    private final int h;

    public d(byte[] arrby, g g2) {
        org.apache.a.o.a.a(arrby, "Source byte array");
        this.e = arrby;
        this.f = arrby;
        this.g = 0;
        this.h = this.f.length;
        if (g2 != null) {
            this.a(g2.toString());
        }
    }

    public d(byte[] arrby, int n2, int n3, g g2) {
        org.apache.a.o.a.a(arrby, "Source byte array");
        if (n2 < 0 || n2 > arrby.length || n3 < 0 || n2 + n3 < 0 || n2 + n3 > arrby.length) {
            throw new IndexOutOfBoundsException("off: " + n2 + " len: " + n3 + " b.length: " + arrby.length);
        }
        this.e = arrby;
        this.f = arrby;
        this.g = n2;
        this.h = n3;
        if (g2 != null) {
            this.a(g2.toString());
        }
    }

    public d(byte[] arrby) {
        this(arrby, null);
    }

    public d(byte[] arrby, int n2, int n3) {
        this(arrby, n2, n3, null);
    }

    public boolean a() {
        return true;
    }

    public long c() {
        return this.h;
    }

    public InputStream f() {
        return new ByteArrayInputStream(this.f, this.g, this.h);
    }

    public void a(OutputStream outputStream) {
        org.apache.a.o.a.a(outputStream, "Output stream");
        outputStream.write(this.f, this.g, this.h);
        outputStream.flush();
    }

    public boolean g() {
        return false;
    }

    public Object clone() {
        return super.clone();
    }
}

