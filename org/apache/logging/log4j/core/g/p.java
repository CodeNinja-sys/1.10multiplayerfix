/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.g;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.core.g.a;
import org.apache.logging.log4j.core.g.q;
import org.apache.logging.log4j.core.h;

public final class p
extends a {
    private static byte[] d;

    private p() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public byte[] a(h h2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            q q2 = new q(this, byteArrayOutputStream);
            try {
                q2.writeObject(h2);
                q2.reset();
            }
            finally {
                q2.close();
            }
        }
        catch (IOException iOException) {
            a.b("Serialization of LogEvent failed.", (Throwable)iOException);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public h c(h h2) {
        return h2;
    }

    public static p e() {
        return new p();
    }

    @Override
    public byte[] b() {
        return d;
    }

    @Override
    public Map d() {
        return new HashMap();
    }

    @Override
    public String c() {
        return "application/octet-stream";
    }

    @Override
    public /* synthetic */ Serializable b(h h2) {
        return this.c(h2);
    }

    static {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.close();
            d = byteArrayOutputStream.toByteArray();
        }
        catch (Exception exception) {
            a.b("Unable to generate Object stream header", (Throwable)exception);
        }
    }
}

