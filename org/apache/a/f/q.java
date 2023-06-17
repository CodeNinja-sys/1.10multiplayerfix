/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.util.Arrays;
import org.apache.a.r;

public class q
extends ConnectException {
    private static final long a = -3194482710275220224L;
    private final r b;

    public q(r r2, ConnectException connectException) {
        this(connectException, r2, null);
    }

    public q(IOException iOException, r r2, InetAddress ... arrinetAddress) {
        super("Connect to " + (r2 != null ? r2.f() : "remote host") + (arrinetAddress != null && arrinetAddress.length > 0 ? " " + Arrays.asList(arrinetAddress) : "") + (iOException != null && iOException.getMessage() != null ? " failed: " + iOException.getMessage() : " refused"));
        this.b = r2;
        this.initCause(iOException);
    }

    public r a() {
        return this.b;
    }
}

