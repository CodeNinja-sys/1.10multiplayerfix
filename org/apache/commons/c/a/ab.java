/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

import java.util.Collection;
import org.apache.commons.c.a.ac;
import org.apache.commons.c.a.af;
import org.apache.commons.c.o;

public class ab
extends af {
    private static final long f = 1L;

    @Override
    public void a(StringBuffer stringBuffer, String string, Object object) {
        if (!o.g(object.getClass()) && !String.class.equals(object.getClass()) && this.b(object.getClass())) {
            stringBuffer.append(ac.a(object, this));
        } else {
            super.a(stringBuffer, string, object);
        }
    }

    @Override
    protected void a(StringBuffer stringBuffer, String string, Collection collection) {
        this.c(stringBuffer, collection);
        this.d(stringBuffer, collection);
        this.a(stringBuffer, string, collection.toArray());
    }

    protected boolean b(Class class_) {
        return true;
    }
}

