/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.persistence.AttributeConverter
 */
package org.apache.logging.log4j.core.a.a.b.a;

import javax.persistence.AttributeConverter;
import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.core.d.v;
import org.apache.logging.log4j.d.d;

public class h
implements AttributeConverter {
    private static final d a = d.k();

    public String a(m m2) {
        if (m2 == null) {
            return null;
        }
        return m2.a();
    }

    public m a(String string) {
        if (v.a(string)) {
            return null;
        }
        return a.c().a(string);
    }

    public /* synthetic */ Object b(Object object) {
        return this.a((m)object);
    }
}

