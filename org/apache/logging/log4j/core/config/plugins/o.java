/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config.plugins;

import org.apache.logging.log4j.core.config.plugins.p;

public class o
extends p {
    private final Class a;

    public o(Class class_) {
        this.a = class_;
    }

    @Override
    public boolean a(Class class_) {
        return class_ != null && class_.isAnnotationPresent(this.a);
    }

    public String toString() {
        return "annotated with @" + this.a.getSimpleName();
    }
}

