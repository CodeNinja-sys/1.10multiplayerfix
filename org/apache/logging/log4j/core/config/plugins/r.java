/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config.plugins;

import org.apache.logging.log4j.core.config.plugins.p;

public class r
extends p {
    private final String a;

    public r(String string) {
        this.a = string;
    }

    @Override
    public boolean a(Class class_) {
        return class_ != null && class_.getName().endsWith(this.a);
    }

    public String toString() {
        return "ends with the suffix " + this.a;
    }
}

