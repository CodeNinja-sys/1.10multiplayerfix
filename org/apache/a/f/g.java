/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.util.Arrays;
import org.apache.a.r;

public class g
extends InterruptedIOException {
    private static final long a = -4816682903149535989L;
    private final r b;

    public g() {
        this.b = null;
    }

    public g(String string) {
        super(string);
        this.b = null;
    }

    public g(IOException iOException, r r2, InetAddress ... arrinetAddress) {
        super("Connect to " + (r2 != null ? r2.f() : "remote host") + (arrinetAddress != null && arrinetAddress.length > 0 ? " " + Arrays.asList(arrinetAddress) : "") + (iOException != null && iOException.getMessage() != null ? " failed: " + iOException.getMessage() : " timed out"));
        this.b = r2;
        this.initCause(iOException);
    }

    public r a() {
        return this.b;
    }
}

