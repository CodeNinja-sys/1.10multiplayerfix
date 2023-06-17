/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.a.f.l;
import org.apache.commons.d.a;
import org.apache.commons.d.c;

public class ab
implements l {
    private final a a = c.b(ab.class);
    private final Map b = new ConcurrentHashMap();

    public void a(String string, InetAddress ... arrinetAddress) {
        org.apache.a.o.a.a((Object)string, "Host name");
        org.apache.a.o.a.a(arrinetAddress, "Array of IP addresses");
        this.b.put(string, arrinetAddress);
    }

    public InetAddress[] a(String string) {
        Object[] arrobject = (InetAddress[])this.b.get(string);
        if (this.a.d()) {
            this.a.c("Resolving " + string + " to " + Arrays.deepToString(arrobject));
        }
        if (arrobject == null) {
            throw new UnknownHostException(string + " cannot be resolved");
        }
        return arrobject;
    }
}

