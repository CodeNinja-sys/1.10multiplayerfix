/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.net;

import java.io.OutputStream;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.core.a.y;
import org.apache.logging.log4j.core.f;

public abstract class c
extends y {
    protected final InetAddress c;
    protected final String d;
    protected final int e;

    public c(String string, OutputStream outputStream, InetAddress inetAddress, String string2, int n2, f f2) {
        super(outputStream, string, f2);
        this.c = inetAddress;
        this.d = string2;
        this.e = n2;
    }

    @Override
    public Map e() {
        HashMap<String, String> hashMap = new HashMap<String, String>(super.e());
        hashMap.put("port", Integer.toString(this.e));
        hashMap.put("address", this.c.getHostAddress());
        return hashMap;
    }
}

