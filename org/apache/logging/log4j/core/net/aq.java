/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.net;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import org.apache.logging.log4j.core.config.ad;
import org.apache.logging.log4j.core.config.ag;
import org.apache.logging.log4j.core.config.d;
import org.apache.logging.log4j.core.config.h;

class aq
extends ag {
    private final String h;

    public aq(String string) {
        this.h = string;
    }

    @Override
    public d a(String string, URI uRI) {
        if (this.h != null && this.h.length() > 0) {
            Object object;
            File file = null;
            h h2 = null;
            try {
                file = new File(this.h);
                object = new FileInputStream(file);
                h2 = new h((InputStream)object, file);
            }
            catch (FileNotFoundException fileNotFoundException) {
                // empty catch block
            }
            if (h2 == null) {
                try {
                    object = new URL(this.h);
                    h2 = new h(((URL)object).openStream(), this.h);
                }
                catch (MalformedURLException malformedURLException) {
                }
                catch (IOException iOException) {
                    // empty catch block
                }
            }
            try {
                if (h2 != null) {
                    return new ad(h2);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            System.err.println("Unable to process configuration at " + this.h + ", using default.");
        }
        return super.a(string, uRI);
    }
}

