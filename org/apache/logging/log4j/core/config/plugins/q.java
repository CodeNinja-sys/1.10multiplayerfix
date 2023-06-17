/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config.plugins;

import org.apache.logging.log4j.core.config.plugins.p;

public class q
extends p {
    private final Class a;

    public q(Class class_) {
        this.a = class_;
    }

    @Override
    public boolean a(Class class_) {
        return class_ != null && this.a.isAssignableFrom(class_);
    }

    public String toString() {
        return "is assignable to " + this.a.getSimpleName();
    }
}

