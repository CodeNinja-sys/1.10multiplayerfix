/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.core.type.TypeReference
 *  com.fasterxml.jackson.databind.ObjectMapper
 *  javax.persistence.AttributeConverter
 *  javax.persistence.PersistenceException
 */
package org.apache.logging.log4j.core.a.a.b.a;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Map;
import javax.persistence.AttributeConverter;
import javax.persistence.PersistenceException;
import org.apache.logging.log4j.core.a.a.b.a.c;
import org.apache.logging.log4j.core.d.v;

public class b
implements AttributeConverter {
    static final ObjectMapper a = new ObjectMapper();

    public String a(Map map) {
        if (map == null) {
            return null;
        }
        try {
            return a.writeValueAsString((Object)map);
        }
        catch (IOException iOException) {
            throw new PersistenceException("Failed to convert map to JSON string.", (Throwable)iOException);
        }
    }

    public Map a(String string) {
        if (v.a(string)) {
            return null;
        }
        try {
            return (Map)a.readValue(string, (TypeReference)new c(this));
        }
        catch (IOException iOException) {
            throw new PersistenceException("Failed to convert JSON string to map.", (Throwable)iOException);
        }
    }

    public /* synthetic */ Object b(Object object) {
        return this.a((Map)object);
    }
}

