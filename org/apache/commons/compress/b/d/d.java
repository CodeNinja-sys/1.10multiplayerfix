/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b.d;

import java.io.OutputStream;
import java.util.Map;
import java.util.jar.JarInputStream;
import java.util.jar.Pack200;
import org.apache.commons.compress.b.c;
import org.apache.commons.compress.b.d.e;
import org.apache.commons.compress.b.d.i;

public class d
extends c {
    private boolean a = false;
    private final OutputStream b;
    private final i c;
    private final Map d;

    public d(OutputStream outputStream) {
        this(outputStream, e.a);
    }

    public d(OutputStream outputStream, e e2) {
        this(outputStream, e2, null);
    }

    public d(OutputStream outputStream, Map map) {
        this(outputStream, e.a, map);
    }

    public d(OutputStream outputStream, e e2, Map map) {
        this.b = outputStream;
        this.c = e2.a();
        this.d = map;
    }

    public void write(int n2) {
        this.c.write(n2);
    }

    public void write(byte[] arrby) {
        this.c.write(arrby);
    }

    public void write(byte[] arrby, int n2, int n3) {
        this.c.write(arrby, n2, n3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void close() {
        this.a();
        try {
            this.c.c();
        }
        finally {
            this.b.close();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a() {
        if (this.a) return;
        this.a = true;
        Pack200.Packer packer = Pack200.newPacker();
        if (this.d != null) {
            packer.properties().putAll(this.d);
        }
        JarInputStream jarInputStream = null;
        boolean bl2 = false;
        try {
            jarInputStream = new JarInputStream(this.c.b());
            packer.pack(jarInputStream, this.b);
            return;
        }
        catch (Throwable throwable) {
            if (bl2) throw throwable;
            org.apache.commons.compress.c.i.a(jarInputStream);
            throw throwable;
        }
    }
}

