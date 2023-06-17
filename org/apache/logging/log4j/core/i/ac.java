/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.a;

public abstract class ac
extends a {
    protected ac(String string, String string2) {
        super(string, string2);
    }

    public abstract void a(h var1, StringBuilder var2);

    @Override
    public void a(Object object, StringBuilder stringBuilder) {
        if (object instanceof h) {
            this.a((h)object, stringBuilder);
        }
    }

    public boolean cO_() {
        return false;
    }
}

