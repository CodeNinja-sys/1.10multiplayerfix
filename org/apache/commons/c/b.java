/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.lang.annotation.Annotation;
import org.apache.commons.c.a;
import org.apache.commons.c.a.af;
import org.apache.commons.c.o;

final class b
extends af {
    private static final long f = 1L;

    b() {
        this.e(true);
        this.f(true);
        this.a(true);
        this.b(true);
        this.c(false);
        this.d("(");
        this.e(")");
        this.g(", ");
        this.a("[");
        this.b("]");
    }

    @Override
    protected String a(Class class_) {
        Class class_2 = null;
        for (Class class_3 : o.e(class_)) {
            Class class_4;
            if (!Annotation.class.isAssignableFrom(class_3)) continue;
            class_2 = class_4 = class_3;
            break;
        }
        return new StringBuilder(class_2 == null ? "" : class_2.getName()).insert(0, '@').toString();
    }

    @Override
    protected void a(StringBuffer stringBuffer, String string, Object object) {
        if (object instanceof Annotation) {
            object = org.apache.commons.c.a.b((Annotation)object);
        }
        super.a(stringBuffer, string, object);
    }
}

