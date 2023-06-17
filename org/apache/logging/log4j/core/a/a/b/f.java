/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.persistence.EntityManager
 *  javax.persistence.EntityManagerFactory
 *  javax.persistence.EntityTransaction
 *  javax.persistence.Persistence
 */
package org.apache.logging.log4j.core.a.a.b;

import java.lang.reflect.Constructor;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.core.a.a.b;
import org.apache.logging.log4j.core.a.a.b.a;
import org.apache.logging.log4j.core.a.a.b.g;
import org.apache.logging.log4j.core.a.a.b.i;
import org.apache.logging.log4j.core.a.d;
import org.apache.logging.log4j.core.h;

public final class f
extends b {
    private static final i c = new i(null);
    private final String d;
    private final Constructor e;
    private final String f;
    private EntityManagerFactory g;

    private f(String string, int n2, Class class_, Constructor constructor, String string2) {
        super(string, n2);
        this.d = class_.getName();
        this.e = constructor;
        this.f = string2;
    }

    @Override
    protected void f() {
        this.g = Persistence.createEntityManagerFactory((String)this.f);
    }

    @Override
    protected void h() {
        if (this.g != null && this.g.isOpen()) {
            this.g.close();
        }
    }

    @Override
    protected void a(h h2) {
        a a2;
        if (!this.j() || this.g == null) {
            throw new d("Cannot write logging event; JPA manager not connected to the database.");
        }
        try {
            a2 = (a)this.e.newInstance(h2);
        }
        catch (Exception exception) {
            throw new d("Failed to instantiate entity class [" + this.d + "].", exception);
        }
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        try {
            entityManager = this.g.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist((Object)a2);
            entityTransaction.commit();
        }
        catch (Exception exception) {
            if (entityTransaction != null && entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
            throw new d("Failed to insert record for log event in JDBC manager: " + exception.getMessage(), exception);
        }
        finally {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }
        }
    }

    public static f a(String string, int n2, Class class_, Constructor constructor, String string2) {
        return (f)org.apache.logging.log4j.core.a.a.b.a(string, new org.apache.logging.log4j.core.a.a.b.h(n2, class_, constructor, string2), c);
    }

    /* synthetic */ f(String string, int n2, Class class_, Constructor constructor, String string2, g g2) {
        this(string, n2, class_, constructor, string2);
    }
}

