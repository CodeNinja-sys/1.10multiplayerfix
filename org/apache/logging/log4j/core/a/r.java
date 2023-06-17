/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.core.a.d;
import org.apache.logging.log4j.core.a.t;
import org.apache.logging.log4j.core.a.u;
import org.apache.logging.log4j.core.a.y;
import org.apache.logging.log4j.core.f;

public class r
extends y {
    private static final u c = new u(null);
    private final boolean d;
    private final boolean e;
    private final String f;

    protected r(String string, OutputStream outputStream, boolean bl2, boolean bl3, String string2, f f2) {
        super(outputStream, string, f2);
        this.d = bl2;
        this.e = bl3;
        this.f = string2;
    }

    public static r a(String string, boolean bl2, boolean bl3, boolean bl4, String string2, f f2) {
        if (bl3 && bl4) {
            bl3 = false;
        }
        return (r)r.a(string, new t(bl2, bl3, bl4, string2, f2), c);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected synchronized void a(byte[] arrby, int n2, int n3) {
        block6: {
            if (this.e) {
                FileChannel fileChannel = ((FileOutputStream)this.j()).getChannel();
                try {
                    FileLock fileLock = fileChannel.lock(0L, Long.MAX_VALUE, false);
                    try {
                        super.a(arrby, n2, n3);
                        break block6;
                    }
                    finally {
                        fileLock.release();
                    }
                }
                catch (IOException iOException) {
                    throw new d("Unable to obtain lock on " + this.d(), iOException);
                }
            }
            super.a(arrby, n2, n3);
        }
    }

    public String f() {
        return this.d();
    }

    public boolean g() {
        return this.d;
    }

    public boolean h() {
        return this.e;
    }

    @Override
    public Map e() {
        HashMap<String, String> hashMap = new HashMap<String, String>(super.e());
        hashMap.put("fileURI", this.f);
        return hashMap;
    }
}

