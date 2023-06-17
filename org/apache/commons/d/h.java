/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.d;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.PrivilegedAction;
import java.util.Properties;
import org.apache.commons.d.c;

final class h
implements PrivilegedAction {
    private final URL a;

    h(URL uRL) {
        this.a = uRL;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object run() {
        InputStream inputStream = null;
        try {
            URLConnection uRLConnection = this.a.openConnection();
            uRLConnection.setUseCaches(false);
            inputStream = uRLConnection.getInputStream();
            if (inputStream != null) {
                Properties properties = new Properties();
                properties.load(inputStream);
                inputStream.close();
                inputStream = null;
                Properties properties2 = properties;
                return properties2;
            }
        }
        catch (IOException iOException) {
            if (c.g()) {
                c.g("Unable to read URL " + this.a);
            }
        }
        finally {
            block17: {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    }
                    catch (IOException iOException) {
                        if (!c.g()) break block17;
                        c.g("Unable to close stream for URL " + this.a);
                    }
                }
            }
        }
        return null;
    }
}

