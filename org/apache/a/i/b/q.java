/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import org.apache.a.c.g;
import org.apache.a.x;

public class q
implements g {
    public boolean a(Throwable throwable) {
        return throwable instanceof SocketTimeoutException || throwable instanceof ConnectException;
    }

    public boolean a(x x2) {
        return x2.a().b() == 503;
    }
}

