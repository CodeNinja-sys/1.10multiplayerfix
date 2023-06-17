/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.core.a.ad;
import org.apache.logging.log4j.core.a.ae;
import org.apache.logging.log4j.core.a.d;
import org.apache.logging.log4j.core.a.y;
import org.apache.logging.log4j.core.f;

public class aa
extends y {
    static final int c = 262144;
    private static final ae d = new ae(null);
    private final boolean e;
    private final String f;
    private final RandomAccessFile g;
    private final ByteBuffer h;
    private final ThreadLocal i = new ThreadLocal();

    protected aa(RandomAccessFile randomAccessFile, String string, OutputStream outputStream, boolean bl2, String string2, f f2) {
        super(outputStream, string, f2);
        this.e = bl2;
        this.g = randomAccessFile;
        this.f = string2;
        this.i.set(Boolean.FALSE);
        this.h = ByteBuffer.allocate(262144);
    }

    public static aa a(String string, boolean bl2, boolean bl3, String string2, f f2) {
        return (aa)aa.a(string, new ad(bl2, bl3, string2, f2), d);
    }

    public Boolean f() {
        return (Boolean)this.i.get();
    }

    public void a(boolean bl2) {
        this.i.set(bl2);
    }

    @Override
    protected synchronized void a(byte[] arrby, int n2, int n3) {
        super.a(arrby, n2, n3);
        int n4 = 0;
        do {
            if (n3 > this.h.remaining()) {
                this.l();
            }
            n4 = Math.min(n3, this.h.remaining());
            this.h.put(arrby, n2, n4);
            n2 += n4;
        } while ((n3 -= n4) > 0);
        if (this.e || this.i.get() == Boolean.TRUE) {
            this.l();
        }
    }

    @Override
    public synchronized void l() {
        this.h.flip();
        try {
            this.g.write(this.h.array(), 0, this.h.limit());
        }
        catch (IOException iOException) {
            String string = "Error writing to RandomAccessFile " + this.d();
            throw new d(string, iOException);
        }
        this.h.clear();
    }

    @Override
    public synchronized void k() {
        this.l();
        try {
            this.g.close();
        }
        catch (IOException iOException) {
            a.b("Unable to close RandomAccessFile " + this.d() + ". " + iOException);
        }
    }

    public String g() {
        return this.d();
    }

    @Override
    public Map e() {
        HashMap<String, String> hashMap = new HashMap<String, String>(super.e());
        hashMap.put("fileURI", this.f);
        return hashMap;
    }
}

