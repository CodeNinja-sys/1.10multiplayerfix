/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.h;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import org.apache.a.h.a;

public class l
extends a {
    private byte[] e;
    private Serializable f;

    public l(Serializable serializable, boolean bl2) {
        org.apache.a.o.a.a(serializable, "Source object");
        if (bl2) {
            this.a(serializable);
        } else {
            this.f = serializable;
        }
    }

    public l(Serializable serializable) {
        org.apache.a.o.a.a(serializable, "Source object");
        this.f = serializable;
    }

    private void a(Serializable serializable) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(serializable);
        objectOutputStream.flush();
        this.e = byteArrayOutputStream.toByteArray();
    }

    public InputStream f() {
        if (this.e == null) {
            this.a(this.f);
        }
        return new ByteArrayInputStream(this.e);
    }

    public long c() {
        if (this.e == null) {
            return -1L;
        }
        return this.e.length;
    }

    public boolean a() {
        return true;
    }

    public boolean g() {
        return this.e == null;
    }

    public void a(OutputStream outputStream) {
        org.apache.a.o.a.a(outputStream, "Output stream");
        if (this.e == null) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(this.f);
            objectOutputStream.flush();
        } else {
            outputStream.write(this.e);
            outputStream.flush();
        }
    }
}

