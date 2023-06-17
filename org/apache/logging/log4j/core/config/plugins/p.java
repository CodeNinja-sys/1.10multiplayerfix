/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config.plugins;

import java.net.URI;
import org.apache.logging.log4j.core.config.plugins.u;

public abstract class p
implements u {
    @Override
    public boolean a(URI uRI) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public boolean b() {
        return false;
    }
}

