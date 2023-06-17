/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.c.a.d.ar;
import io.netty.c.a.d.aw;
import io.netty.c.a.d.bp;
import io.netty.c.a.d.br;
import io.netty.c.a.d.c.ae;
import io.netty.c.a.d.c.af;
import io.netty.c.a.d.c.ag;
import io.netty.c.a.d.c.au;
import io.netty.c.a.d.c.av;
import io.netty.c.a.d.c.h;
import io.netty.c.a.d.c.i;
import io.netty.c.a.d.c.r;
import io.netty.c.a.d.v;
import io.netty.c.a.d.w;
import java.net.URI;
import java.nio.ByteBuffer;

public class t
extends r {
    private g b;

    public t(URI uRI, av av2, String string, ar ar2, int n2) {
        super(uRI, av2, string, ar2, n2);
    }

    @Override
    protected v g() {
        int n2 = au.a(1, 12);
        int n3 = au.a(1, 12);
        int n4 = Integer.MAX_VALUE / n2;
        int n5 = Integer.MAX_VALUE / n3;
        int n6 = au.a(0, n4);
        int n7 = au.a(0, n5);
        int n8 = n6 * n2;
        int n9 = n7 * n3;
        String string = Integer.toString(n8);
        String string2 = Integer.toString(n9);
        string = t.a(string);
        string2 = t.a(string2);
        string = t.a(string, n2);
        string2 = t.a(string2, n3);
        byte[] arrby = au.a(8);
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(n6);
        byte[] arrby2 = byteBuffer.array();
        byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(n7);
        byte[] arrby3 = byteBuffer.array();
        byte[] arrby4 = new byte[16];
        System.arraycopy(arrby2, 0, arrby4, 0, 4);
        System.arraycopy(arrby3, 0, arrby4, 4, 4);
        System.arraycopy(arrby, 0, arrby4, 8, 8);
        this.b = bi.a(au.a(arrby4));
        URI uRI = this.a();
        String string3 = uRI.getPath();
        if (uRI.getQuery() != null && !uRI.getQuery().isEmpty()) {
            string3 = uRI.getPath() + '?' + uRI.getQuery();
        }
        if (string3 == null || string3.isEmpty()) {
            string3 = "/";
        }
        io.netty.c.a.d.h h2 = new io.netty.c.a.d.h(br.b, aw.b, string3);
        ar ar2 = h2.q();
        ar2.a("Upgrade", (Object)"WebSocket").a("Connection", (Object)"Upgrade").a("Host", (Object)uRI.getHost());
        int n10 = uRI.getPort();
        String string4 = "http://" + uRI.getHost();
        if (n10 != 80 && n10 != 443) {
            string4 = string4 + ':' + n10;
        }
        ar2.a("Origin", (Object)string4).a("Sec-WebSocket-Key1", (Object)string).a("Sec-WebSocket-Key2", (Object)string2);
        String string5 = this.e();
        if (string5 != null && !string5.isEmpty()) {
            ar2.a("Sec-WebSocket-Protocol", (Object)string5);
        }
        if (this.a != null) {
            ar2.a(this.a);
        }
        ar2.b("Content-Length", (Object)arrby.length);
        h2.a().c(arrby);
        return h2;
    }

    @Override
    protected void a(w w2) {
        bp bp2 = new bp(101, "WebSocket Protocol Handshake");
        if (!w2.s().equals(bp2)) {
            throw new ag("Invalid handshake response getStatus: " + w2.s());
        }
        ar ar2 = w2.q();
        String string = ar2.b("Upgrade");
        if (!"WebSocket".equalsIgnoreCase(string)) {
            throw new ag("Invalid handshake response upgrade: " + string);
        }
        String string2 = ar2.b("Connection");
        if (!"Upgrade".equalsIgnoreCase(string2)) {
            throw new ag("Invalid handshake response connection: " + string2);
        }
        g g2 = w2.a();
        if (!g2.equals(this.b)) {
            throw new ag("Invalid challenge");
        }
    }

    private static String a(String string) {
        int n2;
        int n3 = au.a(1, 12);
        char[] arrc = new char[n3];
        int n4 = 0;
        while (n4 < n3) {
            n2 = (int)(Math.random() * 126.0 + 33.0);
            if ((33 >= n2 || n2 >= 47) && (58 >= n2 || n2 >= 126)) continue;
            arrc[n4] = (char)n2;
            ++n4;
        }
        for (n2 = 0; n2 < n3; ++n2) {
            int n5 = au.a(0, string.length());
            String string2 = string.substring(0, n5);
            String string3 = string.substring(n5);
            string = string2 + arrc[n2] + string3;
        }
        return string;
    }

    private static String a(String string, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = au.a(1, string.length() - 1);
            String string2 = string.substring(0, n3);
            String string3 = string.substring(n3);
            string = string2 + ' ' + string3;
        }
        return string;
    }

    @Override
    protected ae h() {
        return new h(this.c());
    }

    @Override
    protected af i() {
        return new i();
    }
}

