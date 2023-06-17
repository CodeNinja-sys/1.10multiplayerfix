/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config.plugins;

import java.net.URI;
import org.apache.logging.log4j.core.config.plugins.t;

public class s
extends t {
    private final String a;

    public s(String string) {
        this.a = "/" + string;
    }

    @Override
    public boolean a(URI uRI) {
        return uRI.getPath().endsWith(this.a);
    }

    public String toString() {
        return "named " + this.a;
    }
}

