/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.h;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.a.h.j;
import org.apache.a.n;
import org.apache.a.o.a;
import org.apache.a.o.g;

public class c
extends j {
    private final byte[] a;

    public c(n n2) {
        super(n2);
        this.a = (byte[])(!n2.a() || n2.c() < 0L ? g.c(n2) : null);
    }

    public long c() {
        if (this.a != null) {
            return this.a.length;
        }
        return super.c();
    }

    public InputStream f() {
        if (this.a != null) {
            return new ByteArrayInputStream(this.a);
        }
        return super.f();
    }

    public boolean b() {
        return this.a == null && super.b();
    }

    public boolean a() {
        return true;
    }

    public void a(OutputStream outputStream) {
        org.apache.a.o.a.a(outputStream, "Output stream");
        if (this.a != null) {
            outputStream.write(this.a);
        } else {
            super.a(outputStream);
        }
    }

    public boolean g() {
        return this.a == null && super.g();
    }
}

