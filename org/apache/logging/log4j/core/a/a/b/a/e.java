/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.core.type.TypeReference
 *  javax.persistence.AttributeConverter
 *  javax.persistence.PersistenceException
 */
package org.apache.logging.log4j.core.a.a.b.a;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import javax.persistence.AttributeConverter;
import javax.persistence.PersistenceException;
import org.apache.logging.log4j.core.a.a.b.a.b;
import org.apache.logging.log4j.core.a.a.b.a.f;
import org.apache.logging.log4j.core.d.v;
import org.apache.logging.log4j.j;

public class e
implements AttributeConverter {
    public String a(j j2) {
        if (j2 == null) {
            return null;
        }
        try {
            return b.a.writeValueAsString((Object)j2.d());
        }
        catch (IOException iOException) {
            throw new PersistenceException("Failed to convert stack list to JSON string.", (Throwable)iOException);
        }
    }

    public j a(String string) {
        List list;
        if (v.a(string)) {
            return null;
        }
        try {
            list = (List)b.a.readValue(string, (TypeReference)new f(this));
        }
        catch (IOException iOException) {
            throw new PersistenceException("Failed to convert JSON string to list for stack.", (Throwable)iOException);
        }
        org.apache.logging.log4j.c.e e2 = new org.apache.logging.log4j.c.e(true);
        e2.addAll((Collection)list);
        return e2;
    }

    public /* synthetic */ Object b(Object object) {
        return this.a((j)object);
    }
}

