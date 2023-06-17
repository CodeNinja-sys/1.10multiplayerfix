/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.h;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.a.h.a;
import org.apache.a.h.f;

public class h
extends a {
    private final f e;

    public h(f f2) {
        this.e = (f)org.apache.a.o.a.a(f2, "Content producer");
    }

    public long c() {
        return -1L;
    }

    public InputStream f() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.a(byteArrayOutputStream);
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    public boolean a() {
        return true;
    }

    public void a(OutputStream outputStream) {
        org.apache.a.o.a.a(outputStream, "Output stream");
        this.e.a(outputStream);
    }

    public boolean g() {
        return false;
    }
}

