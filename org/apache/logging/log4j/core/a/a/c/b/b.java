/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bson.Transformer
 */
package org.apache.logging.log4j.core.a.a.c.b;

import org.bson.Transformer;

final class b
implements Transformer {
    b() {
    }

    public Object a(Object object) {
        if (object instanceof org.apache.logging.log4j.b) {
            return ((org.apache.logging.log4j.b)((Object)object)).name();
        }
        return object;
    }
}

