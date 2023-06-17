/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config.plugins;

import org.apache.logging.log4j.core.config.plugins.c;
import org.apache.logging.log4j.core.config.plugins.p;

public class i
extends p {
    private final Class a;

    public i(Class class_) {
        this.a = class_;
    }

    @Override
    public boolean a(Class class_) {
        return class_ != null && class_.isAnnotationPresent(c.class) && (this.a == null || this.a.isAssignableFrom(class_));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("annotated with @" + c.class.getSimpleName());
        if (this.a != null) {
            stringBuilder.append(" is assignable to " + this.a.getSimpleName());
        }
        return stringBuilder.toString();
    }
}

