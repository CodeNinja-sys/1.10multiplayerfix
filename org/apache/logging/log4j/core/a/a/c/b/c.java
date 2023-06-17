/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mongodb.BasicDBList
 *  com.mongodb.BasicDBObject
 */
package org.apache.logging.log4j.core.a.a.c.b;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import java.util.Collections;
import org.apache.logging.log4j.core.a.a.c.g;

public final class c
implements g {
    private final BasicDBObject a = new BasicDBObject();

    @Override
    public void a(String string, Object object) {
        this.a.append(string, object);
    }

    @Override
    public void a(String string, g g2) {
        this.a.append(string, g2.a());
    }

    @Override
    public void a(String string, Object[] arrobject) {
        BasicDBList basicDBList = new BasicDBList();
        Collections.addAll(basicDBList, arrobject);
        this.a.append(string, (Object)basicDBList);
    }

    @Override
    public void a(String string, g[] arrg) {
        BasicDBList basicDBList = new BasicDBList();
        for (g g2 : arrg) {
            basicDBList.add(g2.a());
        }
        this.a.append(string, (Object)basicDBList);
    }

    public BasicDBObject b() {
        return this.a;
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

