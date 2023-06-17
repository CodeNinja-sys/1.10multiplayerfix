/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.net;

import java.io.OutputStream;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.core.d.v;
import org.apache.logging.log4j.core.net.c;
import org.apache.logging.log4j.core.net.h;
import org.apache.logging.log4j.core.net.i;
import org.apache.logging.log4j.d;

public class f
extends c {
    private static final h f = new h(null);

    protected f(String string, OutputStream outputStream, InetAddress inetAddress, String string2, int n2, org.apache.logging.log4j.core.f f2) {
        super(string, outputStream, inetAddress, string2, n2, f2);
    }

    public static f a(String string, int n2, org.apache.logging.log4j.core.f f2) {
        if (v.a(string)) {
            throw new IllegalArgumentException("A host name is required");
        }
        if (n2 <= 0) {
            throw new IllegalArgumentException("A port value is required");
        }
        return (f)org.apache.logging.log4j.core.net.f.a("UDP:" + string + ":" + n2, new i(string, n2, f2), f);
    }

    @Override
    public Map e() {
        HashMap<String, String> hashMap = new HashMap<String, String>(super.e());
        hashMap.put("protocol", "udp");
        hashMap.put("direction", "out");
        return hashMap;
    }

    static /* synthetic */ d f() {
        return a;
    }
}

