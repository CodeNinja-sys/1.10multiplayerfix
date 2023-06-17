/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lightcouch.CouchDbClient
 *  org.lightcouch.Response
 */
package org.apache.logging.log4j.core.a.a.c.a;

import org.apache.logging.log4j.core.a.a.c.b;
import org.apache.logging.log4j.core.a.a.c.g;
import org.apache.logging.log4j.core.a.d;
import org.lightcouch.CouchDbClient;
import org.lightcouch.Response;

public final class a
implements b {
    private final CouchDbClient a;
    private boolean b = false;

    public a(CouchDbClient couchDbClient) {
        this.a = couchDbClient;
    }

    public org.apache.logging.log4j.core.a.a.c.a.b c() {
        return new org.apache.logging.log4j.core.a.a.c.a.b();
    }

    public org.apache.logging.log4j.core.a.a.c.a.b[] b(int n2) {
        return new org.apache.logging.log4j.core.a.a.c.a.b[n2];
    }

    @Override
    public void a(g g2) {
        try {
            Response response = this.a.save(g2.a());
            if (response.getError() != null && response.getError().length() > 0) {
                throw new d("Failed to write log event to CouchDB due to error: " + response.getError() + ".");
            }
        }
        catch (Exception exception) {
            throw new d("Failed to write log event to CouchDB due to error: " + exception.getMessage(), exception);
        }
    }

    @Override
    public synchronized void close() {
        this.b = true;
        this.a.shutdown();
    }

    @Override
    public synchronized boolean b() {
        return this.b;
    }

    @Override
    public /* synthetic */ g[] a(int n2) {
        return this.b(n2);
    }

    @Override
    public /* synthetic */ g a() {
        return this.c();
    }
}

