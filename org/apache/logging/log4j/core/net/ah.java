/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.core.d.v;
import org.apache.logging.log4j.core.f;
import org.apache.logging.log4j.core.net.ai;
import org.apache.logging.log4j.core.net.aj;
import org.apache.logging.log4j.core.net.ak;
import org.apache.logging.log4j.core.net.c;
import org.apache.logging.log4j.d;

public class ah
extends c {
    public static final int f = 30000;
    private static final int g = 4560;
    private static final ak h = new ak();
    private final int i;
    private aj j = null;
    private Socket k;
    private final boolean l;
    private final boolean m;

    public ah(String string, OutputStream outputStream, Socket socket, InetAddress inetAddress, String string2, int n2, int n3, boolean bl2, f f2) {
        super(string, outputStream, inetAddress, string2, n2, f2);
        this.i = n3;
        this.k = socket;
        this.m = bl2;
        boolean bl3 = this.l = n3 > 0;
        if (socket == null) {
            this.j = new aj(this, this);
            this.j.setDaemon(true);
            this.j.setPriority(1);
            this.j.start();
        }
    }

    public static ah a(String string, int n2, int n3, boolean bl2, f f2) {
        if (v.a(string)) {
            throw new IllegalArgumentException("A host name is required");
        }
        if (n2 <= 0) {
            n2 = 4560;
        }
        if (n3 == 0) {
            n3 = 30000;
        }
        return (ah)ah.a("TCP:" + string + ":" + n2, new ai(string, n2, n3, bl2, f2), h);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void a(byte[] arrby, int n2, int n3) {
        if (this.k == null) {
            if (this.j != null && !this.m) {
                this.j.a();
            }
            if (this.k == null) {
                String string = "Error writing to " + this.d() + " socket not available";
                throw new org.apache.logging.log4j.core.a.d(string);
            }
        }
        ah ah2 = this;
        synchronized (ah2) {
            try {
                this.j().write(arrby, n2, n3);
            }
            catch (IOException iOException) {
                if (this.l && this.j == null) {
                    this.j = new aj(this, this);
                    this.j.setDaemon(true);
                    this.j.setPriority(1);
                    this.j.start();
                }
                String string = "Error writing to " + this.d();
                throw new org.apache.logging.log4j.core.a.d(string, iOException);
            }
        }
    }

    @Override
    protected synchronized void k() {
        super.k();
        if (this.j != null) {
            this.j.b();
            this.j.interrupt();
            this.j = null;
        }
    }

    @Override
    public Map e() {
        HashMap<String, String> hashMap = new HashMap<String, String>(super.e());
        hashMap.put("protocol", "tcp");
        hashMap.put("direction", "out");
        return hashMap;
    }

    protected Socket a(InetAddress inetAddress, int n2) {
        return this.a(inetAddress.getHostName(), n2);
    }

    protected Socket a(String string, int n2) {
        return new Socket(string, n2);
    }

    static /* synthetic */ int a(ah ah2) {
        return ah2.i;
    }

    static /* synthetic */ OutputStream b(ah ah2) {
        return ah2.j();
    }

    static /* synthetic */ void a(ah ah2, OutputStream outputStream) {
        ah2.a(outputStream);
    }

    static /* synthetic */ Socket a(ah ah2, Socket socket) {
        ah2.k = socket;
        return ah2.k;
    }

    static /* synthetic */ aj a(ah ah2, aj aj2) {
        ah2.j = aj2;
        return ah2.j;
    }

    static /* synthetic */ d f() {
        return a;
    }

    static /* synthetic */ d g() {
        return a;
    }

    static /* synthetic */ d h() {
        return a;
    }

    static /* synthetic */ d m() {
        return a;
    }

    static /* synthetic */ d n() {
        return a;
    }

    static /* synthetic */ d o() {
        return a;
    }
}

