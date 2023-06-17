/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mongodb.DB
 *  com.mongodb.DBCollection
 *  com.mongodb.DBObject
 *  com.mongodb.Mongo
 *  com.mongodb.MongoException
 *  com.mongodb.WriteConcern
 *  com.mongodb.WriteResult
 *  org.bson.BSON
 *  org.bson.Transformer
 */
package org.apache.logging.log4j.core.a.a.c.b;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.WriteResult;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.a.a.c.b.c;
import org.apache.logging.log4j.core.a.a.c.g;
import org.apache.logging.log4j.d;
import org.bson.BSON;
import org.bson.Transformer;

public final class a
implements org.apache.logging.log4j.core.a.a.c.b {
    private static final d a = org.apache.logging.log4j.d.d.k();
    private final DBCollection b;
    private final Mongo c;
    private final WriteConcern d;

    public a(DB dB, WriteConcern writeConcern, String string) {
        this.c = dB.getMongo();
        this.b = dB.getCollection(string);
        this.d = writeConcern;
    }

    public c c() {
        return new c();
    }

    public c[] b(int n2) {
        return new c[n2];
    }

    @Override
    public void a(g g2) {
        try {
            WriteResult writeResult = this.b.insert((DBObject)g2.a(), this.d);
            if (writeResult.getError() != null && writeResult.getError().length() > 0) {
                throw new org.apache.logging.log4j.core.a.d("Failed to write log event to MongoDB due to error: " + writeResult.getError() + ".");
            }
        }
        catch (MongoException mongoException) {
            throw new org.apache.logging.log4j.core.a.d("Failed to write log event to MongoDB due to error: " + mongoException.getMessage(), mongoException);
        }
    }

    @Override
    public void close() {
        this.c.close();
    }

    @Override
    public boolean b() {
        return !this.c.getConnector().isOpen();
    }

    static void a(DB dB, String string, String string2) {
        try {
            if (!dB.authenticate(string, string2.toCharArray())) {
                a.b("Failed to authenticate against MongoDB server. Unknown error.");
            }
        }
        catch (MongoException mongoException) {
            a.b("Failed to authenticate against MongoDB: " + mongoException.getMessage(), (Throwable)mongoException);
        }
        catch (IllegalStateException illegalStateException) {
            a.b("Factory-supplied MongoDB database connection already authenticated with differentcredentials but lost connection.");
        }
    }

    @Override
    public /* synthetic */ g[] a(int n2) {
        return this.b(n2);
    }

    @Override
    public /* synthetic */ g a() {
        return this.c();
    }

    static {
        BSON.addDecodingHook(b.class, (Transformer)new org.apache.logging.log4j.core.a.a.c.b.b());
    }
}

